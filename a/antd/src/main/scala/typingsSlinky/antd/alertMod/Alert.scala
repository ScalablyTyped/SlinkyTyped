package typingsSlinky.antd.alertMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.AnonClosed
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alert
  extends Component[AlertProps, AlertState, js.Any] {
  @JSName("state")
  var state_Alert: AnonClosed = js.native
  def animationEnd(): Unit = js.native
  def handleClose(e: SyntheticMouseEvent[HTMLButtonElement]): Unit = js.native
  def renderAlert(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement | Null = js.native
}

