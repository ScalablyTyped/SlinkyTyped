package typingsSlinky.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeSelector
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  var name: String
  @JSName("type")
  var type_TypeSelector: typingsSlinky.cssTree.cssTreeStrings.TypeSelector
}

object TypeSelector {
  @scala.inline
  def apply(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.TypeSelector, loc: CssLocation = null): TypeSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSelector]
  }
}

