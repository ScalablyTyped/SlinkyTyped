package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTableRowRequest extends js.Object {
  var tableCellLocation: js.UndefOr[TableCellLocation] = js.native
}

object DeleteTableRowRequest {
  @scala.inline
  def apply(): DeleteTableRowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTableRowRequest]
  }
  @scala.inline
  implicit class DeleteTableRowRequestOps[Self <: DeleteTableRowRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

