package typingsSlinky.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in braintree-web.braintree-web.HostedFieldsHostedFieldsFieldName ]: braintree-web.braintree-web.HostedFieldsHostedFieldsFieldData} */
@js.native
trait HostedFieldsFieldDataFields extends js.Object {
  var cvv: HostedFieldsHostedFieldsFieldData = js.native
  var expirationDate: HostedFieldsHostedFieldsFieldData = js.native
  var expirationMonth: HostedFieldsHostedFieldsFieldData = js.native
  var expirationYear: HostedFieldsHostedFieldsFieldData = js.native
  var number: HostedFieldsHostedFieldsFieldData = js.native
  var postalCode: HostedFieldsHostedFieldsFieldData = js.native
}

object HostedFieldsFieldDataFields {
  @scala.inline
  def apply(
    cvv: HostedFieldsHostedFieldsFieldData,
    expirationDate: HostedFieldsHostedFieldsFieldData,
    expirationMonth: HostedFieldsHostedFieldsFieldData,
    expirationYear: HostedFieldsHostedFieldsFieldData,
    number: HostedFieldsHostedFieldsFieldData,
    postalCode: HostedFieldsHostedFieldsFieldData
  ): HostedFieldsFieldDataFields = {
    val __obj = js.Dynamic.literal(cvv = cvv.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], expirationMonth = expirationMonth.asInstanceOf[js.Any], expirationYear = expirationYear.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsFieldDataFields]
  }
  @scala.inline
  implicit class HostedFieldsFieldDataFieldsOps[Self <: HostedFieldsFieldDataFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCvv(value: HostedFieldsHostedFieldsFieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationDate(value: HostedFieldsHostedFieldsFieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationMonth(value: HostedFieldsHostedFieldsFieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationYear(value: HostedFieldsHostedFieldsFieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: HostedFieldsHostedFieldsFieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostalCode(value: HostedFieldsHostedFieldsFieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

