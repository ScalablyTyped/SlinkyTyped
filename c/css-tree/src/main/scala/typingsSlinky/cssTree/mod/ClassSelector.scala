package typingsSlinky.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassSelector
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  var name: String
  @JSName("type")
  var type_ClassSelector: typingsSlinky.cssTree.cssTreeStrings.ClassSelector
}

object ClassSelector {
  @scala.inline
  def apply(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.ClassSelector, loc: CssLocation = null): ClassSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassSelector]
  }
}

