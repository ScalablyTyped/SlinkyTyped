package typingsSlinky.antd.treeTreeMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
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
  var checkedKeys: js.UndefOr[js.Array[String] | Checked] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
  var className: js.UndefOr[String] = js.native
  /** 默认选中复选框的树节点 */
  var defaultCheckedKeys: js.UndefOr[js.Array[String]] = js.native
  /** 默认展开所有树节点 */
  var defaultExpandAll: js.UndefOr[Boolean] = js.native
  /** 默认展开对应树节点 */
  var defaultExpandParent: js.UndefOr[Boolean] = js.native
  /** 默认展开指定的树节点 */
  var defaultExpandedKeys: js.UndefOr[js.Array[String]] = js.native
  /** 默认选中的树节点 */
  var defaultSelectedKeys: js.UndefOr[js.Array[String]] = js.native
  /** 是否禁用树 */
  var disabled: js.UndefOr[Boolean] = js.native
  /** 设置节点可拖拽（IE>8） */
  var draggable: js.UndefOr[Boolean] = js.native
  /** （受控）展开指定的树节点 */
  var expandedKeys: js.UndefOr[js.Array[String]] = js.native
  /** 点击树节点触发 */
  var filterAntTreeNode: js.UndefOr[js.Function1[ReactComponentClass[AntTreeNodeProps], Boolean]] = js.native
  var filterTreeNode: js.UndefOr[js.Function1[ReactComponentClass[InternalTreeNodeProps], Boolean]] = js.native
  var icon: js.UndefOr[(js.Function1[/* nodeProps */ AntdTreeNodeAttribute, TagMod[Any]]) | TagMod[Any]] = js.native
  var loadData: js.UndefOr[js.Function1[ReactComponentClass[InternalTreeNodeProps], js.Promise[_]]] = js.native
  var loadedKeys: js.UndefOr[js.Array[String]] = js.native
  /** 是否支持多选 */
  var multiple: js.UndefOr[Boolean] = js.native
  var onCheck: js.UndefOr[js.Function2[/* checkedKeys */ js.Array[String], /* e */ CheckData, Unit]] = js.native
  var onDragEnd: js.UndefOr[js.Function1[/* props */ OnDragEndData, Unit]] = js.native
  var onDragEnter: js.UndefOr[js.Function1[/* props */ OnDragEnterData, Unit]] = js.native
  var onDragLeave: js.UndefOr[js.Function1[/* props */ OnDragLeaveData, Unit]] = js.native
  var onDragOver: js.UndefOr[js.Function1[/* props */ OnDragOverData, Unit]] = js.native
  var onDragStart: js.UndefOr[js.Function1[/* props */ OnDragStartData, Unit]] = js.native
  var onDrop: js.UndefOr[js.Function1[/* props */ OnDropData, Unit]] = js.native
  var onExpand: js.UndefOr[js.Function2[/* expandedKeys */ js.Array[String], /* e */ ExpandData, Unit]] = js.native
  var onMouseEnter: js.UndefOr[js.Function1[/* props */ OnMouseEnterData, Unit]] = js.native
  var onMouseLeave: js.UndefOr[js.Function1[/* props */ OnMouseLeaveData, Unit]] = js.native
  var onRightClick: js.UndefOr[js.Function1[/* props */ OnRightClickData, Unit]] = js.native
  var onSelect: js.UndefOr[js.Function2[/* selectedKeys */ js.Array[String], /* e */ SelectData, Unit]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var selectable: js.UndefOr[Boolean] = js.native
  /** （受控）设置选中的树节点 */
  var selectedKeys: js.UndefOr[js.Array[String]] = js.native
  var showIcon: js.UndefOr[Boolean] = js.native
  var showLine: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var switcherIcon: js.UndefOr[ReactElement] = js.native
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
    def withAutoExpandParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpandParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoExpandParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpandParent")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockNode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockNode")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckStrictly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkStrictly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckStrictly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkStrictly")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkable")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckedKeys(value: js.Array[String] | Checked): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCheckedKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCheckedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCheckedKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCheckedKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultExpandAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultExpandAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandAll")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultExpandParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultExpandParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandParent")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultExpandedKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultExpandedKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandedKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSelectedKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSelectedKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterAntTreeNode(value: ReactComponentClass[AntTreeNodeProps] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterAntTreeNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilterAntTreeNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterAntTreeNode")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterTreeNode(value: ReactComponentClass[InternalTreeNodeProps] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTreeNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilterTreeNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTreeNode")(js.undefined)
        ret
    }
    @scala.inline
    def withIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconFunction1(value: /* nodeProps */ AntdTreeNodeAttribute => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIcon(value: (js.Function1[/* nodeProps */ AntdTreeNodeAttribute, TagMod[Any]]) | TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadData(value: ReactComponentClass[InternalTreeNodeProps] => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoadData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadData")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadedKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadedKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadedKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCheck(value: (/* checkedKeys */ js.Array[String], /* e */ CheckData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCheck")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnd(value: /* props */ OnDragEndData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnter(value: /* props */ OnDragEnterData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragLeave(value: /* props */ OnDragLeaveData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragOver(value: /* props */ OnDragOverData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: /* props */ OnDragStartData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrop(value: /* props */ OnDropData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExpand(value: (/* expandedKeys */ js.Array[String], /* e */ ExpandData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: /* props */ OnMouseEnterData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: /* props */ OnMouseLeaveData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRightClick(value: /* props */ OnRightClickData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRightClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRightClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRightClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: (/* selectedKeys */ js.Array[String], /* e */ SelectData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withShowIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLine")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitcherIcon(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switcherIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwitcherIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switcherIcon")(js.undefined)
        ret
    }
  }
  
}

