package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of winning bids with the specified dimension values for which
  * the buyer was not billed, as described by the specified status.
  */
@js.native
trait SchemaNonBillableWinningBidStatusRow extends js.Object {
  /**
    * The number of bids with the specified status.
    */
  var bidCount: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.native
  /**
    * The status specifying why the winning bids were not billed.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaNonBillableWinningBidStatusRow {
  @scala.inline
  def apply(): SchemaNonBillableWinningBidStatusRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonBillableWinningBidStatusRow]
  }
  @scala.inline
  implicit class SchemaNonBillableWinningBidStatusRowOps[Self <: SchemaNonBillableWinningBidStatusRow] (val x: Self) extends AnyVal {
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

