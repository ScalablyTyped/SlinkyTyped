package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo extends js.Object {
  /**
    * The carrier handling the shipment. See shipments[].carrier in the  Orders
    * resource representation for a list of acceptable values.
    */
  var carrier: js.UndefOr[String] = js.native
  /**
    * The ID of the shipment. This is assigned by the merchant and is unique to
    * each shipment.
    */
  var shipmentId: js.UndefOr[String] = js.native
  /**
    * The tracking ID for the shipment.
    */
  var trackingId: js.UndefOr[String] = js.native
}

object SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo {
  @scala.inline
  def apply(): SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]
  }
  @scala.inline
  implicit class SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfoOps[Self <: SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo] (val x: Self) extends AnyVal {
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

