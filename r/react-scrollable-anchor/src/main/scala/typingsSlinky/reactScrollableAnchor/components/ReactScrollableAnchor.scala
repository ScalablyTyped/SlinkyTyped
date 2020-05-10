package typingsSlinky.reactScrollableAnchor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactScrollableAnchor.mod.ScrollableAnchorProps
import typingsSlinky.reactScrollableAnchor.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactScrollableAnchor {
  @JSImport("react-scrollable-anchor", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ScrollableAnchorProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(id: String): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[ScrollableAnchorProps]))
  }
}

