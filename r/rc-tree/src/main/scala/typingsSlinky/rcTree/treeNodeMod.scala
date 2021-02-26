package typingsSlinky.rcTree

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcTree.anon.DragNodeHighlight
import typingsSlinky.rcTree.contextTypesMod.TreeContextProps
import typingsSlinky.rcTree.interfaceMod.DataNode
import typingsSlinky.rcTree.interfaceMod.IconType
import typingsSlinky.rcTree.interfaceMod.Key
import typingsSlinky.rcTree.rcTreeStrings.close
import typingsSlinky.rcTree.rcTreeStrings.open
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeNodeMod extends Shortcut {
  
  @JSImport("rc-tree/es/TreeNode", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TreeNodeProps] = js.native
  
  @JSImport("rc-tree/es/TreeNode", "InternalTreeNode")
  @js.native
  class InternalTreeNode protected ()
    extends Component[InternalTreeNodeProps, TreeNodeState, js.Any] {
    def this(props: InternalTreeNodeProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InternalTreeNodeProps, context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MInternalTreeNode(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MInternalTreeNode(): Unit = js.native
    
    def getNodeState(): open | close = js.native
    
    def hasChildren(): Boolean = js.native
    
    def isCheckable(): js.Object = js.native
    
    def isDisabled(): Boolean = js.native
    
    def isLeaf(): Boolean = js.native
    
    def isSelectable(): Boolean = js.native
    
    def onCheck(e: SyntheticMouseEvent[HTMLSpanElement]): Unit = js.native
    
    def onContextMenu(e: SyntheticMouseEvent[HTMLSpanElement]): Unit = js.native
    
    def onDragEnd(e: DragEvent[HTMLDivElement]): Unit = js.native
    
    def onDragEnter(e: DragEvent[HTMLDivElement]): Unit = js.native
    
    def onDragLeave(e: DragEvent[HTMLDivElement]): Unit = js.native
    
    def onDragOver(e: DragEvent[HTMLDivElement]): Unit = js.native
    
    def onDragStart(e: DragEvent[HTMLDivElement]): Unit = js.native
    
    def onDrop(e: DragEvent[HTMLDivElement]): Unit = js.native
    
    var onExpand: MouseEventHandler[HTMLDivElement] = js.native
    
    def onMouseEnter(e: SyntheticMouseEvent[HTMLSpanElement]): Unit = js.native
    
    def onMouseLeave(e: SyntheticMouseEvent[HTMLSpanElement]): Unit = js.native
    
    def onSelect(e: SyntheticMouseEvent[HTMLSpanElement]): Unit = js.native
    
    def onSelectorClick(e: SyntheticMouseEvent[HTMLSpanElement]): Unit = js.native
    
    def onSelectorDoubleClick(e: SyntheticMouseEvent[HTMLSpanElement]): Unit = js.native
    
    def renderCheckbox(): ReactElement = js.native
    
    def renderIcon(): ReactElement = js.native
    
    def renderSelector(): ReactElement = js.native
    
    def renderSwitcher(): ReactElement = js.native
    
    var selectHandle: HTMLSpanElement = js.native
    
    def setSelectHandle(node: js.Any): Unit = js.native
    
    @JSName("state")
    var state_InternalTreeNode: DragNodeHighlight = js.native
    
    def syncLoadData(props: js.Any): Unit = js.native
  }
  
  @js.native
  trait InternalTreeNodeProps extends TreeNodeProps {
    
    var context: js.UndefOr[TreeContextProps] = js.native
  }
  object InternalTreeNodeProps {
    
    @scala.inline
    def apply(): InternalTreeNodeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalTreeNodeProps]
    }
    
    @scala.inline
    implicit class InternalTreeNodePropsMutableBuilder[Self <: InternalTreeNodeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: TreeContextProps): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    }
  }
  
  @js.native
  trait TreeNodeProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var checkable: js.UndefOr[Boolean] = js.native
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    /** New added in Tree for easy data access */
    var data: js.UndefOr[DataNode] = js.native
    
    var disableCheckbox: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var domRef: js.UndefOr[Ref[HTMLDivElement]] = js.native
    
    var dragOver: js.UndefOr[Boolean] = js.native
    
    var dragOverGapBottom: js.UndefOr[Boolean] = js.native
    
    var dragOverGapTop: js.UndefOr[Boolean] = js.native
    
    var eventKey: js.UndefOr[Key] = js.native
    
    var expanded: js.UndefOr[Boolean] = js.native
    
    var halfChecked: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[IconType] = js.native
    
    var isEnd: js.UndefOr[js.Array[Boolean]] = js.native
    
    var isLeaf: js.UndefOr[Boolean] = js.native
    
    var isStart: js.UndefOr[js.Array[Boolean]] = js.native
    
    var loaded: js.UndefOr[Boolean] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var pos: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var selectable: js.UndefOr[Boolean] = js.native
    
    var selected: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var switcherIcon: js.UndefOr[IconType] = js.native
    
    var title: js.UndefOr[ReactElement | (js.Function1[/* data */ DataNode, ReactElement])] = js.native
  }
  object TreeNodeProps {
    
    @scala.inline
    def apply(): TreeNodeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeNodeProps]
    }
    
    @scala.inline
    implicit class TreeNodePropsMutableBuilder[Self <: TreeNodeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setData(value: DataNode): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCheckboxUndefined: Self = StObject.set(x, "disableCheckbox", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDomRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "domRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "domRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDomRefNull: Self = StObject.set(x, "domRef", null)
      
      @scala.inline
      def setDomRefRefObject(value: ReactRef[HTMLDivElement]): Self = StObject.set(x, "domRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomRefUndefined: Self = StObject.set(x, "domRef", js.undefined)
      
      @scala.inline
      def setDragOver(value: Boolean): Self = StObject.set(x, "dragOver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOverGapBottom(value: Boolean): Self = StObject.set(x, "dragOverGapBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOverGapBottomUndefined: Self = StObject.set(x, "dragOverGapBottom", js.undefined)
      
      @scala.inline
      def setDragOverGapTop(value: Boolean): Self = StObject.set(x, "dragOverGapTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOverGapTopUndefined: Self = StObject.set(x, "dragOverGapTop", js.undefined)
      
      @scala.inline
      def setDragOverUndefined: Self = StObject.set(x, "dragOver", js.undefined)
      
      @scala.inline
      def setEventKey(value: Key): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setHalfChecked(value: Boolean): Self = StObject.set(x, "halfChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCheckedUndefined: Self = StObject.set(x, "halfChecked", js.undefined)
      
      @scala.inline
      def setIcon(value: IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction1(value: /* props */ TreeNodeProps => ReactElement): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIsEnd(value: js.Array[Boolean]): Self = StObject.set(x, "isEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEndUndefined: Self = StObject.set(x, "isEnd", js.undefined)
      
      @scala.inline
      def setIsEndVarargs(value: Boolean*): Self = StObject.set(x, "isEnd", js.Array(value :_*))
      
      @scala.inline
      def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
      
      @scala.inline
      def setIsStart(value: js.Array[Boolean]): Self = StObject.set(x, "isStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStartUndefined: Self = StObject.set(x, "isStart", js.undefined)
      
      @scala.inline
      def setIsStartVarargs(value: Boolean*): Self = StObject.set(x, "isStart", js.Array(value :_*))
      
      @scala.inline
      def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosUndefined: Self = StObject.set(x, "pos", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIconFunction1(value: /* props */ TreeNodeProps => ReactElement): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSwitcherIconReactElement(value: ReactElement): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement | (js.Function1[/* data */ DataNode, ReactElement])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction1(value: /* data */ DataNode => ReactElement): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait TreeNodeState extends StObject {
    
    var dragNodeHighlight: Boolean = js.native
  }
  object TreeNodeState {
    
    @scala.inline
    def apply(dragNodeHighlight: Boolean): TreeNodeState = {
      val __obj = js.Dynamic.literal(dragNodeHighlight = dragNodeHighlight.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeNodeState]
    }
    
    @scala.inline
    implicit class TreeNodeStateMutableBuilder[Self <: TreeNodeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDragNodeHighlight(value: Boolean): Self = StObject.set(x, "dragNodeHighlight", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[TreeNodeProps]
  
  /* This means you don't have to write `default`, but can instead just say `treeNodeMod.foo` */
  override def _to: ReactComponentClass[TreeNodeProps] = default
}
