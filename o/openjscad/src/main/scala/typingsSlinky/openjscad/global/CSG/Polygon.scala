package typingsSlinky.openjscad.global.CSG

import typingsSlinky.openjscad.CSG.Polygon.Shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Polygon")
@js.native
class Polygon protected ()
  extends typingsSlinky.openjscad.CSG.Polygon {
  def this(vertices: js.Array[typingsSlinky.openjscad.CSG.Vertex]) = this()
  def this(vertices: typingsSlinky.openjscad.CSG.Vector3D) = this()
  def this(vertices: js.Array[typingsSlinky.openjscad.CSG.Vertex], shared: Shared) = this()
  def this(vertices: typingsSlinky.openjscad.CSG.Vector3D, shared: Shared) = this()
  def this(
    vertices: js.Array[typingsSlinky.openjscad.CSG.Vertex],
    shared: js.UndefOr[scala.Nothing],
    plane: typingsSlinky.openjscad.CSG.Plane
  ) = this()
  def this(
    vertices: js.Array[typingsSlinky.openjscad.CSG.Vertex],
    shared: Shared,
    plane: typingsSlinky.openjscad.CSG.Plane
  ) = this()
  def this(
    vertices: typingsSlinky.openjscad.CSG.Vector3D,
    shared: js.UndefOr[scala.Nothing],
    plane: typingsSlinky.openjscad.CSG.Plane
  ) = this()
  def this(
    vertices: typingsSlinky.openjscad.CSG.Vector3D,
    shared: Shared,
    plane: typingsSlinky.openjscad.CSG.Plane
  ) = this()
}

/* static members */
@JSGlobal("CSG.Polygon")
@js.native
object Polygon extends js.Object {
  @js.native
  class Shared protected ()
    extends typingsSlinky.openjscad.CSG.Polygon.Shared {
    def this(color: js.Any) = this()
  }
  
  var defaultShared: typingsSlinky.openjscad.CSG.Polygon.Shared = js.native
  def createFromPoints(points: js.Array[js.Array[Double]]): typingsSlinky.openjscad.CSG.Polygon = js.native
  def createFromPoints(
    points: js.Array[js.Array[Double]],
    shared: js.UndefOr[scala.Nothing],
    plane: typingsSlinky.openjscad.CSG.Plane
  ): typingsSlinky.openjscad.CSG.Polygon = js.native
  def createFromPoints(points: js.Array[js.Array[Double]], shared: typingsSlinky.openjscad.CSG.Polygon.Shared): typingsSlinky.openjscad.CSG.Polygon = js.native
  def createFromPoints(
    points: js.Array[js.Array[Double]],
    shared: typingsSlinky.openjscad.CSG.Polygon.Shared,
    plane: typingsSlinky.openjscad.CSG.Plane
  ): typingsSlinky.openjscad.CSG.Polygon = js.native
  def fromObject(obj: js.Any): typingsSlinky.openjscad.CSG.Polygon = js.native
  def isConvexPoint(prevpoint: js.Any, point: js.Any, nextpoint: js.Any, normal: js.Any): Boolean = js.native
  def isStrictlyConvexPoint(prevpoint: js.Any, point: js.Any, nextpoint: js.Any, normal: js.Any): Boolean = js.native
  def verticesConvex(vertices: js.Array[typingsSlinky.openjscad.CSG.Vertex], planenormal: js.Any): Boolean = js.native
  /* static members */
  @js.native
  object Shared extends js.Object {
    def fromColor(args: js.Any): typingsSlinky.openjscad.CSG.Polygon.Shared = js.native
    def fromObject(obj: js.Any): typingsSlinky.openjscad.CSG.Polygon.Shared = js.native
  }
  
}

