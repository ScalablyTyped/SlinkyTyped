package typingsSlinky.intlMessageformat.mod

import typingsSlinky.intlMessageformat.AnonCall
import typingsSlinky.intlMessageformat.AnonInstantiable
import typingsSlinky.intlMessageformat.AnonSupportedLocalesOf
import typingsSlinky.std.ConstructorParameters
import typingsSlinky.std.Intl.DateTimeFormat
import typingsSlinky.std.Intl.NumberFormat
import typingsSlinky.std.Intl.PluralRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatters extends js.Object {
  def getDateTimeFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.DateTimeFormat> is not an array type */ args: ConstructorParameters[AnonInstantiable]
  ): DateTimeFormat
  def getNumberFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.NumberFormat> is not an array type */ args: ConstructorParameters[AnonCall]
  ): NumberFormat
  def getPluralRules(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.PluralRules> is not an array type */ args: ConstructorParameters[AnonSupportedLocalesOf]
  ): PluralRules
}

object Formatters {
  @scala.inline
  def apply(
    getDateTimeFormat: ConstructorParameters[AnonInstantiable] => DateTimeFormat,
    getNumberFormat: ConstructorParameters[AnonCall] => NumberFormat,
    getPluralRules: ConstructorParameters[AnonSupportedLocalesOf] => PluralRules
  ): Formatters = {
    val __obj = js.Dynamic.literal(getDateTimeFormat = js.Any.fromFunction1(getDateTimeFormat), getNumberFormat = js.Any.fromFunction1(getNumberFormat), getPluralRules = js.Any.fromFunction1(getPluralRules))
  
    __obj.asInstanceOf[Formatters]
  }
}

