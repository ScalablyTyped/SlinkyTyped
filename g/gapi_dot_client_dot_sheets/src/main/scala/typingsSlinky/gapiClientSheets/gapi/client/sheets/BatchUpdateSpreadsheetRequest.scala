package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateSpreadsheetRequest extends js.Object {
  /**
    * Determines if the update response should include the spreadsheet
    * resource.
    */
  var includeSpreadsheetInResponse: js.UndefOr[Boolean] = js.native
  /**
    * A list of updates to apply to the spreadsheet.
    * Requests will be applied in the order they are specified.
    * If any request is not valid, no requests will be applied.
    */
  var requests: js.UndefOr[js.Array[Request]] = js.native
  /**
    * True if grid data should be returned. Meaningful only if
    * include_spreadsheet_in_response is 'true'.
    * This parameter is ignored if a field mask was set in the request.
    */
  var responseIncludeGridData: js.UndefOr[Boolean] = js.native
  /**
    * Limits the ranges included in the response spreadsheet.
    * Meaningful only if include_spreadsheet_in_response is 'true'.
    */
  var responseRanges: js.UndefOr[js.Array[String]] = js.native
}

object BatchUpdateSpreadsheetRequest {
  @scala.inline
  def apply(): BatchUpdateSpreadsheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateSpreadsheetRequest]
  }
  @scala.inline
  implicit class BatchUpdateSpreadsheetRequestOps[Self <: BatchUpdateSpreadsheetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeSpreadsheetInResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSpreadsheetInResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeSpreadsheetInResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSpreadsheetInResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withRequests(value: js.Array[Request]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseIncludeGridData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseIncludeGridData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseIncludeGridData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseIncludeGridData")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseRanges(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseRanges")(js.undefined)
        ret
    }
  }
  
}

