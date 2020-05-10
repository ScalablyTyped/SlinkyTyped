package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument extends js.Object {
  /**
    * If requested by integrator, billing address for the instrument in use
    * will be included.
    */
  var billingAddress: js.UndefOr[GoogleTypePostalAddress] = js.native
  /**
    * Google provided payment instrument.
    */
  var instrumentToken: js.UndefOr[String] = js.native
}

object GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument {
  @scala.inline
  def apply(): GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrumentOps[Self <: GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillingAddress(value: GoogleTypePostalAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withInstrumentToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrumentToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstrumentToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrumentToken")(js.undefined)
        ret
    }
  }
  
}

