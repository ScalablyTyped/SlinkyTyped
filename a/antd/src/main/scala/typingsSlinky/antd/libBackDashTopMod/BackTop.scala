package typingsSlinky.antd.libBackDashTopMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackTop
  extends Component[BackTopProps, js.Any, js.Any] {
  var scrollEvent: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MBackTop(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MBackTop(): Unit = js.native
  def handleScroll(): Unit = js.native
  def renderBackTop(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
  def scrollToTop(e: SyntheticMouseEvent[HTMLDivElement]): Unit = js.native
}

