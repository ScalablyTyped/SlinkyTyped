package typingsSlinky.reactIntl.typesMod

import typingsSlinky.formatjsIntlRelativetimeformat.mod.IntlRelativeTimeFormatOptions
import typingsSlinky.std.Intl.DateTimeFormatOptions
import typingsSlinky.std.Intl.NumberFormatOptions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<intl-messageformat.intl-messageformat.Formats> */
@js.native
trait CustomFormats extends js.Object {
  var date: js.UndefOr[Record[String, DateTimeFormatOptions]] = js.native
  var number: js.UndefOr[Record[String, NumberFormatOptions]] = js.native
  var relative: js.UndefOr[Record[String, IntlRelativeTimeFormatOptions]] = js.native
  var time: js.UndefOr[Record[String, DateTimeFormatOptions]] = js.native
}

object CustomFormats {
  @scala.inline
  def apply(): CustomFormats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomFormats]
  }
  @scala.inline
  implicit class CustomFormatsOps[Self <: CustomFormats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: Record[String, DateTimeFormatOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withNumber(value: Record[String, NumberFormatOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withRelative(value: Record[String, IntlRelativeTimeFormatOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: Record[String, DateTimeFormatOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
  }
  
}

