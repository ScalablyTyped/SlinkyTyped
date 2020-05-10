package typingsSlinky.reactBootstrap.components

import typingsSlinky.reactBootstrap.pagerItemMod.PagerItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PageItem {
  @JSImport("react-bootstrap", "PageItem")
  @js.native
  object component extends js.Object
  
  def withProps(p: PagerItemProps): SharedBuilder_PagerItemProps_1528535100[typingsSlinky.reactBootstrap.mod.PageItem] = new SharedBuilder_PagerItemProps_1528535100[typingsSlinky.reactBootstrap.mod.PageItem](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PageItem.type): SharedBuilder_PagerItemProps_1528535100[typingsSlinky.reactBootstrap.mod.PageItem] = new SharedBuilder_PagerItemProps_1528535100[typingsSlinky.reactBootstrap.mod.PageItem](js.Array(this.component, js.Dictionary.empty))()
}

