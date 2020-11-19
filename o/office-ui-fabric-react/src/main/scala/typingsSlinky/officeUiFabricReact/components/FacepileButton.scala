package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FacepileButton {
  
  @JSImport("office-ui-fabric-react/lib/components/Facepile/FacepileButton", "FacepileButton")
  @js.native
  object component extends js.Object
  
  def withProps(p: IButtonProps): SharedBuilder_IButtonProps1271470609[typingsSlinky.officeUiFabricReact.facepileButtonMod.FacepileButton] = new SharedBuilder_IButtonProps1271470609[typingsSlinky.officeUiFabricReact.facepileButtonMod.FacepileButton](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: FacepileButton.type): SharedBuilder_IButtonProps1271470609[typingsSlinky.officeUiFabricReact.facepileButtonMod.FacepileButton] = new SharedBuilder_IButtonProps1271470609[typingsSlinky.officeUiFabricReact.facepileButtonMod.FacepileButton](js.Array(this.component, js.Dictionary.empty))()
}
