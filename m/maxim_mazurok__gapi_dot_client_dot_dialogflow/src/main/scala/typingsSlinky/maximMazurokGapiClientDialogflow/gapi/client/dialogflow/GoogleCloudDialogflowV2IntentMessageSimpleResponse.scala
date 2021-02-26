package typingsSlinky.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentMessageSimpleResponse extends StObject {
  
  /** Optional. The text to display. */
  var displayText: js.UndefOr[String] = js.native
  
  /** One of text_to_speech or ssml must be provided. Structured spoken response to the user in the SSML format. Mutually exclusive with text_to_speech. */
  var ssml: js.UndefOr[String] = js.native
  
  /** One of text_to_speech or ssml must be provided. The plain text of the speech output. Mutually exclusive with ssml. */
  var textToSpeech: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2IntentMessageSimpleResponse {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageSimpleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageSimpleResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageSimpleResponseMutableBuilder[Self <: GoogleCloudDialogflowV2IntentMessageSimpleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayTextUndefined: Self = StObject.set(x, "displayText", js.undefined)
    
    @scala.inline
    def setSsml(value: String): Self = StObject.set(x, "ssml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsmlUndefined: Self = StObject.set(x, "ssml", js.undefined)
    
    @scala.inline
    def setTextToSpeech(value: String): Self = StObject.set(x, "textToSpeech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextToSpeechUndefined: Self = StObject.set(x, "textToSpeech", js.undefined)
  }
}
