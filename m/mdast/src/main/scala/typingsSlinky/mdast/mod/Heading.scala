package typingsSlinky.mdast.mod

import typingsSlinky.mdast.mdastNumbers.`1`
import typingsSlinky.mdast.mdastNumbers.`2`
import typingsSlinky.mdast.mdastNumbers.`3`
import typingsSlinky.mdast.mdastNumbers.`4`
import typingsSlinky.mdast.mdastNumbers.`5`
import typingsSlinky.mdast.mdastNumbers.`6`
import typingsSlinky.mdast.mdastStrings.heading
import typingsSlinky.unist.mod.Data
import typingsSlinky.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Heading
  extends Parent
     with BlockContent {
  @JSName("children")
  var children_Heading: js.Array[PhrasingContent]
  var depth: `1` | `2` | `3` | `4` | `5` | `6`
  @JSName("type")
  var type_Heading: heading
}

object Heading {
  @scala.inline
  def apply(
    children: js.Array[PhrasingContent],
    depth: `1` | `2` | `3` | `4` | `5` | `6`,
    `type`: heading,
    data: Data = null,
    position: Position = null
  ): Heading = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Heading]
  }
}

