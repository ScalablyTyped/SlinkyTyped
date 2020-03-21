package typingsSlinky.mdast.mod

import typingsSlinky.mdast.mdastStrings.tableCell
import typingsSlinky.unist.mod.Data
import typingsSlinky.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCell extends Parent {
  @JSName("children")
  var children_TableCell: js.Array[PhrasingContent]
  @JSName("type")
  var type_TableCell: tableCell
}

object TableCell {
  @scala.inline
  def apply(
    children: js.Array[PhrasingContent],
    `type`: tableCell,
    data: Data = null,
    position: Position = null
  ): TableCell = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCell]
  }
}

