package typingsSlinky.antd.libTabsMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tabs
  extends Component[TabsProps, js.Any, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MTabs(): Unit = js.native
  def createNewTab(targetKey: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  def handleChange(activeKey: String): Unit = js.native
  def removeTab(targetKey: String, e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  def renderTabs(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
}

