package typingsSlinky.atBlueprintjsDatetime.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsDatetime.libEsmDatePickerMod.IDatePickerProps
import typingsSlinky.atBlueprintjsDatetime.libEsmDateTimePickerMod.IDateTimePickerProps
import typingsSlinky.atBlueprintjsDatetime.libEsmTimePickerMod.ITimePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateTimePicker
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.atBlueprintjsDatetime.libEsmDateTimePickerMod.DateTimePicker
    ] {
  @JSImport("@blueprintjs/datetime/lib/esm/dateTimePicker", "DateTimePicker")
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
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.atBlueprintjsDatetime.libEsmDateTimePickerMod.DateTimePicker
  ] = {
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
  type Props = IDateTimePickerProps
}

