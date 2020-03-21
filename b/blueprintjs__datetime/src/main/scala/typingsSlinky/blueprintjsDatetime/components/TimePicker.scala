package typingsSlinky.blueprintjsDatetime.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typingsSlinky.blueprintjsDatetime.timePickerMod.TimePrecision
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimePicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsDatetime.mod.TimePicker] {
  @JSImport("@blueprintjs/datetime", "TimePicker")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled */
  def apply(
    defaultValue: js.Date = null,
    maxTime: js.Date = null,
    minTime: js.Date = null,
    onChange: /* newTime */ js.Date => Unit = null,
    precision: TimePrecision = null,
    selectAllOnFocus: js.UndefOr[Boolean] = js.undefined,
    showArrowButtons: js.UndefOr[Boolean] = js.undefined,
    useAmPm: js.UndefOr[Boolean] = js.undefined,
    value: js.Date = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsDatetime.mod.TimePicker] = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime.asInstanceOf[js.Any])
    if (minTime != null) __obj.updateDynamic("minTime")(minTime.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(selectAllOnFocus)) __obj.updateDynamic("selectAllOnFocus")(selectAllOnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrowButtons)) __obj.updateDynamic("showArrowButtons")(showArrowButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(useAmPm)) __obj.updateDynamic("useAmPm")(useAmPm.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.blueprintjsDatetime.mod.TimePicker] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.blueprintjsDatetime.mod.TimePicker](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ITimePickerProps
}

