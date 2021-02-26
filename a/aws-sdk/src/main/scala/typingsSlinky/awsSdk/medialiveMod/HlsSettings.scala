package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HlsSettings extends StObject {
  
  var AudioOnlyHlsSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.AudioOnlyHlsSettings] = js.native
  
  var Fmp4HlsSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Fmp4HlsSettings] = js.native
  
  var StandardHlsSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.StandardHlsSettings] = js.native
}
object HlsSettings {
  
  @scala.inline
  def apply(): HlsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsSettings]
  }
  
  @scala.inline
  implicit class HlsSettingsMutableBuilder[Self <: HlsSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioOnlyHlsSettings(value: AudioOnlyHlsSettings): Self = StObject.set(x, "AudioOnlyHlsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioOnlyHlsSettingsUndefined: Self = StObject.set(x, "AudioOnlyHlsSettings", js.undefined)
    
    @scala.inline
    def setFmp4HlsSettings(value: Fmp4HlsSettings): Self = StObject.set(x, "Fmp4HlsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFmp4HlsSettingsUndefined: Self = StObject.set(x, "Fmp4HlsSettings", js.undefined)
    
    @scala.inline
    def setStandardHlsSettings(value: StandardHlsSettings): Self = StObject.set(x, "StandardHlsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardHlsSettingsUndefined: Self = StObject.set(x, "StandardHlsSettings", js.undefined)
  }
}
