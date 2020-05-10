package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button {
  @JSImport("office-ui-fabric-react", "Button")
  @js.native
  object component extends js.Object
  
  def withProps(p: IButtonProps): SharedBuilder_IButtonProps1271470609[typingsSlinky.officeUiFabricReact.mod.Button] = new SharedBuilder_IButtonProps1271470609[typingsSlinky.officeUiFabricReact.mod.Button](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Button.type): SharedBuilder_IButtonProps1271470609[typingsSlinky.officeUiFabricReact.mod.Button] = new SharedBuilder_IButtonProps1271470609[typingsSlinky.officeUiFabricReact.mod.Button](js.Array(this.component, js.Dictionary.empty))()
}

