package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalloutStatusRow extends js.Object {
  /**
    * The ID of the callout status.
    * See [callout-status-codes](https://developers.google.com/ad-exchange/rtb/downloads/callout-status-codes).
    */
  var calloutStatusId: js.UndefOr[Double] = js.native
  /**
    * The number of impressions for which there was a bid request or bid response
    * with the specified callout status.
    */
  var impressionCount: js.UndefOr[MetricValue] = js.native
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.native
}

object CalloutStatusRow {
  @scala.inline
  def apply(): CalloutStatusRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalloutStatusRow]
  }
  @scala.inline
  implicit class CalloutStatusRowOps[Self <: CalloutStatusRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalloutStatusId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutStatusId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutStatusId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutStatusId")(js.undefined)
        ret
    }
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
  }
  
}

