package typingsSlinky.reactDashInfiniteDashCalendar.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashInfiniteDashCalendar.Anon_0
import typingsSlinky.reactDashInfiniteDashCalendar.Anon_AccentColor
import typingsSlinky.reactDashInfiniteDashCalendar.Anon_End
import typingsSlinky.reactDashInfiniteDashCalendar.Anon_HideYearsOnSelect
import typingsSlinky.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarBooleans.`false`
import typingsSlinky.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarMod.DateType
import typingsSlinky.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarMod.ReactInfiniteCalendarProps
import typingsSlinky.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarNumbers.`0`
import typingsSlinky.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarNumbers.`1`
import typingsSlinky.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarNumbers.`2`
import typingsSlinky.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarNumbers.`3`
import typingsSlinky.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarNumbers.`4`
import typingsSlinky.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarNumbers.`5`
import typingsSlinky.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarNumbers.`6`
import typingsSlinky.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarStrings.days
import typingsSlinky.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ReactInfiniteCalendarProps1909816996[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: autoFocus, className, height, max, min, onScroll, onSelect, tabIndex, width */
  def apply(
    Component: ReactComponentClass[ReactInfiniteCalendarProps] = null,
    disabledDates: js.Array[DateType] = null,
    disabledDays: js.Array[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = null,
    display: days | years = null,
    displayOptions: Anon_HideYearsOnSelect = null,
    interpolateSelection: (/* date */ js.Date, /* selected */ js.Array[js.Date]) => js.Array[js.Date] = null,
    locale: Anon_0 = null,
    maxDate: DateType = null,
    minDate: DateType = null,
    onScrollEnd: /* scrollTop */ Double => Unit = null,
    rowHeight: Int | Double = null,
    selected: DateType | `false` | Anon_End = null,
    theme: Anon_AccentColor = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (disabledDays != null) __obj.updateDynamic("disabledDays")(disabledDays.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (displayOptions != null) __obj.updateDynamic("displayOptions")(displayOptions.asInstanceOf[js.Any])
    if (interpolateSelection != null) __obj.updateDynamic("interpolateSelection")(js.Any.fromFunction2(interpolateSelection))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onScrollEnd != null) __obj.updateDynamic("onScrollEnd")(js.Any.fromFunction1(onScrollEnd))
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ReactInfiniteCalendarProps
}

