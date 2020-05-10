package typingsSlinky.intlMessageformat.formattersMod

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

@js.native
trait Formatters extends js.Object {
  def getDateTimeFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.DateTimeFormat> is not an array type */ args: ConstructorParameters[AnonInstantiable]
  ): DateTimeFormat = js.native
  def getNumberFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.NumberFormat> is not an array type */ args: ConstructorParameters[AnonCall]
  ): NumberFormat = js.native
  def getPluralRules(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.PluralRules> is not an array type */ args: ConstructorParameters[AnonSupportedLocalesOf]
  ): PluralRules = js.native
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
  @scala.inline
  implicit class FormattersOps[Self <: Formatters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDateTimeFormat(value: ConstructorParameters[AnonInstantiable] => DateTimeFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDateTimeFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNumberFormat(value: ConstructorParameters[AnonCall] => NumberFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumberFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPluralRules(value: ConstructorParameters[AnonSupportedLocalesOf] => PluralRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPluralRules")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

