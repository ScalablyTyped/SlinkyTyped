package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3Promotion extends js.Object {
  /**
    * Required: Coupon code applied to this offer.
    */
  var coupon: js.UndefOr[String] = js.native
}

object GoogleActionsOrdersV3Promotion {
  @scala.inline
  def apply(): GoogleActionsOrdersV3Promotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3Promotion]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3PromotionOps[Self <: GoogleActionsOrdersV3Promotion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoupon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coupon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoupon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coupon")(js.undefined)
        ret
    }
  }
  
}

