package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearValuesResponse extends js.Object {
  /**
    * The range (in A1 notation) that was cleared.
    * (If the request was for an unbounded range or a ranger larger
    * than the bounds of the sheet, this will be the actual range
    * that was cleared, bounded to the sheet's limits.)
    */
  var clearedRange: js.UndefOr[String] = js.native
  /** The spreadsheet the updates were applied to. */
  var spreadsheetId: js.UndefOr[String] = js.native
}

object ClearValuesResponse {
  @scala.inline
  def apply(): ClearValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearValuesResponse]
  }
  @scala.inline
  implicit class ClearValuesResponseOps[Self <: ClearValuesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearedRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearedRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearedRange")(js.undefined)
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
  }
  
}

