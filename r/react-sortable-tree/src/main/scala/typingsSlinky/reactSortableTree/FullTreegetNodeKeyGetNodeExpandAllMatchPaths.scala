package typingsSlinky.reactSortableTree

import typingsSlinky.reactSortableTree.mod.SearchData
import typingsSlinky.reactSortableTree.mod.TreeIndex
import typingsSlinky.reactSortableTree.mod.TreeItem
import typingsSlinky.reactSortableTree.mod.TreeNode
import typingsSlinky.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  getNodeKey  :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction,   searchQuery ? :string | number, searchMethod (data : react-sortable-tree.react-sortable-tree.SearchData): boolean,   searchFocusOffset ? :number,   expandAllMatchPaths ? :boolean,   expandFocusMatchPaths ? :boolean} */
@js.native
trait FullTreegetNodeKeyGetNodeExpandAllMatchPaths extends js.Object {
  var expandAllMatchPaths: js.UndefOr[Boolean] = js.native
  var expandFocusMatchPaths: js.UndefOr[Boolean] = js.native
  var getNodeKey: GetNodeKeyFunction = js.native
  var searchFocusOffset: js.UndefOr[Double] = js.native
  var searchQuery: js.UndefOr[String | Double] = js.native
  var treeData: js.Array[TreeItem] = js.native
  def searchMethod(data: SearchData): Boolean = js.native
}

object FullTreegetNodeKeyGetNodeExpandAllMatchPaths {
  @scala.inline
  def apply(
    getNodeKey: /* data */ TreeIndex with TreeNode => String | Double,
    searchMethod: SearchData => Boolean,
    treeData: js.Array[TreeItem]
  ): FullTreegetNodeKeyGetNodeExpandAllMatchPaths = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), searchMethod = js.Any.fromFunction1(searchMethod), treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreegetNodeKeyGetNodeExpandAllMatchPaths]
  }
  @scala.inline
  implicit class FullTreegetNodeKeyGetNodeExpandAllMatchPathsOps[Self <: FullTreegetNodeKeyGetNodeExpandAllMatchPaths] (val x: Self) extends AnyVal {
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
    def withSearchMethod(value: SearchData => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchMethod")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTreeData(value: js.Array[TreeItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandAllMatchPaths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAllMatchPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandAllMatchPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAllMatchPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandFocusMatchPaths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandFocusMatchPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandFocusMatchPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandFocusMatchPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchFocusOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFocusOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchFocusOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFocusOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchQuery(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchQuery")(js.undefined)
        ret
    }
  }
  
}

