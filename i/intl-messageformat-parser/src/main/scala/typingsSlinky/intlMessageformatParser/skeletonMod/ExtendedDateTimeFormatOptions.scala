package typingsSlinky.intlMessageformatParser.skeletonMod

import typingsSlinky.intlMessageformatParser.intlMessageformatParserStrings.h11
import typingsSlinky.intlMessageformatParser.intlMessageformatParserStrings.h12
import typingsSlinky.intlMessageformatParser.intlMessageformatParserStrings.h23
import typingsSlinky.intlMessageformatParser.intlMessageformatParserStrings.h24
import typingsSlinky.std.Intl.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedDateTimeFormatOptions extends DateTimeFormatOptions {
  var hourCycle: js.UndefOr[h11 | h12 | h23 | h24] = js.native
}

object ExtendedDateTimeFormatOptions {
  @scala.inline
  def apply(): ExtendedDateTimeFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedDateTimeFormatOptions]
  }
  @scala.inline
  implicit class ExtendedDateTimeFormatOptionsOps[Self <: ExtendedDateTimeFormatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHourCycle(value: h11 | h12 | h23 | h24): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourCycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourCycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourCycle")(js.undefined)
        ret
    }
  }
  
}

