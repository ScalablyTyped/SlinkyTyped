package typingsSlinky.reactTouch.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactTouch.mod.DraggableProps
import typingsSlinky.reactTouch.mod.DraggableStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Draggable {
  @JSImport("react-touch", "Draggable")
  @js.native
  object component extends js.Object
  
  def withProps(p: DraggableProps): Default[tag.type, typingsSlinky.reactTouch.mod.Draggable] = new Default[tag.type, typingsSlinky.reactTouch.mod.Draggable](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(style: DraggableStyle): Default[tag.type, typingsSlinky.reactTouch.mod.Draggable] = {
    val __props = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactTouch.mod.Draggable](js.Array(this.component, __props.asInstanceOf[DraggableProps]))
  }
}

