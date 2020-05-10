package typingsSlinky.reactSortableTree

import typingsSlinky.reactSortableTree.mod.NumberOrStringArray
import typingsSlinky.reactSortableTree.mod.TreeItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & react-sortable-tree.react-sortable-tree.TreeIndex & react-sortable-tree.react-sortable-tree.TreePath & {  parentNode  :react-sortable-tree.react-sortable-tree.TreeItem} */
@js.native
trait FullTreeTreeIndexTreePath extends js.Object {
  var parentNode: TreeItem = js.native
  var path: NumberOrStringArray = js.native
  var treeData: js.Array[TreeItem] = js.native
  var treeIndex: Double = js.native
}

object FullTreeTreeIndexTreePath {
  @scala.inline
  def apply(parentNode: TreeItem, path: NumberOrStringArray, treeData: js.Array[TreeItem], treeIndex: Double): FullTreeTreeIndexTreePath = {
    val __obj = js.Dynamic.literal(parentNode = parentNode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreeTreeIndexTreePath]
  }
  @scala.inline
  implicit class FullTreeTreeIndexTreePathOps[Self <: FullTreeTreeIndexTreePath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParentNode(value: TreeItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(value.asInstanceOf[js.Any])
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
    def withTreeIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

