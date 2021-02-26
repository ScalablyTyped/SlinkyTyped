package typingsSlinky.antd

import slinky.core.facade.ReactElement
import typingsSlinky.antd.generateCalendarMod.CalendarMode
import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerMod {
  
  @JSImport("antd/lib/calendar/Header", JSImport.Default)
  @js.native
  def default[DateType](props: CalendarHeaderProps[DateType]): ReactElement = js.native
  
  @js.native
  trait CalendarHeaderProps[DateType] extends StObject {
    
    var fullscreen: Boolean = js.native
    
    var generateConfig: GenerateConfig[DateType] = js.native
    
    var locale: Locale = js.native
    
    var mode: CalendarMode = js.native
    
    def onChange(date: DateType): Unit = js.native
    
    def onModeChange(mode: CalendarMode): Unit = js.native
    
    var prefixCls: String = js.native
    
    var validRange: js.UndefOr[js.Tuple2[DateType, DateType]] = js.native
    
    var value: DateType = js.native
  }
  object CalendarHeaderProps {
    
    @scala.inline
    def apply[DateType](
      fullscreen: Boolean,
      generateConfig: GenerateConfig[DateType],
      locale: Locale,
      mode: CalendarMode,
      onChange: DateType => Unit,
      onModeChange: CalendarMode => Unit,
      prefixCls: String,
      value: DateType
    ): CalendarHeaderProps[DateType] = {
      val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onModeChange = js.Any.fromFunction1(onModeChange), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarHeaderProps[DateType]]
    }
    
    @scala.inline
    implicit class CalendarHeaderPropsMutableBuilder[Self <: CalendarHeaderProps[_], DateType] (val x: Self with CalendarHeaderProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: CalendarMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: DateType => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnModeChange(value: CalendarMode => Unit): Self = StObject.set(x, "onModeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidRange(value: js.Tuple2[DateType, DateType]): Self = StObject.set(x, "validRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidRangeUndefined: Self = StObject.set(x, "validRange", js.undefined)
      
      @scala.inline
      def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
