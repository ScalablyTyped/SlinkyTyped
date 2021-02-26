package typingsSlinky.rcTree

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcTree.interfaceMod.DataEntity
import typingsSlinky.rcTree.interfaceMod.DataNode
import typingsSlinky.rcTree.interfaceMod.EventDataNode
import typingsSlinky.rcTree.interfaceMod.IconType
import typingsSlinky.rcTree.interfaceMod.Key
import typingsSlinky.rcTree.interfaceMod.NodeInstance
import typingsSlinky.rcTree.treeNodeMod.TreeNodeProps
import typingsSlinky.react.mod.Context
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextTypesMod {
  
  @JSImport("rc-tree/es/contextTypes", "TreeContext")
  @js.native
  val TreeContext: Context[TreeContextProps | Null] = js.native
  
  type NodeDragEventHandler[T] = js.Function2[/* e */ SyntheticMouseEvent[T], /* node */ NodeInstance, Unit]
  
  @js.native
  trait NodeDragEventParams[T] extends StObject {
    
    var event: SyntheticMouseEvent[T] = js.native
    
    var node: EventDataNode = js.native
  }
  object NodeDragEventParams {
    
    @scala.inline
    def apply[T](event: SyntheticMouseEvent[T], node: EventDataNode): NodeDragEventParams[T] = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeDragEventParams[T]]
    }
    
    @scala.inline
    implicit class NodeDragEventParamsMutableBuilder[Self <: NodeDragEventParams[_], T] (val x: Self with NodeDragEventParams[T]) extends AnyVal {
      
      @scala.inline
      def setEvent(value: SyntheticMouseEvent[T]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: EventDataNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  type NodeMouseEventHandler[T] = js.Function2[/* e */ SyntheticMouseEvent[T], /* node */ EventDataNode, Unit]
  
  @js.native
  trait NodeMouseEventParams[T] extends StObject {
    
    var event: SyntheticMouseEvent[T] = js.native
    
    var node: EventDataNode = js.native
  }
  object NodeMouseEventParams {
    
    @scala.inline
    def apply[T](event: SyntheticMouseEvent[T], node: EventDataNode): NodeMouseEventParams[T] = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeMouseEventParams[T]]
    }
    
    @scala.inline
    implicit class NodeMouseEventParamsMutableBuilder[Self <: NodeMouseEventParams[_], T] (val x: Self with NodeMouseEventParams[T]) extends AnyVal {
      
      @scala.inline
      def setEvent(value: SyntheticMouseEvent[T]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: EventDataNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TreeContextProps extends StObject {
    
    var checkStrictly: Boolean = js.native
    
    var checkable: Boolean | ReactElement = js.native
    
    var disabled: Boolean = js.native
    
    var draggable: Boolean = js.native
    
    def filterTreeNode(treeNode: EventDataNode): Boolean = js.native
    
    var icon: IconType = js.native
    
    var keyEntities: Record[Key, DataEntity] = js.native
    
    def loadData(treeNode: EventDataNode): js.Promise[Unit] = js.native
    
    def onNodeCheck(e: SyntheticMouseEvent[HTMLSpanElement], treeNode: EventDataNode, checked: Boolean): Unit = js.native
    
    var onNodeClick: NodeMouseEventHandler[HTMLSpanElement] = js.native
    
    var onNodeContextMenu: NodeMouseEventHandler[HTMLSpanElement] = js.native
    
    var onNodeDoubleClick: NodeMouseEventHandler[HTMLSpanElement] = js.native
    
    var onNodeDragEnd: NodeDragEventHandler[HTMLDivElement] = js.native
    
    var onNodeDragEnter: NodeDragEventHandler[HTMLDivElement] = js.native
    
    var onNodeDragLeave: NodeDragEventHandler[HTMLDivElement] = js.native
    
    var onNodeDragOver: NodeDragEventHandler[HTMLDivElement] = js.native
    
    var onNodeDragStart: NodeDragEventHandler[HTMLDivElement] = js.native
    
    var onNodeDrop: NodeDragEventHandler[HTMLDivElement] = js.native
    
    var onNodeExpand: NodeMouseEventHandler[HTMLSpanElement] = js.native
    
    def onNodeLoad(treeNode: EventDataNode): Unit = js.native
    
    var onNodeMouseEnter: NodeMouseEventHandler[HTMLSpanElement] = js.native
    
    var onNodeMouseLeave: NodeMouseEventHandler[HTMLSpanElement] = js.native
    
    var onNodeSelect: NodeMouseEventHandler[HTMLSpanElement] = js.native
    
    var prefixCls: String = js.native
    
    var selectable: Boolean = js.native
    
    var showIcon: Boolean = js.native
    
    var switcherIcon: IconType = js.native
    
    var titleRender: js.UndefOr[js.Function1[/* node */ DataNode, ReactElement]] = js.native
  }
  object TreeContextProps {
    
    @scala.inline
    def apply(
      checkStrictly: Boolean,
      disabled: Boolean,
      draggable: Boolean,
      filterTreeNode: EventDataNode => Boolean,
      keyEntities: Record[Key, DataEntity],
      loadData: EventDataNode => js.Promise[Unit],
      onNodeCheck: (SyntheticMouseEvent[HTMLSpanElement], EventDataNode, Boolean) => Unit,
      onNodeClick: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode) => Unit,
      onNodeContextMenu: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode) => Unit,
      onNodeDoubleClick: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode) => Unit,
      onNodeDragEnd: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit,
      onNodeDragEnter: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit,
      onNodeDragLeave: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit,
      onNodeDragOver: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit,
      onNodeDragStart: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit,
      onNodeDrop: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit,
      onNodeExpand: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode) => Unit,
      onNodeLoad: EventDataNode => Unit,
      onNodeMouseEnter: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode) => Unit,
      onNodeMouseLeave: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode) => Unit,
      onNodeSelect: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode) => Unit,
      prefixCls: String,
      selectable: Boolean,
      showIcon: Boolean
    ): TreeContextProps = {
      val __obj = js.Dynamic.literal(checkStrictly = checkStrictly.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], draggable = draggable.asInstanceOf[js.Any], filterTreeNode = js.Any.fromFunction1(filterTreeNode), keyEntities = keyEntities.asInstanceOf[js.Any], loadData = js.Any.fromFunction1(loadData), onNodeCheck = js.Any.fromFunction3(onNodeCheck), onNodeClick = js.Any.fromFunction2(onNodeClick), onNodeContextMenu = js.Any.fromFunction2(onNodeContextMenu), onNodeDoubleClick = js.Any.fromFunction2(onNodeDoubleClick), onNodeDragEnd = js.Any.fromFunction2(onNodeDragEnd), onNodeDragEnter = js.Any.fromFunction2(onNodeDragEnter), onNodeDragLeave = js.Any.fromFunction2(onNodeDragLeave), onNodeDragOver = js.Any.fromFunction2(onNodeDragOver), onNodeDragStart = js.Any.fromFunction2(onNodeDragStart), onNodeDrop = js.Any.fromFunction2(onNodeDrop), onNodeExpand = js.Any.fromFunction2(onNodeExpand), onNodeLoad = js.Any.fromFunction1(onNodeLoad), onNodeMouseEnter = js.Any.fromFunction2(onNodeMouseEnter), onNodeMouseLeave = js.Any.fromFunction2(onNodeMouseLeave), onNodeSelect = js.Any.fromFunction2(onNodeSelect), prefixCls = prefixCls.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], showIcon = showIcon.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeContextProps]
    }
    
    @scala.inline
    implicit class TreeContextPropsMutableBuilder[Self <: TreeContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckStrictly(value: Boolean): Self = StObject.set(x, "checkStrictly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckable(value: Boolean | ReactElement): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableReactElement(value: ReactElement): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTreeNode(value: EventDataNode => Boolean): Self = StObject.set(x, "filterTreeNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIcon(value: IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction1(value: /* props */ TreeNodeProps => ReactElement): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setKeyEntities(value: Record[Key, DataEntity]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadData(value: EventDataNode => js.Promise[Unit]): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNodeCheck(value: (SyntheticMouseEvent[HTMLSpanElement], EventDataNode, Boolean) => Unit): Self = StObject.set(x, "onNodeCheck", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnNodeClick(value: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode) => Unit): Self = StObject.set(x, "onNodeClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeContextMenu(value: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode) => Unit): Self = StObject.set(x, "onNodeContextMenu", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeDoubleClick(value: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode) => Unit): Self = StObject.set(x, "onNodeDoubleClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeDragEnd(value: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit): Self = StObject.set(x, "onNodeDragEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeDragEnter(value: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit): Self = StObject.set(x, "onNodeDragEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeDragLeave(value: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit): Self = StObject.set(x, "onNodeDragLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeDragOver(value: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit): Self = StObject.set(x, "onNodeDragOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeDragStart(value: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit): Self = StObject.set(x, "onNodeDragStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeDrop(value: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit): Self = StObject.set(x, "onNodeDrop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeExpand(value: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode) => Unit): Self = StObject.set(x, "onNodeExpand", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeLoad(value: EventDataNode => Unit): Self = StObject.set(x, "onNodeLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNodeMouseEnter(value: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode) => Unit): Self = StObject.set(x, "onNodeMouseEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeMouseLeave(value: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode) => Unit): Self = StObject.set(x, "onNodeMouseLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeSelect(value: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode) => Unit): Self = StObject.set(x, "onNodeSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIconFunction1(value: /* props */ TreeNodeProps => ReactElement): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSwitcherIconReactElement(value: ReactElement): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
      @scala.inline
      def setTitleRender(value: /* node */ DataNode => ReactElement): Self = StObject.set(x, "titleRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleRenderUndefined: Self = StObject.set(x, "titleRender", js.undefined)
    }
  }
}
