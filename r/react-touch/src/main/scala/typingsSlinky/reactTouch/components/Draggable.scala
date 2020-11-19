package typingsSlinky.reactTouch.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactTouch.mod.DraggableCallbackArgument
import typingsSlinky.reactTouch.mod.DraggableProps
import typingsSlinky.reactTouch.mod.DraggableStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Draggable {
  
  @JSImport("react-touch", "Draggable")
  @js.native
  object component extends js.Object
  
  def withProps(p: DraggableProps): Default[tag.type, typingsSlinky.reactTouch.mod.Draggable] = new Default[tag.type, typingsSlinky.reactTouch.mod.Draggable](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: /* argument */ DraggableCallbackArgument => ReactElement, style: DraggableStyle): Default[tag.type, typingsSlinky.reactTouch.mod.Draggable] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), style = style.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactTouch.mod.Draggable](js.Array(this.component, __props.asInstanceOf[DraggableProps]))
  }
}
