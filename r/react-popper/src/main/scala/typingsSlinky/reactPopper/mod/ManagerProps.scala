package typingsSlinky.reactPopper.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagerProps extends js.Object {
  var children: TagMod[Any]
}

object ManagerProps {
  @scala.inline
  def apply(children: TagMod[Any] = null): ManagerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagerProps]
  }
}

