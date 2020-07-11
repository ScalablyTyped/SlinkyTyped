package typingsSlinky.rcTree.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.rcTree.anon.Checked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeProps extends js.Object {
  /**
    * whether auto expand parent treeNodes
    */
  var autoExpandParent: js.UndefOr[Boolean] = js.undefined
  /**
    * check node precisely, parent and children nodes are not associated
    */
  var checkStrictly: js.UndefOr[Boolean] = js.undefined
  /**
    * whether support checked
    */
  var checkable: js.UndefOr[Boolean | ReactElement] = js.undefined
  /**
    * Controlled checked treeNodes (After setting, defaultCheckedKeys will not work).
    * Note: parent and children nodes are associated, if the parent node's key exists, it all children node will be checked, and vice versa.
    * When set checkable and checkStrictly, it should be an object, which contains checked array and halfChecked array.
    */
  var checkedKeys: js.UndefOr[js.Array[String] | Checked] = js.undefined
  /**
    * additional css class of root dom node
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * default checked treeNodes
    */
  var defaultCheckedKeys: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * default expand all treeNodes
    */
  var defaultExpandAll: js.UndefOr[Boolean] = js.undefined
  /**
    * auto expand parent treeNodes when init
    */
  var defaultExpandParent: js.UndefOr[Boolean] = js.undefined
  /**
    * default expand specific treeNodes
    */
  var defaultExpandedKeys: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * default selected treeNodes
    */
  var defaultSelectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * whether disabled the tree
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * whether can drag treeNode.
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /**
    * control expanding of specific treeNodes
    */
  var expandedKeys: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * filter some treeNodes as you need.
    */
  var filterTreeNode: js.UndefOr[js.Function1[ReactComponentClass[InternalTreeNodeProps], Boolean]] = js.undefined
  /**
    * customize icon. When you pass component, whose render will receive full TreeNode props as component props
    */
  var icon: js.UndefOr[ReactElement | (js.Function1[/* props */ InternalTreeNodeProps, ReactElement])] = js.undefined
  /**
    * load data asynchronously
    */
  var loadData: js.UndefOr[js.Function1[ReactComponentClass[InternalTreeNodeProps], js.Promise[_]]] = js.undefined
  /**
    * whether multiple select
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /**
    * click the treeNode/checkbox to fire
    */
  var onCheck: js.UndefOr[js.Function2[/* checkedKeys */ js.Array[String], /* e */ CheckData, Unit]] = js.undefined
  /**
    * it execs when fire the tree's dragend event
    */
  var onDragEnd: js.UndefOr[js.Function1[/* props */ OnDragEndData, Unit]] = js.undefined
  /**
    * event on drag enter
    */
  var onDragEnter: js.UndefOr[js.Function1[/* props */ OnDragEnterData, Unit]] = js.undefined
  /**
    * it execs when fire the tree's dragleave event
    */
  var onDragLeave: js.UndefOr[js.Function1[/* props */ OnDragLeaveData, Unit]] = js.undefined
  /**
    * it execs when fire the tree's dragover event
    */
  var onDragOver: js.UndefOr[js.Function1[/* props */ OnDragOverData, Unit]] = js.undefined
  /**
    * event on drag start
    */
  var onDragStart: js.UndefOr[js.Function1[/* props */ OnDragStartData, Unit]] = js.undefined
  /**
    * event on drag drop
    */
  var onDrop: js.UndefOr[js.Function1[/* props */ OnDropData, Unit]] = js.undefined
  /**
    * fire on treeNode expand or not
    */
  var onExpand: js.UndefOr[js.Function2[/* expandedKeys */ js.Array[String], /* e */ ExpandData, Unit]] = js.undefined
  /**
    * call when mouse enter a treeNode
    */
  var onMouseEnter: js.UndefOr[js.Function1[/* props */ OnMouseEnterData, Unit]] = js.undefined
  /**
    * call when mouse leave a treeNode
    */
  var onMouseLeave: js.UndefOr[js.Function1[/* props */ OnMouseLeaveData, Unit]] = js.undefined
  /**
    * select current treeNode and show customized contextmenu
    */
  var onRightClick: js.UndefOr[js.Function1[/* props */ OnRightClickData, Unit]] = js.undefined
  /**
    * click the treeNode to fire
    */
  var onSelect: js.UndefOr[js.Function2[/* selectedKeys */ js.Array[String], /* e */ SelectData, Unit]] = js.undefined
  /**
    * prefix class
    */
  var prefixCls: js.UndefOr[String] = js.undefined
  /**
    * whether can be selected
    */
  var selectable: js.UndefOr[Boolean] = js.undefined
  /**
    * Controlled selected treeNodes(After setting, defaultSelectedKeys will not work)
    */
  var selectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * whether show icon
    */
  var showIcon: js.UndefOr[Boolean] = js.undefined
  /**
    * whether show line
    */
  var showLine: js.UndefOr[Boolean] = js.undefined
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
    def setCheckStrictly(value: Boolean): Self = this.set("checkStrictly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckStrictly: Self = this.set("checkStrictly", js.undefined)
    @scala.inline
    def setCheckableReactElement(value: ReactElement): Self = this.set("checkable", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckable(value: Boolean | ReactElement): Self = this.set("checkable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckable: Self = this.set("checkable", js.undefined)
    @scala.inline
    def setCheckedKeysVarargs(value: String*): Self = this.set("checkedKeys", js.Array(value :_*))
    @scala.inline
    def setCheckedKeys(value: js.Array[String] | Checked): Self = this.set("checkedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckedKeys: Self = this.set("checkedKeys", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDefaultCheckedKeysVarargs(value: String*): Self = this.set("defaultCheckedKeys", js.Array(value :_*))
    @scala.inline
    def setDefaultCheckedKeys(value: js.Array[String]): Self = this.set("defaultCheckedKeys", value.asInstanceOf[js.Any])
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
    def setDefaultExpandedKeysVarargs(value: String*): Self = this.set("defaultExpandedKeys", js.Array(value :_*))
    @scala.inline
    def setDefaultExpandedKeys(value: js.Array[String]): Self = this.set("defaultExpandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultExpandedKeys: Self = this.set("defaultExpandedKeys", js.undefined)
    @scala.inline
    def setDefaultSelectedKeysVarargs(value: String*): Self = this.set("defaultSelectedKeys", js.Array(value :_*))
    @scala.inline
    def setDefaultSelectedKeys(value: js.Array[String]): Self = this.set("defaultSelectedKeys", value.asInstanceOf[js.Any])
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
    def setExpandedKeysVarargs(value: String*): Self = this.set("expandedKeys", js.Array(value :_*))
    @scala.inline
    def setExpandedKeys(value: js.Array[String]): Self = this.set("expandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandedKeys: Self = this.set("expandedKeys", js.undefined)
    @scala.inline
    def setFilterTreeNode(value: ReactComponentClass[InternalTreeNodeProps] => Boolean): Self = this.set("filterTreeNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilterTreeNode: Self = this.set("filterTreeNode", js.undefined)
    @scala.inline
    def setIconReactElement(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconFunction1(value: /* props */ InternalTreeNodeProps => ReactElement): Self = this.set("icon", js.Any.fromFunction1(value))
    @scala.inline
    def setIcon(value: ReactElement | (js.Function1[/* props */ InternalTreeNodeProps, ReactElement])): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLoadData(value: ReactComponentClass[InternalTreeNodeProps] => js.Promise[_]): Self = this.set("loadData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoadData: Self = this.set("loadData", js.undefined)
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
    def setSelectedKeysVarargs(value: String*): Self = this.set("selectedKeys", js.Array(value :_*))
    @scala.inline
    def setSelectedKeys(value: js.Array[String]): Self = this.set("selectedKeys", value.asInstanceOf[js.Any])
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
  }
  
}

