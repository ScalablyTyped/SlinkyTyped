package typingsSlinky.antd.libAutoDashCompleteMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoComplete
  extends Component[AutoCompleteProps, js.Object, js.Any] {
  var select: js.Any = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def getInputElement(): ReactElement = js.native
  def renderAutoComplete(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
  def saveSelect(node: js.Any): Unit = js.native
}

