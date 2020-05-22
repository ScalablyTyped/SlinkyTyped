package typingsSlinky.antDesignReactNative.anon

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildrenReactNode extends js.Object {
  var children: TagMod[Any]
  var key: Double
}

object ChildrenReactNode {
  @scala.inline
  def apply(key: Double, children: TagMod[Any] = null): ChildrenReactNode = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenReactNode]
  }
}

