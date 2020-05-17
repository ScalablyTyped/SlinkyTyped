package typingsSlinky.reactSortableTree.anon

import typingsSlinky.reactSortableTree.mod.NumberOrStringArray
import typingsSlinky.reactSortableTree.mod.TreeItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.TreeNode & react-sortable-tree.react-sortable-tree.TreePath & {  lowerSiblingsCounts  :std.Array<number>} */
@js.native
trait TreeNodeTreePathlowerSibl extends js.Object {
  var lowerSiblingsCounts: js.Array[Double] = js.native
  var node: TreeItem = js.native
  var path: NumberOrStringArray = js.native
}

object TreeNodeTreePathlowerSibl {
  @scala.inline
  def apply(lowerSiblingsCounts: js.Array[Double], node: TreeItem, path: NumberOrStringArray): TreeNodeTreePathlowerSibl = {
    val __obj = js.Dynamic.literal(lowerSiblingsCounts = lowerSiblingsCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNodeTreePathlowerSibl]
  }
  @scala.inline
  implicit class TreeNodeTreePathlowerSiblOps[Self <: TreeNodeTreePathlowerSibl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLowerSiblingsCounts(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerSiblingsCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: TreeItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: NumberOrStringArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

