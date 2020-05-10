package typingsSlinky.cardValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait validExpirationMonth extends valid {
  var isValidForThisYear: Boolean = js.native
}

object validExpirationMonth {
  @scala.inline
  def apply(isPotentiallyValid: Boolean, isValid: Boolean, isValidForThisYear: Boolean): validExpirationMonth = {
    val __obj = js.Dynamic.literal(isPotentiallyValid = isPotentiallyValid.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], isValidForThisYear = isValidForThisYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[validExpirationMonth]
  }
  @scala.inline
  implicit class validExpirationMonthOps[Self <: validExpirationMonth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsValidForThisYear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidForThisYear")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

