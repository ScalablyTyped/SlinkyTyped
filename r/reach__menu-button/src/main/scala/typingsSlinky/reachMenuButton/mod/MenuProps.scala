package typingsSlinky.reachMenuButton.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(children: TagMod[Any] = null): MenuProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps]
  }
}

