package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioSelectorSettings extends StObject {
  
  var AudioLanguageSelection: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.AudioLanguageSelection] = js.native
  
  var AudioPidSelection: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.AudioPidSelection] = js.native
  
  var AudioTrackSelection: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.AudioTrackSelection] = js.native
}
object AudioSelectorSettings {
  
  @scala.inline
  def apply(): AudioSelectorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioSelectorSettings]
  }
  
  @scala.inline
  implicit class AudioSelectorSettingsMutableBuilder[Self <: AudioSelectorSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioLanguageSelection(value: AudioLanguageSelection): Self = StObject.set(x, "AudioLanguageSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioLanguageSelectionUndefined: Self = StObject.set(x, "AudioLanguageSelection", js.undefined)
    
    @scala.inline
    def setAudioPidSelection(value: AudioPidSelection): Self = StObject.set(x, "AudioPidSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioPidSelectionUndefined: Self = StObject.set(x, "AudioPidSelection", js.undefined)
    
    @scala.inline
    def setAudioTrackSelection(value: AudioTrackSelection): Self = StObject.set(x, "AudioTrackSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioTrackSelectionUndefined: Self = StObject.set(x, "AudioTrackSelection", js.undefined)
  }
}
