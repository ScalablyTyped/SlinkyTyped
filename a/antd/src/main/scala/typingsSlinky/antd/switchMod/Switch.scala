package typingsSlinky.antd.switchMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Switch
  extends Component[SwitchProps, js.Object, js.Any] {
  var rcSwitch: js.Any = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def renderSwitch(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
  def saveSwitch(node: js.Any): Unit = js.native
}

