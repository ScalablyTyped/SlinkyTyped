package typingsSlinky.rcTreeSelect.components

import typingsSlinky.rcTreeSelect.interfaceMod.Key
import typingsSlinky.rcTreeSelect.treeNodeMod.TreeNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeNode {
  
  @scala.inline
  def apply(value: Key): SharedBuilder_TreeNodeProps1401300722 = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new SharedBuilder_TreeNodeProps1401300722(js.Array(this.component, __props.asInstanceOf[TreeNodeProps]))
  }
  
  @JSImport("rc-tree-select", "TreeNode")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TreeNodeProps): SharedBuilder_TreeNodeProps1401300722 = new SharedBuilder_TreeNodeProps1401300722(js.Array(this.component, p.asInstanceOf[js.Any]))
}
