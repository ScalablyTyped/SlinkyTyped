package typingsSlinky.googleCloudTextToSpeech.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Voice extends js.Object {
  var language_codes: js.Array[String] = js.native
  var name: String = js.native
  var naturalSampleRateHertz: Double = js.native
  var ssmlGender: SsmlVoiceGender = js.native
}

object Voice {
  @scala.inline
  def apply(
    language_codes: js.Array[String],
    name: String,
    naturalSampleRateHertz: Double,
    ssmlGender: SsmlVoiceGender
  ): Voice = {
    val __obj = js.Dynamic.literal(language_codes = language_codes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], naturalSampleRateHertz = naturalSampleRateHertz.asInstanceOf[js.Any], ssmlGender = ssmlGender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Voice]
  }
  @scala.inline
  implicit class VoiceOps[Self <: Voice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguage_codes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language_codes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNaturalSampleRateHertz(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("naturalSampleRateHertz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSsmlGender(value: SsmlVoiceGender): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssmlGender")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

