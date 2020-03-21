package typingsSlinky.rcPicker.rangePickerMod

import slinky.core.facade.ReactRef
import typingsSlinky.rcPicker.pickerMod.PickerRefConfig
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangePicker[DateType]
  extends Component[RangePickerProps[DateType], js.Object, js.Any] {
  var pickerRef: ReactRef[PickerRefConfig] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
}

