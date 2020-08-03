package typingsSlinky.rcMenu.components

import typingsSlinky.rcMenu.menuItemGroupMod.MenuItemGroupProps
import typingsSlinky.rcMenu.menuItemGroupMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MenuItemGroup {
  @JSImport("rc-menu/es/MenuItemGroup", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: MenuItemGroupProps): SharedBuilder_MenuItemGroupProps_851978124[default] = new SharedBuilder_MenuItemGroupProps_851978124[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MenuItemGroup.type): SharedBuilder_MenuItemGroupProps_851978124[default] = new SharedBuilder_MenuItemGroupProps_851978124[default](js.Array(this.component, js.Dictionary.empty))()
}

