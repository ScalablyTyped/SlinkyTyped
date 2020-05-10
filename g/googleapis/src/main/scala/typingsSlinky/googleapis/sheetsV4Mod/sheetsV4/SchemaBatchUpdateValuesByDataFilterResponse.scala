package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response when updating a range of values in a spreadsheet.
  */
@js.native
trait SchemaBatchUpdateValuesByDataFilterResponse extends js.Object {
  /**
    * The response for each range updated.
    */
  var responses: js.UndefOr[js.Array[SchemaUpdateValuesByDataFilterResponse]] = js.native
  /**
    * The spreadsheet the updates were applied to.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
  /**
    * The total number of cells updated.
    */
  var totalUpdatedCells: js.UndefOr[Double] = js.native
  /**
    * The total number of columns where at least one cell in the column was
    * updated.
    */
  var totalUpdatedColumns: js.UndefOr[Double] = js.native
  /**
    * The total number of rows where at least one cell in the row was updated.
    */
  var totalUpdatedRows: js.UndefOr[Double] = js.native
  /**
    * The total number of sheets where at least one cell in the sheet was
    * updated.
    */
  var totalUpdatedSheets: js.UndefOr[Double] = js.native
}

object SchemaBatchUpdateValuesByDataFilterResponse {
  @scala.inline
  def apply(): SchemaBatchUpdateValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateValuesByDataFilterResponse]
  }
  @scala.inline
  implicit class SchemaBatchUpdateValuesByDataFilterResponseOps[Self <: SchemaBatchUpdateValuesByDataFilterResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponses(value: js.Array[SchemaUpdateValuesByDataFilterResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responses")(js.undefined)
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
    def withTotalUpdatedCells(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalUpdatedCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalUpdatedCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalUpdatedCells")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalUpdatedColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalUpdatedColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalUpdatedColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalUpdatedColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalUpdatedRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalUpdatedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalUpdatedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalUpdatedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalUpdatedSheets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalUpdatedSheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalUpdatedSheets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalUpdatedSheets")(js.undefined)
        ret
    }
  }
  
}

