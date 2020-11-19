package typingsSlinky.reResizable.mod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.reResizable.anon.Height
import typingsSlinky.reResizable.anon.HeightWidth
import typingsSlinky.reResizable.anon.MaxHeight
import typingsSlinky.reResizable.anon.NewHeight
import typingsSlinky.reResizable.anon.Width
import typingsSlinky.reResizable.mod.global.Window
import typingsSlinky.reResizable.reResizableStrings.column
import typingsSlinky.reResizable.reResizableStrings.height
import typingsSlinky.reResizable.reResizableStrings.row
import typingsSlinky.reResizable.reResizableStrings.width
import typingsSlinky.reResizable.resizerMod.Direction
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("re-resizable", "Resizable")
@js.native
class Resizable protected ()
  extends Component[ResizableProps, State, js.Any] {
  def this(props: ResizableProps) = this()
  
  def base: js.UndefOr[HTMLElement] = js.native
  
  def bindEvents(): Unit = js.native
  
  def calculateNewMaxFromBoundary(): MaxHeight = js.native
  def calculateNewMaxFromBoundary(maxWidth: js.UndefOr[scala.Nothing], maxHeight: Double): MaxHeight = js.native
  def calculateNewMaxFromBoundary(maxWidth: Double): MaxHeight = js.native
  def calculateNewMaxFromBoundary(maxWidth: Double, maxHeight: Double): MaxHeight = js.native
  
  def calculateNewSizeFromAspectRatio(newWidth: Double, newHeight: Double, max: HeightWidth, min: HeightWidth): NewHeight = js.native
  
  def calculateNewSizeFromDirection(clientX: Double, clientY: Double): NewHeight = js.native
  
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
  
  var flexDir: js.UndefOr[row | column] = js.native
  
  def getParentSize(): Width = js.native
  
  def onMouseMove(event: MouseEvent): Unit = js.native
  def onMouseMove(event: TouchEvent): Unit = js.native
  
  def onMouseUp(event: MouseEvent): Unit = js.native
  def onMouseUp(event: TouchEvent): Unit = js.native
  
  def onResizeStart(event: SyntheticMouseEvent[HTMLDivElement], direction: Direction): Unit = js.native
  def onResizeStart(event: SyntheticTouchEvent[HTMLDivElement], direction: Direction): Unit = js.native
  
  var parentLeft: Double = js.native
  
  def parentNode: HTMLElement | Null = js.native
  
  var parentTop: Double = js.native
  
  def propsSize: Size = js.native
  
  var ratio: Double = js.native
  
  def ref(): Unit = js.native
  def ref(c: HTMLDivElement): Unit = js.native
  
  def renderResizer(): ReactElement | Null = js.native
  
  var resizable: HTMLDivElement | Null = js.native
  
  var resizableLeft: Double = js.native
  
  var resizableTop: Double = js.native
  
  def setBoundingClientRect(): Unit = js.native
  
  def size: NumberSize = js.native
  
  def sizeStyle: Height = js.native
  
  var targetLeft: Double = js.native
  
  var targetTop: Double = js.native
  
  def unbindEvents(): Unit = js.native
  
  def updateSize(size: Size): Unit = js.native
  
  def window: Window | Null = js.native
}
/* static members */
@JSImport("re-resizable", "Resizable")
@js.native
object Resizable extends js.Object {
  
  var defaultProps: typingsSlinky.reResizable.anon.Enable = js.native
}
