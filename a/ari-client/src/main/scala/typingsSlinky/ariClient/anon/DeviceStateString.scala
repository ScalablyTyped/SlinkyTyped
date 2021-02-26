package typingsSlinky.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceStateString extends StObject {
  
  var deviceState: String = js.native
}
object DeviceStateString {
  
  @scala.inline
  def apply(deviceState: String): DeviceStateString = {
    val __obj = js.Dynamic.literal(deviceState = deviceState.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceStateString]
  }
  
  @scala.inline
  implicit class DeviceStateStringMutableBuilder[Self <: DeviceStateString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceState(value: String): Self = StObject.set(x, "deviceState", value.asInstanceOf[js.Any])
  }
}
