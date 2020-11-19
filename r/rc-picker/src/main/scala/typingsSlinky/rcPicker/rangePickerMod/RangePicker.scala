package typingsSlinky.rcPicker.rangePickerMod

import slinky.core.facade.ReactRef
import typingsSlinky.rcPicker.pickerMod.PickerRefConfig
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangePicker[DateType]
  extends Component[RangePickerProps[DateType], js.Object, js.Any] {
  
  def blur(): Unit = js.native
  
  def focus(): Unit = js.native
  
  var pickerRef: ReactRef[PickerRefConfig] = js.native
}
