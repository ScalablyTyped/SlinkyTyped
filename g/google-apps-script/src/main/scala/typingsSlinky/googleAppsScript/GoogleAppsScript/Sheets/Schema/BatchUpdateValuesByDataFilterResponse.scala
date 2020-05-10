package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateValuesByDataFilterResponse extends js.Object {
  var responses: js.UndefOr[js.Array[UpdateValuesByDataFilterResponse]] = js.native
  var spreadsheetId: js.UndefOr[String] = js.native
  var totalUpdatedCells: js.UndefOr[Double] = js.native
  var totalUpdatedColumns: js.UndefOr[Double] = js.native
  var totalUpdatedRows: js.UndefOr[Double] = js.native
  var totalUpdatedSheets: js.UndefOr[Double] = js.native
}

object BatchUpdateValuesByDataFilterResponse {
  @scala.inline
  def apply(): BatchUpdateValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateValuesByDataFilterResponse]
  }
  @scala.inline
  implicit class BatchUpdateValuesByDataFilterResponseOps[Self <: BatchUpdateValuesByDataFilterResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponses(value: js.Array[UpdateValuesByDataFilterResponse]): Self = {
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

