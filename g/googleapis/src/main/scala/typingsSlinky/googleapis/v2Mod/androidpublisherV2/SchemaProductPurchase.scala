package typingsSlinky.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ProductPurchase resource indicates the status of a user&#39;s inapp
  * product purchase.
  */
@js.native
trait SchemaProductPurchase extends js.Object {
  /**
    * The consumption state of the inapp product. Possible values are:   - Yet
    * to be consumed  - Consumed
    */
  var consumptionState: js.UndefOr[Double] = js.native
  /**
    * A developer-specified string that contains supplemental information about
    * an order.
    */
  var developerPayload: js.UndefOr[String] = js.native
  /**
    * This kind represents an inappPurchase object in the androidpublisher
    * service.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The order id associated with the purchase of the inapp product.
    */
  var orderId: js.UndefOr[String] = js.native
  /**
    * The purchase state of the order. Possible values are:   - Purchased  -
    * Canceled
    */
  var purchaseState: js.UndefOr[Double] = js.native
  /**
    * The time the product was purchased, in milliseconds since the epoch (Jan
    * 1, 1970).
    */
  var purchaseTimeMillis: js.UndefOr[String] = js.native
  /**
    * The type of purchase of the inapp product. This field is only set if this
    * purchase was not made using the standard in-app billing flow. Possible
    * values are:   - Test (i.e. purchased from a license testing account)  -
    * Promo (i.e. purchased using a promo code)  - Rewarded (i.e. from watching
    * a video ad instead of paying)
    */
  var purchaseType: js.UndefOr[Double] = js.native
}

object SchemaProductPurchase {
  @scala.inline
  def apply(): SchemaProductPurchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductPurchase]
  }
  @scala.inline
  implicit class SchemaProductPurchaseOps[Self <: SchemaProductPurchase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumptionState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumptionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumptionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumptionState")(js.undefined)
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
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
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
    def withPurchaseState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurchaseState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseState")(js.undefined)
        ret
    }
    @scala.inline
    def withPurchaseTimeMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurchaseTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseTimeMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withPurchaseType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurchaseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseType")(js.undefined)
        ret
    }
  }
  
}

