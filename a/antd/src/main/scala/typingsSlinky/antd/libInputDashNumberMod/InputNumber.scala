package typingsSlinky.antd.libInputDashNumberMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputNumber
  extends Component[InputNumberProps, js.Any, js.Any] {
  var inputNumberRef: js.Any = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def renderInputNumber(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
  def saveInputNumber(inputNumberRef: js.Any): Unit = js.native
}

