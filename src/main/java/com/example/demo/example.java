package com.example.demo;

class Car {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    { // 인스턴스 초기화 블록
        this.currentSpeed = 0;
    }

    Car() {}

    Car(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public int getSpeed() {
        return currentSpeed;
    }
}

public class example {
//    private static Car car;
    private static Car car = new Car();
    public static void main(String[] args) {
//        Car myCar = new Car();
//        System.out.println(myCar.getSpeed()); // 출력 결과 : 0
        System.out.println(car.getSpeed()); // 출력 결과 : 0

    }
}
