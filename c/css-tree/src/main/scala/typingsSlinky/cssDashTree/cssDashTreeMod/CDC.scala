package typingsSlinky.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CDC
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_CDC: typingsSlinky.cssDashTree.cssDashTreeStrings.CDC
}

object CDC {
  @scala.inline
  def apply(`type`: typingsSlinky.cssDashTree.cssDashTreeStrings.CDC, loc: CssLocation = null): CDC = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CDC]
  }
}

