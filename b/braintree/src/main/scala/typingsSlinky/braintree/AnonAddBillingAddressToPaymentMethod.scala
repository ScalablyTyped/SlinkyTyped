package typingsSlinky.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddBillingAddressToPaymentMethod extends js.Object {
  var addBillingAddressToPaymentMethod: js.UndefOr[Boolean] = js.native
  var holdInEscrow: js.UndefOr[Boolean] = js.native
  var paypal: js.UndefOr[AnonCustomField] = js.native
  var skipAdvancedFraudChecking: js.UndefOr[Boolean] = js.native
  var skipAvs: js.UndefOr[Boolean] = js.native
  var skipCvv: js.UndefOr[Boolean] = js.native
  var storeInVault: js.UndefOr[Boolean] = js.native
  var storeInVaultOnSuccess: js.UndefOr[Boolean] = js.native
  var storeShippingAddressInVault: js.UndefOr[Boolean] = js.native
  var submitForSettlement: js.UndefOr[Boolean] = js.native
  var threeDSecure: js.UndefOr[AnonRequired] = js.native
  var venmo: js.UndefOr[AnonProfileId] = js.native
}

object AnonAddBillingAddressToPaymentMethod {
  @scala.inline
  def apply(): AnonAddBillingAddressToPaymentMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAddBillingAddressToPaymentMethod]
  }
  @scala.inline
  implicit class AnonAddBillingAddressToPaymentMethodOps[Self <: AnonAddBillingAddressToPaymentMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddBillingAddressToPaymentMethod(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBillingAddressToPaymentMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddBillingAddressToPaymentMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBillingAddressToPaymentMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withHoldInEscrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holdInEscrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoldInEscrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holdInEscrow")(js.undefined)
        ret
    }
    @scala.inline
    def withPaypal(value: AnonCustomField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paypal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaypal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paypal")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipAdvancedFraudChecking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipAdvancedFraudChecking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipAdvancedFraudChecking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipAdvancedFraudChecking")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipAvs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipAvs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipAvs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipAvs")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipCvv(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipCvv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipCvv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipCvv")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreInVault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeInVault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreInVault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeInVault")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreInVaultOnSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeInVaultOnSuccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreInVaultOnSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeInVaultOnSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreShippingAddressInVault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeShippingAddressInVault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreShippingAddressInVault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeShippingAddressInVault")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitForSettlement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitForSettlement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitForSettlement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitForSettlement")(js.undefined)
        ret
    }
    @scala.inline
    def withThreeDSecure(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threeDSecure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreeDSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threeDSecure")(js.undefined)
        ret
    }
    @scala.inline
    def withVenmo(value: AnonProfileId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("venmo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVenmo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("venmo")(js.undefined)
        ret
    }
  }
  
}

