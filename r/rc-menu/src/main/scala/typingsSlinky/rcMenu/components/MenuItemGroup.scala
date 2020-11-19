package typingsSlinky.rcMenu.components

import typingsSlinky.rcMenu.menuItemGroupMod.MenuItemGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuItemGroup {
  
  @JSImport("rc-menu", "MenuItemGroup")
  @js.native
  object component extends js.Object
  
  def withProps(p: MenuItemGroupProps): SharedBuilder_MenuItemGroupProps_851978124[typingsSlinky.rcMenu.mod.MenuItemGroup] = new SharedBuilder_MenuItemGroupProps_851978124[typingsSlinky.rcMenu.mod.MenuItemGroup](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: MenuItemGroup.type): SharedBuilder_MenuItemGroupProps_851978124[typingsSlinky.rcMenu.mod.MenuItemGroup] = new SharedBuilder_MenuItemGroupProps_851978124[typingsSlinky.rcMenu.mod.MenuItemGroup](js.Array(this.component, js.Dictionary.empty))()
}
