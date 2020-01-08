package typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat

import typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.CurrencyData
import typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.NumberILD
import typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.NumberLocalePatternData
import typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.RawNumberData
import typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.UnitData
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-unified-numberformat/lib/data", JSImport.Namespace)
@js.native
object libDataMod extends js.Object {
  val ILND: Record[String, js.Array[String]] = js.native
  def extractILD(
    units: Record[String, UnitData],
    currencies: Record[String, CurrencyData],
    numbers: RawNumberData,
    numberingSystem: String
  ): NumberILD = js.native
  def extractPatterns(
    units: Record[String, UnitData],
    currencies: Record[String, CurrencyData],
    numbers: RawNumberData,
    numberingSystem: String
  ): NumberLocalePatternData = js.native
  def extractPatterns(
    units: Record[String, UnitData],
    currencies: Record[String, CurrencyData],
    numbers: RawNumberData,
    numberingSystem: String,
    unit: String
  ): NumberLocalePatternData = js.native
  def extractPatterns(
    units: Record[String, UnitData],
    currencies: Record[String, CurrencyData],
    numbers: RawNumberData,
    numberingSystem: String,
    unit: String,
    currency: String
  ): NumberLocalePatternData = js.native
}

