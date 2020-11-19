package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.textFieldTypesMod.ITextFieldProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MaskedTextField {
  
  @JSImport("office-ui-fabric-react", "MaskedTextField")
  @js.native
  object component extends js.Object
  
  def withProps(p: ITextFieldProps): SharedBuilder_ITextFieldProps1156210801[typingsSlinky.officeUiFabricReact.mod.MaskedTextField] = new SharedBuilder_ITextFieldProps1156210801[typingsSlinky.officeUiFabricReact.mod.MaskedTextField](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: MaskedTextField.type): SharedBuilder_ITextFieldProps1156210801[typingsSlinky.officeUiFabricReact.mod.MaskedTextField] = new SharedBuilder_ITextFieldProps1156210801[typingsSlinky.officeUiFabricReact.mod.MaskedTextField](js.Array(this.component, js.Dictionary.empty))()
}
