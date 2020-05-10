package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateValuesResponse extends js.Object {
  var spreadsheetId: js.UndefOr[String] = js.native
  var updatedCells: js.UndefOr[Double] = js.native
  var updatedColumns: js.UndefOr[Double] = js.native
  var updatedData: js.UndefOr[ValueRange] = js.native
  var updatedRange: js.UndefOr[String] = js.native
  var updatedRows: js.UndefOr[Double] = js.native
}

object UpdateValuesResponse {
  @scala.inline
  def apply(): UpdateValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateValuesResponse]
  }
  @scala.inline
  implicit class UpdateValuesResponseOps[Self <: UpdateValuesResponse] (val x: Self) extends AnyVal {
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
    def withUpdatedCells(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedCells")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedData(value: ValueRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedData")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedRange")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedRows")(js.undefined)
        ret
    }
  }
  
}

