package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.anon.Cols
import typingsSlinky.antDesignReactNative.anon.ColsValue
import typingsSlinky.antDesignReactNative.anon.Date
import typingsSlinky.antDesignReactNative.anon.Day
import typingsSlinky.antDesignReactNative.anon.DefaultDate
import typingsSlinky.antDesignReactNative.anon.Key
import typingsSlinky.antDesignReactNative.datePickerPropsMod.DatePickerProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerDatepickerDatePickerMod {
  
  @JSImport("@ant-design/react-native/lib/date-picker/datepicker/DatePicker", JSImport.Default)
  @js.native
  class default () extends DatePicker
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker/DatePicker", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker/DatePicker", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      @scala.inline
      def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker/DatePicker", "default.defaultProps.locale")
      @js.native
      def locale: Day = js.native
      @scala.inline
      def locale_=(x: Day): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker/DatePicker", "default.defaultProps.minuteStep")
      @js.native
      def minuteStep: Double = js.native
      @scala.inline
      def minuteStep_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minuteStep")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker/DatePicker", "default.defaultProps.mode")
      @js.native
      def mode: String = js.native
      @scala.inline
      def mode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker/DatePicker", "default.defaultProps.onDateChange")
      @js.native
      def onDateChange(): Unit = js.native
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker/DatePicker", "default.defaultProps.pickerPrefixCls")
      @js.native
      def pickerPrefixCls: String = js.native
      @scala.inline
      def pickerPrefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pickerPrefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker/DatePicker", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      @scala.inline
      def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker/DatePicker", "default.defaultProps.use12Hours")
      @js.native
      def use12Hours: Boolean = js.native
      @scala.inline
      def use12Hours_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("use12Hours")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DatePicker
    extends Component[DatePickerProps, js.Any, js.Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MDatePicker(nextProps: DefaultDate): Unit = js.native
    
    def clipDate(date: js.Any): js.Any = js.native
    
    var defaultMaxDate: js.Any = js.native
    
    var defaultMinDate: js.Any = js.native
    
    def getDate(): js.Any = js.native
    
    def getDateData(): js.Array[Key] = js.native
    
    def getDefaultMaxDate(): js.Any = js.native
    
    def getDefaultMinDate(): js.Any = js.native
    
    def getDisplayHour(rawHour: Double): Double = js.native
    
    def getMaxDate(): js.Any = js.native
    
    def getMaxDay(): js.Any = js.native
    
    def getMaxHour(): js.Any = js.native
    
    def getMaxMinute(): js.Any = js.native
    
    def getMaxMonth(): js.Any = js.native
    
    def getMaxYear(): js.Any = js.native
    
    def getMinDate(): js.Any = js.native
    
    def getMinDay(): js.Any = js.native
    
    def getMinHour(): js.Any = js.native
    
    def getMinMinute(): js.Any = js.native
    
    def getMinMonth(): js.Any = js.native
    
    def getMinYear(): js.Any = js.native
    
    def getNewDate(values: js.Any, index: js.Any): js.Any = js.native
    
    def getTimeData(date: js.Any): Cols = js.native
    
    def getValue(): js.Any = js.native
    
    def getValueCols(): ColsValue = js.native
    
    def onScrollChange(values: js.Any, index: js.Any): Unit = js.native
    
    def onValueChange(values: js.Any, index: js.Any): Unit = js.native
    
    def setAmPm(date: js.Any, index: js.Any): Unit = js.native
    
    def setHours(date: js.Date, hour: Double): Unit = js.native
    
    @JSName("state")
    var state_DatePicker: Date = js.native
  }
}
