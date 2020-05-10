package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaReturnShipment extends js.Object {
  var creationDate: js.UndefOr[String] = js.native
  var deliveryDate: js.UndefOr[String] = js.native
  var returnMethodType: js.UndefOr[String] = js.native
  var shipmentId: js.UndefOr[String] = js.native
  var shipmentTrackingInfos: js.UndefOr[js.Array[SchemaShipmentTrackingInfo]] = js.native
  var shippingDate: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
}

object SchemaReturnShipment {
  @scala.inline
  def apply(): SchemaReturnShipment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReturnShipment]
  }
  @scala.inline
  implicit class SchemaReturnShipmentOps[Self <: SchemaReturnShipment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withReturnMethodType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnMethodType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnMethodType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnMethodType")(js.undefined)
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
    def withShipmentTrackingInfos(value: js.Array[SchemaShipmentTrackingInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipmentTrackingInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipmentTrackingInfos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipmentTrackingInfos")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingDate")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

