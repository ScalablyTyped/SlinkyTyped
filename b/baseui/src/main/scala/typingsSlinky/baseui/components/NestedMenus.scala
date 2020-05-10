package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.baseui.menuMod.NestedMenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NestedMenus {
  @JSImport("baseui/menu", "NestedMenus")
  @js.native
  object component extends js.Object
  
  def withProps(p: NestedMenuProps): Default[tag.type, typingsSlinky.baseui.menuMod.NestedMenus] = new Default[tag.type, typingsSlinky.baseui.menuMod.NestedMenus](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: NestedMenus.type): Default[tag.type, typingsSlinky.baseui.menuMod.NestedMenus] = new Default[tag.type, typingsSlinky.baseui.menuMod.NestedMenus](js.Array(this.component, js.Dictionary.empty))()
}

