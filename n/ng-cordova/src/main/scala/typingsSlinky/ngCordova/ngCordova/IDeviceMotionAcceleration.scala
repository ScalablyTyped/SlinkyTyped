package typingsSlinky.ngCordova.ngCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDeviceMotionAcceleration extends StObject {
  
  var timestamp: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var z: Double = js.native
}
object IDeviceMotionAcceleration {
  
  @scala.inline
  def apply(timestamp: Double, x: Double, y: Double, z: Double): IDeviceMotionAcceleration = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeviceMotionAcceleration]
  }
  
  @scala.inline
  implicit class IDeviceMotionAccelerationMutableBuilder[Self <: IDeviceMotionAcceleration] (val x: Self) extends AnyVal {
    
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
