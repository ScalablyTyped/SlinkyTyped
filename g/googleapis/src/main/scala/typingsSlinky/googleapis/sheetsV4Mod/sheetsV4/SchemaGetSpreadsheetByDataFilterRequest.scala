package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for retrieving a Spreadsheet.
  */
@js.native
trait SchemaGetSpreadsheetByDataFilterRequest extends js.Object {
  /**
    * The DataFilters used to select which ranges to retrieve from the
    * spreadsheet.
    */
  var dataFilters: js.UndefOr[js.Array[SchemaDataFilter]] = js.native
  /**
    * True if grid data should be returned. This parameter is ignored if a
    * field mask was set in the request.
    */
  var includeGridData: js.UndefOr[Boolean] = js.native
}

object SchemaGetSpreadsheetByDataFilterRequest {
  @scala.inline
  def apply(): SchemaGetSpreadsheetByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetSpreadsheetByDataFilterRequest]
  }
  @scala.inline
  implicit class SchemaGetSpreadsheetByDataFilterRequestOps[Self <: SchemaGetSpreadsheetByDataFilterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataFilters(value: js.Array[SchemaDataFilter]): Self = {
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

