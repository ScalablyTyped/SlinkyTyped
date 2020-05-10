package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The reply for batch updating a spreadsheet.
  */
@js.native
trait SchemaBatchUpdateSpreadsheetResponse extends js.Object {
  /**
    * The reply of the updates.  This maps 1:1 with the updates, although
    * replies to some requests may be empty.
    */
  var replies: js.UndefOr[js.Array[SchemaResponse]] = js.native
  /**
    * The spreadsheet the updates were applied to.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
  /**
    * The spreadsheet after updates were applied. This is only set if
    * [BatchUpdateSpreadsheetRequest.include_spreadsheet_in_response] is
    * `true`.
    */
  var updatedSpreadsheet: js.UndefOr[SchemaSpreadsheet] = js.native
}

object SchemaBatchUpdateSpreadsheetResponse {
  @scala.inline
  def apply(): SchemaBatchUpdateSpreadsheetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateSpreadsheetResponse]
  }
  @scala.inline
  implicit class SchemaBatchUpdateSpreadsheetResponseOps[Self <: SchemaBatchUpdateSpreadsheetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplies(value: js.Array[SchemaResponse]): Self = {
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
    def withUpdatedSpreadsheet(value: SchemaSpreadsheet): Self = {
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

