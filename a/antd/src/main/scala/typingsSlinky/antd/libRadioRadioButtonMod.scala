package typingsSlinky.antd

import typingsSlinky.antd.libCheckboxCheckboxMod.AbstractCheckboxProps
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.antd.libRadioInterfaceMod.RadioChangeEvent
import typingsSlinky.antd.libRadioRadioButtonMod.RadioButton
import typingsSlinky.antd.libRadioRadioButtonMod.RadioButtonProps
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/radio/radioButton", JSImport.Namespace)
@js.native
object libRadioRadioButtonMod extends js.Object {
  @js.native
  trait RadioButton
    extends Component[RadioButtonProps, js.Any, js.Any] {
    def renderRadioButton(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
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

