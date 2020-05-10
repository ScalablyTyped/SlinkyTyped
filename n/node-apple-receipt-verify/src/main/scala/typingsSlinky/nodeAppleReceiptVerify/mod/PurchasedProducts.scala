package typingsSlinky.nodeAppleReceiptVerify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchasedProducts extends js.Object {
   // only if extended = true
  var applicationVersion: js.UndefOr[String] = js.native
  var bundleId: String = js.native
   // only for subscriptions and if extended = true; since v1.5.1
  var environment: js.UndefOr[String] = js.native
  var expirationDate: js.UndefOr[Double] = js.native
   // only for subscriptions and if extended = true
  var isInIntroOfferPeriod: js.UndefOr[Boolean] = js.native
  var isTrialPeriod: js.UndefOr[Boolean] = js.native
   // only if extended = true
  var originalApplicationVersion: js.UndefOr[String] = js.native
   // only if extended = true
  var originalPurchaseDate: js.UndefOr[Double] = js.native
  var productId: String = js.native
  var purchaseDate: Double = js.native
  var quantity: Double = js.native
  var transactionId: String = js.native
}

object PurchasedProducts {
  @scala.inline
  def apply(bundleId: String, productId: String, purchaseDate: Double, quantity: Double, transactionId: String): PurchasedProducts = {
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], purchaseDate = purchaseDate.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchasedProducts]
  }
  @scala.inline
  implicit class PurchasedProductsOps[Self <: PurchasedProducts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPurchaseDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInIntroOfferPeriod(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInIntroOfferPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInIntroOfferPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInIntroOfferPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTrialPeriod(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrialPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTrialPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrialPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalApplicationVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalApplicationVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalApplicationVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalApplicationVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalPurchaseDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalPurchaseDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalPurchaseDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalPurchaseDate")(js.undefined)
        ret
    }
  }
  
}

