package typingsSlinky.antd.treeTreeMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.anon.Checked
import typingsSlinky.antd.anon.ShowLeafIcon
import typingsSlinky.rcTree.anon.DragNode
import typingsSlinky.rcTree.anon.Event
import typingsSlinky.rcTree.anon.EventNode
import typingsSlinky.rcTree.anon.Expanded
import typingsSlinky.rcTree.anon.ExpandedKeys
import typingsSlinky.rcTree.anon.Node
import typingsSlinky.rcTree.interfaceMod.DataNode
import typingsSlinky.rcTree.interfaceMod.EventDataNode
import typingsSlinky.rcTree.interfaceMod.Key
import typingsSlinky.rcTree.treeMod.CheckInfo
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.KeyboardEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<rc-tree.rc-tree.TreeProps, 'prefixCls' | 'showLine'> */
@js.native
trait TreeProps extends js.Object {
  
  /** 是否自动展开父节点 */
  var autoExpandParent: js.UndefOr[Boolean] = js.native
  
  var blockNode: js.UndefOr[Boolean] = js.native
  
  /** checkable状态下节点选择完全受控（父子节点选中状态不再关联） */
  var checkStrictly: js.UndefOr[Boolean] = js.native
  
  /** 是否支持选中 */
  var checkable: js.UndefOr[Boolean] = js.native
  
  /** （受控）选中复选框的树节点 */
  var checkedKeys: js.UndefOr[js.Array[Key] | Checked] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  /** 默认选中复选框的树节点 */
  var defaultCheckedKeys: js.UndefOr[js.Array[Key]] = js.native
  
  /** 默认展开所有树节点 */
  var defaultExpandAll: js.UndefOr[Boolean] = js.native
  
  /** 默认展开对应树节点 */
  var defaultExpandParent: js.UndefOr[Boolean] = js.native
  
  /** 默认展开指定的树节点 */
  var defaultExpandedKeys: js.UndefOr[js.Array[Key]] = js.native
  
  /** 默认选中的树节点 */
  var defaultSelectedKeys: js.UndefOr[js.Array[Key]] = js.native
  
  /** 是否禁用树 */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** 设置节点可拖拽（IE>8） */
  var draggable: js.UndefOr[Boolean] = js.native
  
  /** （受控）展开指定的树节点 */
  var expandedKeys: js.UndefOr[js.Array[Key]] = js.native
  
  /** 点击树节点触发 */
  var filterAntTreeNode: js.UndefOr[js.Function1[ReactComponentClass[AntTreeNodeProps], Boolean]] = js.native
  
  var filterTreeNode: js.UndefOr[js.Function1[/* treeNode */ EventDataNode, Boolean]] = js.native
  
  var focusable: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var icon: js.UndefOr[
    (js.Function1[/* nodeProps */ AntdTreeNodeAttribute, ReactElement]) | ReactElement
  ] = js.native
  
  var itemHeight: js.UndefOr[Double] = js.native
  
  var loadData: js.UndefOr[js.Function1[/* treeNode */ EventDataNode, js.Promise[Unit]]] = js.native
  
  var loadedKeys: js.UndefOr[js.Array[Key]] = js.native
  
  var motion: js.UndefOr[js.Any] = js.native
  
  /** 是否支持多选 */
  var multiple: js.UndefOr[Boolean] = js.native
  
  var onActiveChange: js.UndefOr[js.Function1[/* key */ Key, Unit]] = js.native
  
  var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
  
  var onCheck: js.UndefOr[
    js.Function2[
      /* checked */ typingsSlinky.rcTree.anon.Checked | js.Array[Key], 
      /* info */ CheckInfo, 
      Unit
    ]
  ] = js.native
  
  var onClick: js.UndefOr[
    js.Function2[/* e */ SyntheticMouseEvent[Element], /* treeNode */ EventDataNode, Unit]
  ] = js.native
  
  var onDoubleClick: js.UndefOr[
    js.Function2[/* e */ SyntheticMouseEvent[Element], /* treeNode */ EventDataNode, Unit]
  ] = js.native
  
  var onDragEnd: js.UndefOr[js.Function1[/* info */ EventNode, Unit]] = js.native
  
  var onDragEnter: js.UndefOr[js.Function1[/* info */ ExpandedKeys, Unit]] = js.native
  
  var onDragLeave: js.UndefOr[js.Function1[/* info */ EventNode, Unit]] = js.native
  
  var onDragOver: js.UndefOr[js.Function1[/* info */ EventNode, Unit]] = js.native
  
  var onDragStart: js.UndefOr[js.Function1[/* info */ EventNode, Unit]] = js.native
  
  var onDrop: js.UndefOr[js.Function1[/* info */ DragNode, Unit]] = js.native
  
