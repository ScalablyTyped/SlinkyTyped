package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersShipLineItemsRequest extends js.Object {
  /**
    * Line items to ship.
    */
  var lineItems: js.UndefOr[js.Array[SchemaOrderShipmentLineItemShipment]] = js.native
  /**
    * The ID of the operation. Unique across all operations for a given order.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * ID of the shipment group. Required for orders that use the orderinvoices
    * service.
    */
  var shipmentGroupId: js.UndefOr[String] = js.native
  /**
    * Shipment information. This field is repeated because a single line item
    * can be shipped in several packages (and have several tracking IDs).
    */
  var shipmentInfos: js.UndefOr[js.Array[SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]] = js.native
}

object SchemaOrdersShipLineItemsRequest {
  @scala.inline
  def apply(): SchemaOrdersShipLineItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersShipLineItemsRequest]
  }
  @scala.inline
  implicit class SchemaOrdersShipLineItemsRequestOps[Self <: SchemaOrdersShipLineItemsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineItems(value: js.Array[SchemaOrderShipmentLineItemShipment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItems")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationId")(js.undefined)
        ret
    }
    @scala.inline
    def withShipmentGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipmentGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipmentGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipmentGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withShipmentInfos(value: js.Array[SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipmentInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipmentInfos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipmentInfos")(js.undefined)
        ret
    }
  }
  
}

