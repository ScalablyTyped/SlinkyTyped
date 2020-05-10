package typingsSlinky.reactNativeGoogleAnalyticsBridge.productMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  var affiliation: js.UndefOr[String] = js.native
  var couponCode: js.UndefOr[String] = js.native
  var id: String = js.native
  var revenue: js.UndefOr[Double] = js.native
  var shipping: js.UndefOr[Double] = js.native
  var tax: js.UndefOr[Double] = js.native
}

object Transaction {
  @scala.inline
  def apply(id: String): Transaction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  @scala.inline
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAffiliation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affiliation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAffiliation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affiliation")(js.undefined)
        ret
    }
    @scala.inline
    def withCouponCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("couponCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCouponCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("couponCode")(js.undefined)
        ret
    }
    @scala.inline
    def withRevenue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revenue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevenue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revenue")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(js.undefined)
        ret
    }
    @scala.inline
    def withTax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax")(js.undefined)
        ret
    }
  }
  
}