  var onExpand: js.UndefOr[js.Function2[/* expandedKeys */ js.Array[Key], /* info */ Expanded, Unit]] = js.native
  
  var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  
  var onLoad: js.UndefOr[js.Function2[/* loadedKeys */ js.Array[Key], /* info */ Node, Unit]] = js.native
  
  var onMouseEnter: js.UndefOr[js.Function1[/* info */ EventNode, Unit]] = js.native
  
  var onMouseLeave: js.UndefOr[js.Function1[/* info */ EventNode, Unit]] = js.native
  
  var onRightClick: js.UndefOr[js.Function1[/* info */ EventNode, Unit]] = js.native
  
  var onSelect: js.UndefOr[js.Function2[/* selectedKeys */ js.Array[Key], /* info */ Event, Unit]] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var selectable: js.UndefOr[Boolean] = js.native
  
  /** （受控）设置选中的树节点 */
  var selectedKeys: js.UndefOr[js.Array[Key]] = js.native
  
  var showIcon: js.UndefOr[Boolean] = js.native
  
  var showLine: js.UndefOr[Boolean | ShowLeafIcon] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var switcherIcon: js.UndefOr[ReactElement] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var titleRender: js.UndefOr[js.Function1[/* node */ DataNode, ReactElement]] = js.native
  
  var treeData: js.UndefOr[js.Array[DataNode]] = js.native
  
  var virtual: js.UndefOr[Boolean] = js.native
}
object TreeProps {
  
