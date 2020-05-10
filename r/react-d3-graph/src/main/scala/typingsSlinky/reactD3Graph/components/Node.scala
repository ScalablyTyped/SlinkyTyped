package typingsSlinky.reactD3Graph.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object Node {
  @JSImport("react-d3-graph", "Node")
  @js.native
  object component extends js.Object
  
  def apply(p: js.Any): Default[tag.type, typingsSlinky.reactD3Graph.mod.Node] = new Default[tag.type, typingsSlinky.reactD3Graph.mod.Node](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Node.type): Default[tag.type, typingsSlinky.reactD3Graph.mod.Node] = new Default[tag.type, typingsSlinky.reactD3Graph.mod.Node](js.Array(this.component, js.Dictionary.empty))()
}

