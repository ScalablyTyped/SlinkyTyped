package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AacSettings extends js.Object {
  /**
    * Average bitrate in bits/second. Valid values depend on rate control mode and profile.
    */
  var Bitrate: js.UndefOr[double] = js.native
  /**
    * Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. The adReceiverMix setting receives a stereo description plus control track and emits a mono AAC encode of the description track, with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
    */
  var CodingMode: js.UndefOr[AacCodingMode] = js.native
  /**
    * Set to "broadcasterMixedAd" when input contains pre-mixed main audio + AD (narration) as a stereo pair.  The Audio Type field (audioType) will be set to 3, which signals to downstream systems that this stream contains "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does not perform the mixing. The values in audioTypeControl and audioType (in AudioDescription) are ignored when set to broadcasterMixedAd.
  Leave set to "normal" when input does not contain pre-mixed audio + AD.
    */
  var InputType: js.UndefOr[AacInputType] = js.native
  /**
    * AAC Profile.
    */
  var Profile: js.UndefOr[AacProfile] = js.native
  /**
    * Rate Control Mode.
    */
  var RateControlMode: js.UndefOr[AacRateControlMode] = js.native
  /**
    * Sets LATM / LOAS AAC output for raw containers.
    */
  var RawFormat: js.UndefOr[AacRawFormat] = js.native
  /**
    * Sample rate in Hz. Valid values depend on rate control mode and profile.
    */
  var SampleRate: js.UndefOr[double] = js.native
  /**
    * Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
    */
  var Spec: js.UndefOr[AacSpec] = js.native
  /**
    * VBR Quality Level - Only used if rateControlMode is VBR.
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
    def withBitrate(value: double): Self = {
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
    def withInputType(value: AacInputType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputType")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: AacProfile): Self = {
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
    def withSampleRate(value: double): Self = {
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
    def withSpec(value: AacSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Spec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Spec")(js.undefined)
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

