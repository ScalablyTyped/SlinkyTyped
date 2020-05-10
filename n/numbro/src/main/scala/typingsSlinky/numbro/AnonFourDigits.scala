package typingsSlinky.numbro

import typingsSlinky.numbro.mod.numbro.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFourDigits extends js.Object {
  var fourDigits: Format = js.native
  var fullWithNoDecimals: Format = js.native
  var fullWithTwoDecimals: Format = js.native
  var fullWithTwoDecimalsNoCurrency: Format = js.native
}

object AnonFourDigits {
  @scala.inline
  def apply(
    fourDigits: Format,
    fullWithNoDecimals: Format,
    fullWithTwoDecimals: Format,
    fullWithTwoDecimalsNoCurrency: Format
  ): AnonFourDigits = {
    val __obj = js.Dynamic.literal(fourDigits = fourDigits.asInstanceOf[js.Any], fullWithNoDecimals = fullWithNoDecimals.asInstanceOf[js.Any], fullWithTwoDecimals = fullWithTwoDecimals.asInstanceOf[js.Any], fullWithTwoDecimalsNoCurrency = fullWithTwoDecimalsNoCurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFourDigits]
  }
  @scala.inline
  implicit class AnonFourDigitsOps[Self <: AnonFourDigits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFourDigits(value: Format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fourDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullWithNoDecimals(value: Format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWithNoDecimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullWithTwoDecimals(value: Format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWithTwoDecimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullWithTwoDecimalsNoCurrency(value: Format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWithTwoDecimalsNoCurrency")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

