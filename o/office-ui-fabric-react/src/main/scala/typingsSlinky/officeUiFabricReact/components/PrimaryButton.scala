package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PrimaryButton {
  
  @JSImport("office-ui-fabric-react", "PrimaryButton")
  @js.native
  object component extends js.Object
  
  def withProps(p: IButtonProps): SharedBuilder_IButtonProps1271470609[typingsSlinky.officeUiFabricReact.mod.PrimaryButton] = new SharedBuilder_IButtonProps1271470609[typingsSlinky.officeUiFabricReact.mod.PrimaryButton](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PrimaryButton.type): SharedBuilder_IButtonProps1271470609[typingsSlinky.officeUiFabricReact.mod.PrimaryButton] = new SharedBuilder_IButtonProps1271470609[typingsSlinky.officeUiFabricReact.mod.PrimaryButton](js.Array(this.component, js.Dictionary.empty))()
}
