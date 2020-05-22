package typingsSlinky.mjmlReact.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequiredChildrenProps extends js.Object {
  var children: TagMod[Any]
}

object RequiredChildrenProps {
  @scala.inline
  def apply(children: TagMod[Any] = null): RequiredChildrenProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredChildrenProps]
  }
}

