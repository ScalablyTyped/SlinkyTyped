package typingsSlinky.rcPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rangePickerMod {
  type OmitPickerProps[Props] = typingsSlinky.std.Omit[
    Props, 
    typingsSlinky.rcPicker.rcPickerStrings.value | typingsSlinky.rcPicker.rcPickerStrings.defaultValue | typingsSlinky.rcPicker.rcPickerStrings.defaultPickerValue | typingsSlinky.rcPicker.rcPickerStrings.placeholder | typingsSlinky.rcPicker.rcPickerStrings.disabled | typingsSlinky.rcPicker.rcPickerStrings.disabledTime | typingsSlinky.rcPicker.rcPickerStrings.showToday | typingsSlinky.rcPicker.rcPickerStrings.showTime | typingsSlinky.rcPicker.rcPickerStrings.mode | typingsSlinky.rcPicker.rcPickerStrings.onChange | typingsSlinky.rcPicker.rcPickerStrings.onSelect | typingsSlinky.rcPicker.rcPickerStrings.onPanelChange | typingsSlinky.rcPicker.rcPickerStrings.pickerValue | typingsSlinky.rcPicker.rcPickerStrings.onPickerValueChange | typingsSlinky.rcPicker.rcPickerStrings.onOk | typingsSlinky.rcPicker.rcPickerStrings.dateRender
  ]
  type RangeDateRender[DateType] = js.Function3[
    /* currentDate */ DateType, 
    /* today */ DateType, 
    /* info */ typingsSlinky.rcPicker.anon.Range, 
    slinky.core.facade.ReactElement
  ]
}
