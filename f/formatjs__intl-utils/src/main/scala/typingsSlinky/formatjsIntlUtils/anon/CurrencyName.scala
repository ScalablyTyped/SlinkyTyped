package typingsSlinky.formatjsIntlUtils.anon

import typingsSlinky.formatjsIntlUtils.numberTypesMod.LDMLPluralRuleMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrencyName extends js.Object {
  var currencyName: LDMLPluralRuleMap[String] = js.native
  var currencyNarrowSymbol: String = js.native
  var currencySymbol: String = js.native
}

object CurrencyName {
  @scala.inline
  def apply(currencyName: LDMLPluralRuleMap[String], currencyNarrowSymbol: String, currencySymbol: String): CurrencyName = {
    val __obj = js.Dynamic.literal(currencyName = currencyName.asInstanceOf[js.Any], currencyNarrowSymbol = currencyNarrowSymbol.asInstanceOf[js.Any], currencySymbol = currencySymbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyName]
  }
  @scala.inline
  implicit class CurrencyNameOps[Self <: CurrencyName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrencyName(value: LDMLPluralRuleMap[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrencyNarrowSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyNarrowSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrencySymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencySymbol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

