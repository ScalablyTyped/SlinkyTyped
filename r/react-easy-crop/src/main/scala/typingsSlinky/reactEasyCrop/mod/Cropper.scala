package typingsSlinky.reactEasyCrop.mod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLStyleElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.WheelEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.reactEasyCrop.anon.CroppedAreaPercentages
import typingsSlinky.reactEasyCrop.anon.X
import typingsSlinky.reactEasyCrop.typesMod.MediaSize
import typingsSlinky.reactEasyCrop.typesMod.Point
import typingsSlinky.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cropper
  extends Component[CropperProps, State, js.Any] {
  
  def cleanEvents(): Unit = js.native
  
  def clearScrollEvent(): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MCropper(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCropper(prevProps: CropperProps): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCropper(): Unit = js.native
  
  def computeSizes(): Unit = js.native
  
  var containerRect: DOMRect | Null = js.native
  
  var containerRef: HTMLDivElement | Null = js.native
  
  var dragStartCrop: Point = js.native
  
  var dragStartPosition: Point = js.native
  
  def emitCropAreaChange(): Unit = js.native
  
  def emitCropData(): Unit = js.native
  
  def getAspect(): Double = js.native
  
  def getCropData(): CroppedAreaPercentages | Null = js.native
  
  def getPointOnContainer(hasXY: Point): X = js.native
  
  def getPointOnMedia(hasXY: Point): X = js.native
  
  var imageRef: HTMLImageElement | Null = js.native
  
  var lastPinchDistance: Double = js.native
  
  var lastPinchRotation: Double = js.native
  
  var mediaSize: MediaSize = js.native
  
  def onDrag(hasXY: Point): Unit = js.native
  
  def onDragStart(hasXY: Point): Unit = js.native
  
  def onDragStopped(): Unit = js.native
  
  def onMediaLoad(): Unit = js.native
  
  def onMouseDown(e: SyntheticMouseEvent[HTMLDivElement]): Unit = js.native
  
  def onMouseMove(e: MouseEvent): Unit = js.native
  
  def onPinchMove(e: TouchEvent): Unit = js.native
  
  def onPinchStart(e: SyntheticTouchEvent[HTMLDivElement]): Unit = js.native
  
  def onTouchMove(e: TouchEvent): Unit = js.native
  
  def onTouchStart(e: SyntheticTouchEvent[HTMLDivElement]): Unit = js.native
  
  def onWheel(e: WheelEvent): Unit = js.native
  
  def preventZoomSafari(e: Event): Unit = js.native
  
  var rafDragTimeout: Double | Null = js.native
  
  var rafPinchTimeout: Double | Null = js.native
  
  def recomputeCropPosition(): Unit = js.native
  
  def setInitialCrop(): Unit = js.native
  
  def setNewZoom(zoom: Double, point: Point): Unit = js.native
  
  var styleRef: HTMLStyleElement | Null = js.native
  
  var videoRef: HTMLVideoElement | Null = js.native
  
  var wheelTimer: Double | Null = js.native
}
