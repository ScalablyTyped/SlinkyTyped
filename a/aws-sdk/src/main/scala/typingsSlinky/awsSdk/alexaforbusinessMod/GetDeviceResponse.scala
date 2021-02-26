package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeviceResponse extends StObject {
  
  /**
    * The details of the device requested. Required.
    */
  var Device: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.Device] = js.native
}
object GetDeviceResponse {
  
  @scala.inline
  def apply(): GetDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeviceResponse]
  }
  
  @scala.inline
  implicit class GetDeviceResponseMutableBuilder[Self <: GetDeviceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: Device): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "Device", js.undefined)
  }
}
