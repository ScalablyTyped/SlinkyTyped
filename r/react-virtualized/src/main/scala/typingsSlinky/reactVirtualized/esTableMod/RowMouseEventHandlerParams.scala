package typingsSlinky.reactVirtualized.esTableMod

import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowMouseEventHandlerParams extends StObject {
  
  var event: SyntheticMouseEvent[_] = js.native
  
  var index: Double = js.native
  
  var rowData: js.Any = js.native
}
object RowMouseEventHandlerParams {
  
  @scala.inline
  def apply(event: SyntheticMouseEvent[_], index: Double, rowData: js.Any): RowMouseEventHandlerParams = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowMouseEventHandlerParams]
  }
  
  @scala.inline
  implicit class RowMouseEventHandlerParamsMutableBuilder[Self <: RowMouseEventHandlerParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: SyntheticMouseEvent[_]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowData(value: js.Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
  }
}
