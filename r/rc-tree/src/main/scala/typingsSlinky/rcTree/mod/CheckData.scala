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
}

