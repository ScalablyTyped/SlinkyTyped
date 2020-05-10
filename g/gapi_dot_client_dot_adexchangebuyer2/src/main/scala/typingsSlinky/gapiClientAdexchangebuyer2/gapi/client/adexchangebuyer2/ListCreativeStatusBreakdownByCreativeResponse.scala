package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCreativeStatusBreakdownByCreativeResponse extends js.Object {
  /**
    * List of rows, with counts of bids with a given creative status aggregated
    * by creative.
    */
  var filteredBidCreativeRows: js.UndefOr[js.Array[FilteredBidCreativeRow]] = js.native
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListCreativeStatusBreakdownByCreativeRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.filteredBids.creatives.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListCreativeStatusBreakdownByCreativeResponse {
  @scala.inline
  def apply(): ListCreativeStatusBreakdownByCreativeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCreativeStatusBreakdownByCreativeResponse]
  }
  @scala.inline
  implicit class ListCreativeStatusBreakdownByCreativeResponseOps[Self <: ListCreativeStatusBreakdownByCreativeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilteredBidCreativeRows(value: js.Array[FilteredBidCreativeRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredBidCreativeRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteredBidCreativeRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredBidCreativeRows")(js.undefined)
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

