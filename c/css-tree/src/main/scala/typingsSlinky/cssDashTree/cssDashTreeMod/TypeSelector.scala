package typingsSlinky.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeSelector
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  var name: String
  @JSName("type")
  var type_TypeSelector: typingsSlinky.cssDashTree.cssDashTreeStrings.TypeSelector
}

object TypeSelector {
  @scala.inline
  def apply(
    name: String,
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.TypeSelector,
    loc: CssLocation = null
  ): TypeSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSelector]
  }
}

