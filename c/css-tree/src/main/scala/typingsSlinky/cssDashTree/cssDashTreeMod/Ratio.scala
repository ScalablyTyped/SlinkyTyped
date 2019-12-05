package typingsSlinky.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ratio
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  var left: String
  var right: String
  @JSName("type")
  var type_Ratio: typingsSlinky.cssDashTree.cssDashTreeStrings.Ratio
}

object Ratio {
  @scala.inline
  def apply(
    left: String,
    right: String,
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.Ratio,
    loc: CssLocation = null
  ): Ratio = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ratio]
  }
}

