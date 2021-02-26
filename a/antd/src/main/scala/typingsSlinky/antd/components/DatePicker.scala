package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.anon.PickPickPickerDatePropsMo
import typingsSlinky.antd.anon.PickPickPickerTimePropsMo
import typingsSlinky.antd.antdNumbers.`0`
import typingsSlinky.antd.antdNumbers.`1`
import typingsSlinky.antd.antdStrings.`additions removals`
import typingsSlinky.antd.antdStrings.`additions text`
import typingsSlinky.antd.antdStrings.`inline`
import typingsSlinky.antd.antdStrings.`removals additions`
import typingsSlinky.antd.antdStrings.`removals text`
import typingsSlinky.antd.antdStrings.`text additions`
import typingsSlinky.antd.antdStrings.`text removals`
import typingsSlinky.antd.antdStrings.additions
import typingsSlinky.antd.antdStrings.all
import typingsSlinky.antd.antdStrings.ascending
import typingsSlinky.antd.antdStrings.assertive
import typingsSlinky.antd.antdStrings.both
import typingsSlinky.antd.antdStrings.copy
import typingsSlinky.antd.antdStrings.date
import typingsSlinky.antd.antdStrings.descending
import typingsSlinky.antd.antdStrings.dialog
import typingsSlinky.antd.antdStrings.execute
import typingsSlinky.antd.antdStrings.grammar
import typingsSlinky.antd.antdStrings.grid
import typingsSlinky.antd.antdStrings.horizontal
import typingsSlinky.antd.antdStrings.link
import typingsSlinky.antd.antdStrings.list
import typingsSlinky.antd.antdStrings.listbox
import typingsSlinky.antd.antdStrings.location
import typingsSlinky.antd.antdStrings.ltr
import typingsSlinky.antd.antdStrings.menu
import typingsSlinky.antd.antdStrings.mixed
import typingsSlinky.antd.antdStrings.move
import typingsSlinky.antd.antdStrings.none
import typingsSlinky.antd.antdStrings.off
import typingsSlinky.antd.antdStrings.other
import typingsSlinky.antd.antdStrings.page
import typingsSlinky.antd.antdStrings.polite
import typingsSlinky.antd.antdStrings.popup
import typingsSlinky.antd.antdStrings.removals
import typingsSlinky.antd.antdStrings.rtl
import typingsSlinky.antd.antdStrings.spelling
import typingsSlinky.antd.antdStrings.step
import typingsSlinky.antd.antdStrings.text_
import typingsSlinky.antd.antdStrings.time
import typingsSlinky.antd.antdStrings.tree
import typingsSlinky.antd.antdStrings.vertical
import typingsSlinky.antd.configProviderSizeContextMod.SizeType
import typingsSlinky.antd.generatePickerMod.PickerLocale
import typingsSlinky.moment.mod.Moment
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
import typingsSlinky.rcPicker.timePanelMod.SharedTimeProps
import typingsSlinky.rcTrigger.interfaceMod.AlignType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.std.Exclude
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePicker {
  
  object PickerBaseProps {
    
    @scala.inline
    def apply(picker: Exclude[PickerMode, date | time]): Builder = {
      val __props = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.antd.generatePickerMod.PickerBaseProps[Moment]]))
    }
    
    object MonthPicker {
      
      @JSImport("antd", "DatePicker.MonthPicker")
      @js.native
      val component: js.Object = js.native
      
      implicit def make(companion: MonthPicker.type): SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.MonthPicker] = new SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.MonthPicker](js.Array(this.component, js.Dictionary.empty))()
      
      def withProps(p: PickPickPickerDatePropsMo): SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.MonthPicker] = new SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.MonthPicker](js.Array(this.component, p.asInstanceOf[js.Any]))
    }
    
    object QuarterPicker {
      
      @JSImport("antd", "DatePicker.QuarterPicker")
      @js.native
      val component: js.Object = js.native
      
      implicit def make(companion: QuarterPicker.type): SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.QuarterPicker] = new SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.QuarterPicker](js.Array(this.component, js.Dictionary.empty))()
      
      def withProps(p: PickPickPickerTimePropsMo): SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.QuarterPicker] = new SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.QuarterPicker](js.Array(this.component, p.asInstanceOf[js.Any]))
    }
    
    object RangePicker {
      
      object RangePickerBaseProps {
        
        @scala.inline
        def apply(picker: Exclude[PickerMode, date | time]): typingsSlinky.antd.components.DatePicker.PickerBaseProps.RangePicker.RangePickerBaseProps.Builder = {
          val __props = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
          new typingsSlinky.antd.components.DatePicker.PickerBaseProps.RangePicker.RangePickerBaseProps.Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.antd.generatePickerMod.RangePickerBaseProps[Moment]]))
        }
        
        @JSImport("antd", "DatePicker.RangePicker")
        @js.native
        val component: js.Object = js.native
        
        @scala.inline
        class Builder (val args: js.Array[js.Any])
          extends AnyVal
             with StBuildingComponent[tag.type, typingsSlinky.antd.mod.DatePicker.RangePicker] {
          
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
            value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
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
          def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
          
          @scala.inline
          def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
          
          @scala.inline
          def clearIcon(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def clearIconReactElement(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def dateRender(value: (Moment, Moment, /* info */ RangeInfo) => ReactElement): this.type = set("dateRender", js.Any.fromFunction3(value))
          
          @scala.inline
          def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultPickerValue(value: js.Tuple2[Moment, Moment]): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultValue(value: RangeValue[Moment]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultValueNull: this.type = set("defaultValue", null)
          
          @scala.inline
          def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
          
          @scala.inline
          def disabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): this.type = set("disabled", value.asInstanceOf[js.Any])
          
          @scala.inline
          def disabledDate(value: Moment => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
          
          @scala.inline
          def disabledTime(value: (/* date */ EventValue[Moment], /* type */ RangeType) => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction2(value))
          
          @scala.inline
          def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
          
          @scala.inline
          def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def format(value: String | CustomFormat[Moment] | (js.Array[String | CustomFormat[Moment]])): this.type = set("format", value.asInstanceOf[js.Any])
          
          @scala.inline
          def formatFunction1(value: Moment => String): this.type = set("format", js.Any.fromFunction1(value))
          
          @scala.inline
          def formatVarargs(value: (String | CustomFormat[Moment])*): this.type = set("format", js.Array(value :_*))
          
          @scala.inline
          def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
          
          @scala.inline
          def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
          
          @scala.inline
          def inputReadOnly(value: Boolean): this.type = set("inputReadOnly", value.asInstanceOf[js.Any])
          
          @scala.inline
          def locale(value: PickerLocale): this.type = set("locale", value.asInstanceOf[js.Any])
          
          @scala.inline
          def mode(value: js.Tuple2[PanelMode, PanelMode]): this.type = set("mode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def monthCellRender(value: (Moment, /* locale */ Locale) => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction2(value))
          
          @scala.inline
          def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def onBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
          
          @scala.inline
          def onCalendarChange(
            value: (/* values */ RangeValue[Moment], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Unit
          ): this.type = set("onCalendarChange", js.Any.fromFunction3(value))
          
          @scala.inline
          def onChange(value: (/* values */ RangeValue[Moment], /* formatString */ js.Tuple2[String, String]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
          
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
          def onOk(value: /* dates */ RangeValue[Moment] => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
          
          @scala.inline
          def onOpenChange(value: /* open */ Boolean => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
          
          @scala.inline
          def onPanelChange(value: (/* values */ RangeValue[Moment], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
          
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
          def ranges(
            value: Record[
                      String, 
                      (Exclude[RangeValue[Moment], Null]) | (js.Function0[Exclude[RangeValue[Moment], Null]])
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
          def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
          
          @scala.inline
          def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
          
          @scala.inline
          def suffixIcon(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def suffixIconReactElement(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
          
          @scala.inline
          def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def value(value: RangeValue[Moment]): this.type = set("value", value.asInstanceOf[js.Any])
          
          @scala.inline
          def valueNull: this.type = set("value", null)
        }
        
        def withProps(p: typingsSlinky.antd.generatePickerMod.RangePickerBaseProps[Moment]): typingsSlinky.antd.components.DatePicker.PickerBaseProps.RangePicker.RangePickerBaseProps.Builder = new typingsSlinky.antd.components.DatePicker.PickerBaseProps.RangePicker.RangePickerBaseProps.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
      }
      
      object RangePickerDateProps {
        
        @JSImport("antd", "DatePicker.RangePicker")
        @js.native
        val component: js.Object = js.native
        
        @scala.inline
        class Builder (val args: js.Array[js.Any])
          extends AnyVal
             with StBuildingComponent[tag.type, typingsSlinky.antd.mod.DatePicker.RangePicker] {
          
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
            value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
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
          def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
          
          @scala.inline
          def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
          
          @scala.inline
          def clearIcon(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def clearIconReactElement(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def dateRender(value: (Moment, Moment, /* info */ RangeInfo) => ReactElement): this.type = set("dateRender", js.Any.fromFunction3(value))
          
          @scala.inline
          def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultPickerValue(value: js.Tuple2[Moment, Moment]): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultValue(value: RangeValue[Moment]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultValueNull: this.type = set("defaultValue", null)
          
          @scala.inline
          def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
          
          @scala.inline
          def disabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): this.type = set("disabled", value.asInstanceOf[js.Any])
          
          @scala.inline
          def disabledDate(value: Moment => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
          
          @scala.inline
          def disabledTime(value: (/* date */ EventValue[Moment], /* type */ RangeType) => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction2(value))
          
          @scala.inline
          def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
          
          @scala.inline
          def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def format(value: String | CustomFormat[Moment] | (js.Array[String | CustomFormat[Moment]])): this.type = set("format", value.asInstanceOf[js.Any])
          
          @scala.inline
          def formatFunction1(value: Moment => String): this.type = set("format", js.Any.fromFunction1(value))
          
          @scala.inline
          def formatVarargs(value: (String | CustomFormat[Moment])*): this.type = set("format", js.Array(value :_*))
          
          @scala.inline
          def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
          
          @scala.inline
          def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
          
          @scala.inline
          def inputReadOnly(value: Boolean): this.type = set("inputReadOnly", value.asInstanceOf[js.Any])
          
          @scala.inline
          def locale(value: PickerLocale): this.type = set("locale", value.asInstanceOf[js.Any])
          
          @scala.inline
          def mode(value: js.Tuple2[PanelMode, PanelMode]): this.type = set("mode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def monthCellRender(value: (Moment, /* locale */ Locale) => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction2(value))
          
          @scala.inline
          def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def onBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
          
          @scala.inline
          def onCalendarChange(
            value: (/* values */ RangeValue[Moment], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Unit
          ): this.type = set("onCalendarChange", js.Any.fromFunction3(value))
          
          @scala.inline
          def onChange(value: (/* values */ RangeValue[Moment], /* formatString */ js.Tuple2[String, String]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
          
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
          def onOk(value: /* dates */ RangeValue[Moment] => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
          
          @scala.inline
          def onOpenChange(value: /* open */ Boolean => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
          
          @scala.inline
          def onPanelChange(value: (/* values */ RangeValue[Moment], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
          
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
          def ranges(
            value: Record[
                      String, 
                      (Exclude[RangeValue[Moment], Null]) | (js.Function0[Exclude[RangeValue[Moment], Null]])
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
          def showTime(value: Boolean | RangeShowTimeObject[Moment]): this.type = set("showTime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
          
          @scala.inline
          def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
          
          @scala.inline
          def suffixIcon(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def suffixIconReactElement(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
          
          @scala.inline
          def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def value(value: RangeValue[Moment]): this.type = set("value", value.asInstanceOf[js.Any])
          
          @scala.inline
          def valueNull: this.type = set("value", null)
        }
        
        implicit def make(companion: RangePickerDateProps.type): typingsSlinky.antd.components.DatePicker.PickerBaseProps.RangePicker.RangePickerDateProps.Builder = new typingsSlinky.antd.components.DatePicker.PickerBaseProps.RangePicker.RangePickerDateProps.Builder(js.Array(this.component, js.Dictionary.empty))()
        
        def withProps(p: typingsSlinky.antd.generatePickerMod.RangePickerDateProps[Moment]): typingsSlinky.antd.components.DatePicker.PickerBaseProps.RangePicker.RangePickerDateProps.Builder = new typingsSlinky.antd.components.DatePicker.PickerBaseProps.RangePicker.RangePickerDateProps.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
      }
      
      object RangePickerTimeProps {
        
        @scala.inline
        def apply(picker: time): typingsSlinky.antd.components.DatePicker.PickerBaseProps.RangePicker.RangePickerTimeProps.Builder = {
          val __props = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
          new typingsSlinky.antd.components.DatePicker.PickerBaseProps.RangePicker.RangePickerTimeProps.Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.antd.generatePickerMod.RangePickerTimeProps[Moment]]))
        }
        
        @JSImport("antd", "DatePicker.RangePicker")
        @js.native
        val component: js.Object = js.native
        
        @scala.inline
        class Builder (val args: js.Array[js.Any])
          extends AnyVal
             with StBuildingComponent[tag.type, typingsSlinky.antd.mod.DatePicker.RangePicker] {
          
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
            value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
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
          def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
          
          @scala.inline
          def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
          
          @scala.inline
          def clearIcon(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def clearIconReactElement(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def dateRender(value: (Moment, Moment, /* info */ RangeInfo) => ReactElement): this.type = set("dateRender", js.Any.fromFunction3(value))
          
          @scala.inline
          def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultOpenValue(value: Moment): this.type = set("defaultOpenValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultPickerValue(value: js.Tuple2[Moment, Moment]): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultValue(value: RangeValue[Moment]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultValueNull: this.type = set("defaultValue", null)
          
          @scala.inline
          def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
          
          @scala.inline
          def disabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): this.type = set("disabled", value.asInstanceOf[js.Any])
          
          @scala.inline
          def disabledDate(value: Moment => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
          
          @scala.inline
          def disabledHours(value: () => js.Array[Double]): this.type = set("disabledHours", js.Any.fromFunction0(value))
          
          @scala.inline
          def disabledMinutes(value: /* hour */ Double => js.Array[Double]): this.type = set("disabledMinutes", js.Any.fromFunction1(value))
          
          @scala.inline
          def disabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): this.type = set("disabledSeconds", js.Any.fromFunction2(value))
          
          @scala.inline
          def disabledTime(value: (/* date */ EventValue[Moment], /* type */ RangeType) => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction2(value))
          
          @scala.inline
          def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
          
          @scala.inline
          def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def format(value: String | CustomFormat[Moment] | (js.Array[String | CustomFormat[Moment]])): this.type = set("format", value.asInstanceOf[js.Any])
          
          @scala.inline
          def formatFunction1(value: Moment => String): this.type = set("format", js.Any.fromFunction1(value))
          
          @scala.inline
          def formatVarargs(value: (String | CustomFormat[Moment])*): this.type = set("format", js.Array(value :_*))
          
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
          def locale(value: PickerLocale): this.type = set("locale", value.asInstanceOf[js.Any])
          
          @scala.inline
          def minuteStep(value: Double): this.type = set("minuteStep", value.asInstanceOf[js.Any])
          
          @scala.inline
          def mode(value: js.Tuple2[PanelMode, PanelMode]): this.type = set("mode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def monthCellRender(value: (Moment, /* locale */ Locale) => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction2(value))
          
          @scala.inline
          def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def onBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
          
          @scala.inline
          def onCalendarChange(
            value: (/* values */ RangeValue[Moment], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Unit
          ): this.type = set("onCalendarChange", js.Any.fromFunction3(value))
          
          @scala.inline
          def onChange(value: (/* values */ RangeValue[Moment], /* formatString */ js.Tuple2[String, String]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
          
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
          def onOk(value: /* dates */ RangeValue[Moment] => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
          
          @scala.inline
          def onOpenChange(value: /* open */ Boolean => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
          
          @scala.inline
          def onPanelChange(value: (/* values */ RangeValue[Moment], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
          
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
          def ranges(
            value: Record[
                      String, 
                      (Exclude[RangeValue[Moment], Null]) | (js.Function0[Exclude[RangeValue[Moment], Null]])
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
          def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
          
          @scala.inline
          def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
          
          @scala.inline
          def suffixIcon(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def suffixIconReactElement(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
          
          @scala.inline
          def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def use12Hours(value: Boolean): this.type = set("use12Hours", value.asInstanceOf[js.Any])
          
          @scala.inline
          def value(value: RangeValue[Moment]): this.type = set("value", value.asInstanceOf[js.Any])
          
          @scala.inline
          def valueNull: this.type = set("value", null)
        }
        
        def withProps(p: typingsSlinky.antd.generatePickerMod.RangePickerTimeProps[Moment]): typingsSlinky.antd.components.DatePicker.PickerBaseProps.RangePicker.RangePickerTimeProps.Builder = new typingsSlinky.antd.components.DatePicker.PickerBaseProps.RangePicker.RangePickerTimeProps.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
      }
    }
    
    object TimePicker {
      
      @JSImport("antd", "DatePicker.TimePicker")
      @js.native
      val component: js.Object = js.native
      
      implicit def make(companion: TimePicker.type): SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.TimePicker] = new SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.TimePicker](js.Array(this.component, js.Dictionary.empty))()
      
      def withProps(p: PickPickPickerTimePropsMo): SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.TimePicker] = new SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.TimePicker](js.Array(this.component, p.asInstanceOf[js.Any]))
    }
    
    object WeekPicker {
      
      @JSImport("antd", "DatePicker.WeekPicker")
      @js.native
      val component: js.Object = js.native
      
      implicit def make(companion: WeekPicker.type): SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.WeekPicker] = new SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.WeekPicker](js.Array(this.component, js.Dictionary.empty))()
      
      def withProps(p: PickPickPickerDatePropsMo): SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.WeekPicker] = new SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.WeekPicker](js.Array(this.component, p.asInstanceOf[js.Any]))
    }
    
    object YearPicker {
      
      @JSImport("antd", "DatePicker.YearPicker")
      @js.native
      val component: js.Object = js.native
      
      implicit def make(companion: YearPicker.type): SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.YearPicker] = new SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.YearPicker](js.Array(this.component, js.Dictionary.empty))()
      
      def withProps(p: PickPickPickerDatePropsMo): SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.YearPicker] = new SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.YearPicker](js.Array(this.component, p.asInstanceOf[js.Any]))
    }
    
    @JSImport("antd", "DatePicker")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.antd.mod.DatePicker] {
      
      @scala.inline
      def allowClear(value: Boolean): this.type = set("allowClear", value.asInstanceOf[js.Any])
      
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
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
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
      def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def clearIcon(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def clearIconReactElement(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dateRender(value: (Moment, Moment) => ReactElement): this.type = set("dateRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultPickerValue(value: Moment): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValue(value: Moment): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledDate(value: Moment => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def format(value: String | CustomFormat[Moment] | (js.Array[String | CustomFormat[Moment]])): this.type = set("format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def formatFunction1(value: Moment => String): this.type = set("format", js.Any.fromFunction1(value))
      
      @scala.inline
      def formatVarargs(value: (String | CustomFormat[Moment])*): this.type = set("format", js.Array(value :_*))
      
      @scala.inline
      def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inputReadOnly(value: Boolean): this.type = set("inputReadOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def locale(value: PickerLocale): this.type = set("locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def mode(value: PanelMode): this.type = set("mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def monthCellRender(value: (Moment, /* locale */ Locale) => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def onChange(value: (/* value */ Moment | Null, /* dateString */ String) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
      
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
      def onOk(value: Moment => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def onOpenChange(value: /* open */ Boolean => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPanelChange(value: (Moment, /* mode */ PanelMode) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def onSelect(value: Moment => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def panelRender(value: /* originPanel */ ReactElement => ReactElement): this.type = set("panelRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def pickerRef(value: MutableRefObject[PickerRefConfig]): this.type = set("pickerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def popupStyle(value: CSSProperties): this.type = set("popupStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def renderExtraFooter(value: /* mode */ PanelMode => ReactElement): this.type = set("renderExtraFooter", js.Any.fromFunction1(value))
      
      @scala.inline
      def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suffixIcon(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suffixIconReactElement(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: Moment): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valueNull: this.type = set("value", null)
    }
    
    def withProps(p: typingsSlinky.antd.generatePickerMod.PickerBaseProps[Moment]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object PickerDateProps {
    
    object MonthPicker {
      
      @JSImport("antd", "DatePicker.MonthPicker")
      @js.native
      val component: js.Object = js.native
      
      implicit def make(companion: MonthPicker.type): SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.MonthPicker] = new SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.MonthPicker](js.Array(this.component, js.Dictionary.empty))()
      
      def withProps(p: PickPickPickerDatePropsMo): SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.MonthPicker] = new SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.MonthPicker](js.Array(this.component, p.asInstanceOf[js.Any]))
    }
    
    object QuarterPicker {
      
      @JSImport("antd", "DatePicker.QuarterPicker")
      @js.native
      val component: js.Object = js.native
      
      implicit def make(companion: QuarterPicker.type): SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.QuarterPicker] = new SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.QuarterPicker](js.Array(this.component, js.Dictionary.empty))()
      
      def withProps(p: PickPickPickerTimePropsMo): SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.QuarterPicker] = new SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.QuarterPicker](js.Array(this.component, p.asInstanceOf[js.Any]))
    }
    
    object RangePicker {
      
      object RangePickerBaseProps {
        
        @scala.inline
        def apply(picker: Exclude[PickerMode, date | time]): typingsSlinky.antd.components.DatePicker.PickerDateProps.RangePicker.RangePickerBaseProps.Builder = {
          val __props = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
          new typingsSlinky.antd.components.DatePicker.PickerDateProps.RangePicker.RangePickerBaseProps.Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.antd.generatePickerMod.RangePickerBaseProps[Moment]]))
        }
        
        @JSImport("antd", "DatePicker.RangePicker")
        @js.native
        val component: js.Object = js.native
        
        @scala.inline
        class Builder (val args: js.Array[js.Any])
          extends AnyVal
             with StBuildingComponent[tag.type, typingsSlinky.antd.mod.DatePicker.RangePicker] {
          
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
            value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
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
          def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
          
          @scala.inline
          def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
          
          @scala.inline
          def clearIcon(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def clearIconReactElement(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def dateRender(value: (Moment, Moment, /* info */ RangeInfo) => ReactElement): this.type = set("dateRender", js.Any.fromFunction3(value))
          
          @scala.inline
          def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultPickerValue(value: js.Tuple2[Moment, Moment]): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultValue(value: RangeValue[Moment]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultValueNull: this.type = set("defaultValue", null)
          
          @scala.inline
          def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
          
          @scala.inline
          def disabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): this.type = set("disabled", value.asInstanceOf[js.Any])
          
          @scala.inline
          def disabledDate(value: Moment => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
          
          @scala.inline
          def disabledTime(value: (/* date */ EventValue[Moment], /* type */ RangeType) => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction2(value))
          
          @scala.inline
          def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
          
          @scala.inline
          def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def format(value: String | CustomFormat[Moment] | (js.Array[String | CustomFormat[Moment]])): this.type = set("format", value.asInstanceOf[js.Any])
          
          @scala.inline
          def formatFunction1(value: Moment => String): this.type = set("format", js.Any.fromFunction1(value))
          
          @scala.inline
          def formatVarargs(value: (String | CustomFormat[Moment])*): this.type = set("format", js.Array(value :_*))
          
          @scala.inline
          def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
          
          @scala.inline
          def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
          
          @scala.inline
          def inputReadOnly(value: Boolean): this.type = set("inputReadOnly", value.asInstanceOf[js.Any])
          
          @scala.inline
          def locale(value: PickerLocale): this.type = set("locale", value.asInstanceOf[js.Any])
          
          @scala.inline
          def mode(value: js.Tuple2[PanelMode, PanelMode]): this.type = set("mode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def monthCellRender(value: (Moment, /* locale */ Locale) => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction2(value))
          
          @scala.inline
          def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def onBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
          
          @scala.inline
          def onCalendarChange(
            value: (/* values */ RangeValue[Moment], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Unit
          ): this.type = set("onCalendarChange", js.Any.fromFunction3(value))
          
          @scala.inline
          def onChange(value: (/* values */ RangeValue[Moment], /* formatString */ js.Tuple2[String, String]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
          
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
          def onOk(value: /* dates */ RangeValue[Moment] => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
          
          @scala.inline
          def onOpenChange(value: /* open */ Boolean => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
          
          @scala.inline
          def onPanelChange(value: (/* values */ RangeValue[Moment], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
          
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
          def ranges(
            value: Record[
                      String, 
                      (Exclude[RangeValue[Moment], Null]) | (js.Function0[Exclude[RangeValue[Moment], Null]])
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
          def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
          
          @scala.inline
          def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
          
          @scala.inline
          def suffixIcon(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def suffixIconReactElement(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
          
          @scala.inline
          def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def value(value: RangeValue[Moment]): this.type = set("value", value.asInstanceOf[js.Any])
          
          @scala.inline
          def valueNull: this.type = set("value", null)
        }
        
        def withProps(p: typingsSlinky.antd.generatePickerMod.RangePickerBaseProps[Moment]): typingsSlinky.antd.components.DatePicker.PickerDateProps.RangePicker.RangePickerBaseProps.Builder = new typingsSlinky.antd.components.DatePicker.PickerDateProps.RangePicker.RangePickerBaseProps.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
      }
      
      object RangePickerDateProps {
        
        @JSImport("antd", "DatePicker.RangePicker")
        @js.native
        val component: js.Object = js.native
        
        @scala.inline
        class Builder (val args: js.Array[js.Any])
          extends AnyVal
             with StBuildingComponent[tag.type, typingsSlinky.antd.mod.DatePicker.RangePicker] {
          
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
            value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
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
          def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
          
          @scala.inline
          def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
          
          @scala.inline
          def clearIcon(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def clearIconReactElement(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def dateRender(value: (Moment, Moment, /* info */ RangeInfo) => ReactElement): this.type = set("dateRender", js.Any.fromFunction3(value))
          
          @scala.inline
          def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultPickerValue(value: js.Tuple2[Moment, Moment]): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultValue(value: RangeValue[Moment]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultValueNull: this.type = set("defaultValue", null)
          
          @scala.inline
          def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
          
          @scala.inline
          def disabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): this.type = set("disabled", value.asInstanceOf[js.Any])
          
          @scala.inline
          def disabledDate(value: Moment => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
          
          @scala.inline
          def disabledTime(value: (/* date */ EventValue[Moment], /* type */ RangeType) => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction2(value))
          
          @scala.inline
          def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
          
          @scala.inline
          def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def format(value: String | CustomFormat[Moment] | (js.Array[String | CustomFormat[Moment]])): this.type = set("format", value.asInstanceOf[js.Any])
          
          @scala.inline
          def formatFunction1(value: Moment => String): this.type = set("format", js.Any.fromFunction1(value))
          
          @scala.inline
          def formatVarargs(value: (String | CustomFormat[Moment])*): this.type = set("format", js.Array(value :_*))
          
          @scala.inline
          def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
          
          @scala.inline
          def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
          
          @scala.inline
          def inputReadOnly(value: Boolean): this.type = set("inputReadOnly", value.asInstanceOf[js.Any])
          
          @scala.inline
          def locale(value: PickerLocale): this.type = set("locale", value.asInstanceOf[js.Any])
          
          @scala.inline
          def mode(value: js.Tuple2[PanelMode, PanelMode]): this.type = set("mode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def monthCellRender(value: (Moment, /* locale */ Locale) => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction2(value))
          
          @scala.inline
          def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def onBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
          
          @scala.inline
          def onCalendarChange(
            value: (/* values */ RangeValue[Moment], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Unit
          ): this.type = set("onCalendarChange", js.Any.fromFunction3(value))
          
          @scala.inline
          def onChange(value: (/* values */ RangeValue[Moment], /* formatString */ js.Tuple2[String, String]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
          
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
          def onOk(value: /* dates */ RangeValue[Moment] => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
          
          @scala.inline
          def onOpenChange(value: /* open */ Boolean => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
          
          @scala.inline
          def onPanelChange(value: (/* values */ RangeValue[Moment], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
          
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
          def ranges(
            value: Record[
                      String, 
                      (Exclude[RangeValue[Moment], Null]) | (js.Function0[Exclude[RangeValue[Moment], Null]])
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
          def showTime(value: Boolean | RangeShowTimeObject[Moment]): this.type = set("showTime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
          
          @scala.inline
          def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
          
          @scala.inline
          def suffixIcon(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def suffixIconReactElement(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
          
          @scala.inline
          def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def value(value: RangeValue[Moment]): this.type = set("value", value.asInstanceOf[js.Any])
          
          @scala.inline
          def valueNull: this.type = set("value", null)
        }
        
        implicit def make(companion: RangePickerDateProps.type): typingsSlinky.antd.components.DatePicker.PickerDateProps.RangePicker.RangePickerDateProps.Builder = new typingsSlinky.antd.components.DatePicker.PickerDateProps.RangePicker.RangePickerDateProps.Builder(js.Array(this.component, js.Dictionary.empty))()
        
        def withProps(p: typingsSlinky.antd.generatePickerMod.RangePickerDateProps[Moment]): typingsSlinky.antd.components.DatePicker.PickerDateProps.RangePicker.RangePickerDateProps.Builder = new typingsSlinky.antd.components.DatePicker.PickerDateProps.RangePicker.RangePickerDateProps.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
      }
      
      object RangePickerTimeProps {
        
        @scala.inline
        def apply(picker: time): typingsSlinky.antd.components.DatePicker.PickerDateProps.RangePicker.RangePickerTimeProps.Builder = {
          val __props = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
          new typingsSlinky.antd.components.DatePicker.PickerDateProps.RangePicker.RangePickerTimeProps.Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.antd.generatePickerMod.RangePickerTimeProps[Moment]]))
        }
        
        @JSImport("antd", "DatePicker.RangePicker")
        @js.native
        val component: js.Object = js.native
        
        @scala.inline
        class Builder (val args: js.Array[js.Any])
          extends AnyVal
             with StBuildingComponent[tag.type, typingsSlinky.antd.mod.DatePicker.RangePicker] {
          
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
            value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
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
          def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
          
          @scala.inline
          def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
          
          @scala.inline
          def clearIcon(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def clearIconReactElement(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def dateRender(value: (Moment, Moment, /* info */ RangeInfo) => ReactElement): this.type = set("dateRender", js.Any.fromFunction3(value))
          
          @scala.inline
          def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultOpenValue(value: Moment): this.type = set("defaultOpenValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultPickerValue(value: js.Tuple2[Moment, Moment]): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultValue(value: RangeValue[Moment]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultValueNull: this.type = set("defaultValue", null)
          
          @scala.inline
          def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
          
          @scala.inline
          def disabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): this.type = set("disabled", value.asInstanceOf[js.Any])
          
          @scala.inline
          def disabledDate(value: Moment => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
          
          @scala.inline
          def disabledHours(value: () => js.Array[Double]): this.type = set("disabledHours", js.Any.fromFunction0(value))
          
          @scala.inline
          def disabledMinutes(value: /* hour */ Double => js.Array[Double]): this.type = set("disabledMinutes", js.Any.fromFunction1(value))
          
          @scala.inline
          def disabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): this.type = set("disabledSeconds", js.Any.fromFunction2(value))
          
          @scala.inline
          def disabledTime(value: (/* date */ EventValue[Moment], /* type */ RangeType) => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction2(value))
          
          @scala.inline
          def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
          
          @scala.inline
          def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def format(value: String | CustomFormat[Moment] | (js.Array[String | CustomFormat[Moment]])): this.type = set("format", value.asInstanceOf[js.Any])
          
          @scala.inline
          def formatFunction1(value: Moment => String): this.type = set("format", js.Any.fromFunction1(value))
          
          @scala.inline
          def formatVarargs(value: (String | CustomFormat[Moment])*): this.type = set("format", js.Array(value :_*))
          
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
          def locale(value: PickerLocale): this.type = set("locale", value.asInstanceOf[js.Any])
          
          @scala.inline
          def minuteStep(value: Double): this.type = set("minuteStep", value.asInstanceOf[js.Any])
          
          @scala.inline
          def mode(value: js.Tuple2[PanelMode, PanelMode]): this.type = set("mode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def monthCellRender(value: (Moment, /* locale */ Locale) => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction2(value))
          
          @scala.inline
          def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def onBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
          
          @scala.inline
          def onCalendarChange(
            value: (/* values */ RangeValue[Moment], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Unit
          ): this.type = set("onCalendarChange", js.Any.fromFunction3(value))
          
          @scala.inline
          def onChange(value: (/* values */ RangeValue[Moment], /* formatString */ js.Tuple2[String, String]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
          
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
          def onOk(value: /* dates */ RangeValue[Moment] => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
          
          @scala.inline
          def onOpenChange(value: /* open */ Boolean => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
          
          @scala.inline
          def onPanelChange(value: (/* values */ RangeValue[Moment], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
          
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
          def ranges(
            value: Record[
                      String, 
                      (Exclude[RangeValue[Moment], Null]) | (js.Function0[Exclude[RangeValue[Moment], Null]])
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
          def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
          
          @scala.inline
          def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
          
          @scala.inline
          def suffixIcon(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def suffixIconReactElement(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
          
          @scala.inline
          def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def use12Hours(value: Boolean): this.type = set("use12Hours", value.asInstanceOf[js.Any])
          
          @scala.inline
          def value(value: RangeValue[Moment]): this.type = set("value", value.asInstanceOf[js.Any])
          
          @scala.inline
          def valueNull: this.type = set("value", null)
        }
        
        def withProps(p: typingsSlinky.antd.generatePickerMod.RangePickerTimeProps[Moment]): typingsSlinky.antd.components.DatePicker.PickerDateProps.RangePicker.RangePickerTimeProps.Builder = new typingsSlinky.antd.components.DatePicker.PickerDateProps.RangePicker.RangePickerTimeProps.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
      }
    }
    
    object TimePicker {
      
      @JSImport("antd", "DatePicker.TimePicker")
      @js.native
      val component: js.Object = js.native
      
      implicit def make(companion: TimePicker.type): SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.TimePicker] = new SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.TimePicker](js.Array(this.component, js.Dictionary.empty))()
      
      def withProps(p: PickPickPickerTimePropsMo): SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.TimePicker] = new SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.TimePicker](js.Array(this.component, p.asInstanceOf[js.Any]))
    }
    
    object WeekPicker {
      
      @JSImport("antd", "DatePicker.WeekPicker")
      @js.native
      val component: js.Object = js.native
      
      implicit def make(companion: WeekPicker.type): SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.WeekPicker] = new SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.WeekPicker](js.Array(this.component, js.Dictionary.empty))()
      
      def withProps(p: PickPickPickerDatePropsMo): SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.WeekPicker] = new SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.WeekPicker](js.Array(this.component, p.asInstanceOf[js.Any]))
    }
    
    object YearPicker {
      
      @JSImport("antd", "DatePicker.YearPicker")
      @js.native
      val component: js.Object = js.native
      
      implicit def make(companion: YearPicker.type): SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.YearPicker] = new SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.YearPicker](js.Array(this.component, js.Dictionary.empty))()
      
      def withProps(p: PickPickPickerDatePropsMo): SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.YearPicker] = new SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.YearPicker](js.Array(this.component, p.asInstanceOf[js.Any]))
    }
    
    @JSImport("antd", "DatePicker")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.antd.mod.DatePicker] {
      
      @scala.inline
      def allowClear(value: Boolean): this.type = set("allowClear", value.asInstanceOf[js.Any])
      
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
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
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
      def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def clearIcon(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def clearIconReactElement(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dateRender(value: (Moment, Moment) => ReactElement): this.type = set("dateRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultPickerValue(value: Moment): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValue(value: Moment): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledDate(value: Moment => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def disabledTime(value: /* date */ Moment | Null => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction1(value))
      
      @scala.inline
      def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def format(value: String | CustomFormat[Moment] | (js.Array[String | CustomFormat[Moment]])): this.type = set("format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def formatFunction1(value: Moment => String): this.type = set("format", js.Any.fromFunction1(value))
      
      @scala.inline
      def formatVarargs(value: (String | CustomFormat[Moment])*): this.type = set("format", js.Array(value :_*))
      
      @scala.inline
      def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inputReadOnly(value: Boolean): this.type = set("inputReadOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def locale(value: PickerLocale): this.type = set("locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def mode(value: PanelMode): this.type = set("mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def monthCellRender(value: (Moment, /* locale */ Locale) => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def onChange(value: (/* value */ Moment | Null, /* dateString */ String) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
      
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
      def onOk(value: Moment => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def onOpenChange(value: /* open */ Boolean => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPanelChange(value: (Moment, /* mode */ PanelMode) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def onSelect(value: Moment => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def panelRender(value: /* originPanel */ ReactElement => ReactElement): this.type = set("panelRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def picker(value: date): this.type = set("picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def pickerRef(value: MutableRefObject[PickerRefConfig]): this.type = set("pickerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def popupStyle(value: CSSProperties): this.type = set("popupStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def renderExtraFooter(value: /* mode */ PanelMode => ReactElement): this.type = set("renderExtraFooter", js.Any.fromFunction1(value))
      
      @scala.inline
      def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showNow(value: Boolean): this.type = set("showNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showTime(value: Boolean | SharedTimeProps[Moment]): this.type = set("showTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showToday(value: Boolean): this.type = set("showToday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suffixIcon(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suffixIconReactElement(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: Moment): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valueNull: this.type = set("value", null)
    }
    
    implicit def make(companion: PickerDateProps.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: typingsSlinky.antd.generatePickerMod.PickerDateProps[Moment]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object PickerTimeProps {
    
    @scala.inline
    def apply(picker: time): Builder = {
      val __props = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.antd.generatePickerMod.PickerTimeProps[Moment]]))
    }
    
    object MonthPicker {
      
      @JSImport("antd", "DatePicker.MonthPicker")
      @js.native
      val component: js.Object = js.native
      
      implicit def make(companion: MonthPicker.type): SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.MonthPicker] = new SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.MonthPicker](js.Array(this.component, js.Dictionary.empty))()
      
      def withProps(p: PickPickPickerDatePropsMo): SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.MonthPicker] = new SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.MonthPicker](js.Array(this.component, p.asInstanceOf[js.Any]))
    }
    
    object QuarterPicker {
      
      @JSImport("antd", "DatePicker.QuarterPicker")
      @js.native
      val component: js.Object = js.native
      
      implicit def make(companion: QuarterPicker.type): SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.QuarterPicker] = new SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.QuarterPicker](js.Array(this.component, js.Dictionary.empty))()
      
      def withProps(p: PickPickPickerTimePropsMo): SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.QuarterPicker] = new SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.QuarterPicker](js.Array(this.component, p.asInstanceOf[js.Any]))
    }
    
    object RangePicker {
      
      object RangePickerBaseProps {
        
        @scala.inline
        def apply(picker: Exclude[PickerMode, date | time]): typingsSlinky.antd.components.DatePicker.PickerTimeProps.RangePicker.RangePickerBaseProps.Builder = {
          val __props = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
          new typingsSlinky.antd.components.DatePicker.PickerTimeProps.RangePicker.RangePickerBaseProps.Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.antd.generatePickerMod.RangePickerBaseProps[Moment]]))
        }
        
        @JSImport("antd", "DatePicker.RangePicker")
        @js.native
        val component: js.Object = js.native
        
        @scala.inline
        class Builder (val args: js.Array[js.Any])
          extends AnyVal
             with StBuildingComponent[tag.type, typingsSlinky.antd.mod.DatePicker.RangePicker] {
          
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
            value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
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
          def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
          
          @scala.inline
          def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
          
          @scala.inline
          def clearIcon(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def clearIconReactElement(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def dateRender(value: (Moment, Moment, /* info */ RangeInfo) => ReactElement): this.type = set("dateRender", js.Any.fromFunction3(value))
          
          @scala.inline
          def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultPickerValue(value: js.Tuple2[Moment, Moment]): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultValue(value: RangeValue[Moment]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultValueNull: this.type = set("defaultValue", null)
          
          @scala.inline
          def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
          
          @scala.inline
          def disabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): this.type = set("disabled", value.asInstanceOf[js.Any])
          
          @scala.inline
          def disabledDate(value: Moment => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
          
          @scala.inline
          def disabledTime(value: (/* date */ EventValue[Moment], /* type */ RangeType) => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction2(value))
          
          @scala.inline
          def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
          
          @scala.inline
          def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def format(value: String | CustomFormat[Moment] | (js.Array[String | CustomFormat[Moment]])): this.type = set("format", value.asInstanceOf[js.Any])
          
          @scala.inline
          def formatFunction1(value: Moment => String): this.type = set("format", js.Any.fromFunction1(value))
          
          @scala.inline
          def formatVarargs(value: (String | CustomFormat[Moment])*): this.type = set("format", js.Array(value :_*))
          
          @scala.inline
          def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
          
          @scala.inline
          def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
          
          @scala.inline
          def inputReadOnly(value: Boolean): this.type = set("inputReadOnly", value.asInstanceOf[js.Any])
          
          @scala.inline
          def locale(value: PickerLocale): this.type = set("locale", value.asInstanceOf[js.Any])
          
          @scala.inline
          def mode(value: js.Tuple2[PanelMode, PanelMode]): this.type = set("mode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def monthCellRender(value: (Moment, /* locale */ Locale) => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction2(value))
          
          @scala.inline
          def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def onBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
          
          @scala.inline
          def onCalendarChange(
            value: (/* values */ RangeValue[Moment], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Unit
          ): this.type = set("onCalendarChange", js.Any.fromFunction3(value))
          
          @scala.inline
          def onChange(value: (/* values */ RangeValue[Moment], /* formatString */ js.Tuple2[String, String]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
          
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
          def onOk(value: /* dates */ RangeValue[Moment] => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
          
          @scala.inline
          def onOpenChange(value: /* open */ Boolean => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
          
          @scala.inline
          def onPanelChange(value: (/* values */ RangeValue[Moment], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
          
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
          def ranges(
            value: Record[
                      String, 
                      (Exclude[RangeValue[Moment], Null]) | (js.Function0[Exclude[RangeValue[Moment], Null]])
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
          def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
          
          @scala.inline
          def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
          
          @scala.inline
          def suffixIcon(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def suffixIconReactElement(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
          
          @scala.inline
          def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def value(value: RangeValue[Moment]): this.type = set("value", value.asInstanceOf[js.Any])
          
          @scala.inline
          def valueNull: this.type = set("value", null)
        }
        
        def withProps(p: typingsSlinky.antd.generatePickerMod.RangePickerBaseProps[Moment]): typingsSlinky.antd.components.DatePicker.PickerTimeProps.RangePicker.RangePickerBaseProps.Builder = new typingsSlinky.antd.components.DatePicker.PickerTimeProps.RangePicker.RangePickerBaseProps.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
      }
      
      object RangePickerDateProps {
        
        @JSImport("antd", "DatePicker.RangePicker")
        @js.native
        val component: js.Object = js.native
        
        @scala.inline
        class Builder (val args: js.Array[js.Any])
          extends AnyVal
             with StBuildingComponent[tag.type, typingsSlinky.antd.mod.DatePicker.RangePicker] {
          
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
            value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
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
          def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
          
          @scala.inline
          def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
          
          @scala.inline
          def clearIcon(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def clearIconReactElement(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def dateRender(value: (Moment, Moment, /* info */ RangeInfo) => ReactElement): this.type = set("dateRender", js.Any.fromFunction3(value))
          
          @scala.inline
          def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultPickerValue(value: js.Tuple2[Moment, Moment]): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultValue(value: RangeValue[Moment]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultValueNull: this.type = set("defaultValue", null)
          
          @scala.inline
          def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
          
          @scala.inline
          def disabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): this.type = set("disabled", value.asInstanceOf[js.Any])
          
          @scala.inline
          def disabledDate(value: Moment => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
          
          @scala.inline
          def disabledTime(value: (/* date */ EventValue[Moment], /* type */ RangeType) => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction2(value))
          
          @scala.inline
          def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
          
          @scala.inline
          def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def format(value: String | CustomFormat[Moment] | (js.Array[String | CustomFormat[Moment]])): this.type = set("format", value.asInstanceOf[js.Any])
          
          @scala.inline
          def formatFunction1(value: Moment => String): this.type = set("format", js.Any.fromFunction1(value))
          
          @scala.inline
          def formatVarargs(value: (String | CustomFormat[Moment])*): this.type = set("format", js.Array(value :_*))
          
          @scala.inline
          def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
          
          @scala.inline
          def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
          
          @scala.inline
          def inputReadOnly(value: Boolean): this.type = set("inputReadOnly", value.asInstanceOf[js.Any])
          
          @scala.inline
          def locale(value: PickerLocale): this.type = set("locale", value.asInstanceOf[js.Any])
          
          @scala.inline
          def mode(value: js.Tuple2[PanelMode, PanelMode]): this.type = set("mode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def monthCellRender(value: (Moment, /* locale */ Locale) => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction2(value))
          
          @scala.inline
          def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def onBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
          
          @scala.inline
          def onCalendarChange(
            value: (/* values */ RangeValue[Moment], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Unit
          ): this.type = set("onCalendarChange", js.Any.fromFunction3(value))
          
          @scala.inline
          def onChange(value: (/* values */ RangeValue[Moment], /* formatString */ js.Tuple2[String, String]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
          
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
          def onOk(value: /* dates */ RangeValue[Moment] => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
          
          @scala.inline
          def onOpenChange(value: /* open */ Boolean => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
          
          @scala.inline
          def onPanelChange(value: (/* values */ RangeValue[Moment], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
          
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
          def ranges(
            value: Record[
                      String, 
                      (Exclude[RangeValue[Moment], Null]) | (js.Function0[Exclude[RangeValue[Moment], Null]])
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
          def showTime(value: Boolean | RangeShowTimeObject[Moment]): this.type = set("showTime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
          
          @scala.inline
          def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
          
          @scala.inline
          def suffixIcon(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def suffixIconReactElement(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
          
          @scala.inline
          def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def value(value: RangeValue[Moment]): this.type = set("value", value.asInstanceOf[js.Any])
          
          @scala.inline
          def valueNull: this.type = set("value", null)
        }
        
        implicit def make(companion: RangePickerDateProps.type): typingsSlinky.antd.components.DatePicker.PickerTimeProps.RangePicker.RangePickerDateProps.Builder = new typingsSlinky.antd.components.DatePicker.PickerTimeProps.RangePicker.RangePickerDateProps.Builder(js.Array(this.component, js.Dictionary.empty))()
        
        def withProps(p: typingsSlinky.antd.generatePickerMod.RangePickerDateProps[Moment]): typingsSlinky.antd.components.DatePicker.PickerTimeProps.RangePicker.RangePickerDateProps.Builder = new typingsSlinky.antd.components.DatePicker.PickerTimeProps.RangePicker.RangePickerDateProps.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
      }
      
      object RangePickerTimeProps {
        
        @scala.inline
        def apply(picker: time): typingsSlinky.antd.components.DatePicker.PickerTimeProps.RangePicker.RangePickerTimeProps.Builder = {
          val __props = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
          new typingsSlinky.antd.components.DatePicker.PickerTimeProps.RangePicker.RangePickerTimeProps.Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.antd.generatePickerMod.RangePickerTimeProps[Moment]]))
        }
        
        @JSImport("antd", "DatePicker.RangePicker")
        @js.native
        val component: js.Object = js.native
        
        @scala.inline
        class Builder (val args: js.Array[js.Any])
          extends AnyVal
             with StBuildingComponent[tag.type, typingsSlinky.antd.mod.DatePicker.RangePicker] {
          
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
            value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
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
          def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
          
          @scala.inline
          def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
          
          @scala.inline
          def clearIcon(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def clearIconReactElement(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def dateRender(value: (Moment, Moment, /* info */ RangeInfo) => ReactElement): this.type = set("dateRender", js.Any.fromFunction3(value))
          
          @scala.inline
          def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultOpenValue(value: Moment): this.type = set("defaultOpenValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultPickerValue(value: js.Tuple2[Moment, Moment]): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultValue(value: RangeValue[Moment]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def defaultValueNull: this.type = set("defaultValue", null)
          
          @scala.inline
          def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
          
          @scala.inline
          def disabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): this.type = set("disabled", value.asInstanceOf[js.Any])
          
          @scala.inline
          def disabledDate(value: Moment => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
          
          @scala.inline
          def disabledHours(value: () => js.Array[Double]): this.type = set("disabledHours", js.Any.fromFunction0(value))
          
          @scala.inline
          def disabledMinutes(value: /* hour */ Double => js.Array[Double]): this.type = set("disabledMinutes", js.Any.fromFunction1(value))
          
          @scala.inline
          def disabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): this.type = set("disabledSeconds", js.Any.fromFunction2(value))
          
          @scala.inline
          def disabledTime(value: (/* date */ EventValue[Moment], /* type */ RangeType) => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction2(value))
          
          @scala.inline
          def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
          
          @scala.inline
          def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def format(value: String | CustomFormat[Moment] | (js.Array[String | CustomFormat[Moment]])): this.type = set("format", value.asInstanceOf[js.Any])
          
          @scala.inline
          def formatFunction1(value: Moment => String): this.type = set("format", js.Any.fromFunction1(value))
          
          @scala.inline
          def formatVarargs(value: (String | CustomFormat[Moment])*): this.type = set("format", js.Array(value :_*))
          
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
          def locale(value: PickerLocale): this.type = set("locale", value.asInstanceOf[js.Any])
          
          @scala.inline
          def minuteStep(value: Double): this.type = set("minuteStep", value.asInstanceOf[js.Any])
          
          @scala.inline
          def mode(value: js.Tuple2[PanelMode, PanelMode]): this.type = set("mode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def monthCellRender(value: (Moment, /* locale */ Locale) => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction2(value))
          
          @scala.inline
          def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def onBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
          
          @scala.inline
          def onCalendarChange(
            value: (/* values */ RangeValue[Moment], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Unit
          ): this.type = set("onCalendarChange", js.Any.fromFunction3(value))
          
          @scala.inline
          def onChange(value: (/* values */ RangeValue[Moment], /* formatString */ js.Tuple2[String, String]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
          
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
          def onOk(value: /* dates */ RangeValue[Moment] => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
          
          @scala.inline
          def onOpenChange(value: /* open */ Boolean => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
          
          @scala.inline
          def onPanelChange(value: (/* values */ RangeValue[Moment], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
          
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
          def ranges(
            value: Record[
                      String, 
                      (Exclude[RangeValue[Moment], Null]) | (js.Function0[Exclude[RangeValue[Moment], Null]])
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
          def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
          
          @scala.inline
          def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
          
          @scala.inline
          def suffixIcon(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def suffixIconReactElement(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
          
          @scala.inline
          def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def use12Hours(value: Boolean): this.type = set("use12Hours", value.asInstanceOf[js.Any])
          
          @scala.inline
          def value(value: RangeValue[Moment]): this.type = set("value", value.asInstanceOf[js.Any])
          
          @scala.inline
          def valueNull: this.type = set("value", null)
        }
        
        def withProps(p: typingsSlinky.antd.generatePickerMod.RangePickerTimeProps[Moment]): typingsSlinky.antd.components.DatePicker.PickerTimeProps.RangePicker.RangePickerTimeProps.Builder = new typingsSlinky.antd.components.DatePicker.PickerTimeProps.RangePicker.RangePickerTimeProps.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
      }
    }
    
    object TimePicker {
      
      @JSImport("antd", "DatePicker.TimePicker")
      @js.native
      val component: js.Object = js.native
      
      implicit def make(companion: TimePicker.type): SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.TimePicker] = new SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.TimePicker](js.Array(this.component, js.Dictionary.empty))()
      
      def withProps(p: PickPickPickerTimePropsMo): SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.TimePicker] = new SharedBuilder_PickPickPickerTimePropsMo804672242[typingsSlinky.antd.mod.DatePicker.TimePicker](js.Array(this.component, p.asInstanceOf[js.Any]))
    }
    
    object WeekPicker {
      
      @JSImport("antd", "DatePicker.WeekPicker")
      @js.native
      val component: js.Object = js.native
      
      implicit def make(companion: WeekPicker.type): SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.WeekPicker] = new SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.WeekPicker](js.Array(this.component, js.Dictionary.empty))()
      
      def withProps(p: PickPickPickerDatePropsMo): SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.WeekPicker] = new SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.WeekPicker](js.Array(this.component, p.asInstanceOf[js.Any]))
    }
    
    object YearPicker {
      
      @JSImport("antd", "DatePicker.YearPicker")
      @js.native
      val component: js.Object = js.native
      
      implicit def make(companion: YearPicker.type): SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.YearPicker] = new SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.YearPicker](js.Array(this.component, js.Dictionary.empty))()
      
      def withProps(p: PickPickPickerDatePropsMo): SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.YearPicker] = new SharedBuilder_PickPickPickerDatePropsMo2036763550[typingsSlinky.antd.mod.DatePicker.YearPicker](js.Array(this.component, p.asInstanceOf[js.Any]))
    }
    
    @JSImport("antd", "DatePicker")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.antd.mod.DatePicker] {
      
      @scala.inline
      def allowClear(value: Boolean): this.type = set("allowClear", value.asInstanceOf[js.Any])
      
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
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
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
      def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def clearIcon(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def clearIconReactElement(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dateRender(value: (Moment, Moment) => ReactElement): this.type = set("dateRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultOpenValue(value: Moment): this.type = set("defaultOpenValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultPickerValue(value: Moment): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValue(value: Moment): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledDate(value: Moment => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def disabledHours(value: () => js.Array[Double]): this.type = set("disabledHours", js.Any.fromFunction0(value))
      
      @scala.inline
      def disabledMinutes(value: /* hour */ Double => js.Array[Double]): this.type = set("disabledMinutes", js.Any.fromFunction1(value))
      
      @scala.inline
      def disabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): this.type = set("disabledSeconds", js.Any.fromFunction2(value))
      
      @scala.inline
      def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def format(value: String | CustomFormat[Moment] | (js.Array[String | CustomFormat[Moment]])): this.type = set("format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def formatFunction1(value: Moment => String): this.type = set("format", js.Any.fromFunction1(value))
      
      @scala.inline
      def formatVarargs(value: (String | CustomFormat[Moment])*): this.type = set("format", js.Array(value :_*))
      
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
      def locale(value: PickerLocale): this.type = set("locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def minuteStep(value: Double): this.type = set("minuteStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def mode(value: PanelMode): this.type = set("mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def monthCellRender(value: (Moment, /* locale */ Locale) => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def onChange(value: (/* value */ Moment | Null, /* dateString */ String) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
      
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
      def onOk(value: Moment => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def onOpenChange(value: /* open */ Boolean => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPanelChange(value: (Moment, /* mode */ PanelMode) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def onSelect(value: Moment => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def panelRender(value: /* originPanel */ ReactElement => ReactElement): this.type = set("panelRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def pickerRef(value: MutableRefObject[PickerRefConfig]): this.type = set("pickerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def popupStyle(value: CSSProperties): this.type = set("popupStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def renderExtraFooter(value: /* mode */ PanelMode => ReactElement): this.type = set("renderExtraFooter", js.Any.fromFunction1(value))
      
      @scala.inline
      def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def secondStep(value: Double): this.type = set("secondStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showHour(value: Boolean): this.type = set("showHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showMinute(value: Boolean): this.type = set("showMinute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showNow(value: Boolean): this.type = set("showNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showSecond(value: Boolean): this.type = set("showSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suffixIcon(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suffixIconReactElement(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def use12Hours(value: Boolean): this.type = set("use12Hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: Moment): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valueNull: this.type = set("value", null)
    }
    
    def withProps(p: typingsSlinky.antd.generatePickerMod.PickerTimeProps[Moment]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
