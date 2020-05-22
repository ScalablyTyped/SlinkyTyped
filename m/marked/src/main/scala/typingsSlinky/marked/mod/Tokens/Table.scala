package typingsSlinky.marked.mod.Tokens

import typingsSlinky.marked.markedStrings.center
import typingsSlinky.marked.markedStrings.left
import typingsSlinky.marked.markedStrings.right
import typingsSlinky.marked.markedStrings.table
import typingsSlinky.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends Token {
  var align: js.Array[center | left | right | Null]
  var cells: js.Array[js.Array[String]]
  var header: js.Array[String]
  var `type`: table
}

object Table {
  @scala.inline
  def apply(
    align: js.Array[center | left | right | Null],
    cells: js.Array[js.Array[String]],
    header: js.Array[String],
    `type`: table
  ): Table = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
}

