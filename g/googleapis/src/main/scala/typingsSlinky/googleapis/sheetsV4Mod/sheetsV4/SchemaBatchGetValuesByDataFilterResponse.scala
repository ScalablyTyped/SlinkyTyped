package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response when retrieving more than one range of values in a spreadsheet
  * selected by DataFilters.
  */
@js.native
trait SchemaBatchGetValuesByDataFilterResponse extends js.Object {
  /**
    * The ID of the spreadsheet the data was retrieved from.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
  /**
    * The requested values with the list of data filters that matched them.
    */
  var valueRanges: js.UndefOr[js.Array[SchemaMatchedValueRange]] = js.native
}

object SchemaBatchGetValuesByDataFilterResponse {
  @scala.inline
  def apply(): SchemaBatchGetValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetValuesByDataFilterResponse]
  }
  @scala.inline
  implicit class SchemaBatchGetValuesByDataFilterResponseOps[Self <: SchemaBatchGetValuesByDataFilterResponse] (val x: Self) extends AnyVal {
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
    def withValueRanges(value: js.Array[SchemaMatchedValueRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRanges")(js.undefined)
        ret
    }
  }
  
}

