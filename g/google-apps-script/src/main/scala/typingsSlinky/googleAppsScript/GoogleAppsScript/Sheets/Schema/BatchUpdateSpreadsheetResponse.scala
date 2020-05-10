package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateSpreadsheetResponse extends js.Object {
  var replies: js.UndefOr[js.Array[Response]] = js.native
  var spreadsheetId: js.UndefOr[String] = js.native
  var updatedSpreadsheet: js.UndefOr[Spreadsheet] = js.native
}

object BatchUpdateSpreadsheetResponse {
  @scala.inline
  def apply(): BatchUpdateSpreadsheetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateSpreadsheetResponse]
  }
  @scala.inline
  implicit class BatchUpdateSpreadsheetResponseOps[Self <: BatchUpdateSpreadsheetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplies(value: js.Array[Response]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replies")(js.undefined)
        ret
    }
    @scala.inline
    def withSpreadsheetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spreadsheetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpreadsheetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spreadsheetId")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedSpreadsheet(value: Spreadsheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedSpreadsheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedSpreadsheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedSpreadsheet")(js.undefined)
        ret
    }
  }
  
}

