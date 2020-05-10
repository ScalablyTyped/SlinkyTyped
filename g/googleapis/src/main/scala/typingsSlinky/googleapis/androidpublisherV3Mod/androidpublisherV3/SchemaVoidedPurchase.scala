package typingsSlinky.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A VoidedPurchase resource indicates a purchase that was either
  * canceled/refunded/charged-back.
  */
@js.native
trait SchemaVoidedPurchase extends js.Object {
  /**
    * This kind represents a voided purchase object in the androidpublisher
    * service.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The time at which the purchase was made, in milliseconds since the epoch
    * (Jan 1, 1970).
    */
  var purchaseTimeMillis: js.UndefOr[String] = js.native
  /**
    * The token that was generated when a purchase was made. This uniquely
    * identifies a purchase.
    */
  var purchaseToken: js.UndefOr[String] = js.native
  /**
    * The time at which the purchase was canceled/refunded/charged-back, in
    * milliseconds since the epoch (Jan 1, 1970).
    */
  var voidedTimeMillis: js.UndefOr[String] = js.native
}

object SchemaVoidedPurchase {
  @scala.inline
  def apply(): SchemaVoidedPurchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoidedPurchase]
  }
  @scala.inline
  implicit class SchemaVoidedPurchaseOps[Self <: SchemaVoidedPurchase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPurchaseToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurchaseToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseToken")(js.undefined)
        ret
    }
    @scala.inline
    def withVoidedTimeMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voidedTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoidedTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voidedTimeMillis")(js.undefined)
        ret
    }
  }
  
}

