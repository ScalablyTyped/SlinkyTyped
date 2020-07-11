package typingsSlinky.antd.treeTreeMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.Checked
import typingsSlinky.rcTree.mod.CheckData
import typingsSlinky.rcTree.mod.ExpandData
import typingsSlinky.rcTree.mod.InternalTreeNodeProps
import typingsSlinky.rcTree.mod.OnDragEndData
import typingsSlinky.rcTree.mod.OnDragEnterData
import typingsSlinky.rcTree.mod.OnDragLeaveData
import typingsSlinky.rcTree.mod.OnDragOverData
import typingsSlinky.rcTree.mod.OnDragStartData
import typingsSlinky.rcTree.mod.OnDropData
import typingsSlinky.rcTree.mod.OnMouseEnterData
import typingsSlinky.rcTree.mod.OnMouseLeaveData
import typingsSlinky.rcTree.mod.OnRightClickData
import typingsSlinky.rcTree.mod.SelectData
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<rc-tree.rc-tree.TreeProps, 'prefixCls'> */
trait TreeProps extends js.Object {
  /** 是否自动展开父节点 */
  var autoExpandParent: js.UndefOr[Boolean] = js.undefined
  var blockNode: js.UndefOr[Boolean] = js.undefined
  /** checkable状态下节点选择完全受控（父子节点选中状态不再关联） */
  var checkStrictly: js.UndefOr[Boolean] = js.undefined
  /** 是否支持选中 */
  var checkable: js.UndefOr[Boolean] = js.undefined
  /** （受控）选中复选框的树节点 */
  var checkedKeys: js.UndefOr[
    (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
    ]) | Checked
  ] = js.undefined
  var children: js.UndefOr[ReactElement] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /** 默认选中复选框的树节点 */
  var defaultCheckedKeys: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
    ]
  ] = js.undefined
  /** 默认展开所有树节点 */
  var defaultExpandAll: js.UndefOr[Boolean] = js.undefined
  /** 默认展开对应树节点 */
  var defaultExpandParent: js.UndefOr[Boolean] = js.undefined
  /** 默认展开指定的树节点 */
  var defaultExpandedKeys: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
    ]
  ] = js.undefined
  /** 默认选中的树节点 */
  var defaultSelectedKeys: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
    ]
  ] = js.undefined
  /** 是否禁用树 */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** 设置节点可拖拽（IE>8） */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /** （受控）展开指定的树节点 */
  var expandedKeys: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
    ]
  ] = js.undefined
  /** 点击树节点触发 */
  var filterAntTreeNode: js.UndefOr[js.Function1[ReactComponentClass[AntTreeNodeProps], Boolean]] = js.undefined
  var filterTreeNode: js.UndefOr[js.Function1[ReactComponentClass[InternalTreeNodeProps], Boolean]] = js.undefined
  var icon: js.UndefOr[
    (js.Function1[/* nodeProps */ AntdTreeNodeAttribute, ReactElement]) | ReactElement
  ] = js.undefined
  var loadData: js.UndefOr[js.Function1[ReactComponentClass[InternalTreeNodeProps], js.Promise[_]]] = js.undefined
  var loadedKeys: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
    ]
  ] = js.undefined
  /** 是否支持多选 */
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onCheck: js.UndefOr[js.Function2[/* checkedKeys */ js.Array[String], /* e */ CheckData, Unit]] = js.undefined
  var onDragEnd: js.UndefOr[js.Function1[/* props */ OnDragEndData, Unit]] = js.undefined
  var onDragEnter: js.UndefOr[js.Function1[/* props */ OnDragEnterData, Unit]] = js.undefined
  var onDragLeave: js.UndefOr[js.Function1[/* props */ OnDragLeaveData, Unit]] = js.undefined
  var onDragOver: js.UndefOr[js.Function1[/* props */ OnDragOverData, Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* props */ OnDragStartData, Unit]] = js.undefined
  var onDrop: js.UndefOr[js.Function1[/* props */ OnDropData, Unit]] = js.undefined
  var onExpand: js.UndefOr[js.Function2[/* expandedKeys */ js.Array[String], /* e */ ExpandData, Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* props */ OnMouseEnterData, Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* props */ OnMouseLeaveData, Unit]] = js.undefined
  var onRightClick: js.UndefOr[js.Function1[/* props */ OnRightClickData, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function2[/* selectedKeys */ js.Array[String], /* e */ SelectData, Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  /** （受控）设置选中的树节点 */
  var selectedKeys: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
    ]
  ] = js.undefined
  var showIcon: js.UndefOr[Boolean] = js.undefined
  var showLine: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var switcherIcon: js.UndefOr[ReactElement] = js.undefined
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
    def setCheckedKeysVarargs(value: js.Any*): Self = this.set("checkedKeys", js.Array(value :_*))
    @scala.inline
    def setCheckedKeys(
      value: (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
        ]) | Checked
    ): Self = this.set("checkedKeys", value.asInstanceOf[js.Any])
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
    def setDefaultCheckedKeysVarargs(value: js.Any*): Self = this.set("defaultCheckedKeys", js.Array(value :_*))
    @scala.inline
    def setDefaultCheckedKeys(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
        ]
    ): Self = this.set("defaultCheckedKeys", value.asInstanceOf[js.Any])
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
    def setDefaultExpandedKeysVarargs(value: js.Any*): Self = this.set("defaultExpandedKeys", js.Array(value :_*))
    @scala.inline
    def setDefaultExpandedKeys(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
        ]
    ): Self = this.set("defaultExpandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultExpandedKeys: Self = this.set("defaultExpandedKeys", js.undefined)
    @scala.inline
    def setDefaultSelectedKeysVarargs(value: js.Any*): Self = this.set("defaultSelectedKeys", js.Array(value :_*))
    @scala.inline
    def setDefaultSelectedKeys(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
        ]
    ): Self = this.set("defaultSelectedKeys", value.asInstanceOf[js.Any])
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
    def setExpandedKeysVarargs(value: js.Any*): Self = this.set("expandedKeys", js.Array(value :_*))
    @scala.inline
    def setExpandedKeys(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
        ]
    ): Self = this.set("expandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandedKeys: Self = this.set("expandedKeys", js.undefined)
    @scala.inline
    def setFilterAntTreeNode(value: ReactComponentClass[AntTreeNodeProps] => Boolean): Self = this.set("filterAntTreeNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilterAntTreeNode: Self = this.set("filterAntTreeNode", js.undefined)
    @scala.inline
    def setFilterTreeNode(value: ReactComponentClass[InternalTreeNodeProps] => Boolean): Self = this.set("filterTreeNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilterTreeNode: Self = this.set("filterTreeNode", js.undefined)
    @scala.inline
    def setIconReactElement(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconFunction1(value: /* nodeProps */ AntdTreeNodeAttribute => ReactElement): Self = this.set("icon", js.Any.fromFunction1(value))
    @scala.inline
    def setIcon(value: (js.Function1[/* nodeProps */ AntdTreeNodeAttribute, ReactElement]) | ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLoadData(value: ReactComponentClass[InternalTreeNodeProps] => js.Promise[_]): Self = this.set("loadData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoadData: Self = this.set("loadData", js.undefined)
    @scala.inline
    def setLoadedKeysVarargs(value: js.Any*): Self = this.set("loadedKeys", js.Array(value :_*))
    @scala.inline
    def setLoadedKeys(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
        ]
    ): Self = this.set("loadedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadedKeys: Self = this.set("loadedKeys", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setOnCheck(value: (/* checkedKeys */ js.Array[String], /* e */ CheckData) => Unit): Self = this.set("onCheck", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnCheck: Self = this.set("onCheck", js.undefined)
    @scala.inline
    def setOnDragEnd(value: /* props */ OnDragEndData => Unit): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    @scala.inline
    def setOnDragEnter(value: /* props */ OnDragEnterData => Unit): Self = this.set("onDragEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    @scala.inline
    def setOnDragLeave(value: /* props */ OnDragLeaveData => Unit): Self = this.set("onDragLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    @scala.inline
    def setOnDragOver(value: /* props */ OnDragOverData => Unit): Self = this.set("onDragOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    @scala.inline
    def setOnDragStart(value: /* props */ OnDragStartData => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setOnDrop(value: /* props */ OnDropData => Unit): Self = this.set("onDrop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    @scala.inline
    def setOnExpand(value: (/* expandedKeys */ js.Array[String], /* e */ ExpandData) => Unit): Self = this.set("onExpand", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnExpand: Self = this.set("onExpand", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: /* props */ OnMouseEnterData => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: /* props */ OnMouseLeaveData => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnRightClick(value: /* props */ OnRightClickData => Unit): Self = this.set("onRightClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRightClick: Self = this.set("onRightClick", js.undefined)
    @scala.inline
    def setOnSelect(value: (/* selectedKeys */ js.Array[String], /* e */ SelectData) => Unit): Self = this.set("onSelect", js.Any.fromFunction2(value))
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
    def setSelectedKeysVarargs(value: js.Any*): Self = this.set("selectedKeys", js.Array(value :_*))
    @scala.inline
    def setSelectedKeys(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
        ]
    ): Self = this.set("selectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedKeys: Self = this.set("selectedKeys", js.undefined)
    @scala.inline
    def setShowIcon(value: Boolean): Self = this.set("showIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowIcon: Self = this.set("showIcon", js.undefined)
    @scala.inline
    def setShowLine(value: Boolean): Self = this.set("showLine", value.asInstanceOf[js.Any])
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
  }
  
}

