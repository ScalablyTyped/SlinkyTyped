package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.baseui.menuMod.NestedMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NestedMenus {
  
  @JSImport("baseui/menu", "NestedMenus")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: NestedMenus.type): Default[tag.type, typingsSlinky.baseui.menuMod.NestedMenus] = new Default[tag.type, typingsSlinky.baseui.menuMod.NestedMenus](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NestedMenuProps): Default[tag.type, typingsSlinky.baseui.menuMod.NestedMenus] = new Default[tag.type, typingsSlinky.baseui.menuMod.NestedMenus](js.Array(this.component, p.asInstanceOf[js.Any]))
}
