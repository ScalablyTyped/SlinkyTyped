package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait H264Settings extends js.Object {
  /**
    * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
    */
  var AdaptiveQuantization: js.UndefOr[H264AdaptiveQuantization] = js.native
  /**
    * Specify the average bitrate in bits per second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be unique when rounded down to the nearest multiple of 1000.
    */
  var Bitrate: js.UndefOr[integerMin1000Max1152000000] = js.native
  /**
    * Specify an H.264 level that is consistent with your output video settings. If you aren't sure what level to specify, choose Auto (AUTO).
    */
  var CodecLevel: js.UndefOr[H264CodecLevel] = js.native
  /**
    * H.264 Profile. High 4:2:2 and 10-bit profiles are only available with the AVC-I License.
    */
  var CodecProfile: js.UndefOr[H264CodecProfile] = js.native
  /**
    * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
    */
  var DynamicSubGop: js.UndefOr[H264DynamicSubGop] = js.native
  /**
    * Entropy encoding mode. Use CABAC (must be in Main or High profile) or CAVLC.
    */
  var EntropyEncoding: js.UndefOr[H264EntropyEncoding] = js.native
  /**
    * Choosing FORCE_FIELD disables PAFF encoding for interlaced outputs.
    */
  var FieldEncoding: js.UndefOr[H264FieldEncoding] = js.native
  /**
    * Adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
    */
  var FlickerAdaptiveQuantization: js.UndefOr[H264FlickerAdaptiveQuantization] = js.native
  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  var FramerateControl: js.UndefOr[H264FramerateControl] = js.native
  /**
    * When set to INTERPOLATE, produces smoother motion during frame rate conversion.
    */
  var FramerateConversionAlgorithm: js.UndefOr[H264FramerateConversionAlgorithm] = js.native
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Frame rate numerator - frame rate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
    */
  var FramerateNumerator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * If enable, use reference B frames for GOP structures that have B frames > 1.
    */
  var GopBReference: js.UndefOr[H264GopBReference] = js.native
  /**
    * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output segmenting.
    */
  var GopClosedCadence: js.UndefOr[integerMin0Max2147483647] = js.native
  /**
    * GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
    */
  var GopSize: js.UndefOr[doubleMin0] = js.native
  /**
    * Indicates if the GOP Size in H264 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
    */
  var GopSizeUnits: js.UndefOr[H264GopSizeUnits] = js.native
  /**
    * Percentage of the buffer that should initially be filled (HRD buffer model).
    */
  var HrdBufferInitialFillPercentage: js.UndefOr[integerMin0Max100] = js.native
  /**
    * Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
    */
  var HrdBufferSize: js.UndefOr[integerMin0Max1152000000] = js.native
  /**
    * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior depends on the input scan type, as follows.
    - If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first".
    - If the source is progressive, the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose.
    */
  var InterlaceMode: js.UndefOr[H264InterlaceMode] = js.native
  /**
    * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. Required when Rate control mode is QVBR.
    */
  var MaxBitrate: js.UndefOr[integerMin1000Max1152000000] = js.native
  /**
    * Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the next GOP. This setting is only used when Scene Change Detect is enabled. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
    */
  var MinIInterval: js.UndefOr[integerMin0Max30] = js.native
  /**
    * Number of B-frames between reference frames.
    */
  var NumberBFramesBetweenReferenceFrames: js.UndefOr[integerMin0Max7] = js.native
  /**
    * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced encoding.
    */
  var NumberReferenceFrames: js.UndefOr[integerMin1Max6] = js.native
  /**
    * Using the API, enable ParFollowSource if you want the service to use the pixel aspect ratio from the input. Using the console, do this by choosing Follow source for Pixel aspect ratio.
    */
  var ParControl: js.UndefOr[H264ParControl] = js.native
  /**
    * Pixel Aspect Ratio denominator.
    */
  var ParDenominator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Pixel Aspect Ratio numerator.
    */
  var ParNumerator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Use Quality tuning level (H264QualityTuningLevel) to specifiy whether to use fast single-pass, high-quality singlepass, or high-quality multipass video encoding.
    */
  var QualityTuningLevel: js.UndefOr[H264QualityTuningLevel] = js.native
  /**
    * Settings for quality-defined variable bitrate encoding with the H.264 codec. Required when you set Rate control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate control mode.
    */
  var QvbrSettings: js.UndefOr[H264QvbrSettings] = js.native
  /**
    * Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
    */
  var RateControlMode: js.UndefOr[H264RateControlMode] = js.native
  /**
    * Places a PPS header on each encoded picture, even if repeated.
    */
  var RepeatPps: js.UndefOr[H264RepeatPps] = js.native
  /**
    * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default. If this output uses QVBR, choose Transition detection (TRANSITION_DETECTION) for further video quality improvement. For more information about QVBR, see https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
    */
  var SceneChangeDetect: js.UndefOr[H264SceneChangeDetect] = js.native
  /**
    * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
    */
  var Slices: js.UndefOr[integerMin1Max32] = js.native
  /**
    * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
    */
  var SlowPal: js.UndefOr[H264SlowPal] = js.native
  /**
    * Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.
    */
  var Softness: js.UndefOr[integerMin0Max128] = js.native
  /**
    * Adjust quantization within each frame based on spatial variation of content complexity.
    */
  var SpatialAdaptiveQuantization: js.UndefOr[H264SpatialAdaptiveQuantization] = js.native
  /**
    * Produces a bitstream compliant with SMPTE RP-2027.
    */
  var Syntax: js.UndefOr[H264Syntax] = js.native
  /**
    * This field applies only if the Streams > Advanced > Framerate (framerate) field  is set to 29.970. This field works with the Streams > Advanced > Preprocessors > Deinterlacer  field (deinterlace_mode) and the Streams > Advanced > Interlaced Mode field (interlace_mode)  to identify the scan type for the output: Progressive, Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft: produces 23.976; the player converts this output to 29.97i.
    */
  var Telecine: js.UndefOr[H264Telecine] = js.native
  /**
    * Adjust quantization within each frame based on temporal variation of content complexity.
    */
  var TemporalAdaptiveQuantization: js.UndefOr[H264TemporalAdaptiveQuantization] = js.native
  /**
    * Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
    */
  var UnregisteredSeiTimecode: js.UndefOr[H264UnregisteredSeiTimecode] = js.native
}

