package typingsSlinky.reactInfiniteCalendar.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactInfiniteCalendar.AnonAccentColor
import typingsSlinky.reactInfiniteCalendar.AnonBlank
import typingsSlinky.reactInfiniteCalendar.AnonEnd
import typingsSlinky.reactInfiniteCalendar.AnonHideYearsOnSelect
import typingsSlinky.reactInfiniteCalendar.mod.DateType
import typingsSlinky.reactInfiniteCalendar.mod.RangedSelection
import typingsSlinky.reactInfiniteCalendar.mod.ReactInfiniteCalendarProps
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

abstract class SharedApply_ReactInfiniteCalendarProps498068951[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: autoFocus, className, tabIndex */
  def apply(
    Component: ReactComponentClass[ReactInfiniteCalendarProps] = null,
    disabledDates: js.Array[DateType] = null,
    disabledDays: js.Array[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = null,
    display: days | years = null,
    displayOptions: AnonHideYearsOnSelect = null,
    height: Double | auto = null,
    interpolateSelection: (/* date */ js.Date, /* selected */ js.Array[js.Date]) => js.Array[js.Date] = null,
    locale: AnonBlank = null,
    max: DateType = null,
    maxDate: DateType = null,
    min: DateType = null,
    minDate: DateType = null,
    onScroll: /* scrollTop */ Double => Unit = null,
    onScrollEnd: /* scrollTop */ Double => Unit = null,
    onSelect: (/* date */ js.Date) | (/* rangedDate */ RangedSelection) => Unit = null,
    rowHeight: Int | Double = null,
    selected: DateType | `false` | AnonEnd = null,
    theme: AnonAccentColor = null,
    width: Double | auto | `100Percentsign` = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (disabledDays != null) __obj.updateDynamic("disabledDays")(disabledDays.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (displayOptions != null) __obj.updateDynamic("displayOptions")(displayOptions.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (interpolateSelection != null) __obj.updateDynamic("interpolateSelection")(js.Any.fromFunction2(interpolateSelection))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onScrollEnd != null) __obj.updateDynamic("onScrollEnd")(js.Any.fromFunction1(onScrollEnd))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ReactInfiniteCalendarProps
}

