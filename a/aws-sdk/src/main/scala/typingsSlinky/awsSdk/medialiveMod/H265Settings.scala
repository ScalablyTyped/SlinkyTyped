package typingsSlinky.awsSdk.medialiveMod

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
    * Indicates that AFD values will be written into the output stream.  If afdSignaling is "auto", the system will try to preserve the input AFD value (in cases where multiple AFD values are valid). If set to "fixed", the AFD value will be the value configured in the fixedAfd parameter.
    */
  var AfdSignaling: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.AfdSignaling] = js.native
  /**
    * Whether or not EML should insert an Alternative Transfer Function SEI message to support backwards compatibility with non-HDR decoders and displays.
    */
  var AlternativeTransferFunction: js.UndefOr[H265AlternativeTransferFunction] = js.native
  /**
    * Average bitrate in bits/second. Required when the rate control mode is VBR or CBR. Not used for QVBR. In an MS Smooth output group, each output must have a unique value when its bitrate is rounded down to the nearest multiple of 1000.
    */
  var Bitrate: js.UndefOr[integerMin100000Max40000000] = js.native
  /**
    * Size of buffer (HRD buffer model) in bits.
    */
  var BufSize: js.UndefOr[integerMin100000Max80000000] = js.native
  /**
    * Includes colorspace metadata in the output.
    */
  var ColorMetadata: js.UndefOr[H265ColorMetadata] = js.native
  /**
    * Color Space settings
    */
  var ColorSpaceSettings: js.UndefOr[H265ColorSpaceSettings] = js.native
  /**
    * Four bit AFD value to write on all frames of video in the output stream. Only valid when afdSignaling is set to 'Fixed'.
    */
  var FixedAfd: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.FixedAfd] = js.native
  /**
    * If set to enabled, adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
    */
  var FlickerAq: js.UndefOr[H265FlickerAq] = js.native
  /**
    * Framerate denominator.
    */
  var FramerateDenominator: integerMin1Max3003 = js.native
  /**
    * Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
    */
  var FramerateNumerator: integerMin1 = js.native
  /**
    * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output segmenting.
    */
  var GopClosedCadence: js.UndefOr[integerMin0] = js.native
  /**
    * GOP size (keyframe interval) in units of either frames or seconds per gopSizeUnits.
  If gopSizeUnits is frames, gopSize must be an integer and must be greater than or equal to 1.
  If gopSizeUnits is seconds, gopSize must be greater than 0, but need not be an integer.
    */
  var GopSize: js.UndefOr[double] = js.native
  /**
    * Indicates if the gopSize is specified in frames or seconds. If seconds the system will convert the gopSize into a frame count at run time.
    */
  var GopSizeUnits: js.UndefOr[H265GopSizeUnits] = js.native
  /**
    * H.265 Level.
    */
  var Level: js.UndefOr[H265Level] = js.native
  /**
    * Amount of lookahead. A value of low can decrease latency and memory usage, while high can produce better quality for certain content.
    */
  var LookAheadRateControl: js.UndefOr[H265LookAheadRateControl] = js.native
  /**
    * For QVBR: See the tooltip for Quality level
    */
  var MaxBitrate: js.UndefOr[integerMin100000Max40000000] = js.native
  /**
    * Only meaningful if sceneChangeDetect is set to enabled.  Defaults to 5 if multiplex rate control is used.  Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the next GOP. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
    */
  var MinIInterval: js.UndefOr[integerMin0Max30] = js.native
  /**
    * Pixel Aspect Ratio denominator.
    */
  var ParDenominator: js.UndefOr[integerMin1] = js.native
  /**
    * Pixel Aspect Ratio numerator.
    */
  var ParNumerator: js.UndefOr[integerMin1] = js.native
  /**
    * H.265 Profile.
    */
  var Profile: js.UndefOr[H265Profile] = js.native
  /**
    * Controls the target quality for the video encode. Applies only when the rate control mode is QVBR. Set values for the QVBR quality level field and Max bitrate field that suit your most important viewing devices. Recommended values are:
  - Primary screen: Quality level: 8 to 10. Max bitrate: 4M
  - PC or tablet: Quality level: 7. Max bitrate: 1.5M to 3M
  - Smartphone: Quality level: 6. Max bitrate: 1M to 1.5M
    */
  var QvbrQualityLevel: js.UndefOr[integerMin1Max10] = js.native
  /**
    * Rate control mode.
  QVBR: Quality will match the specified quality level except when it is constrained by the
  maximum bitrate.  Recommended if you or your viewers pay for bandwidth.
  CBR: Quality varies, depending on the video complexity. Recommended only if you distribute
  your assets to devices that cannot handle variable bitrates.
    */
  var RateControlMode: js.UndefOr[H265RateControlMode] = js.native
  /**
    * Sets the scan type of the output to progressive or top-field-first interlaced.
    */
  var ScanType: js.UndefOr[H265ScanType] = js.native
  /**
    * Scene change detection.
    */
  var SceneChangeDetect: js.UndefOr[H265SceneChangeDetect] = js.native
  /**
    * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
  This field is optional; when no value is specified the encoder will choose the number of slices based on encode resolution.
    */
  var Slices: js.UndefOr[integerMin1Max16] = js.native
  /**
    * H.265 Tier.
    */
  var Tier: js.UndefOr[H265Tier] = js.native
  /**
    * Determines how timecodes should be inserted into the video elementary stream.
  - 'disabled': Do not include timecodes
  - 'picTimingSei': Pass through picture timing SEI messages from the source specified in Timecode Config
    */
  var TimecodeInsertion: js.UndefOr[H265TimecodeInsertionBehavior] = js.native
}

