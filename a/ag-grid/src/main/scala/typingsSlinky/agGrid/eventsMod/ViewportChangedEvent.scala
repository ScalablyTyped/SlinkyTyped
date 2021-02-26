package typingsSlinky.agGrid.eventsMod

import typingsSlinky.agGrid.columnApiMod.ColumnApi
import typingsSlinky.agGrid.gridApiMod.GridApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewportChangedEvent extends AgGridEvent {
  
  var firstRow: Double = js.native
  
  var lastRow: Double = js.native
}
object ViewportChangedEvent {
  
  @scala.inline
  def apply(api: GridApi, columnApi: ColumnApi, firstRow: Double, lastRow: Double, `type`: String): ViewportChangedEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], firstRow = firstRow.asInstanceOf[js.Any], lastRow = lastRow.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportChangedEvent]
  }
  
  @scala.inline
  implicit class ViewportChangedEventMutableBuilder[Self <: ViewportChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstRow(value: Double): Self = StObject.set(x, "firstRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRow(value: Double): Self = StObject.set(x, "lastRow", value.asInstanceOf[js.Any])
  }
}
