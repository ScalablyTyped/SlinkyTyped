package typingsSlinky.paypalRestSdk.mod.invoice

import typingsSlinky.paypalRestSdk.mod.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvoiceItem extends js.Object {
  var date: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var discount: js.UndefOr[Cost] = js.native
  var name: String = js.native
  var quantity: Double = js.native
  var tax: js.UndefOr[Tax] = js.native
  var unit_of_measure: js.UndefOr[String] = js.native
  var unit_price: Currency = js.native
}

object InvoiceItem {
  @scala.inline
  def apply(name: String, quantity: Double, unit_price: Currency): InvoiceItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], unit_price = unit_price.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvoiceItem]
  }
  @scala.inline
  implicit class InvoiceItemOps[Self <: InvoiceItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnit_price(value: Currency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit_price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscount(value: Cost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discount")(js.undefined)
        ret
    }
    @scala.inline
    def withTax(value: Tax): Self = {
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
    def withUnit_of_measure(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit_of_measure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit_of_measure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit_of_measure")(js.undefined)
        ret
    }
  }
  
}

