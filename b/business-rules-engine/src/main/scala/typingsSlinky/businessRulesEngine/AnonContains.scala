package typingsSlinky.businessRulesEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContains extends js.Object {
  var contains: String = js.native
  var creditcard: String = js.native
  var custom: String = js.native
  var date: String = js.native
  var dateISO: String = js.native
  var digits: String = js.native
  var email: String = js.native
  var equalTo: String = js.native
  var mask: String = js.native
  var max: String = js.native
  var maxlength: String = js.native
  var min: String = js.native
  var minlength: String = js.native
  var number: String = js.native
  var range: String = js.native
  var rangelength: String = js.native
  var remote: String = js.native
  var required: String = js.native
  var signedDigits: String = js.native
  var step: String = js.native
  var url: String = js.native
}

object AnonContains {
  @scala.inline
  def apply(
    contains: String,
    creditcard: String,
    custom: String,
    date: String,
    dateISO: String,
    digits: String,
    email: String,
    equalTo: String,
    mask: String,
    max: String,
    maxlength: String,
    min: String,
    minlength: String,
    number: String,
    range: String,
    rangelength: String,
    remote: String,
    required: String,
    signedDigits: String,
    step: String,
    url: String
  ): AnonContains = {
    val __obj = js.Dynamic.literal(contains = contains.asInstanceOf[js.Any], creditcard = creditcard.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dateISO = dateISO.asInstanceOf[js.Any], digits = digits.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], equalTo = equalTo.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxlength = maxlength.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minlength = minlength.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rangelength = rangelength.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], signedDigits = signedDigits.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContains]
  }
  @scala.inline
  implicit class AnonContainsOps[Self <: AnonContains] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContains(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreditcard(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditcard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateISO(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateISO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDigits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEqualTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxlength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxlength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinlength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minlength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangelength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangelength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignedDigits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

