package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of impressions with the specified dimension values where the
  * corresponding bid request or bid response was not successful, as described
  * by the specified callout status.
  */
@js.native
trait SchemaCalloutStatusRow extends js.Object {
  /**
    * The ID of the callout status. See
    * [callout-status-codes](https://developers.google.com/authorized-buyers/rtb/downloads/callout-status-codes).
    */
  var calloutStatusId: js.UndefOr[Double] = js.native
  /**
    * The number of impressions for which there was a bid request or bid
    * response with the specified callout status.
    */
  var impressionCount: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.native
}

object SchemaCalloutStatusRow {
  @scala.inline
  def apply(): SchemaCalloutStatusRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCalloutStatusRow]
  }
  @scala.inline
  implicit class SchemaCalloutStatusRowOps[Self <: SchemaCalloutStatusRow] (val x: Self) extends AnyVal {
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
    def withImpressionCount(value: SchemaMetricValue): Self = {
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
  }
  
}

