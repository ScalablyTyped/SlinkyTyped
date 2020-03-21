package typingsSlinky.blueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsCore.treeNodeMod.ITreeNode
import typingsSlinky.blueprintjsCore.treeNodeMod.ITreeNodeProps
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TreeNode
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsCore.mod.TreeNode[js.Any]] {
  @JSImport("@blueprintjs/core", "TreeNode")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, key */
  def apply[T](
    depth: Double,
    id: String | Double,
    label: String | ReactElement,
    path: js.Array[Double],
    childNodes: js.Array[ITreeNode[T]] = null,
    contentRef: (/* node */ typingsSlinky.blueprintjsCore.treeNodeMod.TreeNode[T], /* element */ HTMLDivElement | Null) => Unit = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hasCaret: js.UndefOr[Boolean] = js.undefined,
    icon: IconName | MaybeElement = null,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    nodeData: T = null,
    onClick: (/* node */ typingsSlinky.blueprintjsCore.treeNodeMod.TreeNode[T], /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit = null,
    onCollapse: (/* node */ typingsSlinky.blueprintjsCore.treeNodeMod.TreeNode[T], /* e */ SyntheticMouseEvent[HTMLSpanElement]) => Unit = null,
    onContextMenu: (/* node */ typingsSlinky.blueprintjsCore.treeNodeMod.TreeNode[T], /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit = null,
    onDoubleClick: (/* node */ typingsSlinky.blueprintjsCore.treeNodeMod.TreeNode[T], /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit = null,
    onExpand: (/* node */ typingsSlinky.blueprintjsCore.treeNodeMod.TreeNode[T], /* e */ SyntheticMouseEvent[HTMLSpanElement]) => Unit = null,
    onMouseEnter: (/* node */ typingsSlinky.blueprintjsCore.treeNodeMod.TreeNode[T], /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit = null,
    onMouseLeave: (/* node */ typingsSlinky.blueprintjsCore.treeNodeMod.TreeNode[T], /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit = null,
    secondaryLabel: String | MaybeElement = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.TreeNode[js.Any]] = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (childNodes != null) __obj.updateDynamic("childNodes")(childNodes.asInstanceOf[js.Any])
    if (contentRef != null) __obj.updateDynamic("contentRef")(js.Any.fromFunction2(contentRef))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(hasCaret)) __obj.updateDynamic("hasCaret")(hasCaret.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (nodeData != null) __obj.updateDynamic("nodeData")(nodeData.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction2(onCollapse))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction2(onContextMenu))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction2(onDoubleClick))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2(onExpand))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2(onMouseLeave))
    if (secondaryLabel != null) __obj.updateDynamic("secondaryLabel")(secondaryLabel.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.div.tag.type, typingsSlinky.blueprintjsCore.mod.TreeNode[js.Any]]]
  }
  type Props = ITreeNodeProps[js.Any]
}

