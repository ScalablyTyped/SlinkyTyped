package typingsSlinky.rcSelect.mod.RcSelect

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.Node
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectProps extends js.Object {
  var allowClear: js.UndefOr[Boolean] = js.undefined
  var animation: js.UndefOr[String] = js.undefined
  var choiceTransitionName: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var combobox: js.UndefOr[Boolean] = js.undefined
  var defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined
  var defaultLabel: js.UndefOr[String | js.Array[String]] = js.undefined
  var defaultValue: js.UndefOr[String | js.Array[String]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dropdownClassName: js.UndefOr[String] = js.undefined
  var dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.undefined
  var dropdownMenuStyle: js.UndefOr[StringDictionary[String]] = js.undefined
  var dropdownStyle: js.UndefOr[StringDictionary[String]] = js.undefined
  var filterOption: js.UndefOr[Boolean] = js.undefined
  var getInputElement: js.UndefOr[js.Function0[Node]] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* trigger */ Node, Node]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var labelInValue: js.UndefOr[Boolean] = js.undefined
  var maxTagCount: js.UndefOr[Double] = js.undefined
  var maxTagPlaceholder: js.UndefOr[ReactElement | js.Function] = js.undefined
  var maxTagTextLength: js.UndefOr[Double] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var notFoundContent: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* value */ String, /* label */ String, Unit]] = js.undefined
  var onDeselect: js.UndefOr[js.Function2[/* value */ String, ReactComponentClass[OptionProps], Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onInputKeyDown: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  var onPopupScroll: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSearch: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function2[/* value */ String, ReactComponentClass[OptionProps], Unit]] = js.undefined
  var optionFilterProp: js.UndefOr[String] = js.undefined
  var optionLabelProp: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[ReactElement] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var showAction: js.UndefOr[js.Array[String]] = js.undefined
  var showArrow: js.UndefOr[Boolean] = js.undefined
  var showSearch: js.UndefOr[Boolean] = js.undefined
  var tags: js.UndefOr[Boolean] = js.undefined
  var tokenSeparators: js.UndefOr[js.Array[String]] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | js.Array[String]] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowClear(value: Boolean): Self = this.set("allowClear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowClear: Self = this.set("allowClear", js.undefined)
    @scala.inline
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setChoiceTransitionName(value: String): Self = this.set("choiceTransitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChoiceTransitionName: Self = this.set("choiceTransitionName", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCombobox(value: Boolean): Self = this.set("combobox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCombobox: Self = this.set("combobox", js.undefined)
    @scala.inline
    def setDefaultActiveFirstOption(value: Boolean): Self = this.set("defaultActiveFirstOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultActiveFirstOption: Self = this.set("defaultActiveFirstOption", js.undefined)
    @scala.inline
    def setDefaultLabel(value: String | js.Array[String]): Self = this.set("defaultLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLabel: Self = this.set("defaultLabel", js.undefined)
    @scala.inline
    def setDefaultValue(value: String | js.Array[String]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDropdownClassName(value: String): Self = this.set("dropdownClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownClassName: Self = this.set("dropdownClassName", js.undefined)
    @scala.inline
    def setDropdownMatchSelectWidth(value: Boolean): Self = this.set("dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownMatchSelectWidth: Self = this.set("dropdownMatchSelectWidth", js.undefined)
    @scala.inline
    def setDropdownMenuStyle(value: StringDictionary[String]): Self = this.set("dropdownMenuStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownMenuStyle: Self = this.set("dropdownMenuStyle", js.undefined)
    @scala.inline
    def setDropdownStyle(value: StringDictionary[String]): Self = this.set("dropdownStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownStyle: Self = this.set("dropdownStyle", js.undefined)
    @scala.inline
    def setFilterOption(value: Boolean): Self = this.set("filterOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterOption: Self = this.set("filterOption", js.undefined)
    @scala.inline
    def setGetInputElement(value: () => Node): Self = this.set("getInputElement", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetInputElement: Self = this.set("getInputElement", js.undefined)
    @scala.inline
    def setGetPopupContainer(value: /* trigger */ Node => Node): Self = this.set("getPopupContainer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLabelInValue(value: Boolean): Self = this.set("labelInValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelInValue: Self = this.set("labelInValue", js.undefined)
    @scala.inline
    def setMaxTagCount(value: Double): Self = this.set("maxTagCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTagCount: Self = this.set("maxTagCount", js.undefined)
    @scala.inline
    def setMaxTagPlaceholderReactElement(value: ReactElement): Self = this.set("maxTagPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxTagPlaceholder(value: ReactElement | js.Function): Self = this.set("maxTagPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTagPlaceholder: Self = this.set("maxTagPlaceholder", js.undefined)
    @scala.inline
    def setMaxTagTextLength(value: Double): Self = this.set("maxTagTextLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTagTextLength: Self = this.set("maxTagTextLength", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setNotFoundContent(value: String): Self = this.set("notFoundContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotFoundContent: Self = this.set("notFoundContent", js.undefined)
    @scala.inline
    def setOnBlur(value: () => Unit): Self = this.set("onBlur", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(value: (/* value */ String, /* label */ String) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnDeselect(value: (/* value */ String, ReactComponentClass[OptionProps]) => Unit): Self = this.set("onDeselect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDeselect: Self = this.set("onDeselect", js.undefined)
    @scala.inline
    def setOnFocus(value: () => Unit): Self = this.set("onFocus", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnInputKeyDown(value: /* e */ Event => Unit): Self = this.set("onInputKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInputKeyDown: Self = this.set("onInputKeyDown", js.undefined)
    @scala.inline
    def setOnPopupScroll(value: () => Unit): Self = this.set("onPopupScroll", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPopupScroll: Self = this.set("onPopupScroll", js.undefined)
    @scala.inline
    def setOnSearch(value: () => Unit): Self = this.set("onSearch", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSearch: Self = this.set("onSearch", js.undefined)
    @scala.inline
    def setOnSelect(value: (/* value */ String, ReactComponentClass[OptionProps]) => Unit): Self = this.set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOptionFilterProp(value: String): Self = this.set("optionFilterProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionFilterProp: Self = this.set("optionFilterProp", js.undefined)
    @scala.inline
    def setOptionLabelProp(value: String): Self = this.set("optionLabelProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionLabelProp: Self = this.set("optionLabelProp", js.undefined)
    @scala.inline
    def setPlaceholderReactElement(value: ReactElement): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaceholder(value: ReactElement): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setShowAction(value: js.Array[String]): Self = this.set("showAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAction: Self = this.set("showAction", js.undefined)
    @scala.inline
    def setShowArrow(value: Boolean): Self = this.set("showArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowArrow: Self = this.set("showArrow", js.undefined)
    @scala.inline
    def setShowSearch(value: Boolean): Self = this.set("showSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSearch: Self = this.set("showSearch", js.undefined)
    @scala.inline
    def setTags(value: Boolean): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTokenSeparators(value: js.Array[String]): Self = this.set("tokenSeparators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenSeparators: Self = this.set("tokenSeparators", js.undefined)
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
    @scala.inline
    def setValue(value: String | js.Array[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

