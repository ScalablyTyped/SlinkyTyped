package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemporalFilterSettings extends StObject {
  
  /**
    * If you enable this filter, the results are the following:
  - If the source content is noisy (it contains excessive digital artifacts), the filter cleans up the source.
  - If the source content is already clean, the filter tends to decrease the bitrate, especially when the rate control mode is QVBR.
    */
  var PostFilterSharpening: js.UndefOr[TemporalFilterPostFilterSharpening] = js.native
  
  /**
    * Choose a filter strength. We recommend a strength of 1 or 2. A higher strength might take out good information, resulting in an image that is overly soft.
    */
  var Strength: js.UndefOr[TemporalFilterStrength] = js.native
}
object TemporalFilterSettings {
  
  @scala.inline
  def apply(): TemporalFilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemporalFilterSettings]
  }
  
  @scala.inline
  implicit class TemporalFilterSettingsMutableBuilder[Self <: TemporalFilterSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPostFilterSharpening(value: TemporalFilterPostFilterSharpening): Self = StObject.set(x, "PostFilterSharpening", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostFilterSharpeningUndefined: Self = StObject.set(x, "PostFilterSharpening", js.undefined)
    
    @scala.inline
    def setStrength(value: TemporalFilterStrength): Self = StObject.set(x, "Strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrengthUndefined: Self = StObject.set(x, "Strength", js.undefined)
  }
}
