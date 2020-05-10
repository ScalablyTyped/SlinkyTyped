package typingsSlinky.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an individual purchase of a game product.
  */
@js.native
trait Purchase extends js.Object {
  /**
    * A developer-specified string, provided during the purchase of the product
    */
  var developerPayload: js.UndefOr[String] = js.native
  /**
    * The identifier for the purchase transaction
    */
  var paymentID: String = js.native
  /**
    *  The product's game-specified identifier
    */
  var productID: String = js.native
  /**
    * Unix timestamp of when the purchase occurred
    */
  var purchaseTime: String = js.native
  /**
    *  A token representing the purchase that may be used to consume the purchase
    */
  var purchaseToken: String = js.native
  /**
    *  Server-signed encoding of the purchase request
    */
  var signedRequest: SignedPurchaseRequest = js.native
}

object Purchase {
  @scala.inline
  def apply(
    paymentID: String,
    productID: String,
    purchaseTime: String,
    purchaseToken: String,
    signedRequest: SignedPurchaseRequest
  ): Purchase = {
    val __obj = js.Dynamic.literal(paymentID = paymentID.asInstanceOf[js.Any], productID = productID.asInstanceOf[js.Any], purchaseTime = purchaseTime.asInstanceOf[js.Any], purchaseToken = purchaseToken.asInstanceOf[js.Any], signedRequest = signedRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Purchase]
  }
  @scala.inline
  implicit class PurchaseOps[Self <: Purchase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaymentID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPurchaseTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPurchaseToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignedRequest(value: SignedPurchaseRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeveloperPayload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerPayload")(js.undefined)
        ret
    }
  }
  
}

