package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BidResponseWithoutBidsStatusRow extends js.Object {
  /**
    * The number of impressions for which there was a bid response with the
    * specified status.
    */
  var impressionCount: js.UndefOr[MetricValue] = js.native
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.native
  /**
    * The status specifying why the bid responses were considered to have no
    * applicable bids.
    */
  var status: js.UndefOr[String] = js.native
}

object BidResponseWithoutBidsStatusRow {
  @scala.inline
  def apply(): BidResponseWithoutBidsStatusRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BidResponseWithoutBidsStatusRow]
  }
  @scala.inline
  implicit class BidResponseWithoutBidsStatusRowOps[Self <: BidResponseWithoutBidsStatusRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImpressionCount(value: MetricValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpressionCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionCount")(js.undefined)
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
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

