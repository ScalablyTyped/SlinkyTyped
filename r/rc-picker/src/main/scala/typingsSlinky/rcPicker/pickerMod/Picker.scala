package typingsSlinky.rcPicker.pickerMod

import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Picker[DateType]
  extends Component[PickerProps[DateType], js.Object, js.Any] {
  var pickerRef: ReactRef[PickerRefConfig] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
}

