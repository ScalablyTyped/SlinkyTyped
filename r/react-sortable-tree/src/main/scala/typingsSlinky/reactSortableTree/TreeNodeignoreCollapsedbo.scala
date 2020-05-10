package typingsSlinky.reactSortableTree

import typingsSlinky.reactSortableTree.mod.TreeItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.TreeNode & {  ignoreCollapsed ? :boolean} */
@js.native
trait TreeNodeignoreCollapsedbo extends js.Object {
  var ignoreCollapsed: js.UndefOr[Boolean] = js.native
  var node: TreeItem = js.native
}

object TreeNodeignoreCollapsedbo {
  @scala.inline
  def apply(node: TreeItem): TreeNodeignoreCollapsedbo = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNodeignoreCollapsedbo]
  }
  @scala.inline
  implicit class TreeNodeignoreCollapsedboOps[Self <: TreeNodeignoreCollapsedbo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNode(value: TreeItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCollapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCollapsed")(js.undefined)
        ret
    }
  }
  
}

