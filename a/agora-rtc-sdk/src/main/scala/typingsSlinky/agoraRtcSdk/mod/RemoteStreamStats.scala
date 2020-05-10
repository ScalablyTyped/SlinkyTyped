package typingsSlinky.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The connection statistics of the remote stream.
  *
  * If the remote stream calls {@link getStats} successfully, this interface provides the statistics.
  */
@js.native
trait RemoteStreamStats extends js.Object {
  /** Delay in accessing the SD-RTN (ms). */
  var accessDelay: String = js.native
  /** Bytes of the received audio. */
  var audioReceiveBytes: String = js.native
  /**
    * Delay in receiving the audio (ms).
    *
    * Delay from sending to playing the audio, only supported by Chrome for now.
    */
  var audioReceiveDelay: String = js.native
  /** Packets of the received audio. */
  var audioReceivePackets: String = js.native
  /** Number of lost packets of the received audio. */
  var audioReceivePacketsLost: String = js.native
  /**
    * End to end delay (ms).
    *
    * Delay from sending to receiving data.
    */
  var endToEndDelay: String = js.native
  /** Bytes of the received video. */
  var videoReceiveBytes: String = js.native
  /** Decode frame rate after the video is received. */
  var videoReceiveDecodeFrameRate: String = js.native
  /**
    * Delay in receiving the video (ms).
    *
    * Delay from sending to playing the video, only supported by Chrome for now.
    */
  var videoReceiveDelay: String = js.native
  /** Frame rate rof the received video. */
  var videoReceiveFrameRate: String = js.native
  /** Packets of the received video. */
  var videoReceivePackets: String = js.native
  /** Number of lost packets of the received video. */
  var videoReceivePacketsLost: String = js.native
  /** Resolution height of the received video. */
  var videoReceiveResolutionHeight: js.UndefOr[String] = js.native
  /** Resolution width of the received video. */
  var videoReceiveResolutionWidth: js.UndefOr[String] = js.native
}

object RemoteStreamStats {
  @scala.inline
  def apply(
    accessDelay: String,
    audioReceiveBytes: String,
    audioReceiveDelay: String,
    audioReceivePackets: String,
    audioReceivePacketsLost: String,
    endToEndDelay: String,
    videoReceiveBytes: String,
    videoReceiveDecodeFrameRate: String,
    videoReceiveDelay: String,
    videoReceiveFrameRate: String,
    videoReceivePackets: String,
    videoReceivePacketsLost: String
  ): RemoteStreamStats = {
    val __obj = js.Dynamic.literal(accessDelay = accessDelay.asInstanceOf[js.Any], audioReceiveBytes = audioReceiveBytes.asInstanceOf[js.Any], audioReceiveDelay = audioReceiveDelay.asInstanceOf[js.Any], audioReceivePackets = audioReceivePackets.asInstanceOf[js.Any], audioReceivePacketsLost = audioReceivePacketsLost.asInstanceOf[js.Any], endToEndDelay = endToEndDelay.asInstanceOf[js.Any], videoReceiveBytes = videoReceiveBytes.asInstanceOf[js.Any], videoReceiveDecodeFrameRate = videoReceiveDecodeFrameRate.asInstanceOf[js.Any], videoReceiveDelay = videoReceiveDelay.asInstanceOf[js.Any], videoReceiveFrameRate = videoReceiveFrameRate.asInstanceOf[js.Any], videoReceivePackets = videoReceivePackets.asInstanceOf[js.Any], videoReceivePacketsLost = videoReceivePacketsLost.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteStreamStats]
  }
  @scala.inline
  implicit class RemoteStreamStatsOps[Self <: RemoteStreamStats] (val x: Self) extends AnyVal {
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
    def withAudioReceiveBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioReceiveBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioReceiveDelay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioReceiveDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioReceivePackets(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioReceivePackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioReceivePacketsLost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioReceivePacketsLost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndToEndDelay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endToEndDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoReceiveBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoReceiveBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoReceiveDecodeFrameRate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoReceiveDecodeFrameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoReceiveDelay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoReceiveDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoReceiveFrameRate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoReceiveFrameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoReceivePackets(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoReceivePackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoReceivePacketsLost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoReceivePacketsLost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoReceiveResolutionHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoReceiveResolutionHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoReceiveResolutionHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoReceiveResolutionHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoReceiveResolutionWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoReceiveResolutionWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoReceiveResolutionWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoReceiveResolutionWidth")(js.undefined)
        ret
    }
  }
  
}

