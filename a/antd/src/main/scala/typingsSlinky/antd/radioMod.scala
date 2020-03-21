package typingsSlinky.antd

import slinky.core.facade.ReactElement
import typingsSlinky.antd.radioButtonMod.RadioButtonProps
import typingsSlinky.antd.radioInterfaceMod.RadioGroupContextProps
import typingsSlinky.antd.radioInterfaceMod.RadioGroupProps
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/radio", JSImport.Namespace)
@js.native
object radioMod extends js.Object {
  @js.native
  class Group protected ()
    extends typingsSlinky.antd.radioGroupMod.default {
    def this(props: RadioGroupProps) = this()
  }
  
  @js.native
  class default ()
    extends typingsSlinky.antd.radioRadioMod.default
  
  def Button(props: RadioButtonProps): ReactElement = js.native
  /* static members */
  @js.native
  object Group extends js.Object {
    var defaultProps: AnonButtonStyle = js.native
    def getDerivedStateFromProps(nextProps: RadioGroupProps): AnonValueAny | Null = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Button: js.Function1[/* props */ RadioButtonProps, ReactElement] = js.native
    var Group: TypeofRadioGroup = js.native
    var contextType: Context[RadioGroupContextProps | Null] = js.native
    var defaultProps: AnonType = js.native
  }
  
}

