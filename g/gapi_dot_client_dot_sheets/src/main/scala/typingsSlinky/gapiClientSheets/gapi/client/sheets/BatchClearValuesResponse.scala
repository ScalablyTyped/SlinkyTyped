package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchClearValuesResponse extends js.Object {
  /**
    * The ranges that were cleared, in A1 notation. If the requests are for an
    * unbounded range or a ranger larger than the bounds of the sheet, this is
    * the actual ranges that were cleared, bounded to the sheet's limits.
    */
  var clearedRanges: js.UndefOr[js.Array[String]] = js.native
  /** The spreadsheet the updates were applied to. */
  var spreadsheetId: js.UndefOr[String] = js.native
}

object BatchClearValuesResponse {
  @scala.inline
  def apply(): BatchClearValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchClearValuesResponse]
  }
  @scala.inline
  implicit class BatchClearValuesResponseOps[Self <: BatchClearValuesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearedRanges(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearedRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearedRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearedRanges")(js.undefined)
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

