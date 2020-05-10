package typingsSlinky.gsheets.mod

import typingsSlinky.gsheets.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spreadsheet extends js.Object {
  var title: String = js.native
  var updated: String = js.native
  var worksheets: js.Array[AnonId] = js.native
}

object Spreadsheet {
  @scala.inline
  def apply(title: String, updated: String, worksheets: js.Array[AnonId]): Spreadsheet = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], worksheets = worksheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spreadsheet]
  }
  @scala.inline
  implicit class SpreadsheetOps[Self <: Spreadsheet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorksheets(value: js.Array[AnonId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksheets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

