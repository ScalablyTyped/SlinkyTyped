package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.antd.antdStrings.default
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.antd.esAutoDashCompleteMod.AutoCompleteProps
import typingsSlinky.antd.esAutoDashCompleteMod.DataSourceItemType
import typingsSlinky.antd.esSelectMod.SelectProps
import typingsSlinky.antd.esSelectMod.SelectValue
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_AutoCompleteProps_1424629805[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply(
    allowClear: js.UndefOr[Boolean] = js.undefined,
    autoClearSearchValue: js.UndefOr[Boolean] = js.undefined,
    backfill: js.UndefOr[Boolean] = js.undefined,
    choiceTransitionName: String = null,
    dataSource: js.Array[DataSourceItemType] = null,
    defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    dropdownClassName: String = null,
    dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.undefined,
    dropdownMenuStyle: CSSProperties = null,
    dropdownRender: (/* menu */ js.UndefOr[TagMod[Any]], /* props */ js.UndefOr[SelectProps[SelectValue]]) => TagMod[Any] = null,
    dropdownStyle: CSSProperties = null,
    filterOption: Boolean | (js.Function2[/* inputValue */ String, /* option */ ReactElement, Boolean]) = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    notFoundContent: TagMod[Any] = null,
    onDropdownVisibleChange: /* open */ Boolean => Unit = null,
    onFocus: () => Unit = null,
    onSearch: /* value */ String => Unit = null,
    onSelect: (/* value */ SelectValue, /* option */ js.Object) => _ = null,
    optionLabelProp: String = null,
    placeholder: String | TagMod[Any] = null,
    prefixCls: String = null,
    showAction: String | js.Array[String] = null,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    size: default | large | small = null,
    style: CSSProperties = null,
    transitionName: String = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (!js.isUndefined(autoClearSearchValue)) __obj.updateDynamic("autoClearSearchValue")(autoClearSearchValue.asInstanceOf[js.Any])
    if (!js.isUndefined(backfill)) __obj.updateDynamic("backfill")(backfill.asInstanceOf[js.Any])
    if (choiceTransitionName != null) __obj.updateDynamic("choiceTransitionName")(choiceTransitionName.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActiveFirstOption)) __obj.updateDynamic("defaultActiveFirstOption")(defaultActiveFirstOption.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdownMatchSelectWidth)) __obj.updateDynamic("dropdownMatchSelectWidth")(dropdownMatchSelectWidth.asInstanceOf[js.Any])
    if (dropdownMenuStyle != null) __obj.updateDynamic("dropdownMenuStyle")(dropdownMenuStyle.asInstanceOf[js.Any])
    if (dropdownRender != null) __obj.updateDynamic("dropdownRender")(js.Any.fromFunction2(dropdownRender))
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle.asInstanceOf[js.Any])
    if (filterOption != null) __obj.updateDynamic("filterOption")(filterOption.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onDropdownVisibleChange != null) __obj.updateDynamic("onDropdownVisibleChange")(js.Any.fromFunction1(onDropdownVisibleChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (optionLabelProp != null) __obj.updateDynamic("optionLabelProp")(optionLabelProp.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (showAction != null) __obj.updateDynamic("showAction")(showAction.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow.asInstanceOf[js.Any])
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AutoCompleteProps
}

