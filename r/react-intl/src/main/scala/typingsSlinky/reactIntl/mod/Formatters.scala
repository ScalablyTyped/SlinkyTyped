package typingsSlinky.reactIntl.mod

import typingsSlinky.formatjsIntlListformat.mod.default
import typingsSlinky.reactIntl.anon.Call
import typingsSlinky.reactIntl.anon.Instantiable
import typingsSlinky.reactIntl.anon.SupportedLocalesOf
import typingsSlinky.reactIntl.anon.TypeofIntlListFormat
import typingsSlinky.reactIntl.anon.TypeofIntlMessageFormat
import typingsSlinky.reactIntl.anon.TypeofIntlRelativeTimeFor
import typingsSlinky.std.ConstructorParameters
import typingsSlinky.std.Intl.DateTimeFormat
import typingsSlinky.std.Intl.NumberFormat
import typingsSlinky.std.Intl.PluralRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatters extends js.Object {
  def getDateTimeFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.DateTimeFormat> is not an array type */ args: ConstructorParameters[Call]
  ): DateTimeFormat
  def getDisplayNames(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof DisplayNames> is not an array type */ args: ConstructorParameters[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DisplayNames */ _
    ]
  ): js.Any
  def getListFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlListFormat> is not an array type */ args: ConstructorParameters[TypeofIntlListFormat]
  ): default
  def getMessageFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlMessageFormat> is not an array type */ args: ConstructorParameters[TypeofIntlMessageFormat]
  ): typingsSlinky.intlMessageformat.mod.default
  def getNumberFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.NumberFormat> is not an array type */ args: ConstructorParameters[Instantiable]
  ): NumberFormat
  def getPluralRules(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.PluralRules> is not an array type */ args: ConstructorParameters[SupportedLocalesOf]
  ): PluralRules
  def getRelativeTimeFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlRelativeTimeFormat> is not an array type */ args: ConstructorParameters[TypeofIntlRelativeTimeFor]
  ): typingsSlinky.formatjsIntlRelativetimeformat.mod.default
}

object Formatters {
  @scala.inline
  def apply(
    getDateTimeFormat: ConstructorParameters[Call] => DateTimeFormat,
    getDisplayNames: ConstructorParameters[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DisplayNames */ _
    ] => js.Any,
    getListFormat: ConstructorParameters[TypeofIntlListFormat] => default,
    getMessageFormat: ConstructorParameters[TypeofIntlMessageFormat] => typingsSlinky.intlMessageformat.mod.default,
    getNumberFormat: ConstructorParameters[Instantiable] => NumberFormat,
    getPluralRules: ConstructorParameters[SupportedLocalesOf] => PluralRules,
    getRelativeTimeFormat: ConstructorParameters[TypeofIntlRelativeTimeFor] => typingsSlinky.formatjsIntlRelativetimeformat.mod.default
  ): Formatters = {
    val __obj = js.Dynamic.literal(getDateTimeFormat = js.Any.fromFunction1(getDateTimeFormat), getDisplayNames = js.Any.fromFunction1(getDisplayNames), getListFormat = js.Any.fromFunction1(getListFormat), getMessageFormat = js.Any.fromFunction1(getMessageFormat), getNumberFormat = js.Any.fromFunction1(getNumberFormat), getPluralRules = js.Any.fromFunction1(getPluralRules), getRelativeTimeFormat = js.Any.fromFunction1(getRelativeTimeFormat))
    __obj.asInstanceOf[Formatters]
  }
}

