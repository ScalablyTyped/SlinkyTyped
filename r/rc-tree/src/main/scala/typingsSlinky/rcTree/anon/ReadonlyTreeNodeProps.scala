package typingsSlinky.rcTree.anon

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcTree.interfaceMod.DataNode
import typingsSlinky.rcTree.interfaceMod.IconType
import typingsSlinky.rcTree.treeNodeMod.TreeNodeProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<rc-tree.rc-tree/es/TreeNode.TreeNodeProps> */
@js.native
trait ReadonlyTreeNodeProps extends js.Object {
  
  val active: js.UndefOr[Boolean] = js.native
  
  val checkable: js.UndefOr[Boolean] = js.native
  
  val checked: js.UndefOr[Boolean] = js.native
  
  val children: js.UndefOr[ReactElement] = js.native
  
  val className: js.UndefOr[String] = js.native
  
  val data: js.UndefOr[DataNode] = js.native
  
  val disableCheckbox: js.UndefOr[Boolean] = js.native
  
  val disabled: js.UndefOr[Boolean] = js.native
  
  val domRef: js.UndefOr[Ref[HTMLDivElement]] = js.native
  
  val dragOver: js.UndefOr[Boolean] = js.native
  
  val dragOverGapBottom: js.UndefOr[Boolean] = js.native
  
  val dragOverGapTop: js.UndefOr[Boolean] = js.native
  
  val eventKey: js.UndefOr[typingsSlinky.rcTree.interfaceMod.Key] = js.native
  
  val expanded: js.UndefOr[Boolean] = js.native
  
  val halfChecked: js.UndefOr[Boolean] = js.native
  
  val icon: js.UndefOr[IconType] = js.native
  
  val isEnd: js.UndefOr[js.Array[Boolean]] = js.native
  
  val isLeaf: js.UndefOr[Boolean] = js.native
  
  val isStart: js.UndefOr[js.Array[Boolean]] = js.native
  
  val loaded: js.UndefOr[Boolean] = js.native
  
  val loading: js.UndefOr[Boolean] = js.native
  
  val onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  val pos: js.UndefOr[String] = js.native
  
  val prefixCls: js.UndefOr[String] = js.native
  
  val selectable: js.UndefOr[Boolean] = js.native
  
  val selected: js.UndefOr[Boolean] = js.native
  
  val style: js.UndefOr[CSSProperties] = js.native
  
  val switcherIcon: js.UndefOr[IconType] = js.native
  
  val title: js.UndefOr[ReactElement | (js.Function1[/* data */ DataNode, ReactElement])] = js.native
}
object ReadonlyTreeNodeProps {
  
  @scala.inline
  def apply(): ReadonlyTreeNodeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyTreeNodeProps]
  }
  
  @scala.inline
  implicit class ReadonlyTreeNodePropsOps[Self <: ReadonlyTreeNodeProps] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setCheckable(value: Boolean): Self = this.set("checkable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckable: Self = this.set("checkable", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setData(value: DataNode): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDisableCheckbox(value: Boolean): Self = this.set("disableCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableCheckbox: Self = this.set("disableCheckbox", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDomRefRefObject(value: ReactRef[HTMLDivElement]): Self = this.set("domRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = this.set("domRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDomRef(value: Ref[HTMLDivElement]): Self = this.set("domRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomRef: Self = this.set("domRef", js.undefined)
    
    @scala.inline
    def setDomRefNull: Self = this.set("domRef", null)
    
    @scala.inline
    def setDragOver(value: Boolean): Self = this.set("dragOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragOver: Self = this.set("dragOver", js.undefined)
    
    @scala.inline
    def setDragOverGapBottom(value: Boolean): Self = this.set("dragOverGapBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragOverGapBottom: Self = this.set("dragOverGapBottom", js.undefined)
    
    @scala.inline
    def setDragOverGapTop(value: Boolean): Self = this.set("dragOverGapTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragOverGapTop: Self = this.set("dragOverGapTop", js.undefined)
    
    @scala.inline
    def setEventKey(value: typingsSlinky.rcTree.interfaceMod.Key): Self = this.set("eventKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventKey: Self = this.set("eventKey", js.undefined)
    
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    
    @scala.inline
    def setHalfChecked(value: Boolean): Self = this.set("halfChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHalfChecked: Self = this.set("halfChecked", js.undefined)
    
    @scala.inline
    def setIconReactElement(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconFunction1(value: /* props */ TreeNodeProps => ReactElement): Self = this.set("icon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIcon(value: IconType): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIsEndVarargs(value: Boolean*): Self = this.set("isEnd", js.Array(value :_*))
    
    @scala.inline
    def setIsEnd(value: js.Array[Boolean]): Self = this.set("isEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnd: Self = this.set("isEnd", js.undefined)
    
    @scala.inline
    def setIsLeaf(value: Boolean): Self = this.set("isLeaf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLeaf: Self = this.set("isLeaf", js.undefined)
    
    @scala.inline
    def setIsStartVarargs(value: Boolean*): Self = this.set("isStart", js.Array(value :_*))
    
    @scala.inline
    def setIsStart(value: js.Array[Boolean]): Self = this.set("isStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsStart: Self = this.set("isStart", js.undefined)
    
    @scala.inline
    def setLoaded(value: Boolean): Self = this.set("loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoaded: Self = this.set("loaded", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    
    @scala.inline
    def setPos(value: String): Self = this.set("pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePos: Self = this.set("pos", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSwitcherIconReactElement(value: ReactElement): Self = this.set("switcherIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitcherIconFunction1(value: /* props */ TreeNodeProps => ReactElement): Self = this.set("switcherIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSwitcherIcon(value: IconType): Self = this.set("switcherIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwitcherIcon: Self = this.set("switcherIcon", js.undefined)
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFunction1(value: /* data */ DataNode => ReactElement): Self = this.set("title", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitle(value: ReactElement | (js.Function1[/* data */ DataNode, ReactElement])): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
