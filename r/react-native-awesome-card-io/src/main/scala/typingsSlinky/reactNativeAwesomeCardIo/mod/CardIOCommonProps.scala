package typingsSlinky.reactNativeAwesomeCardIo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardIOCommonProps extends js.Object {
  /**  true - By default, in camera view the card guide and the buttons always rotate to match the device's orientation. */
  var allowFreelyRotatingCardGuide: js.UndefOr[Boolean] = js.native
  /**  iOS only */
  /**  false - Set the detection mode. (iOS) */
  var detectionMode: js.UndefOr[CardIODetectionMode] = js.native
  /**  Alter the card guide (bracket) color. Opaque colors recommended.. */
  var guideColor: js.UndefOr[String | Double] = js.native
  /**  false - Hide the PayPal or card.io logo in the scan view.. */
  var hideCardIOLogo: js.UndefOr[Boolean] = js.native
  /**  The preferred language for all strings appearing in the user interface. */
  var languageOrLocale: js.UndefOr[String] = js.native
  /**  true - Set to false if you don't want the camera to try to scan the card expiration.. */
  var scanExpiry: js.UndefOr[Boolean] = js.native
  /**  - Set the scan instruction text. If nil, use the default text.. */
  var scanInstructions: js.UndefOr[String] = js.native
  /**  0.1 - How long card.io will display an image of the card with the computed card number superimposed after a successful scan. */
  var scannedImageDuration: js.UndefOr[Double] = js.native
  /**  false - Set to true to show the card.io logo over the camera view instead of the PayPal logo.. */
  var useCardIOLogo: js.UndefOr[Boolean] = js.native
}

object CardIOCommonProps {
  @scala.inline
  def apply(): CardIOCommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardIOCommonProps]
  }
  @scala.inline
  implicit class CardIOCommonPropsOps[Self <: CardIOCommonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowFreelyRotatingCardGuide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFreelyRotatingCardGuide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFreelyRotatingCardGuide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFreelyRotatingCardGuide")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectionMode(value: CardIODetectionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withGuideColor(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guideColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuideColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guideColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHideCardIOLogo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCardIOLogo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideCardIOLogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCardIOLogo")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageOrLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageOrLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageOrLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageOrLocale")(js.undefined)
        ret
    }
    @scala.inline
    def withScanExpiry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanExpiry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScanExpiry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanExpiry")(js.undefined)
        ret
    }
    @scala.inline
    def withScanInstructions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanInstructions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScanInstructions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanInstructions")(js.undefined)
        ret
    }
    @scala.inline
    def withScannedImageDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scannedImageDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScannedImageDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scannedImageDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCardIOLogo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCardIOLogo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCardIOLogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCardIOLogo")(js.undefined)
        ret
    }
  }
  
}

