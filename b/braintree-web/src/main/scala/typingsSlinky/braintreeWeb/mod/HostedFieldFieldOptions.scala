package typingsSlinky.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that has {@link module:braintree-web/hosted-fields~field field objects} for each field. Used in {@link module:braintree-web/hosted-fields~create create}.
  * @typedef {object} fieldOptions
  * @property {field} [number] A field for card number.
  * @property {field} [expirationDate] A field for expiration date in `MM/YYYY` format. This should not be used with the `expirationMonth` and `expirationYear` properties.
  * @property {field} [expirationMonth] A field for expiration month in `MM` format. This should be used with the `expirationYear` property.
  * @property {field} [expirationYear] A field for expiration year in `YYYY` format. This should be used with the `expirationMonth` property.
  * @property {field} [cvv] A field for 3 or 4 digit CVV or CID.
  * @property {field} [postalCode] A field for postal or region code.
  */
@js.native
trait HostedFieldFieldOptions extends js.Object {
  var cvv: HostedFieldsField = js.native
  var expirationDate: js.UndefOr[HostedFieldsField] = js.native
  var expirationMonth: js.UndefOr[HostedFieldsField] = js.native
  var expirationYear: js.UndefOr[HostedFieldsField] = js.native
  var number: HostedFieldsField = js.native
  var postalCode: js.UndefOr[HostedFieldsField] = js.native
}

object HostedFieldFieldOptions {
  @scala.inline
  def apply(cvv: HostedFieldsField, number: HostedFieldsField): HostedFieldFieldOptions = {
    val __obj = js.Dynamic.literal(cvv = cvv.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldFieldOptions]
  }
  @scala.inline
  implicit class HostedFieldFieldOptionsOps[Self <: HostedFieldFieldOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCvv(value: HostedFieldsField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: HostedFieldsField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationDate(value: HostedFieldsField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationMonth(value: HostedFieldsField): Self = {
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
    def withExpirationYear(value: HostedFieldsField): Self = {
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
    def withPostalCode(value: HostedFieldsField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(js.undefined)
        ret
    }
  }
  
}

