package typingsSlinky.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2VoiceSelectionParams extends StObject {
  
  /** Optional. The name of the voice. If not set, the service will choose a voice based on the other parameters such as language_code and ssml_gender. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Optional. The preferred gender of the voice. If not set, the service will choose a voice based on the other parameters such as language_code and name. Note that this is only a
    * preference, not requirement. If a voice of the appropriate gender is not available, the synthesizer should substitute a voice with a different gender rather than failing the
    * request.
    */
  var ssmlGender: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2VoiceSelectionParams {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2VoiceSelectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2VoiceSelectionParams]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2VoiceSelectionParamsMutableBuilder[Self <: GoogleCloudDialogflowV2VoiceSelectionParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSsmlGender(value: String): Self = StObject.set(x, "ssmlGender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsmlGenderUndefined: Self = StObject.set(x, "ssmlGender", js.undefined)
  }
}
