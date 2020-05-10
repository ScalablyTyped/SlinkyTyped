package typingsSlinky.agGrid.eventsMod

import typingsSlinky.agGrid.columnApiMod.ColumnApi
import typingsSlinky.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelUpdatedEvent extends AgGridEvent {
  /** If true, the grid will try and animate the rows to the new positions */
  var animate: Boolean = js.native
  /** If true, the grid has new data loaded, eg user called setRowData(), otherwise
    * it's the same data but sorted or filtered, in which case this is true, and rows
    * can animate around (eg rowNode id 24 is the same row node as last time). */
  var keepRenderedRows: Boolean = js.native
  /** If true, then this update was a result of setRowData() getting called. This
    * gets the grid to scroll to the top again. */
  var newData: Boolean = js.native
  /** True when pagination and a new page is navigated to. */
  var newPage: Boolean = js.native
}

object ModelUpdatedEvent {
  @scala.inline
  def apply(
    animate: Boolean,
    api: GridApi,
    columnApi: ColumnApi,
    keepRenderedRows: Boolean,
    newData: Boolean,
    newPage: Boolean,
    `type`: String
  ): ModelUpdatedEvent = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], keepRenderedRows = keepRenderedRows.asInstanceOf[js.Any], newData = newData.asInstanceOf[js.Any], newPage = newPage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelUpdatedEvent]
  }
  @scala.inline
  implicit class ModelUpdatedEventOps[Self <: ModelUpdatedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepRenderedRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepRenderedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

