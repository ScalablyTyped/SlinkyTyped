package typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.officeUiFabricReact.libStickyMod.Sticky
import typingsSlinky.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePane
import typingsSlinky.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePaneProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/ScrollablePane/ScrollablePane.base", "ScrollablePaneBase")
@js.native
class ScrollablePaneBase protected ()
  extends Component[IScrollablePaneProps, IScrollablePaneState, js.Any]
     with IScrollablePane {
  def this(props: IScrollablePaneProps) = this()
  
  var _addToStickyContainer: js.Any = js.native
  
  var _async: js.Any = js.native
  
  var _checkStickyStatus: js.Any = js.native
  
  var _contentContainer: js.Any = js.native
  
  var _events: js.Any = js.native
  
  var _getScrollablePaneContext: js.Any = js.native
  
  var _getScrollbarHeight: js.Any = js.native
  
  var _getScrollbarWidth: js.Any = js.native
  
  var _getStickyContainerStyle: js.Any = js.native
  
  var _mutationObserver: js.Any = js.native
  
  var _notifyThrottled: js.Any = js.native
  
  var _onScroll: js.Any = js.native
  
  var _onWindowResize: js.Any = js.native
  
  var _removeStickyFromContainers: js.Any = js.native
  
  var _root: js.Any = js.native
  
  var _stickies: js.Any = js.native
  
  var _stickyAboveRef: js.Any = js.native
  
  var _stickyBelowRef: js.Any = js.native
  
  var _subscribers: js.Any = js.native
  
  def addSticky(sticky: Sticky): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MScrollablePaneBase(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MScrollablePaneBase(prevProps: IScrollablePaneProps, prevState: IScrollablePaneState): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MScrollablePaneBase(): Unit = js.native
  
  val contentContainer: HTMLDivElement | Null = js.native
  
  def notifySubscribers(): Unit = js.native
  
  def removeSticky(sticky: Sticky): Unit = js.native
  
  val root: HTMLDivElement | Null = js.native
  
  def setStickiesDistanceFromTop(): Unit = js.native
  
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MScrollablePaneBase(nextProps: IScrollablePaneProps, nextState: IScrollablePaneState): Boolean = js.native
  
  def sortSticky(sticky: Sticky): Unit = js.native
  def sortSticky(sticky: Sticky, sortAgain: Boolean): Unit = js.native
  
  val stickyAbove: HTMLDivElement | Null = js.native
  
  val stickyBelow: HTMLDivElement | Null = js.native
  
  def subscribe(handler: js.Function): Unit = js.native
  
  def syncScrollSticky(sticky: Sticky): Unit = js.native
  
  def unsubscribe(handler: js.Function): Unit = js.native
  
  def updateStickyRefHeights(): Unit = js.native
}
