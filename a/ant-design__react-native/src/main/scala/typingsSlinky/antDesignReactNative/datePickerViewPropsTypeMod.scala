package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.datePickerPropsTypeMod.DatePickerPropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerViewPropsTypeMod {
  
  @js.native
  trait DatePickerProps extends DatePickerPropsType {
    
    var styles: js.UndefOr[js.Any] = js.native
    
    var triggerTypes: js.UndefOr[String] = js.native
  }
  object DatePickerProps {
    
    @scala.inline
    def apply(): DatePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerProps]
    }
    
    @scala.inline
    implicit class DatePickerPropsMutableBuilder[Self <: DatePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTriggerTypes(value: String): Self = StObject.set(x, "triggerTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerTypesUndefined: Self = StObject.set(x, "triggerTypes", js.undefined)
    }
  }
}
