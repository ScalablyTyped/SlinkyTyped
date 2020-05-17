package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.continuous
import typingsSlinky.devextreme.devextremeStrings.datetime
import typingsSlinky.devextreme.devextremeStrings.day
import typingsSlinky.devextreme.devextremeStrings.discrete
import typingsSlinky.devextreme.devextremeStrings.hour
import typingsSlinky.devextreme.devextremeStrings.logarithmic
import typingsSlinky.devextreme.devextremeStrings.millisecond
import typingsSlinky.devextreme.devextremeStrings.minute
import typingsSlinky.devextreme.devextremeStrings.month
import typingsSlinky.devextreme.devextremeStrings.numeric
import typingsSlinky.devextreme.devextremeStrings.quarter
import typingsSlinky.devextreme.devextremeStrings.second
import typingsSlinky.devextreme.devextremeStrings.semidiscrete
import typingsSlinky.devextreme.devextremeStrings.string_
import typingsSlinky.devextreme.devextremeStrings.week
import typingsSlinky.devextreme.devextremeStrings.year
import typingsSlinky.devextreme.mod.DevExpress.viz.ScaleBreak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateByCategory extends js.Object {
  var aggregateByCategory: js.UndefOr[Boolean] = js.native
  var aggregationGroupWidth: js.UndefOr[Double] = js.native
  var aggregationInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  var allowDecimals: js.UndefOr[Boolean] = js.native
  var breakStyle: js.UndefOr[Line] = js.native
  var breaks: js.UndefOr[js.Array[ScaleBreak]] = js.native
  var categories: js.UndefOr[js.Array[Double | String | js.Date]] = js.native
  var endOnTick: js.UndefOr[Boolean] = js.native
  var endValue: js.UndefOr[Double | js.Date | String] = js.native
  var holidays: js.UndefOr[js.Array[js.Date | Double | String]] = js.native
  var label: js.UndefOr[OverlappingBehavior] = js.native
  var linearThreshold: js.UndefOr[Double] = js.native
  var logarithmBase: js.UndefOr[Double] = js.native
  var marker: js.UndefOr[Label] = js.native
  var maxRange: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  var minRange: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  var minorTick: js.UndefOr[ColorOpacity] = js.native
  var minorTickCount: js.UndefOr[Double] = js.native
  var minorTickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  var placeholderHeight: js.UndefOr[Double] = js.native
  var showCustomBoundaryTicks: js.UndefOr[Boolean] = js.native
  var singleWorkdays: js.UndefOr[js.Array[js.Date | Double | String]] = js.native
  var startValue: js.UndefOr[Double | js.Date | String] = js.native
  var tick: js.UndefOr[OpacityWidth] = js.native
  var tickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  var `type`: js.UndefOr[continuous | discrete | logarithmic | semidiscrete] = js.native
  var valueType: js.UndefOr[datetime | numeric | string_] = js.native
  var workWeek: js.UndefOr[js.Array[Double]] = js.native
  var workdaysOnly: js.UndefOr[Boolean] = js.native
}

object AggregateByCategory {
  @scala.inline
  def apply(): AggregateByCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateByCategory]
  }
  @scala.inline
  implicit class AggregateByCategoryOps[Self <: AggregateByCategory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregateByCategory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateByCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregateByCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateByCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withAggregationGroupWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationGroupWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregationGroupWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationGroupWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withAggregationInterval(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregationInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDecimals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDecimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDecimals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDecimals")(js.undefined)
        ret
    }
    @scala.inline
    def withBreakStyle(value: Line): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBreaks(value: js.Array[ScaleBreak]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreaks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breaks")(js.undefined)
        ret
    }
    @scala.inline
    def withCategories(value: js.Array[Double | String | js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(js.undefined)
        ret
    }
    @scala.inline
    def withEndOnTick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOnTick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndOnTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOnTick")(js.undefined)
        ret
    }
    @scala.inline
    def withEndValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndValue(value: Double | js.Date | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endValue")(js.undefined)
        ret
    }
    @scala.inline
    def withHolidays(value: js.Array[js.Date | Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holidays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHolidays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holidays")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: OverlappingBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLinearThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinearThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withLogarithmBase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logarithmBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogarithmBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logarithmBase")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRange(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRange")(js.undefined)
        ret
    }
    @scala.inline
    def withMinRange(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRange")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTick(value: ColorOpacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTick")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTickCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTickCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTickInterval(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTickInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCustomBoundaryTicks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCustomBoundaryTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCustomBoundaryTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCustomBoundaryTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleWorkdays(value: js.Array[js.Date | Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleWorkdays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleWorkdays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleWorkdays")(js.undefined)
        ret
    }
    @scala.inline
    def withStartValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartValue(value: Double | js.Date | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTick(value: OpacityWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(js.undefined)
        ret
    }
    @scala.inline
    def withTickInterval(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: continuous | discrete | logarithmic | semidiscrete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValueType(value: datetime | numeric | string_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkWeek(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkdaysOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workdaysOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkdaysOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workdaysOnly")(js.undefined)
        ret
    }
  }
  
}

