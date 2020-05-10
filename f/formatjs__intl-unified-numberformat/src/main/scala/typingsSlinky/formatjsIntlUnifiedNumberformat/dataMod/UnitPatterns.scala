package typingsSlinky.formatjsIntlUnifiedNumberformat.dataMod

import typingsSlinky.formatjsIntlUnifiedNumberformat.RecordDecimalFormatNumSig
import typingsSlinky.formatjsIntlUtils.numberTypesMod.DecimalFormatNum
import typingsSlinky.formatjsIntlUtils.numberTypesMod.NotationPattern
import typingsSlinky.formatjsIntlUtils.numberTypesMod.SignDisplayPattern
import typingsSlinky.formatjsIntlUtils.numberTypesMod.SignPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.formatjsIntlUtils.numberTypesMod.NotationPattern because var conflicts: compactLong, compactShort. Inlined scientific, standard */ @js.native
trait UnitPatterns
  extends NotationPatterns
     with SignDisplayPattern {
  var compactSignPattern: js.UndefOr[js.Any] = js.native
  var generateStandardOrScientificPattern: js.Any = js.native
  var numberingSystem: js.Any = js.native
  var numbers: js.Any = js.native
  var pattern: js.UndefOr[js.Any] = js.native
  @JSName("scientific")
  var scientific_FUnitPatterns: SignPattern = js.native
  var signDisplay: js.UndefOr[js.Any] = js.native
  var signPattern: js.UndefOr[js.Any] = js.native
  @JSName("standard")
  var standard_FUnitPatterns: SignPattern = js.native
  var unit: js.Any = js.native
  var units: js.Any = js.native
  @JSName("always")
  def always_MUnitPatterns: NotationPattern = js.native
  @JSName("auto")
  def auto_MUnitPatterns: NotationPattern = js.native
  @JSName("exceptZero")
  def exceptZero_MUnitPatterns: NotationPattern = js.native
  def long: this.type = js.native
  def narrow: this.type = js.native
  @JSName("never")
  def never_MUnitPatterns: NotationPattern = js.native
  def scientific: SignPattern = js.native
  def short: this.type = js.native
  def standard: SignPattern = js.native
}

object UnitPatterns {
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
    long: () => UnitPatterns,
    narrow: () => UnitPatterns,
    never: () => NotationPattern,
    numberingSystem: js.Any,
    numbers: js.Any,
    produceCompactSignPattern: DecimalFormatNum => SignPattern,
    scientific: () => SignPattern,
    short: () => UnitPatterns,
    standard: () => SignPattern,
    unit: js.Any,
    units: js.Any
  ): UnitPatterns = {
    val __obj = js.Dynamic.literal(always = js.Any.fromFunction0(always), auto = js.Any.fromFunction0(auto), compactLong = js.Any.fromFunction0(compactLong), compactShort = js.Any.fromFunction0(compactShort), exceptZero = js.Any.fromFunction0(exceptZero), generateStandardOrScientificPattern = generateStandardOrScientificPattern.asInstanceOf[js.Any], long = js.Any.fromFunction0(long), narrow = js.Any.fromFunction0(narrow), never = js.Any.fromFunction0(never), numberingSystem = numberingSystem.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], produceCompactSignPattern = js.Any.fromFunction1(produceCompactSignPattern), scientific = js.Any.fromFunction0(scientific), short = js.Any.fromFunction0(short), standard = js.Any.fromFunction0(standard), unit = unit.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[UnitPatterns]
  }
  @scala.inline
  implicit class UnitPatternsOps[Self <: UnitPatterns] (val x: Self) extends AnyVal {
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
    def withGenerateStandardOrScientificPattern(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateStandardOrScientificPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLong(value: () => UnitPatterns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNarrow(value: () => UnitPatterns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("narrow")(js.Any.fromFunction0(value))
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
    def withShort(value: () => UnitPatterns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStandard(value: () => SignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnit(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnits(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
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
    def withPattern(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
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

