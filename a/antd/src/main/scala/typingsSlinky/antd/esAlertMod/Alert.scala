package typingsSlinky.antd.esAlertMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alert
  extends Component[AlertProps, AlertState, js.Any] {
  def animationEnd(): Unit = js.native
  def handleClose(e: SyntheticMouseEvent[HTMLButtonElement]): Unit = js.native
  def renderAlert(hasGetPrefixCls: ConfigConsumerProps): Element | Null = js.native
}

