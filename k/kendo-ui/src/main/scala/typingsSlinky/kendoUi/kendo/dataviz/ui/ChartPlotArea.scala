package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartPlotArea extends StObject {
  
  var background: js.UndefOr[String] = js.native
  
  var border: js.UndefOr[ChartPlotAreaBorder] = js.native
  
  var margin: js.UndefOr[Double | ChartPlotAreaMargin] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var padding: js.UndefOr[Double | ChartPlotAreaPadding] = js.native
}
object ChartPlotArea {
  
  @scala.inline
  def apply(): ChartPlotArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPlotArea]
  }
  
  @scala.inline
  implicit class ChartPlotAreaMutableBuilder[Self <: ChartPlotArea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: ChartPlotAreaBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setMargin(value: Double | ChartPlotAreaMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | ChartPlotAreaPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
