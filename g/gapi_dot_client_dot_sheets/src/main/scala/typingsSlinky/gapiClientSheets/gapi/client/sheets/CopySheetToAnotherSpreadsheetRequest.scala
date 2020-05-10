package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopySheetToAnotherSpreadsheetRequest extends js.Object {
  /** The ID of the spreadsheet to copy the sheet to. */
  var destinationSpreadsheetId: js.UndefOr[String] = js.native
}

object CopySheetToAnotherSpreadsheetRequest {
  @scala.inline
  def apply(): CopySheetToAnotherSpreadsheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopySheetToAnotherSpreadsheetRequest]
  }
  @scala.inline
  implicit class CopySheetToAnotherSpreadsheetRequestOps[Self <: CopySheetToAnotherSpreadsheetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationSpreadsheetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationSpreadsheetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationSpreadsheetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationSpreadsheetId")(js.undefined)
        ret
    }
  }
  
}

