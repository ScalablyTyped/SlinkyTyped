package typingsSlinky.rcMenu.components

import typingsSlinky.rcMenu.menuMod.MenuProps
import typingsSlinky.rcMenu.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcMenu {
  
  @JSImport("rc-menu", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RcMenu.type): SharedBuilder_MenuProps1085698216[default] = new SharedBuilder_MenuProps1085698216[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MenuProps): SharedBuilder_MenuProps1085698216[default] = new SharedBuilder_MenuProps1085698216[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
