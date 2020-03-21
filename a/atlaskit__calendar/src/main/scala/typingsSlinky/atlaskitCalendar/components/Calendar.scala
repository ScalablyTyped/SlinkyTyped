package typingsSlinky.atlaskitCalendar.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import slinky.web.html.div.tag
import typingsSlinky.atlaskitCalendar.mod.ChangeEvent
import typingsSlinky.atlaskitCalendar.mod.SelectEvent
import typingsSlinky.atlaskitCalendar.mod.default
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Calendar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@atlaskit/calendar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
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
    onBlur: /* e */ js.UndefOr[SyntheticFocusEvent[HTMLDivElement]] => Unit = null,
    onChange: /* e */ ChangeEvent => Unit = null,
    onFocus: /* e */ js.UndefOr[SyntheticFocusEvent[HTMLDivElement]] => Unit = null,
    onSelect: /* e */ SelectEvent => Unit = null,
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
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (previouslySelected != null) __obj.updateDynamic("previouslySelected")(previouslySelected.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (today != null) __obj.updateDynamic("today")(today.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.div.tag.type, typingsSlinky.atlaskitCalendar.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.atlaskitCalendar.mod.Props
}

