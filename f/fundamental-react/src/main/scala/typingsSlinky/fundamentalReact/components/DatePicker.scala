package typingsSlinky.fundamentalReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.fundamentalReact.AnonDate
import typingsSlinky.fundamentalReact.datePickerMod.DatePickerProps
import typingsSlinky.fundamentalReact.datePickerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("fundamental-react/lib/DatePicker/DatePicker", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    blockedDates: js.Array[js.Date] = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    disableAfterDate: js.Date = null,
    disableBeforeDate: js.Date = null,
    disableFutureDates: js.UndefOr[Boolean] = js.undefined,
    disablePastDates: js.UndefOr[Boolean] = js.undefined,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    disableWeekday: js.Array[String] = null,
    disableWeekends: js.UndefOr[Boolean] = js.undefined,
    disabledDates: js.Array[js.Date] = null,
    enableRangeSelection: js.UndefOr[Boolean] = js.undefined,
    onBlur: /* hasDateFormattedDate */ AnonDate => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (blockedDates != null) __obj.updateDynamic("blockedDates")(blockedDates.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (disableAfterDate != null) __obj.updateDynamic("disableAfterDate")(disableAfterDate.asInstanceOf[js.Any])
    if (disableBeforeDate != null) __obj.updateDynamic("disableBeforeDate")(disableBeforeDate.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFutureDates)) __obj.updateDynamic("disableFutureDates")(disableFutureDates.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePastDates)) __obj.updateDynamic("disablePastDates")(disablePastDates.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (disableWeekday != null) __obj.updateDynamic("disableWeekday")(disableWeekday.asInstanceOf[js.Any])
    if (!js.isUndefined(disableWeekends)) __obj.updateDynamic("disableWeekends")(disableWeekends.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRangeSelection)) __obj.updateDynamic("enableRangeSelection")(enableRangeSelection.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.fundamentalReact.datePickerMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DatePickerProps
}

