package typingsSlinky.antd.anchorLinkMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.anchorAnchorMod.AntAnchor
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnchorLink
  extends Component[AnchorLinkProps, js.Any, AntAnchor] {
  
  @JSName("componentDidMount")
  def componentDidMount_MAnchorLink(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAnchorLink(hasHref: AnchorLinkProps): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAnchorLink(): Unit = js.native
  
  @JSName("context")
  var context_AnchorLink: AntAnchor = js.native
  
  def handleClick(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  
  def renderAnchorLink(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
}
