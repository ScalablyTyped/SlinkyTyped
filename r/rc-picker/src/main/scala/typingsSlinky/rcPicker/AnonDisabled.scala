package typingsSlinky.rcPicker

import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.Locale
import typingsSlinky.rcPicker.interfaceMod.PickerMode
import typingsSlinky.rcPicker.interfaceMod.RangeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabled[DateType] extends js.Object {
  var disabled: js.Tuple2[Boolean, Boolean]
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
  var generateConfig: GenerateConfig[DateType]
  var locale: Locale
  var picker: PickerMode
  var selectedValue: RangeValue[DateType]
}

object AnonDisabled {
  @scala.inline
  def apply[DateType](
    disabled: js.Tuple2[Boolean, Boolean],
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    picker: PickerMode,
    disabledDate: /* date */ DateType => Boolean = null,
    selectedValue: RangeValue[DateType] = null
  ): AnonDisabled[DateType] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (selectedValue != null) __obj.updateDynamic("selectedValue")(selectedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisabled[DateType]]
  }
}

