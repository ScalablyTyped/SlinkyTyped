package typingsSlinky.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WavSettings extends StObject {
  
  /**
    * Specify Bit depth (BitDepth), in bits per sample, to choose the encoding quality for this audio track.
    */
  var BitDepth: js.UndefOr[integerMin16Max24] = js.native
  
  /**
    * Specify the number of channels in this output audio track. Valid values are 1 and even numbers up to 64. For example, 1, 2, 4, 6, and so on, up to 64.
    */
  var Channels: js.UndefOr[integerMin1Max64] = js.native
  
  /**
    * The service defaults to using RIFF for WAV outputs. If your output audio is likely to exceed 4 GB in file size, or if you otherwise need the extended support of the RF64 format, set your output WAV file format to RF64.
    */
  var Format: js.UndefOr[WavFormat] = js.native
  
  /**
    * Sample rate in Hz.
    */
  var SampleRate: js.UndefOr[integerMin8000Max192000] = js.native
}
object WavSettings {
  
  @scala.inline
  def apply(): WavSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WavSettings]
  }
  
  @scala.inline
  implicit class WavSettingsMutableBuilder[Self <: WavSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitDepth(value: integerMin16Max24): Self = StObject.set(x, "BitDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitDepthUndefined: Self = StObject.set(x, "BitDepth", js.undefined)
    
    @scala.inline
    def setChannels(value: integerMin1Max64): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    @scala.inline
    def setFormat(value: WavFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    @scala.inline
    def setSampleRate(value: integerMin8000Max192000): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
  }
}
