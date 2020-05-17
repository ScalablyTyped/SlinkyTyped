package typingsSlinky.rcSelect.mod.RcSelect

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.Node
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectProps extends js.Object {
  var allowClear: js.UndefOr[Boolean] = js.native
  var animation: js.UndefOr[String] = js.native
  var choiceTransitionName: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var combobox: js.UndefOr[Boolean] = js.native
  var defaultActiveFirstOption: js.UndefOr[Boolean] = js.native
  var defaultLabel: js.UndefOr[String | js.Array[String]] = js.native
  var defaultValue: js.UndefOr[String | js.Array[String]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var dropdownClassName: js.UndefOr[String] = js.native
  var dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.native
  var dropdownMenuStyle: js.UndefOr[StringDictionary[String]] = js.native
  var dropdownStyle: js.UndefOr[StringDictionary[String]] = js.native
  var filterOption: js.UndefOr[Boolean] = js.native
  var getInputElement: js.UndefOr[js.Function0[Node]] = js.native
  var getPopupContainer: js.UndefOr[js.Function1[/* trigger */ Node, Node]] = js.native
  var id: js.UndefOr[String] = js.native
  var labelInValue: js.UndefOr[Boolean] = js.native
  var maxTagCount: js.UndefOr[Double] = js.native
  var maxTagPlaceholder: js.UndefOr[TagMod[Any] | js.Function] = js.native
  var maxTagTextLength: js.UndefOr[Double] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var notFoundContent: js.UndefOr[String] = js.native
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.native
  var onChange: js.UndefOr[js.Function2[/* value */ String, /* label */ String, Unit]] = js.native
  var onDeselect: js.UndefOr[js.Function2[/* value */ String, ReactComponentClass[OptionProps], Unit]] = js.native
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.native
  var onInputKeyDown: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  var onPopupScroll: js.UndefOr[js.Function0[Unit]] = js.native
  var onSearch: js.UndefOr[js.Function0[Unit]] = js.native
  var onSelect: js.UndefOr[js.Function2[/* value */ String, ReactComponentClass[OptionProps], Unit]] = js.native
  var optionFilterProp: js.UndefOr[String] = js.native
  var optionLabelProp: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[TagMod[Any]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var showAction: js.UndefOr[js.Array[String]] = js.native
  var showArrow: js.UndefOr[Boolean] = js.native
  var showSearch: js.UndefOr[Boolean] = js.native
  var tags: js.UndefOr[Boolean] = js.native
  var tokenSeparators: js.UndefOr[js.Array[String]] = js.native
  var transitionName: js.UndefOr[String] = js.native
  var value: js.UndefOr[String | js.Array[String]] = js.native
}

object SelectProps {
  @scala.inline
  def apply(): SelectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectProps]
  }
  @scala.inline
  implicit class SelectPropsOps[Self <: SelectProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowClear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowClear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowClear")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withChoiceTransitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choiceTransitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChoiceTransitionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choiceTransitionName")(js.undefined)
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
    def withCombobox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combobox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCombobox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combobox")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultActiveFirstOption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActiveFirstOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultActiveFirstOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActiveFirstOption")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLabel(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
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
    def withDropdownClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownMatchSelectWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownMatchSelectWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownMatchSelectWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownMatchSelectWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownMenuStyle(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownMenuStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownMenuStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownMenuStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownStyle(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterOption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOption")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInputElement(value: () => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInputElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInputElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInputElement")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPopupContainer(value: /* trigger */ Node => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopupContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPopupContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopupContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelInValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelInValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelInValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelInValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTagCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTagCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTagCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTagCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTagPlaceholderReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTagPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxTagPlaceholder(value: TagMod[Any] | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTagPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTagPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTagPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTagTextLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTagTextLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTagTextLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTagTextLength")(js.undefined)
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
    def withNotFoundContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotFoundContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundContent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* value */ String, /* label */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDeselect(value: (/* value */ String, ReactComponentClass[OptionProps]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeselect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDeselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeselect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInputKeyDown(value: /* e */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInputKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPopupScroll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPopupScroll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPopupScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPopupScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSearch(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: (/* value */ String, ReactComponentClass[OptionProps]) => Unit): Self = {
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
    def withOptionFilterProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionFilterProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionFilterProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionFilterProp")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionLabelProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionLabelProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionLabelProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionLabelProp")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
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
    def withShowAction(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAction")(js.undefined)
        ret
    }
    @scala.inline
    def withShowArrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenSeparators(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenSeparators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenSeparators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenSeparators")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

