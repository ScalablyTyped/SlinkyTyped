package typingsSlinky.agGrid.eventsMod

import typingsSlinky.agGrid.columnApiMod.ColumnApi
import typingsSlinky.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationChangedEvent extends AgGridEvent {
  var animate: Boolean = js.native
  var keepRenderedRows: Boolean = js.native
  var newData: Boolean = js.native
  var newPage: Boolean = js.native
}

object PaginationChangedEvent {
  @scala.inline
  def apply(
    animate: Boolean,
    api: GridApi,
    columnApi: ColumnApi,
    keepRenderedRows: Boolean,
    newData: Boolean,
    newPage: Boolean,
    `type`: String
  ): PaginationChangedEvent = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], keepRenderedRows = keepRenderedRows.asInstanceOf[js.Any], newData = newData.asInstanceOf[js.Any], newPage = newPage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationChangedEvent]
  }
  @scala.inline
  implicit class PaginationChangedEventOps[Self <: PaginationChangedEvent] (val x: Self) extends AnyVal {
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

