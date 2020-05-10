package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoDescription extends js.Object {
  /**
    * This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert AFD signaling (AfdSignaling) to specify whether the service includes AFD values in the output video data and what those values are. * Choose None to remove all AFD values from this output. * Choose Fixed to ignore input AFD values and instead encode the value specified in the job. * Choose Auto to calculate output AFD values based on the input AFD scaler data.
    */
  var AfdSignaling: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.AfdSignaling] = js.native
  /**
    * The anti-alias filter is automatically applied to all outputs. The service no longer accepts the value DISABLED for AntiAlias. If you specify that in your job, the service will ignore the setting.
    */
  var AntiAlias: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.AntiAlias] = js.native
  /**
    * Video codec settings, (CodecSettings) under (VideoDescription), contains the group of settings related to video encoding. The settings in this group vary depending on the value that you choose for Video codec (Codec). For each codec enum that you choose, define the corresponding settings object. The following lists the codec enum, settings object pairs. * FRAME_CAPTURE, FrameCaptureSettings * AV1, Av1Settings * H_264, H264Settings * H_265, H265Settings * MPEG2, Mpeg2Settings * PRORES, ProresSettings
    */
  var CodecSettings: js.UndefOr[VideoCodecSettings] = js.native
  /**
    * Choose Insert (INSERT) for this setting to include color metadata in this output. Choose Ignore (IGNORE) to exclude color metadata from this output. If you don't specify a value, the service sets this to Insert by default.
    */
  var ColorMetadata: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.ColorMetadata] = js.native
  /**
    * Use Cropping selection (crop) to specify the video area that the service will include in the output video frame.
    */
  var Crop: js.UndefOr[Rectangle] = js.native
  /**
    * Applies only to 29.97 fps outputs. When this feature is enabled, the service will use drop-frame timecode on outputs. If it is not possible to use drop-frame timecode, the system will fall back to non-drop-frame. This setting is enabled by default when Timecode insertion (TimecodeInsertion) is enabled.
    */
  var DropFrameTimecode: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.DropFrameTimecode] = js.native
  /**
    * Applies only if you set AFD Signaling(AfdSignaling) to Fixed (FIXED). Use Fixed (FixedAfd) to specify a four-bit AFD value which the service will write on all  frames of this video output.
    */
  var FixedAfd: js.UndefOr[integerMin0Max15] = js.native
  /**
    * Use the Height (Height) setting to define the video resolution height for this output. Specify in pixels. If you don't provide a value here, the service will use the input height.
    */
  var Height: js.UndefOr[integerMin32Max8192] = js.native
  /**
    * Use Selection placement (position) to define the video area in your output frame. The area outside of the rectangle that you specify here is black.
    */
  var Position: js.UndefOr[Rectangle] = js.native
  /**
    * Use Respond to AFD (RespondToAfd) to specify how the service changes the video itself in response to AFD values in the input. * Choose Respond to clip the input video frame according to the AFD value, input display aspect ratio, and output display aspect ratio. * Choose Passthrough to include the input AFD values. Do not choose this when AfdSignaling is set to (NONE). A preferred implementation of this workflow is to set RespondToAfd to (NONE) and set AfdSignaling to (AUTO). * Choose None to remove all input AFD values from this output.
    */
  var RespondToAfd: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.RespondToAfd] = js.native
  /**
    * Specify how the service handles outputs that have a different aspect ratio from the input aspect ratio. Choose Stretch to output (STRETCH_TO_OUTPUT) to have the service stretch your video image to fit. Keep the setting Default (DEFAULT) to have the service letterbox your video instead. This setting overrides any value that you specify for the setting Selection placement (position) in this output.
    */
  var ScalingBehavior: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.ScalingBehavior] = js.native
  /**
    * Use Sharpness (Sharpness) setting to specify the strength of anti-aliasing. This setting changes the width of the anti-alias filter kernel used for scaling. Sharpness only applies if your output resolution is different from your input resolution. 0 is the softest setting, 100 the sharpest, and 50 recommended for most content.
    */
  var Sharpness: js.UndefOr[integerMin0Max100] = js.native
  /**
    * Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable Timecode insertion when the input frame rate is identical to the output frame rate. To include timecodes in this output, set Timecode insertion (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to DISABLED. Default is DISABLED. When the service inserts timecodes in an output, by default, it uses any embedded timecodes from the input. If none are present, the service will set the timecode for the first output frame to zero. To change this default behavior, adjust the settings under Timecode configuration (TimecodeConfig). In the console, these settings are located under Job > Job settings > Timecode configuration. Note - Timecode source under input settings (InputTimecodeSource) does not affect the timecodes that are inserted in the output. Source under Job settings > Timecode configuration (TimecodeSource) does.
    */
  var TimecodeInsertion: js.UndefOr[VideoTimecodeInsertion] = js.native
  /**
    * Find additional transcoding features under Preprocessors (VideoPreprocessors). Enable the features at each output individually. These features are disabled by default.
    */
  var VideoPreprocessors: js.UndefOr[VideoPreprocessor] = js.native
  /**
    * Use Width (Width) to define the video resolution width, in pixels, for this output. If you don't provide a value here, the service will use the input width.
    */
  var Width: js.UndefOr[integerMin32Max8192] = js.native
}

object VideoDescription {
  @scala.inline
  def apply(): VideoDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoDescription]
  }
  @scala.inline
  implicit class VideoDescriptionOps[Self <: VideoDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfdSignaling(value: AfdSignaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AfdSignaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfdSignaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AfdSignaling")(js.undefined)
        ret
    }
    @scala.inline
    def withAntiAlias(value: AntiAlias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AntiAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAntiAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AntiAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withCodecSettings(value: VideoCodecSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodecSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodecSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodecSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withColorMetadata(value: ColorMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withCrop(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Crop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Crop")(js.undefined)
        ret
    }
    @scala.inline
    def withDropFrameTimecode(value: DropFrameTimecode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DropFrameTimecode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropFrameTimecode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DropFrameTimecode")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedAfd(value: integerMin0Max15): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FixedAfd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedAfd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FixedAfd")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: integerMin32Max8192): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(js.undefined)
        ret
    }
    @scala.inline
    def withRespondToAfd(value: RespondToAfd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RespondToAfd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRespondToAfd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RespondToAfd")(js.undefined)
        ret
    }
    @scala.inline
    def withScalingBehavior(value: ScalingBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withSharpness(value: integerMin0Max100): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sharpness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharpness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sharpness")(js.undefined)
        ret
    }
    @scala.inline
    def withTimecodeInsertion(value: VideoTimecodeInsertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimecodeInsertion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimecodeInsertion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimecodeInsertion")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoPreprocessors(value: VideoPreprocessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoPreprocessors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoPreprocessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoPreprocessors")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: integerMin32Max8192): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(js.undefined)
        ret
    }
  }
  
}

