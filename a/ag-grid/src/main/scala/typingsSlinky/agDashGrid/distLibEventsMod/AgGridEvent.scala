package typingsSlinky.agDashGrid.distLibEventsMod

import typingsSlinky.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typingsSlinky.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgGridEvent extends AgEvent {
  var api: GridApi
  var columnApi: ColumnApi
}

object AgGridEvent {
  @scala.inline
  def apply(api: GridApi, columnApi: ColumnApi, `type`: String): AgGridEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgGridEvent]
  }
}

