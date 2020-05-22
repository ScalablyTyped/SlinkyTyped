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
    /* CompleteClass */
    override var h: Double = js.native
    /* CompleteClass */
    override var pos: typingsSlinky.sat.SAT.Vector = js.native
    /* CompleteClass */
    override var w: Double = js.native
    /* CompleteClass */
    override def toPolygon(): typingsSlinky.sat.SAT.Polygon = js.native
  }
  
  @js.native
  class Circle ()
    extends typingsSlinky.sat.SAT.Circle {
    def this(pos: typingsSlinky.sat.SAT.Vector) = this()
    def this(pos: typingsSlinky.sat.SAT.Vector, r: Double) = this()
    /* CompleteClass */
    override var pos: typingsSlinky.sat.SAT.Vector = js.native
    /* CompleteClass */
    override var r: Double = js.native
  }
  
  @js.native
  class Polygon ()
    extends typingsSlinky.sat.SAT.Polygon {
    def this(pos: typingsSlinky.sat.SAT.Vector) = this()
    def this(pos: typingsSlinky.sat.SAT.Vector, points: js.Array[typingsSlinky.sat.SAT.Vector]) = this()
    /* CompleteClass */
    override var angle: Double = js.native
    /* CompleteClass */
    override var calcPoints: js.Array[typingsSlinky.sat.SAT.Vector] = js.native
    /* CompleteClass */
    override var edges: js.Array[typingsSlinky.sat.SAT.Vector] = js.native
    /* CompleteClass */
    override var normals: js.Array[typingsSlinky.sat.SAT.Vector] = js.native
    /* CompleteClass */
    override var offset: typingsSlinky.sat.SAT.Vector = js.native
    /* CompleteClass */
    override var points: js.Array[typingsSlinky.sat.SAT.Vector] = js.native
    /* CompleteClass */
    override var pos: typingsSlinky.sat.SAT.Vector = js.native
    /* CompleteClass */
    override def getAABB(): typingsSlinky.sat.SAT.Polygon = js.native
    /* CompleteClass */
    override def getCentroid(): typingsSlinky.sat.SAT.Vector = js.native
    /* CompleteClass */
    override def rotate(angle: Double): typingsSlinky.sat.SAT.Polygon = js.native
    /* CompleteClass */
    override def setAngle(angle: Double): typingsSlinky.sat.SAT.Polygon = js.native
    /* CompleteClass */
    override def setOffset(offset: typingsSlinky.sat.SAT.Vector): typingsSlinky.sat.SAT.Polygon = js.native
    /* CompleteClass */
    override def setPoints(points: js.Array[typingsSlinky.sat.SAT.Vector]): typingsSlinky.sat.SAT.Polygon = js.native
    /* CompleteClass */
    override def translate(x: Double, y: Double): typingsSlinky.sat.SAT.Polygon = js.native
  }
  
  @js.native
  class Response ()
    extends typingsSlinky.sat.SAT.Response {
    /* CompleteClass */
    override var a: js.Any = js.native
    /* CompleteClass */
    override var aInB: Boolean = js.native
    /* CompleteClass */
    override var b: js.Any = js.native
    /* CompleteClass */
    override var bInA: Boolean = js.native
    /* CompleteClass */
    override var overlap: Double = js.native
    /* CompleteClass */
    override var overlapN: typingsSlinky.sat.SAT.Vector = js.native
    /* CompleteClass */
    override var overlapV: typingsSlinky.sat.SAT.Vector = js.native
    /* CompleteClass */
    override def clear(): typingsSlinky.sat.SAT.Response = js.native
  }
  
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

