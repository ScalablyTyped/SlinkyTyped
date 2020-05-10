package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFilteredBidsResponse extends js.Object {
  /**
    * List of rows, with counts of filtered bids aggregated by filtering reason
    * (i.e. creative status).
    */
  var creativeStatusRows: js.UndefOr[js.Array[CreativeStatusRow]] = js.native
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListFilteredBidsRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.filteredBids.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListFilteredBidsResponse {
  @scala.inline
  def apply(): ListFilteredBidsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFilteredBidsResponse]
  }
  @scala.inline
  implicit class ListFilteredBidsResponseOps[Self <: ListFilteredBidsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreativeStatusRows(value: js.Array[CreativeStatusRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeStatusRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeStatusRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeStatusRows")(js.undefined)
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

