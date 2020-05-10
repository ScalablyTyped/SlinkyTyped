package typingsSlinky.rcTree.mod

import slinky.core.ReactComponentClass
import typingsSlinky.rcTree.rcTreeStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectData extends js.Object {
  var event: select = js.native
  var node: ReactComponentClass[InternalTreeNodeProps] = js.native
  var selected: Boolean = js.native
  var selectedNodes: js.Array[ReactComponentClass[InternalTreeNodeProps]] = js.native
}

object SelectData {
  @scala.inline
  def apply(
    event: select,
    node: ReactComponentClass[InternalTreeNodeProps],
    selected: Boolean,
    selectedNodes: js.Array[ReactComponentClass[InternalTreeNodeProps]]
  ): SelectData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selectedNodes = selectedNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectData]
  }
  @scala.inline
  implicit class SelectDataOps[Self <: SelectData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: select): Self = {
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
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedNodes(value: js.Array[ReactComponentClass[InternalTreeNodeProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedNodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

