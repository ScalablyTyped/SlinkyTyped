package typingsSlinky.fundamentalReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.fundamentalReact.AnonDay1Sun
import typingsSlinky.fundamentalReact.calendarMod.CalendarProps
import typingsSlinky.fundamentalReact.calendarMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Calendar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("fundamental-react/lib/Calendar/Calendar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    blockedDates: js.Array[js.Date] = null,
    disableAfterDate: js.Date = null,
    disableBeforeDate: js.Date = null,
    disableFutureDates: js.UndefOr[Boolean] = js.undefined,
    disablePastDates: js.UndefOr[Boolean] = js.undefined,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    disableWeekday: js.Array[String] = null,
    disableWeekends: js.UndefOr[Boolean] = js.undefined,
    disabledDates: js.Array[js.Date] = null,
    localizedText: AnonDay1Sun = null,
    onChange: /* date */ js.Date => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (blockedDates != null) __obj.updateDynamic("blockedDates")(blockedDates.asInstanceOf[js.Any])
    if (disableAfterDate != null) __obj.updateDynamic("disableAfterDate")(disableAfterDate.asInstanceOf[js.Any])
    if (disableBeforeDate != null) __obj.updateDynamic("disableBeforeDate")(disableBeforeDate.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFutureDates)) __obj.updateDynamic("disableFutureDates")(disableFutureDates.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePastDates)) __obj.updateDynamic("disablePastDates")(disablePastDates.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (disableWeekday != null) __obj.updateDynamic("disableWeekday")(disableWeekday.asInstanceOf[js.Any])
    if (!js.isUndefined(disableWeekends)) __obj.updateDynamic("disableWeekends")(disableWeekends.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.fundamentalReact.calendarMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = CalendarProps
}

