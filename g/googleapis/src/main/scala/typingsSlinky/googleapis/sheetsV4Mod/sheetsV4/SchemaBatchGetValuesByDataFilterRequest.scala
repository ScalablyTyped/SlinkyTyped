package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for retrieving a range of values in a spreadsheet selected by a
  * set of DataFilters.
  */
@js.native
trait SchemaBatchGetValuesByDataFilterRequest extends js.Object {
  /**
    * The data filters used to match the ranges of values to retrieve.  Ranges
    * that match any of the specified data filters will be included in the
    * response.
    */
  var dataFilters: js.UndefOr[js.Array[SchemaDataFilter]] = js.native
  /**
    * How dates, times, and durations should be represented in the output. This
    * is ignored if value_render_option is FORMATTED_VALUE. The default
    * dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
    */
  var dateTimeRenderOption: js.UndefOr[String] = js.native
  /**
    * The major dimension that results should use.  For example, if the
    * spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`, then a request that selects
    * that range and sets `majorDimension=ROWS` will return `[[1,2],[3,4]]`,
    * whereas a request that sets `majorDimension=COLUMNS` will return
    * `[[1,3],[2,4]]`.
    */
  var majorDimension: js.UndefOr[String] = js.native
  /**
    * How values should be represented in the output. The default render option
    * is ValueRenderOption.FORMATTED_VALUE.
    */
  var valueRenderOption: js.UndefOr[String] = js.native
}

object SchemaBatchGetValuesByDataFilterRequest {
  @scala.inline
  def apply(): SchemaBatchGetValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetValuesByDataFilterRequest]
  }
  @scala.inline
  implicit class SchemaBatchGetValuesByDataFilterRequestOps[Self <: SchemaBatchGetValuesByDataFilterRequest] (val x: Self) extends AnyVal {
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
    def withDateTimeRenderOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeRenderOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTimeRenderOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeRenderOption")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorDimension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorDimension")(js.undefined)
        ret
    }
    @scala.inline
    def withValueRenderOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRenderOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueRenderOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRenderOption")(js.undefined)
        ret
    }
  }
  
}

