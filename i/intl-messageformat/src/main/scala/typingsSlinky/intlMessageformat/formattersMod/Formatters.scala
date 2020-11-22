package typingsSlinky.intlMessageformat.formattersMod

import typingsSlinky.intlMessageformat.anon.Call
import typingsSlinky.intlMessageformat.anon.Instantiable
import typingsSlinky.intlMessageformat.anon.SupportedLocalesOf
import typingsSlinky.std.ConstructorParameters
import typingsSlinky.std.Intl.DateTimeFormat
import typingsSlinky.std.Intl.NumberFormat
import typingsSlinky.std.Intl.PluralRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Formatters extends js.Object {
  
  def getDateTimeFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.DateTimeFormat> is not an array type */ args: ConstructorParameters[Instantiable]
  ): DateTimeFormat = js.native
  
  def getNumberFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.NumberFormat> is not an array type */ args: ConstructorParameters[Call]
  ): NumberFormat = js.native
  
  def getPluralRules(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.PluralRules> is not an array type */ args: ConstructorParameters[SupportedLocalesOf]
  ): PluralRules = js.native
}
object Formatters {
  
  @scala.inline
  def apply(
    getDateTimeFormat: ConstructorParameters[Instantiable] => DateTimeFormat,
    getNumberFormat: ConstructorParameters[Call] => NumberFormat,
    getPluralRules: ConstructorParameters[SupportedLocalesOf] => PluralRules
  ): Formatters = {
    val __obj = js.Dynamic.literal(getDateTimeFormat = js.Any.fromFunction1(getDateTimeFormat), getNumberFormat = js.Any.fromFunction1(getNumberFormat), getPluralRules = js.Any.fromFunction1(getPluralRules))
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
    def setGetDateTimeFormat(value: ConstructorParameters[Instantiable] => DateTimeFormat): Self = this.set("getDateTimeFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNumberFormat(value: ConstructorParameters[Call] => NumberFormat): Self = this.set("getNumberFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPluralRules(value: ConstructorParameters[SupportedLocalesOf] => PluralRules): Self = this.set("getPluralRules", js.Any.fromFunction1(value))
  }
}
