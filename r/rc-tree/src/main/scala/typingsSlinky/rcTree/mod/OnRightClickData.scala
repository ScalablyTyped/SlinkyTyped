package typingsSlinky.rcTree.mod

import org.scalajs.dom.raw.Event
import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnRightClickData extends js.Object {
  var event: Event = js.native
  var node: ReactComponentClass[InternalTreeNodeProps] = js.native
}

object OnRightClickData {
  @scala.inline
  def apply(event: Event, node: ReactComponentClass[InternalTreeNodeProps]): OnRightClickData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnRightClickData]
  }
  @scala.inline
  implicit class OnRightClickDataOps[Self <: OnRightClickData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: ReactComponentClass[InternalTreeNodeProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

