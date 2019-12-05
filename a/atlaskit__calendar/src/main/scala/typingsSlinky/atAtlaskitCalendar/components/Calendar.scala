package typingsSlinky.atAtlaskitCalendar.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.div.tag
import typingsSlinky.atAtlaskitCalendar.atAtlaskitCalendarMod.default
import typingsSlinky.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Calendar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@atlaskit/calendar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onBlur, onChange, onFocus, onSelect */
  def apply(
    day: Int | Double = null,
    defaultDay: Int | Double = null,
    defaultDisabled: js.Array[String] = null,
    defaultMonth: Int | Double = null,
    defaultPreviouslySelected: js.Array[String] = null,
    defaultSelected: js.Array[String] = null,
    defaultYear: Int | Double = null,
    disabled: js.Array[String] = null,
    innerProps: HTMLAttributes[HTMLDivElement] = null,
    month: Int | Double = null,
    previouslySelected: js.Array[String] = null,
    selected: js.Array[String] = null,
    today: String = null,
    year: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (defaultDay != null) __obj.updateDynamic("defaultDay")(defaultDay.asInstanceOf[js.Any])
    if (defaultDisabled != null) __obj.updateDynamic("defaultDisabled")(defaultDisabled.asInstanceOf[js.Any])
    if (defaultMonth != null) __obj.updateDynamic("defaultMonth")(defaultMonth.asInstanceOf[js.Any])
    if (defaultPreviouslySelected != null) __obj.updateDynamic("defaultPreviouslySelected")(defaultPreviouslySelected.asInstanceOf[js.Any])
    if (defaultSelected != null) __obj.updateDynamic("defaultSelected")(defaultSelected.asInstanceOf[js.Any])
    if (defaultYear != null) __obj.updateDynamic("defaultYear")(defaultYear.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (innerProps != null) __obj.updateDynamic("innerProps")(innerProps.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (previouslySelected != null) __obj.updateDynamic("previouslySelected")(previouslySelected.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (today != null) __obj.updateDynamic("today")(today.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.atAtlaskitCalendar.atAtlaskitCalendarMod.Props
}

