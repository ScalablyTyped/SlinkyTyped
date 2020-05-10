package typingsSlinky.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Audio statistics of the local stream.
  *
  * If {@link getLocalAudioStats} is called successfully, the {@link LocalAudioStatsMap} provides the UID and {@link LocalAudioStats} of the local user.
  */
@js.native
trait LocalAudioStats extends js.Object {
  /**
    * Encoding type of the sent audio.
    *
    * - "1": Opus.
    * - "2": AAC.
    */
  val CodecType: js.UndefOr[String] = js.native
  /**
    * Whether the audio is muted or not.
    *
    * - "1": Muted.
    * - "0": Unmuted.
    */
  val MuteState: js.UndefOr[String] = js.native
  /** Energy level of the captured audio. */
  val RecordingLevel: js.UndefOr[String] = js.native
  /** Sampling rate, in kHz. */
  val SamplingRate: js.UndefOr[String] = js.native
  /** Bitrate of the sent audio, in Kbps. */
  val SendBitrate: js.UndefOr[String] = js.native
  /** Energy level of the sent audio. */
  val SendLevel: js.UndefOr[String] = js.native
}

object LocalAudioStats {
  @scala.inline
  def apply(): LocalAudioStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalAudioStats]
  }
  @scala.inline
  implicit class LocalAudioStatsOps[Self <: LocalAudioStats] (val x: Self) extends AnyVal {
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
    def withRecordingLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordingLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordingLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withSamplingRate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamplingRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplingRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamplingRate")(js.undefined)
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
    def withSendLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendLevel")(js.undefined)
        ret
    }
  }
  
}

