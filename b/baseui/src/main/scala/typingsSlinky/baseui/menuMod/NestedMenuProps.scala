package typingsSlinky.baseui.menuMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedMenuProps extends js.Object {
  var children: TagMod[Any]
}

object NestedMenuProps {
  @scala.inline
  def apply(children: TagMod[Any] = null): NestedMenuProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedMenuProps]
  }
}

