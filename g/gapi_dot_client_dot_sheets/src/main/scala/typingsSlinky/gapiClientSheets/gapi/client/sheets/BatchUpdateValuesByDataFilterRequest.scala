package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateValuesByDataFilterRequest extends js.Object {
  /**
    * The new values to apply to the spreadsheet.  If more than one range is
    * matched by the specified DataFilter the specified values are applied to
    * all of those ranges.
    */
  var data: js.UndefOr[js.Array[DataFilterValueRange]] = js.native
  /**
    * Determines if the update response should include the values
    * of the cells that were updated. By default, responses
    * do not include the updated values. The `updatedData` field within
    * each of the BatchUpdateValuesResponse.responses contains the updated
    * values. If the range to write was larger than the range actually written,
    * the response includes all values in the requested range (excluding trailing
    * empty rows and columns).
    */
  var includeValuesInResponse: js.UndefOr[Boolean] = js.native
  /**
    * Determines how dates, times, and durations in the response should be
    * rendered. This is ignored if response_value_render_option is
    * FORMATTED_VALUE.
    * The default dateTime render option is
    * DateTimeRenderOption.SERIAL_NUMBER.
    */
  var responseDateTimeRenderOption: js.UndefOr[String] = js.native
  /**
    * Determines how values in the response should be rendered.
    * The default render option is ValueRenderOption.FORMATTED_VALUE.
    */
  var responseValueRenderOption: js.UndefOr[String] = js.native
  /** How the input data should be interpreted. */
  var valueInputOption: js.UndefOr[String] = js.native
}

object BatchUpdateValuesByDataFilterRequest {
  @scala.inline
  def apply(): BatchUpdateValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateValuesByDataFilterRequest]
  }
  @scala.inline
  implicit class BatchUpdateValuesByDataFilterRequestOps[Self <: BatchUpdateValuesByDataFilterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[DataFilterValueRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeValuesInResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeValuesInResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeValuesInResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeValuesInResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseDateTimeRenderOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDateTimeRenderOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseDateTimeRenderOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDateTimeRenderOption")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseValueRenderOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseValueRenderOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseValueRenderOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseValueRenderOption")(js.undefined)
        ret
    }
    @scala.inline
    def withValueInputOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueInputOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueInputOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueInputOption")(js.undefined)
        ret
    }
  }
  
}

