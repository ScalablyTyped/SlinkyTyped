package typingsSlinky.officeUiFabricReact.libPickersMod

import typingsSlinky.officeUiFabricReact.anon.Items
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.IBasePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/Pickers", "BasePicker")
@js.native
class BasePicker[T, P /* <: IBasePickerProps[T] */] protected ()
  extends typingsSlinky.officeUiFabricReact.pickersMod.BasePicker[T, P] {
  def this(basePickerProps: P) = this()
}
/* static members */
@JSImport("office-ui-fabric-react/lib/Pickers", "BasePicker")
@js.native
object BasePicker extends js.Object {
  
  def getDerivedStateFromProps(newProps: IBasePickerProps[_]): Items | Null = js.native
}
