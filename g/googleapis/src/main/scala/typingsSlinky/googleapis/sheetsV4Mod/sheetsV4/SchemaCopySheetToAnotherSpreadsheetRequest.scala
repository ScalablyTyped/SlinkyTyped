package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request to copy a sheet across spreadsheets.
  */
@js.native
trait SchemaCopySheetToAnotherSpreadsheetRequest extends js.Object {
  /**
    * The ID of the spreadsheet to copy the sheet to.
    */
  var destinationSpreadsheetId: js.UndefOr[String] = js.native
}

object SchemaCopySheetToAnotherSpreadsheetRequest {
  @scala.inline
  def apply(): SchemaCopySheetToAnotherSpreadsheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCopySheetToAnotherSpreadsheetRequest]
  }
  @scala.inline
  implicit class SchemaCopySheetToAnotherSpreadsheetRequestOps[Self <: SchemaCopySheetToAnotherSpreadsheetRequest] (val x: Self) extends AnyVal {
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

