package typingsSlinky.formatjsIntlUtils.relativeTimeTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ f in @formatjs/intl-utils.@formatjs/intl-utils/dist/relative-time-types.RelativeTimeField ]:? @formatjs/intl-utils.@formatjs/intl-utils/dist/relative-time-types.FieldData} & {  nu ? :std.Array<string | null>} */
@js.native
trait LocaleFieldsData extends js.Object {
  var day: js.UndefOr[FieldData] = js.native
  var `day-narrow`: js.UndefOr[FieldData] = js.native
  var `day-short`: js.UndefOr[FieldData] = js.native
  var hour: js.UndefOr[FieldData] = js.native
  var `hour-narrow`: js.UndefOr[FieldData] = js.native
  var `hour-short`: js.UndefOr[FieldData] = js.native
  var minute: js.UndefOr[FieldData] = js.native
  var `minute-narrow`: js.UndefOr[FieldData] = js.native
  var `minute-short`: js.UndefOr[FieldData] = js.native
  var month: js.UndefOr[FieldData] = js.native
  var `month-narrow`: js.UndefOr[FieldData] = js.native
  var `month-short`: js.UndefOr[FieldData] = js.native
  var nu: js.UndefOr[js.Array[String | Null]] = js.native
  var quarter: js.UndefOr[FieldData] = js.native
  var `quarter-narrow`: js.UndefOr[FieldData] = js.native
  var `quarter-short`: js.UndefOr[FieldData] = js.native
  var second: js.UndefOr[FieldData] = js.native
  var `second-narrow`: js.UndefOr[FieldData] = js.native
  var `second-short`: js.UndefOr[FieldData] = js.native
  var week: js.UndefOr[FieldData] = js.native
  var `week-narrow`: js.UndefOr[FieldData] = js.native
  var `week-short`: js.UndefOr[FieldData] = js.native
  var year: js.UndefOr[FieldData] = js.native
  var `year-narrow`: js.UndefOr[FieldData] = js.native
  var `year-short`: js.UndefOr[FieldData] = js.native
}

object LocaleFieldsData {
  @scala.inline
  def apply(): LocaleFieldsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleFieldsData]
  }
  @scala.inline
  implicit class LocaleFieldsDataOps[Self <: LocaleFieldsData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDay(value: FieldData): Self = {
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
    def `withDay-narrow`(value: FieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDay-narrow`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day-narrow")(js.undefined)
        ret
    }
    @scala.inline
    def `withDay-short`(value: FieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDay-short`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day-short")(js.undefined)
        ret
    }
    @scala.inline
    def withHour(value: FieldData): Self = {
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
    def `withHour-narrow`(value: FieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHour-narrow`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour-narrow")(js.undefined)
        ret
    }
    @scala.inline
    def `withHour-short`(value: FieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHour-short`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour-short")(js.undefined)
        ret
    }
    @scala.inline
    def withMinute(value: FieldData): Self = {
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
    def `withMinute-narrow`(value: FieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMinute-narrow`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute-narrow")(js.undefined)
        ret
    }
    @scala.inline
    def `withMinute-short`(value: FieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMinute-short`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute-short")(js.undefined)
        ret
    }
    @scala.inline
    def withMonth(value: FieldData): Self = {
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
    def `withMonth-narrow`(value: FieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMonth-narrow`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month-narrow")(js.undefined)
        ret
    }
    @scala.inline
    def `withMonth-short`(value: FieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMonth-short`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month-short")(js.undefined)
        ret
    }
    @scala.inline
    def withNu(value: js.Array[String | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nu")(js.undefined)
        ret
    }
    @scala.inline
    def withQuarter(value: FieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuarter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarter")(js.undefined)
        ret
    }
    @scala.inline
    def `withQuarter-narrow`(value: FieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarter-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutQuarter-narrow`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarter-narrow")(js.undefined)
        ret
    }
    @scala.inline
    def `withQuarter-short`(value: FieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarter-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutQuarter-short`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarter-short")(js.undefined)
        ret
    }
    @scala.inline
    def withSecond(value: FieldData): Self = {
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
    def `withSecond-narrow`(value: FieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSecond-narrow`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second-narrow")(js.undefined)
        ret
    }
    @scala.inline
    def `withSecond-short`(value: FieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSecond-short`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second-short")(js.undefined)
        ret
    }
    @scala.inline
    def withWeek(value: FieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(js.undefined)
        ret
    }
    @scala.inline
    def `withWeek-narrow`(value: FieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutWeek-narrow`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week-narrow")(js.undefined)
        ret
    }
    @scala.inline
    def `withWeek-short`(value: FieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutWeek-short`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week-short")(js.undefined)
        ret
    }
    @scala.inline
    def withYear(value: FieldData): Self = {
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
    @scala.inline
    def `withYear-narrow`(value: FieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutYear-narrow`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year-narrow")(js.undefined)
        ret
    }
    @scala.inline
    def `withYear-short`(value: FieldData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutYear-short`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year-short")(js.undefined)
        ret
    }
  }
  
}

