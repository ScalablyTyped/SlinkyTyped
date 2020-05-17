package typingsSlinky.reactSortableTree.anon

import typingsSlinky.reactSortableTree.mod.NumberOrStringArray
import typingsSlinky.reactSortableTree.mod.TreeIndex
import typingsSlinky.reactSortableTree.mod.TreeItem
import typingsSlinky.reactSortableTree.mod.TreeNode
import typingsSlinky.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & react-sortable-tree.react-sortable-tree.TreePath & {  newNode  :std.Function | any,   getNodeKey  :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction,   ignoreCollapsed ? :boolean} */
@js.native
trait FullTreeTreePathnewNodeFu extends js.Object {
  var getNodeKey: GetNodeKeyFunction = js.native
  var ignoreCollapsed: js.UndefOr[Boolean] = js.native
  var newNode: js.Function | js.Any = js.native
  var path: NumberOrStringArray = js.native
  var treeData: js.Array[TreeItem] = js.native
}

object FullTreeTreePathnewNodeFu {
  @scala.inline
  def apply(
    getNodeKey: /* data */ TreeIndex with TreeNode => String | Double,
    newNode: js.Function | js.Any,
    path: NumberOrStringArray,
    treeData: js.Array[TreeItem]
  ): FullTreeTreePathnewNodeFu = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), newNode = newNode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreeTreePathnewNodeFu]
  }
  @scala.inline
  implicit class FullTreeTreePathnewNodeFuOps[Self <: FullTreeTreePathnewNodeFu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetNodeKey(value: /* data */ TreeIndex with TreeNode => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNewNode(value: js.Function | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: NumberOrStringArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeData(value: js.Array[TreeItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeData")(value.asInstanceOf[js.Any])
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

