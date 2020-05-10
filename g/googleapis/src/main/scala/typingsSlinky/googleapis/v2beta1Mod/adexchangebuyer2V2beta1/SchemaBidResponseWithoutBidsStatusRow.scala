package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of impressions with the specified dimension values that were
  * considered to have no applicable bids, as described by the specified
  * status.
  */
@js.native
trait SchemaBidResponseWithoutBidsStatusRow extends js.Object {
  /**
    * The number of impressions for which there was a bid response with the
    * specified status.
    */
  var impressionCount: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.native
  /**
    * The status specifying why the bid responses were considered to have no
    * applicable bids.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaBidResponseWithoutBidsStatusRow {
  @scala.inline
  def apply(): SchemaBidResponseWithoutBidsStatusRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBidResponseWithoutBidsStatusRow]
  }
  @scala.inline
  implicit class SchemaBidResponseWithoutBidsStatusRowOps[Self <: SchemaBidResponseWithoutBidsStatusRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

