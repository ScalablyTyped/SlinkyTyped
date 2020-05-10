package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mpeg2Settings extends js.Object {
  /**
    * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
    */
  var AdaptiveQuantization: js.UndefOr[Mpeg2AdaptiveQuantization] = js.native
  /**
    * Specify the average bitrate in bits per second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be unique when rounded down to the nearest multiple of 1000.
    */
  var Bitrate: js.UndefOr[integerMin1000Max288000000] = js.native
  /**
    * Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
    */
  var CodecLevel: js.UndefOr[Mpeg2CodecLevel] = js.native
  /**
    * Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video output.
    */
  var CodecProfile: js.UndefOr[Mpeg2CodecProfile] = js.native
  /**
    * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
    */
  var DynamicSubGop: js.UndefOr[Mpeg2DynamicSubGop] = js.native
  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job sepecification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  var FramerateControl: js.UndefOr[Mpeg2FramerateControl] = js.native
  /**
    * When set to INTERPOLATE, produces smoother motion during frame rate conversion.
    */
  var FramerateConversionAlgorithm: js.UndefOr[Mpeg2FramerateConversionAlgorithm] = js.native
  /**
    * Frame rate denominator.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max1001] = js.native
  /**
    * Frame rate numerator - frame rate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
    */
  var FramerateNumerator: js.UndefOr[integerMin24Max60000] = js.native
  /**
    * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output segmenting.
    */
  var GopClosedCadence: js.UndefOr[integerMin0Max2147483647] = js.native
  /**
    * GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
    */
  var GopSize: js.UndefOr[doubleMin0] = js.native
  /**
    * Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
    */
  var GopSizeUnits: js.UndefOr[Mpeg2GopSizeUnits] = js.native
  /**
    * Percentage of the buffer that should initially be filled (HRD buffer model).
    */
  var HrdBufferInitialFillPercentage: js.UndefOr[integerMin0Max100] = js.native
  /**
    * Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
    */
  var HrdBufferSize: js.UndefOr[integerMin0Max47185920] = js.native
  /**
    * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior depends on the input scan type.
    - If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first".
    - If the source is progressive, the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose.
    */
  var InterlaceMode: js.UndefOr[Mpeg2InterlaceMode] = js.native
  /**
    * Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization precision for intra-block DC coefficients. If you choose the value auto, the service will automatically select the precision based on the per-frame compression ratio.
    */
  var IntraDcPrecision: js.UndefOr[Mpeg2IntraDcPrecision] = js.native
  /**
    * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000.
    */
  var MaxBitrate: js.UndefOr[integerMin1000Max300000000] = js.native
  /**
    * Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the next GOP. This setting is only used when Scene Change Detect is enabled. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
    */
  var MinIInterval: js.UndefOr[integerMin0Max30] = js.native
  /**
    * Number of B-frames between reference frames.
    */
  var NumberBFramesBetweenReferenceFrames: js.UndefOr[integerMin0Max7] = js.native
  /**
    * Using the API, enable ParFollowSource if you want the service to use the pixel aspect ratio from the input. Using the console, do this by choosing Follow source for Pixel aspect ratio.
    */
  var ParControl: js.UndefOr[Mpeg2ParControl] = js.native
  /**
    * Pixel Aspect Ratio denominator.
    */
  var ParDenominator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Pixel Aspect Ratio numerator.
    */
  var ParNumerator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Use Quality tuning level (Mpeg2QualityTuningLevel) to specifiy whether to use single-pass or multipass video encoding.
    */
  var QualityTuningLevel: js.UndefOr[Mpeg2QualityTuningLevel] = js.native
  /**
    * Use Rate control mode (Mpeg2RateControlMode) to specifiy whether the bitrate is variable (vbr) or constant (cbr).
    */
  var RateControlMode: js.UndefOr[Mpeg2RateControlMode] = js.native
  /**
    * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default.
    */
  var SceneChangeDetect: js.UndefOr[Mpeg2SceneChangeDetect] = js.native
  /**
    * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
    */
  var SlowPal: js.UndefOr[Mpeg2SlowPal] = js.native
  /**
    * Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.
    */
  var Softness: js.UndefOr[integerMin0Max128] = js.native
  /**
    * Adjust quantization within each frame based on spatial variation of content complexity.
    */
  var SpatialAdaptiveQuantization: js.UndefOr[Mpeg2SpatialAdaptiveQuantization] = js.native
  /**
    * Produces a Type D-10 compatible bitstream (SMPTE 356M-2001).
    */
  var Syntax: js.UndefOr[Mpeg2Syntax] = js.native
  /**
    * Only use Telecine (Mpeg2Telecine) when you set Framerate (Framerate) to 29.970. Set Telecine (Mpeg2Telecine) to Hard (hard) to produce a 29.97i output from a 23.976 input. Set it to Soft (soft) to produce 23.976 output and leave converstion to the player.
    */
  var Telecine: js.UndefOr[Mpeg2Telecine] = js.native
  /**
    * Adjust quantization within each frame based on temporal variation of content complexity.
    */
  var TemporalAdaptiveQuantization: js.UndefOr[Mpeg2TemporalAdaptiveQuantization] = js.native
}

object Mpeg2Settings {
  @scala.inline
  def apply(): Mpeg2Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mpeg2Settings]
  }
  @scala.inline
  implicit class Mpeg2SettingsOps[Self <: Mpeg2Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdaptiveQuantization(value: Mpeg2AdaptiveQuantization): Self = {
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
    def withBitrate(value: integerMin1000Max288000000): Self = {
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
    def withCodecLevel(value: Mpeg2CodecLevel): Self = {
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
    def withCodecProfile(value: Mpeg2CodecProfile): Self = {
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
    def withDynamicSubGop(value: Mpeg2DynamicSubGop): Self = {
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
    def withFramerateControl(value: Mpeg2FramerateControl): Self = {
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
    def withFramerateConversionAlgorithm(value: Mpeg2FramerateConversionAlgorithm): Self = {
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
    def withFramerateDenominator(value: integerMin1Max1001): Self = {
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
    def withFramerateNumerator(value: integerMin24Max60000): Self = {
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
    def withGopSizeUnits(value: Mpeg2GopSizeUnits): Self = {
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
    def withHrdBufferSize(value: integerMin0Max47185920): Self = {
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
    def withInterlaceMode(value: Mpeg2InterlaceMode): Self = {
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
    def withIntraDcPrecision(value: Mpeg2IntraDcPrecision): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntraDcPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntraDcPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntraDcPrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBitrate(value: integerMin1000Max300000000): Self = {
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
    def withParControl(value: Mpeg2ParControl): Self = {
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
    def withQualityTuningLevel(value: Mpeg2QualityTuningLevel): Self = {
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
    def withRateControlMode(value: Mpeg2RateControlMode): Self = {
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
    def withSceneChangeDetect(value: Mpeg2SceneChangeDetect): Self = {
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
    def withSlowPal(value: Mpeg2SlowPal): Self = {
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
    def withSpatialAdaptiveQuantization(value: Mpeg2SpatialAdaptiveQuantization): Self = {
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
    def withSyntax(value: Mpeg2Syntax): Self = {
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
    def withTelecine(value: Mpeg2Telecine): Self = {
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
    def withTemporalAdaptiveQuantization(value: Mpeg2TemporalAdaptiveQuantization): Self = {
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
  }
  
}

