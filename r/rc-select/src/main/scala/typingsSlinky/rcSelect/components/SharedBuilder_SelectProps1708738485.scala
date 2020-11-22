package typingsSlinky.rcSelect.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticUIEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcSelect.anon.Mark
import typingsSlinky.rcSelect.generatorMod.CustomTagProps
import typingsSlinky.rcSelect.generatorMod.FilterFunc
import typingsSlinky.rcSelect.generatorMod.LabelValueType
import typingsSlinky.rcSelect.generatorMod.SingleType
import typingsSlinky.rcSelect.interfaceMod.Mode
import typingsSlinky.rcSelect.interfaceMod.OptionData
import typingsSlinky.rcSelect.interfaceMod.OptionGroupData
import typingsSlinky.rcSelect.interfaceMod.OptionsType
import typingsSlinky.rcSelect.interfaceMod.RenderNode
import typingsSlinky.rcSelect.rcSelectStrings.click
import typingsSlinky.rcSelect.rcSelectStrings.focus
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.reactStrings.`additions removals`
import typingsSlinky.react.reactStrings.`additions text`
import typingsSlinky.react.reactStrings.`inline`
import typingsSlinky.react.reactStrings.`removals additions`
import typingsSlinky.react.reactStrings.`removals text`
import typingsSlinky.react.reactStrings.`text additions`
import typingsSlinky.react.reactStrings.`text removals`
import typingsSlinky.react.reactStrings.additions
import typingsSlinky.react.reactStrings.all
import typingsSlinky.react.reactStrings.ascending
import typingsSlinky.react.reactStrings.assertive
import typingsSlinky.react.reactStrings.both
import typingsSlinky.react.reactStrings.copy
import typingsSlinky.react.reactStrings.date
import typingsSlinky.react.reactStrings.descending
import typingsSlinky.react.reactStrings.dialog
import typingsSlinky.react.reactStrings.execute
import typingsSlinky.react.reactStrings.grammar
import typingsSlinky.react.reactStrings.grid
import typingsSlinky.react.reactStrings.horizontal
import typingsSlinky.react.reactStrings.link
import typingsSlinky.react.reactStrings.list
import typingsSlinky.react.reactStrings.listbox
import typingsSlinky.react.reactStrings.location
import typingsSlinky.react.reactStrings.menu
import typingsSlinky.react.reactStrings.mixed
import typingsSlinky.react.reactStrings.move
import typingsSlinky.react.reactStrings.none
import typingsSlinky.react.reactStrings.off
import typingsSlinky.react.reactStrings.other
import typingsSlinky.react.reactStrings.page
import typingsSlinky.react.reactStrings.polite
import typingsSlinky.react.reactStrings.popup
import typingsSlinky.react.reactStrings.removals
import typingsSlinky.react.reactStrings.spelling
import typingsSlinky.react.reactStrings.step
import typingsSlinky.react.reactStrings.text
import typingsSlinky.react.reactStrings.time
import typingsSlinky.react.reactStrings.tree
import typingsSlinky.react.reactStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_SelectProps1708738485[R <: js.Object, VT] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def allowClear(value: Boolean): this.type = set("allowClear", value.asInstanceOf[js.Any])
  
  @scala.inline
  def animation(value: String): this.type = set("animation", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-atomic`(value: Boolean): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-busy`(value: Boolean): this.type = set("aria-busy", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-disabled`(value: Boolean): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-expanded`(value: Boolean): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-grabbed`(value: Boolean): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-hidden`(value: Boolean): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-modal`(value: Boolean): this.type = set("aria-modal", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-multiline`(value: Boolean): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-multiselectable`(value: Boolean): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-readonly`(value: Boolean): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-relevant`(
    value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
  ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-required`(value: Boolean): this.type = set("aria-required", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-selected`(value: Boolean): this.type = set("aria-selected", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
  
  @scala.inline
  def autoClearSearchValue(value: Boolean): this.type = set("autoClearSearchValue", value.asInstanceOf[js.Any])
  
  @scala.inline
  def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  
  @scala.inline
  def backfill(value: Boolean): this.type = set("backfill", value.asInstanceOf[js.Any])
  
  @scala.inline
  def choiceTransitionName(value: String): this.type = set("choiceTransitionName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def clearIconReactElement(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def clearIcon(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultActiveFirstOption(value: Boolean): this.type = set("defaultActiveFirstOption", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultValue(value: VT): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  @scala.inline
  def direction(value: String): this.type = set("direction", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dropdownAlign(value: js.Any): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dropdownMatchSelectWidth(value: Boolean | Double): this.type = set("dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dropdownRender(value: /* menu */ ReactElement => ReactElement): this.type = set("dropdownRender", js.Any.fromFunction1(value))
  
  @scala.inline
  def dropdownStyle(value: CSSProperties): this.type = set("dropdownStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def filterOptionFunction2(
    value: (/* inputValue */ String, /* option */ js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ js.Any
    ]) => Boolean
  ): this.type = set("filterOption", js.Any.fromFunction2(value))
  
  @scala.inline
  def filterOption(
    value: Boolean | (FilterFunc[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ js.Any
    ])
  ): this.type = set("filterOption", value.asInstanceOf[js.Any])
  
  @scala.inline
  def getInputElement(value: () => ReactElement): this.type = set("getInputElement", js.Any.fromFunction0(value))
  
  @scala.inline
  def getPopupContainer(value: /* props */ js.Any => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
  
  @scala.inline
  def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  @scala.inline
  def inputIconReactElement(value: ReactElement): this.type = set("inputIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def inputIconFunction1(value: /* props */ js.Any => ReactElement): this.type = set("inputIcon", js.Any.fromFunction1(value))
  
  @scala.inline
  def inputIcon(value: RenderNode): this.type = set("inputIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def inputValue(value: String): this.type = set("inputValue", value.asInstanceOf[js.Any])
  
  @scala.inline
  def internalProps(value: Mark[OptionsType]): this.type = set("internalProps", value.asInstanceOf[js.Any])
  
  @scala.inline
  def labelInValue(value: Boolean): this.type = set("labelInValue", value.asInstanceOf[js.Any])
  
  @scala.inline
  def listHeight(value: Double): this.type = set("listHeight", value.asInstanceOf[js.Any])
  
  @scala.inline
  def listItemHeight(value: Double): this.type = set("listItemHeight", value.asInstanceOf[js.Any])
  
  @scala.inline
  def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maxTagCount(value: Double): this.type = set("maxTagCount", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maxTagPlaceholderReactElement(value: ReactElement): this.type = set("maxTagPlaceholder", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maxTagPlaceholderFunction1(value: /* omittedValues */ js.Array[LabelValueType] => ReactElement): this.type = set("maxTagPlaceholder", js.Any.fromFunction1(value))
  
  @scala.inline
  def maxTagPlaceholder(value: ReactElement | (js.Function1[/* omittedValues */ js.Array[LabelValueType], ReactElement])): this.type = set("maxTagPlaceholder", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maxTagTextLength(value: Double): this.type = set("maxTagTextLength", value.asInstanceOf[js.Any])
  
  @scala.inline
  def menuItemSelectedIconReactElement(value: ReactElement): this.type = set("menuItemSelectedIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def menuItemSelectedIconFunction1(value: /* props */ js.Any => ReactElement): this.type = set("menuItemSelectedIcon", js.Any.fromFunction1(value))
  
  @scala.inline
  def menuItemSelectedIcon(value: RenderNode): this.type = set("menuItemSelectedIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def mode(value: Mode): this.type = set("mode", value.asInstanceOf[js.Any])
  
  @scala.inline
  def notFoundContentReactElement(value: ReactElement): this.type = set("notFoundContent", value.asInstanceOf[js.Any])
  
  @scala.inline
  def notFoundContent(value: ReactElement): this.type = set("notFoundContent", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onBlur(value: SyntheticFocusEvent[HTMLElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
  
  @scala.inline
  def onChange(
    value: (VT, /* option */ (/* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ js.Any) | OptionsType) => Unit
  ): this.type = set("onChange", js.Any.fromFunction2(value))
  
  @scala.inline
  def onClear(value: () => Unit): this.type = set("onClear", js.Any.fromFunction0(value))
  
  @scala.inline
  def onClick(value: SyntheticMouseEvent[Element] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDeselect(
    value: (/* value */ SingleType[VT], /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ /* option */ js.Any) => Unit
  ): this.type = set("onDeselect", js.Any.fromFunction2(value))
  
  @scala.inline
  def onDropdownVisibleChange(value: /* open */ Boolean => Unit): this.type = set("onDropdownVisibleChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onFocus(value: SyntheticFocusEvent[HTMLElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
  
  @scala.inline
  def onInputKeyDown(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): this.type = set("onInputKeyDown", js.Any.fromFunction1(value))
  
  @scala.inline
  def onKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
  
  @scala.inline
  def onKeyUp(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPopupScroll(value: SyntheticUIEvent[HTMLDivElement] => Unit): this.type = set("onPopupScroll", js.Any.fromFunction1(value))
  
  @scala.inline
  def onSearch(value: /* value */ String => Unit): this.type = set("onSearch", js.Any.fromFunction1(value))
  
  @scala.inline
  def onSelect(
    value: (/* value */ SingleType[VT], /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ /* option */ js.Any) => Unit
  ): this.type = set("onSelect", js.Any.fromFunction2(value))
  
  @scala.inline
  def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
  
  @scala.inline
  def optionFilterProp(value: String): this.type = set("optionFilterProp", value.asInstanceOf[js.Any])
  
  @scala.inline
  def optionLabelProp(value: String): this.type = set("optionLabelProp", value.asInstanceOf[js.Any])
  
  @scala.inline
  def optionsVarargs(value: (OptionData | OptionGroupData)*): this.type = set("options", js.Array(value :_*))
  
  @scala.inline
  def options(value: OptionsType): this.type = set("options", value.asInstanceOf[js.Any])
  
  @scala.inline
  def placeholderReactElement(value: ReactElement): this.type = set("placeholder", value.asInstanceOf[js.Any])
  
  @scala.inline
  def placeholder(value: ReactElement): this.type = set("placeholder", value.asInstanceOf[js.Any])
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def removeIconReactElement(value: ReactElement): this.type = set("removeIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def removeIcon(value: ReactElement): this.type = set("removeIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def searchValue(value: String): this.type = set("searchValue", value.asInstanceOf[js.Any])
  
  @scala.inline
  def showActionVarargs(value: (focus | click)*): this.type = set("showAction", js.Array(value :_*))
  
  @scala.inline
  def showAction(value: js.Array[focus | click]): this.type = set("showAction", value.asInstanceOf[js.Any])
  
  @scala.inline
  def showArrow(value: Boolean): this.type = set("showArrow", value.asInstanceOf[js.Any])
  
  @scala.inline
  def showSearch(value: Boolean): this.type = set("showSearch", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tagRender(value: /* props */ CustomTagProps => ReactElement): this.type = set("tagRender", js.Any.fromFunction1(value))
  
  @scala.inline
  def tokenSeparatorsVarargs(value: String*): this.type = set("tokenSeparators", js.Array(value :_*))
  
  @scala.inline
  def tokenSeparators(value: js.Array[String]): this.type = set("tokenSeparators", value.asInstanceOf[js.Any])
  
  @scala.inline
  def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def value(value: VT): this.type = set("value", value.asInstanceOf[js.Any])
  
  @scala.inline
  def virtual(value: Boolean): this.type = set("virtual", value.asInstanceOf[js.Any])
}
