package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of filtered bids with the specified dimension values that have
  * the specified creative.
  */
@js.native
trait SchemaFilteredBidCreativeRow extends js.Object {
  /**
    * The number of bids with the specified creative.
    */
  var bidCount: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The ID of the creative.
    */
  var creativeId: js.UndefOr[String] = js.native
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.native
}

object SchemaFilteredBidCreativeRow {
  @scala.inline
  def apply(): SchemaFilteredBidCreativeRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilteredBidCreativeRow]
  }
  @scala.inline
  implicit class SchemaFilteredBidCreativeRowOps[Self <: SchemaFilteredBidCreativeRow] (val x: Self) extends AnyVal {
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
    def withCreativeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeId")(js.undefined)
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

