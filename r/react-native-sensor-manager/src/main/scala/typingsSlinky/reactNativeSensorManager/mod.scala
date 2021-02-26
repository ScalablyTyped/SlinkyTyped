package typingsSlinky.reactNativeSensorManager

import typingsSlinky.reactNativeSensorManager.anon.Azimuth
import typingsSlinky.reactNativeSensorManager.anon.IsNear
import typingsSlinky.reactNativeSensorManager.anon.Light
import typingsSlinky.reactNativeSensorManager.anon.Steps
import typingsSlinky.reactNativeSensorManager.anon.Temp
import typingsSlinky.reactNativeSensorManager.anon.X
import typingsSlinky.reactNativeSensorManager.reactNativeSensorManagerStrings.Accelerometer
import typingsSlinky.reactNativeSensorManager.reactNativeSensorManagerStrings.Gyroscope
import typingsSlinky.reactNativeSensorManager.reactNativeSensorManagerStrings.LightSensor
import typingsSlinky.reactNativeSensorManager.reactNativeSensorManagerStrings.Magnetometer
import typingsSlinky.reactNativeSensorManager.reactNativeSensorManagerStrings.Orientation
import typingsSlinky.reactNativeSensorManager.reactNativeSensorManagerStrings.Proximity
import typingsSlinky.reactNativeSensorManager.reactNativeSensorManagerStrings.StepCounter
import typingsSlinky.reactNativeSensorManager.reactNativeSensorManagerStrings.Thermometer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait SensorManager extends StObject {
    
    def startAccelerometer(delay: Double): Unit = js.native
    
    def startGyroscope(delay: Double): Unit = js.native
    
    def startLightSensor(delay: Double): Unit = js.native
    
    def startMagnetometer(delay: Double): Unit = js.native
    
    def startMotionValue(delay: Double): Unit = js.native
    
    def startOrientation(delay: Double): Unit = js.native
    
    def startProximity(delay: Double): Unit = js.native
    
    def startStepCounter(delay: Double): Unit = js.native
    
    def startThermometer(delay: Double): Unit = js.native
    
    def stopAccelerometer(): Unit = js.native
    
    def stopGyroscope(): Unit = js.native
    
    def stopLightSensor(): Unit = js.native
    
    def stopMagnetometer(): Unit = js.native
    
    def stopMotionValue(): Unit = js.native
    
    def stopOrientation(): Unit = js.native
    
    def stopProximity(): Unit = js.native
    
    def stopStepCounter(): Unit = js.native
    
    def stopThermometer(): Unit = js.native
  }
  object SensorManager {
    
    @scala.inline
    def apply(
      startAccelerometer: Double => Unit,
      startGyroscope: Double => Unit,
      startLightSensor: Double => Unit,
      startMagnetometer: Double => Unit,
      startMotionValue: Double => Unit,
      startOrientation: Double => Unit,
      startProximity: Double => Unit,
      startStepCounter: Double => Unit,
      startThermometer: Double => Unit,
      stopAccelerometer: () => Unit,
      stopGyroscope: () => Unit,
      stopLightSensor: () => Unit,
      stopMagnetometer: () => Unit,
      stopMotionValue: () => Unit,
      stopOrientation: () => Unit,
      stopProximity: () => Unit,
      stopStepCounter: () => Unit,
      stopThermometer: () => Unit
    ): SensorManager = {
      val __obj = js.Dynamic.literal(startAccelerometer = js.Any.fromFunction1(startAccelerometer), startGyroscope = js.Any.fromFunction1(startGyroscope), startLightSensor = js.Any.fromFunction1(startLightSensor), startMagnetometer = js.Any.fromFunction1(startMagnetometer), startMotionValue = js.Any.fromFunction1(startMotionValue), startOrientation = js.Any.fromFunction1(startOrientation), startProximity = js.Any.fromFunction1(startProximity), startStepCounter = js.Any.fromFunction1(startStepCounter), startThermometer = js.Any.fromFunction1(startThermometer), stopAccelerometer = js.Any.fromFunction0(stopAccelerometer), stopGyroscope = js.Any.fromFunction0(stopGyroscope), stopLightSensor = js.Any.fromFunction0(stopLightSensor), stopMagnetometer = js.Any.fromFunction0(stopMagnetometer), stopMotionValue = js.Any.fromFunction0(stopMotionValue), stopOrientation = js.Any.fromFunction0(stopOrientation), stopProximity = js.Any.fromFunction0(stopProximity), stopStepCounter = js.Any.fromFunction0(stopStepCounter), stopThermometer = js.Any.fromFunction0(stopThermometer))
      __obj.asInstanceOf[SensorManager]
    }
    
    @scala.inline
    implicit class SensorManagerMutableBuilder[Self <: SensorManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStartAccelerometer(value: Double => Unit): Self = StObject.set(x, "startAccelerometer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartGyroscope(value: Double => Unit): Self = StObject.set(x, "startGyroscope", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartLightSensor(value: Double => Unit): Self = StObject.set(x, "startLightSensor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartMagnetometer(value: Double => Unit): Self = StObject.set(x, "startMagnetometer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartMotionValue(value: Double => Unit): Self = StObject.set(x, "startMotionValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartOrientation(value: Double => Unit): Self = StObject.set(x, "startOrientation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartProximity(value: Double => Unit): Self = StObject.set(x, "startProximity", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartStepCounter(value: Double => Unit): Self = StObject.set(x, "startStepCounter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartThermometer(value: Double => Unit): Self = StObject.set(x, "startThermometer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStopAccelerometer(value: () => Unit): Self = StObject.set(x, "stopAccelerometer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopGyroscope(value: () => Unit): Self = StObject.set(x, "stopGyroscope", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopLightSensor(value: () => Unit): Self = StObject.set(x, "stopLightSensor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopMagnetometer(value: () => Unit): Self = StObject.set(x, "stopMagnetometer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopMotionValue(value: () => Unit): Self = StObject.set(x, "stopMotionValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopOrientation(value: () => Unit): Self = StObject.set(x, "stopOrientation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopProximity(value: () => Unit): Self = StObject.set(x, "stopProximity", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopStepCounter(value: () => Unit): Self = StObject.set(x, "stopStepCounter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopThermometer(value: () => Unit): Self = StObject.set(x, "stopThermometer", js.Any.fromFunction0(value))
    }
  }
  
  object reactNativeAugmentingMod {
    
    @js.native
    trait DeviceEventEmitterStatic extends StObject {
      
      @JSName("addListener")
      def addListener_Accelerometer(event: Accelerometer, callback: js.Function1[/* data */ X, Unit]): js.Any = js.native
      @JSName("addListener")
      def addListener_Gyroscope(event: Gyroscope, callback: js.Function1[/* data */ X, Unit]): js.Any = js.native
      @JSName("addListener")
      def addListener_LightSensor(event: LightSensor, callback: js.Function1[/* data */ Light, Unit]): js.Any = js.native
      @JSName("addListener")
      def addListener_Magnetometer(event: Magnetometer, callback: js.Function1[/* data */ X, Unit]): js.Any = js.native
      @JSName("addListener")
      def addListener_Orientation(event: Orientation, callback: js.Function1[/* data */ Azimuth, Unit]): js.Any = js.native
      @JSName("addListener")
      def addListener_Proximity(event: Proximity, callback: js.Function1[/* data */ IsNear, Unit]): js.Any = js.native
      @JSName("addListener")
      def addListener_StepCounter(event: StepCounter, callback: js.Function1[/* data */ Steps, Unit]): js.Any = js.native
      @JSName("addListener")
      def addListener_Thermometer(event: Thermometer, callback: js.Function1[/* data */ Temp, Unit]): js.Any = js.native
    }
    
    @js.native
    trait NativeModulesStatic extends StObject {
      
      var SensorManager: typingsSlinky.reactNativeSensorManager.mod.SensorManager = js.native
    }
    object NativeModulesStatic {
      
      @scala.inline
      def apply(SensorManager: SensorManager): NativeModulesStatic = {
        val __obj = js.Dynamic.literal(SensorManager = SensorManager.asInstanceOf[js.Any])
        __obj.asInstanceOf[NativeModulesStatic]
      }
      
      @scala.inline
      implicit class NativeModulesStaticMutableBuilder[Self <: NativeModulesStatic] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSensorManager(value: SensorManager): Self = StObject.set(x, "SensorManager", value.asInstanceOf[js.Any])
      }
    }
  }
}
