package typingsSlinky.rcPicker

import slinky.core.facade.ReactElement
import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quarterBodyMod {
  
  @JSImport("rc-picker/es/panels/QuarterPanel/QuarterBody", JSImport.Default)
  @js.native
  def default[DateType](props: QuarterBodyProps[DateType]): ReactElement = js.native
  
  @JSImport("rc-picker/es/panels/QuarterPanel/QuarterBody", "QUARTER_COL_COUNT")
  @js.native
  val QUARTER_COL_COUNT: /* 4 */ Double = js.native
  
  @js.native
  trait QuarterBodyProps[DateType] extends StObject {
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
    
    var generateConfig: GenerateConfig[DateType] = js.native
    
    var locale: Locale = js.native
    
    def onSelect(value: DateType): Unit = js.native
    
    var prefixCls: String = js.native
    
    var value: js.UndefOr[DateType | Null] = js.native
    
    var viewDate: DateType = js.native
  }
  object QuarterBodyProps {
    
    @scala.inline
    def apply[DateType](
      generateConfig: GenerateConfig[DateType],
      locale: Locale,
      onSelect: DateType => Unit,
      prefixCls: String,
      viewDate: DateType
    ): QuarterBodyProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1(onSelect), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuarterBodyProps[DateType]]
    }
    
    @scala.inline
    implicit class QuarterBodyPropsMutableBuilder[Self <: QuarterBodyProps[_], DateType] (val x: Self with QuarterBodyProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      @scala.inline
      def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelect(value: DateType => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setViewDate(value: DateType): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
    }
  }
}
