package typingsSlinky.rcSelect.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.rcSelect.mod.RcSelect.OptionProps
import typingsSlinky.rcSelect.mod.RcSelect.SelectProps
import typingsSlinky.rcSelect.mod.default
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcSelect
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("rc-select", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, id, multiple */
  def apply(
    allowClear: js.UndefOr[Boolean] = js.undefined,
    animation: String = null,
    choiceTransitionName: String = null,
    combobox: js.UndefOr[Boolean] = js.undefined,
    defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined,
    defaultLabel: String | js.Array[String] = null,
    defaultValue: String | js.Array[String] = null,
    dropdownClassName: String = null,
    dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.undefined,
    filterOption: js.UndefOr[Boolean] = js.undefined,
    getInputElement: () => Node = null,
    getPopupContainer: /* trigger */ Node => Node = null,
    labelInValue: js.UndefOr[Boolean] = js.undefined,
    maxTagCount: Int | Double = null,
    maxTagPlaceholder: TagMod[Any] | js.Function = null,
    maxTagTextLength: Int | Double = null,
    notFoundContent: String = null,
    onBlur: () => Unit = null,
    onChange: (/* value */ String, /* label */ String) => Unit = null,
    onDeselect: (/* value */ String, ReactComponentClass[OptionProps]) => Unit = null,
    onFocus: () => Unit = null,
    onInputKeyDown: /* e */ Event_ => Unit = null,
    onPopupScroll: () => Unit = null,
    onSearch: () => Unit = null,
    onSelect: (/* value */ String, ReactComponentClass[OptionProps]) => Unit = null,
    optionFilterProp: String = null,
    optionLabelProp: String = null,
    placeholder: TagMod[Any] = null,
    prefixCls: String = null,
    showAction: js.Array[String] = null,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    tags: js.UndefOr[Boolean] = js.undefined,
    tokenSeparators: js.Array[String] = null,
    transitionName: String = null,
    value: String | js.Array[String] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (choiceTransitionName != null) __obj.updateDynamic("choiceTransitionName")(choiceTransitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(combobox)) __obj.updateDynamic("combobox")(combobox.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActiveFirstOption)) __obj.updateDynamic("defaultActiveFirstOption")(defaultActiveFirstOption.asInstanceOf[js.Any])
    if (defaultLabel != null) __obj.updateDynamic("defaultLabel")(defaultLabel.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdownMatchSelectWidth)) __obj.updateDynamic("dropdownMatchSelectWidth")(dropdownMatchSelectWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(filterOption)) __obj.updateDynamic("filterOption")(filterOption.asInstanceOf[js.Any])
    if (getInputElement != null) __obj.updateDynamic("getInputElement")(js.Any.fromFunction0(getInputElement))
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (!js.isUndefined(labelInValue)) __obj.updateDynamic("labelInValue")(labelInValue.asInstanceOf[js.Any])
    if (maxTagCount != null) __obj.updateDynamic("maxTagCount")(maxTagCount.asInstanceOf[js.Any])
    if (maxTagPlaceholder != null) __obj.updateDynamic("maxTagPlaceholder")(maxTagPlaceholder.asInstanceOf[js.Any])
    if (maxTagTextLength != null) __obj.updateDynamic("maxTagTextLength")(maxTagTextLength.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction2(onDeselect))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onInputKeyDown != null) __obj.updateDynamic("onInputKeyDown")(js.Any.fromFunction1(onInputKeyDown))
    if (onPopupScroll != null) __obj.updateDynamic("onPopupScroll")(js.Any.fromFunction0(onPopupScroll))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction0(onSearch))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (optionFilterProp != null) __obj.updateDynamic("optionFilterProp")(optionFilterProp.asInstanceOf[js.Any])
    if (optionLabelProp != null) __obj.updateDynamic("optionLabelProp")(optionLabelProp.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (showAction != null) __obj.updateDynamic("showAction")(showAction.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow.asInstanceOf[js.Any])
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(tags)) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (tokenSeparators != null) __obj.updateDynamic("tokenSeparators")(tokenSeparators.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.rcSelect.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SelectProps
}

