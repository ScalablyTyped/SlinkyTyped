package typingsSlinky.reactNativeSensorManager.mod.reactNativeAugmentingMod

import typingsSlinky.reactNativeSensorManager.AnonAzimuth
import typingsSlinky.reactNativeSensorManager.AnonIsNear
import typingsSlinky.reactNativeSensorManager.AnonLight
import typingsSlinky.reactNativeSensorManager.AnonSteps
import typingsSlinky.reactNativeSensorManager.AnonTemp
import typingsSlinky.reactNativeSensorManager.AnonX
import typingsSlinky.reactNativeSensorManager.reactNativeSensorManagerStrings.Accelerometer
import typingsSlinky.reactNativeSensorManager.reactNativeSensorManagerStrings.Gyroscope
import typingsSlinky.reactNativeSensorManager.reactNativeSensorManagerStrings.LightSensor
import typingsSlinky.reactNativeSensorManager.reactNativeSensorManagerStrings.Magnetometer
import typingsSlinky.reactNativeSensorManager.reactNativeSensorManagerStrings.Orientation
import typingsSlinky.reactNativeSensorManager.reactNativeSensorManagerStrings.Proximity
import typingsSlinky.reactNativeSensorManager.reactNativeSensorManagerStrings.StepCounter
import typingsSlinky.reactNativeSensorManager.reactNativeSensorManagerStrings.Thermometer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceEventEmitterStatic extends js.Object {
  @JSName("addListener")
  def addListener_Accelerometer(event: Accelerometer, callback: js.Function1[/* data */ AnonX, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_Gyroscope(event: Gyroscope, callback: js.Function1[/* data */ AnonX, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_LightSensor(event: LightSensor, callback: js.Function1[/* data */ AnonLight, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_Magnetometer(event: Magnetometer, callback: js.Function1[/* data */ AnonX, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_Orientation(event: Orientation, callback: js.Function1[/* data */ AnonAzimuth, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_Proximity(event: Proximity, callback: js.Function1[/* data */ AnonIsNear, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_StepCounter(event: StepCounter, callback: js.Function1[/* data */ AnonSteps, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_Thermometer(event: Thermometer, callback: js.Function1[/* data */ AnonTemp, Unit]): js.Any = js.native
}

