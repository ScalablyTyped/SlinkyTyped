package typingsSlinky.braintreeWebDropIn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var applePay: js.UndefOr[applePayCreateOptions] = js.native
  var authorization: String = js.native
  var card: js.UndefOr[Boolean | cardCreateOptions] = js.native
  var container: js.Any = js.native
  var dataCollector: js.UndefOr[dataCollectorOptions] = js.native
  var googlePay: js.UndefOr[googlePayCreateOptions] = js.native
  var locale: js.UndefOr[String] = js.native
  var paymentOptionPriority: js.UndefOr[js.Array[String]] = js.native
  var paypal: js.UndefOr[paypalCreateOptions] = js.native
  var paypalCredit: js.UndefOr[paypalCreateOptions] = js.native
  var preselectVaultedPaymentMethod: js.UndefOr[Boolean] = js.native
  var threeDSecure: js.UndefOr[threeDSecureOptions] = js.native
  var translations: js.UndefOr[js.Object] = js.native
  var vaultManager: js.UndefOr[Boolean] = js.native
  var venmo: js.UndefOr[venmoCreateOptions | Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(authorization: String, container: js.Any): Options = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplePay(value: applePayCreateOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applePay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplePay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applePay")(js.undefined)
        ret
    }
    @scala.inline
    def withCard(value: Boolean | cardCreateOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(js.undefined)
        ret
    }
    @scala.inline
    def withDataCollector(value: dataCollectorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCollector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataCollector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCollector")(js.undefined)
        ret
    }
    @scala.inline
    def withGooglePay(value: googlePayCreateOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGooglePay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePay")(js.undefined)
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
    def withPaymentOptionPriority(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentOptionPriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentOptionPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentOptionPriority")(js.undefined)
        ret
    }
    @scala.inline
    def withPaypal(value: paypalCreateOptions): Self = {
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
    def withPaypalCredit(value: paypalCreateOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paypalCredit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaypalCredit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paypalCredit")(js.undefined)
        ret
    }
    @scala.inline
    def withPreselectVaultedPaymentMethod(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preselectVaultedPaymentMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreselectVaultedPaymentMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preselectVaultedPaymentMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withThreeDSecure(value: threeDSecureOptions): Self = {
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
    def withTranslations(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
    @scala.inline
    def withVaultManager(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vaultManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVaultManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vaultManager")(js.undefined)
        ret
    }
    @scala.inline
    def withVenmo(value: venmoCreateOptions | Boolean): Self = {
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

