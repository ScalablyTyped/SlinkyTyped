package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartPlotAreaBorder extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var dashType: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ChartPlotAreaBorder {
  
  @scala.inline
  def apply(): ChartPlotAreaBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPlotAreaBorder]
  }
  
  @scala.inline
  implicit class ChartPlotAreaBorderMutableBuilder[Self <: ChartPlotAreaBorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDashType(value: String): Self = StObject.set(x, "dashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashTypeUndefined: Self = StObject.set(x, "dashType", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
