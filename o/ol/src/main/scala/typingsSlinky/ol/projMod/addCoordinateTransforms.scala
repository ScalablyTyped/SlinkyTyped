package typingsSlinky.ol.projMod

import typingsSlinky.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/proj", "addCoordinateTransforms")
@js.native
object addCoordinateTransforms extends js.Object {
  def apply(
    source: ProjectionLike,
    destination: ProjectionLike,
    forward: js.Function1[/* p0 */ Coordinate, Coordinate],
    inverse: js.Function1[/* p0 */ Coordinate, Coordinate]
  ): Unit = js.native
}

