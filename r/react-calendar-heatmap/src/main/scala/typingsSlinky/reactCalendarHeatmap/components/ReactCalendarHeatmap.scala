package typingsSlinky.reactCalendarHeatmap.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactCalendarHeatmap.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCalendarHeatmap
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-calendar-heatmap", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    values: js.Array[_],
    classForValue: /* value */ js.Any => _ = null,
    endDate: String | Double | js.Date = null,
    gutterSize: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    monthLabels: js.Array[String] = null,
    numDays: Int | Double = null,
    onClick: /* value */ js.Any => Unit = null,
    onMouseLeave: (/* e */ js.Any, /* value */ js.Any) => Unit = null,
    onMouseOver: (/* e */ js.Any, /* value */ js.Any) => Unit = null,
    showMonthLabels: js.UndefOr[Boolean] = js.undefined,
    showOutOfRangeDays: js.UndefOr[Boolean] = js.undefined,
    showWeekdayLabels: js.UndefOr[Boolean] = js.undefined,
    startDate: String | Double | js.Date = null,
    titleForValue: /* value */ js.Any => _ = null,
    tooltipDataAttrs: js.Object = null,
    transformDayElement: (/* rect */ js.Any, /* value */ js.Any, /* index */ Double) => _ = null,
    weekdayLabels: js.Array[String] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (classForValue != null) __obj.updateDynamic("classForValue")(js.Any.fromFunction1(classForValue))
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (gutterSize != null) __obj.updateDynamic("gutterSize")(gutterSize.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (monthLabels != null) __obj.updateDynamic("monthLabels")(monthLabels.asInstanceOf[js.Any])
    if (numDays != null) __obj.updateDynamic("numDays")(numDays.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2(onMouseLeave))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction2(onMouseOver))
    if (!js.isUndefined(showMonthLabels)) __obj.updateDynamic("showMonthLabels")(showMonthLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(showOutOfRangeDays)) __obj.updateDynamic("showOutOfRangeDays")(showOutOfRangeDays.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekdayLabels)) __obj.updateDynamic("showWeekdayLabels")(showWeekdayLabels.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (titleForValue != null) __obj.updateDynamic("titleForValue")(js.Any.fromFunction1(titleForValue))
    if (tooltipDataAttrs != null) __obj.updateDynamic("tooltipDataAttrs")(tooltipDataAttrs.asInstanceOf[js.Any])
    if (transformDayElement != null) __obj.updateDynamic("transformDayElement")(js.Any.fromFunction3(transformDayElement))
    if (weekdayLabels != null) __obj.updateDynamic("weekdayLabels")(weekdayLabels.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactCalendarHeatmap.mod.Props
}

