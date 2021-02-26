package typingsSlinky.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDeviceResponse extends StObject {
  
  /**
    * Information about the device.
    */
  var Device: js.UndefOr[typingsSlinky.awsSdk.networkmanagerMod.Device] = js.native
}
object CreateDeviceResponse {
  
  @scala.inline
  def apply(): CreateDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeviceResponse]
  }
  
  @scala.inline
  implicit class CreateDeviceResponseMutableBuilder[Self <: CreateDeviceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: Device): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "Device", js.undefined)
  }
}
