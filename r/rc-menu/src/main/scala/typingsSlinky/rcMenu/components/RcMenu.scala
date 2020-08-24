package typingsSlinky.rcMenu.components

import typingsSlinky.rcMenu.menuMod.MenuProps
import typingsSlinky.rcMenu.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcMenu {
  @JSImport("rc-menu", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: MenuProps): SharedBuilder_MenuProps1085698216[default] = new SharedBuilder_MenuProps1085698216[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RcMenu.type): SharedBuilder_MenuProps1085698216[default] = new SharedBuilder_MenuProps1085698216[default](js.Array(this.component, js.Dictionary.empty))()
}

