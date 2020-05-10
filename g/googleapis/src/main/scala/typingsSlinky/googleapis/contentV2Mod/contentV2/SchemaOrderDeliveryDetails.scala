package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderDeliveryDetails extends js.Object {
  /**
    * The delivery address
    */
  var address: js.UndefOr[SchemaOrderAddress] = js.native
  /**
    * The phone number of the person receiving the delivery.
    */
  var phoneNumber: js.UndefOr[String] = js.native
}

object SchemaOrderDeliveryDetails {
  @scala.inline
  def apply(): SchemaOrderDeliveryDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderDeliveryDetails]
  }
  @scala.inline
  implicit class SchemaOrderDeliveryDetailsOps[Self <: SchemaOrderDeliveryDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: SchemaOrderAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(js.undefined)
        ret
    }
  }
  
}

