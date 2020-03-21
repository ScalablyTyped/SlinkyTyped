package typingsSlinky.grommet

import typingsSlinky.grommet.grommetStrings.bottom
import typingsSlinky.grommet.grommetStrings.left
import typingsSlinky.grommet.grommetStrings.right
import typingsSlinky.grommet.grommetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTop extends js.Object {
  var bottom: js.UndefOr[top | typingsSlinky.grommet.grommetStrings.bottom] = js.undefined
  var left: js.UndefOr[right | typingsSlinky.grommet.grommetStrings.left] = js.undefined
  var right: js.UndefOr[typingsSlinky.grommet.grommetStrings.right | left] = js.undefined
  var top: js.UndefOr[typingsSlinky.grommet.grommetStrings.top | bottom] = js.undefined
}

object AnonTop {
  @scala.inline
  def apply(
    bottom: top | bottom = null,
    left: right | left = null,
    right: right | left = null,
    top: top | bottom = null
  ): AnonTop = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTop]
  }
}

