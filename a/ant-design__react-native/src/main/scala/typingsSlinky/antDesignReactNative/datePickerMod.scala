package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.anon.AntLocale
import typingsSlinky.antDesignReactNative.anon.Mode
import typingsSlinky.antDesignReactNative.datePickerPropsTypeMod.DatePickerPropsType
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.antDesignReactNative.pickerStyleMod.PickerStyle
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerMod {
  
  @JSImport("@ant-design/react-native/lib/date-picker", JSImport.Default)
  @js.native
  class default () extends DatePicker
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/date-picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/date-picker", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    @scala.inline
    def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/date-picker", "default.defaultProps")
    @js.native
    def defaultProps: Mode = js.native
    @scala.inline
    def defaultProps_=(x: Mode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DatePicker
    extends Component[DatePickerProps, js.Object, js.Any]
  
  @js.native
  trait DatePickerProps
    extends DatePickerPropsType
       with WithThemeStyles[PickerStyle] {
    
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
      def setTriggerTypes(value: String): Self = StObject.set(x, "triggerTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerTypesUndefined: Self = StObject.set(x, "triggerTypes", js.undefined)
    }
  }
}
