package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderShipment extends js.Object {
  /**
    * The carrier handling the shipment.
    *
    * Acceptable values are:
    * - "gsx"
    * - "ups"
    * - "united parcel service"
    * - "usps"
    * - "united states postal service"
    * - "fedex"
    * - "dhl"
    * - "ecourier"
    * - "cxt"
    * - "google"
    * - "on trac"
    * - "ontrac"
    * - "on-trac"
    * - "on_trac"
    * - "delvic"
    * - "dynamex"
    * - "lasership"
    * - "smartpost"
    * - "fedex smartpost"
    * - "mpx"
    * - "uds"
    * - "united delivery service"
    */
  var carrier: js.UndefOr[String] = js.native
  /** Date on which the shipment has been created, in ISO 8601 format. */
  var creationDate: js.UndefOr[String] = js.native
  /** Date on which the shipment has been delivered, in ISO 8601 format. Present only if status is delievered */
  var deliveryDate: js.UndefOr[String] = js.native
  /** The id of the shipment. */
  var id: js.UndefOr[String] = js.native
  /** The line items that are shipped. */
  var lineItems: js.UndefOr[js.Array[OrderShipmentLineItemShipment]] = js.native
  /** The status of the shipment. */
  var status: js.UndefOr[String] = js.native
  /** The tracking id for the shipment. */
  var trackingId: js.UndefOr[String] = js.native
}

object OrderShipment {
  @scala.inline
  def apply(): OrderShipment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderShipment]
  }
  @scala.inline
  implicit class OrderShipmentOps[Self <: OrderShipment] (val x: Self) extends AnyVal {
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
    def withCreationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryDate")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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

