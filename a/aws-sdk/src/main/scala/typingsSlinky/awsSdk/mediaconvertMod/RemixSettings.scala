package typingsSlinky.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemixSettings extends StObject {
  
  /**
    * Channel mapping (ChannelMapping) contains the group of fields that hold the remixing value for each channel. Units are in dB. Acceptable values are within the range from -60 (mute) through 6. A setting of 0 passes the input channel unchanged to the output channel (no attenuation or amplification).
    */
  var ChannelMapping: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.ChannelMapping] = js.native
  
  /**
    * Specify the number of audio channels from your input that you want to use in your output. With remixing, you might combine or split the data in these channels, so the number of channels in your final output might be different.
    */
  var ChannelsIn: js.UndefOr[integerMin1Max64] = js.native
  
  /**
    * Specify the number of channels in this output after remixing. Valid values: 1, 2, 4, 6, 8... 64. (1 and even numbers to 64.)
    */
  var ChannelsOut: js.UndefOr[integerMin1Max64] = js.native
}
object RemixSettings {
  
  @scala.inline
  def apply(): RemixSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemixSettings]
  }
  
  @scala.inline
  implicit class RemixSettingsMutableBuilder[Self <: RemixSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelMapping(value: ChannelMapping): Self = StObject.set(x, "ChannelMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelMappingUndefined: Self = StObject.set(x, "ChannelMapping", js.undefined)
    
    @scala.inline
    def setChannelsIn(value: integerMin1Max64): Self = StObject.set(x, "ChannelsIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsInUndefined: Self = StObject.set(x, "ChannelsIn", js.undefined)
    
    @scala.inline
    def setChannelsOut(value: integerMin1Max64): Self = StObject.set(x, "ChannelsOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsOutUndefined: Self = StObject.set(x, "ChannelsOut", js.undefined)
  }
}
