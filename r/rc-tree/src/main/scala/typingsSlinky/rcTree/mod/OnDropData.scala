package typingsSlinky.rcTree.mod

import slinky.core.ReactComponentClass
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnDropData extends js.Object {
  var dragNode: ReactComponentClass[InternalTreeNodeProps] = js.native
  var dragNodesKeys: js.Array[String] = js.native
  var dropPosition: Double = js.native
  var dropToGap: js.UndefOr[Boolean] = js.native
  var event: Event_ = js.native
  var node: ReactComponentClass[InternalTreeNodeProps] = js.native
}

object OnDropData {
  @scala.inline
  def apply(
    dragNode: ReactComponentClass[InternalTreeNodeProps],
    dragNodesKeys: js.Array[String],
    dropPosition: Double,
    event: Event_,
    node: ReactComponentClass[InternalTreeNodeProps]
  ): OnDropData = {
    val __obj = js.Dynamic.literal(dragNode = dragNode.asInstanceOf[js.Any], dragNodesKeys = dragNodesKeys.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDropData]
  }
  @scala.inline
  implicit class OnDropDataOps[Self <: OnDropData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragNode(value: ReactComponentClass[InternalTreeNodeProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragNodesKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragNodesKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: Event_): Self = {
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
    @scala.inline
    def withDropToGap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropToGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropToGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropToGap")(js.undefined)
        ret
    }
  }
  
}

