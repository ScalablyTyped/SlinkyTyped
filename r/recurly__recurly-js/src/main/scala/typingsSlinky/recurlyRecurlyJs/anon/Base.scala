package typingsSlinky.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.recurlyRecurlyJs.subscriptionMod.SubscriptionPricingStateTax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base extends js.Object {
  var addons: StringDictionary[String] = js.native
  var base: Plan = js.native
  var currency: Code = js.native
  var next: Addons = js.native
  var now: Addons = js.native
  var taxes: js.Array[SubscriptionPricingStateTax] = js.native
}

object Base {
  @scala.inline
  def apply(
    addons: StringDictionary[String],
    base: Plan,
    currency: Code,
    next: Addons,
    now: Addons,
    taxes: js.Array[SubscriptionPricingStateTax]
  ): Base = {
    val __obj = js.Dynamic.literal(addons = addons.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], taxes = taxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
  @scala.inline
  implicit class BaseOps[Self <: Base] (val x: Self) extends AnyVal {
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
    def withBase(value: Plan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: Code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: Addons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNow(value: Addons): Self = {
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

