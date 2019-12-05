package typingsSlinky.rcDashResizeDashObserver.libMod

import org.scalajs.dom.raw.Element
import typingsSlinky.rcDashResizeDashObserver.Anon_Height
import typingsSlinky.react.reactMod.Component
import typingsSlinky.resizeDashObserverDashPolyfill.resizeDashObserverDashPolyfillMod.ResizeObserver
import typingsSlinky.resizeDashObserverDashPolyfill.resizeDashObserverDashPolyfillMod._Global_.ResizeObserverCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactResizeObserver
  extends Component[ResizeObserverProps, ResizeObserverState, js.Any] {
  var childNode: RefNode = js.native
  var currentElement: Element | Null = js.native
  var onResize: ResizeObserverCallback = js.native
  var resizeObserver: ResizeObserver | Null = js.native
  @JSName("state")
  var state_ReactResizeObserver: Anon_Height = js.native
  @JSName("componentDidMount")
  def componentDidMount_MReactResizeObserver(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MReactResizeObserver(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MReactResizeObserver(): Unit = js.native
  def destroyObserver(): Unit = js.native
  def onComponentUpdated(): Unit = js.native
  def setChildNode(node: RefNode): Unit = js.native
}

