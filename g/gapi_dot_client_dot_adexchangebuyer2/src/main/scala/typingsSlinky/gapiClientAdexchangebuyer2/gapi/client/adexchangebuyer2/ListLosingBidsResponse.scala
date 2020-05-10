package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLosingBidsResponse extends js.Object {
  /**
    * List of rows, with counts of losing bids aggregated by loss reason (i.e.
    * creative status).
    */
  var creativeStatusRows: js.UndefOr[js.Array[CreativeStatusRow]] = js.native
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListLosingBidsRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.losingBids.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListLosingBidsResponse {
  @scala.inline
  def apply(): ListLosingBidsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLosingBidsResponse]
  }
  @scala.inline
  implicit class ListLosingBidsResponseOps[Self <: ListLosingBidsResponse] (val x: Self) extends AnyVal {
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

