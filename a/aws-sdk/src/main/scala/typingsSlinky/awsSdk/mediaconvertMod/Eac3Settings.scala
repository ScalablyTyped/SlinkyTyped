package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Eac3Settings extends js.Object {
  /**
    * If set to ATTENUATE_3_DB, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding mode.
    */
  var AttenuationControl: js.UndefOr[Eac3AttenuationControl] = js.native
  /**
    * Specify the average bitrate in bits per second. Valid bitrates depend on the coding mode.
    */
  var Bitrate: js.UndefOr[integerMin64000Max640000] = js.native
  /**
    * Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
    */
  var BitstreamMode: js.UndefOr[Eac3BitstreamMode] = js.native
  /**
    * Dolby Digital Plus coding mode. Determines number of channels.
    */
  var CodingMode: js.UndefOr[Eac3CodingMode] = js.native
  /**
    * Activates a DC highpass filter for all input channels.
    */
  var DcFilter: js.UndefOr[Eac3DcFilter] = js.native
  /**
    * Sets the dialnorm for the output. If blank and input audio is Dolby Digital Plus, dialnorm will be passed through.
    */
  var Dialnorm: js.UndefOr[integerMin1Max31] = js.native
  /**
    * Specify the absolute peak level for a signal with dynamic range compression.
    */
  var DynamicRangeCompressionLine: js.UndefOr[Eac3DynamicRangeCompressionLine] = js.native
  /**
    * Specify how the service limits the audio dynamic range when compressing the audio.
    */
  var DynamicRangeCompressionRf: js.UndefOr[Eac3DynamicRangeCompressionRf] = js.native
  /**
    * When encoding 3/2 audio, controls whether the LFE channel is enabled
    */
  var LfeControl: js.UndefOr[Eac3LfeControl] = js.native
  /**
    * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
    */
  var LfeFilter: js.UndefOr[Eac3LfeFilter] = js.native
  /**
    * Specify a value for the following Dolby Digital Plus setting: Left only/Right only center mix (Lo/Ro center). MediaConvert uses this value for downmixing. How the service uses this value depends on the value that you choose for Stereo downmix (Eac3StereoDownmix). Valid values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel. This setting applies only if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you choose a different value for Coding mode, the service ignores Left only/Right only center (loRoCenterMixLevel).
    */
  var LoRoCenterMixLevel: js.UndefOr[doubleMinNegative60Max3] = js.native
  /**
    * Specify a value for the following Dolby Digital Plus setting: Left only/Right only (Lo/Ro surround). MediaConvert uses this value for downmixing. How the service uses this value depends on the value that you choose for Stereo downmix (Eac3StereoDownmix). Valid values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel. This setting applies only if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you choose a different value for Coding mode, the service ignores Left only/Right only surround (loRoSurroundMixLevel).
    */
  var LoRoSurroundMixLevel: js.UndefOr[doubleMinNegative60MaxNegative1] = js.native
  /**
    * Specify a value for the following Dolby Digital Plus setting: Left total/Right total center mix (Lt/Rt center). MediaConvert uses this value for downmixing. How the service uses this value depends on the value that you choose for Stereo downmix (Eac3StereoDownmix). Valid values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel. This setting applies only if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you choose a different value for Coding mode, the service ignores Left total/Right total center (ltRtCenterMixLevel).
    */
  var LtRtCenterMixLevel: js.UndefOr[doubleMinNegative60Max3] = js.native
  /**
    * Specify a value for the following Dolby Digital Plus setting: Left total/Right total surround mix (Lt/Rt surround). MediaConvert uses this value for downmixing. How the service uses this value depends on the value that you choose for Stereo downmix (Eac3StereoDownmix). Valid values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel. This setting applies only if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you choose a different value for Coding mode, the service ignores Left total/Right total surround (ltRtSurroundMixLevel).
    */
  var LtRtSurroundMixLevel: js.UndefOr[doubleMinNegative60MaxNegative1] = js.native
  /**
    * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
    */
  var MetadataControl: js.UndefOr[Eac3MetadataControl] = js.native
  /**
    * When set to WHEN_POSSIBLE, input DD+ audio will be passed through if it is present on the input. this detection is dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content will have a consistent DD+ output as the system alternates between passthrough and encoding.
    */
  var PassthroughControl: js.UndefOr[Eac3PassthroughControl] = js.native
  /**
    * Controls the amount of phase-shift applied to the surround channels. Only used for 3/2 coding mode.
    */
  var PhaseControl: js.UndefOr[Eac3PhaseControl] = js.native
  /**
    * This value is always 48000. It represents the sample rate in Hz.
    */
  var SampleRate: js.UndefOr[integerMin48000Max48000] = js.native
  /**
    * Choose how the service does stereo downmixing. This setting only applies if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you choose a different value for Coding mode, the service ignores Stereo downmix (Eac3StereoDownmix).
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
    def withBitrate(value: integerMin64000Max640000): Self = {
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
    def withDynamicRangeCompressionLine(value: Eac3DynamicRangeCompressionLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DynamicRangeCompressionLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicRangeCompressionLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DynamicRangeCompressionLine")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicRangeCompressionRf(value: Eac3DynamicRangeCompressionRf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DynamicRangeCompressionRf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicRangeCompressionRf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DynamicRangeCompressionRf")(js.undefined)
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
    def withLoRoCenterMixLevel(value: doubleMinNegative60Max3): Self = {
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
    def withLoRoSurroundMixLevel(value: doubleMinNegative60MaxNegative1): Self = {
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
    def withLtRtCenterMixLevel(value: doubleMinNegative60Max3): Self = {
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
    def withLtRtSurroundMixLevel(value: doubleMinNegative60MaxNegative1): Self = {
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
    def withSampleRate(value: integerMin48000Max48000): Self = {
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

