package typingsSlinky.agGrid.eventsMod

import typingsSlinky.agGrid.columnApiMod.ColumnApi
import typingsSlinky.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragEvent extends AgGridEvent
object DragEvent {
  
  @scala.inline
  def apply(api: GridApi, columnApi: ColumnApi, `type`: String): DragEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragEvent]
  }
}
