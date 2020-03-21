package typingsSlinky.reactSelect.menuMod

import slinky.core.TagMod
import typingsSlinky.reactSelect.typesMod.InnerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuListProps extends js.Object {
  /** The children to be rendered. */
  var children: TagMod[Any]
  /** Inner ref to DOM Node */
  var innerRef: InnerRef
}

object MenuListProps {
  @scala.inline
  def apply(children: TagMod[Any], innerRef: InnerRef = null): MenuListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuListProps]
  }
}

