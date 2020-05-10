package typingsSlinky.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video statistics of the remote stream.
  *
  * If {@link getRemoteVideoStats} is called successfully, the {@link RemoteVideoStatsMap} interface provides the UID and {@link RemoteVideoStats} of each remote user.
  */
@js.native
trait RemoteVideoStats extends js.Object {
  /**
    * End-to-end delay in ms.
    *
    * Delay from capturing to playing the video.
    */
  val End2EndDelay: js.UndefOr[String] = js.native
  /**
    * Whether the video is muted or not.
    *
    * - "1": Muted.
    * - "0": Unmuted.
    */
  val MuteState: js.UndefOr[String] = js.native
  /** Packet loss rate (%) of the remote video. */
  val PacketLossRate: js.UndefOr[String] = js.native
  /** Bitrate of the received video, in Kbps. */
  val RecvBitrate: js.UndefOr[String] = js.native
  /** Resolution height of the received video, in pixels. */
  val RecvResolutionHeight: js.UndefOr[String] = js.native
  /** Resolution width of the received video, in pixels. */
  val RecvResolutionWidth: js.UndefOr[String] = js.native
  /** Rendering frame rate of the decoded video, in fps. */
  val RenderFrameRate: js.UndefOr[String] = js.native
  /** Height (pixels) of the rendered video */
  val RenderResolutionHeight: js.UndefOr[String] = js.native
  /** Width (pixels) of the rendered video */
  val RenderResolutionWidth: js.UndefOr[String] = js.native
  /** Total freeze time of the received video. */
  val TotalFreezeTime: js.UndefOr[String] = js.native
  /** Total playing duration of the received video. */
  val TotalPlayDuration: js.UndefOr[String] = js.native
  /**
    * Transport delay in ms.
    *
    * Delay from sending to receiving the video.
    */
  val TransportDelay: js.UndefOr[String] = js.native
}

object RemoteVideoStats {
  @scala.inline
  def apply(): RemoteVideoStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteVideoStats]
  }
  @scala.inline
  implicit class RemoteVideoStatsOps[Self <: RemoteVideoStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd2EndDelay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("End2EndDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd2EndDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("End2EndDelay")(js.undefined)
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
    def withPacketLossRate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PacketLossRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPacketLossRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PacketLossRate")(js.undefined)
        ret
    }
    @scala.inline
    def withRecvBitrate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecvBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecvBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecvBitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withRecvResolutionHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecvResolutionHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecvResolutionHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecvResolutionHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withRecvResolutionWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecvResolutionWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecvResolutionWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecvResolutionWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderFrameRate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderFrameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderFrameRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderFrameRate")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderResolutionHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderResolutionHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderResolutionHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderResolutionHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderResolutionWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderResolutionWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderResolutionWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderResolutionWidth")(js.undefined)
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
    @scala.inline
    def withTotalPlayDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalPlayDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalPlayDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalPlayDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withTransportDelay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransportDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransportDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransportDelay")(js.undefined)
        ret
    }
  }
  
}

