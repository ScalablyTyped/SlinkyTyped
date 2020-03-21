package typingsSlinky.nivoCalendar.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGRectElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import slinky.web.svg.rect.tag
import typingsSlinky.nivoCalendar.mod.CalendarDatum
import typingsSlinky.nivoCalendar.mod.CalendarDayData
import typingsSlinky.nivoCalendar.mod.CalendarDirection
import typingsSlinky.nivoCalendar.mod.CalendarLegend
import typingsSlinky.nivoCalendar.mod.CalendarSvgProps
import typingsSlinky.nivoCalendar.mod.DateOrString
import typingsSlinky.nivoCalendar.nivoCalendarStrings.auto
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.BoxAlign
import typingsSlinky.nivoCore.mod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveCalendar
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.nivoCalendar.mod.ResponsiveCalendar] {
  @JSImport("@nivo/calendar", "ResponsiveCalendar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    data: js.Array[CalendarDatum],
    from: DateOrString,
    to: DateOrString,
    align: BoxAlign = null,
    colors: js.Array[String] = null,
    dayBorderColor: String = null,
    dayBorderWidth: Int | Double = null,
    daySpacing: Int | Double = null,
    direction: CalendarDirection = null,
    emptyColor: String = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    legends: js.Array[CalendarLegend] = null,
    margin: Box = null,
    maxValue: auto | Double = null,
    minValue: auto | Double = null,
    monthBorderColor: String = null,
    monthBorderWidth: Int | Double = null,
    monthLegend: (/* year */ Double, /* month */ Double, /* date */ js.Date) => String | Double = null,
    monthLegendOffset: Int | Double = null,
    onClick: (/* datum */ CalendarDayData, /* event */ SyntheticMouseEvent[SVGRectElement]) => Unit = null,
    theme: Theme = null,
    tooltip: ReactComponentClass[CalendarDayData] = null,
    tooltipFormat: /* value */ Double => String | Double = null,
    yearLegend: /* year */ Double => String | Double = null,
    yearLegendOffset: Int | Double = null,
    yearSpacing: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.nivoCalendar.mod.ResponsiveCalendar] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (dayBorderColor != null) __obj.updateDynamic("dayBorderColor")(dayBorderColor.asInstanceOf[js.Any])
    if (dayBorderWidth != null) __obj.updateDynamic("dayBorderWidth")(dayBorderWidth.asInstanceOf[js.Any])
    if (daySpacing != null) __obj.updateDynamic("daySpacing")(daySpacing.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (emptyColor != null) __obj.updateDynamic("emptyColor")(emptyColor.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (monthBorderColor != null) __obj.updateDynamic("monthBorderColor")(monthBorderColor.asInstanceOf[js.Any])
    if (monthBorderWidth != null) __obj.updateDynamic("monthBorderWidth")(monthBorderWidth.asInstanceOf[js.Any])
    if (monthLegend != null) __obj.updateDynamic("monthLegend")(js.Any.fromFunction3(monthLegend))
    if (monthLegendOffset != null) __obj.updateDynamic("monthLegendOffset")(monthLegendOffset.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(js.Any.fromFunction1(tooltipFormat))
    if (yearLegend != null) __obj.updateDynamic("yearLegend")(js.Any.fromFunction1(yearLegend))
    if (yearLegendOffset != null) __obj.updateDynamic("yearLegendOffset")(yearLegendOffset.asInstanceOf[js.Any])
    if (yearSpacing != null) __obj.updateDynamic("yearSpacing")(yearSpacing.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CalendarSvgProps
}

