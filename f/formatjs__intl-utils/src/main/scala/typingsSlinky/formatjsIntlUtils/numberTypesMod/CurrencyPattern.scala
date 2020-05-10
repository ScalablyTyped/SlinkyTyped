package typingsSlinky.formatjsIntlUtils.numberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrencyPattern extends js.Object {
  var code: CurrencySignPattern = js.native
  var name: CurrencySignPattern = js.native
  var narrowSymbol: CurrencySignPattern = js.native
  var symbol: CurrencySignPattern = js.native
}

object CurrencyPattern {
  @scala.inline
  def apply(
    code: CurrencySignPattern,
    name: CurrencySignPattern,
    narrowSymbol: CurrencySignPattern,
    symbol: CurrencySignPattern
  ): CurrencyPattern = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], narrowSymbol = narrowSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyPattern]
  }
  @scala.inline
  implicit class CurrencyPatternOps[Self <: CurrencyPattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: CurrencySignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: CurrencySignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNarrowSymbol(value: CurrencySignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("narrowSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbol(value: CurrencySignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