object H265Settings {
  @scala.inline
  def apply(FramerateDenominator: integerMin1Max3003, FramerateNumerator: integerMin1): H265Settings = {
    val __obj = js.Dynamic.literal(FramerateDenominator = FramerateDenominator.asInstanceOf[js.Any], FramerateNumerator = FramerateNumerator.asInstanceOf[js.Any])
    __obj.asInstanceOf[H265Settings]
  }
  @scala.inline
  implicit class H265SettingsOps[Self <: H265Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFramerateDenominator(value: integerMin1Max3003): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FramerateDenominator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFramerateNumerator(value: integerMin1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FramerateNumerator")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withAlternativeTransferFunction(value: H265AlternativeTransferFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlternativeTransferFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternativeTransferFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlternativeTransferFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withBitrate(value: integerMin100000Max40000000): Self = {
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
    def withBufSize(value: integerMin100000Max80000000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BufSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BufSize")(js.undefined)
        ret
    }
    @scala.inline
    def withColorMetadata(value: H265ColorMetadata): Self = {
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
    def withColorSpaceSettings(value: H265ColorSpaceSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorSpaceSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorSpaceSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorSpaceSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedAfd(value: FixedAfd): Self = {
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
    def withFlickerAq(value: H265FlickerAq): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlickerAq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlickerAq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlickerAq")(js.undefined)
        ret
    }
    @scala.inline
    def withGopClosedCadence(value: integerMin0): Self = {
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
    def withGopSize(value: double): Self = {
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
    def withLevel(value: H265Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Level")(js.undefined)
        ret
    }
    @scala.inline
    def withLookAheadRateControl(value: H265LookAheadRateControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LookAheadRateControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookAheadRateControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LookAheadRateControl")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBitrate(value: integerMin100000Max40000000): Self = {
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
    def withParDenominator(value: integerMin1): Self = {
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
    def withParNumerator(value: integerMin1): Self = {
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
    def withProfile(value: H265Profile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Profile")(js.undefined)
        ret
    }
    @scala.inline
    def withQvbrQualityLevel(value: integerMin1Max10): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QvbrQualityLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQvbrQualityLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QvbrQualityLevel")(js.undefined)
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
    def withScanType(value: H265ScanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScanType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScanType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScanType")(js.undefined)
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
    def withSlices(value: integerMin1Max16): Self = {
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
    def withTier(value: H265Tier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tier")(js.undefined)
        ret
    }
    @scala.inline
    def withTimecodeInsertion(value: H265TimecodeInsertionBehavior): Self = {
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
  }
  
}

