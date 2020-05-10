package typingsSlinky.braintreeWeb

import typingsSlinky.braintreeWeb.mod.PayPalShippingAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAmount extends js.Object {
  var amount: js.UndefOr[String | Double] = js.native
  var billingAgreementDescription: js.UndefOr[String] = js.native
  var currency: js.UndefOr[String] = js.native
  var displayName: js.UndefOr[String] = js.native
  var enableShippingAddress: js.UndefOr[Boolean] = js.native
  var flow: String = js.native
  var intent: js.UndefOr[String] = js.native
  var locale: js.UndefOr[String] = js.native
  var offerCredit: js.UndefOr[Boolean] = js.native
  var shippingAddressEditable: js.UndefOr[Boolean] = js.native
  var shippingAddressOverride: js.UndefOr[PayPalShippingAddress] = js.native
  var useraction: js.UndefOr[String] = js.native
}

object AnonAmount {
  @scala.inline
  def apply(flow: String): AnonAmount = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAmount]
  }
  @scala.inline
  implicit class AnonAmountOps[Self <: AnonAmount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmount(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingAgreementDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAgreementDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingAgreementDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAgreementDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableShippingAddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableShippingAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableShippingAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableShippingAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withIntent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferCredit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerCredit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferCredit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerCredit")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingAddressEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingAddressEditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingAddressEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingAddressEditable")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingAddressOverride(value: PayPalShippingAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingAddressOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingAddressOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingAddressOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withUseraction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useraction")(js.undefined)
        ret
    }
  }
  
}

