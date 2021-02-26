package typingsSlinky.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mp3Settings extends StObject {
  
  /**
    * Specify the average bitrate in bits per second.
    */
  var Bitrate: js.UndefOr[integerMin16000Max320000] = js.native
  
  /**
    * Specify the number of channels in this output audio track. Choosing Mono on the console gives you 1 output channel; choosing Stereo gives you 2. In the API, valid values are 1 and 2.
    */
  var Channels: js.UndefOr[integerMin1Max2] = js.native
  
  /**
    * Specify whether the service encodes this MP3 audio output with a constant bitrate (CBR) or a variable bitrate (VBR).
    */
  var RateControlMode: js.UndefOr[Mp3RateControlMode] = js.native
  
  /**
    * Sample rate in hz.
    */
  var SampleRate: js.UndefOr[integerMin22050Max48000] = js.native
  
  /**
    * Required when you set Bitrate control mode (rateControlMode) to VBR. Specify the audio quality of this MP3 output from 0 (highest quality) to 9 (lowest quality).
    */
  var VbrQuality: js.UndefOr[integerMin0Max9] = js.native
}
object Mp3Settings {
  
  @scala.inline
  def apply(): Mp3Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mp3Settings]
  }
  
  @scala.inline
  implicit class Mp3SettingsMutableBuilder[Self <: Mp3Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitrate(value: integerMin16000Max320000): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    @scala.inline
    def setChannels(value: integerMin1Max2): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    @scala.inline
    def setRateControlMode(value: Mp3RateControlMode): Self = StObject.set(x, "RateControlMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateControlModeUndefined: Self = StObject.set(x, "RateControlMode", js.undefined)
    
    @scala.inline
    def setSampleRate(value: integerMin22050Max48000): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
    
    @scala.inline
    def setVbrQuality(value: integerMin0Max9): Self = StObject.set(x, "VbrQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVbrQualityUndefined: Self = StObject.set(x, "VbrQuality", js.undefined)
  }
}
