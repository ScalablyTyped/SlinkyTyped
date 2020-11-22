package typingsSlinky.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentFollowupIntentInfo extends js.Object {
  
  /** The unique identifier of the followup intent. Format: `projects//agent/intents/`. */
  var followupIntentName: js.UndefOr[String] = js.native
  
  /** The unique identifier of the followup intent's parent. Format: `projects//agent/intents/`. */
  var parentFollowupIntentName: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2IntentFollowupIntentInfo {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentFollowupIntentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentFollowupIntentInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentFollowupIntentInfoOps[Self <: GoogleCloudDialogflowV2IntentFollowupIntentInfo] (val x: Self) extends AnyVal {
    
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
    def setFollowupIntentName(value: String): Self = this.set("followupIntentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowupIntentName: Self = this.set("followupIntentName", js.undefined)
    
    @scala.inline
    def setParentFollowupIntentName(value: String): Self = this.set("parentFollowupIntentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentFollowupIntentName: Self = this.set("parentFollowupIntentName", js.undefined)
  }
}
