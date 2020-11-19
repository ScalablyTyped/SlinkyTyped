package typingsSlinky.reactFoundation.components

import typingsSlinky.reactFoundation.menuMod.MenuItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuText {
  
  @JSImport("react-foundation", "MenuText")
  @js.native
  object component extends js.Object
  
  def withProps(p: MenuItemProps): SharedBuilder_MenuItemProps470639042 = new SharedBuilder_MenuItemProps470639042(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: MenuText.type): SharedBuilder_MenuItemProps470639042 = new SharedBuilder_MenuItemProps470639042(js.Array(this.component, js.Dictionary.empty))()
}
