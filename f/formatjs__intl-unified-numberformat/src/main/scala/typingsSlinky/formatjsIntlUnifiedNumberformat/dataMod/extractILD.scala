package typingsSlinky.formatjsIntlUnifiedNumberformat.dataMod

import typingsSlinky.formatjsIntlUtils.numberTypesMod.CurrencyData
import typingsSlinky.formatjsIntlUtils.numberTypesMod.NumberILD
import typingsSlinky.formatjsIntlUtils.numberTypesMod.RawNumberData
import typingsSlinky.formatjsIntlUtils.numberTypesMod.UnitData
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-unified-numberformat/lib/data", "extractILD")
@js.native
object extractILD extends js.Object {
  def apply(
    units: Record[String, UnitData],
    currencies: Record[String, CurrencyData],
    numbers: RawNumberData,
    numberingSystem: String
  ): NumberILD = js.native
}

