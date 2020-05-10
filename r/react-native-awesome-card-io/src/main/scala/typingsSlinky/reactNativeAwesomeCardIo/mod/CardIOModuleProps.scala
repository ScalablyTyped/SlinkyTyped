package typingsSlinky.reactNativeAwesomeCardIo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardIOModuleProps extends CardIOCommonProps {
  /**  iOS Only */
  /**  false - Disable the blur of the screen when the app is backgrounded. */
  var disableBlurWhenBackgrounding: js.UndefOr[Boolean] = js.native
  /**  false - If true, the status bar's style will be kept as whatever your app has set it to. */
  var keepStatusBarStyle: js.UndefOr[Boolean] = js.native
  /**  Android Only */
  /**  false If set, the card will not be scanned with the camera. */
  var noCamera: js.UndefOr[Boolean] = js.native
  /**  true - Set to false if you don't need to collect the CVV from the user. */
  var requireCVV: js.UndefOr[Boolean] = js.native
  /**  false - Set to true if you need to collect the cardholder name. */
  var requireCardholderName: js.UndefOr[Boolean] = js.native
  /**  true - Set to false if you don't need to collect the card expiration. */
  var requireExpiry: js.UndefOr[Boolean] = js.native
  /**  false - Set to false if you need to collect the billing postal code. */
  var requirePostalCode: js.UndefOr[Boolean] = js.native
  /**  false - Set to true if the postal code should only collect numeric input. */
  var restrictPostalCodeToNumericOnly: js.UndefOr[Boolean] = js.native
  /**  false - If true, don't have the user confirm the scanned card, just return the results immediately. */
  var suppressConfirmation: js.UndefOr[Boolean] = js.native
  /**  false - Set to true to prevent card.io from showing its "Enter Manually" button. */
  var suppressManualEntry: js.UndefOr[Boolean] = js.native
  /**  false - If true, instead of displaying the image of the scanned card, present the manual entry screen with the scanned card number prefilled. */
  var suppressScannedCardImage: js.UndefOr[Boolean] = js.native
  /**  -1 Privacy feature. How many of the Card number digits NOT to blur on the resulting image. Setting it to 4 will blur all digits except the last four. */
  var unblurDigits: js.UndefOr[Double] = js.native
  /**   Default false; Use the PayPal icon in the ActionBar. */
  var usePaypalActionbarIcon: js.UndefOr[Boolean] = js.native
}

object CardIOModuleProps {
  @scala.inline
  def apply(): CardIOModuleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardIOModuleProps]
  }
  @scala.inline
  implicit class CardIOModulePropsOps[Self <: CardIOModuleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableBlurWhenBackgrounding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableBlurWhenBackgrounding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableBlurWhenBackgrounding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableBlurWhenBackgrounding")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepStatusBarStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepStatusBarStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepStatusBarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepStatusBarStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCamera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCamera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCamera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCamera")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireCVV(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireCVV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireCVV: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireCVV")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireCardholderName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireCardholderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireCardholderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireCardholderName")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireExpiry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireExpiry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireExpiry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireExpiry")(js.undefined)
        ret
    }
    @scala.inline
    def withRequirePostalCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirePostalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequirePostalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirePostalCode")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictPostalCodeToNumericOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictPostalCodeToNumericOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictPostalCodeToNumericOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictPostalCodeToNumericOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressConfirmation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressConfirmation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressConfirmation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressConfirmation")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressManualEntry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressManualEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressManualEntry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressManualEntry")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressScannedCardImage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressScannedCardImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressScannedCardImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressScannedCardImage")(js.undefined)
        ret
    }
    @scala.inline
    def withUnblurDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unblurDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnblurDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unblurDigits")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePaypalActionbarIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePaypalActionbarIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePaypalActionbarIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePaypalActionbarIcon")(js.undefined)
        ret
    }
  }
  
}

