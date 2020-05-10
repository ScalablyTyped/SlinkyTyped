package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of filtered bids with the specified dimension values, among
  * those filtered due to the requested filtering reason (i.e. creative
  * status), that have the specified detail.
  */
@js.native
trait SchemaFilteredBidDetailRow extends js.Object {
  /**
    * The number of bids with the specified detail.
    */
  var bidCount: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The ID of the detail. The associated value can be looked up in the
    * dictionary file corresponding to the DetailType in the response message.
    */
  var detailId: js.UndefOr[Double] = js.native
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.native
}

object SchemaFilteredBidDetailRow {
  @scala.inline
  def apply(): SchemaFilteredBidDetailRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilteredBidDetailRow]
  }
  @scala.inline
  implicit class SchemaFilteredBidDetailRowOps[Self <: SchemaFilteredBidDetailRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBidCount(value: SchemaMetricValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBidCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailId")(js.undefined)
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

