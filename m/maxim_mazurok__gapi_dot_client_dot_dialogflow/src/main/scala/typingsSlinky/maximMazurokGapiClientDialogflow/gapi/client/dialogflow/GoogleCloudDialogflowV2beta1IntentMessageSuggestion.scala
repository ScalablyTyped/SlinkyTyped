package typingsSlinky.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessageSuggestion extends js.Object {
  
  /** Required. The text shown the in the suggestion chip. */
  var title: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2beta1IntentMessageSuggestion {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageSuggestion]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageSuggestionOps[Self <: GoogleCloudDialogflowV2beta1IntentMessageSuggestion] (val x: Self) extends AnyVal {
    
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
