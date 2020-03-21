package typingsSlinky.rcTree.mod

import slinky.core.ReactComponentClass
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDragEndData extends js.Object {
  var event: Event_
  var node: ReactComponentClass[InternalTreeNodeProps]
}

object OnDragEndData {
  @scala.inline
  def apply(event: Event_, node: ReactComponentClass[InternalTreeNodeProps]): OnDragEndData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnDragEndData]
  }
}

