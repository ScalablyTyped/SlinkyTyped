package typingsSlinky.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimDeviceRequest extends js.Object {
  
  /** The customer to claim for. */
  var customerId: js.UndefOr[String] = js.native
  
  /** The device identifier of the device to claim. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.native
  
  /** The section to claim. */
  var sectionType: js.UndefOr[String] = js.native
}
object ClaimDeviceRequest {
  
  @scala.inline
  def apply(): ClaimDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimDeviceRequest]
  }
  
  @scala.inline
  implicit class ClaimDeviceRequestOps[Self <: ClaimDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    
    @scala.inline
    def setDeviceIdentifier(value: DeviceIdentifier): Self = this.set("deviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceIdentifier: Self = this.set("deviceIdentifier", js.undefined)
    
    @scala.inline
    def setSectionType(value: String): Self = this.set("sectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionType: Self = this.set("sectionType", js.undefined)
  }
}
