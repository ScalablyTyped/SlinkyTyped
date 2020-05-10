package typingsSlinky.naverWhale.whale.tts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TtsVoice extends js.Object {
  /** All of the callback event types that this voice is capable of sending. */
  var eventTypes: js.UndefOr[js.Array[String]] = js.native
  /** The ID of the extension providing this voice. */
  var extensionsId: js.UndefOr[String] = js.native
  /**
    * Optional. This voice's gender.
    * One of: "male", or "female"
    */
  var gender: js.UndefOr[String] = js.native
  /** Optional. The language that this voice supports, in the form language-region. Examples: 'en', 'en-US', 'en-GB', 'zh-CN'. */
  var lang: js.UndefOr[String] = js.native
  /**
    * If true, the synthesis engine is a remote network resource. It may be higher latency and may incur bandwidth costs.
    * @since Chrome 33.
    */
  var remote: js.UndefOr[Boolean] = js.native
  /** Optional. The name of the voice. */
  var voiceName: js.UndefOr[String] = js.native
}

object TtsVoice {
  @scala.inline
  def apply(): TtsVoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TtsVoice]
  }
  @scala.inline
  implicit class TtsVoiceOps[Self <: TtsVoice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionsId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionsId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensionsId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionsId")(js.undefined)
        ret
    }
    @scala.inline
    def withGender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withRemote(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(js.undefined)
        ret
    }
    @scala.inline
    def withVoiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceName")(js.undefined)
        ret
    }
  }
  
}

