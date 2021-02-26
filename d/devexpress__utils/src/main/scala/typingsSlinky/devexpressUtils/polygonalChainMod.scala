package typingsSlinky.devexpressUtils

import typingsSlinky.devexpressUtils.interfacesMod.IPoint
import typingsSlinky.devexpressUtils.minMaxMod.ExtendedMinMax
import typingsSlinky.devexpressUtils.pointMod.Point
import typingsSlinky.devexpressUtils.rectangleMod.Rectangle
import typingsSlinky.devexpressUtils.segmentMod.Segment
import typingsSlinky.devexpressUtils.vectorMod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polygonalChainMod {
  
  @JSImport("@devexpress/utils/lib/geometry/polygonal-chain", "PolygonalChain")
  @js.native
  class PolygonalChain[T /* <: Point */] protected () extends StObject {
    def this(points: js.Array[T]) = this()
    
    val bounds: Rectangle = js.native
    
    def changeCoordinateCenterTo(p: IPoint): this.type = js.native
    
    def getSegment(edgeIndex: Double): Segment[Point] = js.native
    
    var points: js.Array[T] = js.native
    
    def projection(axis: Vector): ExtendedMinMax[T] = js.native
    
    def rotateAround(point: IPoint, angle: Double): this.type = js.native
    def rotateAround(point: IPoint, angle: Double, rightSC: js.UndefOr[scala.Nothing], byClockwise: Boolean): this.type = js.native
    def rotateAround(point: IPoint, angle: Double, rightSC: Boolean): this.type = js.native
    def rotateAround(point: IPoint, angle: Double, rightSC: Boolean, byClockwise: Boolean): this.type = js.native
  }
}
