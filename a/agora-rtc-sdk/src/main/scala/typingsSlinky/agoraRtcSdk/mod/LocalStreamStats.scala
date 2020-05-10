package typingsSlinky.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The connection statistics of the local stream.
  *
  * If the local stream calls {@link getStats} successfully, this interface provides the statistics.
  */
@js.native
trait LocalStreamStats extends js.Object {
  /** Delay in accessing the SD-RTN (ms). */
  var accessDelay: String = js.native
  /** Bytes of the sent audio. */
  var audioSendBytes: String = js.native
  /** Packets of the sent audio. */
  var audioSendPackets: String = js.native
  /**
    * Number of lost packets of the sent audio.
    *
    * **Note:**
    *
    * Safari and Firefox do not support this property.
    */
  var audioSendPacketsLost: String = js.native
  /** Bytes of the sent video. */
  var videoSendBytes: String = js.native
  /** Frame rate of the sent video. */
  var videoSendFrameRate: String = js.native
  /** Packets of the sent video. */
  var videoSendPackets: String = js.native
  /** Number of lost packets of the sent video. */
  var videoSendPacketsLost: String = js.native
  /** Resolution height of the sent video. */
  var videoSendResolutionHeight: js.UndefOr[String] = js.native
  /** Resolution width of the sent video. */
  var videoSendResolutionWidth: js.UndefOr[String] = js.native
}

object LocalStreamStats {
  @scala.inline
  def apply(
    accessDelay: String,
    audioSendBytes: String,
    audioSendPackets: String,
    audioSendPacketsLost: String,
    videoSendBytes: String,
    videoSendFrameRate: String,
    videoSendPackets: String,
    videoSendPacketsLost: String
  ): LocalStreamStats = {
    val __obj = js.Dynamic.literal(accessDelay = accessDelay.asInstanceOf[js.Any], audioSendBytes = audioSendBytes.asInstanceOf[js.Any], audioSendPackets = audioSendPackets.asInstanceOf[js.Any], audioSendPacketsLost = audioSendPacketsLost.asInstanceOf[js.Any], videoSendBytes = videoSendBytes.asInstanceOf[js.Any], videoSendFrameRate = videoSendFrameRate.asInstanceOf[js.Any], videoSendPackets = videoSendPackets.asInstanceOf[js.Any], videoSendPacketsLost = videoSendPacketsLost.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalStreamStats]
  }
  @scala.inline
  implicit class LocalStreamStatsOps[Self <: LocalStreamStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessDelay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioSendBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioSendBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioSendPackets(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioSendPackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioSendPacketsLost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioSendPacketsLost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoSendBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoSendBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoSendFrameRate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoSendFrameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoSendPackets(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoSendPackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoSendPacketsLost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoSendPacketsLost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoSendResolutionHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoSendResolutionHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoSendResolutionHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoSendResolutionHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoSendResolutionWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoSendResolutionWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoSendResolutionWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoSendResolutionWidth")(js.undefined)
        ret
    }
  }
  
}

