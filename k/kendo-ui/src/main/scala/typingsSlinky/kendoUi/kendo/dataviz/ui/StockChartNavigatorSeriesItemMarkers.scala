package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockChartNavigatorSeriesItemMarkers extends StObject {
  
  var background: js.UndefOr[String] = js.native
  
  var border: js.UndefOr[StockChartNavigatorSeriesItemMarkersBorder] = js.native
  
  var rotation: js.UndefOr[Double | js.Function] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object StockChartNavigatorSeriesItemMarkers {
  
  @scala.inline
  def apply(): StockChartNavigatorSeriesItemMarkers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartNavigatorSeriesItemMarkers]
  }
  
  @scala.inline
  implicit class StockChartNavigatorSeriesItemMarkersMutableBuilder[Self <: StockChartNavigatorSeriesItemMarkers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: StockChartNavigatorSeriesItemMarkersBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setRotation(value: Double | js.Function): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
