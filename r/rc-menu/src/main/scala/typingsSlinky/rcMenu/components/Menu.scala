package typingsSlinky.rcMenu.components

import typingsSlinky.rcMenu.menuMod.MenuProps
import typingsSlinky.rcMenu.menuMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Menu {
  
  @JSImport("rc-menu/es/Menu", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: MenuProps): SharedBuilder_MenuProps1085698216[default] = new SharedBuilder_MenuProps1085698216[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Menu.type): SharedBuilder_MenuProps1085698216[default] = new SharedBuilder_MenuProps1085698216[default](js.Array(this.component, js.Dictionary.empty))()
}
