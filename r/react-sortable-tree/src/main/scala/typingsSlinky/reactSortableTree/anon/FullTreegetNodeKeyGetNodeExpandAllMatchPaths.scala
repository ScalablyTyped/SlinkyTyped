package typingsSlinky.reactSortableTree.anon

import typingsSlinky.reactSortableTree.mod.SearchData
import typingsSlinky.reactSortableTree.mod.TreeIndex
import typingsSlinky.reactSortableTree.mod.TreeItem
import typingsSlinky.reactSortableTree.mod.TreeNode
import typingsSlinky.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  getNodeKey :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction,   searchQuery :string | number | undefined, searchMethod (data : react-sortable-tree.react-sortable-tree.SearchData): boolean,   searchFocusOffset :number | undefined,   expandAllMatchPaths :boolean | undefined,   expandFocusMatchPaths :boolean | undefined} */
@js.native
trait FullTreegetNodeKeyGetNodeExpandAllMatchPaths extends StObject {
  
  var expandAllMatchPaths: js.UndefOr[Boolean] = js.native
  
  var expandFocusMatchPaths: js.UndefOr[Boolean] = js.native
  
  var getNodeKey: GetNodeKeyFunction = js.native
  
  var searchFocusOffset: js.UndefOr[Double] = js.native
  
  def searchMethod(data: SearchData): Boolean = js.native
  
  var searchQuery: js.UndefOr[String | Double] = js.native
  
  var treeData: js.Array[TreeItem] = js.native
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
  implicit class FullTreegetNodeKeyGetNodeExpandAllMatchPathsMutableBuilder[Self <: FullTreegetNodeKeyGetNodeExpandAllMatchPaths] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpandAllMatchPaths(value: Boolean): Self = StObject.set(x, "expandAllMatchPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandAllMatchPathsUndefined: Self = StObject.set(x, "expandAllMatchPaths", js.undefined)
    
    @scala.inline
    def setExpandFocusMatchPaths(value: Boolean): Self = StObject.set(x, "expandFocusMatchPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandFocusMatchPathsUndefined: Self = StObject.set(x, "expandFocusMatchPaths", js.undefined)
    
    @scala.inline
    def setGetNodeKey(value: /* data */ TreeIndex with TreeNode => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearchFocusOffset(value: Double): Self = StObject.set(x, "searchFocusOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchFocusOffsetUndefined: Self = StObject.set(x, "searchFocusOffset", js.undefined)
    
    @scala.inline
    def setSearchMethod(value: SearchData => Boolean): Self = StObject.set(x, "searchMethod", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearchQuery(value: String | Double): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchQueryUndefined: Self = StObject.set(x, "searchQuery", js.undefined)
    
    @scala.inline
    def setTreeData(value: js.Array[TreeItem]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeDataVarargs(value: TreeItem*): Self = StObject.set(x, "treeData", js.Array(value :_*))
  }
}
