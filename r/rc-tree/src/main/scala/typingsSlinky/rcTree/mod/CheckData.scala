package typingsSlinky.rcTree.mod

import slinky.core.ReactComponentClass
import typingsSlinky.rcTree.rcTreeStrings.check
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckData extends js.Object {
  var checked: Boolean = js.native
  var checkedNodes: js.Array[ReactComponentClass[InternalTreeNodeProps]] = js.native
  var event: check = js.native
  var halfCheckedKeys: js.Array[String] = js.native
  var node: ReactComponentClass[InternalTreeNodeProps] = js.native
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
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckedNodes(value: js.Array[ReactComponentClass[InternalTreeNodeProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: check): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHalfCheckedKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halfCheckedKeys")(value.asInstanceOf[js.Any])
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