object H264Settings {
  @scala.inline
  def apply(): H264Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[H264Settings]
  }
  @scala.inline
  implicit class H264SettingsOps[Self <: H264Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdaptiveQuantization(value: H264AdaptiveQuantization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdaptiveQuantization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdaptiveQuantization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdaptiveQuantization")(js.undefined)
        ret
    }
    @scala.inline
    def withBitrate(value: integerMin1000Max1152000000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withCodecLevel(value: H264CodecLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodecLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodecLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodecLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withCodecProfile(value: H264CodecProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodecProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodecProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodecProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicSubGop(value: H264DynamicSubGop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DynamicSubGop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicSubGop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DynamicSubGop")(js.undefined)
        ret
    }
    @scala.inline
    def withEntropyEncoding(value: H264EntropyEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntropyEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntropyEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntropyEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldEncoding(value: H264FieldEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withFlickerAdaptiveQuantization(value: H264FlickerAdaptiveQuantization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlickerAdaptiveQuantization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlickerAdaptiveQuantization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlickerAdaptiveQuantization")(js.undefined)
        ret
    }
    @scala.inline
    def withFramerateControl(value: H264FramerateControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FramerateControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramerateControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FramerateControl")(js.undefined)
        ret
    }
    @scala.inline
    def withFramerateConversionAlgorithm(value: H264FramerateConversionAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FramerateConversionAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramerateConversionAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FramerateConversionAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withFramerateDenominator(value: integerMin1Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FramerateDenominator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramerateDenominator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FramerateDenominator")(js.undefined)
        ret
    }
    @scala.inline
    def withFramerateNumerator(value: integerMin1Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FramerateNumerator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramerateNumerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FramerateNumerator")(js.undefined)
        ret
    }
    @scala.inline
    def withGopBReference(value: H264GopBReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GopBReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGopBReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GopBReference")(js.undefined)
        ret
    }
    @scala.inline
    def withGopClosedCadence(value: integerMin0Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GopClosedCadence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGopClosedCadence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GopClosedCadence")(js.undefined)
        ret
    }
    @scala.inline
    def withGopSize(value: doubleMin0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GopSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGopSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GopSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGopSizeUnits(value: H264GopSizeUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GopSizeUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGopSizeUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GopSizeUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withHrdBufferInitialFillPercentage(value: integerMin0Max100): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HrdBufferInitialFillPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHrdBufferInitialFillPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HrdBufferInitialFillPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withHrdBufferSize(value: integerMin0Max1152000000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HrdBufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHrdBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HrdBufferSize")(js.undefined)
        ret
    }
    @scala.inline
    def withInterlaceMode(value: H264InterlaceMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InterlaceMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterlaceMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InterlaceMode")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBitrate(value: integerMin1000Max1152000000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxBitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinIInterval(value: integerMin0Max30): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinIInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinIInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinIInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberBFramesBetweenReferenceFrames(value: integerMin0Max7): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberBFramesBetweenReferenceFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberBFramesBetweenReferenceFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberBFramesBetweenReferenceFrames")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberReferenceFrames(value: integerMin1Max6): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberReferenceFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberReferenceFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberReferenceFrames")(js.undefined)
        ret
    }
    @scala.inline
    def withParControl(value: H264ParControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParControl")(js.undefined)
        ret
    }
    @scala.inline
    def withParDenominator(value: integerMin1Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParDenominator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParDenominator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParDenominator")(js.undefined)
        ret
    }
    @scala.inline
    def withParNumerator(value: integerMin1Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParNumerator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParNumerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParNumerator")(js.undefined)
        ret
    }
    @scala.inline
    def withQualityTuningLevel(value: H264QualityTuningLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualityTuningLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualityTuningLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualityTuningLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withQvbrSettings(value: H264QvbrSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QvbrSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQvbrSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QvbrSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withRateControlMode(value: H264RateControlMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RateControlMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRateControlMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RateControlMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeatPps(value: H264RepeatPps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepeatPps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatPps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepeatPps")(js.undefined)
        ret
    }
    @scala.inline
    def withSceneChangeDetect(value: H264SceneChangeDetect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SceneChangeDetect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSceneChangeDetect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SceneChangeDetect")(js.undefined)
        ret
    }
    @scala.inline
    def withSlices(value: integerMin1Max32): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Slices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Slices")(js.undefined)
        ret
    }
    @scala.inline
    def withSlowPal(value: H264SlowPal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlowPal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlowPal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlowPal")(js.undefined)
        ret
    }
    @scala.inline
    def withSoftness(value: integerMin0Max128): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Softness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoftness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Softness")(js.undefined)
        ret
    }
    @scala.inline
    def withSpatialAdaptiveQuantization(value: H264SpatialAdaptiveQuantization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpatialAdaptiveQuantization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpatialAdaptiveQuantization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpatialAdaptiveQuantization")(js.undefined)
        ret
    }
    @scala.inline
    def withSyntax(value: H264Syntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Syntax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyntax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Syntax")(js.undefined)
        ret
    }
    @scala.inline
    def withTelecine(value: H264Telecine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Telecine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTelecine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Telecine")(js.undefined)
        ret
    }
    @scala.inline
    def withTemporalAdaptiveQuantization(value: H264TemporalAdaptiveQuantization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemporalAdaptiveQuantization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemporalAdaptiveQuantization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemporalAdaptiveQuantization")(js.undefined)
        ret
    }
    @scala.inline
    def withUnregisteredSeiTimecode(value: H264UnregisteredSeiTimecode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnregisteredSeiTimecode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnregisteredSeiTimecode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnregisteredSeiTimecode")(js.undefined)
        ret
    }
  }
  
}

