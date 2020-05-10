package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AacSettings extends js.Object {
  /**
    * Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio + audio description (AD) as a stereo pair. The value for AudioType will be set to 3, which signals to downstream systems that this stream contains "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does not perform the mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores any values you provide in AudioType and  FollowInputAudioType. Choose NORMAL when the input does not contain pre-mixed audio + audio description (AD). In this case, the encoder will use any values you provide for AudioType and FollowInputAudioType.
    */
  var AudioDescriptionBroadcasterMix: js.UndefOr[AacAudioDescriptionBroadcasterMix] = js.native
  /**
    * Specify the average bitrate in bits per second. The set of valid values for this setting is: 6000, 8000, 10000, 12000, 14000, 16000, 20000, 24000, 28000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 384000, 448000, 512000, 576000, 640000, 768000, 896000, 1024000. The value you set is also constrained by the values that you choose for Profile (codecProfile), Bitrate control mode (codingMode), and Sample rate (sampleRate). Default values depend on Bitrate control mode and Profile.
    */
  var Bitrate: js.UndefOr[integerMin6000Max1024000] = js.native
  /**
    * AAC Profile.
    */
  var CodecProfile: js.UndefOr[AacCodecProfile] = js.native
  /**
    * Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. "1.0 - Audio Description (Receiver Mix)" setting receives a stereo description plus control track and emits a mono AAC encode of the description track, with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
    */
  var CodingMode: js.UndefOr[AacCodingMode] = js.native
  /**
    * Rate Control Mode.
    */
  var RateControlMode: js.UndefOr[AacRateControlMode] = js.native
  /**
    * Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an output, you must choose "No container" for the output container.
    */
  var RawFormat: js.UndefOr[AacRawFormat] = js.native
  /**
    * Sample rate in Hz. Valid values depend on rate control mode and profile.
    */
  var SampleRate: js.UndefOr[integerMin8000Max96000] = js.native
  /**
    * Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
    */
  var Specification: js.UndefOr[AacSpecification] = js.native
  /**
    * VBR Quality Level - Only used if rate_control_mode is VBR.
    */
  var VbrQuality: js.UndefOr[AacVbrQuality] = js.native
}

object AacSettings {
  @scala.inline
  def apply(): AacSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AacSettings]
  }
  @scala.inline
  implicit class AacSettingsOps[Self <: AacSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioDescriptionBroadcasterMix(value: AacAudioDescriptionBroadcasterMix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioDescriptionBroadcasterMix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioDescriptionBroadcasterMix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioDescriptionBroadcasterMix")(js.undefined)
        ret
    }
    @scala.inline
    def withBitrate(value: integerMin6000Max1024000): Self = {
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
    def withCodecProfile(value: AacCodecProfile): Self = {
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
    def withCodingMode(value: AacCodingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRateControlMode(value: AacRateControlMode): Self = {
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
    def withRawFormat(value: AacRawFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RawFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RawFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleRate(value: integerMin8000Max96000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampleRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampleRate")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecification(value: AacSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Specification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Specification")(js.undefined)
        ret
    }
    @scala.inline
    def withVbrQuality(value: AacVbrQuality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VbrQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVbrQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VbrQuality")(js.undefined)
        ret
    }
  }
  
}

