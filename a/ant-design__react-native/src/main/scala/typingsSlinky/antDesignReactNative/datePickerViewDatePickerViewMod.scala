package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.anon.AntLocale
import typingsSlinky.antDesignReactNative.anon.MinuteStep
import typingsSlinky.antDesignReactNative.datePickerViewPropsTypeMod.DatePickerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native/lib/date-picker-view/date-picker-view", JSImport.Namespace)
@js.native
object datePickerViewDatePickerViewMod extends js.Object {
  
  @js.native
  trait DatePickerView
    extends Component[DatePickerProps, js.Any, js.Any]
  
  @js.native
  class default () extends DatePickerView
  /* static members */
  @js.native
  object default extends js.Object {
    
    var contextTypes: AntLocale = js.native
    
    var defaultProps: MinuteStep = js.native
  }
}
