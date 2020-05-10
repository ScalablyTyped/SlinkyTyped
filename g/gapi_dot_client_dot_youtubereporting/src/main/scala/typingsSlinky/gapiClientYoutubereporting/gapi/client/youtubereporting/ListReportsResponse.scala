package typingsSlinky.gapiClientYoutubereporting.gapi.client.youtubereporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReportsResponse extends js.Object {
  /**
    * A token to retrieve next page of results.
    * Pass this value in the
    * ListReportsRequest.page_token
    * field in the subsequent call to `ListReports` method to retrieve the next
    * page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The list of report types. */
  var reports: js.UndefOr[js.Array[Report]] = js.native
}

object ListReportsResponse {
  @scala.inline
  def apply(): ListReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReportsResponse]
  }
  @scala.inline
  implicit class ListReportsResponseOps[Self <: ListReportsResponse] (val x: Self) extends AnyVal {
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
    def withReports(value: js.Array[Report]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reports")(js.undefined)
        ret
    }
  }
  
}

