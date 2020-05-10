package typingsSlinky.formatjsIntlUnifiedNumberformat.dataMod

import typingsSlinky.formatjsIntlUtils.numberTypesMod.CurrencyPattern
import typingsSlinky.formatjsIntlUtils.numberTypesMod.CurrencySignPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrencyPatterns
  extends CurrencyPattern
     with CurrencySignPattern {
  var currencies: js.Any = js.native
  var currency: js.Any = js.native
  var currencySign: js.Any = js.native
  var currencySlotToken: js.UndefOr[js.Any] = js.native
  var numberingSystem: js.Any = js.native
  var numbers: js.Any = js.native
  var resolvedCurrency: js.UndefOr[js.Any] = js.native
  var signDisplayPatterns: js.UndefOr[js.Any] = js.native
  @JSName("accounting")
  def accounting_MCurrencyPatterns: CurrencySignDisplayPatterns = js.native
  @JSName("code")
  def code_MCurrencyPatterns: this.type = js.native
  @JSName("name")
  def name_MCurrencyPatterns: this.type = js.native
  @JSName("narrowSymbol")
  def narrowSymbol_MCurrencyPatterns: this.type = js.native
  @JSName("standard")
  def standard_MCurrencyPatterns: CurrencySignDisplayPatterns = js.native
  @JSName("symbol")
  def symbol_MCurrencyPatterns: this.type = js.native
}

object CurrencyPatterns {
  @scala.inline
  def apply(
    accounting: () => CurrencySignDisplayPatterns,
    code: () => CurrencyPatterns,
    currencies: js.Any,
    currency: js.Any,
    currencySign: js.Any,
    name: () => CurrencyPatterns,
    narrowSymbol: () => CurrencyPatterns,
    numberingSystem: js.Any,
    numbers: js.Any,
    standard: () => CurrencySignDisplayPatterns,
    symbol: () => CurrencyPatterns
  ): CurrencyPatterns = {
    val __obj = js.Dynamic.literal(accounting = js.Any.fromFunction0(accounting), code = js.Any.fromFunction0(code), currencies = currencies.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], currencySign = currencySign.asInstanceOf[js.Any], name = js.Any.fromFunction0(name), narrowSymbol = js.Any.fromFunction0(narrowSymbol), numberingSystem = numberingSystem.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], standard = js.Any.fromFunction0(standard), symbol = js.Any.fromFunction0(symbol))
    __obj.asInstanceOf[CurrencyPatterns]
  }
  @scala.inline
  implicit class CurrencyPatternsOps[Self <: CurrencyPatterns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccounting(value: () => CurrencySignDisplayPatterns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounting")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCode(value: () => CurrencyPatterns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCurrencies(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrencySign(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencySign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: () => CurrencyPatterns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNarrowSymbol(value: () => CurrencyPatterns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("narrowSymbol")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNumberingSystem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumbers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandard(value: () => CurrencySignDisplayPatterns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSymbol(value: () => CurrencyPatterns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCurrencySlotToken(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencySlotToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencySlotToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencySlotToken")(js.undefined)
        ret
    }
    @scala.inline
    def withResolvedCurrency(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedCurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvedCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedCurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withSignDisplayPatterns(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signDisplayPatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignDisplayPatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signDisplayPatterns")(js.undefined)
        ret
    }
  }
  
}

