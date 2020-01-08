package typingsSlinky.reactDashIntl.reactDashIntlMod

import typingsSlinky.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatMod.default
import typingsSlinky.reactDashIntl.Anon_Locales
import typingsSlinky.reactDashIntl.Anon_LocalesOptions
import typingsSlinky.reactDashIntl.Anon_LocalesOptionsSupportedLocalesOf
import typingsSlinky.reactDashIntl.TypeofClassIntlListFormat
import typingsSlinky.reactDashIntl.TypeofClassIntlMessageFormat
import typingsSlinky.reactDashIntl.TypeofClassIntlRelativeTimeFormat
import typingsSlinky.std.ConstructorParameters
import typingsSlinky.std.Intl.DateTimeFormat
import typingsSlinky.std.Intl.NumberFormat
import typingsSlinky.std.Intl.PluralRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatters extends js.Object {
  def getDateTimeFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.DateTimeFormat> is not an array type */ args: ConstructorParameters[Anon_Locales]
  ): DateTimeFormat
  def getListFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlListFormat> is not an array type */ args: ConstructorParameters[TypeofClassIntlListFormat]
  ): default
  def getMessageFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlMessageFormat> is not an array type */ args: ConstructorParameters[TypeofClassIntlMessageFormat]
  ): typingsSlinky.intlDashMessageformat.intlDashMessageformatMod.default
  def getNumberFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.NumberFormat> is not an array type */ args: ConstructorParameters[Anon_LocalesOptions]
  ): NumberFormat
  def getPluralRules(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.PluralRules> is not an array type */ args: ConstructorParameters[Anon_LocalesOptionsSupportedLocalesOf]
  ): PluralRules
  def getRelativeTimeFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlRelativeTimeFormat> is not an array type */ args: ConstructorParameters[TypeofClassIntlRelativeTimeFormat]
  ): typingsSlinky.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatMod.default
}

object Formatters {
  @scala.inline
  def apply(
    getDateTimeFormat: ConstructorParameters[Anon_Locales] => DateTimeFormat,
    getListFormat: ConstructorParameters[TypeofClassIntlListFormat] => default,
    getMessageFormat: ConstructorParameters[TypeofClassIntlMessageFormat] => typingsSlinky.intlDashMessageformat.intlDashMessageformatMod.default,
    getNumberFormat: ConstructorParameters[Anon_LocalesOptions] => NumberFormat,
    getPluralRules: ConstructorParameters[Anon_LocalesOptionsSupportedLocalesOf] => PluralRules,
    getRelativeTimeFormat: ConstructorParameters[TypeofClassIntlRelativeTimeFormat] => typingsSlinky.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatMod.default
  ): Formatters = {
    val __obj = js.Dynamic.literal(getDateTimeFormat = js.Any.fromFunction1(getDateTimeFormat), getListFormat = js.Any.fromFunction1(getListFormat), getMessageFormat = js.Any.fromFunction1(getMessageFormat), getNumberFormat = js.Any.fromFunction1(getNumberFormat), getPluralRules = js.Any.fromFunction1(getPluralRules), getRelativeTimeFormat = js.Any.fromFunction1(getRelativeTimeFormat))
  
    __obj.asInstanceOf[Formatters]
  }
}

