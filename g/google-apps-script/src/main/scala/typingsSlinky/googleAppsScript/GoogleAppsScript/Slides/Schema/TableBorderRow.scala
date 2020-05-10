package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableBorderRow extends js.Object {
  var tableBorderCells: js.UndefOr[js.Array[TableBorderCell]] = js.native
}

object TableBorderRow {
  @scala.inline
  def apply(): TableBorderRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBorderRow]
  }
  @scala.inline
  implicit class TableBorderRowOps[Self <: TableBorderRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTableBorderCells(value: js.Array[TableBorderCell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBorderCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableBorderCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBorderCells")(js.undefined)
        ret
    }
  }
  
}

