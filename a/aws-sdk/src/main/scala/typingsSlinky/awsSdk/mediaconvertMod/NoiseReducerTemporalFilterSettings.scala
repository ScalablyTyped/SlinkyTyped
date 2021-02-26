package typingsSlinky.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoiseReducerTemporalFilterSettings extends StObject {
  
  /**
    * Use Aggressive mode for content that has complex motion. Higher values produce stronger temporal filtering. This filters highly complex scenes more aggressively and creates better VQ for low bitrate outputs.
    */
  var AggressiveMode: js.UndefOr[integerMin0Max4] = js.native
  
  /**
    * Optional. When you set Noise reducer (noiseReducer) to Temporal (TEMPORAL), you can use this setting to apply sharpening. The default behavior, Auto (AUTO), allows the transcoder to determine whether to apply filtering, depending on input type and quality. When you set Noise reducer to Temporal, your output bandwidth is reduced. When Post temporal sharpening is also enabled, that bandwidth reduction is smaller.
    */
  var PostTemporalSharpening: js.UndefOr[NoiseFilterPostTemporalSharpening] = js.native
  
  /**
    * The speed of the filter (higher number is faster). Low setting reduces bit rate at the cost of transcode time, high setting improves transcode time at the cost of bit rate.
    */
  var Speed: js.UndefOr[integerMinNegative1Max3] = js.native
  
  /**
    * Specify the strength of the noise reducing filter on this output. Higher values produce stronger filtering. We recommend the following value ranges, depending on the result that you want: * 0-2 for complexity reduction with minimal sharpness loss * 2-8 for complexity reduction with image preservation * 8-16 for a high level of complexity reduction
    */
  var Strength: js.UndefOr[integerMin0Max16] = js.native
}
object NoiseReducerTemporalFilterSettings {
  
  @scala.inline
  def apply(): NoiseReducerTemporalFilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoiseReducerTemporalFilterSettings]
  }
  
  @scala.inline
  implicit class NoiseReducerTemporalFilterSettingsMutableBuilder[Self <: NoiseReducerTemporalFilterSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggressiveMode(value: integerMin0Max4): Self = StObject.set(x, "AggressiveMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggressiveModeUndefined: Self = StObject.set(x, "AggressiveMode", js.undefined)
    
    @scala.inline
    def setPostTemporalSharpening(value: NoiseFilterPostTemporalSharpening): Self = StObject.set(x, "PostTemporalSharpening", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostTemporalSharpeningUndefined: Self = StObject.set(x, "PostTemporalSharpening", js.undefined)
    
    @scala.inline
    def setSpeed(value: integerMinNegative1Max3): Self = StObject.set(x, "Speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "Speed", js.undefined)
    
    @scala.inline
    def setStrength(value: integerMin0Max16): Self = StObject.set(x, "Strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrengthUndefined: Self = StObject.set(x, "Strength", js.undefined)
  }
}
