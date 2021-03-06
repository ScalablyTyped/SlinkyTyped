package typingsSlinky.rcPicker.components

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.Components
import typingsSlinky.rcPicker.interfaceMod.CustomFormat
import typingsSlinky.rcPicker.interfaceMod.DisabledTimes
import typingsSlinky.rcPicker.interfaceMod.EventValue
import typingsSlinky.rcPicker.interfaceMod.Locale
import typingsSlinky.rcPicker.interfaceMod.PanelMode
import typingsSlinky.rcPicker.interfaceMod.PickerMode
import typingsSlinky.rcPicker.interfaceMod.RangeValue
import typingsSlinky.rcPicker.pickerMod.PickerRefConfig
import typingsSlinky.rcPicker.rangePickerMod.RangeInfo
import typingsSlinky.rcPicker.rangePickerMod.RangeShowTimeObject
import typingsSlinky.rcPicker.rangePickerMod.RangeType
import typingsSlinky.rcPicker.rcPickerNumbers.`0`
import typingsSlinky.rcPicker.rcPickerNumbers.`1`
import typingsSlinky.rcPicker.rcPickerStrings.`additions removals`
import typingsSlinky.rcPicker.rcPickerStrings.`additions text`
import typingsSlinky.rcPicker.rcPickerStrings.`inline`
import typingsSlinky.rcPicker.rcPickerStrings.`removals additions`
import typingsSlinky.rcPicker.rcPickerStrings.`removals text`
import typingsSlinky.rcPicker.rcPickerStrings.`text additions`
import typingsSlinky.rcPicker.rcPickerStrings.`text removals`
import typingsSlinky.rcPicker.rcPickerStrings.additions
import typingsSlinky.rcPicker.rcPickerStrings.all
import typingsSlinky.rcPicker.rcPickerStrings.ascending
import typingsSlinky.rcPicker.rcPickerStrings.assertive
import typingsSlinky.rcPicker.rcPickerStrings.both
import typingsSlinky.rcPicker.rcPickerStrings.copy
import typingsSlinky.rcPicker.rcPickerStrings.date
import typingsSlinky.rcPicker.rcPickerStrings.descending
import typingsSlinky.rcPicker.rcPickerStrings.dialog
import typingsSlinky.rcPicker.rcPickerStrings.execute
import typingsSlinky.rcPicker.rcPickerStrings.grammar
import typingsSlinky.rcPicker.rcPickerStrings.grid
import typingsSlinky.rcPicker.rcPickerStrings.horizontal
import typingsSlinky.rcPicker.rcPickerStrings.link
import typingsSlinky.rcPicker.rcPickerStrings.list
import typingsSlinky.rcPicker.rcPickerStrings.listbox
import typingsSlinky.rcPicker.rcPickerStrings.location
import typingsSlinky.rcPicker.rcPickerStrings.ltr
import typingsSlinky.rcPicker.rcPickerStrings.menu
import typingsSlinky.rcPicker.rcPickerStrings.mixed
import typingsSlinky.rcPicker.rcPickerStrings.move
import typingsSlinky.rcPicker.rcPickerStrings.none
import typingsSlinky.rcPicker.rcPickerStrings.off
import typingsSlinky.rcPicker.rcPickerStrings.other
import typingsSlinky.rcPicker.rcPickerStrings.page
import typingsSlinky.rcPicker.rcPickerStrings.polite
import typingsSlinky.rcPicker.rcPickerStrings.popup
import typingsSlinky.rcPicker.rcPickerStrings.removals
import typingsSlinky.rcPicker.rcPickerStrings.rtl
import typingsSlinky.rcPicker.rcPickerStrings.spelling
import typingsSlinky.rcPicker.rcPickerStrings.step
import typingsSlinky.rcPicker.rcPickerStrings.text
import typingsSlinky.rcPicker.rcPickerStrings.time
import typingsSlinky.rcPicker.rcPickerStrings.tree
import typingsSlinky.rcPicker.rcPickerStrings.vertical
import typingsSlinky.rcTrigger.interfaceMod.AlignType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.std.Exclude
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RangePicker {
  
  object RangePickerBaseProps {
    
    @scala.inline
    def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: Exclude[PickerMode, date | time]): Builder[DateType] = {
      val __props = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
      new Builder[DateType](js.Array(this.component, __props.asInstanceOf[typingsSlinky.rcPicker.rangePickerMod.RangePickerBaseProps[DateType]]))
    }
    
    @JSImport("rc-picker", "RangePicker")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder[DateType] (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.rcPicker.mod.RangePicker[DateType]] {
      
      @scala.inline
      def activePickerIndex(value: `0` | `1`): this.type = set("activePickerIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def allowClear(value: Boolean): this.type = set("allowClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def allowEmpty(value: js.Tuple2[Boolean, Boolean]): this.type = set("allowEmpty", value.asInstanceOf[js.Any])
      
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
      def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def clearIcon(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def clearIconReactElement(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def components(value: Components): this.type = set("components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dateRender(value: (DateType, DateType, /* info */ RangeInfo) => ReactElement): this.type = set("dateRender", js.Any.fromFunction3(value))
      
      @scala.inline
      def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultPickerValue(value: js.Tuple2[DateType, DateType]): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValue(value: RangeValue[DateType]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValueNull: this.type = set("defaultValue", null)
      
      @scala.inline
      def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledDate(value: DateType => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def disabledTime(value: (/* date */ EventValue[DateType], /* type */ RangeType) => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction2(value))
      
      @scala.inline
      def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def format(value: String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])): this.type = set("format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def formatFunction1(value: DateType => String): this.type = set("format", js.Any.fromFunction1(value))
      
      @scala.inline
      def formatVarargs(value: (String | CustomFormat[DateType])*): this.type = set("format", js.Array(value :_*))
      
      @scala.inline
      def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inputReadOnly(value: Boolean): this.type = set("inputReadOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def mode(value: js.Tuple2[PanelMode, PanelMode]): this.type = set("mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def monthCellRender(value: (DateType, /* locale */ Locale) => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nextIcon(value: ReactElement): this.type = set("nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nextIconReactElement(value: ReactElement): this.type = set("nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCalendarChange(
        value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Unit
      ): this.type = set("onCalendarChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def onChange(value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def onFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onOk(value: /* dates */ RangeValue[DateType] => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def onOpenChange(value: /* open */ Boolean => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPanelChange(value: (/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def panelRender(value: /* originPanel */ ReactElement => ReactElement): this.type = set("panelRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def pickerRef(value: MutableRefObject[PickerRefConfig]): this.type = set("pickerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def placeholder(value: js.Tuple2[String, String]): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def popupStyle(value: CSSProperties): this.type = set("popupStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prevIcon(value: ReactElement): this.type = set("prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prevIconReactElement(value: ReactElement): this.type = set("prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def ranges(
        value: Record[
              String, 
              (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
            ]
      ): this.type = set("ranges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def renderExtraFooter(value: /* mode */ PanelMode => ReactElement): this.type = set("renderExtraFooter", js.Any.fromFunction1(value))
      
      @scala.inline
      def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def separator(value: ReactElement): this.type = set("separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def separatorReactElement(value: ReactElement): this.type = set("separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suffixIcon(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suffixIconReactElement(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def superNextIcon(value: ReactElement): this.type = set("superNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def superNextIconReactElement(value: ReactElement): this.type = set("superNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def superPrevIcon(value: ReactElement): this.type = set("superPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def superPrevIconReactElement(value: ReactElement): this.type = set("superPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: RangeValue[DateType]): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valueNull: this.type = set("value", null)
    }
    
    def withProps[DateType](p: typingsSlinky.rcPicker.rangePickerMod.RangePickerBaseProps[DateType]): Builder[DateType] = new Builder[DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object RangePickerDateProps {
    
    @scala.inline
    def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): Builder[DateType] = {
      val __props = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      new Builder[DateType](js.Array(this.component, __props.asInstanceOf[typingsSlinky.rcPicker.rangePickerMod.RangePickerDateProps[DateType]]))
    }
    
    @JSImport("rc-picker", "RangePicker")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder[DateType] (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.rcPicker.mod.RangePicker[DateType]] {
      
      @scala.inline
      def activePickerIndex(value: `0` | `1`): this.type = set("activePickerIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def allowClear(value: Boolean): this.type = set("allowClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def allowEmpty(value: js.Tuple2[Boolean, Boolean]): this.type = set("allowEmpty", value.asInstanceOf[js.Any])
      
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
      def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def clearIcon(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def clearIconReactElement(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def components(value: Components): this.type = set("components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dateRender(value: (DateType, DateType, /* info */ RangeInfo) => ReactElement): this.type = set("dateRender", js.Any.fromFunction3(value))
      
      @scala.inline
      def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultPickerValue(value: js.Tuple2[DateType, DateType]): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValue(value: RangeValue[DateType]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValueNull: this.type = set("defaultValue", null)
      
      @scala.inline
      def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledDate(value: DateType => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def disabledTime(value: (/* date */ EventValue[DateType], /* type */ RangeType) => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction2(value))
      
      @scala.inline
      def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def format(value: String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])): this.type = set("format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def formatFunction1(value: DateType => String): this.type = set("format", js.Any.fromFunction1(value))
      
      @scala.inline
      def formatVarargs(value: (String | CustomFormat[DateType])*): this.type = set("format", js.Array(value :_*))
      
      @scala.inline
      def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inputReadOnly(value: Boolean): this.type = set("inputReadOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def mode(value: js.Tuple2[PanelMode, PanelMode]): this.type = set("mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def monthCellRender(value: (DateType, /* locale */ Locale) => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nextIcon(value: ReactElement): this.type = set("nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nextIconReactElement(value: ReactElement): this.type = set("nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCalendarChange(
        value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Unit
      ): this.type = set("onCalendarChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def onChange(value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def onFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onOk(value: /* dates */ RangeValue[DateType] => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def onOpenChange(value: /* open */ Boolean => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPanelChange(value: (/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def panelRender(value: /* originPanel */ ReactElement => ReactElement): this.type = set("panelRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def picker(value: date): this.type = set("picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def pickerRef(value: MutableRefObject[PickerRefConfig]): this.type = set("pickerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def placeholder(value: js.Tuple2[String, String]): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def popupStyle(value: CSSProperties): this.type = set("popupStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prevIcon(value: ReactElement): this.type = set("prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prevIconReactElement(value: ReactElement): this.type = set("prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def ranges(
        value: Record[
              String, 
              (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
            ]
      ): this.type = set("ranges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def renderExtraFooter(value: /* mode */ PanelMode => ReactElement): this.type = set("renderExtraFooter", js.Any.fromFunction1(value))
      
      @scala.inline
      def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def separator(value: ReactElement): this.type = set("separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def separatorReactElement(value: ReactElement): this.type = set("separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showNow(value: Boolean): this.type = set("showNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showTime(value: Boolean | RangeShowTimeObject[DateType]): this.type = set("showTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suffixIcon(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suffixIconReactElement(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def superNextIcon(value: ReactElement): this.type = set("superNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def superNextIconReactElement(value: ReactElement): this.type = set("superNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def superPrevIcon(value: ReactElement): this.type = set("superPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def superPrevIconReactElement(value: ReactElement): this.type = set("superPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: RangeValue[DateType]): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valueNull: this.type = set("value", null)
    }
    
    def withProps[DateType](p: typingsSlinky.rcPicker.rangePickerMod.RangePickerDateProps[DateType]): Builder[DateType] = new Builder[DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object RangePickerTimeProps {
    
    @scala.inline
    def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: time): Builder[DateType] = {
      val __props = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
      new Builder[DateType](js.Array(this.component, __props.asInstanceOf[typingsSlinky.rcPicker.rangePickerMod.RangePickerTimeProps[DateType]]))
    }
    
    @JSImport("rc-picker", "RangePicker")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder[DateType] (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.rcPicker.mod.RangePicker[DateType]] {
      
      @scala.inline
      def activePickerIndex(value: `0` | `1`): this.type = set("activePickerIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def allowClear(value: Boolean): this.type = set("allowClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def allowEmpty(value: js.Tuple2[Boolean, Boolean]): this.type = set("allowEmpty", value.asInstanceOf[js.Any])
      
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
      def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def clearIcon(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def clearIconReactElement(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def components(value: Components): this.type = set("components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dateRender(value: (DateType, DateType, /* info */ RangeInfo) => ReactElement): this.type = set("dateRender", js.Any.fromFunction3(value))
      
      @scala.inline
      def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultOpenValue(value: DateType): this.type = set("defaultOpenValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultPickerValue(value: js.Tuple2[DateType, DateType]): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValue(value: RangeValue[DateType]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValueNull: this.type = set("defaultValue", null)
      
      @scala.inline
      def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledDate(value: DateType => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def disabledHours(value: () => js.Array[Double]): this.type = set("disabledHours", js.Any.fromFunction0(value))
      
      @scala.inline
      def disabledMinutes(value: /* hour */ Double => js.Array[Double]): this.type = set("disabledMinutes", js.Any.fromFunction1(value))
      
      @scala.inline
      def disabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): this.type = set("disabledSeconds", js.Any.fromFunction2(value))
      
      @scala.inline
      def disabledTime(value: (/* date */ EventValue[DateType], /* type */ RangeType) => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction2(value))
      
      @scala.inline
      def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def format(value: String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])): this.type = set("format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def formatFunction1(value: DateType => String): this.type = set("format", js.Any.fromFunction1(value))
      
      @scala.inline
      def formatVarargs(value: (String | CustomFormat[DateType])*): this.type = set("format", js.Array(value :_*))
      
      @scala.inline
      def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def hideDisabledOptions(value: Boolean): this.type = set("hideDisabledOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hourStep(value: Double): this.type = set("hourStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inputReadOnly(value: Boolean): this.type = set("inputReadOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def minuteStep(value: Double): this.type = set("minuteStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def mode(value: js.Tuple2[PanelMode, PanelMode]): this.type = set("mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def monthCellRender(value: (DateType, /* locale */ Locale) => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nextIcon(value: ReactElement): this.type = set("nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nextIconReactElement(value: ReactElement): this.type = set("nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCalendarChange(
        value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Unit
      ): this.type = set("onCalendarChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def onChange(value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def onFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onOk(value: /* dates */ RangeValue[DateType] => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def onOpenChange(value: /* open */ Boolean => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPanelChange(value: (/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def order(value: Boolean): this.type = set("order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def panelRender(value: /* originPanel */ ReactElement => ReactElement): this.type = set("panelRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def pickerRef(value: MutableRefObject[PickerRefConfig]): this.type = set("pickerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def placeholder(value: js.Tuple2[String, String]): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def popupStyle(value: CSSProperties): this.type = set("popupStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prevIcon(value: ReactElement): this.type = set("prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prevIconReactElement(value: ReactElement): this.type = set("prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def ranges(
        value: Record[
              String, 
              (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
            ]
      ): this.type = set("ranges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def renderExtraFooter(value: /* mode */ PanelMode => ReactElement): this.type = set("renderExtraFooter", js.Any.fromFunction1(value))
      
      @scala.inline
      def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def secondStep(value: Double): this.type = set("secondStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def separator(value: ReactElement): this.type = set("separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def separatorReactElement(value: ReactElement): this.type = set("separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showHour(value: Boolean): this.type = set("showHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showMinute(value: Boolean): this.type = set("showMinute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showNow(value: Boolean): this.type = set("showNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showSecond(value: Boolean): this.type = set("showSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suffixIcon(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suffixIconReactElement(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def superNextIcon(value: ReactElement): this.type = set("superNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def superNextIconReactElement(value: ReactElement): this.type = set("superNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def superPrevIcon(value: ReactElement): this.type = set("superPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def superPrevIconReactElement(value: ReactElement): this.type = set("superPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def use12Hours(value: Boolean): this.type = set("use12Hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: RangeValue[DateType]): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valueNull: this.type = set("value", null)
    }
    
    def withProps[DateType](p: typingsSlinky.rcPicker.rangePickerMod.RangePickerTimeProps[DateType]): Builder[DateType] = new Builder[DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
