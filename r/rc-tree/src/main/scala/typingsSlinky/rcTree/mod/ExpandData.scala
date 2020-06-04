package typingsSlinky.rcTree.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandData extends js.Object {
  var expanded: Boolean
  var node: ReactComponentClass[InternalTreeNodeProps]
}

object ExpandData {
  @scala.inline
  def apply(expanded: Boolean, node: ReactComponentClass[InternalTreeNodeProps]): ExpandData = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandData]
  }
  @scala.inline
  implicit class ExpandDataOps[Self <: ExpandData] (val x: Self) extends AnyVal {
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
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: ReactComponentClass[InternalTreeNodeProps]): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

