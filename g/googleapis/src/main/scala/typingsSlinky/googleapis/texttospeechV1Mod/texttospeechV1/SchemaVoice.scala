package typingsSlinky.googleapis.texttospeechV1Mod.texttospeechV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of a voice supported by the TTS service.
  */
@js.native
trait SchemaVoice extends js.Object {
  /**
    * The languages that this voice supports, expressed as
    * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags
    * (e.g. &quot;en-US&quot;, &quot;es-419&quot;, &quot;cmn-tw&quot;).
    */
  var languageCodes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of this voice.  Each distinct voice has a unique name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The natural sample rate (in hertz) for this voice.
    */
  var naturalSampleRateHertz: js.UndefOr[Double] = js.native
  /**
    * The gender of this voice.
    */
  var ssmlGender: js.UndefOr[String] = js.native
}

object SchemaVoice {
  @scala.inline
  def apply(): SchemaVoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoice]
  }
  @scala.inline
  implicit class SchemaVoiceOps[Self <: SchemaVoice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguageCodes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCodes")(js.undefined)
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
    def withNaturalSampleRateHertz(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("naturalSampleRateHertz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNaturalSampleRateHertz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("naturalSampleRateHertz")(js.undefined)
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

