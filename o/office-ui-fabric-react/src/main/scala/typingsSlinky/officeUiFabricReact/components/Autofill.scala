package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.autofillTypesMod.IAutofillProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Autofill {
  
  @JSImport("office-ui-fabric-react", "Autofill")
  @js.native
  object component extends js.Object
  
  def withProps(p: IAutofillProps): SharedBuilder_IAutofillProps_786739988[typingsSlinky.officeUiFabricReact.mod.Autofill] = new SharedBuilder_IAutofillProps_786739988[typingsSlinky.officeUiFabricReact.mod.Autofill](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Autofill.type): SharedBuilder_IAutofillProps_786739988[typingsSlinky.officeUiFabricReact.mod.Autofill] = new SharedBuilder_IAutofillProps_786739988[typingsSlinky.officeUiFabricReact.mod.Autofill](js.Array(this.component, js.Dictionary.empty))()
}
