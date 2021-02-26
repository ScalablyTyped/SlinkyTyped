package typingsSlinky.baseui.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.treeViewMod.TreeLabelOverrides
import typingsSlinky.baseui.treeViewMod.TreeLabelProps
import typingsSlinky.baseui.treeViewMod.TreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeLabel {
  
  @scala.inline
  def apply(
    hasChildren: Boolean,
    label: (js.Function1[/* node */ TreeNode[_], ReactElement]) | String,
    node: TreeNode[_]
  ): Builder = {
    val __props = js.Dynamic.literal(hasChildren = hasChildren.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TreeLabelProps]))
  }
  
  @JSImport("baseui/tree-view", "TreeLabel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def isExpanded(value: Boolean): this.type = set("isExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overrides(value: TreeLabelOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TreeLabelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
