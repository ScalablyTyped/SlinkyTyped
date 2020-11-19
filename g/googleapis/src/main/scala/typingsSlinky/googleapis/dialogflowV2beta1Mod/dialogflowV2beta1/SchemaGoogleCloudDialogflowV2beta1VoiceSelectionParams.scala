package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Description of which voice to use for speech synthesis.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1VoiceSelectionParams extends js.Object {
  
  /**
    * Optional. The name of the voice. If not set, the service will choose a
    * voice based on the other parameters such as language_code and gender.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Optional. The preferred gender of the voice. If not set, the service will
    * choose a voice based on the other parameters such as language_code and
    * name. Note that this is only a preference, not requirement. If a voice of
    * the appropriate gender is not available, the synthesizer should
    * substitute a voice with a different gender rather than failing the
    * request.
    */
  var ssmlGender: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1VoiceSelectionParams {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1VoiceSelectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1VoiceSelectionParams]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1VoiceSelectionParamsOps[Self <: SchemaGoogleCloudDialogflowV2beta1VoiceSelectionParams] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSsmlGender(value: String): Self = this.set("ssmlGender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsmlGender: Self = this.set("ssmlGender", js.undefined)
  }
}
