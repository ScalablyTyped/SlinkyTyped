package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.autofillTypesMod.IAutofillProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BaseAutoFill {
  @JSImport("office-ui-fabric-react", "BaseAutoFill")
  @js.native
  object component extends js.Object
  
  def withProps(p: IAutofillProps): SharedBuilder_IAutofillProps_786739988[typingsSlinky.officeUiFabricReact.mod.BaseAutoFill] = new SharedBuilder_IAutofillProps_786739988[typingsSlinky.officeUiFabricReact.mod.BaseAutoFill](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: BaseAutoFill.type): SharedBuilder_IAutofillProps_786739988[typingsSlinky.officeUiFabricReact.mod.BaseAutoFill] = new SharedBuilder_IAutofillProps_786739988[typingsSlinky.officeUiFabricReact.mod.BaseAutoFill](js.Array(this.component, js.Dictionary.empty))()
}

