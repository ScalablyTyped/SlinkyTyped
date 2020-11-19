package typingsSlinky.rcTreeSelect.components

import typingsSlinky.rcTreeSelect.interfaceMod.Key
import typingsSlinky.rcTreeSelect.mod.default
import typingsSlinky.rcTreeSelect.treeNodeMod.TreeNodeProps
import typingsSlinky.rcTreeSelect.treeSelectMod.TreeSelectProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcTreeSelect {
  
  @JSImport("rc-tree-select", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps[ValueType](p: TreeSelectProps[ValueType]): SharedBuilder_TreeSelectProps1138808573[default[ValueType], ValueType] = new SharedBuilder_TreeSelectProps1138808573[default[ValueType], ValueType](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[ValueType](): SharedBuilder_TreeSelectProps1138808573[default[ValueType], ValueType] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_TreeSelectProps1138808573[default[ValueType], ValueType](js.Array(this.component, __props.asInstanceOf[TreeSelectProps[ValueType]]))
  }
  
  implicit def make[ValueType](companion: RcTreeSelect.type): SharedBuilder_TreeSelectProps1138808573[default[ValueType], ValueType] = new SharedBuilder_TreeSelectProps1138808573[default[ValueType], ValueType](js.Array(this.component, js.Dictionary.empty))()
  
  object TreeNode {
    
    @JSImport("rc-tree-select", "default.TreeNode")
    @js.native
    object component extends js.Object
    
    def withProps(p: TreeNodeProps): SharedBuilder_TreeNodeProps1401300722 = new SharedBuilder_TreeNodeProps1401300722(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(value: Key): SharedBuilder_TreeNodeProps1401300722 = {
      val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      new SharedBuilder_TreeNodeProps1401300722(js.Array(this.component, __props.asInstanceOf[TreeNodeProps]))
    }
  }
}
