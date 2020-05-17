package typingsSlinky.agoraRtcSdk.mod

import typingsSlinky.agoraRtcSdk.anon.Height
import typingsSlinky.agoraRtcSdk.anon.Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The video encoder configuration.
  *
  * This interface sets the video encoder configuration in {@link setVideoEncoderConfiguration}.
  *
  * Depending on the OS, browser, and camera, the actual resolution, frame rate, and bitrate might be different from the set values.
  */
@js.native
trait VideoEncoderConfiguration extends js.Object {
  /**
    * The video bitrate (Kbps). The value range is [1,10000000].
    *
    * We recommend setting the bitrate between 100 Kbps and 5000 Kbps. You can refer to the table below and set your bitrate.
    *
    * [[include:VideoProfileDefinition.md]]
    */
  var bitrate: js.UndefOr[Max] = js.native
  /**
    * The video frame rate (fps).
    *
    * The value range is [1, 10000]. We recommend setting the frame rate between 5 fps and 30 fps.
    *
    * **Note:**
    * - This parameter sets the local capturing video frame rate. The actual encoding frame rate depends on the device, system, and browser.
    * - When the network conditions change, the browser adjusts the encoding frame rate automatically.
    */
  var frameRate: js.UndefOr[Max] = js.native
  /**
    * Resolution of the video.
    *
    * We recommend using common resolutions, for example:
    *
    * - 480 &times; 360
    * - 640 &times; 480
    * - 960 &times; 720
    *
    */
  var resolution: js.UndefOr[Height] = js.native
}

object VideoEncoderConfiguration {
  @scala.inline
  def apply(): VideoEncoderConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoEncoderConfiguration]
  }
  @scala.inline
  implicit class VideoEncoderConfigurationOps[Self <: VideoEncoderConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitrate(value: Max): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameRate(value: Max): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(js.undefined)
        ret
    }
    @scala.inline
    def withResolution(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(js.undefined)
        ret
    }
  }
  
}

