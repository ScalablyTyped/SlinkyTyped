package typingsSlinky.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSubscriptionPurchasesDeferRequest extends js.Object {
  /**
    * The information about the new desired expiry time for the subscription.
    */
  var deferralInfo: js.UndefOr[SchemaSubscriptionDeferralInfo] = js.native
}

object SchemaSubscriptionPurchasesDeferRequest {
  @scala.inline
  def apply(): SchemaSubscriptionPurchasesDeferRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionPurchasesDeferRequest]
  }
  @scala.inline
  implicit class SchemaSubscriptionPurchasesDeferRequestOps[Self <: SchemaSubscriptionPurchasesDeferRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeferralInfo(value: SchemaSubscriptionDeferralInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferralInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferralInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferralInfo")(js.undefined)
        ret
    }
  }
  
}

