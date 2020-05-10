package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetValuesResponse extends js.Object {
  var spreadsheetId: js.UndefOr[String] = js.native
  var valueRanges: js.UndefOr[js.Array[ValueRange]] = js.native
}

object BatchGetValuesResponse {
  @scala.inline
  def apply(): BatchGetValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetValuesResponse]
  }
  @scala.inline
  implicit class BatchGetValuesResponseOps[Self <: BatchGetValuesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withValueRanges(value: js.Array[ValueRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRanges")(js.undefined)
        ret
    }
  }
  
}

