package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdexchangebuyer2.anon.Fields
import typingsSlinky.gapiClientAdexchangebuyer2.anon.IsTransient
import typingsSlinky.gapiClientAdexchangebuyer2.anon.Pp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterSetsResource extends js.Object {
  var bidMetrics: BidMetricsResource = js.native
  var bidResponseErrors: BidResponseErrorsResource = js.native
  var bidResponsesWithoutBids: BidResponsesWithoutBidsResource = js.native
  var filteredBidRequests: FilteredBidRequestsResource = js.native
  var filteredBids: FilteredBidsResource = js.native
  var impressionMetrics: ImpressionMetricsResource = js.native
  var losingBids: LosingBidsResource = js.native
  var nonBillableWinningBids: NonBillableWinningBidsResource = js.native
  /** Creates the specified filter set for the account with the given account ID. */
  def create(request: IsTransient): Request[FilterSet] = js.native
  /**
    * Deletes the requested filter set from the account with the given account
    * ID.
    */
  def delete(request: Pp): Request[js.Object] = js.native
  /**
    * Retrieves the requested filter set for the account with the given account
    * ID.
    */
  def get(request: Pp): Request[FilterSet] = js.native
  /** Lists all filter sets for the account with the given account ID. */
  def list(request: Fields): Request[ListFilterSetsResponse] = js.native
}

object FilterSetsResource {
  @scala.inline
  def apply(
    bidMetrics: BidMetricsResource,
    bidResponseErrors: BidResponseErrorsResource,
    bidResponsesWithoutBids: BidResponsesWithoutBidsResource,
    create: IsTransient => Request[FilterSet],
    delete: Pp => Request[js.Object],
    filteredBidRequests: FilteredBidRequestsResource,
    filteredBids: FilteredBidsResource,
    get: Pp => Request[FilterSet],
    impressionMetrics: ImpressionMetricsResource,
    list: Fields => Request[ListFilterSetsResponse],
    losingBids: LosingBidsResource,
    nonBillableWinningBids: NonBillableWinningBidsResource
  ): FilterSetsResource = {
    val __obj = js.Dynamic.literal(bidMetrics = bidMetrics.asInstanceOf[js.Any], bidResponseErrors = bidResponseErrors.asInstanceOf[js.Any], bidResponsesWithoutBids = bidResponsesWithoutBids.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), filteredBidRequests = filteredBidRequests.asInstanceOf[js.Any], filteredBids = filteredBids.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), impressionMetrics = impressionMetrics.asInstanceOf[js.Any], list = js.Any.fromFunction1(list), losingBids = losingBids.asInstanceOf[js.Any], nonBillableWinningBids = nonBillableWinningBids.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterSetsResource]
  }
  @scala.inline
  implicit class FilterSetsResourceOps[Self <: FilterSetsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBidMetrics(value: BidMetricsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBidResponseErrors(value: BidResponseErrorsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidResponseErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBidResponsesWithoutBids(value: BidResponsesWithoutBidsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidResponsesWithoutBids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: IsTransient => Request[FilterSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Pp => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilteredBidRequests(value: FilteredBidRequestsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredBidRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilteredBids(value: FilteredBidsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredBids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: Pp => Request[FilterSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImpressionMetrics(value: ImpressionMetricsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: Fields => Request[ListFilterSetsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLosingBids(value: LosingBidsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("losingBids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonBillableWinningBids(value: NonBillableWinningBidsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonBillableWinningBids")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

