package typingsSlinky.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updated transaction details resulting from a change in payment method.
  */
@js.native
trait ApplePayPaymentMethodUpdate extends js.Object {
  /**
    * An optional list of line items.
    */
  var newLineItems: js.UndefOr[js.Array[ApplePayLineItem]] = js.native
  /**
    * The new total resulting from a change in the payment method.
    */
  var newTotal: ApplePayLineItem = js.native
}

object ApplePayPaymentMethodUpdate {
  @scala.inline
  def apply(newTotal: ApplePayLineItem): ApplePayPaymentMethodUpdate = {
    val __obj = js.Dynamic.literal(newTotal = newTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentMethodUpdate]
  }
  @scala.inline
  implicit class ApplePayPaymentMethodUpdateOps[Self <: ApplePayPaymentMethodUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewTotal(value: ApplePayLineItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewLineItems(value: js.Array[ApplePayLineItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLineItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewLineItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLineItems")(js.undefined)
        ret
    }
  }
  
}

