package typingsSlinky.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdSelector
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  var name: String
  @JSName("type")
  var type_IdSelector: typingsSlinky.cssDashTree.cssDashTreeStrings.IdSelector
}

object IdSelector {
  @scala.inline
  def apply(
    name: String,
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.IdSelector,
    loc: CssLocation = null
  ): IdSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdSelector]
  }
}

