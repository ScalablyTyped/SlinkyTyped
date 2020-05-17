package typingsSlinky.paypalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayPalItem extends js.Object {
  /**
    * ISO standard currency code.
    */
  var currency: String = js.native
  /**
    * Name of the item. 127 characters max.
    */
  var name: String = js.native
  /**
    * Unit price for this item 10 characters max.
    * May be negative for "coupon" etc.
    */
  var price: String = js.native
  /**
    * Number of units. 10 characters max.
    */
  var quantity: Double = js.native
  /**
    * The stock keeping unit for this item. 50 characters max (optional).
    */
  var sku: String = js.native
}

object PayPalItem {
  @scala.inline
  def apply(currency: String, name: String, price: String, quantity: Double, sku: String): PayPalItem = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayPalItem]
  }
  @scala.inline
  implicit class PayPalItemOps[Self <: PayPalItem] (val x: Self) extends AnyVal {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSku(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sku")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

