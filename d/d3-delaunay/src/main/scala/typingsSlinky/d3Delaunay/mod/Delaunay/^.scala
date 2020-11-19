package typingsSlinky.d3Delaunay.mod.Delaunay

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-delaunay", "Delaunay")
@js.native
object ^ extends js.Object {
  
  /**
    * Returns the Delaunay triangulation for the given array or iterable of points where each point is an array in the form: [x, y].
    */
  def from(points: ArrayLike[Point]): typingsSlinky.d3Delaunay.mod.Delaunay[Point] = js.native
  def from(points: js.Iterable[Point]): typingsSlinky.d3Delaunay.mod.Delaunay[Point] = js.native
  /**
    * Returns the Delaunay triangulation for the given array or iterable of points.
    * Otherwise, the getX and getY functions are invoked for each point in order, and must return the respective x- and y-coordinate for each point.
    * If that is specified, the functions getX and getY are invoked with that as this.
    * (See Array.from for reference.)
    */
  def from[P](
    points: ArrayLike[P],
    getX: GetCoordinate[P, ArrayLike[P] | js.Iterable[P]],
    getY: GetCoordinate[P, ArrayLike[P] | js.Iterable[P]]
  ): typingsSlinky.d3Delaunay.mod.Delaunay[P] = js.native
  def from[P](
    points: ArrayLike[P],
    getX: GetCoordinate[P, ArrayLike[P] | js.Iterable[P]],
    getY: GetCoordinate[P, ArrayLike[P] | js.Iterable[P]],
    that: js.Any
  ): typingsSlinky.d3Delaunay.mod.Delaunay[P] = js.native
  def from[P](
    points: js.Iterable[P],
    getX: GetCoordinate[P, ArrayLike[P] | js.Iterable[P]],
    getY: GetCoordinate[P, ArrayLike[P] | js.Iterable[P]]
  ): typingsSlinky.d3Delaunay.mod.Delaunay[P] = js.native
  def from[P](
    points: js.Iterable[P],
    getX: GetCoordinate[P, ArrayLike[P] | js.Iterable[P]],
    getY: GetCoordinate[P, ArrayLike[P] | js.Iterable[P]],
    that: js.Any
  ): typingsSlinky.d3Delaunay.mod.Delaunay[P] = js.native
}
