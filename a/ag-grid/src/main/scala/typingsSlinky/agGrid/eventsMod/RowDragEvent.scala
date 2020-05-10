package typingsSlinky.agGrid.eventsMod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.agGrid.columnApiMod.ColumnApi
import typingsSlinky.agGrid.gridApiMod.GridApi
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowDragEvent extends AgGridEvent {
  var event: MouseEvent = js.native
  var node: RowNode = js.native
  var overIndex: Double = js.native
  var overNode: RowNode = js.native
  var vDirection: String = js.native
  var y: Double = js.native
}

object RowDragEvent {
  @scala.inline
  def apply(
    api: GridApi,
    columnApi: ColumnApi,
    event: MouseEvent,
    node: RowNode,
    overIndex: Double,
    overNode: RowNode,
    `type`: String,
    vDirection: String,
    y: Double
  ): RowDragEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], overIndex = overIndex.asInstanceOf[js.Any], overNode = overNode.asInstanceOf[js.Any], vDirection = vDirection.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowDragEvent]
  }
  @scala.inline
  implicit class RowDragEventOps[Self <: RowDragEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: RowNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverNode(value: RowNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

