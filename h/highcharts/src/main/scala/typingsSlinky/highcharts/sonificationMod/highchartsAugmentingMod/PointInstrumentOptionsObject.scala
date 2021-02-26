package typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointInstrumentOptionsObject extends StObject {
  
  /**
    * The maximum duration for a note when using a data property for
    * duration. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.duration. Defaults to 2000.
    */
  var maxDuration: js.UndefOr[Double] = js.native
  
  /**
    * The maximum frequency for a note when using a data property for
    * frequency. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.frequency. Defaults to 2200.
    */
  var maxFrequency: js.UndefOr[Double] = js.native
  
  /**
    * The maximum pan value for a note when using a data property for
    * panning. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.pan. Defaults to 1 (fully right).
    */
  var maxPan: js.UndefOr[Double] = js.native
  
  /**
    * The maximum volume for a note when using a data property for volume.
    * Can be overridden by using either a fixed number or a function for
    * instrumentMapping.volume. Defaults to 1.
    */
  var maxVolume: js.UndefOr[Double] = js.native
  
  /**
    * The minimum duration for a note when using a data property for
    * duration. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.duration. Defaults to 20.
    */
  var minDuration: js.UndefOr[Double] = js.native
  
  /**
    * The minimum frequency for a note when using a data property for
    * frequency. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.frequency. Defaults to 220.
    */
  var minFrequency: js.UndefOr[Double] = js.native
  
  /**
    * The minimum pan value for a note when using a data property for
    * panning. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.pan. Defaults to -1 (fully left).
    */
  var minPan: js.UndefOr[Double] = js.native
  
  /**
    * The minimum volume for a note when using a data property for volume.
    * Can be overridden by using either a fixed number or a function for
    * instrumentMapping.volume. Defaults to 0.1.
    */
  var minVolume: js.UndefOr[Double] = js.native
}
object PointInstrumentOptionsObject {
  
  @scala.inline
  def apply(): PointInstrumentOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointInstrumentOptionsObject]
  }
  
  @scala.inline
  implicit class PointInstrumentOptionsObjectMutableBuilder[Self <: PointInstrumentOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    @scala.inline
    def setMaxFrequency(value: Double): Self = StObject.set(x, "maxFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFrequencyUndefined: Self = StObject.set(x, "maxFrequency", js.undefined)
    
    @scala.inline
    def setMaxPan(value: Double): Self = StObject.set(x, "maxPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPanUndefined: Self = StObject.set(x, "maxPan", js.undefined)
    
    @scala.inline
    def setMaxVolume(value: Double): Self = StObject.set(x, "maxVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVolumeUndefined: Self = StObject.set(x, "maxVolume", js.undefined)
    
    @scala.inline
    def setMinDuration(value: Double): Self = StObject.set(x, "minDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDurationUndefined: Self = StObject.set(x, "minDuration", js.undefined)
    
    @scala.inline
    def setMinFrequency(value: Double): Self = StObject.set(x, "minFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinFrequencyUndefined: Self = StObject.set(x, "minFrequency", js.undefined)
    
    @scala.inline
    def setMinPan(value: Double): Self = StObject.set(x, "minPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPanUndefined: Self = StObject.set(x, "minPan", js.undefined)
    
    @scala.inline
    def setMinVolume(value: Double): Self = StObject.set(x, "minVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinVolumeUndefined: Self = StObject.set(x, "minVolume", js.undefined)
  }
}
