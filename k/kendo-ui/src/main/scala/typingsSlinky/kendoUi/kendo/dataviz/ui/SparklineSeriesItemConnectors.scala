package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparklineSeriesItemConnectors extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var padding: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object SparklineSeriesItemConnectors {
  
  @scala.inline
  def apply(): SparklineSeriesItemConnectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineSeriesItemConnectors]
  }
  
  @scala.inline
  implicit class SparklineSeriesItemConnectorsMutableBuilder[Self <: SparklineSeriesItemConnectors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
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
