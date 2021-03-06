package typingsSlinky.motionSensorsPolyfill

import typingsSlinky.motionSensorsPolyfill.mod.AccelerometerLocalCoordinateSystem
import typingsSlinky.motionSensorsPolyfill.mod.GyroscopeLocalCoordinateSystem
import typingsSlinky.motionSensorsPolyfill.mod.OrientationSensorLocalCoordinateSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object motionSensorsPolyfillStrings {
  
  @js.native
  sealed trait device
    extends AccelerometerLocalCoordinateSystem
       with GyroscopeLocalCoordinateSystem
       with OrientationSensorLocalCoordinateSystem
  @scala.inline
  def device: device = "device".asInstanceOf[device]
  
  @js.native
  sealed trait screen
    extends AccelerometerLocalCoordinateSystem
       with GyroscopeLocalCoordinateSystem
       with OrientationSensorLocalCoordinateSystem
  @scala.inline
  def screen: screen = "screen".asInstanceOf[screen]
}
