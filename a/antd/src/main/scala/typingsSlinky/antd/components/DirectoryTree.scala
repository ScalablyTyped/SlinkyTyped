package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.antd.Anon_CheckedHalfChecked
import typingsSlinky.antd.Anon_Event
import typingsSlinky.antd.libTreeDirectoryTreeMod.DirectoryTreeProps
import typingsSlinky.antd.libTreeDirectoryTreeMod.ExpandAction
import typingsSlinky.antd.libTreeDirectoryTreeMod.default
import typingsSlinky.antd.libTreeTreeMod.AntTreeNodeCheckedEvent
import typingsSlinky.antd.libTreeTreeMod.AntTreeNodeExpandedEvent
import typingsSlinky.antd.libTreeTreeMod.AntTreeNodeMouseEvent
import typingsSlinky.antd.libTreeTreeMod.AntTreeNodeProps
import typingsSlinky.antd.libTreeTreeMod.AntTreeNodeSelectedEvent
import typingsSlinky.antd.libTreeTreeMod.AntdTreeNodeAttribute
import typingsSlinky.antd.libTreeTreeMod.TreeNodeNormal
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DirectoryTree
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd/lib/tree/DirectoryTree", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, draggable, multiple, onDragEnd, onDragEnter, onDragLeave, onDragOver, onDragStart, onDrop, onMouseEnter, onMouseLeave */
  def apply(
    autoExpandParent: js.UndefOr[Boolean] = js.undefined,
    blockNode: js.UndefOr[Boolean] = js.undefined,
    checkStrictly: js.UndefOr[Boolean] = js.undefined,
    checkable: js.UndefOr[Boolean] = js.undefined,
    checkedKeys: js.Array[String] | Anon_CheckedHalfChecked = null,
    defaultCheckedKeys: js.Array[String] = null,
    defaultExpandAll: js.UndefOr[Boolean] = js.undefined,
    defaultExpandParent: js.UndefOr[Boolean] = js.undefined,
    defaultExpandedKeys: js.Array[String] = null,
    defaultSelectedKeys: js.Array[String] = null,
    expandAction: ExpandAction = null,
    expandedKeys: js.Array[String] = null,
    filterAntTreeNode: ReactComponentClass[AntTreeNodeProps] => Boolean = null,
    filterTreeNode: ReactComponentClass[AntTreeNodeProps] => Boolean = null,
    icon: (js.Function1[/* nodeProps */ AntdTreeNodeAttribute, TagMod[Any]]) | TagMod[Any] = null,
    loadData: ReactComponentClass[AntTreeNodeProps] => js.Thenable[Unit] = null,
    loadedKeys: js.Array[String] = null,
    onCheck: (/* checkedKeys */ js.Array[String] | Anon_CheckedHalfChecked, /* e */ AntTreeNodeCheckedEvent) => Unit = null,
    onClick: (/* e */ SyntheticMouseEvent[HTMLElement], ReactComponentClass[AntTreeNodeProps]) => Unit = null,
    onDoubleClick: (/* e */ SyntheticMouseEvent[HTMLElement], ReactComponentClass[AntTreeNodeProps]) => Unit = null,
    onExpand: (/* expandedKeys */ js.Array[String], /* info */ AntTreeNodeExpandedEvent) => Unit | js.Thenable[Unit] = null,
    onLoad: (/* loadedKeys */ js.Array[String], /* info */ Anon_Event) => Unit = null,
    onRightClick: /* options */ AntTreeNodeMouseEvent => Unit = null,
    onSelect: (/* selectedKeys */ js.Array[String], /* e */ AntTreeNodeSelectedEvent) => Unit = null,
    prefixCls: String = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectedKeys: js.Array[String] = null,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    showLine: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    switcherIcon: ReactElement = null,
    treeData: js.Array[TreeNodeNormal] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoExpandParent)) __obj.updateDynamic("autoExpandParent")(autoExpandParent.asInstanceOf[js.Any])
    if (!js.isUndefined(blockNode)) __obj.updateDynamic("blockNode")(blockNode.asInstanceOf[js.Any])
    if (!js.isUndefined(checkStrictly)) __obj.updateDynamic("checkStrictly")(checkStrictly.asInstanceOf[js.Any])
    if (!js.isUndefined(checkable)) __obj.updateDynamic("checkable")(checkable.asInstanceOf[js.Any])
    if (checkedKeys != null) __obj.updateDynamic("checkedKeys")(checkedKeys.asInstanceOf[js.Any])
    if (defaultCheckedKeys != null) __obj.updateDynamic("defaultCheckedKeys")(defaultCheckedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultExpandAll)) __obj.updateDynamic("defaultExpandAll")(defaultExpandAll.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultExpandParent)) __obj.updateDynamic("defaultExpandParent")(defaultExpandParent.asInstanceOf[js.Any])
    if (defaultExpandedKeys != null) __obj.updateDynamic("defaultExpandedKeys")(defaultExpandedKeys.asInstanceOf[js.Any])
    if (defaultSelectedKeys != null) __obj.updateDynamic("defaultSelectedKeys")(defaultSelectedKeys.asInstanceOf[js.Any])
    if (expandAction != null) __obj.updateDynamic("expandAction")(expandAction.asInstanceOf[js.Any])
    if (expandedKeys != null) __obj.updateDynamic("expandedKeys")(expandedKeys.asInstanceOf[js.Any])
    if (filterAntTreeNode != null) __obj.updateDynamic("filterAntTreeNode")(js.Any.fromFunction1(filterAntTreeNode))
    if (filterTreeNode != null) __obj.updateDynamic("filterTreeNode")(js.Any.fromFunction1(filterTreeNode))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction1(loadData))
    if (loadedKeys != null) __obj.updateDynamic("loadedKeys")(loadedKeys.asInstanceOf[js.Any])
    if (onCheck != null) __obj.updateDynamic("onCheck")(js.Any.fromFunction2(onCheck))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction2(onDoubleClick))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2(onExpand))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction2(onLoad))
    if (onRightClick != null) __obj.updateDynamic("onRightClick")(js.Any.fromFunction1(onRightClick))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showLine)) __obj.updateDynamic("showLine")(showLine.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (switcherIcon != null) __obj.updateDynamic("switcherIcon")(switcherIcon.asInstanceOf[js.Any])
    if (treeData != null) __obj.updateDynamic("treeData")(treeData.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antd.libTreeDirectoryTreeMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DirectoryTreeProps
}

