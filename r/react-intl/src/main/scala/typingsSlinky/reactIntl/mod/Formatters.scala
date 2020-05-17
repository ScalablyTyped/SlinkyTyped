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

@js.native
trait Formatters extends js.Object {
  def getDateTimeFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.DateTimeFormat> is not an array type */ args: ConstructorParameters[Call]
  ): DateTimeFormat = js.native
  def getDisplayNames(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof DisplayNames> is not an array type */ args: ConstructorParameters[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DisplayNames */ _
    ]
  ): js.Any = js.native
  def getListFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlListFormat> is not an array type */ args: ConstructorParameters[TypeofIntlListFormat]
  ): default = js.native
  def getMessageFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlMessageFormat> is not an array type */ args: ConstructorParameters[TypeofIntlMessageFormat]
  ): typingsSlinky.intlMessageformat.mod.default = js.native
  def getNumberFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.NumberFormat> is not an array type */ args: ConstructorParameters[Instantiable]
  ): NumberFormat = js.native
  def getPluralRules(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.PluralRules> is not an array type */ args: ConstructorParameters[SupportedLocalesOf]
  ): PluralRules = js.native
  def getRelativeTimeFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlRelativeTimeFormat> is not an array type */ args: ConstructorParameters[TypeofIntlRelativeTimeFor]
  ): typingsSlinky.formatjsIntlRelativetimeformat.mod.default = js.native
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
  @scala.inline
  implicit class FormattersOps[Self <: Formatters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDateTimeFormat(value: ConstructorParameters[Call] => DateTimeFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDateTimeFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDisplayNames(
      value: ConstructorParameters[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DisplayNames */ _
        ] => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayNames")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetListFormat(value: ConstructorParameters[TypeofIntlListFormat] => default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getListFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMessageFormat(
      value: ConstructorParameters[TypeofIntlMessageFormat] => typingsSlinky.intlMessageformat.mod.default
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMessageFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNumberFormat(value: ConstructorParameters[Instantiable] => NumberFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumberFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPluralRules(value: ConstructorParameters[SupportedLocalesOf] => PluralRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPluralRules")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRelativeTimeFormat(
      value: ConstructorParameters[TypeofIntlRelativeTimeFor] => typingsSlinky.formatjsIntlRelativetimeformat.mod.default
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRelativeTimeFormat")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

