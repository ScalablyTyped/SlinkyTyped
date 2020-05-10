package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails extends js.Object {
  /**
    * Updated delivery by date, in ISO 8601 format. If not specified only ship
    * by date is updated.  Provided date should be within 1 year timeframe and
    * can not be a date in the past.
    */
  var deliverByDate: js.UndefOr[String] = js.native
  /**
    * The ID of the line item to set metadata. Either lineItemId or productId
    * is required.
    */
  var lineItemId: js.UndefOr[String] = js.native
  /**
    * The ID of the product to set metadata. This is the REST ID used in the
    * products service. Either lineItemId or productId is required.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * Updated ship by date, in ISO 8601 format. If not specified only deliver
    * by date is updated.  Provided date should be within 1 year timeframe and
    * can not be a date in the past.
    */
  var shipByDate: js.UndefOr[String] = js.native
}

object SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails {
  @scala.inline
  def apply(): SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails]
  }
  @scala.inline
  implicit class SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetailsOps[Self <: SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliverByDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliverByDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliverByDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliverByDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLineItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItemId")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
        ret
    }
    @scala.inline
    def withShipByDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipByDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipByDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipByDate")(js.undefined)
        ret
    }
  }
  
}

