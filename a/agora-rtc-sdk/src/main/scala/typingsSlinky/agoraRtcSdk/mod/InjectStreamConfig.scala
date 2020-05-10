package typingsSlinky.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class for configuring the imported live broadcast voice or video stream in {@link addInjectStreamUrl}.
  *
  * @example **Sample code**
  * ```javascript
  * var InjectStreamConfig = {
  *   width: 0,
  *   height: 0,
  *   videoGop: 30,
  *   videoFramerate: 15,
  *   videoBitrate: 400,
  *   audioSampleRate: 44100,
  *   audioChannels: 1,
  * };
  * ```
  */
@js.native
trait InjectStreamConfig extends js.Object {
  /**
    * Audio bitrate of the added stream to the broadcast.
    *
    * Positive integer. The default value is 48. The value range is [1, 10000].
    *
    * **Note:**
    *
    * Agora recommends that you stay with the default value and not reset it at this point of time.
    */
  var audioBitrate: js.UndefOr[Double] = js.native
  /**
    * Audio channels to add into the broadcast.
    *
    * Positive integer. The default value is 1. The value range is [1, 2].
    *
    * **Note:**
    *
    * Agora recommends that you stay with the default value and not reset it at this point of time.
    */
  var audioChannels: js.UndefOr[Double] = js.native
  /**
    * Audio sampling rate of the added stream to the broadcast.
    *
    * - 32000: 32 kHz
    * - 44100: (Default) 44.1 kHz
    * - 48000: 48 kHz
    *
    * **Note:**
    *
    * Agora recommends that you stay with the default value and not reset it at this point of time.
    */
  var audioSampleRate: js.UndefOr[Double] = js.native
  /**
    * Height of the added stream to the broadcast.
    *
    * Integer, the default value is 0, which is the same height as the original stream. The value range is [0, 10000].
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Video bitrate of the added stream to the broadcast.
    *
    * Positive integer. The default value is 400 Kbps. The value range is [1, 10000].
    *
    * **Note:**
    *
    * The setting of the video bitrate is closely linked to the resolution. If the video bitrate you set is beyond the reasonable range, the SDK will set it within the reasonable range instead.
    */
  var videoBitrate: js.UndefOr[Double] = js.native
  /**
    * Video frame rate of the added stream to the broadcast.
    *
    * Positive integer. The default value is 15 fps. The value range is [1, 10000].
    */
  var videoFramerate: js.UndefOr[Double] = js.native
  /**
    * Video GOP of the added stream to the broadcast.
    *
    * Positive integer. The default value is 30 frames. The value range is [1, 10000].
    */
  var videoGop: js.UndefOr[Double] = js.native
  /**
    * Width of the added stream to the broadcast.
    *
    * Integer, the default value is 0, which is the same width as the original stream. The value range is [0, 10000].
    */
  var width: js.UndefOr[Double] = js.native
}

object InjectStreamConfig {
  @scala.inline
  def apply(): InjectStreamConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InjectStreamConfig]
  }
  @scala.inline
  implicit class InjectStreamConfigOps[Self <: InjectStreamConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioBitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioChannels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioChannels")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioSampleRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioSampleRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioSampleRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioSampleRate")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoBitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoFramerate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoFramerate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoFramerate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoFramerate")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoGop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoGop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoGop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoGop")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

