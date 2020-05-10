package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderShipment extends js.Object {
  /**
    * The carrier handling the shipment.  Acceptable values for US are:   -
    * &quot;gsx&quot;  - &quot;ups&quot;  - &quot;usps&quot;  -
    * &quot;fedex&quot;  - &quot;dhl&quot;  - &quot;ecourier&quot;  -
    * &quot;cxt&quot;  - &quot;google&quot;  - &quot;ontrac&quot;  -
    * &quot;emsy&quot;  - &quot;ont&quot;  - &quot;deliv&quot;  -
    * &quot;dynamex&quot;  - &quot;lasership&quot;  - &quot;mpx&quot;  -
    * &quot;uds&quot;    Acceptable values for FR are:   -
    * &quot;colissimo&quot;  - &quot;chronopost&quot;
    */
  var carrier: js.UndefOr[String] = js.native
  /**
    * Date on which the shipment has been created, in ISO 8601 format.
    */
  var creationDate: js.UndefOr[String] = js.native
  /**
    * Date on which the shipment has been delivered, in ISO 8601 format.
    * Present only if status is delivered
    */
  var deliveryDate: js.UndefOr[String] = js.native
  /**
    * The ID of the shipment.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The line items that are shipped.
    */
  var lineItems: js.UndefOr[js.Array[SchemaOrderShipmentLineItemShipment]] = js.native
  /**
    * The status of the shipment.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The tracking ID for the shipment.
    */
  var trackingId: js.UndefOr[String] = js.native
}

object SchemaOrderShipment {
  @scala.inline
  def apply(): SchemaOrderShipment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderShipment]
  }
  @scala.inline
  implicit class SchemaOrderShipmentOps[Self <: SchemaOrderShipment] (val x: Self) extends AnyVal {
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

