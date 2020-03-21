package typingsSlinky.rcTree.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.rcTree.AnonChecked
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
import typingsSlinky.rcTree.mod.TreeProps
import typingsSlinky.rcTree.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcTree
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("rc-tree", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, draggable, multiple */
  def apply(
    autoExpandParent: js.UndefOr[Boolean] = js.undefined,
    checkStrictly: js.UndefOr[Boolean] = js.undefined,
    checkable: Boolean | ReactElement = null,
    checkedKeys: js.Array[String] | AnonChecked = null,
    defaultCheckedKeys: js.Array[String] = null,
    defaultExpandAll: js.UndefOr[Boolean] = js.undefined,
    defaultExpandParent: js.UndefOr[Boolean] = js.undefined,
    defaultExpandedKeys: js.Array[String] = null,
    defaultSelectedKeys: js.Array[String] = null,
    expandedKeys: js.Array[String] = null,
    filterTreeNode: ReactComponentClass[InternalTreeNodeProps] => Boolean = null,
    icon: ReactElement | (js.Function1[/* props */ InternalTreeNodeProps, ReactElement]) = null,
    loadData: ReactComponentClass[InternalTreeNodeProps] => js.Promise[_] = null,
    onCheck: (/* checkedKeys */ js.Array[String], /* e */ CheckData) => Unit = null,
    onDragEnd: /* props */ OnDragEndData => Unit = null,
    onDragEnter: /* props */ OnDragEnterData => Unit = null,
    onDragLeave: /* props */ OnDragLeaveData => Unit = null,
    onDragOver: /* props */ OnDragOverData => Unit = null,
    onDragStart: /* props */ OnDragStartData => Unit = null,
    onDrop: /* props */ OnDropData => Unit = null,
    onExpand: (/* expandedKeys */ js.Array[String], /* e */ ExpandData) => Unit = null,
    onMouseEnter: /* props */ OnMouseEnterData => Unit = null,
    onMouseLeave: /* props */ OnMouseLeaveData => Unit = null,
    onRightClick: /* props */ OnRightClickData => Unit = null,
    onSelect: (/* selectedKeys */ js.Array[String], /* e */ SelectData) => Unit = null,
    prefixCls: String = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectedKeys: js.Array[String] = null,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    showLine: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoExpandParent)) __obj.updateDynamic("autoExpandParent")(autoExpandParent.asInstanceOf[js.Any])
    if (!js.isUndefined(checkStrictly)) __obj.updateDynamic("checkStrictly")(checkStrictly.asInstanceOf[js.Any])
    if (checkable != null) __obj.updateDynamic("checkable")(checkable.asInstanceOf[js.Any])
    if (checkedKeys != null) __obj.updateDynamic("checkedKeys")(checkedKeys.asInstanceOf[js.Any])
    if (defaultCheckedKeys != null) __obj.updateDynamic("defaultCheckedKeys")(defaultCheckedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultExpandAll)) __obj.updateDynamic("defaultExpandAll")(defaultExpandAll.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultExpandParent)) __obj.updateDynamic("defaultExpandParent")(defaultExpandParent.asInstanceOf[js.Any])
    if (defaultExpandedKeys != null) __obj.updateDynamic("defaultExpandedKeys")(defaultExpandedKeys.asInstanceOf[js.Any])
    if (defaultSelectedKeys != null) __obj.updateDynamic("defaultSelectedKeys")(defaultSelectedKeys.asInstanceOf[js.Any])
    if (expandedKeys != null) __obj.updateDynamic("expandedKeys")(expandedKeys.asInstanceOf[js.Any])
    if (filterTreeNode != null) __obj.updateDynamic("filterTreeNode")(js.Any.fromFunction1(filterTreeNode))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction1(loadData))
    if (onCheck != null) __obj.updateDynamic("onCheck")(js.Any.fromFunction2(onCheck))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2(onExpand))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onRightClick != null) __obj.updateDynamic("onRightClick")(js.Any.fromFunction1(onRightClick))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showLine)) __obj.updateDynamic("showLine")(showLine.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.rcTree.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TreeProps
}

