package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFilteredBidRequestsResponse extends js.Object {
  /**
    * List of rows, with counts of filtered bid requests aggregated by callout
    * status.
    */
  var calloutStatusRows: js.UndefOr[js.Array[CalloutStatusRow]] = js.native
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListFilteredBidRequestsRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.filteredBidRequests.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListFilteredBidRequestsResponse {
  @scala.inline
  def apply(): ListFilteredBidRequestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFilteredBidRequestsResponse]
  }
  @scala.inline
  implicit class ListFilteredBidRequestsResponseOps[Self <: ListFilteredBidRequestsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalloutStatusRows(value: js.Array[CalloutStatusRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutStatusRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutStatusRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutStatusRows")(js.undefined)
        ret
    }
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
  }
  
}

