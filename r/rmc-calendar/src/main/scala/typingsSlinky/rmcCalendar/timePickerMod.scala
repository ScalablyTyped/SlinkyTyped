package typingsSlinky.rmcCalendar

import typingsSlinky.react.mod.PureComponent
import typingsSlinky.rmcCalendar.dataTypesMod.Models.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timePickerMod {
  
  @JSImport("rmc-calendar/lib/TimePicker", JSImport.Default)
  @js.native
  class default () extends TimePicker
  /* static members */
  object default {
    
    @JSImport("rmc-calendar/lib/TimePicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-calendar/lib/TimePicker", "default.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    @scala.inline
    def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PropsType extends StObject {
    
    var clientHeight: js.UndefOr[Double] = js.native
    
    var defaultValue: js.UndefOr[js.Date] = js.native
    
    var locale: Locale = js.native
    
    var maxDate: js.UndefOr[js.Date] = js.native
    
    var minDate: js.UndefOr[js.Date] = js.native
    
    var onValueChange: js.UndefOr[js.Function1[/* time */ js.Date, Unit]] = js.native
    
    var pickerPrefixCls: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[js.Date] = js.native
  }
  object PropsType {
    
    @scala.inline
    def apply(locale: Locale): PropsType = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsType]
    }
    
    @scala.inline
    implicit class PropsTypeMutableBuilder[Self <: PropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientHeightUndefined: Self = StObject.set(x, "clientHeight", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: js.Date): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: /* time */ js.Date => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      @scala.inline
      def setPickerPrefixCls(value: String): Self = StObject.set(x, "pickerPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerPrefixClsUndefined: Self = StObject.set(x, "pickerPrefixCls", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait StateType extends StObject
  
  @js.native
  trait TimePicker
    extends PureComponent[PropsType, StateType, js.Any] {
    
    def getMaxTime(): js.UndefOr[js.Date] = js.native
    def getMaxTime(date: js.Date): js.UndefOr[js.Date] = js.native
    
    def getMinTime(): js.UndefOr[js.Date] = js.native
    def getMinTime(date: js.Date): js.UndefOr[js.Date] = js.native
    
    def onDateChange(date: js.Date): Unit = js.native
  }
}
