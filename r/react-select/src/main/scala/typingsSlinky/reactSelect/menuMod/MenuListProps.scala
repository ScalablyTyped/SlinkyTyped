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
  def apply(children: TagMod[Any] = null, innerRef: InnerRef = null): MenuListProps = {
    val __obj = js.Dynamic.literal(innerRef = innerRef.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuListProps]
  }
}

