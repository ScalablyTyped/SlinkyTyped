package typingsSlinky.intlMessageformat.anon

import typingsSlinky.std.Intl.DateTimeFormatOptions
import typingsSlinky.std.Intl.NumberFormatOptions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<intl-messageformat.intl-messageformat.Formats> */
@js.native
trait PartialFormats extends js.Object {
  var date: js.UndefOr[Record[String, DateTimeFormatOptions]] = js.native
  var number: js.UndefOr[Record[String, NumberFormatOptions]] = js.native
  var time: js.UndefOr[Record[String, DateTimeFormatOptions]] = js.native
}

object PartialFormats {
  @scala.inline
  def apply(): PartialFormats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFormats]
  }
  @scala.inline
  implicit class PartialFormatsOps[Self <: PartialFormats] (val x: Self) extends AnyVal {
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

