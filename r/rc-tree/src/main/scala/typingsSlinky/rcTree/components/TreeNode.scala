package typingsSlinky.rcTree.components

import typingsSlinky.rcTree.treeNodeMod.TreeNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeNode {
  
  @JSImport("rc-tree", "TreeNode")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TreeNode.type): SharedBuilder_TreeNodeProps1751175894 = new SharedBuilder_TreeNodeProps1751175894(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TreeNodeProps): SharedBuilder_TreeNodeProps1751175894 = new SharedBuilder_TreeNodeProps1751175894(js.Array(this.component, p.asInstanceOf[js.Any]))
}
