package typingsSlinky.agoraRtcSdk.mod

import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.application
import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.screen
import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.window
import typingsSlinky.agoraRtcSdk.anon.AEC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class defining the `spec` paramter in the {@link createStream} method.
  * [[include:StreamSpec-example.md]]
  */
@js.native
trait StreamSpec extends js.Object {
  /**
    * Marks whether this stream contains an audio track.
    */
  var audio: Boolean = js.native
  /** Marks whether to enable audio processing. */
  var audioProcessing: js.UndefOr[AEC] = js.native
  /**
    * Specifies the audio source of the stream.
    */
  var audioSource: js.UndefOr[MediaStreamTrack] = js.native
  /**
    * The camera device ID retrieved from the {@link getDevices} method.
    *
    * The retrieved ID is ASCII characters, and the string length is greater than or equals to 0 and less than 256 bytes.
    *
    * When the string length is 0, this property is ignored.
    */
  var cameraId: js.UndefOr[String] = js.native
  /**
    * The extension ID of the Chrome screen-sharing extension.
    *
    * ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    *
    * Set this property if you use the Chrome screen-sharing extension. See [Chrome Extension for Screen Sharing](../../../chrome_screensharing_plugin?platform=Web) for details.
    *
    * **Note:**
    *
    * Chrome 72 and later versions support screen sharing without the extension. You can leave `extensionId` as empty.
    *
    * If you set the `extensionId`, then you need to use the screen-sharing extension.
    */
  var extensionId: js.UndefOr[String] = js.native
  /**
    * Sets using the front or rear camera
    *
    * You can set this parameter to use the front or rear camera on mobile devices:
    * - `"user"`: The front camera.
    * - `"environment"`: The rear camera.
    */
  var facingMode: js.UndefOr[String] = js.native
  /**
    * The screen-sharing mode on the Firefox browser.
    *
    * If you are using the Firefox browser, setting this property specifies the screen-sharing mode:
    * - `"screen"`: (default) share the current screen
    * - `"application"`: share all windows of an App
    * - `"window"`: share a specified window of an App
    *
    * **Note:**
    *
    * Firefox on Windows does not support the application mode.
    *
    * See [Screen Sharing on Firefox](../../../screensharing_web?platform=Web#a-name-ff-a-screen-sharing-on-firefox) for details.
    */
  var mediaSource: js.UndefOr[screen | application | window] = js.native
  /**
    * The microphone device ID retrieved from the {@link getDevices} method.
    *
    * The retrieved ID is ASCII characters, and the string length is greater than or equals to 0 and less than 256 bytes.
    *
    * When the string length is 0, this property is ignored.
    */
  var microphoneId: js.UndefOr[String] = js.native
  /**
    * Marks whether to mirror the local video image of the publisher in the local preview.
    *
    * This setting does not take effect in screen-sharing streams.
    *
    * - `true`: (Default) Mirror the local video.
    * - `false`: Do not mirror the local video.
    *
    *  Agora recommends enabling this function when using the front camera, and disabling it when using the rear camera.
    */
  var mirror: js.UndefOr[Boolean] = js.native
  /**
    * Marks whether this stream contains a screen-sharing track. See [Share the Screen](../../../screensharing_web?platform=Web) for details.
    */
  var screen: js.UndefOr[Boolean] = js.native
  /**
    * Marks whether to share the audio playback when sharing the screen.
    *
    * **Since**
    * <br>&emsp;&emsp;&emsp;*3.0.0*
    *
    * - `true`: Share the local audio playback when sharing the screen.
    * - `false`: (Default) Do not share the local audio playback when sharing the screen.
    *
    * To share the local audio playback when sharing the screen, ensure that you set {@link screen} as `true`. We recommend also setting {@link audio} as `false`. If both `screenAudio` and `audio` are set as `true`, the stream only contains the local audio playback.
    *
    * **Note:**
    *
    * - This function supports only Chrome 73 or later on Windows.
    * - For the audio sharing to take effect, the user must check **Share audio** in the pop-up window when sharing the screen.
    */
  var screenAudio: js.UndefOr[Boolean] = js.native
  /**
    * The stream ID.
    *
    * Please set the stream ID as the user ID, which can be retrieved from the callback of {@link Client.join}.
    */
  var streamID: js.UndefOr[Double | String] = js.native
  /**
    * Marks whether this stream contains a video track.
    */
  var video: Boolean = js.native
  /**
    * Specifies the video source of the stream.
    *
    * **Note:**
    *
    * If you use a video source created by the Canvas API, re-draw on the canvas every one second when the drawing is still to keep the video publishing.
    */
  var videoSource: js.UndefOr[MediaStreamTrack] = js.native
}

object StreamSpec {
  @scala.inline
  def apply(audio: Boolean, video: Boolean): StreamSpec = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSpec]
  }
  @scala.inline
  implicit class StreamSpecOps[Self <: StreamSpec] (val x: Self) extends AnyVal {
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
    def withVideo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioProcessing(value: AEC): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioProcessing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioProcessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioProcessing")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioSource(value: MediaStreamTrack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioSource")(js.undefined)
        ret
    }
    @scala.inline
    def withCameraId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCameraId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraId")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionId")(js.undefined)
        ret
    }
    @scala.inline
    def withFacingMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaSource(value: screen | application | window): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaSource")(js.undefined)
        ret
    }
    @scala.inline
    def withMicrophoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microphoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMicrophoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microphoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withMirror(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMirror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirror")(js.undefined)
        ret
    }
    @scala.inline
    def withScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenAudio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenAudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenAudio")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamID(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamID")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoSource(value: MediaStreamTrack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoSource")(js.undefined)
        ret
    }
  }
  
}

