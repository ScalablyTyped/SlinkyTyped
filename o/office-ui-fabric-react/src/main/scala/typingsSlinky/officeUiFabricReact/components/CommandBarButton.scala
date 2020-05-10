package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CommandBarButton {
  @JSImport("office-ui-fabric-react", "CommandBarButton")
  @js.native
  object component extends js.Object
  
  def withProps(p: IButtonProps): SharedBuilder_IButtonProps1271470609[typingsSlinky.officeUiFabricReact.mod.CommandBarButton] = new SharedBuilder_IButtonProps1271470609[typingsSlinky.officeUiFabricReact.mod.CommandBarButton](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CommandBarButton.type): SharedBuilder_IButtonProps1271470609[typingsSlinky.officeUiFabricReact.mod.CommandBarButton] = new SharedBuilder_IButtonProps1271470609[typingsSlinky.officeUiFabricReact.mod.CommandBarButton](js.Array(this.component, js.Dictionary.empty))()
}

