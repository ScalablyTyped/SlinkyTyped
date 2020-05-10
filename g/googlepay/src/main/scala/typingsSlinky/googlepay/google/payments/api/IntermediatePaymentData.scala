package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Intermediate version of payment data.
  *
  * Contains limited user information for developer callbacks.
  */
@js.native
trait IntermediatePaymentData extends js.Object {
  /**
    * Indicate the changing field that triggers the callback.
    */
  var callbackTrigger: js.Array[CallbackTrigger] = js.native
  /**
    * Contains limited data for user selected card information.
    */
  var paymentMethodData: IntermediatePaymentMethodData = js.native
  /**
    * Contains limited data for user selected shipping address information.
    */
  var shippingAddress: js.UndefOr[IntermediateAddress] = js.native
  /**
    * Contains the data for shipping option selected by the user.
    */
  var shippingOptionData: js.UndefOr[SelectionOptionData] = js.native
}

object IntermediatePaymentData {
  @scala.inline
  def apply(callbackTrigger: js.Array[CallbackTrigger], paymentMethodData: IntermediatePaymentMethodData): IntermediatePaymentData = {
    val __obj = js.Dynamic.literal(callbackTrigger = callbackTrigger.asInstanceOf[js.Any], paymentMethodData = paymentMethodData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntermediatePaymentData]
  }
  @scala.inline
  implicit class IntermediatePaymentDataOps[Self <: IntermediatePaymentData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbackTrigger(value: js.Array[CallbackTrigger]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaymentMethodData(value: IntermediatePaymentMethodData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShippingAddress(value: IntermediateAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingOptionData(value: SelectionOptionData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOptionData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingOptionData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOptionData")(js.undefined)
        ret
    }
  }
  
}

