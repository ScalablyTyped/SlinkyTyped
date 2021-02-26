package typingsSlinky.fabric.mod.fabric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Intersection")
@js.native
class Intersection ()
  extends typingsSlinky.fabric.fabricImplMod.Intersection {
  def this(status: String) = this()
}
/* static members */
object Intersection {
  
  /**
    * Checks if one line intersects another
    */
  @JSImport("fabric", "fabric.Intersection.intersectLineLine")
  @js.native
  def intersectLineLine(
    a1: typingsSlinky.fabric.fabricImplMod.Point,
    a2: typingsSlinky.fabric.fabricImplMod.Point,
    b1: typingsSlinky.fabric.fabricImplMod.Point,
    b2: typingsSlinky.fabric.fabricImplMod.Point
  ): typingsSlinky.fabric.fabricImplMod.Intersection = js.native
  
  /**
    * Checks if line intersects polygon
    */
  @JSImport("fabric", "fabric.Intersection.intersectLinePolygon")
  @js.native
  def intersectLinePolygon(
    a1: typingsSlinky.fabric.fabricImplMod.Point,
    a2: typingsSlinky.fabric.fabricImplMod.Point,
    points: js.Array[typingsSlinky.fabric.fabricImplMod.Point]
  ): typingsSlinky.fabric.fabricImplMod.Intersection = js.native
  
  /**
    * Checks if polygon intersects another polygon
    */
  @JSImport("fabric", "fabric.Intersection.intersectPolygonPolygon")
  @js.native
  def intersectPolygonPolygon(
    points1: js.Array[typingsSlinky.fabric.fabricImplMod.Point],
    points2: js.Array[typingsSlinky.fabric.fabricImplMod.Point]
  ): typingsSlinky.fabric.fabricImplMod.Intersection = js.native
  
  /**
    * Checks if polygon intersects rectangle
    */
  @JSImport("fabric", "fabric.Intersection.intersectPolygonRectangle")
  @js.native
  def intersectPolygonRectangle(points: js.Array[typingsSlinky.fabric.fabricImplMod.Point], r1: Double, r2: Double): typingsSlinky.fabric.fabricImplMod.Intersection = js.native
}
