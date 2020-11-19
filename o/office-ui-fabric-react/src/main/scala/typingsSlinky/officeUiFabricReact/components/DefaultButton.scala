package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultButton {
  
  @JSImport("office-ui-fabric-react", "DefaultButton")
  @js.native
  object component extends js.Object
  
  def withProps(p: IButtonProps): SharedBuilder_IButtonProps1271470609[typingsSlinky.officeUiFabricReact.mod.DefaultButton] = new SharedBuilder_IButtonProps1271470609[typingsSlinky.officeUiFabricReact.mod.DefaultButton](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DefaultButton.type): SharedBuilder_IButtonProps1271470609[typingsSlinky.officeUiFabricReact.mod.DefaultButton] = new SharedBuilder_IButtonProps1271470609[typingsSlinky.officeUiFabricReact.mod.DefaultButton](js.Array(this.component, js.Dictionary.empty))()
}
