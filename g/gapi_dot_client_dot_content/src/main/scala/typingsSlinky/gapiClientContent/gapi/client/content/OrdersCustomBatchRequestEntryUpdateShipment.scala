package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersCustomBatchRequestEntryUpdateShipment extends js.Object {
  /**
    * The carrier handling the shipment. Not updated if missing. See shipments[].carrier in the  Orders resource representation for a list of acceptable
    * values.
    */
  var carrier: js.UndefOr[String] = js.native
  /** The ID of the shipment. */
  var shipmentId: js.UndefOr[String] = js.native
  /** New status for the shipment. Not updated if missing. */
  var status: js.UndefOr[String] = js.native
  /** The tracking id for the shipment. Not updated if missing. */
  var trackingId: js.UndefOr[String] = js.native
}

object OrdersCustomBatchRequestEntryUpdateShipment {
  @scala.inline
  def apply(): OrdersCustomBatchRequestEntryUpdateShipment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryUpdateShipment]
  }
  @scala.inline
  implicit class OrdersCustomBatchRequestEntryUpdateShipmentOps[Self <: OrdersCustomBatchRequestEntryUpdateShipment] (val x: Self) extends AnyVal {
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

