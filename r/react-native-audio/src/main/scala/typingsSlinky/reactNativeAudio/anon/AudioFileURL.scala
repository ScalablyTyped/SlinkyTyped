package typingsSlinky.reactNativeAudio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioFileURL extends js.Object {
  var audioFileURL: String = js.native
  var base64: String = js.native
  var status: String = js.native
}

object AudioFileURL {
  @scala.inline
  def apply(audioFileURL: String, base64: String, status: String): AudioFileURL = {
    val __obj = js.Dynamic.literal(audioFileURL = audioFileURL.asInstanceOf[js.Any], base64 = base64.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioFileURL]
  }
  @scala.inline
  implicit class AudioFileURLOps[Self <: AudioFileURL] (val x: Self) extends AnyVal {
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

