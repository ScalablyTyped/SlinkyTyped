package typingsSlinky.reactNativeSvgCharts.mod

import typingsSlinky.reactNativeSvgCharts.anon.CornerRadius
import typingsSlinky.reactNativeSvgCharts.anon.PartialPathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PieChartData extends StObject {
  
  var arc: js.UndefOr[CornerRadius] = js.native
  
  var key: String | Double = js.native
  
  var svg: js.UndefOr[PartialPathProps] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object PieChartData {
  
  @scala.inline
  def apply(key: String | Double): PieChartData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartData]
  }
  
  @scala.inline
  implicit class PieChartDataMutableBuilder[Self <: PieChartData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArc(value: CornerRadius): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArcUndefined: Self = StObject.set(x, "arc", js.undefined)
    
    @scala.inline
    def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvg(value: PartialPathProps): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
