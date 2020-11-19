package typingsSlinky.makerJs.global

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.bezierJs.BezierJs.ABC
import typingsSlinky.bezierJs.BezierJs.Point
import typingsSlinky.bezierJs.anon.Typeofutils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Bezier")
@js.native
class Bezier protected ()
  extends typingsSlinky.bezierJs.global.BezierJs.Bezier {
  def this(points: js.Array[Point]) = this()
}
@JSGlobal("Bezier")
@js.native
object Bezier
  extends Instantiable1[/* points */ js.Array[Point], typingsSlinky.bezierJs.global.BezierJs.Bezier] {
  
  def cubicFromPoints(S: Point, B: Point, E: Point): typingsSlinky.bezierJs.BezierJs.Bezier = js.native
  def cubicFromPoints(S: Point, B: Point, E: Point, t: js.UndefOr[scala.Nothing], d1: Double): typingsSlinky.bezierJs.BezierJs.Bezier = js.native
  def cubicFromPoints(S: Point, B: Point, E: Point, t: Double): typingsSlinky.bezierJs.BezierJs.Bezier = js.native
  def cubicFromPoints(S: Point, B: Point, E: Point, t: Double, d1: Double): typingsSlinky.bezierJs.BezierJs.Bezier = js.native
  
  def fromSVG(svgString: String): typingsSlinky.bezierJs.BezierJs.Bezier = js.native
  
  def getABC(n: Double, S: Point, B: Point, E: Point, t: Double): ABC = js.native
  
  def getUtils(): Typeofutils = js.native
  
  def quadraticFromPoints(p1: Point, p2: Point, p3: Point): typingsSlinky.bezierJs.BezierJs.Bezier = js.native
  def quadraticFromPoints(p1: Point, p2: Point, p3: Point, t: Double): typingsSlinky.bezierJs.BezierJs.Bezier = js.native
}
