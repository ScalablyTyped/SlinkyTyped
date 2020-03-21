package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.treeViewMod.TreeLabelOverrides
import typingsSlinky.baseui.treeViewMod.TreeLabelProps
import typingsSlinky.baseui.treeViewMod.TreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TreeLabel
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("baseui/tree-view", "TreeLabel")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    hasChildren: Boolean,
    label: (js.Function1[/* node */ TreeNode, Node]) | String,
    node: TreeNode,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    overrides: TreeLabelOverrides = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(hasChildren = hasChildren.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TreeLabelProps
}

