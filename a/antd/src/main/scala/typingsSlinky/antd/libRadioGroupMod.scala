package typingsSlinky.antd

import slinky.core.facade.ReactElement
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.antd.libRadioGroupMod.RadioGroup
import typingsSlinky.antd.libRadioInterfaceMod.RadioChangeEvent
import typingsSlinky.antd.libRadioInterfaceMod.RadioGroupProps
import typingsSlinky.antd.libRadioInterfaceMod.RadioGroupState
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/radio/group", JSImport.Namespace)
@js.native
object libRadioGroupMod extends js.Object {
  @js.native
  trait RadioGroup
    extends Component[RadioGroupProps, RadioGroupState, js.Any] {
    def getChildContext(): Anon_RadioGroupAnonDisabledEvName = js.native
    def onRadioChange(ev: RadioChangeEvent): Unit = js.native
    def renderGroup(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MRadioGroup(nextProps: RadioGroupProps, nextState: RadioGroupState): Boolean = js.native
  }
  
  @js.native
  class default protected () extends RadioGroup {
    def this(props: RadioGroupProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var childContextTypes: Anon_RadioGroup = js.native
    var defaultProps: Anon_ButtonStyleRadioGroupButtonStyle = js.native
    def getDerivedStateFromProps(nextProps: RadioGroupProps): Anon_ValueAny | Null = js.native
  }
  
}

