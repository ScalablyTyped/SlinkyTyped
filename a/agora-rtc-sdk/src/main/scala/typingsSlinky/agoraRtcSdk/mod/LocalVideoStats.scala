package typingsSlinky.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video statistics of the local stream.
  *
  * If {@link getLocalVideoStats} is called successfully, the {@link LocalVideoStatsMap} interface provides the UID and {@link LocalVideoStats} of the local user.
  */
@js.native
trait LocalVideoStats extends js.Object {
  /** Frame rate of the captured video, in fps. */
  val CaptureFrameRate: js.UndefOr[String] = js.native
  /** Height (pixels) of the captured video. */
  val CaptureResolutionHeight: js.UndefOr[String] = js.native
  /** Width (pixels) of the captured video. */
  val CaptureResolutionWidth: js.UndefOr[String] = js.native
  /** Delay from capturing to encoding the local video, in ms. */
  val EncodeDelay: js.UndefOr[String] = js.native
  /**
    * Whether the video is muted or not.
    *
    * - "1": Muted.
    * - "0": Unmuted.
    */
  val MuteState: js.UndefOr[String] = js.native
  /** Bitrate of the sent video, in Kbps. */
  val SendBitrate: js.UndefOr[String] = js.native
  /** Frame rate of the sent video, in fps. */
  val SendFrameRate: js.UndefOr[String] = js.native
  /** Height of the sent video, in pixels. */
  val SendResolutionHeight: js.UndefOr[String] = js.native
  /** Width of the sent video, in pixels. */
  val SendResolutionWidth: js.UndefOr[String] = js.native
  /** Bitrate of the local video set in [[setVideoProfile]]. */
  val TargetSendBitrate: js.UndefOr[String] = js.native
  /** Total duration of the published video, in seconds. */
  val TotalDuration: js.UndefOr[String] = js.native
  /** Total freeze time of the encoded video, in seconds. */
  val TotalFreezeTime: js.UndefOr[String] = js.native
}

object LocalVideoStats {
  @scala.inline
  def apply(): LocalVideoStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalVideoStats]
  }
  @scala.inline
  implicit class LocalVideoStatsOps[Self <: LocalVideoStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptureFrameRate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptureFrameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureFrameRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptureFrameRate")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureResolutionHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptureResolutionHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureResolutionHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptureResolutionHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureResolutionWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptureResolutionWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureResolutionWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptureResolutionWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodeDelay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncodeDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodeDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncodeDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMuteState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MuteState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMuteState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MuteState")(js.undefined)
        ret
    }
    @scala.inline
    def withSendBitrate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendBitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withSendFrameRate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendFrameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendFrameRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendFrameRate")(js.undefined)
        ret
    }
    @scala.inline
    def withSendResolutionHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendResolutionHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendResolutionHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendResolutionHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSendResolutionWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendResolutionWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendResolutionWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendResolutionWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetSendBitrate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetSendBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetSendBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetSendBitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalFreezeTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalFreezeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalFreezeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalFreezeTime")(js.undefined)
        ret
    }
  }
  
}

