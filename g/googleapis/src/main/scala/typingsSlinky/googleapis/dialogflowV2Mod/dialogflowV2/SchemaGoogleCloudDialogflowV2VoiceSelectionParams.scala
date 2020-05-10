package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of which voice to use for speech synthesis.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2VoiceSelectionParams extends js.Object {
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

object SchemaGoogleCloudDialogflowV2VoiceSelectionParams {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2VoiceSelectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2VoiceSelectionParams]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2VoiceSelectionParamsOps[Self <: SchemaGoogleCloudDialogflowV2VoiceSelectionParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSsmlGender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssmlGender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsmlGender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssmlGender")(js.undefined)
        ret
    }
  }
  
}

