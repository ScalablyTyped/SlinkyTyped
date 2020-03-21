package typingsSlinky.marked

import typingsSlinky.marked.markedStrings.center
import typingsSlinky.marked.markedStrings.left
import typingsSlinky.marked.markedStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlign extends js.Object {
  var align: center | left | right | Null
  var header: Boolean
}

object AnonAlign {
  @scala.inline
  def apply(header: Boolean, align: center | left | right = null): AnonAlign = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlign]
  }
}

