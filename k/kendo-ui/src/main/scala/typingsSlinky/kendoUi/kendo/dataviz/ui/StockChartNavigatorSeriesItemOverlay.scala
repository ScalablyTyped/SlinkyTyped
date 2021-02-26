package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockChartNavigatorSeriesItemOverlay extends StObject {
  
  var gradient: js.UndefOr[String] = js.native
}
object StockChartNavigatorSeriesItemOverlay {
  
  @scala.inline
  def apply(): StockChartNavigatorSeriesItemOverlay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartNavigatorSeriesItemOverlay]
  }
  
  @scala.inline
  implicit class StockChartNavigatorSeriesItemOverlayMutableBuilder[Self <: StockChartNavigatorSeriesItemOverlay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGradient(value: String): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
  }
}
