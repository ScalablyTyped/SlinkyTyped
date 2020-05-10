package typingsSlinky.formatjsIntlUnifiedNumberformat.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawNumberFormatResult extends js.Object {
  var formattedString: String = js.native
  var integerDigitsCount: Double = js.native
  var roundedNumber: Double = js.native
}

object RawNumberFormatResult {
  @scala.inline
  def apply(formattedString: String, integerDigitsCount: Double, roundedNumber: Double): RawNumberFormatResult = {
    val __obj = js.Dynamic.literal(formattedString = formattedString.asInstanceOf[js.Any], integerDigitsCount = integerDigitsCount.asInstanceOf[js.Any], roundedNumber = roundedNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawNumberFormatResult]
  }
  @scala.inline
  implicit class RawNumberFormatResultOps[Self <: RawNumberFormatResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormattedString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntegerDigitsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerDigitsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoundedNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundedNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

