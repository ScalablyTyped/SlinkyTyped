package typingsSlinky.rcTree.mod

import slinky.core.ReactComponentClass
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDragLeaveData extends js.Object {
  var event: Event_
  var node: ReactComponentClass[InternalTreeNodeProps]
}

object OnDragLeaveData {
  @scala.inline
  def apply(event: Event_, node: ReactComponentClass[InternalTreeNodeProps]): OnDragLeaveData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnDragLeaveData]
  }
}

