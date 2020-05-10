package typingsSlinky.reactSortableTree

import typingsSlinky.reactSortableTree.mod.TreeIndex
import typingsSlinky.reactSortableTree.mod.TreeItem
import typingsSlinky.reactSortableTree.mod.TreeNode
import typingsSlinky.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  depth  :number,   newNode  :react-sortable-tree.react-sortable-tree.TreeItem,   minimumTreeIndex  :number,   ignoreCollapsed ? :boolean,   expandParent ? :boolean,   getNodeKey  :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction} */
@js.native
trait FullTreedepthnumbernewNod extends js.Object {
  var depth: Double = js.native
  var expandParent: js.UndefOr[Boolean] = js.native
  var getNodeKey: GetNodeKeyFunction = js.native
  var ignoreCollapsed: js.UndefOr[Boolean] = js.native
  var minimumTreeIndex: Double = js.native
  var newNode: TreeItem = js.native
  var treeData: js.Array[TreeItem] = js.native
}

object FullTreedepthnumbernewNod {
  @scala.inline
  def apply(
    depth: Double,
    getNodeKey: /* data */ TreeIndex with TreeNode => String | Double,
    minimumTreeIndex: Double,
    newNode: TreeItem,
    treeData: js.Array[TreeItem]
  ): FullTreedepthnumbernewNod = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], getNodeKey = js.Any.fromFunction1(getNodeKey), minimumTreeIndex = minimumTreeIndex.asInstanceOf[js.Any], newNode = newNode.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreedepthnumbernewNod]
  }
  @scala.inline
  implicit class FullTreedepthnumbernewNodOps[Self <: FullTreedepthnumbernewNod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetNodeKey(value: /* data */ TreeIndex with TreeNode => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMinimumTreeIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumTreeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewNode(value: TreeItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeData(value: js.Array[TreeItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandParent")(js.undefined)
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

