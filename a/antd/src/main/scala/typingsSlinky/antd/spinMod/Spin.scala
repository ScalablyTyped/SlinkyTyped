package typingsSlinky.antd.spinMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  def renderSpin(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
  
  def updateSpinning(): Unit = js.native
}
