package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSeriesItemStack extends StObject {
  
  var group: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object ChartSeriesItemStack {
  
  @scala.inline
  def apply(): ChartSeriesItemStack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemStack]
  }
  
  @scala.inline
  implicit class ChartSeriesItemStackMutableBuilder[Self <: ChartSeriesItemStack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
