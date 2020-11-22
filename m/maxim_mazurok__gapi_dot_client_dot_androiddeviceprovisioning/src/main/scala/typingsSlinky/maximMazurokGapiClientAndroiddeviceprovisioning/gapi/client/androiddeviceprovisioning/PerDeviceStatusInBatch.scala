package typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerDeviceStatusInBatch extends js.Object {
  
  /** If processing succeeds, the device ID of the device. */
  var deviceId: js.UndefOr[String] = js.native
  
  /** If processing fails, the error type. */
  var errorIdentifier: js.UndefOr[String] = js.native
  
  /** If processing fails, a developer message explaining what went wrong. */
  var errorMessage: js.UndefOr[String] = js.native
  
  /** The result status of the device after processing. */
  var status: js.UndefOr[String] = js.native
}
object PerDeviceStatusInBatch {
  
  @scala.inline
  def apply(): PerDeviceStatusInBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerDeviceStatusInBatch]
  }
  
  @scala.inline
  implicit class PerDeviceStatusInBatchOps[Self <: PerDeviceStatusInBatch] (val x: Self) extends AnyVal {
    
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
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    
    @scala.inline
    def setErrorIdentifier(value: String): Self = this.set("errorIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorIdentifier: Self = this.set("errorIdentifier", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
