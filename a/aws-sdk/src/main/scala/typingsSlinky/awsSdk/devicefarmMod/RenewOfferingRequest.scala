package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenewOfferingRequest extends js.Object {
  /**
    * The ID of a request to renew an offering.
    */
  var offeringId: js.UndefOr[OfferingIdentifier] = js.native
  /**
    * The quantity requested in an offering renewal.
    */
  var quantity: js.UndefOr[Integer] = js.native
}

object RenewOfferingRequest {
  @scala.inline
  def apply(): RenewOfferingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenewOfferingRequest]
  }
  @scala.inline
  implicit class RenewOfferingRequestOps[Self <: RenewOfferingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOfferingId(value: OfferingIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offeringId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offeringId")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantity(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
        ret
    }
  }
  
}

