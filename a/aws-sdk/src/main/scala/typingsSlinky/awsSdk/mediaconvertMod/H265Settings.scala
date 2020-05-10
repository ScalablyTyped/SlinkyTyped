package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait H265Settings extends js.Object {
  /**
    * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
    */
  var AdaptiveQuantization: js.UndefOr[H265AdaptiveQuantization] = js.native
  /**
    * Enables Alternate Transfer Function SEI message for outputs using Hybrid Log Gamma (HLG) Electro-Optical Transfer Function (EOTF).
    */
  var AlternateTransferFunctionSei: js.UndefOr[H265AlternateTransferFunctionSei] = js.native
  /**
    * Specify the average bitrate in bits per second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be unique when rounded down to the nearest multiple of 1000.
    */
  var Bitrate: js.UndefOr[integerMin1000Max1466400000] = js.native
  /**
    * H.265 Level.
    */
  var CodecLevel: js.UndefOr[H265CodecLevel] = js.native
  /**
    * Represents the Profile and Tier, per the HEVC (H.265) specification. Selections are grouped as [Profile] / [Tier], so "Main/High" represents Main Profile with High Tier. 4:2:2 profiles are only available with the HEVC 4:2:2 License.
    */
  var CodecProfile: js.UndefOr[H265CodecProfile] = js.native
  /**
    * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
    */
  var DynamicSubGop: js.UndefOr[H265DynamicSubGop] = js.native
  /**
    * Adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
    */
  var FlickerAdaptiveQuantization: js.UndefOr[H265FlickerAdaptiveQuantization] = js.native
  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job sepecification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  var FramerateControl: js.UndefOr[H265FramerateControl] = js.native
  /**
    * When set to INTERPOLATE, produces smoother motion during frame rate conversion.
    */
  var FramerateConversionAlgorithm: js.UndefOr[H265FramerateConversionAlgorithm] = js.native
  /**
    * Frame rate denominator.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Frame rate numerator - frame rate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
    */
  var FramerateNumerator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * If enable, use reference B frames for GOP structures that have B frames > 1.
    */
  var GopBReference: js.UndefOr[H265GopBReference] = js.native
  /**
    * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output segmenting.
    */
  var GopClosedCadence: js.UndefOr[integerMin0Max2147483647] = js.native
  /**
    * GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
    */
  var GopSize: js.UndefOr[doubleMin0] = js.native
  /**
    * Indicates if the GOP Size in H265 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
    */
  var GopSizeUnits: js.UndefOr[H265GopSizeUnits] = js.native
  /**
    * Percentage of the buffer that should initially be filled (HRD buffer model).
    */
  var HrdBufferInitialFillPercentage: js.UndefOr[integerMin0Max100] = js.native
  /**
    * Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
    */
  var HrdBufferSize: js.UndefOr[integerMin0Max1466400000] = js.native
  /**
    * Choose the scan line type for the output. Choose Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Choose Top Field First (TOP_FIELD) or Bottom Field First (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Choose Follow, Default Top (FOLLOW_TOP_FIELD) or Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) to create an interlaced output with the same field polarity as the source. If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first". If the source is progressive, your output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose. If you don't choose a value, the service will default to Progressive (PROGRESSIVE).
    */
  var InterlaceMode: js.UndefOr[H265InterlaceMode] = js.native
  /**
    * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. Required when Rate control mode is QVBR.
    */
  var MaxBitrate: js.UndefOr[integerMin1000Max1466400000] = js.native
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
  var ParControl: js.UndefOr[H265ParControl] = js.native
  /**
    * Pixel Aspect Ratio denominator.
    */
  var ParDenominator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Pixel Aspect Ratio numerator.
    */
  var ParNumerator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Use Quality tuning level (H265QualityTuningLevel) to specifiy whether to use fast single-pass, high-quality singlepass, or high-quality multipass video encoding.
    */
  var QualityTuningLevel: js.UndefOr[H265QualityTuningLevel] = js.native
  /**
    * Settings for quality-defined variable bitrate encoding with the H.265 codec. Required when you set Rate control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate control mode.
    */
  var QvbrSettings: js.UndefOr[H265QvbrSettings] = js.native
  /**
    * Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
    */
  var RateControlMode: js.UndefOr[H265RateControlMode] = js.native
  /**
    * Specify Sample Adaptive Offset (SAO) filter strength.  Adaptive mode dynamically selects best strength based on content
    */
  var SampleAdaptiveOffsetFilterMode: js.UndefOr[H265SampleAdaptiveOffsetFilterMode] = js.native
  /**
    * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default. If this output uses QVBR, choose Transition detection (TRANSITION_DETECTION) for further video quality improvement. For more information about QVBR, see https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
    */
  var SceneChangeDetect: js.UndefOr[H265SceneChangeDetect] = js.native
  /**
    * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
    */
  var Slices: js.UndefOr[integerMin1Max32] = js.native
  /**
    * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
    */
  var SlowPal: js.UndefOr[H265SlowPal] = js.native
  /**
    * Adjust quantization within each frame based on spatial variation of content complexity.
    */
  var SpatialAdaptiveQuantization: js.UndefOr[H265SpatialAdaptiveQuantization] = js.native
  /**
    * This field applies only if the Streams > Advanced > Framerate (framerate) field  is set to 29.970. This field works with the Streams > Advanced > Preprocessors > Deinterlacer  field (deinterlace_mode) and the Streams > Advanced > Interlaced Mode field (interlace_mode)  to identify the scan type for the output: Progressive, Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft: produces 23.976; the player converts this output to 29.97i.
    */
  var Telecine: js.UndefOr[H265Telecine] = js.native
  /**
    * Adjust quantization within each frame based on temporal variation of content complexity.
    */
  var TemporalAdaptiveQuantization: js.UndefOr[H265TemporalAdaptiveQuantization] = js.native
  /**
    * Enables temporal layer identifiers in the encoded bitstream. Up to 3 layers are supported depending on GOP structure: I- and P-frames form one layer, reference B-frames can form a second layer and non-reference b-frames can form a third layer. Decoders can optionally decode only the lower temporal layers to generate a lower frame rate output. For example, given a bitstream with temporal IDs and with b-frames = 1 (i.e. IbPbPb display order), a decoder could decode all the frames for full frame rate output or only the I and P frames (lowest temporal layer) for a half frame rate output.
    */
  var TemporalIds: js.UndefOr[H265TemporalIds] = js.native
  /**
    * Enable use of tiles, allowing horizontal as well as vertical subdivision of the encoded pictures.
    */
  var Tiles: js.UndefOr[H265Tiles] = js.native
  /**
    * Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
    */
  var UnregisteredSeiTimecode: js.UndefOr[H265UnregisteredSeiTimecode] = js.native
  /**
    * If the location of parameter set NAL units doesn't matter in your workflow, ignore this setting. Use this setting only with CMAF or DASH outputs, or with standalone file outputs in an MPEG-4 container (MP4 outputs). Choose HVC1 to mark your output as HVC1. This makes your output compliant with the following specification: ISO IECJTC1 SC29 N13798 Text ISO/IEC FDIS 14496-15 3rd Edition. For these outputs, the service stores parameter set NAL units in the sample headers but not in the samples directly. For MP4 outputs, when you choose HVC1, your output video might not work properly with some downstream systems and video players. The service defaults to marking your output as HEV1. For these outputs, the service writes parameter set NAL units directly into the samples.
    */
  var WriteMp4PackagingType: js.UndefOr[H265WriteMp4PackagingType] = js.native
}

