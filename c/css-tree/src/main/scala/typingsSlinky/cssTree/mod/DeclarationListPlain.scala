package typingsSlinky.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationListPlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain]
  @JSName("type")
  var type_DeclarationListPlain: typingsSlinky.cssTree.cssTreeStrings.DeclarationList
}

object DeclarationListPlain {
  @scala.inline
  def apply(
    children: js.Array[CssNodePlain],
    `type`: typingsSlinky.cssTree.cssTreeStrings.DeclarationList,
    loc: CssLocation = null
  ): DeclarationListPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationListPlain]
  }
}

