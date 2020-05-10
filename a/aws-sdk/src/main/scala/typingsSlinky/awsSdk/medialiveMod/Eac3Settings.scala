package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Eac3Settings extends js.Object {
  /**
    * When set to attenuate3Db, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding mode.
    */
  var AttenuationControl: js.UndefOr[Eac3AttenuationControl] = js.native
  /**
    * Average bitrate in bits/second. Valid bitrates depend on the coding mode.
    */
  var Bitrate: js.UndefOr[double] = js.native
  /**
    * Specifies the bitstream mode (bsmod) for the emitted E-AC-3 stream. See ATSC A/52-2012 (Annex E) for background on these values.
    */
  var BitstreamMode: js.UndefOr[Eac3BitstreamMode] = js.native
  /**
    * Dolby Digital Plus coding mode. Determines number of channels.
    */
  var CodingMode: js.UndefOr[Eac3CodingMode] = js.native
  /**
    * When set to enabled, activates a DC highpass filter for all input channels.
    */
  var DcFilter: js.UndefOr[Eac3DcFilter] = js.native
  /**
    * Sets the dialnorm for the output. If blank and input audio is Dolby Digital Plus, dialnorm will be passed through.
    */
  var Dialnorm: js.UndefOr[integerMin1Max31] = js.native
  /**
    * Sets the Dolby dynamic range compression profile.
    */
  var DrcLine: js.UndefOr[Eac3DrcLine] = js.native
  /**
    * Sets the profile for heavy Dolby dynamic range compression, ensures that the instantaneous signal peaks do not exceed specified levels.
    */
  var DrcRf: js.UndefOr[Eac3DrcRf] = js.native
  /**
    * When encoding 3/2 audio, setting to lfe enables the LFE channel
    */
  var LfeControl: js.UndefOr[Eac3LfeControl] = js.native
  /**
    * When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with codingMode32 coding mode.
    */
  var LfeFilter: js.UndefOr[Eac3LfeFilter] = js.native
  /**
    * Left only/Right only center mix level. Only used for 3/2 coding mode.
    */
  var LoRoCenterMixLevel: js.UndefOr[double] = js.native
  /**
    * Left only/Right only surround mix level. Only used for 3/2 coding mode.
    */
  var LoRoSurroundMixLevel: js.UndefOr[double] = js.native
  /**
    * Left total/Right total center mix level. Only used for 3/2 coding mode.
    */
  var LtRtCenterMixLevel: js.UndefOr[double] = js.native
  /**
    * Left total/Right total surround mix level. Only used for 3/2 coding mode.
    */
  var LtRtSurroundMixLevel: js.UndefOr[double] = js.native
  /**
    * When set to followInput, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
    */
  var MetadataControl: js.UndefOr[Eac3MetadataControl] = js.native
  /**
    * When set to whenPossible, input DD+ audio will be passed through if it is present on the input. This detection is dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content will have a consistent DD+ output as the system alternates between passthrough and encoding.
    */
  var PassthroughControl: js.UndefOr[Eac3PassthroughControl] = js.native
  /**
    * When set to shift90Degrees, applies a 90-degree phase shift to the surround channels. Only used for 3/2 coding mode.
    */
  var PhaseControl: js.UndefOr[Eac3PhaseControl] = js.native
  /**
    * Stereo downmix preference. Only used for 3/2 coding mode.
    */
  var StereoDownmix: js.UndefOr[Eac3StereoDownmix] = js.native
  /**
    * When encoding 3/2 audio, sets whether an extra center back surround channel is matrix encoded into the left and right surround channels.
    */
  var SurroundExMode: js.UndefOr[Eac3SurroundExMode] = js.native
  /**
    * When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded into the two channels.
    */
  var SurroundMode: js.UndefOr[Eac3SurroundMode] = js.native
}

object Eac3Settings {
  @scala.inline
  def apply(): Eac3Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Eac3Settings]
  }
  @scala.inline
  implicit class Eac3SettingsOps[Self <: Eac3Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttenuationControl(value: Eac3AttenuationControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttenuationControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttenuationControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttenuationControl")(js.undefined)
        ret
    }
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
    def withBitstreamMode(value: Eac3BitstreamMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BitstreamMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitstreamMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BitstreamMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCodingMode(value: Eac3CodingMode): Self = {
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
    def withDcFilter(value: Eac3DcFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DcFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDcFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DcFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withDialnorm(value: integerMin1Max31): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dialnorm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialnorm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dialnorm")(js.undefined)
        ret
    }
    @scala.inline
    def withDrcLine(value: Eac3DrcLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DrcLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrcLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DrcLine")(js.undefined)
        ret
    }
    @scala.inline
    def withDrcRf(value: Eac3DrcRf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DrcRf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrcRf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DrcRf")(js.undefined)
        ret
    }
    @scala.inline
    def withLfeControl(value: Eac3LfeControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LfeControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLfeControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LfeControl")(js.undefined)
        ret
    }
    @scala.inline
    def withLfeFilter(value: Eac3LfeFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LfeFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLfeFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LfeFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withLoRoCenterMixLevel(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoRoCenterMixLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoRoCenterMixLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoRoCenterMixLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLoRoSurroundMixLevel(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoRoSurroundMixLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoRoSurroundMixLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoRoSurroundMixLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLtRtCenterMixLevel(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LtRtCenterMixLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLtRtCenterMixLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LtRtCenterMixLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLtRtSurroundMixLevel(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LtRtSurroundMixLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLtRtSurroundMixLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LtRtSurroundMixLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataControl(value: Eac3MetadataControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetadataControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadataControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetadataControl")(js.undefined)
        ret
    }
    @scala.inline
    def withPassthroughControl(value: Eac3PassthroughControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PassthroughControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassthroughControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PassthroughControl")(js.undefined)
        ret
    }
    @scala.inline
    def withPhaseControl(value: Eac3PhaseControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhaseControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhaseControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhaseControl")(js.undefined)
        ret
    }
    @scala.inline
    def withStereoDownmix(value: Eac3StereoDownmix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StereoDownmix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStereoDownmix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StereoDownmix")(js.undefined)
        ret
    }
    @scala.inline
    def withSurroundExMode(value: Eac3SurroundExMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SurroundExMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSurroundExMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SurroundExMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSurroundMode(value: Eac3SurroundMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SurroundMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSurroundMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SurroundMode")(js.undefined)
        ret
    }
  }
  
}

