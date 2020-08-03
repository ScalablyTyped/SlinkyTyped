package typingsSlinky.rcTree.contextTypesMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcTree.interfaceMod.DataEntity
import typingsSlinky.rcTree.interfaceMod.DataNode
import typingsSlinky.rcTree.interfaceMod.EventDataNode
import typingsSlinky.rcTree.interfaceMod.IconType
import typingsSlinky.rcTree.interfaceMod.Key
import typingsSlinky.rcTree.interfaceMod.NodeInstance
import typingsSlinky.rcTree.treeNodeMod.TreeNodeProps
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeContextProps extends js.Object {
  var checkStrictly: Boolean
  var checkable: Boolean | ReactElement
  var disabled: Boolean
  var draggable: Boolean
  var icon: IconType
  var keyEntities: Record[Key, DataEntity]
  var onNodeClick: NodeMouseEventHandler
  var onNodeContextMenu: NodeMouseEventHandler
  var onNodeDoubleClick: NodeMouseEventHandler
  var onNodeDragEnd: NodeDragEventHandler
  var onNodeDragEnter: NodeDragEventHandler
  var onNodeDragLeave: NodeDragEventHandler
  var onNodeDragOver: NodeDragEventHandler
  var onNodeDragStart: NodeDragEventHandler
  var onNodeDrop: NodeDragEventHandler
  var onNodeExpand: NodeMouseEventHandler
  var onNodeMouseEnter: NodeMouseEventHandler
  var onNodeMouseLeave: NodeMouseEventHandler
  var onNodeSelect: NodeMouseEventHandler
  var prefixCls: String
  var selectable: Boolean
  var showIcon: Boolean
  var switcherIcon: IconType
  var titleRender: js.UndefOr[js.Function1[/* node */ DataNode, ReactElement]] = js.undefined
  def filterTreeNode(treeNode: EventDataNode): Boolean
  def loadData(treeNode: EventDataNode): js.Promise[Unit]
  def onNodeCheck(e: SyntheticMouseEvent[HTMLDivElement], treeNode: EventDataNode, checked: Boolean): Unit
  def onNodeLoad(treeNode: EventDataNode): Unit
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
    onNodeCheck: (SyntheticMouseEvent[HTMLDivElement], EventDataNode, Boolean) => Unit,
    onNodeClick: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ EventDataNode) => Unit,
    onNodeContextMenu: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ EventDataNode) => Unit,
    onNodeDoubleClick: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ EventDataNode) => Unit,
    onNodeDragEnd: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit,
    onNodeDragEnter: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit,
    onNodeDragLeave: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit,
    onNodeDragOver: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit,
    onNodeDragStart: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit,
    onNodeDrop: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit,
    onNodeExpand: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ EventDataNode) => Unit,
    onNodeLoad: EventDataNode => Unit,
    onNodeMouseEnter: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ EventDataNode) => Unit,
    onNodeMouseLeave: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ EventDataNode) => Unit,
    onNodeSelect: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ EventDataNode) => Unit,
    prefixCls: String,
    selectable: Boolean,
    showIcon: Boolean
  ): TreeContextProps = {
    val __obj = js.Dynamic.literal(checkStrictly = checkStrictly.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], draggable = draggable.asInstanceOf[js.Any], filterTreeNode = js.Any.fromFunction1(filterTreeNode), keyEntities = keyEntities.asInstanceOf[js.Any], loadData = js.Any.fromFunction1(loadData), onNodeCheck = js.Any.fromFunction3(onNodeCheck), onNodeClick = js.Any.fromFunction2(onNodeClick), onNodeContextMenu = js.Any.fromFunction2(onNodeContextMenu), onNodeDoubleClick = js.Any.fromFunction2(onNodeDoubleClick), onNodeDragEnd = js.Any.fromFunction2(onNodeDragEnd), onNodeDragEnter = js.Any.fromFunction2(onNodeDragEnter), onNodeDragLeave = js.Any.fromFunction2(onNodeDragLeave), onNodeDragOver = js.Any.fromFunction2(onNodeDragOver), onNodeDragStart = js.Any.fromFunction2(onNodeDragStart), onNodeDrop = js.Any.fromFunction2(onNodeDrop), onNodeExpand = js.Any.fromFunction2(onNodeExpand), onNodeLoad = js.Any.fromFunction1(onNodeLoad), onNodeMouseEnter = js.Any.fromFunction2(onNodeMouseEnter), onNodeMouseLeave = js.Any.fromFunction2(onNodeMouseLeave), onNodeSelect = js.Any.fromFunction2(onNodeSelect), prefixCls = prefixCls.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], showIcon = showIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeContextProps]
  }
  @scala.inline
  implicit class TreeContextPropsOps[Self <: TreeContextProps] (val x: Self) extends AnyVal {
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
    def setCheckStrictly(value: Boolean): Self = this.set("checkStrictly", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterTreeNode(value: EventDataNode => Boolean): Self = this.set("filterTreeNode", js.Any.fromFunction1(value))
    @scala.inline
    def setKeyEntities(value: Record[Key, DataEntity]): Self = this.set("keyEntities", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadData(value: EventDataNode => js.Promise[Unit]): Self = this.set("loadData", js.Any.fromFunction1(value))
    @scala.inline
    def setOnNodeCheck(value: (SyntheticMouseEvent[HTMLDivElement], EventDataNode, Boolean) => Unit): Self = this.set("onNodeCheck", js.Any.fromFunction3(value))
    @scala.inline
    def setOnNodeClick(value: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ EventDataNode) => Unit): Self = this.set("onNodeClick", js.Any.fromFunction2(value))
    @scala.inline
    def setOnNodeContextMenu(value: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ EventDataNode) => Unit): Self = this.set("onNodeContextMenu", js.Any.fromFunction2(value))
    @scala.inline
    def setOnNodeDoubleClick(value: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ EventDataNode) => Unit): Self = this.set("onNodeDoubleClick", js.Any.fromFunction2(value))
    @scala.inline
    def setOnNodeDragEnd(value: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit): Self = this.set("onNodeDragEnd", js.Any.fromFunction2(value))
    @scala.inline
    def setOnNodeDragEnter(value: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit): Self = this.set("onNodeDragEnter", js.Any.fromFunction2(value))
    @scala.inline
    def setOnNodeDragLeave(value: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit): Self = this.set("onNodeDragLeave", js.Any.fromFunction2(value))
    @scala.inline
    def setOnNodeDragOver(value: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit): Self = this.set("onNodeDragOver", js.Any.fromFunction2(value))
    @scala.inline
    def setOnNodeDragStart(value: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit): Self = this.set("onNodeDragStart", js.Any.fromFunction2(value))
    @scala.inline
    def setOnNodeDrop(value: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ NodeInstance) => Unit): Self = this.set("onNodeDrop", js.Any.fromFunction2(value))
    @scala.inline
    def setOnNodeExpand(value: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ EventDataNode) => Unit): Self = this.set("onNodeExpand", js.Any.fromFunction2(value))
    @scala.inline
    def setOnNodeLoad(value: EventDataNode => Unit): Self = this.set("onNodeLoad", js.Any.fromFunction1(value))
    @scala.inline
    def setOnNodeMouseEnter(value: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ EventDataNode) => Unit): Self = this.set("onNodeMouseEnter", js.Any.fromFunction2(value))
    @scala.inline
    def setOnNodeMouseLeave(value: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ EventDataNode) => Unit): Self = this.set("onNodeMouseLeave", js.Any.fromFunction2(value))
    @scala.inline
    def setOnNodeSelect(value: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* node */ EventDataNode) => Unit): Self = this.set("onNodeSelect", js.Any.fromFunction2(value))
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowIcon(value: Boolean): Self = this.set("showIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckableReactElement(value: ReactElement): Self = this.set("checkable", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckable(value: Boolean | ReactElement): Self = this.set("checkable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckable: Self = this.set("checkable", js.undefined)
    @scala.inline
    def setIconReactElement(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconFunction1(value: /* props */ TreeNodeProps => ReactElement): Self = this.set("icon", js.Any.fromFunction1(value))
    @scala.inline
    def setIcon(value: IconType): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setSwitcherIconReactElement(value: ReactElement): Self = this.set("switcherIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwitcherIconFunction1(value: /* props */ TreeNodeProps => ReactElement): Self = this.set("switcherIcon", js.Any.fromFunction1(value))
    @scala.inline
    def setSwitcherIcon(value: IconType): Self = this.set("switcherIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwitcherIcon: Self = this.set("switcherIcon", js.undefined)
    @scala.inline
    def setTitleRender(value: /* node */ DataNode => ReactElement): Self = this.set("titleRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTitleRender: Self = this.set("titleRender", js.undefined)
  }
  
}

