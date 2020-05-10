package typingsSlinky.reactFoundation.components

import typingsSlinky.reactFoundation.menuMod.MenuItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MenuItem {
  @JSImport("react-foundation", "MenuItem")
  @js.native
  object component extends js.Object
  
  def withProps(p: MenuItemProps): SharedBuilder_MenuItemProps470639042 = new SharedBuilder_MenuItemProps470639042(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MenuItem.type): SharedBuilder_MenuItemProps470639042 = new SharedBuilder_MenuItemProps470639042(js.Array(this.component, js.Dictionary.empty))()
}

