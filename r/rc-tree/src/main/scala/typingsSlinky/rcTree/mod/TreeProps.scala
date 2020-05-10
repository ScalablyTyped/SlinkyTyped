package typingsSlinky.rcTree.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.rcTree.AnonChecked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeProps extends js.Object {
  /**
    * whether auto expand parent treeNodes
    */
  var autoExpandParent: js.UndefOr[Boolean] = js.native
  /**
    * check node precisely, parent and children nodes are not associated
    */
  var checkStrictly: js.UndefOr[Boolean] = js.native
  /**
    * whether support checked
    */
  var checkable: js.UndefOr[Boolean | ReactElement] = js.native
  /**
    * Controlled checked treeNodes (After setting, defaultCheckedKeys will not work).
    * Note: parent and children nodes are associated, if the parent node's key exists, it all children node will be checked, and vice versa.
    * When set checkable and checkStrictly, it should be an object, which contains checked array and halfChecked array.
    */
  var checkedKeys: js.UndefOr[js.Array[String] | AnonChecked] = js.native
  /**
    * additional css class of root dom node
    */
  var className: js.UndefOr[String] = js.native
  /**
    * default checked treeNodes
    */
  var defaultCheckedKeys: js.UndefOr[js.Array[String]] = js.native
  /**
    * default expand all treeNodes
    */
  var defaultExpandAll: js.UndefOr[Boolean] = js.native
  /**
    * auto expand parent treeNodes when init
    */
  var defaultExpandParent: js.UndefOr[Boolean] = js.native
  /**
    * default expand specific treeNodes
    */
  var defaultExpandedKeys: js.UndefOr[js.Array[String]] = js.native
  /**
    * default selected treeNodes
    */
  var defaultSelectedKeys: js.UndefOr[js.Array[String]] = js.native
  /**
    * whether disabled the tree
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * whether can drag treeNode.
    */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    * control expanding of specific treeNodes
    */
  var expandedKeys: js.UndefOr[js.Array[String]] = js.native
  /**
    * filter some treeNodes as you need.
    */
  var filterTreeNode: js.UndefOr[js.Function1[ReactComponentClass[InternalTreeNodeProps], Boolean]] = js.native
  /**
    * customize icon. When you pass component, whose render will receive full TreeNode props as component props
    */
  var icon: js.UndefOr[ReactElement | (js.Function1[/* props */ InternalTreeNodeProps, ReactElement])] = js.native
  /**
    * load data asynchronously
    */
  var loadData: js.UndefOr[js.Function1[ReactComponentClass[InternalTreeNodeProps], js.Promise[_]]] = js.native
  /**
    * whether multiple select
    */
  var multiple: js.UndefOr[Boolean] = js.native
  /**
    * click the treeNode/checkbox to fire
    */
  var onCheck: js.UndefOr[js.Function2[/* checkedKeys */ js.Array[String], /* e */ CheckData, Unit]] = js.native
  /**
    * it execs when fire the tree's dragend event
    */
  var onDragEnd: js.UndefOr[js.Function1[/* props */ OnDragEndData, Unit]] = js.native
  /**
    * event on drag enter
    */
  var onDragEnter: js.UndefOr[js.Function1[/* props */ OnDragEnterData, Unit]] = js.native
  /**
    * it execs when fire the tree's dragleave event
    */
  var onDragLeave: js.UndefOr[js.Function1[/* props */ OnDragLeaveData, Unit]] = js.native
  /**
    * it execs when fire the tree's dragover event
    */
  var onDragOver: js.UndefOr[js.Function1[/* props */ OnDragOverData, Unit]] = js.native
  /**
    * event on drag start
    */
  var onDragStart: js.UndefOr[js.Function1[/* props */ OnDragStartData, Unit]] = js.native
  /**
    * event on drag drop
    */
  var onDrop: js.UndefOr[js.Function1[/* props */ OnDropData, Unit]] = js.native
  /**
    * fire on treeNode expand or not
    */
  var onExpand: js.UndefOr[js.Function2[/* expandedKeys */ js.Array[String], /* e */ ExpandData, Unit]] = js.native
  /**
    * call when mouse enter a treeNode
    */
  var onMouseEnter: js.UndefOr[js.Function1[/* props */ OnMouseEnterData, Unit]] = js.native
  /**
    * call when mouse leave a treeNode
    */
  var onMouseLeave: js.UndefOr[js.Function1[/* props */ OnMouseLeaveData, Unit]] = js.native
  /**
    * select current treeNode and show customized contextmenu
    */
  var onRightClick: js.UndefOr[js.Function1[/* props */ OnRightClickData, Unit]] = js.native
  /**
    * click the treeNode to fire
    */
  var onSelect: js.UndefOr[js.Function2[/* selectedKeys */ js.Array[String], /* e */ SelectData, Unit]] = js.native
  /**
    * prefix class
    */
  var prefixCls: js.UndefOr[String] = js.native
  /**
    * whether can be selected
    */
  var selectable: js.UndefOr[Boolean] = js.native
  /**
    * Controlled selected treeNodes(After setting, defaultSelectedKeys will not work)
    */
  var selectedKeys: js.UndefOr[js.Array[String]] = js.native
  /**
    * whether show icon
    */
  var showIcon: js.UndefOr[Boolean] = js.native
  /**
    * whether show line
    */
  var showLine: js.UndefOr[Boolean] = js.native
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
    def withCheckableReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckable(value: Boolean | ReactElement): Self = {
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
    def withCheckedKeys(value: js.Array[String] | AnonChecked): Self = {
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
    def withIconFunction1(value: /* props */ InternalTreeNodeProps => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIcon(value: ReactElement | (js.Function1[/* props */ InternalTreeNodeProps, ReactElement])): Self = {
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
  }
  
}

