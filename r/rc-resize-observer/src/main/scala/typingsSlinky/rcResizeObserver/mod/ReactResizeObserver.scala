package typingsSlinky.rcResizeObserver.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.rcResizeObserver.anon.Width
import typingsSlinky.react.mod.Component
import typingsSlinky.resizeObserverPolyfill.mod.ResizeObserver
import typingsSlinky.resizeObserverPolyfill.mod.global.ResizeObserverCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactResizeObserver
  extends Component[ResizeObserverProps, ResizeObserverState, js.Any] {
  
  var childNode: RefNode = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MReactResizeObserver(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MReactResizeObserver(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MReactResizeObserver(): Unit = js.native
  
  var currentElement: Element | Null = js.native
  
  def destroyObserver(): Unit = js.native
  
  def onComponentUpdated(): Unit = js.native
  
  var onResize: ResizeObserverCallback = js.native
  
  var resizeObserver: ResizeObserver | Null = js.native
  
  def setChildNode(node: RefNode): Unit = js.native
  
  @JSName("state")
  var state_ReactResizeObserver: Width = js.native
}
