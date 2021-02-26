package typingsSlinky.reactSortableTree.anon

import typingsSlinky.reactSortableTree.mod.TreeIndex
import typingsSlinky.reactSortableTree.mod.TreeItem
import typingsSlinky.reactSortableTree.mod.TreeNode
import typingsSlinky.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  getNodeKey :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction,   ignoreCollapsed :boolean | undefined} */
@js.native
trait FullTreegetNodeKeyGetNode extends StObject {
  
  var getNodeKey: GetNodeKeyFunction = js.native
  
  var ignoreCollapsed: js.UndefOr[Boolean] = js.native
  
  var treeData: js.Array[TreeItem] = js.native
}
object FullTreegetNodeKeyGetNode {
  
  @scala.inline
  def apply(getNodeKey: /* data */ TreeIndex with TreeNode => String | Double, treeData: js.Array[TreeItem]): FullTreegetNodeKeyGetNode = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreegetNodeKeyGetNode]
  }
  
  @scala.inline
  implicit class FullTreegetNodeKeyGetNodeMutableBuilder[Self <: FullTreegetNodeKeyGetNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetNodeKey(value: /* data */ TreeIndex with TreeNode => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIgnoreCollapsed(value: Boolean): Self = StObject.set(x, "ignoreCollapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCollapsedUndefined: Self = StObject.set(x, "ignoreCollapsed", js.undefined)
    
    @scala.inline
    def setTreeData(value: js.Array[TreeItem]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeDataVarargs(value: TreeItem*): Self = StObject.set(x, "treeData", js.Array(value :_*))
  }
}
