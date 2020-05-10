package typingsSlinky.reactSortableTree.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactSortableTree.PartialListProps
import typingsSlinky.reactSortableTree.mod.ExtendedNodeData
import typingsSlinky.reactSortableTree.mod.FullTree
import typingsSlinky.reactSortableTree.mod.NodeData
import typingsSlinky.reactSortableTree.mod.NodeRenderer
import typingsSlinky.reactSortableTree.mod.NodeRendererProps
import typingsSlinky.reactSortableTree.mod.OnDragPreviousAndNextLocation
import typingsSlinky.reactSortableTree.mod.OnDragStateChangedData
import typingsSlinky.reactSortableTree.mod.OnMovePreviousAndNextLocation
import typingsSlinky.reactSortableTree.mod.OnVisibilityToggleData
import typingsSlinky.reactSortableTree.mod.PlaceholderRenderer
import typingsSlinky.reactSortableTree.mod.PlaceholderRendererProps
import typingsSlinky.reactSortableTree.mod.SearchData
import typingsSlinky.reactSortableTree.mod.ShouldCopyData
import typingsSlinky.reactSortableTree.mod.ThemeProps
import typingsSlinky.reactSortableTree.mod.TreeIndex
import typingsSlinky.reactSortableTree.mod.TreeItem
import typingsSlinky.reactSortableTree.mod.TreeNode
import typingsSlinky.reactSortableTree.reactSortableTreeStrings.ltr
import typingsSlinky.reactSortableTree.reactSortableTreeStrings.rtl
import typingsSlinky.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_ReactSortableTreeProps1293311059[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def canDragFunction1(value: /* data */ ExtendedNodeData => Boolean): this.type = set("canDrag", js.Any.fromFunction1(value))
  @scala.inline
  def canDrag(value: (js.Function1[/* data */ ExtendedNodeData, Boolean]) | Boolean): this.type = set("canDrag", value.asInstanceOf[js.Any])
  @scala.inline
  def canDrop(value: /* data */ OnDragPreviousAndNextLocation with NodeData => Boolean): this.type = set("canDrop", js.Any.fromFunction1(value))
  @scala.inline
  def canNodeHaveChildren(value: /* node */ TreeItem => Boolean): this.type = set("canNodeHaveChildren", js.Any.fromFunction1(value))
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def dndType(value: String): this.type = set("dndType", value.asInstanceOf[js.Any])
  @scala.inline
  def generateNodeProps(value: /* data */ ExtendedNodeData => StringDictionary[_]): this.type = set("generateNodeProps", js.Any.fromFunction1(value))
  @scala.inline
  def getNodeKey(value: /* data */ TreeNode with TreeIndex => String | Double): this.type = set("getNodeKey", js.Any.fromFunction1(value))
  @scala.inline
  def innerStyle(value: CSSProperties): this.type = set("innerStyle", value.asInstanceOf[js.Any])
  @scala.inline
  def isVirtualized(value: Boolean): this.type = set("isVirtualized", value.asInstanceOf[js.Any])
  @scala.inline
  def maxDepth(value: Double): this.type = set("maxDepth", value.asInstanceOf[js.Any])
  @scala.inline
  def nodeContentRendererFunctionComponent(value: ReactComponentClass[NodeRendererProps]): this.type = set("nodeContentRenderer", value.asInstanceOf[js.Any])
  @scala.inline
  def nodeContentRendererComponentClass(value: ReactComponentClass[NodeRendererProps]): this.type = set("nodeContentRenderer", value.asInstanceOf[js.Any])
  @scala.inline
  def nodeContentRenderer(value: NodeRenderer): this.type = set("nodeContentRenderer", value.asInstanceOf[js.Any])
  @scala.inline
  def onDragStateChanged(value: /* data */ OnDragStateChangedData => Unit): this.type = set("onDragStateChanged", js.Any.fromFunction1(value))
  @scala.inline
  def onMoveNode(value: /* data */ NodeData with FullTree with OnMovePreviousAndNextLocation => Unit): this.type = set("onMoveNode", js.Any.fromFunction1(value))
  @scala.inline
  def onVisibilityToggle(value: /* data */ OnVisibilityToggleData => Unit): this.type = set("onVisibilityToggle", js.Any.fromFunction1(value))
  @scala.inline
  def onlyExpandSearchedNodes(value: Boolean): this.type = set("onlyExpandSearchedNodes", value.asInstanceOf[js.Any])
  @scala.inline
  def placeholderRendererFunctionComponent(value: ReactComponentClass[PlaceholderRendererProps]): this.type = set("placeholderRenderer", value.asInstanceOf[js.Any])
  @scala.inline
  def placeholderRendererComponentClass(value: ReactComponentClass[PlaceholderRendererProps]): this.type = set("placeholderRenderer", value.asInstanceOf[js.Any])
  @scala.inline
  def placeholderRenderer(value: PlaceholderRenderer): this.type = set("placeholderRenderer", value.asInstanceOf[js.Any])
  @scala.inline
  def reactVirtualizedListProps(value: PartialListProps): this.type = set("reactVirtualizedListProps", value.asInstanceOf[js.Any])
  @scala.inline
  def rowDirection(value: ltr | rtl): this.type = set("rowDirection", value.asInstanceOf[js.Any])
  @scala.inline
  def rowHeightFunction1(value: /* info */ Index => Double): this.type = set("rowHeight", js.Any.fromFunction1(value))
  @scala.inline
  def rowHeight(value: (js.Function1[/* info */ Index, Double]) | Double): this.type = set("rowHeight", value.asInstanceOf[js.Any])
  @scala.inline
  def scaffoldBlockPxWidth(value: Double): this.type = set("scaffoldBlockPxWidth", value.asInstanceOf[js.Any])
  @scala.inline
  def searchFinishCallback(value: /* matches */ js.Array[NodeData] => Unit): this.type = set("searchFinishCallback", js.Any.fromFunction1(value))
  @scala.inline
  def searchFocusOffset(value: Double): this.type = set("searchFocusOffset", value.asInstanceOf[js.Any])
  @scala.inline
  def searchMethod(value: /* data */ SearchData => Boolean): this.type = set("searchMethod", js.Any.fromFunction1(value))
  @scala.inline
  def searchQuery(value: String | js.Any): this.type = set("searchQuery", value.asInstanceOf[js.Any])
  @scala.inline
  def shouldCopyOnOutsideDropFunction1(value: /* data */ ShouldCopyData => Boolean): this.type = set("shouldCopyOnOutsideDrop", js.Any.fromFunction1(value))
  @scala.inline
  def shouldCopyOnOutsideDrop(value: Boolean | (js.Function1[/* data */ ShouldCopyData, Boolean])): this.type = set("shouldCopyOnOutsideDrop", value.asInstanceOf[js.Any])
  @scala.inline
  def slideRegionSize(value: Double): this.type = set("slideRegionSize", value.asInstanceOf[js.Any])
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  @scala.inline
  def theme(value: ThemeProps): this.type = set("theme", value.asInstanceOf[js.Any])
}

