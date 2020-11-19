package typingsSlinky.rcPicker.pickerMod

import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Picker[DateType]
  extends Component[PickerProps[DateType], js.Object, js.Any] {
  
  def blur(): Unit = js.native
  
  def focus(): Unit = js.native
  
  var pickerRef: ReactRef[PickerRefConfig] = js.native
}
