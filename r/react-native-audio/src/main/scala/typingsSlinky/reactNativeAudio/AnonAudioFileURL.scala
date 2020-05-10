package typingsSlinky.reactNativeAudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAudioFileURL extends js.Object {
  var audioFileURL: String = js.native
  var base64: String = js.native
  var status: String = js.native
}

object AnonAudioFileURL {
  @scala.inline
  def apply(audioFileURL: String, base64: String, status: String): AnonAudioFileURL = {
    val __obj = js.Dynamic.literal(audioFileURL = audioFileURL.asInstanceOf[js.Any], base64 = base64.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAudioFileURL]
  }
  @scala.inline
  implicit class AnonAudioFileURLOps[Self <: AnonAudioFileURL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioFileURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioFileURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase64(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

