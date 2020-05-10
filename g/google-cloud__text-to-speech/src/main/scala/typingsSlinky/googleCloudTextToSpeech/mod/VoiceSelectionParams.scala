package typingsSlinky.googleCloudTextToSpeech.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoiceSelectionParams extends js.Object {
  var languageCode: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var ssmlGender: js.UndefOr[SsmlVoiceGender] = js.native
}

object VoiceSelectionParams {
  @scala.inline
  def apply(): VoiceSelectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceSelectionParams]
  }
  @scala.inline
  implicit class VoiceSelectionParamsOps[Self <: VoiceSelectionParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(js.undefined)
        ret
    }
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
    def withSsmlGender(value: SsmlVoiceGender): Self = {
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

