package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertTableRowRequest extends js.Object {
  var insertBelow: js.UndefOr[Boolean] = js.native
  var tableCellLocation: js.UndefOr[TableCellLocation] = js.native
}

object InsertTableRowRequest {
  @scala.inline
  def apply(): InsertTableRowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertTableRowRequest]
  }
  @scala.inline
  implicit class InsertTableRowRequestOps[Self <: InsertTableRowRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertBelow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBelow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertBelow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBelow")(js.undefined)
        ret
    }
    @scala.inline
    def withTableCellLocation(value: TableCellLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCellLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableCellLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCellLocation")(js.undefined)
        ret
    }
  }
  
}

