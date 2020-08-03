package typingsSlinky.rcTreeSelect.components

import typingsSlinky.rcTreeSelect.interfaceMod.Key
import typingsSlinky.rcTreeSelect.treeNodeMod.TreeNodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TreeNode {
  @JSImport("rc-tree-select", "TreeNode")
  @js.native
  object component extends js.Object
  
  def withProps(p: TreeNodeProps): SharedBuilder_TreeNodeProps1401300722 = new SharedBuilder_TreeNodeProps1401300722(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(value: Key): SharedBuilder_TreeNodeProps1401300722 = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new SharedBuilder_TreeNodeProps1401300722(js.Array(this.component, __props.asInstanceOf[TreeNodeProps]))
  }
}

