package typingsSlinky.formatjsIntlUnifiedNumberformat.dataMod

import typingsSlinky.formatjsIntlUtils.numberTypesMod.CurrencyData
import typingsSlinky.formatjsIntlUtils.numberTypesMod.CurrencyPattern
import typingsSlinky.formatjsIntlUtils.numberTypesMod.NumberLocalePatternData
import typingsSlinky.formatjsIntlUtils.numberTypesMod.RawNumberData
import typingsSlinky.formatjsIntlUtils.numberTypesMod.SignDisplayPattern
import typingsSlinky.formatjsIntlUtils.numberTypesMod.UnitData
import typingsSlinky.formatjsIntlUtils.numberTypesMod.UnitPattern
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-unified-numberformat/lib/data", "Patterns")
@js.native
class Patterns protected () extends NumberLocalePatternData {
  def this(
    units: Record[String, UnitData],
    currencies: Record[String, CurrencyData],
    numbers: RawNumberData,
    numberingSystem: String
  ) = this()
  def this(
    units: Record[String, UnitData],
    currencies: Record[String, CurrencyData],
    numbers: RawNumberData,
    numberingSystem: String,
    unit: String
  ) = this()
  def this(
    units: Record[String, UnitData],
    currencies: Record[String, CurrencyData],
    numbers: RawNumberData,
    numberingSystem: String,
    unit: String,
    currency: String
  ) = this()
  def this(
    units: Record[String, UnitData],
    currencies: Record[String, CurrencyData],
    numbers: RawNumberData,
    numberingSystem: String,
    unit: String,
    currency: String,
    currencySign: String
  ) = this()
  var _currency: js.UndefOr[js.Any] = js.native
  var _unit: js.UndefOr[js.Any] = js.native
  var currencies: js.Any = js.native
  /* CompleteClass */
  override var currency: Record[String, CurrencyPattern] = js.native
  var currencyPatterns: js.UndefOr[js.Any] = js.native
  var currencySign: js.UndefOr[js.Any] = js.native
  /* CompleteClass */
  override var decimal: SignDisplayPattern = js.native
  var decimalPatterns: js.UndefOr[js.Any] = js.native
  var numberingSystem: js.Any = js.native
  var numbers: js.Any = js.native
  /* CompleteClass */
  override var percent: SignDisplayPattern = js.native
  var percentPatterns: js.UndefOr[js.Any] = js.native
  /* CompleteClass */
  override var unit: Record[String, UnitPattern] = js.native
  var unitPatterns: js.UndefOr[js.Any] = js.native
  var units: js.Any = js.native
  @JSName("currency")
  def currency_MPatterns(): Record[String, CurrencyPatterns] = js.native
  @JSName("decimal")
  def decimal_MPatterns(): DecimalPatterns = js.native
  @JSName("percent")
  def percent_MPatterns(): PercentPatterns = js.native
  @JSName("unit")
  def unit_MPatterns(): Record[String, UnitPatterns] = js.native
}

