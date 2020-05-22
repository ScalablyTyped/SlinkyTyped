package typingsSlinky.antd.alertMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.anon.Closed
import typingsSlinky.antd.anon.Pickanychildrensizeciteda
import typingsSlinky.antd.anon.PrefixCls
import typingsSlinky.antd.antdStrings.error
import typingsSlinky.antd.antdStrings.info
import typingsSlinky.antd.antdStrings.success
import typingsSlinky.antd.antdStrings.warning
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ForwardRefExoticComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alert
  extends Component[AlertProps, AlertState, js.Any] {
  @JSName("state")
  var state_Alert: Closed = js.native
  def animationEnd(): Unit = js.native
  def getClosable(): js.UndefOr[Boolean] = js.native
  def getIconType(): ForwardRefExoticComponent[Pickanychildrensizeciteda] = js.native
  def getShowIcon(): js.UndefOr[Boolean] = js.native
  def getType(): error | success | warning | info = js.native
  def handleClose(e: SyntheticMouseEvent[HTMLButtonElement]): Unit = js.native
  def renderAlert(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement | Null = js.native
  def renderCloseIcon(hasPrefixCls: PrefixCls): ReactElement | Null = js.native
  def renderIconNode(hasPrefixCls: PrefixCls): js.UndefOr[js.Object | Null] = js.native
}

