package typingsSlinky.grommet.anon

import typingsSlinky.grommet.grommetStrings.bottom
import typingsSlinky.grommet.grommetStrings.left
import typingsSlinky.grommet.grommetStrings.right
import typingsSlinky.grommet.grommetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Left extends js.Object {
  var bottom: js.UndefOr[top | typingsSlinky.grommet.grommetStrings.bottom] = js.undefined
  var left: js.UndefOr[typingsSlinky.grommet.grommetStrings.left | right] = js.undefined
  var right: js.UndefOr[left | typingsSlinky.grommet.grommetStrings.right] = js.undefined
  var top: js.UndefOr[typingsSlinky.grommet.grommetStrings.top | bottom] = js.undefined
}

object Left {
  @scala.inline
  def apply(
    bottom: top | bottom = null,
    left: left | right = null,
    right: left | right = null,
    top: top | bottom = null
  ): Left = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
}

