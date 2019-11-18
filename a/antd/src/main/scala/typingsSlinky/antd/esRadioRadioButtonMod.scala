package typingsSlinky.antd

import slinky.core.facade.ReactElement
import typingsSlinky.antd.esCheckboxCheckboxMod.AbstractCheckboxProps
import typingsSlinky.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.antd.esRadioInterfaceMod.RadioChangeEvent
import typingsSlinky.antd.esRadioRadioButtonMod.RadioButton
import typingsSlinky.antd.esRadioRadioButtonMod.RadioButtonProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es/radio/radioButton", JSImport.Namespace)
@js.native
object esRadioRadioButtonMod extends js.Object {
  @js.native
  trait RadioButton
    extends Component[RadioButtonProps, js.Any, js.Any] {
    def renderRadioButton(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
  }
  
  @js.native
  class default () extends RadioButton
  
  /* static members */
  @js.native
  object default extends js.Object {
    var contextTypes: Anon_RadioGroup = js.native
  }
  
  type RadioButtonProps = AbstractCheckboxProps[RadioChangeEvent]
}

