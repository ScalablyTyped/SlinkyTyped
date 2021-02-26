package typingsSlinky.rcPicker

import slinky.core.facade.ReactElement
import typingsSlinky.rcPicker.dateBodyMod.DateRender
import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.DisabledTime
import typingsSlinky.rcPicker.interfaceMod.DisabledTimes
import typingsSlinky.rcPicker.interfaceMod.Locale
import typingsSlinky.rcPicker.interfaceMod.NullableDateType
import typingsSlinky.rcPicker.interfaceMod.OnSelect
import typingsSlinky.rcPicker.interfaceMod.PanelMode
import typingsSlinky.rcPicker.interfaceMod.PanelRefProps
import typingsSlinky.rcPicker.rcPickerStrings.key
import typingsSlinky.rcPicker.rcPickerStrings.mouse
import typingsSlinky.rcPicker.rcPickerStrings.submit
import typingsSlinky.rcPicker.timePanelMod.SharedTimeProps
import typingsSlinky.rcPicker.uiUtilMod.KeyboardConfig
import typingsSlinky.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datetimePanelMod {
  
  @JSImport("rc-picker/es/panels/DatetimePanel", JSImport.Default)
  @js.native
  def default[DateType](props: DatetimePanelProps[DateType]): ReactElement = js.native
  
  /* Inlined parent std.Omit<rc-picker.rc-picker/es/panels/DatePanel.DatePanelProps<DateType>, 'disabledHours' | 'disabledMinutes' | 'disabledSeconds'> */
  @js.native
  trait DatetimePanelProps[DateType] extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var dateRender: js.UndefOr[DateRender[DateType]] = js.native
    
    var defaultPickerValue: js.UndefOr[DateType] = js.native
    
    var defaultValue: js.UndefOr[DateType] = js.native
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
    
    var disabledTime: js.UndefOr[DisabledTime[DateType]] = js.native
    
    var generateConfig: GenerateConfig[DateType] = js.native
    
    var keyboardConfig: js.UndefOr[KeyboardConfig] = js.native
    
    var locale: Locale = js.native
    
    var nextIcon: js.UndefOr[ReactElement] = js.native
    
    var onPanelChange: js.Function2[/* mode */ PanelMode | Null, /* viewValue */ DateType, Unit] = js.native
    
    var onSelect: OnSelect[DateType] = js.native
    
    var onViewDateChange: js.Function1[/* value */ DateType, Unit] = js.native
    
    var operationRef: MutableRefObject[PanelRefProps] = js.native
    
    var panelName: js.UndefOr[String] = js.native
    
    var prefixCls: String = js.native
    
    var prefixColumn: js.UndefOr[js.Function1[/* date */ DateType, ReactElement]] = js.native
    
    var prevIcon: js.UndefOr[ReactElement] = js.native
    
    var rowClassName: js.UndefOr[js.Function1[/* date */ DateType, String]] = js.native
    
    var showTime: js.UndefOr[Boolean | SharedTimeProps[DateType]] = js.native
    
    var superNextIcon: js.UndefOr[ReactElement] = js.native
    
    var superPrevIcon: js.UndefOr[ReactElement] = js.native
    
    var value: js.UndefOr[NullableDateType[DateType]] = js.native
    
    var viewDate: DateType = js.native
  }
  object DatetimePanelProps {
    
    @scala.inline
    def apply[DateType](
      generateConfig: GenerateConfig[DateType],
      locale: Locale,
      onPanelChange: (/* mode */ PanelMode | Null, /* viewValue */ DateType) => Unit,
      onSelect: (DateType, /* type */ key | mouse | submit) => Unit,
      onViewDateChange: /* value */ DateType => Unit,
      operationRef: MutableRefObject[PanelRefProps],
      prefixCls: String,
      viewDate: DateType
    ): DatetimePanelProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onPanelChange = js.Any.fromFunction2(onPanelChange), onSelect = js.Any.fromFunction2(onSelect), onViewDateChange = js.Any.fromFunction1(onViewDateChange), operationRef = operationRef.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatetimePanelProps[DateType]]
    }
    
    @scala.inline
    implicit class DatetimePanelPropsMutableBuilder[Self <: DatetimePanelProps[_], DateType] (val x: Self with DatetimePanelProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setDateRender(value: (DateType, DateType) => ReactElement): Self = StObject.set(x, "dateRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDateRenderUndefined: Self = StObject.set(x, "dateRender", js.undefined)
      
      @scala.inline
      def setDefaultPickerValue(value: DateType): Self = StObject.set(x, "defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPickerValueUndefined: Self = StObject.set(x, "defaultPickerValue", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: DateType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      @scala.inline
      def setDisabledTime(value: /* date */ DateType | Null => DisabledTimes): Self = StObject.set(x, "disabledTime", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
      
      @scala.inline
      def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardConfig(value: KeyboardConfig): Self = StObject.set(x, "keyboardConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardConfigUndefined: Self = StObject.set(x, "keyboardConfig", js.undefined)
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIcon(value: ReactElement): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIconReactElement(value: ReactElement): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIconUndefined: Self = StObject.set(x, "nextIcon", js.undefined)
      
      @scala.inline
      def setOnPanelChange(value: (/* mode */ PanelMode | Null, /* viewValue */ DateType) => Unit): Self = StObject.set(x, "onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelect(value: (DateType, /* type */ key | mouse | submit) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnViewDateChange(value: /* value */ DateType => Unit): Self = StObject.set(x, "onViewDateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOperationRef(value: MutableRefObject[PanelRefProps]): Self = StObject.set(x, "operationRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelName(value: String): Self = StObject.set(x, "panelName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelNameUndefined: Self = StObject.set(x, "panelName", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixColumn(value: /* date */ DateType => ReactElement): Self = StObject.set(x, "prefixColumn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefixColumnUndefined: Self = StObject.set(x, "prefixColumn", js.undefined)
      
      @scala.inline
      def setPrevIcon(value: ReactElement): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIconReactElement(value: ReactElement): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIconUndefined: Self = StObject.set(x, "prevIcon", js.undefined)
      
      @scala.inline
      def setRowClassName(value: /* date */ DateType => String): Self = StObject.set(x, "rowClassName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowClassNameUndefined: Self = StObject.set(x, "rowClassName", js.undefined)
      
      @scala.inline
      def setShowTime(value: Boolean | SharedTimeProps[DateType]): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTimeUndefined: Self = StObject.set(x, "showTime", js.undefined)
      
      @scala.inline
      def setSuperNextIcon(value: ReactElement): Self = StObject.set(x, "superNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuperNextIconReactElement(value: ReactElement): Self = StObject.set(x, "superNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuperNextIconUndefined: Self = StObject.set(x, "superNextIcon", js.undefined)
      
      @scala.inline
      def setSuperPrevIcon(value: ReactElement): Self = StObject.set(x, "superPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuperPrevIconReactElement(value: ReactElement): Self = StObject.set(x, "superPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuperPrevIconUndefined: Self = StObject.set(x, "superPrevIcon", js.undefined)
      
      @scala.inline
      def setValue(value: NullableDateType[DateType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setViewDate(value: DateType): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
    }
  }
}
