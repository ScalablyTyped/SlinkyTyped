package typingsSlinky.rcMenu.components

import typingsSlinky.rcMenu.menuItemGroupMod.MenuItemGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ItemGroup {
  @JSImport("rc-menu", "ItemGroup")
  @js.native
  object component extends js.Object
  
  def withProps(p: MenuItemGroupProps): SharedBuilder_MenuItemGroupProps_851978124[typingsSlinky.rcMenu.mod.ItemGroup] = new SharedBuilder_MenuItemGroupProps_851978124[typingsSlinky.rcMenu.mod.ItemGroup](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ItemGroup.type): SharedBuilder_MenuItemGroupProps_851978124[typingsSlinky.rcMenu.mod.ItemGroup] = new SharedBuilder_MenuItemGroupProps_851978124[typingsSlinky.rcMenu.mod.ItemGroup](js.Array(this.component, js.Dictionary.empty))()
}

