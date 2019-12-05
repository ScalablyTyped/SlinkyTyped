package typingsSlinky.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CDO
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_CDO: typingsSlinky.cssDashTree.cssDashTreeStrings.CDO
}

object CDO {
  @scala.inline
  def apply(`type`: typingsSlinky.cssDashTree.cssDashTreeStrings.CDO, loc: CssLocation = null): CDO = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CDO]
  }
}

