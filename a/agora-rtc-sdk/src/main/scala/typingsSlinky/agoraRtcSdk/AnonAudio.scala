package typingsSlinky.agoraRtcSdk

import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.H264
import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.OPUS
import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.VP8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAudio extends js.Object {
  var audio: js.Array[OPUS] = js.native
  var video: js.Array[VP8 | H264] = js.native
}

object AnonAudio {
  @scala.inline
  def apply(audio: js.Array[OPUS], video: js.Array[VP8 | H264]): AnonAudio = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAudio]
  }
  @scala.inline
  implicit class AnonAudioOps[Self <: AnonAudio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudio(value: js.Array[OPUS]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideo(value: js.Array[VP8 | H264]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

