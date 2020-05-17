package typingsSlinky.jqueryTimeago.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Day extends js.Object {
  var day: js.UndefOr[js.Any] = js.native
  var days: js.UndefOr[js.Any] = js.native
  var hour: js.UndefOr[js.Any] = js.native
  var hours: js.UndefOr[js.Any] = js.native
  var minute: js.UndefOr[js.Any] = js.native
  var minutes: js.UndefOr[js.Any] = js.native
  var month: js.UndefOr[js.Any] = js.native
  var months: js.UndefOr[js.Any] = js.native
  var numbers: js.UndefOr[js.Array[_]] = js.native
  var prefixAgo: js.UndefOr[String] = js.native
  var prefixFromNow: js.UndefOr[String] = js.native
  // Those can be string or Function
  var seconds: js.UndefOr[js.Any] = js.native
  var suffixAgo: js.UndefOr[String] = js.native
  var suffixFromNow: js.UndefOr[String] = js.native
  var wordSeparator: js.UndefOr[String] = js.native
  var year: js.UndefOr[js.Any] = js.native
  var years: js.UndefOr[js.Any] = js.native
}

object Day {
  @scala.inline
  def apply(): Day = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Day]
  }
  @scala.inline
  implicit class DayOps[Self <: Day] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDay(value: js.Any): Self = {
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
    def withDays(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(js.undefined)
        ret
    }
    @scala.inline
    def withHour(value: js.Any): Self = {
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
    def withHours(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hours")(js.undefined)
        ret
    }
    @scala.inline
    def withMinute(value: js.Any): Self = {
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
    def withMinutes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutes")(js.undefined)
        ret
    }
    @scala.inline
    def withMonth(value: js.Any): Self = {
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
    def withMonths(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(js.undefined)
        ret
    }
    @scala.inline
    def withNumbers(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numbers")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixAgo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixAgo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixAgo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixAgo")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixFromNow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixFromNow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixFromNow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixFromNow")(js.undefined)
        ret
    }
    @scala.inline
    def withSeconds(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffixAgo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixAgo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffixAgo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixAgo")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffixFromNow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixFromNow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffixFromNow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixFromNow")(js.undefined)
        ret
    }
    @scala.inline
    def withWordSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withYear(value: js.Any): Self = {
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
    def withYears(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("years")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYears: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("years")(js.undefined)
        ret
    }
  }
  
}

