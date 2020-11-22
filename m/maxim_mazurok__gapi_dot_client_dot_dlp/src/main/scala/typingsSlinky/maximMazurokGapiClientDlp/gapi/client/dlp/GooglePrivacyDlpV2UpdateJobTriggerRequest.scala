package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2UpdateJobTriggerRequest extends js.Object {
  
  /** New JobTrigger value. */
  var jobTrigger: js.UndefOr[GooglePrivacyDlpV2JobTrigger] = js.native
  
  /** Mask to control which fields get updated. */
  var updateMask: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2UpdateJobTriggerRequest {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2UpdateJobTriggerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2UpdateJobTriggerRequest]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2UpdateJobTriggerRequestOps[Self <: GooglePrivacyDlpV2UpdateJobTriggerRequest] (val x: Self) extends AnyVal {
    
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
    def setJobTrigger(value: GooglePrivacyDlpV2JobTrigger): Self = this.set("jobTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobTrigger: Self = this.set("jobTrigger", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
}
