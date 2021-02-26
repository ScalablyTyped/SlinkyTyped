package typingsSlinky.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2SimpleResponse extends StObject {
  
  /**
    * Optional text to display in the chat bubble. If not given, a display
    * rendering of the text_to_speech or ssml above will be used. Limited to 640
    * chars.
    */
  var displayText: js.UndefOr[String] = js.native
  
  /**
    * Structured spoken response to the user in the SSML format, e.g.
    * `<speak> Say animal name after the sound.  <audio src =
    * 'https://www.pullstring.com/moo.mps' />, what’s the animal?  </speak>`.
    * Mutually exclusive with text_to_speech.
    */
  var ssml: js.UndefOr[String] = js.native
  
  /**
    * Plain text of the speech output, e.g., \"where do you want to go?\"
    * Mutually exclusive with ssml.
    */
  var textToSpeech: js.UndefOr[String] = js.native
}
object GoogleActionsV2SimpleResponse {
  
  @scala.inline
  def apply(): GoogleActionsV2SimpleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2SimpleResponse]
  }
  
  @scala.inline
  implicit class GoogleActionsV2SimpleResponseMutableBuilder[Self <: GoogleActionsV2SimpleResponse] (val x: Self) extends AnyVal {
    
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
