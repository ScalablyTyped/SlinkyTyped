package typingsSlinky.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaQueryList
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode]
  @JSName("type")
  var type_MediaQueryList: typingsSlinky.cssTree.cssTreeStrings.MediaQueryList
}

object MediaQueryList {
  @scala.inline
  def apply(
    children: List[CssNode],
    `type`: typingsSlinky.cssTree.cssTreeStrings.MediaQueryList,
    loc: CssLocation = null
  ): MediaQueryList = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQueryList]
  }
}

