package typingsSlinky.openjscad.global

import org.scalajs.dom.raw.Blob
import typingsSlinky.openjscad.CSG.ICircleOptions
import typingsSlinky.openjscad.CSG.IRectangleOptions
import typingsSlinky.openjscad.CSG.Polygon
import typingsSlinky.openjscad.CSG.Vector2D
import typingsSlinky.std.Path2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CAG")
@js.native
class CAG ()
  extends typingsSlinky.openjscad.CAG
object CAG {
  
  /* static member */
  @JSGlobal("CAG.PathsToDxf")
  @js.native
  def PathsToDxf(paths: js.Array[Path2D]): Blob = js.native
  
  @JSGlobal("CAG.Side")
  @js.native
  class Side protected ()
    extends typingsSlinky.openjscad.CAG.Side {
    def this(vertex0: typingsSlinky.openjscad.CAG.Vertex, vertex1: typingsSlinky.openjscad.CAG.Vertex) = this()
  }
  object Side {
    
    /* static member */
    @JSGlobal("CAG.Side._fromFakePolygon")
    @js.native
    def fromFakePolygon(polygon: Polygon): typingsSlinky.openjscad.CAG.Side = js.native
  }
  
  @JSGlobal("CAG.Vertex")
  @js.native
  class Vertex protected ()
    extends typingsSlinky.openjscad.CAG.Vertex {
    def this(pos: Vector2D) = this()
  }
  
  /* static member */
  @JSGlobal("CAG.circle")
  @js.native
  def circle(options: ICircleOptions): typingsSlinky.openjscad.CAG = js.native
  
  /* static member */
  @JSGlobal("CAG.fromCompactBinary")
  @js.native
  def fromCompactBinary(bin: js.Any): typingsSlinky.openjscad.CAG = js.native
  
  /* static member */
  @JSGlobal("CAG.fromFakeCSG")
  @js.native
  def fromFakeCSG(csg: typingsSlinky.openjscad.CSG): typingsSlinky.openjscad.CAG = js.native
  
  /* static member */
  @JSGlobal("CAG.fromPoints")
  @js.native
  def fromPoints(points: js.Array[Vector2D]): typingsSlinky.openjscad.CAG = js.native
  
  /* static member */
  @JSGlobal("CAG.fromPointsNoCheck")
  @js.native
  def fromPointsNoCheck(points: js.Array[Vector2D]): typingsSlinky.openjscad.CAG = js.native
  
  /* static member */
  @JSGlobal("CAG.fromSides")
  @js.native
  def fromSides(sides: js.Array[typingsSlinky.openjscad.CAG.Side]): typingsSlinky.openjscad.CAG = js.native
  
  @JSGlobal("CAG.fuzzyCAGFactory")
  @js.native
  class fuzzyCAGFactory ()
    extends typingsSlinky.openjscad.CAG.fuzzyCAGFactory
  
  /* static member */
  @JSGlobal("CAG.linesIntersect")
  @js.native
  def linesIntersect(p0start: Vector2D, p0end: Vector2D, p1start: Vector2D, p1end: Vector2D): Boolean = js.native
  
  /* static member */
  @JSGlobal("CAG.rectangle")
  @js.native
  def rectangle(options: IRectangleOptions): typingsSlinky.openjscad.CAG = js.native
  
  /* static member */
  @JSGlobal("CAG.roundedRectangle")
  @js.native
  def roundedRectangle(options: js.Any): typingsSlinky.openjscad.CAG = js.native
}
