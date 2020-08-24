package typingsSlinky.formatjsIntlDatetimeformat.coreMod

import typingsSlinky.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.day
import typingsSlinky.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.dayPeriod
import typingsSlinky.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.era
import typingsSlinky.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.hour
import typingsSlinky.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.literal
import typingsSlinky.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.minute
import typingsSlinky.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.month
import typingsSlinky.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.relatedYear
import typingsSlinky.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.second
import typingsSlinky.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.string
import typingsSlinky.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.timeZoneName
import typingsSlinky.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.unknown
import typingsSlinky.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.weekday
import typingsSlinky.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.year
import typingsSlinky.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.yearName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeFormatPart extends js.Object {
  var `type`: literal | era | year | month | day | hour | minute | second | weekday | timeZoneName | dayPeriod | relatedYear | yearName | unknown = js.native
  var value: string = js.native
}

object DateTimeFormatPart {
  @scala.inline
  def apply(
    `type`: literal | era | year | month | day | hour | minute | second | weekday | timeZoneName | dayPeriod | relatedYear | yearName | unknown,
    value: string
  ): DateTimeFormatPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeFormatPart]
  }
  @scala.inline
  implicit class DateTimeFormatPartOps[Self <: DateTimeFormatPart] (val x: Self) extends AnyVal {
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
    def setType(
      value: literal | era | year | month | day | hour | minute | second | weekday | timeZoneName | dayPeriod | relatedYear | yearName | unknown
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: string): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

