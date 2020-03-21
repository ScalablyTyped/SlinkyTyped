package typingsSlinky.blueprintjsDatetime.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsDatetime.datePickerMod.IDatePickerProps
import typingsSlinky.blueprintjsDatetime.dateTimePickerMod.IDateTimePickerProps
import typingsSlinky.blueprintjsDatetime.timePickerMod.ITimePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateTimePicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsDatetime.mod.DateTimePicker] {
  @JSImport("@blueprintjs/datetime", "DateTimePicker")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    canClearSelection: js.UndefOr[Boolean] = js.undefined,
    datePickerProps: IDatePickerProps = null,
    defaultValue: js.Date = null,
    onChange: (/* selectedDate */ js.Date, /* isUserChange */ Boolean) => Unit = null,
    timePickerProps: ITimePickerProps = null,
    value: js.Date = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsDatetime.mod.DateTimePicker] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canClearSelection)) __obj.updateDynamic("canClearSelection")(canClearSelection.asInstanceOf[js.Any])
    if (datePickerProps != null) __obj.updateDynamic("datePickerProps")(datePickerProps.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (timePickerProps != null) __obj.updateDynamic("timePickerProps")(timePickerProps.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.blueprintjsDatetime.mod.DateTimePicker] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.blueprintjsDatetime.mod.DateTimePicker](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IDateTimePickerProps
}

