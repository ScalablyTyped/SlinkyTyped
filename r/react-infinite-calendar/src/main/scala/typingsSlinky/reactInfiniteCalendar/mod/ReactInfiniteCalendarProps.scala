package typingsSlinky.reactInfiniteCalendar.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactInfiniteCalendar.AnonAccentColor
import typingsSlinky.reactInfiniteCalendar.AnonBlank
import typingsSlinky.reactInfiniteCalendar.AnonEnd
import typingsSlinky.reactInfiniteCalendar.AnonHideYearsOnSelect
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarBooleans.`false`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`0`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`1`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`2`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`3`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`4`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`5`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`6`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarStrings.`100Percentsign`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarStrings.auto
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarStrings.days
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactInfiniteCalendarProps extends js.Object {
  var Component: js.UndefOr[ReactComponentClass[ReactInfiniteCalendarProps]] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var disabledDates: js.UndefOr[js.Array[DateType]] = js.native
  var disabledDays: js.UndefOr[js.Array[`0` | `1` | `2` | `3` | `4` | `5` | `6`]] = js.native
  var display: js.UndefOr[days | years] = js.native
  var displayOptions: js.UndefOr[AnonHideYearsOnSelect] = js.native
  var height: js.UndefOr[Double | auto] = js.native
  var interpolateSelection: js.UndefOr[
    js.Function2[/* date */ js.Date, /* selected */ js.Array[js.Date], js.Array[js.Date]]
  ] = js.native
  var locale: js.UndefOr[AnonBlank] = js.native
  var max: js.UndefOr[DateType] = js.native
  var maxDate: js.UndefOr[DateType] = js.native
  var min: js.UndefOr[DateType] = js.native
  var minDate: js.UndefOr[DateType] = js.native
  var onScroll: js.UndefOr[js.Function1[/* scrollTop */ Double, Unit]] = js.native
  var onScrollEnd: js.UndefOr[js.Function1[/* scrollTop */ Double, Unit]] = js.native
  var onSelect: js.UndefOr[DateSelectFunction | RangedSelectFunction] = js.native
  var rowHeight: js.UndefOr[Double] = js.native
  var selected: js.UndefOr[DateType | `false` | AnonEnd] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var theme: js.UndefOr[AnonAccentColor] = js.native
  var width: js.UndefOr[Double | auto | `100Percentsign`] = js.native
}

object ReactInfiniteCalendarProps {
  @scala.inline
  def apply(): ReactInfiniteCalendarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactInfiniteCalendarProps]
  }
  @scala.inline
  implicit class ReactInfiniteCalendarPropsOps[Self <: ReactInfiniteCalendarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: ReactComponentClass[ReactInfiniteCalendarProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledDates(value: js.Array[DateType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledDays(value: js.Array[`0` | `1` | `2` | `3` | `4` | `5` | `6`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDays")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay(value: days | years): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayOptions(value: AnonHideYearsOnSelect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withInterpolateSelection(value: (/* date */ js.Date, /* selected */ js.Array[js.Date]) => js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolateSelection")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInterpolateSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolateSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: AnonBlank): Self = {
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
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: DateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: DateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: /* scrollTop */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScrollEnd(value: /* scrollTop */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScrollEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: (/* date */ js.Date) | (/* rangedDate */ RangedSelection) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: DateType | `false` | AnonEnd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: AnonAccentColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | auto | `100Percentsign`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

