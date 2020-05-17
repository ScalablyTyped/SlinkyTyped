package typingsSlinky.reactNativeSensorManager.mod.reactNativeAugmentingMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceEventEmitterStatic extends js.Object {
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

