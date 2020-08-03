package typingsSlinky.rcTree.components

import typingsSlinky.rcTree.mod.default
import typingsSlinky.rcTree.treeMod.TreeProps
import typingsSlinky.rcTree.treeNodeMod.TreeNodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcTree {
  @JSImport("rc-tree", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TreeProps): SharedBuilder_TreeProps_407499862[default] = new SharedBuilder_TreeProps_407499862[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(prefixCls: String): SharedBuilder_TreeProps_407499862[default] = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new SharedBuilder_TreeProps_407499862[default](js.Array(this.component, __props.asInstanceOf[TreeProps]))
  }
  object TreeNode {
    @JSImport("rc-tree", "default.TreeNode")
    @js.native
    object component extends js.Object
    
    def withProps(p: TreeNodeProps): SharedBuilder_TreeNodeProps1751175894 = new SharedBuilder_TreeNodeProps1751175894(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: TreeNode.type): SharedBuilder_TreeNodeProps1751175894 = new SharedBuilder_TreeNodeProps1751175894(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

