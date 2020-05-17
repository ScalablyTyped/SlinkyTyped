package typingsSlinky.ol.projMod

import typingsSlinky.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/proj", "toLonLat")
@js.native
object toLonLat extends js.Object {
  def apply(coordinate: Coordinate): Coordinate = js.native
  def apply(coordinate: Coordinate, opt_projection: ProjectionLike): Coordinate = js.native
}

