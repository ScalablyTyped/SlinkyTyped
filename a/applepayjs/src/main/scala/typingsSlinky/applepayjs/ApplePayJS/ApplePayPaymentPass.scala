package typingsSlinky.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a provisioned payment card for Apple Pay payments.
  */
@js.native
trait ApplePayPaymentPass extends js.Object {
  /**
    * The activation state of the pass.
    */
  var activationState: ApplePayPaymentPassActivationState = js.native
  /**
    * The unique identifier for the device-specific account number.
    */
  var deviceAccountIdentifier: js.UndefOr[String] = js.native
  /**
    * A version of the device account number suitable for display in your UI.
    */
  var deviceAccountNumberSuffix: js.UndefOr[String] = js.native
  /**
    * The unique identifier for the primary account number for the payment card.
    */
  var primaryAccountIdentifier: String = js.native
  /**
    * A version of the primary account number suitable for display in your UI.
    */
  var primaryAccountNumberSuffix: String = js.native
}

object ApplePayPaymentPass {
  @scala.inline
  def apply(
    activationState: ApplePayPaymentPassActivationState,
    primaryAccountIdentifier: String,
    primaryAccountNumberSuffix: String
  ): ApplePayPaymentPass = {
    val __obj = js.Dynamic.literal(activationState = activationState.asInstanceOf[js.Any], primaryAccountIdentifier = primaryAccountIdentifier.asInstanceOf[js.Any], primaryAccountNumberSuffix = primaryAccountNumberSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentPass]
  }
  @scala.inline
  implicit class ApplePayPaymentPassOps[Self <: ApplePayPaymentPass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivationState(value: ApplePayPaymentPassActivationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryAccountIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryAccountIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryAccountNumberSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryAccountNumberSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceAccountIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceAccountIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceAccountIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceAccountIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceAccountNumberSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceAccountNumberSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceAccountNumberSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceAccountNumberSuffix")(js.undefined)
        ret
    }
  }
  
}

