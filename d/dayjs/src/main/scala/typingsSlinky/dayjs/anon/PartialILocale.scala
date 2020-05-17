package typingsSlinky.dayjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<dayjs.ILocale> */
@js.native
trait PartialILocale extends js.Object {
  var formats: js.UndefOr[PartialLTstringLTSstringL] = js.native
  var months: js.UndefOr[js.Array[String]] = js.native
  var monthsShort: js.UndefOr[js.Array[String]] = js.native
  var name: js.UndefOr[String] = js.native
  var ordinal: js.UndefOr[js.Function1[/* n */ Double, Double | String]] = js.native
  var relativeTime: js.UndefOr[Partialfuturestringpastst] = js.native
  var weekStart: js.UndefOr[Double] = js.native
  var weekdays: js.UndefOr[js.Array[String]] = js.native
  var weekdaysMin: js.UndefOr[js.Array[String]] = js.native
  var weekdaysShort: js.UndefOr[js.Array[String]] = js.native
}

object PartialILocale {
  @scala.inline
  def apply(): PartialILocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialILocale]
  }
  @scala.inline
  implicit class PartialILocaleOps[Self <: PartialILocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormats(value: PartialLTstringLTSstringL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(js.undefined)
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOrdinal(value: /* n */ Double => Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOrdinal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeTime(value: Partialfuturestringpastst): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeTime")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekStart")(js.undefined)
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
    def withWeekdaysMin(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdaysMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysMin")(js.undefined)
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

