package typingsSlinky.reDashResizable.reDashResizableMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reDashResizable.Anon_Enable
import typingsSlinky.reDashResizable.Anon_Height
import typingsSlinky.reDashResizable.Anon_HeightWidth
import typingsSlinky.reDashResizable.Anon_HeightWidthNumber
import typingsSlinky.reDashResizable.Anon_MaxHeight
import typingsSlinky.reDashResizable.Anon_NewHeight
import typingsSlinky.reDashResizable.libResizerMod.Direction
import typingsSlinky.reDashResizable.reDashResizableStrings.height
import typingsSlinky.reDashResizable.reDashResizableStrings.width
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.NativeMouseEvent
import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.std.MouseEvent
import typingsSlinky.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("re-resizable", "Resizable")
@js.native
class Resizable protected ()
  extends Component[ResizableProps, State, js.Any] {
  def this(props: ResizableProps) = this()
  val base: js.UndefOr[HTMLElement] = js.native
  var parentLeft: Double = js.native
  val parentNode: HTMLElement | Null = js.native
  var parentTop: Double = js.native
  val propsSize: Size = js.native
  var ratio: Double = js.native
  var resizable: HTMLDivElement | Null = js.native
  var resizableLeft: Double = js.native
  var resizableTop: Double = js.native
  val size: NumberSize = js.native
  val sizeStyle: Anon_Height = js.native
  var targetLeft: Double = js.native
  var targetTop: Double = js.native
  def bindEvents(): Unit = js.native
  def calculateNewMaxFromBoundary(): Anon_MaxHeight = js.native
  def calculateNewMaxFromBoundary(maxWidth: Double): Anon_MaxHeight = js.native
  def calculateNewMaxFromBoundary(maxWidth: Double, maxHeight: Double): Anon_MaxHeight = js.native
  def calculateNewSizeFromAspectRatio(newWidth: Double, newHeight: Double, max: Anon_HeightWidthNumber, min: Anon_HeightWidthNumber): Anon_NewHeight = js.native
  def calculateNewSizeFromDirection(clientX: Double, clientY: Double): Anon_NewHeight = js.native
  @JSName("componentDidMount")
  def componentDidMount_MResizable(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MResizable(): Unit = js.native
  @JSName("createSizeForCssProperty")
  def createSizeForCssProperty_height(newSize: String, kind: height): Double | String = js.native
  @JSName("createSizeForCssProperty")
  def createSizeForCssProperty_height(newSize: Double, kind: height): Double | String = js.native
  @JSName("createSizeForCssProperty")
  def createSizeForCssProperty_width(newSize: String, kind: width): Double | String = js.native
  @JSName("createSizeForCssProperty")
  def createSizeForCssProperty_width(newSize: Double, kind: width): Double | String = js.native
  def getParentSize(): Anon_HeightWidth = js.native
  def onMouseMove(event: MouseEvent): Unit = js.native
  def onMouseMove(event: TouchEvent): Unit = js.native
  def onMouseUp(event: MouseEvent): Unit = js.native
  def onMouseUp(event: TouchEvent): Unit = js.native
  def onResizeStart(
    event: typingsSlinky.react.reactMod.MouseEvent[typingsSlinky.std.HTMLDivElement, NativeMouseEvent],
    direction: Direction
  ): Unit = js.native
  def onResizeStart(
    event: typingsSlinky.react.reactMod.TouchEvent[typingsSlinky.std.HTMLDivElement],
    direction: Direction
  ): Unit = js.native
  def renderResizer(): Element | Null = js.native
  def setBoundingClientRect(): Unit = js.native
  def unbindEvents(): Unit = js.native
  def updateSize(size: Size): Unit = js.native
}

/* static members */
@JSImport("re-resizable", "Resizable")
@js.native
object Resizable extends js.Object {
  var defaultProps: Anon_Enable = js.native
}

