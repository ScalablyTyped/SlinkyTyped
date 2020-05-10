package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BidMetricsRow extends js.Object {
  /** The number of bids that Ad Exchange received from the buyer. */
  var bids: js.UndefOr[MetricValue] = js.native
  /** The number of bids that were permitted to compete in the auction. */
  var bidsInAuction: js.UndefOr[MetricValue] = js.native
  /** The number of bids for which the buyer was billed. */
  var billedImpressions: js.UndefOr[MetricValue] = js.native
  /** The number of bids that won an impression. */
  var impressionsWon: js.UndefOr[MetricValue] = js.native
  /**
    * The number of bids for which the corresponding impression was measurable
    * for viewability (as defined by Active View).
    */
  var measurableImpressions: js.UndefOr[MetricValue] = js.native
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.native
  /**
    * The number of bids for which the corresponding impression was viewable (as
    * defined by Active View).
    */
  var viewableImpressions: js.UndefOr[MetricValue] = js.native
}

object BidMetricsRow {
  @scala.inline
  def apply(): BidMetricsRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BidMetricsRow]
  }
  @scala.inline
  implicit class BidMetricsRowOps[Self <: BidMetricsRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBids(value: MetricValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bids")(js.undefined)
        ret
    }
    @scala.inline
    def withBidsInAuction(value: MetricValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidsInAuction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBidsInAuction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidsInAuction")(js.undefined)
        ret
    }
    @scala.inline
    def withBilledImpressions(value: MetricValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billedImpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBilledImpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billedImpressions")(js.undefined)
        ret
    }
    @scala.inline
    def withImpressionsWon(value: MetricValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionsWon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpressionsWon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionsWon")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasurableImpressions(value: MetricValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurableImpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasurableImpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurableImpressions")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDimensions(value: RowDimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withViewableImpressions(value: MetricValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewableImpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewableImpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewableImpressions")(js.undefined)
        ret
    }
  }
  
}

