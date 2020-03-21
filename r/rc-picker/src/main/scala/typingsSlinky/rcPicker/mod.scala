package typingsSlinky.rcPicker

import slinky.core.facade.ReactElement
import typingsSlinky.rcPicker.pickerMod.Picker
import typingsSlinky.rcPicker.pickerPanelMod.PickerPanelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-picker/lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class RangePicker[DateType] ()
    extends typingsSlinky.rcPicker.rangePickerMod.RangePicker[DateType]
  
  @js.native
  class default[DateType] () extends Picker[DateType]
  
  def PickerPanel[DateType](props: PickerPanelProps[DateType]): ReactElement = js.native
}

