package typingsSlinky.reactCalendarHeatmap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var classForValue: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  var endDate: js.UndefOr[String | Double | js.Date] = js.native
  var gutterSize: js.UndefOr[Double] = js.native
  var horizontal: js.UndefOr[Boolean] = js.native
  var monthLabels: js.UndefOr[js.Array[String]] = js.native
  var numDays: js.UndefOr[Double] = js.native
  var onClick: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  var onMouseLeave: js.UndefOr[js.Function2[/* e */ js.Any, /* value */ js.Any, Unit]] = js.native
  var onMouseOver: js.UndefOr[js.Function2[/* e */ js.Any, /* value */ js.Any, Unit]] = js.native
  var showMonthLabels: js.UndefOr[Boolean] = js.native
  var showOutOfRangeDays: js.UndefOr[Boolean] = js.native
  var showWeekdayLabels: js.UndefOr[Boolean] = js.native
  var startDate: js.UndefOr[String | Double | js.Date] = js.native
  var titleForValue: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  var tooltipDataAttrs: js.UndefOr[js.Object] = js.native
  var transformDayElement: js.UndefOr[js.Function3[/* rect */ js.Any, /* value */ js.Any, /* index */ Double, _]] = js.native
  var values: js.Array[_] = js.native
  var weekdayLabels: js.UndefOr[js.Array[String]] = js.native
}

object Props {
  @scala.inline
  def apply(values: js.Array[_]): Props = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValues(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassForValue(value: /* value */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classForValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClassForValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classForValue")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDate(value: String | Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(js.undefined)
        ret
    }
    @scala.inline
    def withGutterSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutterSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGutterSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutterSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthLabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withNumDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numDays")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* value */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: (/* e */ js.Any, /* value */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOver(value: (/* e */ js.Any, /* value */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMonthLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMonthLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMonthLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMonthLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOutOfRangeDays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOutOfRangeDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOutOfRangeDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOutOfRangeDays")(js.undefined)
        ret
    }
    @scala.inline
    def withShowWeekdayLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekdayLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowWeekdayLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekdayLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDate(value: String | Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleForValue(value: /* value */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleForValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTitleForValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleForValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipDataAttrs(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipDataAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipDataAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipDataAttrs")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformDayElement(value: (/* rect */ js.Any, /* value */ js.Any, /* index */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformDayElement")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTransformDayElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformDayElement")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdayLabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdayLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayLabels")(js.undefined)
        ret
    }
  }
  
}

