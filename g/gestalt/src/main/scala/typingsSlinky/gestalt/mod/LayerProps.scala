package typingsSlinky.gestalt.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerProps extends js.Object {
  var children: TagMod[Any]
}

object LayerProps {
  @scala.inline
  def apply(children: TagMod[Any] = null): LayerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerProps]
  }
}

