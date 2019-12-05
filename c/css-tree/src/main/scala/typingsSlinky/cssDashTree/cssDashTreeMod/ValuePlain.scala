package typingsSlinky.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValuePlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain]
  @JSName("type")
  var type_ValuePlain: typingsSlinky.cssDashTree.cssDashTreeStrings.Value
}

object ValuePlain {
  @scala.inline
  def apply(
    children: js.Array[CssNodePlain],
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.Value,
    loc: CssLocation = null
  ): ValuePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValuePlain]
  }
}

