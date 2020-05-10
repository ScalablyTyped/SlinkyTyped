package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The set of metrics that are measured in numbers of bids, representing how
  * many bids with the specified dimension values were considered eligible at
  * each stage of the bidding funnel;
  */
@js.native
trait SchemaBidMetricsRow extends js.Object {
  /**
    * The number of bids that Ad Exchange received from the buyer.
    */
  var bids: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The number of bids that were permitted to compete in the auction.
    */
  var bidsInAuction: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The number of bids for which the buyer was billed.
    */
  var billedImpressions: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The number of bids that won an impression.
    */
  var impressionsWon: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The number of bids for which the corresponding impression was measurable
    * for viewability (as defined by Active View).
    */
  var measurableImpressions: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.native
  /**
    * The number of bids for which the corresponding impression was viewable
    * (as defined by Active View).
    */
  var viewableImpressions: js.UndefOr[SchemaMetricValue] = js.native
}

object SchemaBidMetricsRow {
  @scala.inline
  def apply(): SchemaBidMetricsRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBidMetricsRow]
  }
  @scala.inline
  implicit class SchemaBidMetricsRowOps[Self <: SchemaBidMetricsRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBids(value: SchemaMetricValue): Self = {
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
    def withBidsInAuction(value: SchemaMetricValue): Self = {
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
    def withBilledImpressions(value: SchemaMetricValue): Self = {
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
    def withImpressionsWon(value: SchemaMetricValue): Self = {
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
    def withMeasurableImpressions(value: SchemaMetricValue): Self = {
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
    def withRowDimensions(value: SchemaRowDimensions): Self = {
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
    def withViewableImpressions(value: SchemaMetricValue): Self = {
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

