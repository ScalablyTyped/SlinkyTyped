package typingsSlinky.globalize.dateMod.globalizeDistGlobalizeAugmentingMod

import typingsSlinky.globalize.globalizeStrings.full
import typingsSlinky.globalize.globalizeStrings.long
import typingsSlinky.globalize.globalizeStrings.medium
import typingsSlinky.globalize.globalizeStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateFormatterOptions extends js.Object {
  /**
  		 * One of the following String values: full, long, medium, or short, eg. { date: "full" }.
  		 */
  var date: js.UndefOr[full | long | medium | short] = js.native
  /**
  		 * One of the following String values: full, long, medium, or short, eg. { datetime: "full" }
  		 */
  var datetime: js.UndefOr[full | long | medium | short] = js.native
  /**
  		 * String value indicating a machine raw pattern (anything in the "Sym." column) eg. { raw: "dd/mm" }.
  		 * Note this is NOT recommended for i18n in general. Use skeleton instead.
  		 */
  var raw: js.UndefOr[String] = js.native
  /**
  		 * String value indicating a skeleton (see description above), eg. { skeleton: "GyMMMd" }.
  		 * Skeleton provides a more flexible formatting mechanism than the predefined list full, long, medium, or short represented by date, time, or datetime.
  		 * Instead, they are an open-ended list of patterns containing only date field information, and in a canonical order.
  		 */
  var skeleton: js.UndefOr[String] = js.native
  /**
  		 * One of the following String values: full, long, medium, or short, eg. { time: "full" }.
  		 */
  var time: js.UndefOr[full | long | medium | short] = js.native
  /**
  		 * String based on the time zone names of the IANA time zone database,
  		 * such as "Asia/Shanghai", "Asia/Kolkata", "America/New_York".
  		 */
  var timeZone: js.UndefOr[String] = js.native
}

object DateFormatterOptions {
  @scala.inline
  def apply(): DateFormatterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateFormatterOptions]
  }
  @scala.inline
  implicit class DateFormatterOptionsOps[Self <: DateFormatterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: full | long | medium | short): Self = {
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
    def withDatetime(value: full | long | medium | short): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatetime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetime")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withSkeleton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skeleton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkeleton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skeleton")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: full | long | medium | short): Self = {
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
    @scala.inline
    def withTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(js.undefined)
        ret
    }
  }
  
}

