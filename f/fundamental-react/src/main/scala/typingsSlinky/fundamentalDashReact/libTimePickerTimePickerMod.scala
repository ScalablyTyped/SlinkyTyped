package typingsSlinky.fundamentalDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.fundamentalDashReact.libTimeTimeMod.TimeBaseProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/TimePicker/TimePicker", JSImport.Namespace)
@js.native
object libTimePickerTimePickerMod extends js.Object {
  @js.native
  class default ()
    extends Component[TimePickerProps, js.Object, js.Any]
  
  /* static members */
  @js.native
  object default extends js.Object {
    var displayName: typingsSlinky.fundamentalDashReact.fundamentalDashReactStrings.TimePicker = js.native
  }
  
  type TimePicker = ReactComponentClass[TimePickerProps]
  type TimePickerProps = Anon_ButtonPropsDisabled with TimeBaseProps
}

