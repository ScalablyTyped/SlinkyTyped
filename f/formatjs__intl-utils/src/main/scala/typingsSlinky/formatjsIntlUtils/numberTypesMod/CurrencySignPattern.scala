package typingsSlinky.formatjsIntlUtils.numberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrencySignPattern extends js.Object {
  var accounting: SignDisplayPattern = js.native
  var standard: SignDisplayPattern = js.native
}

object CurrencySignPattern {
  @scala.inline
  def apply(accounting: SignDisplayPattern, standard: SignDisplayPattern): CurrencySignPattern = {
    val __obj = js.Dynamic.literal(accounting = accounting.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencySignPattern]
  }
  @scala.inline
  implicit class CurrencySignPatternOps[Self <: CurrencySignPattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccounting(value: SignDisplayPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandard(value: SignDisplayPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

