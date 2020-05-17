package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.anon.AntLocale
import typingsSlinky.antdMobileRn.anon.Extra
import typingsSlinky.antdMobileRn.datePickerViewPropsTypeMod.DatePickerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile-rn/lib/date-picker-view/date-picker-view", JSImport.Namespace)
@js.native
object datePickerViewMod extends js.Object {
  @js.native
  trait DatePickerView
    extends Component[DatePickerProps, js.Any, js.Any]
  
  @js.native
  class default () extends DatePickerView
  
  /* static members */
  @js.native
  object default extends js.Object {
    var contextTypes: AntLocale = js.native
    var defaultProps: Extra = js.native
  }
  
}

