package typingsSlinky.antd.passwordMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Password
  extends Component[PasswordProps, PasswordState, js.Any] {
  var input: HTMLInputElement = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def getIcon(prefixCls: String): ReactElement = js.native
  def onVisibleChange(): Unit = js.native
  def renderPassword(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
  def saveInput(instance: typingsSlinky.antd.inputInputMod.default): Unit = js.native
  def select(): Unit = js.native
}

