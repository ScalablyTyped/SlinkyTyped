package typingsSlinky.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.InternationalizationOptions> */
@js.native
trait PartialInternationalizati extends js.Object {
  var cancel: js.UndefOr[String] = js.native
  var clear: js.UndefOr[String] = js.native
  var done: js.UndefOr[String] = js.native
  var months: js.UndefOr[js.Array[String]] = js.native
  var monthsShort: js.UndefOr[js.Array[String]] = js.native
  var nextMonth: js.UndefOr[String] = js.native
  var previousMonth: js.UndefOr[String] = js.native
  var weekdays: js.UndefOr[js.Array[String]] = js.native
  var weekdaysAbbrev: js.UndefOr[js.Array[String]] = js.native
  var weekdaysShort: js.UndefOr[js.Array[String]] = js.native
}

object PartialInternationalizati {
  @scala.inline
  def apply(): PartialInternationalizati = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInternationalizati]
  }
  @scala.inline
  implicit class PartialInternationalizatiOps[Self <: PartialInternationalizati] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withClear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
    @scala.inline
    def withDone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.undefined)
        ret
    }
    @scala.inline
    def withMonths(value: js.Array[String]): Self = {
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
    def withMonthsShort(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthsShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthsShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthsShort")(js.undefined)
        ret
    }
    @scala.inline
    def withNextMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdays(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdays")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdaysAbbrev(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysAbbrev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdaysAbbrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysAbbrev")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdaysShort(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdaysShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysShort")(js.undefined)
        ret
    }
  }
  
}

