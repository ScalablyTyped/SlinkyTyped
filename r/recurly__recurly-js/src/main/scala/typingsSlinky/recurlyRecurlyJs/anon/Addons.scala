package typingsSlinky.recurlyRecurlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Addons extends js.Object {
  var addons: String = js.native
  var discount: String = js.native
  var plan: String = js.native
  var setup_fee: String = js.native
  var subtotal: String = js.native
  var tax: String = js.native
  var total: String = js.native
}

object Addons {
  @scala.inline
  def apply(
    addons: String,
    discount: String,
    plan: String,
    setup_fee: String,
    subtotal: String,
    tax: String,
    total: String
  ): Addons = {
    val __obj = js.Dynamic.literal(addons = addons.asInstanceOf[js.Any], discount = discount.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], setup_fee = setup_fee.asInstanceOf[js.Any], subtotal = subtotal.asInstanceOf[js.Any], tax = tax.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addons]
  }
  @scala.inline
  implicit class AddonsOps[Self <: Addons] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddons(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetup_fee(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup_fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtotal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

