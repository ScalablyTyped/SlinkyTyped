package typingsSlinky.antd.components

import typingsSlinky.rcTree.mod.TreeNodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TreeNode {
  @JSImport("antd/lib/tree/Tree", "default.TreeNode")
  @js.native
  object component extends js.Object
  
  def withProps(p: TreeNodeProps): SharedBuilder_TreeNodeProps_229388169[typingsSlinky.antd.treeTreeMod.default.TreeNode] = new SharedBuilder_TreeNodeProps_229388169[typingsSlinky.antd.treeTreeMod.default.TreeNode](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TreeNode.type): SharedBuilder_TreeNodeProps_229388169[typingsSlinky.antd.treeTreeMod.default.TreeNode] = new SharedBuilder_TreeNodeProps_229388169[typingsSlinky.antd.treeTreeMod.default.TreeNode](js.Array(this.component, js.Dictionary.empty))()
}

