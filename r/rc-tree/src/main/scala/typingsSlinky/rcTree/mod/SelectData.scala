package typingsSlinky.rcTree.mod

import slinky.core.ReactComponentClass
import typingsSlinky.rcTree.rcTreeStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectData extends js.Object {
  var event: select
  var node: ReactComponentClass[InternalTreeNodeProps]
  var selected: Boolean
  var selectedNodes: js.Array[ReactComponentClass[InternalTreeNodeProps]]
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEvent(value: select): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: ReactComponentClass[InternalTreeNodeProps]): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedNodesVarargs(value: ReactComponentClass[InternalTreeNodeProps]*): Self = this.set("selectedNodes", js.Array(value :_*))
    @scala.inline
    def setSelectedNodes(value: js.Array[ReactComponentClass[InternalTreeNodeProps]]): Self = this.set("selectedNodes", value.asInstanceOf[js.Any])
  }
  
}

