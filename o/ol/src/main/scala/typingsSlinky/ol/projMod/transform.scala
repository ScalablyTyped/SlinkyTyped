package typingsSlinky.ol.projMod

import typingsSlinky.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/proj", "transform")
@js.native
object transform extends js.Object {
  def apply(coordinate: Coordinate, source: ProjectionLike, destination: ProjectionLike): Coordinate = js.native
}

