package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSeriesItemNegativeValues extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object ChartSeriesItemNegativeValues {
  
  @scala.inline
  def apply(): ChartSeriesItemNegativeValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemNegativeValues]
  }
  
  @scala.inline
  implicit class ChartSeriesItemNegativeValuesMutableBuilder[Self <: ChartSeriesItemNegativeValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
