package typingsSlinky.oracleOraclejet.ojvalidationDatetimeMod.IntlDateTimeConverter

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.`2-digit`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.date
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.datetime
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.full
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.local
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.long
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.medium
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.narrow
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.numeric
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.offset
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.short
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.time
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.zulu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ConverterOptions extends js.Object {
  var dateFormat: js.UndefOr[short | medium | long | full] = js.native
  var day: js.UndefOr[`2-digit` | numeric] = js.native
  var dst: js.UndefOr[Boolean] = js.native
  var era: js.UndefOr[narrow | short | long] = js.native
  var formatType: js.UndefOr[date | time | datetime] = js.native
  var hour: js.UndefOr[`2-digit` | numeric] = js.native
  var hour12: js.UndefOr[Boolean] = js.native
  var isoStrFormat: js.UndefOr[offset | zulu | local | auto] = js.native
  var lenientParse: js.UndefOr[full | none] = js.native
  var millisecond: js.UndefOr[numeric] = js.native
  var minute: js.UndefOr[`2-digit` | numeric] = js.native
  var month: js.UndefOr[`2-digit` | numeric | narrow | short | long] = js.native
  var pattern: js.UndefOr[String] = js.native
  var second: js.UndefOr[`2-digit` | numeric] = js.native
  var timeFormat: js.UndefOr[short | medium | long | full] = js.native
  var timeZone: js.UndefOr[String] = js.native
  var timeZoneName: js.UndefOr[short | long] = js.native
  var `two-digit-year-start`: js.UndefOr[Double] = js.native
  var weekday: js.UndefOr[narrow | short | long] = js.native
  var year: js.UndefOr[`2-digit` | numeric] = js.native
}

object ConverterOptions {
  @scala.inline
  def apply(): ConverterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConverterOptions]
  }
  @scala.inline
  implicit class ConverterOptionsOps[Self <: ConverterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateFormat(value: short | medium | long | full): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDay(value: `2-digit` | numeric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(js.undefined)
        ret
    }
    @scala.inline
    def withDst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dst")(js.undefined)
        ret
    }
    @scala.inline
    def withEra(value: narrow | short | long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("era")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("era")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatType(value: date | time | datetime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatType")(js.undefined)
        ret
    }
    @scala.inline
    def withHour(value: `2-digit` | numeric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(js.undefined)
        ret
    }
    @scala.inline
    def withHour12(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour12")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHour12: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour12")(js.undefined)
        ret
    }
    @scala.inline
    def withIsoStrFormat(value: offset | zulu | local | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoStrFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsoStrFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoStrFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLenientParse(value: full | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lenientParse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLenientParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lenientParse")(js.undefined)
        ret
    }
    @scala.inline
    def withMillisecond(value: numeric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMillisecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisecond")(js.undefined)
        ret
    }
    @scala.inline
    def withMinute(value: `2-digit` | numeric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute")(js.undefined)
        ret
    }
    @scala.inline
    def withMonth(value: `2-digit` | numeric | narrow | short | long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withSecond(value: `2-digit` | numeric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeFormat(value: short | medium | long | full): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFormat")(js.undefined)
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
    @scala.inline
    def withTimeZoneName(value: short | long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZoneName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneName")(js.undefined)
        ret
    }
    @scala.inline
    def `withTwo-digit-year-start`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("two-digit-year-start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTwo-digit-year-start`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("two-digit-year-start")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekday(value: narrow | short | long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekday")(js.undefined)
        ret
    }
    @scala.inline
    def withYear(value: `2-digit` | numeric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(js.undefined)
        ret
    }
  }
  
}

