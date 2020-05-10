package typingsSlinky.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Audio statistics of the remote stream.
  *
  * If {@link getRemoteAudioStats} is called successfully, the {@link RemoteAudioStatsMap} interface provides the UID and {@link RemoteAudioStats} of each remote user.
  */
@js.native
trait RemoteAudioStats extends js.Object {
  /**
    * Decoding type of the received audio.
    *
    * - "1": Opus.
    * - "2": AAC.
    */
  val CodecType: js.UndefOr[String] = js.native
  /**
    * End-to-end delay in ms.
    *
    * Delay from capturing to playing the audio.
    */
  val End2EndDelay: js.UndefOr[String] = js.native
  /**
    * Whether the audio is muted or not.
    *
    * - "1": Muted.
    * - "0": Unmuted.
    */
  val MuteState: js.UndefOr[String] = js.native
  /** Packet loss rate (%) of the remote audio. */
  val PacketLossRate: js.UndefOr[String] = js.native
  /** Bitrate of the received audio, in Kbps. */
  val RecvBitrate: js.UndefOr[String] = js.native
  /** Volume of the received audio. */
  val RecvLevel: js.UndefOr[String] = js.native
  /** Total freeze time of the received audio. */
  val TotalFreezeTime: js.UndefOr[String] = js.native
  /** Total playing duration of the received audio. */
  val TotalPlayDuration: js.UndefOr[String] = js.native
  /**
    * Transport delay in ms.
    *
    * Delay from sending to receiving the audio.
    */
  val TransportDelay: js.UndefOr[String] = js.native
}

object RemoteAudioStats {
  @scala.inline
  def apply(): RemoteAudioStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteAudioStats]
  }
  @scala.inline
  implicit class RemoteAudioStatsOps[Self <: RemoteAudioStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodecType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodecType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodecType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodecType")(js.undefined)
        ret
    }
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
    def withRecvLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecvLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecvLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecvLevel")(js.undefined)
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

