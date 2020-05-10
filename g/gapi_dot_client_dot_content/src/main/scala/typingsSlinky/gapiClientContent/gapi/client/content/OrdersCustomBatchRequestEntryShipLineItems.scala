package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersCustomBatchRequestEntryShipLineItems extends js.Object {
  /**
    * Deprecated. Please use shipmentInfo instead. The carrier handling the shipment. See shipments[].carrier in the  Orders resource representation for a
    * list of acceptable values.
    */
  var carrier: js.UndefOr[String] = js.native
  /** Line items to ship. */
  var lineItems: js.UndefOr[js.Array[OrderShipmentLineItemShipment]] = js.native
  /** Deprecated. Please use shipmentInfo instead. The ID of the shipment. */
  var shipmentId: js.UndefOr[String] = js.native
  /** Shipment information. This field is repeated because a single line item can be shipped in several packages (and have several tracking IDs). */
  var shipmentInfos: js.UndefOr[js.Array[OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]] = js.native
  /** Deprecated. Please use shipmentInfo instead. The tracking id for the shipment. */
  var trackingId: js.UndefOr[String] = js.native
}

object OrdersCustomBatchRequestEntryShipLineItems {
  @scala.inline
  def apply(): OrdersCustomBatchRequestEntryShipLineItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryShipLineItems]
  }
  @scala.inline
  implicit class OrdersCustomBatchRequestEntryShipLineItemsOps[Self <: OrdersCustomBatchRequestEntryShipLineItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCarrier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarrier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrier")(js.undefined)
        ret
    }
    @scala.inline
    def withLineItems(value: js.Array[OrderShipmentLineItemShipment]): Self = {
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
    def withShipmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withShipmentInfos(value: js.Array[OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]): Self = {
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
    @scala.inline
    def withTrackingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingId")(js.undefined)
        ret
    }
  }
  
}

