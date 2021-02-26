package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSeriesDefaultsStack extends StObject {
  
  var `type`: js.UndefOr[String] = js.native
}
object ChartSeriesDefaultsStack {
  
  @scala.inline
  def apply(): ChartSeriesDefaultsStack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesDefaultsStack]
  }
  
  @scala.inline
  implicit class ChartSeriesDefaultsStackMutableBuilder[Self <: ChartSeriesDefaultsStack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
