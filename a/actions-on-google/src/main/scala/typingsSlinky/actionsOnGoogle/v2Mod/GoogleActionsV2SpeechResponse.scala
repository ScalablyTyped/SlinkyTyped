package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2SpeechResponse extends js.Object {
  /**
    * Structured spoken response to the user in the SSML format, e.g.
    * \"<speak> Say animal name after the sound.  <audio src =
    * 'https://www.pullstring.com/moo.mps' />, what’s the animal?  </speak>\".
    * Mutually exclusive with text_to_speech.
    */
  var ssml: js.UndefOr[String] = js.native
  /**
    * Plain text of the speech output, e.g., \"where do you want to go?\"/
    */
  var textToSpeech: js.UndefOr[String] = js.native
}

object GoogleActionsV2SpeechResponse {
  @scala.inline
  def apply(): GoogleActionsV2SpeechResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2SpeechResponse]
  }
  @scala.inline
  implicit class GoogleActionsV2SpeechResponseOps[Self <: GoogleActionsV2SpeechResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSsml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssml")(js.undefined)
        ret
    }
    @scala.inline
    def withTextToSpeech(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textToSpeech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextToSpeech: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textToSpeech")(js.undefined)
        ret
    }
  }
  
}