  @scala.inline
  def apply(): TreeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeProps]
  }
  
  @scala.inline
  implicit class TreePropsOps[Self <: TreeProps] (val x: Self) extends AnyVal {
    
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
    def setAutoExpandParent(value: Boolean): Self = this.set("autoExpandParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoExpandParent: Self = this.set("autoExpandParent", js.undefined)
    
    @scala.inline
    def setBlockNode(value: Boolean): Self = this.set("blockNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockNode: Self = this.set("blockNode", js.undefined)
    
    @scala.inline
    def setCheckStrictly(value: Boolean): Self = this.set("checkStrictly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckStrictly: Self = this.set("checkStrictly", js.undefined)
    
    @scala.inline
    def setCheckable(value: Boolean): Self = this.set("checkable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckable: Self = this.set("checkable", js.undefined)
    
    @scala.inline
    def setCheckedKeysVarargs(value: Key*): Self = this.set("checkedKeys", js.Array(value :_*))
    
    @scala.inline
    def setCheckedKeys(value: js.Array[Key] | Checked): Self = this.set("checkedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckedKeys: Self = this.set("checkedKeys", js.undefined)
    
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
    def setDefaultCheckedKeysVarargs(value: Key*): Self = this.set("defaultCheckedKeys", js.Array(value :_*))
    
    @scala.inline
    def setDefaultCheckedKeys(value: js.Array[Key]): Self = this.set("defaultCheckedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCheckedKeys: Self = this.set("defaultCheckedKeys", js.undefined)
    
    @scala.inline
    def setDefaultExpandAll(value: Boolean): Self = this.set("defaultExpandAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultExpandAll: Self = this.set("defaultExpandAll", js.undefined)
    
    @scala.inline
    def setDefaultExpandParent(value: Boolean): Self = this.set("defaultExpandParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultExpandParent: Self = this.set("defaultExpandParent", js.undefined)
    
    @scala.inline
    def setDefaultExpandedKeysVarargs(value: Key*): Self = this.set("defaultExpandedKeys", js.Array(value :_*))
    
    @scala.inline
    def setDefaultExpandedKeys(value: js.Array[Key]): Self = this.set("defaultExpandedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultExpandedKeys: Self = this.set("defaultExpandedKeys", js.undefined)
    
    @scala.inline
    def setDefaultSelectedKeysVarargs(value: Key*): Self = this.set("defaultSelectedKeys", js.Array(value :_*))
    
    @scala.inline
    def setDefaultSelectedKeys(value: js.Array[Key]): Self = this.set("defaultSelectedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSelectedKeys: Self = this.set("defaultSelectedKeys", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setExpandedKeysVarargs(value: Key*): Self = this.set("expandedKeys", js.Array(value :_*))
    
    @scala.inline
    def setExpandedKeys(value: js.Array[Key]): Self = this.set("expandedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandedKeys: Self = this.set("expandedKeys", js.undefined)
    
    @scala.inline
    def setFilterAntTreeNode(value: ReactComponentClass[AntTreeNodeProps] => Boolean): Self = this.set("filterAntTreeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilterAntTreeNode: Self = this.set("filterAntTreeNode", js.undefined)
    
    @scala.inline
    def setFilterTreeNode(value: /* treeNode */ EventDataNode => Boolean): Self = this.set("filterTreeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilterTreeNode: Self = this.set("filterTreeNode", js.undefined)
    
    @scala.inline
    def setFocusable(value: Boolean): Self = this.set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusable: Self = this.set("focusable", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIconReactElement(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconFunction1(value: /* nodeProps */ AntdTreeNodeAttribute => ReactElement): Self = this.set("icon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIcon(value: (js.Function1[/* nodeProps */ AntdTreeNodeAttribute, ReactElement]) | ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setItemHeight(value: Double): Self = this.set("itemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemHeight: Self = this.set("itemHeight", js.undefined)
    
    @scala.inline
    def setLoadData(value: /* treeNode */ EventDataNode => js.Promise[Unit]): Self = this.set("loadData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoadData: Self = this.set("loadData", js.undefined)
    
    @scala.inline
    def setLoadedKeysVarargs(value: Key*): Self = this.set("loadedKeys", js.Array(value :_*))
    
    @scala.inline
    def setLoadedKeys(value: js.Array[Key]): Self = this.set("loadedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadedKeys: Self = this.set("loadedKeys", js.undefined)
    
    @scala.inline
    def setMotion(value: js.Any): Self = this.set("motion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotion: Self = this.set("motion", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setOnActiveChange(value: /* key */ Key => Unit): Self = this.set("onActiveChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnActiveChange: Self = this.set("onActiveChange", js.undefined)
    
    @scala.inline
    def setOnBlur(value: SyntheticFocusEvent[HTMLDivElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnCheck(
      value: (/* checked */ typingsSlinky.rcTree.anon.Checked | js.Array[Key], /* info */ CheckInfo) => Unit
    ): Self = this.set("onCheck", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCheck: Self = this.set("onCheck", js.undefined)
    
    @scala.inline
    def setOnClick(value: (/* e */ SyntheticMouseEvent[Element], /* treeNode */ EventDataNode) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: (/* e */ SyntheticMouseEvent[Element], /* treeNode */ EventDataNode) => Unit): Self = this.set("onDoubleClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: /* info */ EventNode => Unit): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragEnter(value: /* info */ ExpandedKeys => Unit): Self = this.set("onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    
    @scala.inline
    def setOnDragLeave(value: /* info */ EventNode => Unit): Self = this.set("onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    
    @scala.inline
    def setOnDragOver(value: /* info */ EventNode => Unit): Self = this.set("onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: /* info */ EventNode => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnDrop(value: /* info */ DragNode => Unit): Self = this.set("onDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    
    @scala.inline
    def setOnExpand(value: (/* expandedKeys */ js.Array[Key], /* info */ Expanded) => Unit): Self = this.set("onExpand", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnExpand: Self = this.set("onExpand", js.undefined)
    
    @scala.inline
    def setOnFocus(value: SyntheticFocusEvent[HTMLDivElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnLoad(value: (/* loadedKeys */ js.Array[Key], /* info */ Node) => Unit): Self = this.set("onLoad", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: /* info */ EventNode => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: /* info */ EventNode => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnRightClick(value: /* info */ EventNode => Unit): Self = this.set("onRightClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRightClick: Self = this.set("onRightClick", js.undefined)
    
    @scala.inline
    def setOnSelect(value: (/* selectedKeys */ js.Array[Key], /* info */ Event) => Unit): Self = this.set("onSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setSelectedKeysVarargs(value: Key*): Self = this.set("selectedKeys", js.Array(value :_*))
    
    @scala.inline
    def setSelectedKeys(value: js.Array[Key]): Self = this.set("selectedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedKeys: Self = this.set("selectedKeys", js.undefined)
    
    @scala.inline
    def setShowIcon(value: Boolean): Self = this.set("showIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowIcon: Self = this.set("showIcon", js.undefined)
    
    @scala.inline
    def setShowLine(value: Boolean | ShowLeafIcon): Self = this.set("showLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLine: Self = this.set("showLine", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSwitcherIcon(value: ReactElement): Self = this.set("switcherIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwitcherIcon: Self = this.set("switcherIcon", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTitleRender(value: /* node */ DataNode => ReactElement): Self = this.set("titleRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTitleRender: Self = this.set("titleRender", js.undefined)
    
    @scala.inline
    def setTreeDataVarargs(value: DataNode*): Self = this.set("treeData", js.Array(value :_*))
    
    @scala.inline
    def setTreeData(value: js.Array[DataNode]): Self = this.set("treeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreeData: Self = this.set("treeData", js.undefined)
    
    @scala.inline
    def setVirtual(value: Boolean): Self = this.set("virtual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtual: Self = this.set("virtual", js.undefined)
  }
}
