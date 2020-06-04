package typingsSlinky.rcTree.mod

import slinky.core.ReactComponentClass
import typingsSlinky.rcTree.rcTreeStrings.check
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckData extends js.Object {
  var checked: Boolean
  var checkedNodes: js.Array[ReactComponentClass[InternalTreeNodeProps]]
  var event: check
  var halfCheckedKeys: js.Array[String]
  var node: ReactComponentClass[InternalTreeNodeProps]
}

object CheckData {
  @scala.inline
  def apply(
    checked: Boolean,
    checkedNodes: js.Array[ReactComponentClass[InternalTreeNodeProps]],
    event: check,
    halfCheckedKeys: js.Array[String],
    node: ReactComponentClass[InternalTreeNodeProps]
  ): CheckData = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], checkedNodes = checkedNodes.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckData]
  }
  @scala.inline
  implicit class CheckDataOps[Self <: CheckData] (val x: Self) extends AnyVal {
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckedNodes(value: js.Array[ReactComponentClass[InternalTreeNodeProps]]): Self = this.set("checkedNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: check): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setHalfCheckedKeys(value: js.Array[String]): Self = this.set("halfCheckedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: ReactComponentClass[InternalTreeNodeProps]): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

