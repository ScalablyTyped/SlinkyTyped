package typingsSlinky.imageQ

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("image-q/dist/utils", "HueStatistics")
  @js.native
  class HueStatistics protected ()
    extends typingsSlinky.imageQ.hueStatisticsMod.HueStatistics {
    def this(numGroups: Double, minCols: Double) = this()
  }
  
  @JSImport("image-q/dist/utils", "Palette")
  @js.native
  class Palette ()
    extends typingsSlinky.imageQ.utilsPaletteMod.Palette
  
  @JSImport("image-q/dist/utils", "Point")
  @js.native
  class Point ()
    extends typingsSlinky.imageQ.pointMod.Point
  /* static members */
  object Point {
    
    @JSImport("image-q/dist/utils", "Point.createByQuadruplet")
    @js.native
    def createByQuadruplet(quadruplet: js.Array[Double]): typingsSlinky.imageQ.pointMod.Point = js.native
    
    @JSImport("image-q/dist/utils", "Point.createByRGBA")
    @js.native
    def createByRGBA(red: Double, green: Double, blue: Double, alpha: Double): typingsSlinky.imageQ.pointMod.Point = js.native
    
    @JSImport("image-q/dist/utils", "Point.createByUint32")
    @js.native
    def createByUint32(uint32: Double): typingsSlinky.imageQ.pointMod.Point = js.native
  }
  
  @JSImport("image-q/dist/utils", "PointContainer")
  @js.native
  class PointContainer ()
    extends typingsSlinky.imageQ.pointContainerMod.PointContainer
  /* static members */
  object PointContainer {
    
    @JSImport("image-q/dist/utils", "PointContainer.fromArray")
    @js.native
    def fromArray(byteArray: js.Array[Double], width: Double, height: Double): typingsSlinky.imageQ.pointContainerMod.PointContainer = js.native
    
    @JSImport("image-q/dist/utils", "PointContainer.fromCanvasPixelArray")
    @js.native
    def fromCanvasPixelArray(data: js.Any, width: Double, height: Double): typingsSlinky.imageQ.pointContainerMod.PointContainer = js.native
    
    @JSImport("image-q/dist/utils", "PointContainer.fromHTMLCanvasElement")
    @js.native
    def fromHTMLCanvasElement(canvas: HTMLCanvasElement): typingsSlinky.imageQ.pointContainerMod.PointContainer = js.native
    
    @JSImport("image-q/dist/utils", "PointContainer.fromHTMLImageElement")
    @js.native
    def fromHTMLImageElement(img: HTMLImageElement): typingsSlinky.imageQ.pointContainerMod.PointContainer = js.native
    
    @JSImport("image-q/dist/utils", "PointContainer.fromImageData")
    @js.native
    def fromImageData(imageData: ImageData): typingsSlinky.imageQ.pointContainerMod.PointContainer = js.native
    
    @JSImport("image-q/dist/utils", "PointContainer.fromNodeCanvas")
    @js.native
    def fromNodeCanvas(canvas: js.Any): typingsSlinky.imageQ.pointContainerMod.PointContainer = js.native
    
    @JSImport("image-q/dist/utils", "PointContainer.fromUint32Array")
    @js.native
    def fromUint32Array(uint32array: js.typedarray.Uint32Array, width: Double, height: Double): typingsSlinky.imageQ.pointContainerMod.PointContainer = js.native
    
    @JSImport("image-q/dist/utils", "PointContainer.fromUint8Array")
    @js.native
    def fromUint8Array(uint8array: js.typedarray.Uint8Array, width: Double, height: Double): typingsSlinky.imageQ.pointContainerMod.PointContainer = js.native
  }
  
  object arithmetic {
    
    @JSImport("image-q/dist/utils", "arithmetic.degrees2radians")
    @js.native
    def degrees2radians(n: Double): Double = js.native
    
    @JSImport("image-q/dist/utils", "arithmetic.inRange0to255")
    @js.native
    def inRange0to255(n: Double): Double = js.native
    
    @JSImport("image-q/dist/utils", "arithmetic.inRange0to255Rounded")
    @js.native
    def inRange0to255Rounded(n: Double): Double = js.native
    
    @JSImport("image-q/dist/utils", "arithmetic.intInRange")
    @js.native
    def intInRange(value: Double, low: Double, high: Double): Double = js.native
    
    @JSImport("image-q/dist/utils", "arithmetic.max3")
    @js.native
    def max3(a: Double, b: Double, c: Double): Double = js.native
    
    @JSImport("image-q/dist/utils", "arithmetic.min3")
    @js.native
    def min3(a: Double, b: Double, c: Double): Double = js.native
    
    @JSImport("image-q/dist/utils", "arithmetic.stableSort")
    @js.native
    def stableSort[T](arrayToSort: js.Array[T], callback: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = js.native
  }
}
