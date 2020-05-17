package typingsSlinky.rcPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceMod {
  type DisabledTime[DateType] = js.Function1[
    /* date */ DateType | scala.Null, 
    typingsSlinky.rcPicker.interfaceMod.DisabledTimes
  ]
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
  type RangeList = js.Array[typingsSlinky.rcPicker.anon.Label]
}
