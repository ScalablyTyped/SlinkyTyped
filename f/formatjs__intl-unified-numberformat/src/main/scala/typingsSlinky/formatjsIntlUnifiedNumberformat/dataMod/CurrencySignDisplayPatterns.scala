package typingsSlinky.formatjsIntlUnifiedNumberformat.dataMod

import typingsSlinky.formatjsIntlUnifiedNumberformat.anon.RecordDecimalFormatNumSig
import typingsSlinky.formatjsIntlUtils.numberTypesMod.DecimalFormatNum
import typingsSlinky.formatjsIntlUtils.numberTypesMod.NotationPattern
import typingsSlinky.formatjsIntlUtils.numberTypesMod.SignDisplayPattern
import typingsSlinky.formatjsIntlUtils.numberTypesMod.SignPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.formatjsIntlUtils.numberTypesMod.NotationPattern because var conflicts: compactLong, compactShort. Inlined scientific, standard */ @js.native
trait CurrencySignDisplayPatterns
  extends NotationPatterns
     with SignDisplayPattern {
  var compactSignPattern: js.UndefOr[js.Any] = js.native
  var currency: js.Any = js.native
  var currencySign: js.UndefOr[js.Any] = js.native
  var currencySlotToken: js.Any = js.native
  var numberingSystem: js.Any = js.native
  var numbers: js.Any = js.native
  @JSName("scientific")
  var scientific_FCurrencySignDisplayPatterns: SignPattern = js.native
  var signDisplay: js.UndefOr[js.Any] = js.native
  var signPattern: js.UndefOr[js.Any] = js.native
  @JSName("standard")
  var standard_FCurrencySignDisplayPatterns: SignPattern = js.native
  @JSName("always")
  def always_MCurrencySignDisplayPatterns: NotationPattern = js.native
  @JSName("auto")
  def auto_MCurrencySignDisplayPatterns: NotationPattern = js.native
  @JSName("exceptZero")
  def exceptZero_MCurrencySignDisplayPatterns: NotationPattern = js.native
  @JSName("never")
  def never_MCurrencySignDisplayPatterns: NotationPattern = js.native
  def scientific: SignPattern = js.native
  def standard: SignPattern = js.native
}

object CurrencySignDisplayPatterns {
  @scala.inline
  def apply(
    `1000`: () => SignPattern,
    `10000`: () => SignPattern,
    `100000`: () => SignPattern,
    `1000000`: () => SignPattern,
    `10000000`: () => SignPattern,
    `100000000`: () => SignPattern,
    `1000000000`: () => SignPattern,
    `10000000000`: () => SignPattern,
    `100000000000`: () => SignPattern,
    `1000000000000`: () => SignPattern,
    `10000000000000`: () => SignPattern,
    `100000000000000`: () => SignPattern,
    always: () => NotationPattern,
    auto: () => NotationPattern,
    compactLong: () => RecordDecimalFormatNumSig,
    compactShort: () => RecordDecimalFormatNumSig,
    currency: js.Any,
    currencySlotToken: js.Any,
    exceptZero: () => NotationPattern,
    never: () => NotationPattern,
    numberingSystem: js.Any,
    numbers: js.Any,
    produceCompactSignPattern: DecimalFormatNum => SignPattern,
    scientific: () => SignPattern,
    standard: () => SignPattern
  ): CurrencySignDisplayPatterns = {
    val __obj = js.Dynamic.literal(always = js.Any.fromFunction0(always), auto = js.Any.fromFunction0(auto), compactLong = js.Any.fromFunction0(compactLong), compactShort = js.Any.fromFunction0(compactShort), currency = currency.asInstanceOf[js.Any], currencySlotToken = currencySlotToken.asInstanceOf[js.Any], exceptZero = js.Any.fromFunction0(exceptZero), never = js.Any.fromFunction0(never), numberingSystem = numberingSystem.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], produceCompactSignPattern = js.Any.fromFunction1(produceCompactSignPattern), scientific = js.Any.fromFunction0(scientific), standard = js.Any.fromFunction0(standard))
    __obj.updateDynamic("1000")(js.Any.fromFunction0(`1000`))
    __obj.updateDynamic("10000")(js.Any.fromFunction0(`10000`))
    __obj.updateDynamic("100000")(js.Any.fromFunction0(`100000`))
    __obj.updateDynamic("1000000")(js.Any.fromFunction0(`1000000`))
    __obj.updateDynamic("10000000")(js.Any.fromFunction0(`10000000`))
    __obj.updateDynamic("100000000")(js.Any.fromFunction0(`100000000`))
    __obj.updateDynamic("1000000000")(js.Any.fromFunction0(`1000000000`))
    __obj.updateDynamic("10000000000")(js.Any.fromFunction0(`10000000000`))
    __obj.updateDynamic("100000000000")(js.Any.fromFunction0(`100000000000`))
    __obj.updateDynamic("1000000000000")(js.Any.fromFunction0(`1000000000000`))
    __obj.updateDynamic("10000000000000")(js.Any.fromFunction0(`10000000000000`))
    __obj.updateDynamic("100000000000000")(js.Any.fromFunction0(`100000000000000`))
    __obj.asInstanceOf[CurrencySignDisplayPatterns]
  }
  @scala.inline
  implicit class CurrencySignDisplayPatternsOps[Self <: CurrencySignDisplayPatterns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlways(value: () => NotationPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAuto(value: () => NotationPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCurrency(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrencySlotToken(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencySlotToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExceptZero(value: () => NotationPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptZero")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNever(value: () => NotationPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("never")(js.Any.fromFunction0(value))
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
    def withScientific(value: () => SignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scientific")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStandard(value: () => SignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCompactSignPattern(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactSignPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompactSignPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactSignPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrencySign(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencySign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencySign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencySign")(js.undefined)
        ret
    }
    @scala.inline
    def withSignDisplay(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withSignPattern(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signPattern")(js.undefined)
        ret
    }
  }
  
}

