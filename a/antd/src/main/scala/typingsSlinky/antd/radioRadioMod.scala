package typingsSlinky.antd

import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.Type
import typingsSlinky.antd.anon.TypeofRadioGroup
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.antd.radioButtonMod.RadioButtonProps
import typingsSlinky.antd.radioInterfaceMod.RadioChangeEvent
import typingsSlinky.antd.radioInterfaceMod.RadioGroupContextProps
import typingsSlinky.antd.radioInterfaceMod.RadioProps
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/radio/radio", JSImport.Namespace)
@js.native
object radioRadioMod extends js.Object {
  @js.native
  trait Radio
    extends Component[RadioProps, js.Object, js.Any] {
    var rcCheckbox: js.Any = js.native
    def blur(): Unit = js.native
    def focus(): Unit = js.native
    def onChange(e: RadioChangeEvent): Unit = js.native
    def renderRadio(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
    def saveCheckbox(node: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends Radio
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Button: ForwardRefExoticComponent[RadioButtonProps with RefAttributes[_]] = js.native
    var Group: TypeofRadioGroup = js.native
    var contextType: Context[RadioGroupContextProps | Null] = js.native
    var defaultProps: Type = js.native
  }
  
}

