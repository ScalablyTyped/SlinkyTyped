package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoCodecSettings extends js.Object {
  var FrameCaptureSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.FrameCaptureSettings] = js.native
  var H264Settings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.H264Settings] = js.native
  var H265Settings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.H265Settings] = js.native
}

object VideoCodecSettings {
  @scala.inline
  def apply(): VideoCodecSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoCodecSettings]
  }
  @scala.inline
  implicit class VideoCodecSettingsOps[Self <: VideoCodecSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrameCaptureSettings(value: FrameCaptureSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameCaptureSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameCaptureSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameCaptureSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withH264Settings(value: H264Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("H264Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH264Settings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("H264Settings")(js.undefined)
        ret
    }
    @scala.inline
    def withH265Settings(value: H265Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("H265Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH265Settings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("H265Settings")(js.undefined)
        ret
    }
  }
  
}

