package typingsSlinky.inAppPurchase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchasedItem extends js.Object {
    // only Apple
  var appItemId: js.UndefOr[String] = js.native
  var bundleId: js.UndefOr[String] = js.native
   // only Apple
  var cancellationDate: js.UndefOr[Double] = js.native
   // only Apple/Google
  // iTunes, windows and amazon subscription only
  // Google subscriptions only with google play store api info
  var expirationDate: js.UndefOr[Double | String] = js.native
  var isTrial: js.UndefOr[Boolean] = js.native
  var orderId: js.UndefOr[String] = js.native
  var originalPurchaseDate: js.UndefOr[String] = js.native
   // only Google
  var originalTransactionId: js.UndefOr[String] = js.native
  var productId: String = js.native
   // only Apple
  var purchaseDate: Double | String = js.native
  var quantity: Double = js.native
   // only Apple
  var transactionId: String = js.native
}

object PurchasedItem {
  @scala.inline
  def apply(productId: String, purchaseDate: Double | String, quantity: Double, transactionId: String): PurchasedItem = {
    val __obj = js.Dynamic.literal(productId = productId.asInstanceOf[js.Any], purchaseDate = purchaseDate.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchasedItem]
  }
  @scala.inline
  implicit class PurchasedItemOps[Self <: PurchasedItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPurchaseDate(value: Double | String): Self = {
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
    def withAppItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appItemId")(js.undefined)
        ret
    }
    @scala.inline
    def withBundleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleId")(js.undefined)
        ret
    }
    @scala.inline
    def withCancellationDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancellationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationDate(value: Double | String): Self = {
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
    def withIsTrial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTrial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrial")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderId")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalPurchaseDate(value: String): Self = {
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
    @scala.inline
    def withOriginalTransactionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalTransactionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalTransactionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalTransactionId")(js.undefined)
        ret
    }
  }
  
}

