package typingsSlinky.agGrid.eventsMod

import typingsSlinky.agGrid.columnApiMod.ColumnApi
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.gridApiMod.GridApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnPinnedEvent extends ColumnEvent {
  
  var pinned: String = js.native
}
object ColumnPinnedEvent {
  
  @scala.inline
  def apply(
    api: GridApi,
    column: Column,
    columnApi: ColumnApi,
    columns: js.Array[Column],
    pinned: String,
    source: ColumnEventType,
    `type`: String
  ): ColumnPinnedEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnPinnedEvent]
  }
  
  @scala.inline
  implicit class ColumnPinnedEventMutableBuilder[Self <: ColumnPinnedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPinned(value: String): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
  }
}
