package typingsSlinky.gapiClientYoutubereporting.gapi.client.youtubereporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReportTypesResponse extends js.Object {
  /**
    * A token to retrieve next page of results.
    * Pass this value in the
    * ListReportTypesRequest.page_token
    * field in the subsequent call to `ListReportTypes` method to retrieve the next
    * page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The list of report types. */
  var reportTypes: js.UndefOr[js.Array[ReportType]] = js.native
}

object ListReportTypesResponse {
  @scala.inline
  def apply(): ListReportTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReportTypesResponse]
  }
  @scala.inline
  implicit class ListReportTypesResponseOps[Self <: ListReportTypesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withReportTypes(value: js.Array[ReportType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportTypes")(js.undefined)
        ret
    }
  }
  
}

