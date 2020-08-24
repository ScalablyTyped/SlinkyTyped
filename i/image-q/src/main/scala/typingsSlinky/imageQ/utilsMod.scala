package typingsSlinky.imageQ

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-q/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  @js.native
  class HueStatistics protected ()
    extends typingsSlinky.imageQ.hueStatisticsMod.HueStatistics {
    def this(numGroups: Double, minCols: Double) = this()
  }
  
  @js.native
  class Palette ()
    extends typingsSlinky.imageQ.utilsPaletteMod.Palette
  
  @js.native
  class Point ()
    extends typingsSlinky.imageQ.pointMod.Point
  
  @js.native
  class PointContainer ()
    extends typingsSlinky.imageQ.pointContainerMod.PointContainer
  
  /* static members */
  @js.native
  object Point extends js.Object {
    def createByQuadruplet(quadruplet: js.Array[Double]): typingsSlinky.imageQ.pointMod.Point = js.native
    def createByRGBA(red: Double, green: Double, blue: Double, alpha: Double): typingsSlinky.imageQ.pointMod.Point = js.native
    def createByUint32(uint32: Double): typingsSlinky.imageQ.pointMod.Point = js.native
  }
  
  /* static members */
  @js.native
  object PointContainer extends js.Object {
    def fromArray(byteArray: js.Array[Double], width: Double, height: Double): typingsSlinky.imageQ.pointContainerMod.PointContainer = js.native
    def fromCanvasPixelArray(data: js.Any, width: Double, height: Double): typingsSlinky.imageQ.pointContainerMod.PointContainer = js.native
    def fromHTMLCanvasElement(canvas: HTMLCanvasElement): typingsSlinky.imageQ.pointContainerMod.PointContainer = js.native
    def fromHTMLImageElement(img: HTMLImageElement): typingsSlinky.imageQ.pointContainerMod.PointContainer = js.native
    def fromImageData(imageData: ImageData): typingsSlinky.imageQ.pointContainerMod.PointContainer = js.native
    def fromNodeCanvas(canvas: js.Any): typingsSlinky.imageQ.pointContainerMod.PointContainer = js.native
    def fromUint32Array(uint32array: js.typedarray.Uint32Array, width: Double, height: Double): typingsSlinky.imageQ.pointContainerMod.PointContainer = js.native
    def fromUint8Array(uint8array: js.typedarray.Uint8Array, width: Double, height: Double): typingsSlinky.imageQ.pointContainerMod.PointContainer = js.native
  }
  
  @js.native
  object arithmetic extends js.Object {
    def degrees2radians(n: Double): Double = js.native
    def inRange0to255(n: Double): Double = js.native
    def inRange0to255Rounded(n: Double): Double = js.native
    def intInRange(value: Double, low: Double, high: Double): Double = js.native
    def max3(a: Double, b: Double, c: Double): Double = js.native
    def min3(a: Double, b: Double, c: Double): Double = js.native
    def stableSort[T](arrayToSort: js.Array[T], callback: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = js.native
  }
  
}

