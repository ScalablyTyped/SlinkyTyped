package typingsSlinky.ol.projMod

import typingsSlinky.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/proj", "createTransformFromCoordinateTransform")
@js.native
object createTransformFromCoordinateTransform extends js.Object {
  def apply(coordTransform: js.Function1[/* p0 */ Coordinate, Coordinate]): TransformFunction = js.native
}

