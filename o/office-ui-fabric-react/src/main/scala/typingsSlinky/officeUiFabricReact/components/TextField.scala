package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.textFieldTypesMod.ITextFieldProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextField {
  
  @JSImport("office-ui-fabric-react", "TextField")
  @js.native
  object component extends js.Object
  
  def withProps(p: ITextFieldProps): SharedBuilder_ITextFieldProps1156210801[js.Object] = new SharedBuilder_ITextFieldProps1156210801[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TextField.type): SharedBuilder_ITextFieldProps1156210801[js.Object] = new SharedBuilder_ITextFieldProps1156210801[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
