package typingsSlinky.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updated transaction details resulting from a change in shipping contact, including any errors.
  */
@js.native
trait ApplePayShippingContactUpdate extends js.Object {
  /**
    * List of custom errors to display on the payment sheet.
    */
  var errors: js.UndefOr[js.Array[ApplePayError]] = js.native
  /**
    * An optional list of updated line items.
    */
  var newLineItems: js.UndefOr[js.Array[ApplePayLineItem]] = js.native
  /**
    * A list of shipping methods that are available to the updated shipping contact.
    */
  var newShippingMethods: js.UndefOr[js.Array[ApplePayShippingMethod]] = js.native
  /**
    * The new total resulting from a change in the shipping contact.
    */
  var newTotal: ApplePayLineItem = js.native
}

object ApplePayShippingContactUpdate {
  @scala.inline
  def apply(newTotal: ApplePayLineItem): ApplePayShippingContactUpdate = {
    val __obj = js.Dynamic.literal(newTotal = newTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayShippingContactUpdate]
  }
  @scala.inline
  implicit class ApplePayShippingContactUpdateOps[Self <: ApplePayShippingContactUpdate] (val x: Self) extends AnyVal {
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
    def withErrors(value: js.Array[ApplePayError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
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
    @scala.inline
    def withNewShippingMethods(value: js.Array[ApplePayShippingMethod]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newShippingMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewShippingMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newShippingMethods")(js.undefined)
        ret
    }
  }
  
}

