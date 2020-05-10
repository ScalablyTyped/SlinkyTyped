package typingsSlinky.recurlyRecurlyJs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.recurlyRecurlyJs.subscriptionMod.SubscriptionPricingStateTax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBase extends js.Object {
  var addons: StringDictionary[String] = js.native
  var base: AnonPlan = js.native
  var currency: AnonCode = js.native
  var next: AnonAddons = js.native
  var now: AnonAddons = js.native
  var taxes: js.Array[SubscriptionPricingStateTax] = js.native
}

object AnonBase {
  @scala.inline
  def apply(
    addons: StringDictionary[String],
    base: AnonPlan,
    currency: AnonCode,
    next: AnonAddons,
    now: AnonAddons,
    taxes: js.Array[SubscriptionPricingStateTax]
  ): AnonBase = {
    val __obj = js.Dynamic.literal(addons = addons.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], taxes = taxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBase]
  }
  @scala.inline
  implicit class AnonBaseOps[Self <: AnonBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddons(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase(value: AnonPlan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: AnonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: AnonAddons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNow(value: AnonAddons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaxes(value: js.Array[SubscriptionPricingStateTax]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

