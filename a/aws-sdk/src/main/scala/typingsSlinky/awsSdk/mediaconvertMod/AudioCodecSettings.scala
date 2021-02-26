package typingsSlinky.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioCodecSettings extends StObject {
  
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
    * Required when you set Codec, under AudioDescriptions>CodecSettings, to the value OPUS.
    */
  var OpusSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.OpusSettings] = js.native
  
  /**
    * Required when you set Codec, under AudioDescriptions>CodecSettings, to the value Vorbis.
    */
  var VorbisSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.VorbisSettings] = js.native
  
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
  implicit class AudioCodecSettingsMutableBuilder[Self <: AudioCodecSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAacSettings(value: AacSettings): Self = StObject.set(x, "AacSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAacSettingsUndefined: Self = StObject.set(x, "AacSettings", js.undefined)
    
    @scala.inline
    def setAc3Settings(value: Ac3Settings): Self = StObject.set(x, "Ac3Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAc3SettingsUndefined: Self = StObject.set(x, "Ac3Settings", js.undefined)
    
    @scala.inline
    def setAiffSettings(value: AiffSettings): Self = StObject.set(x, "AiffSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAiffSettingsUndefined: Self = StObject.set(x, "AiffSettings", js.undefined)
    
    @scala.inline
    def setCodec(value: AudioCodec): Self = StObject.set(x, "Codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecUndefined: Self = StObject.set(x, "Codec", js.undefined)
    
    @scala.inline
    def setEac3AtmosSettings(value: Eac3AtmosSettings): Self = StObject.set(x, "Eac3AtmosSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEac3AtmosSettingsUndefined: Self = StObject.set(x, "Eac3AtmosSettings", js.undefined)
    
    @scala.inline
    def setEac3Settings(value: Eac3Settings): Self = StObject.set(x, "Eac3Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEac3SettingsUndefined: Self = StObject.set(x, "Eac3Settings", js.undefined)
    
    @scala.inline
    def setMp2Settings(value: Mp2Settings): Self = StObject.set(x, "Mp2Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMp2SettingsUndefined: Self = StObject.set(x, "Mp2Settings", js.undefined)
    
    @scala.inline
    def setMp3Settings(value: Mp3Settings): Self = StObject.set(x, "Mp3Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMp3SettingsUndefined: Self = StObject.set(x, "Mp3Settings", js.undefined)
    
    @scala.inline
    def setOpusSettings(value: OpusSettings): Self = StObject.set(x, "OpusSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpusSettingsUndefined: Self = StObject.set(x, "OpusSettings", js.undefined)
    
    @scala.inline
    def setVorbisSettings(value: VorbisSettings): Self = StObject.set(x, "VorbisSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVorbisSettingsUndefined: Self = StObject.set(x, "VorbisSettings", js.undefined)
    
    @scala.inline
    def setWavSettings(value: WavSettings): Self = StObject.set(x, "WavSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWavSettingsUndefined: Self = StObject.set(x, "WavSettings", js.undefined)
  }
}
