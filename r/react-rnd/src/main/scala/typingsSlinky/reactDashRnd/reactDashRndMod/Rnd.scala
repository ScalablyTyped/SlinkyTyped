package typingsSlinky.reactDashRnd.reactDashRndMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reDashResizable.reDashResizableMod.Resizable
import typingsSlinky.reDashResizable.reDashResizableMod.ResizeDirection
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.NativeMouseEvent
import typingsSlinky.reactDashRnd.Anon_Height
import typingsSlinky.reactDashRnd.Anon_HeightWidth
import typingsSlinky.reactDashRnd.Anon_HeightWidthNumber
import typingsSlinky.reactDashRnd.Anon_Left
import typingsSlinky.reactDashRnd.Anon_X
import typingsSlinky.reactDashRnd.reactDashRndNumbers.`false`
import typingsSlinky.std.MouseEvent
import typingsSlinky.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-rnd", "Rnd")
@js.native
class Rnd protected ()
  extends Component[Props, State, js.Any] {
  def this(props: Props) = this()
  var draggable: $TODO = js.native
  var resizable: Resizable = js.native
  var resizing: Boolean = js.native
  var resizingPosition: Anon_X = js.native
  @JSName("componentDidMount")
  def componentDidMount_MRnd(): Unit = js.native
  def getDraggablePosition(): Anon_X = js.native
  def getMaxSizesFromProps(): MaxSize = js.native
  def getOffsetFromParent(): Anon_Left = js.native
  def getOffsetHeight(boundary: HTMLElement): Double = js.native
  def getOffsetWidth(boundary: HTMLElement): Double = js.native
  def getParent(): js.Any = js.native
  def getParentSize(): Anon_Height = js.native
  def getSelfElement(): HTMLDivElement | Null = js.native
  def onDrag(e: RndDragEvent, data: DraggableData): Unit = js.native
  def onDragStart(e: RndDragEvent, data: DraggableData): Unit = js.native
  def onDragStop(e: RndDragEvent, data: DraggableData): `false` | Unit = js.native
  def onResize(e: MouseEvent, direction: ResizeDirection, elementRef: HTMLDivElement, delta: Anon_HeightWidth): Unit = js.native
  def onResize(e: TouchEvent, direction: ResizeDirection, elementRef: HTMLDivElement, delta: Anon_HeightWidth): Unit = js.native
  def onResizeStart(
    e: typingsSlinky.react.reactMod.MouseEvent[typingsSlinky.std.HTMLDivElement, NativeMouseEvent],
    dir: ResizeDirection,
    elementRef: HTMLDivElement
  ): Unit = js.native
  def onResizeStart(
    e: typingsSlinky.react.reactMod.TouchEvent[typingsSlinky.std.HTMLDivElement],
    dir: ResizeDirection,
    elementRef: HTMLDivElement
  ): Unit = js.native
  def onResizeStop(e: MouseEvent, direction: ResizeDirection, elementRef: HTMLDivElement, delta: Anon_HeightWidth): Unit = js.native
  def onResizeStop(e: TouchEvent, direction: ResizeDirection, elementRef: HTMLDivElement, delta: Anon_HeightWidth): Unit = js.native
  def refDraggable(c: js.Any): Unit = js.native
  def refResizable(): Unit = js.native
  def refResizable(c: Resizable): Unit = js.native
  def updatePosition(position: Position): Unit = js.native
  def updateSize(size: Anon_HeightWidthNumber): Unit = js.native
}

/* static members */
@JSImport("react-rnd", "Rnd")
@js.native
object Rnd extends js.Object {
  var defaultProps: DefaultProps = js.native
}

