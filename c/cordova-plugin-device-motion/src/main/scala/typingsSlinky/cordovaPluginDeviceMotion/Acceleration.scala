package typingsSlinky.cordovaPluginDeviceMotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains Accelerometer data captured at a specific point in time. Acceleration values include
  * the effect of gravity (9.81 m/s^2), so that when a device lies flat and facing up, x, y, and z
  * values returned should be 0, 0, and 9.81.
  */
@js.native
trait Acceleration extends StObject {
  
  /** Creation timestamp in milliseconds. */
  var timestamp: Double = js.native
  
  /** Amount of acceleration on the x-axis. (in m/s^2) */
  var x: Double = js.native
  
  /** Amount of acceleration on the y-axis. (in m/s^2) */
  var y: Double = js.native
  
  /** Amount of acceleration on the z-axis. (in m/s^2) */
  var z: Double = js.native
}
object Acceleration {
  
  @scala.inline
  def apply(timestamp: Double, x: Double, y: Double, z: Double): Acceleration = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acceleration]
  }
  
  @scala.inline
  implicit class AccelerationMutableBuilder[Self <: Acceleration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
