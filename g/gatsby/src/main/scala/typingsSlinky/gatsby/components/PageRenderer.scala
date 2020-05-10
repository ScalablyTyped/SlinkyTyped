package typingsSlinky.gatsby.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.gatsby.mod.PageRendererProps
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reachRouter.mod.WindowLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PageRenderer {
  @JSImport("gatsby", "PageRenderer")
  @js.native
  object component extends js.Object
  
  def withProps(p: PageRendererProps): Default[tag.type, typingsSlinky.gatsby.mod.PageRenderer] = new Default[tag.type, typingsSlinky.gatsby.mod.PageRenderer](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(location: WindowLocation[LocationState]): Default[tag.type, typingsSlinky.gatsby.mod.PageRenderer] = {
    val __props = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.gatsby.mod.PageRenderer](js.Array(this.component, __props.asInstanceOf[PageRendererProps]))
  }
}

