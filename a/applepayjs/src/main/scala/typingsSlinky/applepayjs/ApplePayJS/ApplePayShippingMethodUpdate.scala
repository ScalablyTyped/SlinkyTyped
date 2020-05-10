package typingsSlinky.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updated transaction details resulting from a change in shipping method.
  */
@js.native
trait ApplePayShippingMethodUpdate extends js.Object {
  /**
    * An optional list of updated line items.
    */
  var newLineItems: js.UndefOr[js.Array[ApplePayLineItem]] = js.native
  /**
    * The new total resulting from a change in the shipping method.
    */
  var newTotal: ApplePayLineItem = js.native
}

object ApplePayShippingMethodUpdate {
  @scala.inline
  def apply(newTotal: ApplePayLineItem): ApplePayShippingMethodUpdate = {
    val __obj = js.Dynamic.literal(newTotal = newTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayShippingMethodUpdate]
  }
  @scala.inline
  implicit class ApplePayShippingMethodUpdateOps[Self <: ApplePayShippingMethodUpdate] (val x: Self) extends AnyVal {
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

