package typingsSlinky.antd

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.anon.PickPickPickerDatePropsMo
import typingsSlinky.antd.anon.PickPickPickerTimePropsMo
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
import typingsSlinky.antd.generatePickerMod.PickerProps
import typingsSlinky.moment.mod.Moment
import typingsSlinky.rcPicker.dateBodyMod.DateRender
import typingsSlinky.rcPicker.interfaceMod.CustomFormat
import typingsSlinky.rcPicker.interfaceMod.DisabledTime
import typingsSlinky.rcPicker.interfaceMod.DisabledTimes
import typingsSlinky.rcPicker.interfaceMod.Locale
import typingsSlinky.rcPicker.interfaceMod.OnPanelChange
import typingsSlinky.rcPicker.interfaceMod.PanelMode
import typingsSlinky.rcPicker.monthBodyMod.MonthCellRender
import typingsSlinky.rcPicker.pickerMod.PickerRefConfig
import typingsSlinky.rcPicker.timePanelMod.SharedTimeProps
import typingsSlinky.rcTrigger.interfaceMod.AlignType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.GetDerivedStateFromError
import typingsSlinky.react.mod.GetDerivedStateFromProps
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.react.mod.WeakValidationMap
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("antd/lib/date-picker", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[PickerProps[Moment], js.Any, js.Any] {
    def this(props: PickerProps[Moment]) = this()
    def this(props: PickerProps[Moment], context: js.Any) = this()
  }
  /* Inlined react.react.ComponentClass<antd.antd/lib/date-picker/generatePicker.PickerProps<moment.moment.Moment>, any> & {  WeekPicker :react.react.ComponentClass<std.Pick<std.Pick<rc-picker.rc-picker/es/Picker.PickerDateProps<moment.moment.Moment>, 'style' | 'direction' | 'prefixCls' | 'className' | 'value' | 'disabled' | 'open' | 'aria-label' | 'autoComplete' | 'autoFocus' | 'name' | 'placeholder' | 'defaultValue' | 'id' | 'tabIndex' | 'role' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'onFocus' | 'onBlur' | 'onChange' | 'onClick' | 'onContextMenu' | 'onMouseDown' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseUp' | 'onSelect' | 'picker' | 'mode' | 'defaultPickerValue' | 'disabledDate' | 'dateRender' | 'monthCellRender' | 'renderExtraFooter' | 'onPanelChange' | 'onOk' | 'dropdownClassName' | 'dropdownAlign' | 'popupStyle' | 'transitionName' | 'allowClear' | 'defaultOpen' | 'inputReadOnly' | 'format' | 'suffixIcon' | 'clearIcon' | 'getPopupContainer' | 'panelRender' | 'onOpenChange' | 'pickerRef' | 'showToday' | 'showNow' | 'showTime' | 'disabledTime'> & {  locale :antd.antd/lib/date-picker/generatePicker.PickerLocale | undefined,   size :antd.antd/lib/button.ButtonSize | undefined,   bordered :boolean | undefined}, 'size' | 'style' | 'direction' | 'prefixCls' | 'className' | 'value' | 'disabled' | 'open' | 'aria-label' | 'autoComplete' | 'autoFocus' | 'name' | 'placeholder' | 'defaultValue' | 'id' | 'tabIndex' | 'role' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'onFocus' | 'onBlur' | 'onChange' | 'onClick' | 'onContextMenu' | 'onMouseDown' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseUp' | 'onSelect' | 'locale' | 'mode' | 'defaultPickerValue' | 'disabledDate' | 'dateRender' | 'monthCellRender' | 'renderExtraFooter' | 'onPanelChange' | 'onOk' | 'dropdownClassName' | 'dropdownAlign' | 'popupStyle' | 'transitionName' | 'allowClear' | 'defaultOpen' | 'inputReadOnly' | 'format' | 'suffixIcon' | 'clearIcon' | 'getPopupContainer' | 'panelRender' | 'onOpenChange' | 'pickerRef' | 'showToday' | 'showNow' | 'showTime' | 'disabledTime' | 'bordered'>, any>,   MonthPicker :react.react.ComponentClass<std.Pick<std.Pick<rc-picker.rc-picker/es/Picker.PickerDateProps<moment.moment.Moment>, 'style' | 'direction' | 'prefixCls' | 'className' | 'value' | 'disabled' | 'open' | 'aria-label' | 'autoComplete' | 'autoFocus' | 'name' | 'placeholder' | 'defaultValue' | 'id' | 'tabIndex' | 'role' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'onFocus' | 'onBlur' | 'onChange' | 'onClick' | 'onContextMenu' | 'onMouseDown' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseUp' | 'onSelect' | 'picker' | 'mode' | 'defaultPickerValue' | 'disabledDate' | 'dateRender' | 'monthCellRender' | 'renderExtraFooter' | 'onPanelChange' | 'onOk' | 'dropdownClassName' | 'dropdownAlign' | 'popupStyle' | 'transitionName' | 'allowClear' | 'defaultOpen' | 'inputReadOnly' | 'format' | 'suffixIcon' | 'clearIcon' | 'getPopupContainer' | 'panelRender' | 'onOpenChange' | 'pickerRef' | 'showToday' | 'showNow' | 'showTime' | 'disabledTime'> & {  locale :antd.antd/lib/date-picker/generatePicker.PickerLocale | undefined,   size :antd.antd/lib/button.ButtonSize | undefined,   bordered :boolean | undefined}, 'size' | 'style' | 'direction' | 'prefixCls' | 'className' | 'value' | 'disabled' | 'open' | 'aria-label' | 'autoComplete' | 'autoFocus' | 'name' | 'placeholder' | 'defaultValue' | 'id' | 'tabIndex' | 'role' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'onFocus' | 'onBlur' | 'onChange' | 'onClick' | 'onContextMenu' | 'onMouseDown' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseUp' | 'onSelect' | 'locale' | 'mode' | 'defaultPickerValue' | 'disabledDate' | 'dateRender' | 'monthCellRender' | 'renderExtraFooter' | 'onPanelChange' | 'onOk' | 'dropdownClassName' | 'dropdownAlign' | 'popupStyle' | 'transitionName' | 'allowClear' | 'defaultOpen' | 'inputReadOnly' | 'format' | 'suffixIcon' | 'clearIcon' | 'getPopupContainer' | 'panelRender' | 'onOpenChange' | 'pickerRef' | 'showToday' | 'showNow' | 'showTime' | 'disabledTime' | 'bordered'>, any>,   YearPicker :react.react.ComponentClass<std.Pick<std.Pick<rc-picker.rc-picker/es/Picker.PickerDateProps<moment.moment.Moment>, 'style' | 'direction' | 'prefixCls' | 'className' | 'value' | 'disabled' | 'open' | 'aria-label' | 'autoComplete' | 'autoFocus' | 'name' | 'placeholder' | 'defaultValue' | 'id' | 'tabIndex' | 'role' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'onFocus' | 'onBlur' | 'onChange' | 'onClick' | 'onContextMenu' | 'onMouseDown' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseUp' | 'onSelect' | 'picker' | 'mode' | 'defaultPickerValue' | 'disabledDate' | 'dateRender' | 'monthCellRender' | 'renderExtraFooter' | 'onPanelChange' | 'onOk' | 'dropdownClassName' | 'dropdownAlign' | 'popupStyle' | 'transitionName' | 'allowClear' | 'defaultOpen' | 'inputReadOnly' | 'format' | 'suffixIcon' | 'clearIcon' | 'getPopupContainer' | 'panelRender' | 'onOpenChange' | 'pickerRef' | 'showToday' | 'showNow' | 'showTime' | 'disabledTime'> & {  locale :antd.antd/lib/date-picker/generatePicker.PickerLocale | undefined,   size :antd.antd/lib/button.ButtonSize | undefined,   bordered :boolean | undefined}, 'size' | 'style' | 'direction' | 'prefixCls' | 'className' | 'value' | 'disabled' | 'open' | 'aria-label' | 'autoComplete' | 'autoFocus' | 'name' | 'placeholder' | 'defaultValue' | 'id' | 'tabIndex' | 'role' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'onFocus' | 'onBlur' | 'onChange' | 'onClick' | 'onContextMenu' | 'onMouseDown' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseUp' | 'onSelect' | 'locale' | 'mode' | 'defaultPickerValue' | 'disabledDate' | 'dateRender' | 'monthCellRender' | 'renderExtraFooter' | 'onPanelChange' | 'onOk' | 'dropdownClassName' | 'dropdownAlign' | 'popupStyle' | 'transitionName' | 'allowClear' | 'defaultOpen' | 'inputReadOnly' | 'format' | 'suffixIcon' | 'clearIcon' | 'getPopupContainer' | 'panelRender' | 'onOpenChange' | 'pickerRef' | 'showToday' | 'showNow' | 'showTime' | 'disabledTime' | 'bordered'>, any>,   RangePicker :react.react.ComponentClass<antd.antd/lib/date-picker/generatePicker.RangePickerProps<moment.moment.Moment>, any>,   TimePicker :react.react.ComponentClass<std.Pick<std.Pick<rc-picker.rc-picker/es/Picker.PickerTimeProps<moment.moment.Moment>, 'style' | 'direction' | 'prefixCls' | 'className' | 'value' | 'disabled' | 'open' | 'aria-label' | 'autoComplete' | 'autoFocus' | 'name' | 'placeholder' | 'defaultValue' | 'id' | 'tabIndex' | 'role' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'onFocus' | 'onBlur' | 'onChange' | 'onClick' | 'onContextMenu' | 'onMouseDown' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseUp' | 'onSelect' | 'picker' | 'mode' | 'defaultPickerValue' | 'disabledDate' | 'dateRender' | 'monthCellRender' | 'renderExtraFooter' | 'onPanelChange' | 'onOk' | 'dropdownClassName' | 'dropdownAlign' | 'popupStyle' | 'transitionName' | 'allowClear' | 'defaultOpen' | 'inputReadOnly' | 'format' | 'suffixIcon' | 'clearIcon' | 'getPopupContainer' | 'panelRender' | 'onOpenChange' | 'pickerRef' | 'showNow' | 'showHour' | 'showMinute' | 'showSecond' | 'use12Hours' | 'hourStep' | 'minuteStep' | 'secondStep' | 'hideDisabledOptions' | 'disabledHours' | 'disabledMinutes' | 'disabledSeconds' | 'defaultOpenValue'> & {  locale :antd.antd/lib/date-picker/generatePicker.PickerLocale | undefined,   size :antd.antd/lib/button.ButtonSize | undefined,   bordered :boolean | undefined}, 'size' | 'style' | 'direction' | 'prefixCls' | 'className' | 'value' | 'disabled' | 'open' | 'aria-label' | 'autoComplete' | 'autoFocus' | 'name' | 'placeholder' | 'defaultValue' | 'id' | 'tabIndex' | 'role' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'onFocus' | 'onBlur' | 'onChange' | 'onClick' | 'onContextMenu' | 'onMouseDown' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseUp' | 'onSelect' | 'locale' | 'mode' | 'defaultPickerValue' | 'disabledDate' | 'dateRender' | 'monthCellRender' | 'renderExtraFooter' | 'onPanelChange' | 'onOk' | 'dropdownClassName' | 'dropdownAlign' | 'popupStyle' | 'transitionName' | 'allowClear' | 'defaultOpen' | 'inputReadOnly' | 'format' | 'suffixIcon' | 'clearIcon' | 'getPopupContainer' | 'panelRender' | 'onOpenChange' | 'pickerRef' | 'showNow' | 'showHour' | 'showMinute' | 'showSecond' | 'use12Hours' | 'hourStep' | 'minuteStep' | 'secondStep' | 'hideDisabledOptions' | 'disabledHours' | 'disabledMinutes' | 'disabledSeconds' | 'defaultOpenValue' | 'bordered'>, any>,   QuarterPicker :react.react.ComponentClass<std.Pick<std.Pick<rc-picker.rc-picker/es/Picker.PickerTimeProps<moment.moment.Moment>, 'style' | 'direction' | 'prefixCls' | 'className' | 'value' | 'disabled' | 'open' | 'aria-label' | 'autoComplete' | 'autoFocus' | 'name' | 'placeholder' | 'defaultValue' | 'id' | 'tabIndex' | 'role' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'onFocus' | 'onBlur' | 'onChange' | 'onClick' | 'onContextMenu' | 'onMouseDown' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseUp' | 'onSelect' | 'picker' | 'mode' | 'defaultPickerValue' | 'disabledDate' | 'dateRender' | 'monthCellRender' | 'renderExtraFooter' | 'onPanelChange' | 'onOk' | 'dropdownClassName' | 'dropdownAlign' | 'popupStyle' | 'transitionName' | 'allowClear' | 'defaultOpen' | 'inputReadOnly' | 'format' | 'suffixIcon' | 'clearIcon' | 'getPopupContainer' | 'panelRender' | 'onOpenChange' | 'pickerRef' | 'showNow' | 'showHour' | 'showMinute' | 'showSecond' | 'use12Hours' | 'hourStep' | 'minuteStep' | 'secondStep' | 'hideDisabledOptions' | 'disabledHours' | 'disabledMinutes' | 'disabledSeconds' | 'defaultOpenValue'> & {  locale :antd.antd/lib/date-picker/generatePicker.PickerLocale | undefined,   size :antd.antd/lib/button.ButtonSize | undefined,   bordered :boolean | undefined}, 'size' | 'style' | 'direction' | 'prefixCls' | 'className' | 'value' | 'disabled' | 'open' | 'aria-label' | 'autoComplete' | 'autoFocus' | 'name' | 'placeholder' | 'defaultValue' | 'id' | 'tabIndex' | 'role' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'onFocus' | 'onBlur' | 'onChange' | 'onClick' | 'onContextMenu' | 'onMouseDown' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseUp' | 'onSelect' | 'locale' | 'mode' | 'defaultPickerValue' | 'disabledDate' | 'dateRender' | 'monthCellRender' | 'renderExtraFooter' | 'onPanelChange' | 'onOk' | 'dropdownClassName' | 'dropdownAlign' | 'popupStyle' | 'transitionName' | 'allowClear' | 'defaultOpen' | 'inputReadOnly' | 'format' | 'suffixIcon' | 'clearIcon' | 'getPopupContainer' | 'panelRender' | 'onOpenChange' | 'pickerRef' | 'showNow' | 'showHour' | 'showMinute' | 'showSecond' | 'use12Hours' | 'hourStep' | 'minuteStep' | 'secondStep' | 'hideDisabledOptions' | 'disabledHours' | 'disabledMinutes' | 'disabledSeconds' | 'defaultOpenValue' | 'bordered'>, any>} */
  object default {
    
    @JSImport("antd/lib/date-picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("antd/lib/date-picker", "default.MonthPicker")
    @js.native
    class MonthPicker protected ()
      extends Component[PickPickPickerDatePropsMo, js.Any, js.Any] {
      def this(props: PickPickPickerDatePropsMo) = this()
      def this(props: PickPickPickerDatePropsMo, context: js.Any) = this()
    }
    @JSImport("antd/lib/date-picker", "default.MonthPicker")
    @js.native
    def MonthPicker: ReactComponentClass[PickPickPickerDatePropsMo] = js.native
    @scala.inline
    def MonthPicker_=(x: ReactComponentClass[PickPickPickerDatePropsMo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MonthPicker")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("antd/lib/date-picker", "default.QuarterPicker")
    @js.native
    class QuarterPicker protected ()
      extends Component[PickPickPickerTimePropsMo, js.Any, js.Any] {
      def this(props: PickPickPickerTimePropsMo) = this()
      def this(props: PickPickPickerTimePropsMo, context: js.Any) = this()
    }
    @JSImport("antd/lib/date-picker", "default.QuarterPicker")
    @js.native
    def QuarterPicker: ReactComponentClass[PickPickPickerTimePropsMo] = js.native
    @scala.inline
    def QuarterPicker_=(x: ReactComponentClass[PickPickPickerTimePropsMo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QuarterPicker")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("antd/lib/date-picker", "default.RangePicker")
    @js.native
    class RangePicker protected ()
      extends Component[typingsSlinky.antd.generatePickerMod.RangePickerProps[Moment], js.Any, js.Any] {
      def this(props: typingsSlinky.antd.generatePickerMod.RangePickerProps[Moment]) = this()
      def this(props: typingsSlinky.antd.generatePickerMod.RangePickerProps[Moment], context: js.Any) = this()
    }
    @JSImport("antd/lib/date-picker", "default.RangePicker")
    @js.native
    def RangePicker: ReactComponentClass[typingsSlinky.antd.generatePickerMod.RangePickerProps[Moment]] = js.native
    @scala.inline
    def RangePicker_=(x: ReactComponentClass[typingsSlinky.antd.generatePickerMod.RangePickerProps[Moment]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RangePicker")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("antd/lib/date-picker", "default.TimePicker")
    @js.native
    class TimePicker protected ()
      extends Component[PickPickPickerTimePropsMo, js.Any, js.Any] {
      def this(props: PickPickPickerTimePropsMo) = this()
      def this(props: PickPickPickerTimePropsMo, context: js.Any) = this()
    }
    @JSImport("antd/lib/date-picker", "default.TimePicker")
    @js.native
    def TimePicker: ReactComponentClass[PickPickPickerTimePropsMo] = js.native
    @scala.inline
    def TimePicker_=(x: ReactComponentClass[PickPickPickerTimePropsMo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TimePicker")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("antd/lib/date-picker", "default.WeekPicker")
    @js.native
    class WeekPicker protected ()
      extends Component[PickPickPickerDatePropsMo, js.Any, js.Any] {
      def this(props: PickPickPickerDatePropsMo) = this()
      def this(props: PickPickPickerDatePropsMo, context: js.Any) = this()
    }
    @JSImport("antd/lib/date-picker", "default.WeekPicker")
    @js.native
    def WeekPicker: ReactComponentClass[PickPickPickerDatePropsMo] = js.native
    @scala.inline
    def WeekPicker_=(x: ReactComponentClass[PickPickPickerDatePropsMo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WeekPicker")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("antd/lib/date-picker", "default.YearPicker")
    @js.native
    class YearPicker protected ()
      extends Component[PickPickPickerDatePropsMo, js.Any, js.Any] {
      def this(props: PickPickPickerDatePropsMo) = this()
      def this(props: PickPickPickerDatePropsMo, context: js.Any) = this()
    }
    @JSImport("antd/lib/date-picker", "default.YearPicker")
    @js.native
    def YearPicker: ReactComponentClass[PickPickPickerDatePropsMo] = js.native
    @scala.inline
    def YearPicker_=(x: ReactComponentClass[PickPickPickerDatePropsMo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YearPicker")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/date-picker", "default.childContextTypes")
    @js.native
    def childContextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def childContextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/date-picker", "default.contextType")
    @js.native
    def contextType: js.UndefOr[Context[js.Any]] = js.native
    @scala.inline
    def contextType_=(x: js.UndefOr[Context[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/date-picker", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/date-picker", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[Partial[PickerProps[Moment]]] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[Partial[PickerProps[Moment]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/date-picker", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/date-picker", "default.getDerivedStateFromError")
    @js.native
    def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[PickerProps[Moment], js.Any]] = js.native
    @scala.inline
    def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[PickerProps[Moment], js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/date-picker", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[PickerProps[Moment], js.Any]] = js.native
    @scala.inline
    def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[PickerProps[Moment], js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/date-picker", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMap[PickerProps[Moment]]] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMap[PickerProps[Moment]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type DatePickerProps = PickerProps[Moment]
  
  /* Inlined std.Omit<antd.antd/lib/date-picker/generatePicker.PickerDateProps<moment.moment.Moment>, 'picker'> */
  @js.native
  trait MonthPickerProps extends StObject {
    
    var allowClear: js.UndefOr[Boolean] = js.native
    
    var `aria-activedescendant`: js.UndefOr[String] = js.native
    
    var `aria-atomic`: js.UndefOr[Boolean] = js.native
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
    
    var `aria-busy`: js.UndefOr[Boolean] = js.native
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-colcount`: js.UndefOr[Double] = js.native
    
    var `aria-colindex`: js.UndefOr[Double] = js.native
    
    var `aria-colspan`: js.UndefOr[Double] = js.native
    
    var `aria-controls`: js.UndefOr[String] = js.native
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
    
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    var `aria-details`: js.UndefOr[String] = js.native
    
    var `aria-disabled`: js.UndefOr[Boolean] = js.native
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
    
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    var `aria-expanded`: js.UndefOr[Boolean] = js.native
    
    var `aria-flowto`: js.UndefOr[String] = js.native
    
    var `aria-grabbed`: js.UndefOr[Boolean] = js.native
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
    
    var `aria-hidden`: js.UndefOr[Boolean] = js.native
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.native
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    var `aria-level`: js.UndefOr[Double] = js.native
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
    
    var `aria-modal`: js.UndefOr[Boolean] = js.native
    
    var `aria-multiline`: js.UndefOr[Boolean] = js.native
    
    var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
    
    var `aria-owns`: js.UndefOr[String] = js.native
    
    var `aria-placeholder`: js.UndefOr[String] = js.native
    
    var `aria-posinset`: js.UndefOr[Double] = js.native
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-readonly`: js.UndefOr[Boolean] = js.native
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
      ] = js.native
    
    var `aria-required`: js.UndefOr[Boolean] = js.native
    
    var `aria-roledescription`: js.UndefOr[String] = js.native
    
    var `aria-rowcount`: js.UndefOr[Double] = js.native
    
    var `aria-rowindex`: js.UndefOr[Double] = js.native
    
    var `aria-rowspan`: js.UndefOr[Double] = js.native
    
    var `aria-selected`: js.UndefOr[Boolean] = js.native
    
    var `aria-setsize`: js.UndefOr[Double] = js.native
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
    
    var `aria-valuemax`: js.UndefOr[Double] = js.native
    
    var `aria-valuemin`: js.UndefOr[Double] = js.native
    
    var `aria-valuenow`: js.UndefOr[Double] = js.native
    
    var `aria-valuetext`: js.UndefOr[String] = js.native
    
    var autoComplete: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var bordered: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var clearIcon: js.UndefOr[ReactElement] = js.native
    
    var dateRender: js.UndefOr[DateRender[Moment]] = js.native
    
    var defaultOpen: js.UndefOr[Boolean] = js.native
    
    var defaultPickerValue: js.UndefOr[Moment] = js.native
    
    var defaultValue: js.UndefOr[Moment] = js.native
    
    var direction: js.UndefOr[ltr | rtl] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ Moment, Boolean]] = js.native
    
    var disabledTime: js.UndefOr[DisabledTime[Moment]] = js.native
    
    var dropdownAlign: js.UndefOr[AlignType] = js.native
    
    var dropdownClassName: js.UndefOr[String] = js.native
    
    var format: js.UndefOr[String | CustomFormat[Moment] | (js.Array[String | CustomFormat[Moment]])] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inputReadOnly: js.UndefOr[Boolean] = js.native
    
    var locale: js.UndefOr[PickerLocale] = js.native
    
    var mode: js.UndefOr[PanelMode] = js.native
    
    var monthCellRender: js.UndefOr[MonthCellRender[Moment]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onChange: js.UndefOr[js.Function2[/* value */ Moment | Null, /* dateString */ String, Unit]] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onOk: js.UndefOr[js.Function1[/* date */ Moment, Unit]] = js.native
    
    var onOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.native
    
    var onPanelChange: js.UndefOr[OnPanelChange[Moment]] = js.native
    
    var onSelect: js.UndefOr[js.Function1[/* value */ Moment, Unit]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var panelRender: js.UndefOr[js.Function1[/* originPanel */ ReactElement, ReactElement]] = js.native
    
    var pickerRef: js.UndefOr[MutableRefObject[PickerRefConfig]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var popupStyle: js.UndefOr[CSSProperties] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ PanelMode, ReactElement]] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var showNow: js.UndefOr[Boolean] = js.native
    
    var showTime: js.UndefOr[Boolean | SharedTimeProps[Moment]] = js.native
    
    var showToday: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[SizeType] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var suffixIcon: js.UndefOr[ReactElement] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[Moment | Null] = js.native
  }
  object MonthPickerProps {
    
    @scala.inline
    def apply(): MonthPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MonthPickerProps]
    }
    
    @scala.inline
    implicit class MonthPickerPropsMutableBuilder[Self <: MonthPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      @scala.inline
      def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      @scala.inline
      def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      @scala.inline
      def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      @scala.inline
      def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      @scala.inline
      def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      @scala.inline
      def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      @scala.inline
      def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      @scala.inline
      def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      @scala.inline
      def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      @scala.inline
      def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      @scala.inline
      def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      @scala.inline
      def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      @scala.inline
      def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      @scala.inline
      def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      @scala.inline
      def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      @scala.inline
      def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      @scala.inline
      def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      @scala.inline
      def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      @scala.inline
      def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      @scala.inline
      def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      @scala.inline
      def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      @scala.inline
      def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      @scala.inline
      def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      @scala.inline
      def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      @scala.inline
      def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      @scala.inline
      def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      @scala.inline
      def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      @scala.inline
      def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      @scala.inline
      def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      @scala.inline
      def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      @scala.inline
      def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      @scala.inline
      def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      @scala.inline
      def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      @scala.inline
      def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      @scala.inline
      def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      @scala.inline
      def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      @scala.inline
      def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      @scala.inline
      def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClearIcon(value: ReactElement): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIconReactElement(value: ReactElement): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      @scala.inline
      def setDateRender(value: (Moment, Moment) => ReactElement): Self = StObject.set(x, "dateRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDateRenderUndefined: Self = StObject.set(x, "dateRender", js.undefined)
      
      @scala.inline
      def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      @scala.inline
      def setDefaultPickerValue(value: Moment): Self = StObject.set(x, "defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPickerValueUndefined: Self = StObject.set(x, "defaultPickerValue", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Moment): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDate(value: /* date */ Moment => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      @scala.inline
      def setDisabledTime(value: /* date */ Moment | Null => DisabledTimes): Self = StObject.set(x, "disabledTime", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDropdownAlign(value: AlignType): Self = StObject.set(x, "dropdownAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownAlignUndefined: Self = StObject.set(x, "dropdownAlign", js.undefined)
      
      @scala.inline
      def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
      
      @scala.inline
      def setFormat(value: String | CustomFormat[Moment] | (js.Array[String | CustomFormat[Moment]])): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatFunction1(value: Moment => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setFormatVarargs(value: (String | CustomFormat[Moment])*): Self = StObject.set(x, "format", js.Array(value :_*))
      
      @scala.inline
      def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInputReadOnly(value: Boolean): Self = StObject.set(x, "inputReadOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputReadOnlyUndefined: Self = StObject.set(x, "inputReadOnly", js.undefined)
      
      @scala.inline
      def setLocale(value: PickerLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMode(value: PanelMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMonthCellRender(value: (Moment, /* locale */ Locale) => ReactElement): Self = StObject.set(x, "monthCellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMonthCellRenderUndefined: Self = StObject.set(x, "monthCellRender", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* value */ Moment | Null, /* dateString */ String) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* date */ Moment => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setOnOpenChange(value: /* open */ Boolean => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      @scala.inline
      def setOnPanelChange(value: (Moment, /* mode */ PanelMode) => Unit): Self = StObject.set(x, "onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPanelChangeUndefined: Self = StObject.set(x, "onPanelChange", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* value */ Moment => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPanelRender(value: /* originPanel */ ReactElement => ReactElement): Self = StObject.set(x, "panelRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPanelRenderUndefined: Self = StObject.set(x, "panelRender", js.undefined)
      
      @scala.inline
      def setPickerRef(value: MutableRefObject[PickerRefConfig]): Self = StObject.set(x, "pickerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerRefUndefined: Self = StObject.set(x, "pickerRef", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPopupStyle(value: CSSProperties): Self = StObject.set(x, "popupStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRenderExtraFooter(value: /* mode */ PanelMode => ReactElement): Self = StObject.set(x, "renderExtraFooter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderExtraFooterUndefined: Self = StObject.set(x, "renderExtraFooter", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setShowNow(value: Boolean): Self = StObject.set(x, "showNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNowUndefined: Self = StObject.set(x, "showNow", js.undefined)
      
      @scala.inline
      def setShowTime(value: Boolean | SharedTimeProps[Moment]): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTimeUndefined: Self = StObject.set(x, "showTime", js.undefined)
      
      @scala.inline
      def setShowToday(value: Boolean): Self = StObject.set(x, "showToday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTodayUndefined: Self = StObject.set(x, "showToday", js.undefined)
      
      @scala.inline
      def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuffixIcon(value: ReactElement): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixIconReactElement(value: ReactElement): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setValue(value: Moment): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type RangePickerProps = typingsSlinky.antd.generatePickerMod.RangePickerProps[Moment]
  
  /* Inlined std.Omit<antd.antd/lib/date-picker/generatePicker.PickerDateProps<moment.moment.Moment>, 'picker'> */
  @js.native
  trait WeekPickerProps extends StObject {
    
    var allowClear: js.UndefOr[Boolean] = js.native
    
    var `aria-activedescendant`: js.UndefOr[String] = js.native
    
    var `aria-atomic`: js.UndefOr[Boolean] = js.native
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
    
    var `aria-busy`: js.UndefOr[Boolean] = js.native
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-colcount`: js.UndefOr[Double] = js.native
    
    var `aria-colindex`: js.UndefOr[Double] = js.native
    
    var `aria-colspan`: js.UndefOr[Double] = js.native
    
    var `aria-controls`: js.UndefOr[String] = js.native
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
    
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    var `aria-details`: js.UndefOr[String] = js.native
    
    var `aria-disabled`: js.UndefOr[Boolean] = js.native
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
    
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    var `aria-expanded`: js.UndefOr[Boolean] = js.native
    
    var `aria-flowto`: js.UndefOr[String] = js.native
    
    var `aria-grabbed`: js.UndefOr[Boolean] = js.native
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
    
    var `aria-hidden`: js.UndefOr[Boolean] = js.native
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.native
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    var `aria-level`: js.UndefOr[Double] = js.native
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
    
    var `aria-modal`: js.UndefOr[Boolean] = js.native
    
    var `aria-multiline`: js.UndefOr[Boolean] = js.native
    
    var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
    
    var `aria-owns`: js.UndefOr[String] = js.native
    
    var `aria-placeholder`: js.UndefOr[String] = js.native
    
    var `aria-posinset`: js.UndefOr[Double] = js.native
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-readonly`: js.UndefOr[Boolean] = js.native
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
      ] = js.native
    
    var `aria-required`: js.UndefOr[Boolean] = js.native
    
    var `aria-roledescription`: js.UndefOr[String] = js.native
    
    var `aria-rowcount`: js.UndefOr[Double] = js.native
    
    var `aria-rowindex`: js.UndefOr[Double] = js.native
    
    var `aria-rowspan`: js.UndefOr[Double] = js.native
    
    var `aria-selected`: js.UndefOr[Boolean] = js.native
    
    var `aria-setsize`: js.UndefOr[Double] = js.native
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
    
    var `aria-valuemax`: js.UndefOr[Double] = js.native
    
    var `aria-valuemin`: js.UndefOr[Double] = js.native
    
    var `aria-valuenow`: js.UndefOr[Double] = js.native
    
    var `aria-valuetext`: js.UndefOr[String] = js.native
    
    var autoComplete: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var bordered: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var clearIcon: js.UndefOr[ReactElement] = js.native
    
    var dateRender: js.UndefOr[DateRender[Moment]] = js.native
    
    var defaultOpen: js.UndefOr[Boolean] = js.native
    
    var defaultPickerValue: js.UndefOr[Moment] = js.native
    
    var defaultValue: js.UndefOr[Moment] = js.native
    
    var direction: js.UndefOr[ltr | rtl] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ Moment, Boolean]] = js.native
    
    var disabledTime: js.UndefOr[DisabledTime[Moment]] = js.native
    
    var dropdownAlign: js.UndefOr[AlignType] = js.native
    
    var dropdownClassName: js.UndefOr[String] = js.native
    
    var format: js.UndefOr[String | CustomFormat[Moment] | (js.Array[String | CustomFormat[Moment]])] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inputReadOnly: js.UndefOr[Boolean] = js.native
    
    var locale: js.UndefOr[PickerLocale] = js.native
    
    var mode: js.UndefOr[PanelMode] = js.native
    
    var monthCellRender: js.UndefOr[MonthCellRender[Moment]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onChange: js.UndefOr[js.Function2[/* value */ Moment | Null, /* dateString */ String, Unit]] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onOk: js.UndefOr[js.Function1[/* date */ Moment, Unit]] = js.native
    
    var onOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.native
    
    var onPanelChange: js.UndefOr[OnPanelChange[Moment]] = js.native
    
    var onSelect: js.UndefOr[js.Function1[/* value */ Moment, Unit]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var panelRender: js.UndefOr[js.Function1[/* originPanel */ ReactElement, ReactElement]] = js.native
    
    var pickerRef: js.UndefOr[MutableRefObject[PickerRefConfig]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var popupStyle: js.UndefOr[CSSProperties] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ PanelMode, ReactElement]] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var showNow: js.UndefOr[Boolean] = js.native
    
    var showTime: js.UndefOr[Boolean | SharedTimeProps[Moment]] = js.native
    
    var showToday: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[SizeType] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var suffixIcon: js.UndefOr[ReactElement] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[Moment | Null] = js.native
  }
  object WeekPickerProps {
    
    @scala.inline
    def apply(): WeekPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WeekPickerProps]
    }
    
    @scala.inline
    implicit class WeekPickerPropsMutableBuilder[Self <: WeekPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      @scala.inline
      def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      @scala.inline
      def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      @scala.inline
      def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      @scala.inline
      def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      @scala.inline
      def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      @scala.inline
      def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      @scala.inline
      def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      @scala.inline
      def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      @scala.inline
      def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      @scala.inline
      def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      @scala.inline
      def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      @scala.inline
      def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      @scala.inline
      def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      @scala.inline
      def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      @scala.inline
      def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      @scala.inline
      def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      @scala.inline
      def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      @scala.inline
      def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      @scala.inline
      def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      @scala.inline
      def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      @scala.inline
      def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      @scala.inline
      def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      @scala.inline
      def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      @scala.inline
      def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      @scala.inline
      def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      @scala.inline
      def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      @scala.inline
      def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      @scala.inline
      def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      @scala.inline
      def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      @scala.inline
      def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      @scala.inline
      def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      @scala.inline
      def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      @scala.inline
      def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      @scala.inline
      def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      @scala.inline
      def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      @scala.inline
      def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      @scala.inline
      def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      @scala.inline
      def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClearIcon(value: ReactElement): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIconReactElement(value: ReactElement): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      @scala.inline
      def setDateRender(value: (Moment, Moment) => ReactElement): Self = StObject.set(x, "dateRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDateRenderUndefined: Self = StObject.set(x, "dateRender", js.undefined)
      
      @scala.inline
      def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      @scala.inline
      def setDefaultPickerValue(value: Moment): Self = StObject.set(x, "defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPickerValueUndefined: Self = StObject.set(x, "defaultPickerValue", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Moment): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDate(value: /* date */ Moment => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      @scala.inline
      def setDisabledTime(value: /* date */ Moment | Null => DisabledTimes): Self = StObject.set(x, "disabledTime", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDropdownAlign(value: AlignType): Self = StObject.set(x, "dropdownAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownAlignUndefined: Self = StObject.set(x, "dropdownAlign", js.undefined)
      
      @scala.inline
      def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
      
      @scala.inline
      def setFormat(value: String | CustomFormat[Moment] | (js.Array[String | CustomFormat[Moment]])): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatFunction1(value: Moment => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setFormatVarargs(value: (String | CustomFormat[Moment])*): Self = StObject.set(x, "format", js.Array(value :_*))
      
      @scala.inline
      def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInputReadOnly(value: Boolean): Self = StObject.set(x, "inputReadOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputReadOnlyUndefined: Self = StObject.set(x, "inputReadOnly", js.undefined)
      
      @scala.inline
      def setLocale(value: PickerLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMode(value: PanelMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMonthCellRender(value: (Moment, /* locale */ Locale) => ReactElement): Self = StObject.set(x, "monthCellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMonthCellRenderUndefined: Self = StObject.set(x, "monthCellRender", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* value */ Moment | Null, /* dateString */ String) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* date */ Moment => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setOnOpenChange(value: /* open */ Boolean => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      @scala.inline
      def setOnPanelChange(value: (Moment, /* mode */ PanelMode) => Unit): Self = StObject.set(x, "onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPanelChangeUndefined: Self = StObject.set(x, "onPanelChange", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* value */ Moment => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPanelRender(value: /* originPanel */ ReactElement => ReactElement): Self = StObject.set(x, "panelRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPanelRenderUndefined: Self = StObject.set(x, "panelRender", js.undefined)
      
      @scala.inline
      def setPickerRef(value: MutableRefObject[PickerRefConfig]): Self = StObject.set(x, "pickerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerRefUndefined: Self = StObject.set(x, "pickerRef", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPopupStyle(value: CSSProperties): Self = StObject.set(x, "popupStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRenderExtraFooter(value: /* mode */ PanelMode => ReactElement): Self = StObject.set(x, "renderExtraFooter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderExtraFooterUndefined: Self = StObject.set(x, "renderExtraFooter", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setShowNow(value: Boolean): Self = StObject.set(x, "showNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNowUndefined: Self = StObject.set(x, "showNow", js.undefined)
      
      @scala.inline
      def setShowTime(value: Boolean | SharedTimeProps[Moment]): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTimeUndefined: Self = StObject.set(x, "showTime", js.undefined)
      
      @scala.inline
      def setShowToday(value: Boolean): Self = StObject.set(x, "showToday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTodayUndefined: Self = StObject.set(x, "showToday", js.undefined)
      
      @scala.inline
      def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuffixIcon(value: ReactElement): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixIconReactElement(value: ReactElement): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setValue(value: Moment): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
