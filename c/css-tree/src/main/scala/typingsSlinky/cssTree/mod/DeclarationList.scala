package typingsSlinky.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationList
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode]
  @JSName("type")
  var type_DeclarationList: typingsSlinky.cssTree.cssTreeStrings.DeclarationList
}

object DeclarationList {
  @scala.inline
  def apply(
    children: List[CssNode],
    `type`: typingsSlinky.cssTree.cssTreeStrings.DeclarationList,
    loc: CssLocation = null
  ): DeclarationList = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationList]
  }
}

