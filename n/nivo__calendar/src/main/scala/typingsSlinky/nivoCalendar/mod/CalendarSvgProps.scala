package typingsSlinky.nivoCalendar.mod

import org.scalajs.dom.raw.SVGRectElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.nivoCalendar.nivoCalendarStrings.auto
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.BoxAlign
import typingsSlinky.nivoCore.mod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/calendar.@nivo/calendar.CalendarData & @nivo/calendar.@nivo/calendar.CalendarCommonProps & std.Partial<{onClick (datum : @nivo/calendar.@nivo/calendar.CalendarDayData, event : react.react.MouseEvent<std.SVGRectElement, react.react.NativeMouseEvent>): void}> */
@js.native
trait CalendarSvgProps extends js.Object {
  var align: js.UndefOr[BoxAlign] = js.native
  var colors: js.UndefOr[js.Array[String]] = js.native
  var data: js.Array[CalendarDatum] = js.native
  var dayBorderColor: js.UndefOr[String] = js.native
  var dayBorderWidth: js.UndefOr[Double] = js.native
  var daySpacing: js.UndefOr[Double] = js.native
  var direction: js.UndefOr[CalendarDirection] = js.native
  var emptyColor: js.UndefOr[String] = js.native
  var from: DateOrString = js.native
  var isInteractive: js.UndefOr[Boolean] = js.native
  var legends: js.UndefOr[js.Array[CalendarLegend]] = js.native
  var margin: js.UndefOr[Box] = js.native
  var maxValue: js.UndefOr[auto | Double] = js.native
  var minValue: js.UndefOr[auto | Double] = js.native
  var monthBorderColor: js.UndefOr[String] = js.native
  var monthBorderWidth: js.UndefOr[Double] = js.native
  var monthLegend: js.UndefOr[
    js.Function3[/* year */ Double, /* month */ Double, /* date */ js.Date, String | Double]
  ] = js.native
  var monthLegendOffset: js.UndefOr[Double] = js.native
  var onClick: js.UndefOr[
    js.Function2[/* datum */ CalendarDayData, /* event */ SyntheticMouseEvent[SVGRectElement], Unit]
  ] = js.native
  var theme: js.UndefOr[Theme] = js.native
  var to: DateOrString = js.native
  var tooltip: js.UndefOr[ReactComponentClass[CalendarDayData]] = js.native
  var tooltipFormat: js.UndefOr[js.Function1[/* value */ Double, String | Double]] = js.native
  var yearLegend: js.UndefOr[js.Function1[/* year */ Double, String | Double]] = js.native
  var yearLegendOffset: js.UndefOr[Double] = js.native
  var yearSpacing: js.UndefOr[Double] = js.native
}

object CalendarSvgProps {
  @scala.inline
  def apply(data: js.Array[CalendarDatum], from: DateOrString, to: DateOrString): CalendarSvgProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarSvgProps]
  }
  @scala.inline
  implicit class CalendarSvgPropsOps[Self <: CalendarSvgProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[CalendarDatum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: DateOrString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: DateOrString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlign(value: BoxAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withDayBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDayBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDaySpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daySpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaySpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daySpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: CalendarDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyColor")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInteractive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(js.undefined)
        ret
    }
    @scala.inline
    def withLegends(value: js.Array[CalendarLegend]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legends")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Box): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValue(value: auto | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: auto | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthLegend(value: (/* year */ Double, /* month */ Double, /* date */ js.Date) => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthLegend")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutMonthLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthLegend")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthLegendOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthLegendOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthLegendOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthLegendOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: (/* datum */ CalendarDayData, /* event */ SyntheticMouseEvent[SVGRectElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: Theme): Self = {
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
    def withTooltip(value: ReactComponentClass[CalendarDayData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipFormat(value: /* value */ Double => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTooltipFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withYearLegend(value: /* year */ Double => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearLegend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutYearLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearLegend")(js.undefined)
        ret
    }
    @scala.inline
    def withYearLegendOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearLegendOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearLegendOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearLegendOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withYearSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearSpacing")(js.undefined)
        ret
    }
  }
  
}

