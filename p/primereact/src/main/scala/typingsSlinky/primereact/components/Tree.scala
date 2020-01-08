package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.Anon_NodeOriginalEvent
import typingsSlinky.primereact.Anon_OriginalEventValue
import typingsSlinky.primereact.componentsTreeTreeMod.TreeProps
import typingsSlinky.primereact.componentsTreenodeTreeNodeMod.TreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tree
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.treeMod.Tree] {
  @JSImport("primereact/tree", "Tree")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, id, onContextMenu, onSelect */
  def apply(
    contentClassName: String = null,
    contentStyle: js.Object = null,
    contextMenuSelectionKey: js.Any = null,
    dragdropScope: String = null,
    expandedKeys: js.Any = null,
    filter: js.UndefOr[Boolean] = js.undefined,
    filterBy: js.Any = null,
    filterMode: String = null,
    filterPlaceholder: String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    loadingIcon: String = null,
    metaKeySelection: js.UndefOr[Boolean] = js.undefined,
    nodeTemplate: /* node */ js.Any => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    onCollapse: /* e */ Anon_NodeOriginalEvent => Unit = null,
    onContextMenuSelectionChange: /* e */ Anon_OriginalEventValue => Unit = null,
    onDragDrop: /* e */ Anon_OriginalEventValue => Unit = null,
    onExpand: /* e */ Anon_NodeOriginalEvent => Unit = null,
    onSelectionChange: /* e */ Anon_OriginalEventValue => Unit = null,
    onToggle: /* e */ Anon_OriginalEventValue => Unit = null,
    onUnselect: /* e */ Anon_NodeOriginalEvent => Unit = null,
    propagateSelectionDown: js.UndefOr[Boolean] = js.undefined,
    propagateSelectionUp: js.UndefOr[Boolean] = js.undefined,
    selectionKeys: js.Any = null,
    selectionMode: String = null,
    style: js.Object = null,
    value: js.Array[TreeNode] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.treeMod.Tree] = {
    val __obj = js.Dynamic.literal()
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (contextMenuSelectionKey != null) __obj.updateDynamic("contextMenuSelectionKey")(contextMenuSelectionKey.asInstanceOf[js.Any])
    if (dragdropScope != null) __obj.updateDynamic("dragdropScope")(dragdropScope.asInstanceOf[js.Any])
    if (expandedKeys != null) __obj.updateDynamic("expandedKeys")(expandedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterBy != null) __obj.updateDynamic("filterBy")(filterBy.asInstanceOf[js.Any])
    if (filterMode != null) __obj.updateDynamic("filterMode")(filterMode.asInstanceOf[js.Any])
    if (filterPlaceholder != null) __obj.updateDynamic("filterPlaceholder")(filterPlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (loadingIcon != null) __obj.updateDynamic("loadingIcon")(loadingIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKeySelection)) __obj.updateDynamic("metaKeySelection")(metaKeySelection.asInstanceOf[js.Any])
    if (nodeTemplate != null) __obj.updateDynamic("nodeTemplate")(js.Any.fromFunction1(nodeTemplate))
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (onContextMenuSelectionChange != null) __obj.updateDynamic("onContextMenuSelectionChange")(js.Any.fromFunction1(onContextMenuSelectionChange))
    if (onDragDrop != null) __obj.updateDynamic("onDragDrop")(js.Any.fromFunction1(onDragDrop))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction1(onExpand))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1(onSelectionChange))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (onUnselect != null) __obj.updateDynamic("onUnselect")(js.Any.fromFunction1(onUnselect))
    if (!js.isUndefined(propagateSelectionDown)) __obj.updateDynamic("propagateSelectionDown")(propagateSelectionDown.asInstanceOf[js.Any])
    if (!js.isUndefined(propagateSelectionUp)) __obj.updateDynamic("propagateSelectionUp")(propagateSelectionUp.asInstanceOf[js.Any])
    if (selectionKeys != null) __obj.updateDynamic("selectionKeys")(selectionKeys.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.treeMod.Tree] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.primereact.treeMod.Tree](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TreeProps
}

