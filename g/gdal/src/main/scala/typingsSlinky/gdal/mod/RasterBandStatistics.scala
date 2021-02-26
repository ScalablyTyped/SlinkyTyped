package typingsSlinky.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterBandStatistics extends StObject {
  
  var max: Double = js.native
  
  var mean: Double = js.native
  
  var min: Double = js.native
  
  var std_dev: Double = js.native
}
object RasterBandStatistics {
  
  @scala.inline
  def apply(max: Double, mean: Double, min: Double, std_dev: Double): RasterBandStatistics = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], std_dev = std_dev.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterBandStatistics]
  }
  
  @scala.inline
  implicit class RasterBandStatisticsMutableBuilder[Self <: RasterBandStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStd_dev(value: Double): Self = StObject.set(x, "std_dev", value.asInstanceOf[js.Any])
  }
}
