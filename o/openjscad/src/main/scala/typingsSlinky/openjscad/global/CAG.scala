package typingsSlinky.openjscad.global

import org.scalajs.dom.raw.Blob
import typingsSlinky.openjscad.CSG.ICircleOptions
import typingsSlinky.openjscad.CSG.IRectangleOptions
import typingsSlinky.openjscad.CSG.Path2D
import typingsSlinky.openjscad.CSG.Polygon
import typingsSlinky.openjscad.CSG.Vector2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CAG")
@js.native
class CAG ()
  extends typingsSlinky.openjscad.CAG

/* static members */
@JSGlobal("CAG")
@js.native
object CAG extends js.Object {
  @js.native
  class Side protected ()
    extends typingsSlinky.openjscad.CAG.Side {
    def this(vertex0: typingsSlinky.openjscad.CAG.Vertex, vertex1: typingsSlinky.openjscad.CAG.Vertex) = this()
  }
  
  @js.native
  class Vertex protected ()
    extends typingsSlinky.openjscad.CAG.Vertex {
    def this(pos: Vector2D) = this()
  }
  
  @js.native
  class fuzzyCAGFactory ()
    extends typingsSlinky.openjscad.CAG.fuzzyCAGFactory
  
  def PathsToDxf(paths: js.Array[Path2D]): Blob = js.native
  def circle(options: ICircleOptions): typingsSlinky.openjscad.CAG = js.native
  def fromCompactBinary(bin: js.Any): typingsSlinky.openjscad.CAG = js.native
  def fromFakeCSG(csg: typingsSlinky.openjscad.CSG): typingsSlinky.openjscad.CAG = js.native
  def fromPoints(points: js.Array[Vector2D]): typingsSlinky.openjscad.CAG = js.native
  def fromPointsNoCheck(points: js.Array[Vector2D]): typingsSlinky.openjscad.CAG = js.native
  def fromSides(sides: js.Array[typingsSlinky.openjscad.CAG.Side]): typingsSlinky.openjscad.CAG = js.native
  def linesIntersect(p0start: Vector2D, p0end: Vector2D, p1start: Vector2D, p1end: Vector2D): Boolean = js.native
  def rectangle(options: IRectangleOptions): typingsSlinky.openjscad.CAG = js.native
  def roundedRectangle(options: js.Any): typingsSlinky.openjscad.CAG = js.native
  /* static members */
  @js.native
  object Side extends js.Object {
    def _fromFakePolygon(polygon: Polygon): typingsSlinky.openjscad.CAG.Side = js.native
  }
  
}

