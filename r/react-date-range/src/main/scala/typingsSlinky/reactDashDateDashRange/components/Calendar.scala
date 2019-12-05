package typingsSlinky.reactDashDateDashRange.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashDateDashRange.reactDashDateDashRangeMod.CalendarProps
import typingsSlinky.reactDashDateDashRange.reactDashDateDashRangeMod.CalendarTheme
import typingsSlinky.reactDashDateDashRange.reactDashDateDashRangeMod.DateInputType
import typingsSlinky.reactDashDateDashRange.reactDashDateDashRangeMod.LanguageType
import typingsSlinky.reactDashDateDashRange.reactDashDateDashRangeMod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Calendar
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashDateDashRange.reactDashDateDashRangeMod.Calendar] {
  @JSImport("react-date-range", "Calendar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onChange */
  def apply(
    date: DateInputType,
    firstDayOfWeek: Int | Double = null,
    format: String = null,
    lang: LanguageType = null,
    maxDate: DateInputType = null,
    minDate: DateInputType = null,
    onInit: /* range */ Range => Unit = null,
    theme: CalendarTheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashDateDashRange.reactDashDateDashRangeMod.Calendar] = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction1(onInit))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CalendarProps
}

