package typingsSlinky.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartViewWindow extends StObject {
  
  var max: js.UndefOr[Double | js.Date | js.Array[Double]] = js.native
  
  var min: js.UndefOr[Double | js.Date | js.Array[Double]] = js.native
}
object ChartViewWindow {
  
  @scala.inline
  def apply(): ChartViewWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartViewWindow]
  }
  
  @scala.inline
  implicit class ChartViewWindowMutableBuilder[Self <: ChartViewWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double | js.Date | js.Array[Double]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDate(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMaxVarargs(value: Double*): Self = StObject.set(x, "max", js.Array(value :_*))
    
    @scala.inline
    def setMin(value: Double | js.Date | js.Array[Double]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDate(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMinVarargs(value: Double*): Self = StObject.set(x, "min", js.Array(value :_*))
  }
}
