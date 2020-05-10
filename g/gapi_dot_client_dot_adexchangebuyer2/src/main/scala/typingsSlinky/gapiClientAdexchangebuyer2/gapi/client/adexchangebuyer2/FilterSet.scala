package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterSet extends js.Object {
  /**
    * An absolute date range, defined by a start date and an end date.
    * Interpreted relative to Pacific time zone.
    */
  var absoluteDateRange: js.UndefOr[AbsoluteDateRange] = js.native
  /** The ID of the buyer account on which to filter; optional. */
  var buyerAccountId: js.UndefOr[String] = js.native
  /** The ID of the creative on which to filter; optional. */
  var creativeId: js.UndefOr[String] = js.native
  /** The ID of the deal on which to filter; optional. */
  var dealId: js.UndefOr[String] = js.native
  /** The environment on which to filter; optional. */
  var environment: js.UndefOr[String] = js.native
  /**
    * The ID of the filter set; unique within the account of the filter set
    * owner.
    * The value of this field is ignored in create operations.
    */
  var filterSetId: js.UndefOr[String] = js.native
  /** The format on which to filter; optional. */
  var format: js.UndefOr[String] = js.native
  /**
    * The account ID of the buyer who owns this filter set.
    * The value of this field is ignored in create operations.
    */
  var ownerAccountId: js.UndefOr[String] = js.native
  /**
    * The list of platforms on which to filter; may be empty. The filters
    * represented by multiple platforms are ORed together (i.e. if non-empty,
    * results must match any one of the platforms).
    */
  var platforms: js.UndefOr[js.Array[String]] = js.native
  /**
    * An open-ended realtime time range, defined by the aggregation start
    * timestamp.
    */
  var realtimeTimeRange: js.UndefOr[RealtimeTimeRange] = js.native
  /**
    * A relative date range, defined by an offset from today and a duration.
    * Interpreted relative to Pacific time zone.
    */
  var relativeDateRange: js.UndefOr[RelativeDateRange] = js.native
  /**
    * The list of IDs of the seller (publisher) networks on which to filter;
    * may be empty. The filters represented by multiple seller network IDs are
    * ORed together (i.e. if non-empty, results must match any one of the
    * publisher networks).
    * See [seller-network-ids](https://developers.google.com/ad-exchange/rtb/downloads/seller-network-ids)
    * file for the set of existing seller network IDs.
    */
  var sellerNetworkIds: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The granularity of time intervals if a time series breakdown is desired;
    * optional.
    */
  var timeSeriesGranularity: js.UndefOr[String] = js.native
}

object FilterSet {
  @scala.inline
  def apply(): FilterSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterSet]
  }
  @scala.inline
  implicit class FilterSetOps[Self <: FilterSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsoluteDateRange(value: AbsoluteDateRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteDateRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsoluteDateRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteDateRange")(js.undefined)
        ret
    }
    @scala.inline
    def withBuyerAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuyerAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeId")(js.undefined)
        ret
    }
    @scala.inline
    def withDealId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDealId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealId")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterSetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSetId")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatforms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(js.undefined)
        ret
    }
    @scala.inline
    def withRealtimeTimeRange(value: RealtimeTimeRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realtimeTimeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealtimeTimeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realtimeTimeRange")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeDateRange(value: RelativeDateRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeDateRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeDateRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeDateRange")(js.undefined)
        ret
    }
    @scala.inline
    def withSellerNetworkIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sellerNetworkIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSellerNetworkIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sellerNetworkIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeSeriesGranularity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSeriesGranularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeSeriesGranularity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSeriesGranularity")(js.undefined)
        ret
    }
  }
  
}

