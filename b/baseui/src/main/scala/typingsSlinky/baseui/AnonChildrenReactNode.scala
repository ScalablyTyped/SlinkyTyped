package typingsSlinky.baseui

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenReactNode extends js.Object {
  var children: TagMod[Any]
}

object AnonChildrenReactNode {
  @scala.inline
  def apply(children: TagMod[Any]): AnonChildrenReactNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChildrenReactNode]
  }
}

