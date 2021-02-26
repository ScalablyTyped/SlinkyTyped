package typingsSlinky.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentMessageSuggestion extends StObject {
  
  /** Required. The text shown the in the suggestion chip. */
  var title: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2IntentMessageSuggestion {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageSuggestion]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageSuggestionMutableBuilder[Self <: GoogleCloudDialogflowV2IntentMessageSuggestion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
