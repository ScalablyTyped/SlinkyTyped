package typingsSlinky.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VorbisSettings extends StObject {
  
  /**
    * Optional. Specify the number of channels in this output audio track. Choosing Mono on the console gives you 1 output channel; choosing Stereo gives you 2. In the API, valid values are 1 and 2. The default value is 2.
    */
  var Channels: js.UndefOr[integerMin1Max2] = js.native
  
  /**
    * Optional. Specify the audio sample rate in Hz. Valid values are 22050, 32000, 44100, and 48000. The default value is 48000.
    */
  var SampleRate: js.UndefOr[integerMin22050Max48000] = js.native
  
  /**
    * Optional. Specify the variable audio quality of this Vorbis output from -1 (lowest quality, ~45 kbit/s) to 10 (highest quality, ~500 kbit/s). The default value is 4 (~128 kbit/s). Values 5 and 6 are approximately 160 and 192 kbit/s, respectively.
    */
  var VbrQuality: js.UndefOr[integerMinNegative1Max10] = js.native
}
object VorbisSettings {
  
  @scala.inline
  def apply(): VorbisSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VorbisSettings]
  }
  
  @scala.inline
  implicit class VorbisSettingsMutableBuilder[Self <: VorbisSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: integerMin1Max2): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    @scala.inline
    def setSampleRate(value: integerMin22050Max48000): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
    
    @scala.inline
    def setVbrQuality(value: integerMinNegative1Max10): Self = StObject.set(x, "VbrQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVbrQualityUndefined: Self = StObject.set(x, "VbrQuality", js.undefined)
  }
}
