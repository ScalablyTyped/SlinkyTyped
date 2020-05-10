package typingsSlinky.agoraRtcSdk.mod

import typingsSlinky.agoraRtcSdk.agoraRtcSdkNumbers.`100`
import typingsSlinky.agoraRtcSdk.agoraRtcSdkNumbers.`1`
import typingsSlinky.agoraRtcSdk.agoraRtcSdkNumbers.`2`
import typingsSlinky.agoraRtcSdk.agoraRtcSdkNumbers.`32000`
import typingsSlinky.agoraRtcSdk.agoraRtcSdkNumbers.`3`
import typingsSlinky.agoraRtcSdk.agoraRtcSdkNumbers.`44100`
import typingsSlinky.agoraRtcSdk.agoraRtcSdkNumbers.`48000`
import typingsSlinky.agoraRtcSdk.agoraRtcSdkNumbers.`4`
import typingsSlinky.agoraRtcSdk.agoraRtcSdkNumbers.`5`
import typingsSlinky.agoraRtcSdk.agoraRtcSdkNumbers.`66`
import typingsSlinky.agoraRtcSdk.agoraRtcSdkNumbers.`77`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class for managing user-specific CDN live audio/video transcoding settings in {@link setLiveTranscoding}.
  *
  * @example **Sample code**
  * ``` javascript
  * var LiveTranscoding = {
  *   width: 640,
  *   height: 360,
  *   videoBitrate: 400,
  *   videoFramerate: 15,
  *   audioSampleRate: AgoraRTC.AUDIO_SAMPLE_RATE_48000,
  *   audioBitrate: 48,
  *   audioChannels: 1,
  *   videoGop: 30,
  *   videoCodecProfile: AgoraRTC.VIDEO_CODEC_PROFILE_HIGH,
  *   userCount: 0,
  *   backgroundColor: 0x000000,
  *   transcodingUsers: [],
  * };
  * ```
  */
@js.native
trait LiveTranscoding extends js.Object {
  /**
    * Bitrate of the CDN live audio output stream in Kbps.
    *
    * Positive integer. The default value is 48, and the highest value is 128.
    */
  var audioBitrate: js.UndefOr[Double] = js.native
  /**
    * Agora’s self-defined audio channel type.
    *
    * Agora recommends choosing 1 or 2. Special players are required if you choose 3, 4 or 5:
    *
    * - 1: (Default) Mono
    * - 2: Dual sound channels
    * - 3: Three sound channels
    * - 4: Four sound channels
    * - 5: Five sound channels
    */
  var audioChannels: js.UndefOr[`1` | `2` | `3` | `4` | `5`] = js.native
  /**
    * Audio sampling rate:
    *
    * - 32000: 32 kHz
    * - 44100: (Default) 44.1 kHz
    * - 48000: 48 kHz
    */
  var audioSampleRate: js.UndefOr[`32000` | `44100` | `48000`] = js.native
  /**
    * The background color in RGB hex value.
    *
    * Value only, do not include a #. The default value is 0x000000. The value range is [0x000000, 0xffffff].
    */
  var backgroundColor: js.UndefOr[Double] = js.native
  /**
    * Height of the video.
    *
    * Positive integer, the default value is 360. The value range is [64, 10000].
    *
    * - When pushing video streams to the CDN, set the value of width × height to at least 64 × 64, or the SDK adjusts it to 64 x 64.
    * - When pushing audio streams to the CDN, set the value of width × height to 0 × 0.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Adds a watermark image to the CDN live stream.
    *
    * **Since**
    * <br>&emsp;&emsp;&emsp;*3.0.0*
    *
    * See [[TranscodingWatermark]] for details.
    */
  var images: js.Array[TranscodingWatermark] = js.native
  /**
    * **DEPRECATED**
    *
    * Latency mode:
    * - true: Low latency with unassured quality.
    * - false: (Default）High latency with assured quality.
    */
  var lowLatency: js.UndefOr[Boolean] = js.native
  /**
    * Manages the user layout configuration in the CDN live streaming.
    *
    * Agora supports a maximum of 17 transcoding users in a CDN streaming channel. See [[TranscodingUser]] for details.
    */
  var transcodingUsers: js.Array[TranscodingUser] = js.native
  /** Number of users; default value is 0. The maximum is 17. */
  var userCount: js.UndefOr[Double] = js.native
  /**
    * Bitrate of the CDN live output video stream.
    *
    * Positive integer. The default value is 400 Kbps. The value range is [1,1000000].
    *
    * Set the bitrate according to the {@link AgoraRTC.VideoEncoderConfiguration.bitrate Video Profile Table}. If you set a bitrate beyond the proper range, the SDK automatically adapts it to a value within the range.
    */
  var videoBitrate: js.UndefOr[Double] = js.native
  /**
    * Video codec profile type.
    *
    * Set it as 66, 77, or 100 (default). If you set this parameter to other values, Agora adjusts it to the default value 100.
    *
    * - 66: Baseline video codec profile. Generally used in video calls on mobile phones.
    * - 77: Main video codec profile.Generally used in mainstream electronics, such as MP4 players, portable video players, PSP, and iPads.
    * - 100: (Default) High video codec profile.Generally used in high - resolution broadcasts or television.
    */
  var videoCodecProfile: js.UndefOr[`66` | `77` | `100`] = js.native
  /**
    * Frame rate of the output data stream set for CDN live.
    *
    * Positive integer. The default value is 15 fps. The value range is [1, 30]. Agora adjusts all values over 30 to 30.
    */
  var videoFramerate: js.UndefOr[Double] = js.native
  /** Video GOP in frames. The default value is 30 frames. The value range is [1,10000]. */
  var videoGop: js.UndefOr[Double] = js.native
  /**
    * Width of the video.
    *
    * Positive integer, the default value is 640. The value range is [64, 10000].
    *
    * - When pushing video streams to the CDN, set the value of width × height to at least 64 × 64, or the SDK adjusts it to 64 x 64.
    * - When pushing audio streams to the CDN, set the value of width × height to 0 × 0.
    */
  var width: js.UndefOr[Double] = js.native
}

object LiveTranscoding {
  @scala.inline
  def apply(images: js.Array[TranscodingWatermark], transcodingUsers: js.Array[TranscodingUser]): LiveTranscoding = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], transcodingUsers = transcodingUsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveTranscoding]
  }
  @scala.inline
  implicit class LiveTranscodingOps[Self <: LiveTranscoding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImages(value: js.Array[TranscodingWatermark]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranscodingUsers(value: js.Array[TranscodingUser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcodingUsers")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withAudioChannels(value: `1` | `2` | `3` | `4` | `5`): Self = {
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
    def withAudioSampleRate(value: `32000` | `44100` | `48000`): Self = {
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
    def withBackgroundColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
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
    def withLowLatency(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowLatency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowLatency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowLatency")(js.undefined)
        ret
    }
    @scala.inline
    def withUserCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userCount")(js.undefined)
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
    def withVideoCodecProfile(value: `66` | `77` | `100`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoCodecProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoCodecProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoCodecProfile")(js.undefined)
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

