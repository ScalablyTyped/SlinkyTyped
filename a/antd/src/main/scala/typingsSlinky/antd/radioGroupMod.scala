package typingsSlinky.antd

import slinky.core.facade.ReactElement
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.antd.radioInterfaceMod.RadioChangeEvent
import typingsSlinky.antd.radioInterfaceMod.RadioGroupProps
import typingsSlinky.antd.radioInterfaceMod.RadioGroupState
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/radio/group", JSImport.Namespace)
@js.native
object radioGroupMod extends js.Object {
  @js.native
  trait RadioGroup
    extends Component[RadioGroupProps, RadioGroupState, js.Any] {
    def onRadioChange(ev: RadioChangeEvent): Unit = js.native
    def renderGroup(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
  }
  
  @js.native
  class default protected () extends RadioGroup {
    def this(props: RadioGroupProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AnonButtonStyle = js.native
    def getDerivedStateFromProps(nextProps: RadioGroupProps, prevState: RadioGroupState): PartialRadioGroupState = js.native
  }
  
}

