package typingsSlinky.antd.anchorAnchorMod

import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.antd.anon.ActiveLink
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Anchor extends Component[AnchorProps, AnchorState, ConfigConsumerProps] {
  
  var animating: js.Any = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MAnchor(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAnchor(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAnchor(): Unit = js.native
  
  var content: ConfigConsumerProps = js.native
  
  def getContainer(): js.Any = js.native
  
  def getCurrentAnchor(): String = js.native
  def getCurrentAnchor(offsetTop: js.UndefOr[scala.Nothing], bounds: Double): String = js.native
  def getCurrentAnchor(offsetTop: Double): String = js.native
  def getCurrentAnchor(offsetTop: Double, bounds: Double): String = js.native
  
  def handleScroll(): Unit = js.native
  
  def handleScrollTo(link: String): Unit = js.native
  
  var inkNode: js.Any = js.native
  
  var links: js.Any = js.native
  
  var prefixCls: js.Any = js.native
  
  def registerLink(link: String): Unit = js.native
  
  def saveInkNode(node: HTMLSpanElement): Unit = js.native
  
  var scrollContainer: js.Any = js.native
  
  var scrollEvent: js.Any = js.native
  
  def setCurrentActiveLink(link: String): Unit = js.native
  
  @JSName("state")
  var state_Anchor: ActiveLink = js.native
  
  def unregisterLink(link: String): Unit = js.native
  
  def updateInk(): Unit = js.native
}
