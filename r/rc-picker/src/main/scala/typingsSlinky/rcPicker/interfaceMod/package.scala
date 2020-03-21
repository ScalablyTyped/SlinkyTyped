package typingsSlinky.rcPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceMod {
  type DisabledTime[DateType] = js.Function1[
    /* date */ DateType | scala.Null, 
    typingsSlinky.rcPicker.interfaceMod.DisabledTimes
  ]
  type EventValue[DateType] = DateType | scala.Null
  type NullableDateType[DateType] = js.UndefOr[DateType | scala.Null]
  type OnPanelChange[DateType] = js.Function2[
    /* value */ DateType, 
    /* mode */ typingsSlinky.rcPicker.interfaceMod.PanelMode, 
    scala.Unit
  ]
  type OnSelect[DateType] = js.Function2[
    /* value */ DateType, 
    /* type */ typingsSlinky.rcPicker.rcPickerStrings.key | typingsSlinky.rcPicker.rcPickerStrings.mouse | typingsSlinky.rcPicker.rcPickerStrings.submit, 
    scala.Unit
  ]
  type RangeList = js.Array[typingsSlinky.rcPicker.AnonLabel]
  type RangeValue[DateType] = (js.Tuple2[
    typingsSlinky.rcPicker.interfaceMod.EventValue[DateType], 
    typingsSlinky.rcPicker.interfaceMod.EventValue[DateType]
  ]) | scala.Null
}
