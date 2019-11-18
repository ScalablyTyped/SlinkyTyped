package typingsSlinky.antd.libSelectMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticUIEvent
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.UIEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectProps[T] extends AbstractSelectProps {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var clearIcon: js.UndefOr[TagMod[Any]] = js.undefined
  var defaultValue: js.UndefOr[T] = js.undefined
  var firstActiveValue: js.UndefOr[String | js.Array[String]] = js.undefined
  var getInputElement: js.UndefOr[js.Function0[ReactElement]] = js.undefined
  var labelInValue: js.UndefOr[Boolean] = js.undefined
  var maxTagCount: js.UndefOr[Double] = js.undefined
  var maxTagPlaceholder: js.UndefOr[TagMod[Any] | (js.Function1[/* omittedValues */ js.Array[T], TagMod[Any]])] = js.undefined
  var maxTagTextLength: js.UndefOr[Double] = js.undefined
  var menuItemSelectedIcon: js.UndefOr[TagMod[Any]] = js.undefined
  var mode: js.UndefOr[ModeOption] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* value */ T, /* option */ ReactElement | js.Array[ReactElement], Unit]
  ] = js.undefined
  var onDeselect: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onInputKeyDown: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent[HTMLInputElement], Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLInputElement], Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLInputElement], Unit]] = js.undefined
  var onPopupScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.undefined
  var onSelect: js.UndefOr[js.Function2[/* value */ T, /* option */ ReactElement, Unit]] = js.undefined
  var optionFilterProp: js.UndefOr[String] = js.undefined
  var optionLabelProp: js.UndefOr[String] = js.undefined
  var removeIcon: js.UndefOr[TagMod[Any]] = js.undefined
  var suffixIcon: js.UndefOr[TagMod[Any]] = js.undefined
  var tokenSeparators: js.UndefOr[js.Array[String]] = js.undefined
  var value: js.UndefOr[T] = js.undefined
}

object SelectProps {
  @scala.inline
  def apply[T](
    allowClear: js.UndefOr[Boolean] = js.undefined,
    autoClearSearchValue: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    choiceTransitionName: String = null,
    className: String = null,
    clearIcon: TagMod[Any] = null,
    defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    defaultValue: T = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropdownClassName: String = null,
    dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.undefined,
    dropdownMenuStyle: CSSProperties = null,
    dropdownRender: (/* menu */ js.UndefOr[TagMod[Any]], /* props */ js.UndefOr[SelectProps[SelectValue]]) => TagMod[Any] = null,
    dropdownStyle: CSSProperties = null,
    filterOption: Boolean | (js.Function2[/* inputValue */ String, /* option */ ReactElement, Boolean]) = null,
    firstActiveValue: String | js.Array[String] = null,
    getInputElement: () => ReactElement = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    id: String = null,
    labelInValue: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    maxTagCount: Int | Double = null,
    maxTagPlaceholder: TagMod[Any] | (js.Function1[/* omittedValues */ js.Array[T], TagMod[Any]]) = null,
    maxTagTextLength: Int | Double = null,
    menuItemSelectedIcon: TagMod[Any] = null,
    mode: ModeOption = null,
    notFoundContent: TagMod[Any] = null,
    onBlur: /* value */ T => Unit = null,
    onChange: (/* value */ T, /* option */ ReactElement | js.Array[ReactElement]) => Unit = null,
    onDeselect: /* value */ T => Unit = null,
    onDropdownVisibleChange: /* open */ Boolean => Unit = null,
    onFocus: () => Unit = null,
    onInputKeyDown: /* e */ SyntheticKeyboardEvent[HTMLInputElement] => Unit = null,
    onMouseEnter: /* e */ SyntheticMouseEvent[HTMLInputElement] => Unit = null,
    onMouseLeave: /* e */ SyntheticMouseEvent[HTMLInputElement] => Unit = null,
    onPopupScroll: SyntheticUIEvent[HTMLDivElement] => Unit = null,
    onSearch: /* value */ String => Unit = null,
    onSelect: (/* value */ T, /* option */ ReactElement) => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    optionFilterProp: String = null,
    optionLabelProp: String = null,
    placeholder: String | TagMod[Any] = null,
    prefixCls: String = null,
    removeIcon: TagMod[Any] = null,
    showAction: String | js.Array[String] = null,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    size: typingsSlinky.antd.antdStrings.default | large | small = null,
    style: CSSProperties = null,
    suffixIcon: TagMod[Any] = null,
    tabIndex: Int | Double = null,
    tokenSeparators: js.Array[String] = null,
    transitionName: String = null,
    value: T = null
  ): SelectProps[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (!js.isUndefined(autoClearSearchValue)) __obj.updateDynamic("autoClearSearchValue")(autoClearSearchValue.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (choiceTransitionName != null) __obj.updateDynamic("choiceTransitionName")(choiceTransitionName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActiveFirstOption)) __obj.updateDynamic("defaultActiveFirstOption")(defaultActiveFirstOption.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdownMatchSelectWidth)) __obj.updateDynamic("dropdownMatchSelectWidth")(dropdownMatchSelectWidth.asInstanceOf[js.Any])
    if (dropdownMenuStyle != null) __obj.updateDynamic("dropdownMenuStyle")(dropdownMenuStyle.asInstanceOf[js.Any])
    if (dropdownRender != null) __obj.updateDynamic("dropdownRender")(js.Any.fromFunction2(dropdownRender))
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle.asInstanceOf[js.Any])
    if (filterOption != null) __obj.updateDynamic("filterOption")(filterOption.asInstanceOf[js.Any])
    if (firstActiveValue != null) __obj.updateDynamic("firstActiveValue")(firstActiveValue.asInstanceOf[js.Any])
    if (getInputElement != null) __obj.updateDynamic("getInputElement")(js.Any.fromFunction0(getInputElement))
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(labelInValue)) __obj.updateDynamic("labelInValue")(labelInValue.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (maxTagCount != null) __obj.updateDynamic("maxTagCount")(maxTagCount.asInstanceOf[js.Any])
    if (maxTagPlaceholder != null) __obj.updateDynamic("maxTagPlaceholder")(maxTagPlaceholder.asInstanceOf[js.Any])
    if (maxTagTextLength != null) __obj.updateDynamic("maxTagTextLength")(maxTagTextLength.asInstanceOf[js.Any])
    if (menuItemSelectedIcon != null) __obj.updateDynamic("menuItemSelectedIcon")(menuItemSelectedIcon.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction1(onDeselect))
    if (onDropdownVisibleChange != null) __obj.updateDynamic("onDropdownVisibleChange")(js.Any.fromFunction1(onDropdownVisibleChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onInputKeyDown != null) __obj.updateDynamic("onInputKeyDown")(js.Any.fromFunction1(onInputKeyDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onPopupScroll != null) __obj.updateDynamic("onPopupScroll")(js.Any.fromFunction1(onPopupScroll))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (optionFilterProp != null) __obj.updateDynamic("optionFilterProp")(optionFilterProp.asInstanceOf[js.Any])
    if (optionLabelProp != null) __obj.updateDynamic("optionLabelProp")(optionLabelProp.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (removeIcon != null) __obj.updateDynamic("removeIcon")(removeIcon.asInstanceOf[js.Any])
    if (showAction != null) __obj.updateDynamic("showAction")(showAction.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow.asInstanceOf[js.Any])
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tokenSeparators != null) __obj.updateDynamic("tokenSeparators")(tokenSeparators.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectProps[T]]
  }
}

