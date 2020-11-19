package typingsSlinky.reactRnd.mod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.reResizable.mod.Resizable
import typingsSlinky.reResizable.mod.ResizeDirection
import typingsSlinky.react.mod.Component
import typingsSlinky.reactRnd.anon.Height
import typingsSlinky.reactRnd.anon.HeightWidth
import typingsSlinky.reactRnd.anon.Left
import typingsSlinky.reactRnd.anon.Top
import typingsSlinky.reactRnd.anon.Width
import typingsSlinky.reactRnd.anon.X
import typingsSlinky.reactRnd.reactRndBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-rnd", "Rnd")
@js.native
class Rnd protected ()
  extends Component[Props, State, js.Any] {
  def this(props: Props) = this()
  
  @JSName("componentDidMount")
  def componentDidMount_MRnd(): Unit = js.native
  
  var draggable: TODO = js.native
  
  def getDraggablePosition(): X = js.native
  
  def getMaxSizesFromProps(): MaxSize = js.native
  
  def getOffsetHeight(boundary: HTMLElement): Double = js.native
  
  def getOffsetWidth(boundary: HTMLElement): Double = js.native
  
  def getParent(): js.Any = js.native
  
  def getParentSize(): Height = js.native
  
  def getSelfElement(): HTMLDivElement | Null = js.native
  
  var offsetFromParent: Left = js.native
  
  def onDrag(e: RndDragEvent, data: DraggableData): `false` | Unit = js.native
  
  def onDragStart(e: RndDragEvent, data: DraggableData): Unit = js.native
  
  def onDragStop(e: RndDragEvent, data: DraggableData): `false` | Unit = js.native
  
  def onResize(e: MouseEvent, direction: ResizeDirection, elementRef: HTMLDivElement, delta: Width): Unit = js.native
  def onResize(e: TouchEvent, direction: ResizeDirection, elementRef: HTMLDivElement, delta: Width): Unit = js.native
  
  def onResizeStart(e: SyntheticMouseEvent[HTMLDivElement], dir: ResizeDirection, elementRef: HTMLDivElement): Unit = js.native
  def onResizeStart(e: SyntheticTouchEvent[HTMLDivElement], dir: ResizeDirection, elementRef: HTMLDivElement): Unit = js.native
  
  def onResizeStop(e: MouseEvent, direction: ResizeDirection, elementRef: HTMLDivElement, delta: Width): Unit = js.native
  def onResizeStop(e: TouchEvent, direction: ResizeDirection, elementRef: HTMLDivElement, delta: Width): Unit = js.native
  
  def refDraggable(c: js.Any): Unit = js.native
  
  def refResizable(): Unit = js.native
  def refResizable(c: Resizable): Unit = js.native
  
  var resizable: Resizable = js.native
  
  var resizing: Boolean = js.native
  
  var resizingPosition: X = js.native
  
  def updateOffsetFromParent(): js.UndefOr[Top] = js.native
  
  def updatePosition(position: Position): Unit = js.native
  
  def updateSize(size: HeightWidth): Unit = js.native
}
/* static members */
@JSImport("react-rnd", "Rnd")
@js.native
object Rnd extends js.Object {
  
  var defaultProps: DefaultProps = js.native
}
