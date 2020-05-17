package typingsSlinky.reactInfiniteCalendar.anon

import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`0`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`1`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`2`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`3`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`4`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`5`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blank extends js.Object {
  var blank: js.UndefOr[String] = js.native
  var headerFormat: js.UndefOr[String] = js.native
  var locale: js.UndefOr[DistanceInWords] = js.native
  var todayLabel: js.UndefOr[Long] = js.native
  var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
  var weekdays: js.UndefOr[js.Array[String]] = js.native
}

object Blank {
  @scala.inline
  def apply(): Blank = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Blank]
  }
  @scala.inline
  implicit class BlankOps[Self <: Blank] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlank(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blank")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: DistanceInWords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withTodayLabel(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTodayLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekStartsOn(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekStartsOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekStartsOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekStartsOn")(js.undefined)
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
  }
  
}

