package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioCodecSettings extends js.Object {
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AAC. The service accepts one of two mutually exclusive groups of AAC settings--VBR and CBR. To select one of these modes, set the value of Bitrate control mode (rateControlMode) to "VBR" or "CBR".  In VBR mode, you control the audio quality with the setting VBR quality (vbrQuality). In CBR mode, you use the setting Bitrate (bitrate). Defaults and valid values depend on the rate control mode.
    */
  var AacSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.AacSettings] = js.native
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AC3.
    */
  var Ac3Settings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.Ac3Settings] = js.native
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AIFF.
    */
  var AiffSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.AiffSettings] = js.native
  /**
    * Type of Audio codec.
    */
  var Codec: js.UndefOr[AudioCodec] = js.native
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value EAC3_ATMOS.
    */
  var Eac3AtmosSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.Eac3AtmosSettings] = js.native
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value EAC3.
    */
  var Eac3Settings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.Eac3Settings] = js.native
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value MP2.
    */
  var Mp2Settings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.Mp2Settings] = js.native
  /**
    * Required when you set Codec, under AudioDescriptions>CodecSettings, to the value MP3.
    */
  var Mp3Settings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.Mp3Settings] = js.native
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value WAV.
    */
  var WavSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.WavSettings] = js.native
}

object AudioCodecSettings {
  @scala.inline
  def apply(): AudioCodecSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioCodecSettings]
  }
  @scala.inline
  implicit class AudioCodecSettingsOps[Self <: AudioCodecSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAacSettings(value: AacSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AacSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAacSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AacSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withAc3Settings(value: Ac3Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ac3Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAc3Settings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ac3Settings")(js.undefined)
        ret
    }
    @scala.inline
    def withAiffSettings(value: AiffSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AiffSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAiffSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AiffSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withCodec(value: AudioCodec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Codec")(js.undefined)
        ret
    }
    @scala.inline
    def withEac3AtmosSettings(value: Eac3AtmosSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Eac3AtmosSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEac3AtmosSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Eac3AtmosSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withEac3Settings(value: Eac3Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Eac3Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEac3Settings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Eac3Settings")(js.undefined)
        ret
    }
    @scala.inline
    def withMp2Settings(value: Mp2Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mp2Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMp2Settings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mp2Settings")(js.undefined)
        ret
    }
    @scala.inline
    def withMp3Settings(value: Mp3Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mp3Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMp3Settings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mp3Settings")(js.undefined)
        ret
    }
    @scala.inline
    def withWavSettings(value: WavSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WavSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWavSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WavSettings")(js.undefined)
        ret
    }
  }
  
}

