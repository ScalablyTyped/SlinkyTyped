package typingsSlinky.baseui.components

import org.scalajs.dom.raw.Node
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.treeViewMod.TreeLabelOverrides
import typingsSlinky.baseui.treeViewMod.TreeLabelProps
import typingsSlinky.baseui.treeViewMod.TreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TreeLabel {
  @JSImport("baseui/tree-view", "TreeLabel")
  @js.native
  object component extends js.Object
  
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
  @scala.inline
  def apply(hasChildren: Boolean, label: (js.Function1[/* node */ TreeNode, Node]) | String, node: TreeNode): Builder = {
    val __props = js.Dynamic.literal(hasChildren = hasChildren.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TreeLabelProps]))
  }
}

