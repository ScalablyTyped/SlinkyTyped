package typingsSlinky.imageQ

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.ImageData
import typingsSlinky.imageQ.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-q/dist/utils/pointContainer", JSImport.Namespace)
@js.native
object pointContainerMod extends js.Object {
  @js.native
  class PointContainer () extends js.Object {
    var _height: js.Any = js.native
    val _pointArray: js.Any = js.native
    var _width: js.Any = js.native
    def getHeight(): Double = js.native
    def getPointArray(): js.Array[Point] = js.native
    def getWidth(): Double = js.native
    def setHeight(height: Double): Unit = js.native
    def setWidth(width: Double): Unit = js.native
    def toUint32Array(): js.typedarray.Uint32Array = js.native
    def toUint8Array(): js.typedarray.Uint8Array = js.native
  }
  
  /* static members */
  @js.native
  object PointContainer extends js.Object {
    def fromArray(byteArray: js.Array[Double], width: Double, height: Double): PointContainer = js.native
    def fromCanvasPixelArray(data: js.Any, width: Double, height: Double): PointContainer = js.native
    def fromHTMLCanvasElement(canvas: HTMLCanvasElement): PointContainer = js.native
    def fromHTMLImageElement(img: HTMLImageElement): PointContainer = js.native
    def fromImageData(imageData: ImageData): PointContainer = js.native
    def fromNodeCanvas(canvas: js.Any): PointContainer = js.native
    def fromUint32Array(uint32array: js.typedarray.Uint32Array, width: Double, height: Double): PointContainer = js.native
    def fromUint8Array(uint8array: js.typedarray.Uint8Array, width: Double, height: Double): PointContainer = js.native
  }
  
}

