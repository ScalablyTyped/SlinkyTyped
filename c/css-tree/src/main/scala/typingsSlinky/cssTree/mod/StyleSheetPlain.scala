package typingsSlinky.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSheetPlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain]
  @JSName("type")
  var type_StyleSheetPlain: typingsSlinky.cssTree.cssTreeStrings.StyleSheet
}

object StyleSheetPlain {
  @scala.inline
  def apply(
    children: js.Array[CssNodePlain],
    `type`: typingsSlinky.cssTree.cssTreeStrings.StyleSheet,
    loc: CssLocation = null
  ): StyleSheetPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheetPlain]
  }
}

