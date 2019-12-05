package typingsSlinky.atBlueprintjsTimezone.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsCore.libEsmCommonPropsMod.HTMLInputProps
import typingsSlinky.atBlueprintjsCore.libEsmComponentsButtonAbstractButtonMod.IButtonProps
import typingsSlinky.atBlueprintjsCore.libEsmComponentsFormsInputGroupMod.IInputGroupProps
import typingsSlinky.atBlueprintjsCore.libEsmComponentsPopoverPopoverMod.IPopoverProps
import typingsSlinky.atBlueprintjsTimezone.libEsmComponentsTimezoneDashPickerTimezoneDisplayFormatMod.TimezoneDisplayFormat
import typingsSlinky.atBlueprintjsTimezone.libEsmComponentsTimezoneDashPickerTimezonePickerMod.ITimezonePickerProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimezonePicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atBlueprintjsTimezone.libEsmComponentsMod.TimezonePicker] {
  @JSImport("@blueprintjs/timezone/lib/esm/components", "TimezonePicker")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, placeholder */
  def apply(
    onChange: String => Unit,
    buttonProps: Partial[IButtonProps] = null,
    date: js.Date = null,
    inputProps: IInputGroupProps with HTMLInputProps = null,
    popoverProps: Partial[IPopoverProps] = null,
    showLocalTimezone: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    valueDisplayFormat: TimezoneDisplayFormat = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsTimezone.libEsmComponentsMod.TimezonePicker] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (!js.isUndefined(showLocalTimezone)) __obj.updateDynamic("showLocalTimezone")(showLocalTimezone.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueDisplayFormat != null) __obj.updateDynamic("valueDisplayFormat")(valueDisplayFormat.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ITimezonePickerProps
}

