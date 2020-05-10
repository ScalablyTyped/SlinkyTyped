package typingsSlinky.cardValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait validExpirationYear extends valid {
  var isCurrentYear: Boolean = js.native
}

object validExpirationYear {
  @scala.inline
  def apply(isCurrentYear: Boolean, isPotentiallyValid: Boolean, isValid: Boolean): validExpirationYear = {
    val __obj = js.Dynamic.literal(isCurrentYear = isCurrentYear.asInstanceOf[js.Any], isPotentiallyValid = isPotentiallyValid.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[validExpirationYear]
  }
  @scala.inline
  implicit class validExpirationYearOps[Self <: validExpirationYear] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsCurrentYear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCurrentYear")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

