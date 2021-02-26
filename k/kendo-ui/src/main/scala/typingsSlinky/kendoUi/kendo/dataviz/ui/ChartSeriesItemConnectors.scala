package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSeriesItemConnectors extends StObject {
  
  var color: js.UndefOr[String | js.Function] = js.native
  
  var padding: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ChartSeriesItemConnectors {
  
  @scala.inline
  def apply(): ChartSeriesItemConnectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemConnectors]
  }
  
  @scala.inline
  implicit class ChartSeriesItemConnectorsMutableBuilder[Self <: ChartSeriesItemConnectors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String | js.Function): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
