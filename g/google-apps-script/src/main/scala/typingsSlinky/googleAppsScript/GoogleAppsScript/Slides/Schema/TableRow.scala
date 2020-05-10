package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRow extends js.Object {
  var rowHeight: js.UndefOr[Dimension] = js.native
  var tableCells: js.UndefOr[js.Array[TableCell]] = js.native
  var tableRowProperties: js.UndefOr[TableRowProperties] = js.native
}

object TableRow {
  @scala.inline
  def apply(): TableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRow]
  }
  @scala.inline
  implicit class TableRowOps[Self <: TableRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRowHeight(value: Dimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTableCells(value: js.Array[TableCell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCells")(js.undefined)
        ret
    }
    @scala.inline
    def withTableRowProperties(value: TableRowProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableRowProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowProperties")(js.undefined)
        ret
    }
  }
  
}

