package typingsSlinky.agDashGrid.distLibEventsMod

import typingsSlinky.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typingsSlinky.agDashGrid.distLibEntitiesOriginalColumnGroupMod.OriginalColumnGroup
import typingsSlinky.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnGroupOpenedEvent extends AgGridEvent {
  var columnGroup: OriginalColumnGroup
}

object ColumnGroupOpenedEvent {
  @scala.inline
  def apply(api: GridApi, columnApi: ColumnApi, columnGroup: OriginalColumnGroup, `type`: String): ColumnGroupOpenedEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], columnGroup = columnGroup.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupOpenedEvent]
  }
}

