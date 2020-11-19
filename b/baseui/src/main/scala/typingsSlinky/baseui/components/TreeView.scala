package typingsSlinky.baseui.components

import typingsSlinky.baseui.treeViewMod.TreeNode
import typingsSlinky.baseui.treeViewMod.TreeViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeView {
  
  @JSImport("baseui/tree-view", "TreeView")
  @js.native
  object component extends js.Object
  
  def withProps(p: TreeViewProps): SharedBuilder_TreeViewProps_1705561772 = new SharedBuilder_TreeViewProps_1705561772(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(data: js.Array[TreeNode[_]]): SharedBuilder_TreeViewProps_1705561772 = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_TreeViewProps_1705561772(js.Array(this.component, __props.asInstanceOf[TreeViewProps]))
  }
}
