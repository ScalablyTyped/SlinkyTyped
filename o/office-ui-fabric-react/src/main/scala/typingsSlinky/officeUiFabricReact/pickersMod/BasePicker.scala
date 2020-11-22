package typingsSlinky.officeUiFabricReact.pickersMod

import typingsSlinky.officeUiFabricReact.anon.Items
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.IBasePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/pickers", "BasePicker")
@js.native
class BasePicker[T, P /* <: IBasePickerProps[T] */] protected ()
  extends typingsSlinky.officeUiFabricReact.basePickerMod.BasePicker[T, P] {
  def this(basePickerProps: P) = this()
}
/* static members */
@JSImport("office-ui-fabric-react/lib/components/pickers", "BasePicker")
@js.native
object BasePicker extends js.Object {
  
  def getDerivedStateFromProps(newProps: IBasePickerProps[_]): Items | Null = js.native
}
