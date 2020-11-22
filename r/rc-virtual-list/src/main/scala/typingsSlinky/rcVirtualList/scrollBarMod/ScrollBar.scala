package typingsSlinky.rcVirtualList.scrollBarMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.node.NodeJS.Timeout
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollBar
  extends Component[ScrollBarProps, ScrollBarState, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MScrollBar(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MScrollBar(prevProps: ScrollBarProps): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MScrollBar(): Unit = js.native
  
  def delayHidden(): Unit = js.native
  
  def getEnableHeightRange(): Double = js.native
  
  def getEnableScrollRange(): Double = js.native
  
  def getSpinHeight(): Double = js.native
  
  def getTop(): Double = js.native
  
  def getVisible(): Boolean = js.native
  
  var moveRaf: Double = js.native
  
  var onContainerMouseDown: MouseEventHandler[Element] = js.native
  
  def onMouseDown(e: SyntheticMouseEvent[Element]): Unit = js.native
  def onMouseDown(e: TouchEvent): Unit = js.native
  
  def onMouseMove(e: MouseEvent): Unit = js.native
  def onMouseMove(e: TouchEvent): Unit = js.native
  
  def onMouseUp(): Unit = js.native
  
  def onScrollbarTouchStart(e: TouchEvent): Unit = js.native
  
  def patchEvents(): Unit = js.native
  
  def removeEvents(): Unit = js.native
  
  var scrollbarRef: ReactRef[HTMLDivElement] = js.native
  
  var thumbRef: ReactRef[HTMLDivElement] = js.native
  
  var visibleTimeout: Timeout = js.native
}
