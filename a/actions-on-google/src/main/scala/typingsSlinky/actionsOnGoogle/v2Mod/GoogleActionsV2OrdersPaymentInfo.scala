package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersPaymentInfo extends js.Object {
  /**
    * Name of the instrument displayed on the receipt.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Google provided payment instrument.
    */
  var googleProvidedPaymentInstrument: js.UndefOr[GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument] = js.native
  /**
    * Type of payment.
    * Required.
    */
  var paymentType: js.UndefOr[GoogleActionsV2OrdersPaymentInfoPaymentType] = js.native
}

object GoogleActionsV2OrdersPaymentInfo {
  @scala.inline
  def apply(): GoogleActionsV2OrdersPaymentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersPaymentInfo]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersPaymentInfoOps[Self <: GoogleActionsV2OrdersPaymentInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withGoogleProvidedPaymentInstrument(value: GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleProvidedPaymentInstrument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleProvidedPaymentInstrument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleProvidedPaymentInstrument")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentType(value: GoogleActionsV2OrdersPaymentInfoPaymentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentType")(js.undefined)
        ret
    }
  }
  
}

