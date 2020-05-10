package typingsSlinky.formatjsIntlUnifiedNumberformat.dataMod

import typingsSlinky.formatjsIntlUnifiedNumberformat.RecordDecimalFormatNumSig
import typingsSlinky.formatjsIntlUtils.numberTypesMod.DecimalFormatNum
import typingsSlinky.formatjsIntlUtils.numberTypesMod.NotationPattern
import typingsSlinky.formatjsIntlUtils.numberTypesMod.RawNumberData
import typingsSlinky.formatjsIntlUtils.numberTypesMod.SignPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PercentPatterns extends DecimalPatterns {
  var generateStandardOrScientificPattern: js.Any = js.native
  @JSName("scientific")
  def scientific_MPercentPatterns: SignPattern = js.native
  @JSName("standard")
  def standard_MPercentPatterns: SignPattern = js.native
}

object PercentPatterns {
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
    exceptZero: () => NotationPattern,
    generateStandardOrScientificPattern: js.Any,
    never: () => NotationPattern,
    numberingSystem: String,
    numbers: RawNumberData,
    produceCompactSignPattern: DecimalFormatNum => SignPattern,
    scientific: () => SignPattern,
    standard: () => SignPattern
  ): PercentPatterns = {
    val __obj = js.Dynamic.literal(always = js.Any.fromFunction0(always), auto = js.Any.fromFunction0(auto), compactLong = js.Any.fromFunction0(compactLong), compactShort = js.Any.fromFunction0(compactShort), exceptZero = js.Any.fromFunction0(exceptZero), generateStandardOrScientificPattern = generateStandardOrScientificPattern.asInstanceOf[js.Any], never = js.Any.fromFunction0(never), numberingSystem = numberingSystem.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], produceCompactSignPattern = js.Any.fromFunction1(produceCompactSignPattern), scientific = js.Any.fromFunction0(scientific), standard = js.Any.fromFunction0(standard))
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
    __obj.asInstanceOf[PercentPatterns]
  }
  @scala.inline
  implicit class PercentPatternsOps[Self <: PercentPatterns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGenerateStandardOrScientificPattern(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateStandardOrScientificPattern")(value.asInstanceOf[js.Any])
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
  }
  
}

