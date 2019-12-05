package typingsSlinky.intlDashMessageformat.libFormattersMod

import typingsSlinky.intlDashMessageformat.Anon_Locales
import typingsSlinky.intlDashMessageformat.Anon_LocalesOptions
import typingsSlinky.intlDashMessageformat.Anon_LocalesOptionsSupportedLocalesOf
import typingsSlinky.std.ConstructorParameters
import typingsSlinky.std.Intl.DateTimeFormat
import typingsSlinky.std.Intl.NumberFormat
import typingsSlinky.std.Intl.PluralRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatters extends js.Object {
  def getDateTimeFormat(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.DateTimeFormat> is not an array type */ args: ConstructorParameters[Anon_LocalesOptions]
  ): DateTimeFormat
  def getNumberFormat(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.NumberFormat> is not an array type */ args: ConstructorParameters[Anon_Locales]
  ): NumberFormat
  def getPluralRules(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.PluralRules> is not an array type */ args: ConstructorParameters[Anon_LocalesOptionsSupportedLocalesOf]
  ): PluralRules
}

object Formatters {
  @scala.inline
  def apply(
    getDateTimeFormat: ConstructorParameters[Anon_LocalesOptions] => DateTimeFormat,
    getNumberFormat: ConstructorParameters[Anon_Locales] => NumberFormat,
    getPluralRules: ConstructorParameters[Anon_LocalesOptionsSupportedLocalesOf] => PluralRules
  ): Formatters = {
    val __obj = js.Dynamic.literal(getDateTimeFormat = js.Any.fromFunction1(getDateTimeFormat), getNumberFormat = js.Any.fromFunction1(getNumberFormat), getPluralRules = js.Any.fromFunction1(getPluralRules))
  
    __obj.asInstanceOf[Formatters]
  }
}

