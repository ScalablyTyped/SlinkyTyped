package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of bids with the specified dimension values that did not win the
  * auction (either were filtered pre-auction or lost the auction), as
  * described by the specified creative status.
  */
@js.native
trait SchemaCreativeStatusRow extends js.Object {
  /**
    * The number of bids with the specified status.
    */
  var bidCount: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The ID of the creative status. See
    * [creative-status-codes](https://developers.google.com/authorized-buyers/rtb/downloads/creative-status-codes).
    */
  var creativeStatusId: js.UndefOr[Double] = js.native
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.native
}

object SchemaCreativeStatusRow {
  @scala.inline
  def apply(): SchemaCreativeStatusRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeStatusRow]
  }
  @scala.inline
  implicit class SchemaCreativeStatusRowOps[Self <: SchemaCreativeStatusRow] (val x: Self) extends AnyVal {
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
    def withCreativeStatusId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeStatusId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeStatusId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeStatusId")(js.undefined)
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

