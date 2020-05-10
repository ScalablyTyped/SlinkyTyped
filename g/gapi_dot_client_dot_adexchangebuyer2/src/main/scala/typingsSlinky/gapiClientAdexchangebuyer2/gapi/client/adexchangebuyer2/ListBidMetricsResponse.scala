package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBidMetricsResponse extends js.Object {
  /** List of rows, each containing a set of bid metrics. */
  var bidMetricsRows: js.UndefOr[js.Array[BidMetricsRow]] = js.native
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListBidMetricsRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.bidMetrics.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListBidMetricsResponse {
  @scala.inline
  def apply(): ListBidMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBidMetricsResponse]
  }
  @scala.inline
  implicit class ListBidMetricsResponseOps[Self <: ListBidMetricsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBidMetricsRows(value: js.Array[BidMetricsRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidMetricsRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBidMetricsRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidMetricsRows")(js.undefined)
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

