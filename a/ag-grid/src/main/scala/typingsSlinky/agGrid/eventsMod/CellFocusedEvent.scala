package typingsSlinky.agGrid.eventsMod

import typingsSlinky.agGrid.columnApiMod.ColumnApi
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellFocusedEvent extends AgGridEvent {
  var column: Column = js.native
  var floating: String = js.native
  var forceBrowserFocus: Boolean = js.native
  var rowIndex: Double = js.native
  var rowPinned: String = js.native
}

object CellFocusedEvent {
  @scala.inline
  def apply(
    api: GridApi,
    column: Column,
    columnApi: ColumnApi,
    floating: String,
    forceBrowserFocus: Boolean,
    rowIndex: Double,
    rowPinned: String,
    `type`: String
  ): CellFocusedEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], floating = floating.asInstanceOf[js.Any], forceBrowserFocus = forceBrowserFocus.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowPinned = rowPinned.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellFocusedEvent]
  }
  @scala.inline
  implicit class CellFocusedEventOps[Self <: CellFocusedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: Column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceBrowserFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceBrowserFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowPinned(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowPinned")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

