package typingsSlinky.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebase.mod.analytics.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shipping
  extends /* key */ StringDictionary[js.Any] {
  var currency: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Array[Item]] = js.native
  var shipping: js.UndefOr[typingsSlinky.firebase.mod.analytics.Currency] = js.native
  var tax: js.UndefOr[typingsSlinky.firebase.mod.analytics.Currency] = js.native
  var transaction_id: js.UndefOr[String] = js.native
  var value: js.UndefOr[Double] = js.native
}

object Shipping {
  @scala.inline
  def apply(): Shipping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shipping]
  }
  @scala.inline
  implicit class ShippingOps[Self <: Shipping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[Item]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping(value: typingsSlinky.firebase.mod.analytics.Currency): Self = {
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
    def withTax(value: typingsSlinky.firebase.mod.analytics.Currency): Self = {
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
    @scala.inline
    def withTransaction_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransaction_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction_id")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

