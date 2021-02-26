package typingsSlinky.kendoUi.anon

import typingsSlinky.kendoUi.kendo.dataviz.ui.StockChart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofStockChart extends StObject {
  
  /* static member */
  def extend(proto: js.Object): StockChart = js.native
  
  /* static member */
  var fn: StockChart = js.native
}
object TypeofStockChart {
  
  @scala.inline
  def apply(extend: js.Object => StockChart, fn: StockChart): TypeofStockChart = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofStockChart]
  }
  
  @scala.inline
  implicit class TypeofStockChartMutableBuilder[Self <: TypeofStockChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => StockChart): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: StockChart): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
