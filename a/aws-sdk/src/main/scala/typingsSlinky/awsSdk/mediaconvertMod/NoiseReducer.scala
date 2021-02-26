package typingsSlinky.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoiseReducer extends StObject {
  
  /**
    * Use Noise reducer filter (NoiseReducerFilter) to select one of the following spatial image filtering functions. To use this setting, you must also enable Noise reducer (NoiseReducer). * Bilateral preserves edges while reducing noise. * Mean (softest), Gaussian, Lanczos, and Sharpen (sharpest) do convolution filtering. * Conserve does min/max noise reduction. * Spatial does frequency-domain filtering based on JND principles. * Temporal optimizes video quality for complex motion.
    */
  var Filter: js.UndefOr[NoiseReducerFilter] = js.native
  
  /**
    * Settings for a noise reducer filter
    */
  var FilterSettings: js.UndefOr[NoiseReducerFilterSettings] = js.native
  
  /**
    * Noise reducer filter settings for spatial filter.
    */
  var SpatialFilterSettings: js.UndefOr[NoiseReducerSpatialFilterSettings] = js.native
  
  /**
    * Noise reducer filter settings for temporal filter.
    */
  var TemporalFilterSettings: js.UndefOr[NoiseReducerTemporalFilterSettings] = js.native
}
object NoiseReducer {
  
  @scala.inline
  def apply(): NoiseReducer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoiseReducer]
  }
  
  @scala.inline
  implicit class NoiseReducerMutableBuilder[Self <: NoiseReducer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: NoiseReducerFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterSettings(value: NoiseReducerFilterSettings): Self = StObject.set(x, "FilterSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterSettingsUndefined: Self = StObject.set(x, "FilterSettings", js.undefined)
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setSpatialFilterSettings(value: NoiseReducerSpatialFilterSettings): Self = StObject.set(x, "SpatialFilterSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialFilterSettingsUndefined: Self = StObject.set(x, "SpatialFilterSettings", js.undefined)
    
    @scala.inline
    def setTemporalFilterSettings(value: NoiseReducerTemporalFilterSettings): Self = StObject.set(x, "TemporalFilterSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemporalFilterSettingsUndefined: Self = StObject.set(x, "TemporalFilterSettings", js.undefined)
  }
}
