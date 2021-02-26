package typingsSlinky.actionsOnGoogle.apiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion extends StObject {
  
  var destinationName: js.UndefOr[String] = js.native
  
  var uri: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionMutableBuilder[Self <: GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationName(value: String): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationNameUndefined: Self = StObject.set(x, "destinationName", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
