package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTestOrderPaymentMethod extends js.Object {
  /**
    * The card expiration month (January = 1, February = 2 etc.).
    */
  var expirationMonth: js.UndefOr[Double] = js.native
  /**
    * The card expiration year (4-digit, e.g. 2015).
    */
  var expirationYear: js.UndefOr[Double] = js.native
  /**
    * The last four digits of the card number.
    */
  var lastFourDigits: js.UndefOr[String] = js.native
  /**
    * The billing address.
    */
  var predefinedBillingAddress: js.UndefOr[String] = js.native
  /**
    * The type of instrument. Note that real orders might have different values
    * than the four values accepted by createTestOrder.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaTestOrderPaymentMethod {
  @scala.inline
  def apply(): SchemaTestOrderPaymentMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestOrderPaymentMethod]
  }
  @scala.inline
  implicit class SchemaTestOrderPaymentMethodOps[Self <: SchemaTestOrderPaymentMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpirationMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationYear")(js.undefined)
        ret
    }
    @scala.inline
    def withLastFourDigits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastFourDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastFourDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastFourDigits")(js.undefined)
        ret
    }
    @scala.inline
    def withPredefinedBillingAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predefinedBillingAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredefinedBillingAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predefinedBillingAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

