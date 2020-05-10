package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FacilitatedDetails extends js.Object {
  var merchantId: String = js.native
  var merchantName: String = js.native
  var paymentMethodNonce: String = js.native
}

object FacilitatedDetails {
  @scala.inline
  def apply(merchantId: String, merchantName: String, paymentMethodNonce: String): FacilitatedDetails = {
    val __obj = js.Dynamic.literal(merchantId = merchantId.asInstanceOf[js.Any], merchantName = merchantName.asInstanceOf[js.Any], paymentMethodNonce = paymentMethodNonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacilitatedDetails]
  }
  @scala.inline
  implicit class FacilitatedDetailsOps[Self <: FacilitatedDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMerchantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerchantName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaymentMethodNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodNonce")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

