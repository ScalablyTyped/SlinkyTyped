package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The set of metrics that are measured in numbers of impressions,
  * representing how many impressions with the specified dimension values were
  * considered eligible at each stage of the bidding funnel.
  */
@js.native
trait SchemaImpressionMetricsRow extends js.Object {
  /**
    * The number of impressions available to the buyer on Ad Exchange. In some
    * cases this value may be unavailable.
    */
  var availableImpressions: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The number of impressions for which Ad Exchange sent the buyer a bid
    * request.
    */
  var bidRequests: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The number of impressions that match the buyer&#39;s inventory
    * pretargeting.
    */
  var inventoryMatches: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The number of impressions for which Ad Exchange received a response from
    * the buyer that contained at least one applicable bid.
    */
  var responsesWithBids: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.native
  /**
    * The number of impressions for which the buyer successfully sent a
    * response to Ad Exchange.
    */
  var successfulResponses: js.UndefOr[SchemaMetricValue] = js.native
}

object SchemaImpressionMetricsRow {
  @scala.inline
  def apply(): SchemaImpressionMetricsRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImpressionMetricsRow]
  }
  @scala.inline
  implicit class SchemaImpressionMetricsRowOps[Self <: SchemaImpressionMetricsRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableImpressions(value: SchemaMetricValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableImpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableImpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableImpressions")(js.undefined)
        ret
    }
    @scala.inline
    def withBidRequests(value: SchemaMetricValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBidRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withInventoryMatches(value: SchemaMetricValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventoryMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInventoryMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventoryMatches")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsesWithBids(value: SchemaMetricValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsesWithBids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsesWithBids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsesWithBids")(js.undefined)
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
    def withSuccessfulResponses(value: SchemaMetricValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successfulResponses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessfulResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successfulResponses")(js.undefined)
        ret
    }
  }
  
}

