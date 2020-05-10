package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoCodecSettings extends js.Object {
  /**
    * Required when you set Codec, under VideoDescription>CodecSettings to the value AV1.
    */
  var Av1Settings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.Av1Settings] = js.native
  /**
    * Specifies the video codec. This must be equal to one of the enum values defined by the object  VideoCodec.
    */
  var Codec: js.UndefOr[VideoCodec] = js.native
  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value FRAME_CAPTURE.
    */
  var FrameCaptureSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.FrameCaptureSettings] = js.native
  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value H_264.
    */
  var H264Settings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.H264Settings] = js.native
  /**
    * Settings for H265 codec
    */
  var H265Settings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.H265Settings] = js.native
  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value MPEG2.
    */
  var Mpeg2Settings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.Mpeg2Settings] = js.native
  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value PRORES.
    */
  var ProresSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.ProresSettings] = js.native
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
    def withAv1Settings(value: Av1Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Av1Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAv1Settings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Av1Settings")(js.undefined)
        ret
    }
    @scala.inline
    def withCodec(value: VideoCodec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Codec")(js.undefined)
        ret
    }
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
    @scala.inline
    def withMpeg2Settings(value: Mpeg2Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mpeg2Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMpeg2Settings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mpeg2Settings")(js.undefined)
        ret
    }
    @scala.inline
    def withProresSettings(value: ProresSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProresSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProresSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProresSettings")(js.undefined)
        ret
    }
  }
  
}

