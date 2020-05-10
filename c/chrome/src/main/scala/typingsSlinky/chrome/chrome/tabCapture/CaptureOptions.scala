package typingsSlinky.chrome.chrome.tabCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptureOptions extends js.Object {
  /** Optional. */
  var audio: js.UndefOr[Boolean] = js.native
  /** Optional. */
  var audioConstraints: js.UndefOr[MediaStreamConstraint] = js.native
  /** Optional. */
  var video: js.UndefOr[Boolean] = js.native
  /** Optional. */
  var videoConstraints: js.UndefOr[MediaStreamConstraint] = js.native
}

object CaptureOptions {
  @scala.inline
  def apply(): CaptureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureOptions]
  }
  @scala.inline
  implicit class CaptureOptionsOps[Self <: CaptureOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioConstraints(value: MediaStreamConstraint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoConstraints(value: MediaStreamConstraint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoConstraints")(js.undefined)
        ret
    }
  }
  
}