object H265Settings {
  @scala.inline
  def apply(): H265Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[H265Settings]
  }
  @scala.inline
  implicit class H265SettingsOps[Self <: H265Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdaptiveQuantization(value: H265AdaptiveQuantization): Self = {
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
    def withAlternateTransferFunctionSei(value: H265AlternateTransferFunctionSei): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlternateTransferFunctionSei")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternateTransferFunctionSei: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlternateTransferFunctionSei")(js.undefined)
        ret
    }
    @scala.inline
    def withBitrate(value: integerMin1000Max1466400000): Self = {
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
    def withCodecLevel(value: H265CodecLevel): Self = {
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
    def withCodecProfile(value: H265CodecProfile): Self = {
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
    def withDynamicSubGop(value: H265DynamicSubGop): Self = {
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
    def withFlickerAdaptiveQuantization(value: H265FlickerAdaptiveQuantization): Self = {
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
    def withFramerateControl(value: H265FramerateControl): Self = {
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
    def withFramerateConversionAlgorithm(value: H265FramerateConversionAlgorithm): Self = {
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
    def withGopBReference(value: H265GopBReference): Self = {
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
    def withGopSizeUnits(value: H265GopSizeUnits): Self = {
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
    def withHrdBufferSize(value: integerMin0Max1466400000): Self = {
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
    def withInterlaceMode(value: H265InterlaceMode): Self = {
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
    def withMaxBitrate(value: integerMin1000Max1466400000): Self = {
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
    def withParControl(value: H265ParControl): Self = {
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
    def withQualityTuningLevel(value: H265QualityTuningLevel): Self = {
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
    def withQvbrSettings(value: H265QvbrSettings): Self = {
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
    def withRateControlMode(value: H265RateControlMode): Self = {
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
    def withSampleAdaptiveOffsetFilterMode(value: H265SampleAdaptiveOffsetFilterMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampleAdaptiveOffsetFilterMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleAdaptiveOffsetFilterMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampleAdaptiveOffsetFilterMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSceneChangeDetect(value: H265SceneChangeDetect): Self = {
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
    def withSlowPal(value: H265SlowPal): Self = {
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
    def withSpatialAdaptiveQuantization(value: H265SpatialAdaptiveQuantization): Self = {
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
    def withTelecine(value: H265Telecine): Self = {
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
    def withTemporalAdaptiveQuantization(value: H265TemporalAdaptiveQuantization): Self = {
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
    def withTemporalIds(value: H265TemporalIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemporalIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemporalIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemporalIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTiles(value: H265Tiles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tiles")(js.undefined)
        ret
    }
    @scala.inline
    def withUnregisteredSeiTimecode(value: H265UnregisteredSeiTimecode): Self = {
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
    @scala.inline
    def withWriteMp4PackagingType(value: H265WriteMp4PackagingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WriteMp4PackagingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteMp4PackagingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WriteMp4PackagingType")(js.undefined)
        ret
    }
  }
  
}

