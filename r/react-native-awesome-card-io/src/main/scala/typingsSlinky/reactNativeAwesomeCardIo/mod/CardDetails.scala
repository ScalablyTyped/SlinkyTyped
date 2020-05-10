package typingsSlinky.reactNativeAwesomeCardIo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardDetails extends js.Object {
  /**  Card number. */
  var cardNumber: String = js.native
  /**  Localized card type. */
  var cardType: String = js.native
  /**  Card holder name. */
  var cardholderName: String = js.native
  /**  Security code. */
  var cvv: String = js.native
  /**  Expiry month with january as 1 (may be 0 if expiry information was not requested). */
  var expiryMonth: Double = js.native
  /**  Expiry year (may be 0 if expiry information was not requested). */
  var expiryYear: Double = js.native
  /**  Postal code. Format is country dependent. */
  var postalCode: String = js.native
  /**  Card number with all but the last four digits obfuscated. */
  var redactedCardNumber: String = js.native
  /**  - Was the card number scanned (as opposed to entered manually)? */
  var scanned: js.UndefOr[Boolean] = js.native
}

object CardDetails {
  @scala.inline
  def apply(
    cardNumber: String,
    cardType: String,
    cardholderName: String,
    cvv: String,
    expiryMonth: Double,
    expiryYear: Double,
    postalCode: String,
    redactedCardNumber: String
  ): CardDetails = {
    val __obj = js.Dynamic.literal(cardNumber = cardNumber.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], cardholderName = cardholderName.asInstanceOf[js.Any], cvv = cvv.asInstanceOf[js.Any], expiryMonth = expiryMonth.asInstanceOf[js.Any], expiryYear = expiryYear.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], redactedCardNumber = redactedCardNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardDetails]
  }
  @scala.inline
  implicit class CardDetailsOps[Self <: CardDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCardNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardholderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardholderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCvv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpiryMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiryMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpiryYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiryYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedactedCardNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redactedCardNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScanned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScanned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanned")(js.undefined)
        ret
    }
  }
  
}

