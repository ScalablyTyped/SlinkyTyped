package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.input.tag
import typingsSlinky.antd.antdStrings.SHOW_ALL
import typingsSlinky.antd.antdStrings.SHOW_CHILD
import typingsSlinky.antd.antdStrings.SHOW_PARENT
import typingsSlinky.antd.antdStrings.default
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.antd.libSelectMod.SelectProps
import typingsSlinky.antd.libSelectMod.SelectValue
import typingsSlinky.antd.libTreeDashSelectInterfaceMod.TreeDataSimpleMode
import typingsSlinky.antd.libTreeDashSelectInterfaceMod.TreeNodeValue
import typingsSlinky.antd.libTreeDashSelectInterfaceMod.TreeSelectProps
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_TreeSelectProps_24155021[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: autoFocus, className, disabled, id, multiple, onBlur, onFocus, open, tabIndex */
  def apply[T /* <: TreeNodeValue */](
    allowClear: js.UndefOr[Boolean] = js.undefined,
    autoClearSearchValue: js.UndefOr[Boolean] = js.undefined,
    choiceTransitionName: String = null,
    clearIcon: TagMod[Any] = null,
    defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    defaultValue: T = null,
    dropdownClassName: String = null,
    dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.undefined,
    dropdownMenuStyle: CSSProperties = null,
    dropdownRender: (/* menu */ js.UndefOr[TagMod[Any]], /* props */ js.UndefOr[SelectProps[SelectValue]]) => TagMod[Any] = null,
    dropdownStyle: CSSProperties = null,
    filterOption: Boolean | (js.Function2[/* inputValue */ String, /* option */ ReactElement, Boolean]) = null,
    filterTreeNode: (/* inputValue */ String, /* treeNode */ js.Any) => Boolean = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    labelInValue: js.UndefOr[Boolean] = js.undefined,
    loadData: /* node */ js.Any => Unit = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    maxTagCount: Int | Double = null,
    maxTagPlaceholder: TagMod[Any] | (js.Function1[/* omittedValues */ js.Array[_], TagMod[Any]]) = null,
    notFoundContent: TagMod[Any] = null,
    onChange: (T, /* label */ js.Any, /* extra */ js.Any) => Unit = null,
    onDropdownVisibleChange: /* open */ Boolean => Unit = null,
    onSearch: /* value */ js.Any => Unit = null,
    onSelect: (/* value */ js.Any, /* node */ js.Any, /* extra */ js.Any) => Unit = null,
    onTreeExpand: /* keys */ js.Array[String] => Unit = null,
    placeholder: String | TagMod[Any] = null,
    prefixCls: String = null,
    removeIcon: TagMod[Any] = null,
    searchPlaceholder: String = null,
    searchValue: String = null,
    showAction: String | js.Array[String] = null,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    showCheckedStrategy: SHOW_ALL | SHOW_PARENT | SHOW_CHILD = null,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    size: default | large | small = null,
    style: CSSProperties = null,
    suffixIcon: TagMod[Any] = null,
    transitionName: String = null,
    treeCheckStrictly: js.UndefOr[Boolean] = js.undefined,
    treeCheckable: Boolean | TagMod[Any] = null,
    treeData: js.Array[typingsSlinky.antd.libTreeDashSelectInterfaceMod.TreeNode] = null,
    treeDataSimpleMode: Boolean | TreeDataSimpleMode = null,
    treeDefaultExpandAll: js.UndefOr[Boolean] = js.undefined,
    treeDefaultExpandedKeys: js.Array[String] = null,
    treeExpandedKeys: js.Array[String] = null,
    treeIcon: js.UndefOr[Boolean] = js.undefined,
    treeNodeFilterProp: String = null,
    treeNodeLabelProp: String = null,
    value: T = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (!js.isUndefined(autoClearSearchValue)) __obj.updateDynamic("autoClearSearchValue")(autoClearSearchValue.asInstanceOf[js.Any])
    if (choiceTransitionName != null) __obj.updateDynamic("choiceTransitionName")(choiceTransitionName.asInstanceOf[js.Any])
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActiveFirstOption)) __obj.updateDynamic("defaultActiveFirstOption")(defaultActiveFirstOption.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdownMatchSelectWidth)) __obj.updateDynamic("dropdownMatchSelectWidth")(dropdownMatchSelectWidth.asInstanceOf[js.Any])
    if (dropdownMenuStyle != null) __obj.updateDynamic("dropdownMenuStyle")(dropdownMenuStyle.asInstanceOf[js.Any])
    if (dropdownRender != null) __obj.updateDynamic("dropdownRender")(js.Any.fromFunction2(dropdownRender))
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle.asInstanceOf[js.Any])
    if (filterOption != null) __obj.updateDynamic("filterOption")(filterOption.asInstanceOf[js.Any])
    if (filterTreeNode != null) __obj.updateDynamic("filterTreeNode")(js.Any.fromFunction2(filterTreeNode))
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (!js.isUndefined(labelInValue)) __obj.updateDynamic("labelInValue")(labelInValue.asInstanceOf[js.Any])
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction1(loadData))
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (maxTagCount != null) __obj.updateDynamic("maxTagCount")(maxTagCount.asInstanceOf[js.Any])
    if (maxTagPlaceholder != null) __obj.updateDynamic("maxTagPlaceholder")(maxTagPlaceholder.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onDropdownVisibleChange != null) __obj.updateDynamic("onDropdownVisibleChange")(js.Any.fromFunction1(onDropdownVisibleChange))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction3(onSelect))
    if (onTreeExpand != null) __obj.updateDynamic("onTreeExpand")(js.Any.fromFunction1(onTreeExpand))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (removeIcon != null) __obj.updateDynamic("removeIcon")(removeIcon.asInstanceOf[js.Any])
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder.asInstanceOf[js.Any])
    if (searchValue != null) __obj.updateDynamic("searchValue")(searchValue.asInstanceOf[js.Any])
    if (showAction != null) __obj.updateDynamic("showAction")(showAction.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow.asInstanceOf[js.Any])
    if (showCheckedStrategy != null) __obj.updateDynamic("showCheckedStrategy")(showCheckedStrategy.asInstanceOf[js.Any])
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(treeCheckStrictly)) __obj.updateDynamic("treeCheckStrictly")(treeCheckStrictly.asInstanceOf[js.Any])
    if (treeCheckable != null) __obj.updateDynamic("treeCheckable")(treeCheckable.asInstanceOf[js.Any])
    if (treeData != null) __obj.updateDynamic("treeData")(treeData.asInstanceOf[js.Any])
    if (treeDataSimpleMode != null) __obj.updateDynamic("treeDataSimpleMode")(treeDataSimpleMode.asInstanceOf[js.Any])
    if (!js.isUndefined(treeDefaultExpandAll)) __obj.updateDynamic("treeDefaultExpandAll")(treeDefaultExpandAll.asInstanceOf[js.Any])
    if (treeDefaultExpandedKeys != null) __obj.updateDynamic("treeDefaultExpandedKeys")(treeDefaultExpandedKeys.asInstanceOf[js.Any])
    if (treeExpandedKeys != null) __obj.updateDynamic("treeExpandedKeys")(treeExpandedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(treeIcon)) __obj.updateDynamic("treeIcon")(treeIcon.asInstanceOf[js.Any])
    if (treeNodeFilterProp != null) __obj.updateDynamic("treeNodeFilterProp")(treeNodeFilterProp.asInstanceOf[js.Any])
    if (treeNodeLabelProp != null) __obj.updateDynamic("treeNodeLabelProp")(treeNodeLabelProp.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.input.tag.type, ComponentRef]]
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.input.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TreeSelectProps[js.Any]
}

