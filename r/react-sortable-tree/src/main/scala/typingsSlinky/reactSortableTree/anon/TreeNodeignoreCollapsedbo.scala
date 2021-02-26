package typingsSlinky.reactSortableTree.anon

import typingsSlinky.reactSortableTree.mod.TreeItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-sortable-tree.react-sortable-tree.TreeNode & {  ignoreCollapsed :boolean | undefined} */
@js.native
trait TreeNodeignoreCollapsedbo extends StObject {
  
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
  implicit class TreeNodeignoreCollapsedboMutableBuilder[Self <: TreeNodeignoreCollapsedbo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreCollapsed(value: Boolean): Self = StObject.set(x, "ignoreCollapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCollapsedUndefined: Self = StObject.set(x, "ignoreCollapsed", js.undefined)
    
    @scala.inline
    def setNode(value: TreeItem): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
