package typingsSlinky.agoraRtcSdk.mod

import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.audio
import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Media Stream Track
  *
  * This interface represents a single media track within a stream, for example an audio track or a video track.
  *
  * See [MediaStreamTrack](https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrack) for details.
  *
  */
@js.native
trait MediaStreamTrack extends js.Object {
  var kind: audio | video = js.native
}

object MediaStreamTrack {
  @scala.inline
  def apply(kind: audio | video): MediaStreamTrack = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamTrack]
  }
  @scala.inline
  implicit class MediaStreamTrackOps[Self <: MediaStreamTrack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: audio | video): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

