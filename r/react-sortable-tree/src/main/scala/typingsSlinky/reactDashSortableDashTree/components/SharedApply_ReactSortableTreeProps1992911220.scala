package typingsSlinky.reactDashSortableDashTree.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashSortableDashTree.reactDashSortableDashTreeMod.ExtendedNodeData
import typingsSlinky.reactDashSortableDashTree.reactDashSortableDashTreeMod.FullTree
import typingsSlinky.reactDashSortableDashTree.reactDashSortableDashTreeMod.NodeData
import typingsSlinky.reactDashSortableDashTree.reactDashSortableDashTreeMod.NodeRenderer
import typingsSlinky.reactDashSortableDashTree.reactDashSortableDashTreeMod.OnDragPreviousAndNextLocation
import typingsSlinky.reactDashSortableDashTree.reactDashSortableDashTreeMod.OnDragStateChangedData
import typingsSlinky.reactDashSortableDashTree.reactDashSortableDashTreeMod.OnMovePreviousAndNextLocation
import typingsSlinky.reactDashSortableDashTree.reactDashSortableDashTreeMod.OnVisibilityToggleData
import typingsSlinky.reactDashSortableDashTree.reactDashSortableDashTreeMod.PlaceholderRenderer
import typingsSlinky.reactDashSortableDashTree.reactDashSortableDashTreeMod.ReactSortableTreeProps
import typingsSlinky.reactDashSortableDashTree.reactDashSortableDashTreeMod.SearchData
import typingsSlinky.reactDashSortableDashTree.reactDashSortableDashTreeMod.ShouldCopyData
import typingsSlinky.reactDashSortableDashTree.reactDashSortableDashTreeMod.ThemeProps
import typingsSlinky.reactDashSortableDashTree.reactDashSortableDashTreeMod.TreeIndex
import typingsSlinky.reactDashSortableDashTree.reactDashSortableDashTreeMod.TreeItem
import typingsSlinky.reactDashSortableDashTree.reactDashSortableDashTreeMod.TreeNode
import typingsSlinky.reactDashSortableDashTree.reactDashSortableDashTreeStrings.ltr
import typingsSlinky.reactDashSortableDashTree.reactDashSortableDashTreeStrings.rtl
import typingsSlinky.reactDashVirtualized.distEsListMod.ListProps
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedMod.Index
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ReactSortableTreeProps1992911220[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className */
  def apply(
    onChange: js.Array[TreeItem] => Unit,
    treeData: js.Array[TreeItem],
    canDrag: (js.Function1[/* data */ ExtendedNodeData, Boolean]) | Boolean = null,
    canDrop: /* data */ OnDragPreviousAndNextLocation with NodeData => Boolean = null,
    canNodeHaveChildren: /* node */ TreeItem => Boolean = null,
    dndType: String = null,
    generateNodeProps: /* data */ ExtendedNodeData => StringDictionary[_] = null,
    getNodeKey: /* data */ TreeNode with TreeIndex => String | Double = null,
    innerStyle: CSSProperties = null,
    isVirtualized: js.UndefOr[Boolean] = js.undefined,
    maxDepth: Int | Double = null,
    nodeContentRenderer: NodeRenderer = null,
    onDragStateChanged: /* data */ OnDragStateChangedData => Unit = null,
    onMoveNode: /* data */ NodeData with FullTree with OnMovePreviousAndNextLocation => Unit = null,
    onVisibilityToggle: /* data */ OnVisibilityToggleData => Unit = null,
    onlyExpandSearchedNodes: js.UndefOr[Boolean] = js.undefined,
    placeholderRenderer: PlaceholderRenderer = null,
    reactVirtualizedListProps: Partial[ListProps] = null,
    rowDirection: ltr | rtl = null,
    rowHeight: (js.Function1[/* info */ Index, Double]) | Double = null,
    scaffoldBlockPxWidth: Int | Double = null,
    searchFinishCallback: /* matches */ js.Array[NodeData] => Unit = null,
    searchFocusOffset: Int | Double = null,
    searchMethod: /* data */ SearchData => Boolean = null,
    searchQuery: String | js.Any = null,
    shouldCopyOnOutsideDrop: Boolean | (js.Function1[/* data */ ShouldCopyData, Boolean]) = null,
    slideRegionSize: Int | Double = null,
    style: CSSProperties = null,
    theme: ThemeProps = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), treeData = treeData.asInstanceOf[js.Any])
    if (canDrag != null) __obj.updateDynamic("canDrag")(canDrag.asInstanceOf[js.Any])
    if (canDrop != null) __obj.updateDynamic("canDrop")(js.Any.fromFunction1(canDrop))
    if (canNodeHaveChildren != null) __obj.updateDynamic("canNodeHaveChildren")(js.Any.fromFunction1(canNodeHaveChildren))
    if (dndType != null) __obj.updateDynamic("dndType")(dndType.asInstanceOf[js.Any])
    if (generateNodeProps != null) __obj.updateDynamic("generateNodeProps")(js.Any.fromFunction1(generateNodeProps))
    if (getNodeKey != null) __obj.updateDynamic("getNodeKey")(js.Any.fromFunction1(getNodeKey))
    if (innerStyle != null) __obj.updateDynamic("innerStyle")(innerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(isVirtualized)) __obj.updateDynamic("isVirtualized")(isVirtualized.asInstanceOf[js.Any])
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (nodeContentRenderer != null) __obj.updateDynamic("nodeContentRenderer")(nodeContentRenderer.asInstanceOf[js.Any])
    if (onDragStateChanged != null) __obj.updateDynamic("onDragStateChanged")(js.Any.fromFunction1(onDragStateChanged))
    if (onMoveNode != null) __obj.updateDynamic("onMoveNode")(js.Any.fromFunction1(onMoveNode))
    if (onVisibilityToggle != null) __obj.updateDynamic("onVisibilityToggle")(js.Any.fromFunction1(onVisibilityToggle))
    if (!js.isUndefined(onlyExpandSearchedNodes)) __obj.updateDynamic("onlyExpandSearchedNodes")(onlyExpandSearchedNodes.asInstanceOf[js.Any])
    if (placeholderRenderer != null) __obj.updateDynamic("placeholderRenderer")(placeholderRenderer.asInstanceOf[js.Any])
    if (reactVirtualizedListProps != null) __obj.updateDynamic("reactVirtualizedListProps")(reactVirtualizedListProps.asInstanceOf[js.Any])
    if (rowDirection != null) __obj.updateDynamic("rowDirection")(rowDirection.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (scaffoldBlockPxWidth != null) __obj.updateDynamic("scaffoldBlockPxWidth")(scaffoldBlockPxWidth.asInstanceOf[js.Any])
    if (searchFinishCallback != null) __obj.updateDynamic("searchFinishCallback")(js.Any.fromFunction1(searchFinishCallback))
    if (searchFocusOffset != null) __obj.updateDynamic("searchFocusOffset")(searchFocusOffset.asInstanceOf[js.Any])
    if (searchMethod != null) __obj.updateDynamic("searchMethod")(js.Any.fromFunction1(searchMethod))
    if (searchQuery != null) __obj.updateDynamic("searchQuery")(searchQuery.asInstanceOf[js.Any])
    if (shouldCopyOnOutsideDrop != null) __obj.updateDynamic("shouldCopyOnOutsideDrop")(shouldCopyOnOutsideDrop.asInstanceOf[js.Any])
    if (slideRegionSize != null) __obj.updateDynamic("slideRegionSize")(slideRegionSize.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactSortableTreeProps
}

