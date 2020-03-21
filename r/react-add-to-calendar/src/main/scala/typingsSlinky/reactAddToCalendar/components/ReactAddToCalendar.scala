package typingsSlinky.reactAddToCalendar.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactAddToCalendar.mod.AddToCalendarEvent
import typingsSlinky.reactAddToCalendar.mod.AddToCalendarProps
import typingsSlinky.reactAddToCalendar.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactAddToCalendar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-add-to-calendar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    event: AddToCalendarEvent,
    buttonClassClosed: String = null,
    buttonClassOpen: String = null,
    buttonIconClass: String = null,
    buttonLabel: String = null,
    buttonTemplate: js.Any = null,
    buttonWrapperClass: String = null,
    displayItemIcons: js.UndefOr[Boolean] = js.undefined,
    dropdownClass: String = null,
    listItems: js.Array[_] = null,
    optionsOpen: js.UndefOr[Boolean] = js.undefined,
    rootClass: String = null,
    useFontAwesomeIcons: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    if (buttonClassClosed != null) __obj.updateDynamic("buttonClassClosed")(buttonClassClosed.asInstanceOf[js.Any])
    if (buttonClassOpen != null) __obj.updateDynamic("buttonClassOpen")(buttonClassOpen.asInstanceOf[js.Any])
    if (buttonIconClass != null) __obj.updateDynamic("buttonIconClass")(buttonIconClass.asInstanceOf[js.Any])
    if (buttonLabel != null) __obj.updateDynamic("buttonLabel")(buttonLabel.asInstanceOf[js.Any])
    if (buttonTemplate != null) __obj.updateDynamic("buttonTemplate")(buttonTemplate.asInstanceOf[js.Any])
    if (buttonWrapperClass != null) __obj.updateDynamic("buttonWrapperClass")(buttonWrapperClass.asInstanceOf[js.Any])
    if (!js.isUndefined(displayItemIcons)) __obj.updateDynamic("displayItemIcons")(displayItemIcons.asInstanceOf[js.Any])
    if (dropdownClass != null) __obj.updateDynamic("dropdownClass")(dropdownClass.asInstanceOf[js.Any])
    if (listItems != null) __obj.updateDynamic("listItems")(listItems.asInstanceOf[js.Any])
    if (!js.isUndefined(optionsOpen)) __obj.updateDynamic("optionsOpen")(optionsOpen.asInstanceOf[js.Any])
    if (rootClass != null) __obj.updateDynamic("rootClass")(rootClass.asInstanceOf[js.Any])
    if (!js.isUndefined(useFontAwesomeIcons)) __obj.updateDynamic("useFontAwesomeIcons")(useFontAwesomeIcons.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AddToCalendarProps
}

