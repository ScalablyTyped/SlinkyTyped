package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductAmount extends js.Object {
  var priceAmount: js.UndefOr[Price] = js.native
  var remittedTaxAmount: js.UndefOr[Price] = js.native
  var taxAmount: js.UndefOr[Price] = js.native
}

object ProductAmount {
  @scala.inline
  def apply(): ProductAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductAmount]
  }
  @scala.inline
  implicit class ProductAmountOps[Self <: ProductAmount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPriceAmount(value: Price): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriceAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withRemittedTaxAmount(value: Price): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remittedTaxAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemittedTaxAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remittedTaxAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withTaxAmount(value: Price): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxAmount")(js.undefined)
        ret
    }
  }
  
}

