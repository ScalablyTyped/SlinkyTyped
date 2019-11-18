package typingsSlinky.antd.esSpinMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spin
  extends Component[SpinProps, SpinState, js.Any] {
  def cancelExistingSpin(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSpin(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSpin(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSpin(): Unit = js.native
  def debouncifyUpdateSpinning(): Unit = js.native
  def debouncifyUpdateSpinning(props: SpinProps): Unit = js.native
  def isNestedPattern(): Boolean = js.native
  def originalUpdateSpinning(): Unit = js.native
  def renderSpin(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
  def updateSpinning(): Unit = js.native
}

