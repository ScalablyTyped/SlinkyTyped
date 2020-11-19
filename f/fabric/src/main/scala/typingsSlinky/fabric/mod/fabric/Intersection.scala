package typingsSlinky.fabric.mod.fabric

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
@JSImport("fabric", "fabric.Intersection")
@js.native
object Intersection extends js.Object {
  
  /**
    * Checks if one line intersects another
    */
  def intersectLineLine(
    a1: typingsSlinky.fabric.fabricImplMod.Point,
    a2: typingsSlinky.fabric.fabricImplMod.Point,
    b1: typingsSlinky.fabric.fabricImplMod.Point,
    b2: typingsSlinky.fabric.fabricImplMod.Point
  ): typingsSlinky.fabric.fabricImplMod.Intersection = js.native
  
  /**
    * Checks if line intersects polygon
    */
  def intersectLinePolygon(
    a1: typingsSlinky.fabric.fabricImplMod.Point,
    a2: typingsSlinky.fabric.fabricImplMod.Point,
    points: js.Array[typingsSlinky.fabric.fabricImplMod.Point]
  ): typingsSlinky.fabric.fabricImplMod.Intersection = js.native
  
  /**
    * Checks if polygon intersects another polygon
    */
  def intersectPolygonPolygon(
    points1: js.Array[typingsSlinky.fabric.fabricImplMod.Point],
    points2: js.Array[typingsSlinky.fabric.fabricImplMod.Point]
  ): typingsSlinky.fabric.fabricImplMod.Intersection = js.native
  
  /**
    * Checks if polygon intersects rectangle
    */
  def intersectPolygonRectangle(points: js.Array[typingsSlinky.fabric.fabricImplMod.Point], r1: Double, r2: Double): typingsSlinky.fabric.fabricImplMod.Intersection = js.native
}
