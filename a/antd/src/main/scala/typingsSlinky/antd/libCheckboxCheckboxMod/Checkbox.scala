package typingsSlinky.antd.libCheckboxCheckboxMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.libCheckboxGroupMod.CheckboxGroupContext
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Checkbox
  extends Component[CheckboxProps, js.Object, js.Any] {
  var rcCheckbox: js.Any = js.native
  def blur(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCheckbox(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCheckbox(hasValue: CheckboxProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCheckbox(): Unit = js.native
  def focus(): Unit = js.native
  def renderCheckbox(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
  def saveCheckbox(node: js.Any): Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MCheckbox(nextProps: CheckboxProps, nextState: js.Object, nextContext: CheckboxGroupContext): Boolean = js.native
}

