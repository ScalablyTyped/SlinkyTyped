package typingsSlinky.antd.components

import typingsSlinky.rcTree.mod.TreeNodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TreeTreeNode {
  @JSImport("antd", "Tree.TreeNode")
  @js.native
  object component extends js.Object
  
  def withProps(p: TreeNodeProps): SharedBuilder_TreeNodeProps_229388169[typingsSlinky.antd.mod.Tree.TreeNode] = new SharedBuilder_TreeNodeProps_229388169[typingsSlinky.antd.mod.Tree.TreeNode](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TreeTreeNode.type): SharedBuilder_TreeNodeProps_229388169[typingsSlinky.antd.mod.Tree.TreeNode] = new SharedBuilder_TreeNodeProps_229388169[typingsSlinky.antd.mod.Tree.TreeNode](js.Array(this.component, js.Dictionary.empty))()
}

