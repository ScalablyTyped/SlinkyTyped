package typingsSlinky.reactDashDateDashRange.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.moment.momentMod.Moment
import typingsSlinky.reactDashDateDashRange.reactDashDateDashRangeMod.CalendarTheme
import typingsSlinky.reactDashDateDashRange.reactDashDateDashRangeMod.DateContainerType
import typingsSlinky.reactDashDateDashRange.reactDashDateDashRangeMod.DateInputType
import typingsSlinky.reactDashDateDashRange.reactDashDateDashRangeMod.DateRangeProps
import typingsSlinky.reactDashDateDashRange.reactDashDateDashRangeMod.LanguageType
import typingsSlinky.reactDashDateDashRange.reactDashDateDashRangeMod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_DateRangeProps1602368200[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: onChange */
  def apply(
    calendars: Int | Double = null,
    endDate: Moment = null,
    firstDayOfWeek: Int | Double = null,
    format: String = null,
    lang: LanguageType = null,
    linkedCalendars: js.UndefOr[Boolean] = js.undefined,
    maxDate: DateInputType = null,
    minDate: DateInputType = null,
    onInit: /* range */ Range => Unit = null,
    rangedCalendars: js.UndefOr[Boolean] = js.undefined,
    ranges: js.Object = null,
    specialDays: js.Array[DateContainerType] = null,
    startDate: Moment = null,
    theme: CalendarTheme = null,
    twoStepChange: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (calendars != null) __obj.updateDynamic("calendars")(calendars.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(linkedCalendars)) __obj.updateDynamic("linkedCalendars")(linkedCalendars.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction1(onInit))
    if (!js.isUndefined(rangedCalendars)) __obj.updateDynamic("rangedCalendars")(rangedCalendars.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (specialDays != null) __obj.updateDynamic("specialDays")(specialDays.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(twoStepChange)) __obj.updateDynamic("twoStepChange")(twoStepChange.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DateRangeProps
}

