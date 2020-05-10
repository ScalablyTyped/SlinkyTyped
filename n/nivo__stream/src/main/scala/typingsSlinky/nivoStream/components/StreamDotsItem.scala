package typingsSlinky.nivoStream.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.nivoStream.mod.StreamDotsItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StreamDotsItem {
  @JSImport("@nivo/stream", "StreamDotsItem")
  @js.native
  object component extends js.Object
  
  def withProps(p: StreamDotsItemProps): Default[tag.type, typingsSlinky.nivoStream.mod.StreamDotsItem] = new Default[tag.type, typingsSlinky.nivoStream.mod.StreamDotsItem](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(borderColor: String, borderWidth: Double, color: String, size: Double, x: Double, y: Double): Default[tag.type, typingsSlinky.nivoStream.mod.StreamDotsItem] = {
    val __props = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.nivoStream.mod.StreamDotsItem](js.Array(this.component, __props.asInstanceOf[StreamDotsItemProps]))
  }
}

