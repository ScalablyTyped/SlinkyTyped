package typingsSlinky.lowlight.lowlight.AST

import typingsSlinky.lowlight.lowlight.AST.Unist.Data
import typingsSlinky.lowlight.lowlight.AST.Unist.Location
import typingsSlinky.lowlight.lowlight.AST.Unist.Node
import typingsSlinky.lowlight.lowlight.AST.Unist.Parent
import typingsSlinky.lowlight.lowlight.HastNode
import typingsSlinky.lowlight.lowlightStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Root
  extends Parent
     with HastNode {
  @JSName("type")
  var type_Root: root
}

object Root {
  @scala.inline
  def apply(children: js.Array[Node], `type`: root, data: Data = null, position: Location = null): Root = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Root]
  }
}

