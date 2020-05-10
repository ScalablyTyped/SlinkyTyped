package typingsSlinky.coinbaseCommerceNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Price object.
  */
@js.native
trait Price[Currency] extends js.Object {
  var amount: String = js.native
  var currency: Currency = js.native
}

object Price {
  @scala.inline
  def apply[Currency](amount: String, currency: Currency): Price[Currency] = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[Price[Currency]]
  }
  @scala.inline
  implicit class PriceOps[Self[currency] <: Price[currency], Currency] (val x: Self[Currency]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Currency] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Currency]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Currency] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Currency] with Other]
    @scala.inline
    def withAmount(value: String): Self[Currency] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: Currency): Self[Currency] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

