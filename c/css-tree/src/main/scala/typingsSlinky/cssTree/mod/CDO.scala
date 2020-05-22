package typingsSlinky.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CDO
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_CDO: typingsSlinky.cssTree.cssTreeStrings.CDO
}

object CDO {
  @scala.inline
  def apply(`type`: typingsSlinky.cssTree.cssTreeStrings.CDO, loc: CssLocation = null): CDO = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CDO]
  }
}

