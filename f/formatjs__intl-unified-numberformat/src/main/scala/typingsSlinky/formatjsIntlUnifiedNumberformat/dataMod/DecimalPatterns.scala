package typingsSlinky.formatjsIntlUnifiedNumberformat.dataMod

import typingsSlinky.formatjsIntlUnifiedNumberformat.RecordDecimalFormatNumSig
import typingsSlinky.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.always
import typingsSlinky.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.auto
import typingsSlinky.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.exceptZero
import typingsSlinky.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.never
import typingsSlinky.formatjsIntlUtils.numberTypesMod.CompactSignPattern
import typingsSlinky.formatjsIntlUtils.numberTypesMod.DecimalFormatNum
import typingsSlinky.formatjsIntlUtils.numberTypesMod.NotationPattern
import typingsSlinky.formatjsIntlUtils.numberTypesMod.RawNumberData
import typingsSlinky.formatjsIntlUtils.numberTypesMod.SignDisplayPattern
import typingsSlinky.formatjsIntlUtils.numberTypesMod.SignPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.formatjsIntlUtils.numberTypesMod.NotationPattern because var conflicts: compactLong, compactShort. Inlined scientific, standard */ @js.native
trait DecimalPatterns
  extends NotationPatterns
     with SignDisplayPattern {
  var compactSignPattern: js.UndefOr[CompactSignPattern] = js.native
  var numberingSystem: String = js.native
  var numbers: RawNumberData = js.native
  @JSName("scientific")
  var scientific_FDecimalPatterns: SignPattern = js.native
  var signDisplay: js.UndefOr[auto | always | never | exceptZero] = js.native
  var signPattern: js.UndefOr[SignPattern] = js.native
  @JSName("standard")
  var standard_FDecimalPatterns: SignPattern = js.native
  @JSName("always")
  def always_MDecimalPatterns: NotationPattern = js.native
  @JSName("auto")
  def auto_MDecimalPatterns: NotationPattern = js.native
  @JSName("exceptZero")
  def exceptZero_MDecimalPatterns: NotationPattern = js.native
  @JSName("never")
  def never_MDecimalPatterns: NotationPattern = js.native
  def scientific: SignPattern = js.native
  def standard: SignPattern = js.native
}

object DecimalPatterns {
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
    never: () => NotationPattern,
    numberingSystem: String,
    numbers: RawNumberData,
    produceCompactSignPattern: DecimalFormatNum => SignPattern,
    scientific: () => SignPattern,
    standard: () => SignPattern
  ): DecimalPatterns = {
    val __obj = js.Dynamic.literal(always = js.Any.fromFunction0(always), auto = js.Any.fromFunction0(auto), compactLong = js.Any.fromFunction0(compactLong), compactShort = js.Any.fromFunction0(compactShort), exceptZero = js.Any.fromFunction0(exceptZero), never = js.Any.fromFunction0(never), numberingSystem = numberingSystem.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], produceCompactSignPattern = js.Any.fromFunction1(produceCompactSignPattern), scientific = js.Any.fromFunction0(scientific), standard = js.Any.fromFunction0(standard))
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
    __obj.asInstanceOf[DecimalPatterns]
  }
  @scala.inline
  implicit class DecimalPatternsOps[Self <: DecimalPatterns] (val x: Self) extends AnyVal {
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
    def withNumberingSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumbers(value: RawNumberData): Self = {
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
    def withCompactSignPattern(value: CompactSignPattern): Self = {
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
    def withSignDisplay(value: auto | always | never | exceptZero): Self = {
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
    def withSignPattern(value: SignPattern): Self = {
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

