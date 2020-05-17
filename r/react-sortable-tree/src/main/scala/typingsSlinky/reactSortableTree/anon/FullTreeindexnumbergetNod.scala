package typingsSlinky.reactSortableTree.anon

import typingsSlinky.reactSortableTree.mod.TreeIndex
import typingsSlinky.reactSortableTree.mod.TreeItem
import typingsSlinky.reactSortableTree.mod.TreeNode
import typingsSlinky.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  index  :number,   getNodeKey  :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction} */
@js.native
trait FullTreeindexnumbergetNod extends js.Object {
  var getNodeKey: GetNodeKeyFunction = js.native
  var index: Double = js.native
  var treeData: js.Array[TreeItem] = js.native
}

object FullTreeindexnumbergetNod {
  @scala.inline
  def apply(
    getNodeKey: /* data */ TreeIndex with TreeNode => String | Double,
    index: Double,
    treeData: js.Array[TreeItem]
  ): FullTreeindexnumbergetNod = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), index = index.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreeindexnumbergetNod]
  }
  @scala.inline
  implicit class FullTreeindexnumbergetNodOps[Self <: FullTreeindexnumbergetNod] (val x: Self) extends AnyVal {
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
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeData(value: js.Array[TreeItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

