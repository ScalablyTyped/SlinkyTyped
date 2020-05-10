package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Eac3AtmosSettings extends js.Object {
  /**
    * Specify the average bitrate in bits per second.
  Valid values: 384k, 448k, 640k, 768k
    */
  var Bitrate: js.UndefOr[integerMin384000Max768000] = js.native
  /**
    * Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
    */
  var BitstreamMode: js.UndefOr[Eac3AtmosBitstreamMode] = js.native
  /**
    * The coding mode for Dolby Digital Plus JOC (Atmos) is always 9.1.6 (CODING_MODE_9_1_6).
    */
  var CodingMode: js.UndefOr[Eac3AtmosCodingMode] = js.native
  /**
    * Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue analysis.
    */
  var DialogueIntelligence: js.UndefOr[Eac3AtmosDialogueIntelligence] = js.native
  /**
    * Specify the absolute peak level for a signal with dynamic range compression.
    */
  var DynamicRangeCompressionLine: js.UndefOr[Eac3AtmosDynamicRangeCompressionLine] = js.native
  /**
    * Specify how the service limits the audio dynamic range when compressing the audio.
    */
  var DynamicRangeCompressionRf: js.UndefOr[Eac3AtmosDynamicRangeCompressionRf] = js.native
  /**
    * Specify a value for the following Dolby Atmos setting: Left only/Right only center mix
  (Lo/Ro center). MediaConvert uses this value for downmixing. How the service uses this
  value depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix).
  Valid values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0.
    */
  var LoRoCenterMixLevel: js.UndefOr[doubleMinNegative6Max3] = js.native
  /**
    * Specify a value for the following Dolby Atmos setting: Left only/Right only (Lo/Ro surround). MediaConvert uses this value for downmixing. How the service uses this value depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Valid values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel.
    */
  var LoRoSurroundMixLevel: js.UndefOr[doubleMinNegative60MaxNegative1] = js.native
  /**
    * Specify a value for the following Dolby Atmos setting: Left total/Right total center mix (Lt/Rt center). MediaConvert uses this value for downmixing. How the service uses this value depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Valid values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0.
    */
  var LtRtCenterMixLevel: js.UndefOr[doubleMinNegative6Max3] = js.native
  /**
    * Specify a value for the following Dolby Atmos setting: Left total/Right total surround mix (Lt/Rt surround). MediaConvert uses this value for downmixing. How the service uses this value depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Valid values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel.
    */
  var LtRtSurroundMixLevel: js.UndefOr[doubleMinNegative60MaxNegative1] = js.native
  /**
    * Choose how the service meters the loudness of your audio.
    */
  var MeteringMode: js.UndefOr[Eac3AtmosMeteringMode] = js.native
  /**
    * This value is always 48000. It represents the sample rate in Hz.
    */
  var SampleRate: js.UndefOr[integerMin48000Max48000] = js.native
  /**
    * Specify the percentage of audio content that must be speech before the encoder uses the measured speech loudness as the overall program loudness.
    */
  var SpeechThreshold: js.UndefOr[integerMin1Max100] = js.native
  /**
    * Choose how the service does stereo downmixing.
    */
  var StereoDownmix: js.UndefOr[Eac3AtmosStereoDownmix] = js.native
  /**
    * Specify whether your input audio has an additional center rear surround channel matrix encoded into your left and right surround channels.
    */
  var SurroundExMode: js.UndefOr[Eac3AtmosSurroundExMode] = js.native
}

object Eac3AtmosSettings {
  @scala.inline
  def apply(): Eac3AtmosSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Eac3AtmosSettings]
  }
  @scala.inline
  implicit class Eac3AtmosSettingsOps[Self <: Eac3AtmosSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitrate(value: integerMin384000Max768000): Self = {
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
    def withBitstreamMode(value: Eac3AtmosBitstreamMode): Self = {
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
    def withCodingMode(value: Eac3AtmosCodingMode): Self = {
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
    def withDialogueIntelligence(value: Eac3AtmosDialogueIntelligence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DialogueIntelligence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogueIntelligence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DialogueIntelligence")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicRangeCompressionLine(value: Eac3AtmosDynamicRangeCompressionLine): Self = {
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
    def withDynamicRangeCompressionRf(value: Eac3AtmosDynamicRangeCompressionRf): Self = {
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
    def withLoRoCenterMixLevel(value: doubleMinNegative6Max3): Self = {
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
    def withLtRtCenterMixLevel(value: doubleMinNegative6Max3): Self = {
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
    def withMeteringMode(value: Eac3AtmosMeteringMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeteringMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeteringMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeteringMode")(js.undefined)
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
    def withSpeechThreshold(value: integerMin1Max100): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpeechThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeechThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpeechThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withStereoDownmix(value: Eac3AtmosStereoDownmix): Self = {
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
    def withSurroundExMode(value: Eac3AtmosSurroundExMode): Self = {
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
  }
  
}

