package typingsSlinky.gestalt.gestaltMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
}

object ContainerProps {
  @scala.inline
  def apply(children: TagMod[Any] = null): ContainerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerProps]
  }
}

