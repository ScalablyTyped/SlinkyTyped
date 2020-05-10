package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSpreadsheetByDataFilterRequest extends js.Object {
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.native
  var includeGridData: js.UndefOr[Boolean] = js.native
}

object GetSpreadsheetByDataFilterRequest {
  @scala.inline
  def apply(): GetSpreadsheetByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSpreadsheetByDataFilterRequest]
  }
  @scala.inline
  implicit class GetSpreadsheetByDataFilterRequestOps[Self <: GetSpreadsheetByDataFilterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataFilters(value: js.Array[DataFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeGridData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeGridData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeGridData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeGridData")(js.undefined)
        ret
    }
  }
  
}

