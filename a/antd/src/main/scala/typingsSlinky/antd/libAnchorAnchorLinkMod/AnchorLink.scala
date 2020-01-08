package typingsSlinky.antd.libAnchorAnchorLinkMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.Anon_AntAnchor_1351107620
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorLink
  extends Component[AnchorLinkProps, js.Any, js.Any] {
  @JSName("context")
  var context_AnchorLink: Anon_AntAnchor_1351107620 = js.native
  @JSName("componentDidMount")
  def componentDidMount_MAnchorLink(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAnchorLink(hasHref: AnchorLinkProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAnchorLink(): Unit = js.native
  def handleClick(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  def renderAnchorLink(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
}

