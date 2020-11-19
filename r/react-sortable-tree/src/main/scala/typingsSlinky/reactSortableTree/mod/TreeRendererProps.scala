package typingsSlinky.reactSortableTree.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactDnd.connectorsMod.ConnectDropTarget
import typingsSlinky.reactDnd.connectorsMod.ConnectableElement
import typingsSlinky.reactSortableTree.reactSortableTreeStrings.ltr
import typingsSlinky.reactSortableTree.reactSortableTreeStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeRendererProps extends js.Object {
  
  var canDrop: js.UndefOr[Boolean] = js.native
  
  var children: js.Array[ReactElement] = js.native
  
  // Drop target
  var connectDropTarget: ConnectDropTarget = js.native
  
  var draggedNode: js.UndefOr[TreeItem] = js.native
  
  // used in dndManager
  def getPrevRow(): FlatDataItem | Null = js.native
  
  var isOver: Boolean = js.native
  
  var listIndex: Double = js.native
  
  var lowerSiblingCounts: js.Array[Double] = js.native
  
  var node: TreeItem = js.native
  
  var path: NumberOrStringArray = js.native
  
  var rowDirection: js.UndefOr[ltr | rtl] = js.native
  
  var scaffoldBlockPxWidth: Double = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var swapDepth: js.UndefOr[Double] = js.native
  
  var swapFrom: js.UndefOr[Double] = js.native
  
  var swapLength: js.UndefOr[Double] = js.native
  
  var treeId: String = js.native
  
  var treeIndex: Double = js.native
}
object TreeRendererProps {
  
  @scala.inline
  def apply(
    children: js.Array[ReactElement],
    connectDropTarget: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[js.Any]) => ReactElement | Null,
    getPrevRow: () => FlatDataItem | Null,
    isOver: Boolean,
    listIndex: Double,
    lowerSiblingCounts: js.Array[Double],
    node: TreeItem,
    path: NumberOrStringArray,
    scaffoldBlockPxWidth: Double,
    treeId: String,
    treeIndex: Double
  ): TreeRendererProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], connectDropTarget = js.Any.fromFunction2(connectDropTarget), getPrevRow = js.Any.fromFunction0(getPrevRow), isOver = isOver.asInstanceOf[js.Any], listIndex = listIndex.asInstanceOf[js.Any], lowerSiblingCounts = lowerSiblingCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scaffoldBlockPxWidth = scaffoldBlockPxWidth.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeRendererProps]
  }
  
  @scala.inline
  implicit class TreeRendererPropsOps[Self <: TreeRendererProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildrenVarargs(value: ReactElement*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ReactElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectDropTarget(
      value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[js.Any]) => ReactElement | Null
    ): Self = this.set("connectDropTarget", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetPrevRow(value: () => FlatDataItem | Null): Self = this.set("getPrevRow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOver(value: Boolean): Self = this.set("isOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListIndex(value: Double): Self = this.set("listIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerSiblingCountsVarargs(value: Double*): Self = this.set("lowerSiblingCounts", js.Array(value :_*))
    
    @scala.inline
    def setLowerSiblingCounts(value: js.Array[Double]): Self = this.set("lowerSiblingCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: TreeItem): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: (String | Double)*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: NumberOrStringArray): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaffoldBlockPxWidth(value: Double): Self = this.set("scaffoldBlockPxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeId(value: String): Self = this.set("treeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeIndex(value: Double): Self = this.set("treeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanDrop(value: Boolean): Self = this.set("canDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanDrop: Self = this.set("canDrop", js.undefined)
    
    @scala.inline
    def setDraggedNode(value: TreeItem): Self = this.set("draggedNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggedNode: Self = this.set("draggedNode", js.undefined)
    
    @scala.inline
    def setRowDirection(value: ltr | rtl): Self = this.set("rowDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowDirection: Self = this.set("rowDirection", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSwapDepth(value: Double): Self = this.set("swapDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwapDepth: Self = this.set("swapDepth", js.undefined)
    
    @scala.inline
    def setSwapFrom(value: Double): Self = this.set("swapFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwapFrom: Self = this.set("swapFrom", js.undefined)
    
    @scala.inline
    def setSwapLength(value: Double): Self = this.set("swapLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwapLength: Self = this.set("swapLength", js.undefined)
  }
}
