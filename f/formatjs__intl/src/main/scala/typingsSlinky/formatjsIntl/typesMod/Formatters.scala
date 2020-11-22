package typingsSlinky.formatjsIntl.typesMod

import typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat
import typingsSlinky.formatjsIntl.anon.Call
import typingsSlinky.formatjsIntl.anon.Instantiable
import typingsSlinky.formatjsIntl.anon.SupportedLocalesOf
import typingsSlinky.formatjsIntl.anon.TypeofDisplayNames
import typingsSlinky.formatjsIntl.anon.TypeofIntlListFormat
import typingsSlinky.formatjsIntl.anon.TypeofIntlMessageFormat
import typingsSlinky.formatjsIntl.anon.TypeofIntlRelativeTimeFor
import typingsSlinky.formatjsIntlDisplaynames.mod.DisplayNames
import typingsSlinky.formatjsIntlListformat.mod.default
import typingsSlinky.intlMessageformat.mod.IntlMessageFormat
import typingsSlinky.std.ConstructorParameters
import typingsSlinky.std.Intl.NumberFormat
import typingsSlinky.std.Intl.PluralRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Formatters extends js.Object {
  
  def getDateTimeFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.DateTimeFormat> is not an array type */ args: ConstructorParameters[Call]
  ): DateTimeFormat = js.native
  
  def getDisplayNames(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof DisplayNames> is not an array type */ args: ConstructorParameters[TypeofDisplayNames]
  ): DisplayNames = js.native
  
  def getListFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlListFormat> is not an array type */ args: ConstructorParameters[TypeofIntlListFormat]
  ): default = js.native
  
  def getMessageFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlMessageFormat> is not an array type */ args: ConstructorParameters[TypeofIntlMessageFormat]
  ): IntlMessageFormat = js.native
  
  def getNumberFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.NumberFormat> is not an array type */ args: ConstructorParameters[SupportedLocalesOf]
  ): NumberFormat = js.native
  
  def getPluralRules(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.PluralRules> is not an array type */ args: ConstructorParameters[Instantiable]
  ): PluralRules = js.native
  
  def getRelativeTimeFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlRelativeTimeFormat> is not an array type */ args: ConstructorParameters[TypeofIntlRelativeTimeFor]
  ): typingsSlinky.formatjsIntlRelativetimeformat.mod.default = js.native
}
object Formatters {
  
  @scala.inline
  def apply(
    getDateTimeFormat: ConstructorParameters[Call] => DateTimeFormat,
    getDisplayNames: ConstructorParameters[TypeofDisplayNames] => DisplayNames,
    getListFormat: ConstructorParameters[TypeofIntlListFormat] => default,
    getMessageFormat: ConstructorParameters[TypeofIntlMessageFormat] => IntlMessageFormat,
    getNumberFormat: ConstructorParameters[SupportedLocalesOf] => NumberFormat,
    getPluralRules: ConstructorParameters[Instantiable] => PluralRules,
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetDateTimeFormat(value: ConstructorParameters[Call] => DateTimeFormat): Self = this.set("getDateTimeFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDisplayNames(value: ConstructorParameters[TypeofDisplayNames] => DisplayNames): Self = this.set("getDisplayNames", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetListFormat(value: ConstructorParameters[TypeofIntlListFormat] => default): Self = this.set("getListFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMessageFormat(value: ConstructorParameters[TypeofIntlMessageFormat] => IntlMessageFormat): Self = this.set("getMessageFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNumberFormat(value: ConstructorParameters[SupportedLocalesOf] => NumberFormat): Self = this.set("getNumberFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPluralRules(value: ConstructorParameters[Instantiable] => PluralRules): Self = this.set("getPluralRules", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRelativeTimeFormat(
      value: ConstructorParameters[TypeofIntlRelativeTimeFor] => typingsSlinky.formatjsIntlRelativetimeformat.mod.default
    ): Self = this.set("getRelativeTimeFormat", js.Any.fromFunction1(value))
  }
}
