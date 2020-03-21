package typingsSlinky.sat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sat", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Box ()
    extends typingsSlinky.sat.SAT.Box {
    def this(pos: typingsSlinky.sat.SAT.Vector) = this()
    def this(pos: typingsSlinky.sat.SAT.Vector, width: Double) = this()
    def this(pos: typingsSlinky.sat.SAT.Vector, width: Double, height: Double) = this()
  }
  
  @js.native
  class Circle ()
    extends typingsSlinky.sat.SAT.Circle {
    def this(pos: typingsSlinky.sat.SAT.Vector) = this()
    def this(pos: typingsSlinky.sat.SAT.Vector, r: Double) = this()
  }
  
  @js.native
  class Polygon ()
    extends typingsSlinky.sat.SAT.Polygon {
    def this(pos: typingsSlinky.sat.SAT.Vector) = this()
    def this(pos: typingsSlinky.sat.SAT.Vector, points: js.Array[typingsSlinky.sat.SAT.Vector]) = this()
  }
  
  @js.native
  class Response ()
    extends typingsSlinky.sat.SAT.Response
  
  @js.native
  /**
  		 * @class Vector has two properties
  		 * @param {number} x The x-coordinate of the Vector.
  		 * @param {number} y The y-coordinate of the Vector.
  		 */
  class Vector ()
    extends typingsSlinky.sat.SAT.Vector {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
  }
  
  def pointInCircle(p: typingsSlinky.sat.SAT.Vector, c: typingsSlinky.sat.SAT.Circle): Boolean = js.native
  def pointInPolygon(p: typingsSlinky.sat.SAT.Vector, poly: typingsSlinky.sat.SAT.Polygon): Boolean = js.native
  def testCircleCircle(a: typingsSlinky.sat.SAT.Circle, b: typingsSlinky.sat.SAT.Circle): Boolean = js.native
  def testCircleCircle(
    a: typingsSlinky.sat.SAT.Circle,
    b: typingsSlinky.sat.SAT.Circle,
    response: typingsSlinky.sat.SAT.Response
  ): Boolean = js.native
  def testCirclePolygon(circle: typingsSlinky.sat.SAT.Circle, polygon: typingsSlinky.sat.SAT.Polygon): Boolean = js.native
  def testCirclePolygon(
    circle: typingsSlinky.sat.SAT.Circle,
    polygon: typingsSlinky.sat.SAT.Polygon,
    response: typingsSlinky.sat.SAT.Response
  ): Boolean = js.native
  def testPolygonCircle(polygon: typingsSlinky.sat.SAT.Polygon, circle: typingsSlinky.sat.SAT.Circle): Boolean = js.native
  def testPolygonCircle(
    polygon: typingsSlinky.sat.SAT.Polygon,
    circle: typingsSlinky.sat.SAT.Circle,
    response: typingsSlinky.sat.SAT.Response
  ): Boolean = js.native
  def testPolygonPolygon(a: typingsSlinky.sat.SAT.Polygon, b: typingsSlinky.sat.SAT.Polygon): Boolean = js.native
  def testPolygonPolygon(
    a: typingsSlinky.sat.SAT.Polygon,
    b: typingsSlinky.sat.SAT.Polygon,
    response: typingsSlinky.sat.SAT.Response
  ): Boolean = js.native
}

