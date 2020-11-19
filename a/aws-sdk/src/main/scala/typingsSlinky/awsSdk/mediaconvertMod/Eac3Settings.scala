package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttenuationControl(value: Eac3AttenuationControl): Self = this.set("AttenuationControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttenuationControl: Self = this.set("AttenuationControl", js.undefined)
    
    @scala.inline
    def setBitrate(value: integerMin64000Max640000): Self = this.set("Bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitrate: Self = this.set("Bitrate", js.undefined)
    
    @scala.inline
    def setBitstreamMode(value: Eac3BitstreamMode): Self = this.set("BitstreamMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitstreamMode: Self = this.set("BitstreamMode", js.undefined)
    
    @scala.inline
    def setCodingMode(value: Eac3CodingMode): Self = this.set("CodingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodingMode: Self = this.set("CodingMode", js.undefined)
    
    @scala.inline
    def setDcFilter(value: Eac3DcFilter): Self = this.set("DcFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDcFilter: Self = this.set("DcFilter", js.undefined)
    
    @scala.inline
    def setDialnorm(value: integerMin1Max31): Self = this.set("Dialnorm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialnorm: Self = this.set("Dialnorm", js.undefined)
    
    @scala.inline
    def setDynamicRangeCompressionLine(value: Eac3DynamicRangeCompressionLine): Self = this.set("DynamicRangeCompressionLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicRangeCompressionLine: Self = this.set("DynamicRangeCompressionLine", js.undefined)
    
    @scala.inline
    def setDynamicRangeCompressionRf(value: Eac3DynamicRangeCompressionRf): Self = this.set("DynamicRangeCompressionRf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicRangeCompressionRf: Self = this.set("DynamicRangeCompressionRf", js.undefined)
    
    @scala.inline
    def setLfeControl(value: Eac3LfeControl): Self = this.set("LfeControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLfeControl: Self = this.set("LfeControl", js.undefined)
    
    @scala.inline
    def setLfeFilter(value: Eac3LfeFilter): Self = this.set("LfeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLfeFilter: Self = this.set("LfeFilter", js.undefined)
    
    @scala.inline
    def setLoRoCenterMixLevel(value: doubleMinNegative60Max3): Self = this.set("LoRoCenterMixLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoRoCenterMixLevel: Self = this.set("LoRoCenterMixLevel", js.undefined)
    
    @scala.inline
    def setLoRoSurroundMixLevel(value: doubleMinNegative60MaxNegative1): Self = this.set("LoRoSurroundMixLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoRoSurroundMixLevel: Self = this.set("LoRoSurroundMixLevel", js.undefined)
    
    @scala.inline
    def setLtRtCenterMixLevel(value: doubleMinNegative60Max3): Self = this.set("LtRtCenterMixLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLtRtCenterMixLevel: Self = this.set("LtRtCenterMixLevel", js.undefined)
    
    @scala.inline
    def setLtRtSurroundMixLevel(value: doubleMinNegative60MaxNegative1): Self = this.set("LtRtSurroundMixLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLtRtSurroundMixLevel: Self = this.set("LtRtSurroundMixLevel", js.undefined)
    
    @scala.inline
    def setMetadataControl(value: Eac3MetadataControl): Self = this.set("MetadataControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataControl: Self = this.set("MetadataControl", js.undefined)
    
    @scala.inline
    def setPassthroughControl(value: Eac3PassthroughControl): Self = this.set("PassthroughControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassthroughControl: Self = this.set("PassthroughControl", js.undefined)
    
    @scala.inline
    def setPhaseControl(value: Eac3PhaseControl): Self = this.set("PhaseControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhaseControl: Self = this.set("PhaseControl", js.undefined)
    
    @scala.inline
    def setSampleRate(value: integerMin48000Max48000): Self = this.set("SampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRate: Self = this.set("SampleRate", js.undefined)
    
    @scala.inline
    def setStereoDownmix(value: Eac3StereoDownmix): Self = this.set("StereoDownmix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStereoDownmix: Self = this.set("StereoDownmix", js.undefined)
    
    @scala.inline
    def setSurroundExMode(value: Eac3SurroundExMode): Self = this.set("SurroundExMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurroundExMode: Self = this.set("SurroundExMode", js.undefined)
    
    @scala.inline
    def setSurroundMode(value: Eac3SurroundMode): Self = this.set("SurroundMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurroundMode: Self = this.set("SurroundMode", js.undefined)
  }
}
