package typingsSlinky.rcPicker

import slinky.core.facade.ReactElement
import typingsSlinky.rcPicker.pickerMod.Picker
import typingsSlinky.rcPicker.pickerPanelMod.PickerPanelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-picker", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def PickerPanel[DateType](props: PickerPanelProps[DateType]): ReactElement = js.native
  
  @js.native
  class RangePicker[DateType] ()
    extends typingsSlinky.rcPicker.rangePickerMod.RangePicker[DateType]
  
  @js.native
  class default[DateType] () extends Picker[DateType]
}
