package typingsSlinky.ol.projMod

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.unitsMod.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/proj", "getPointResolution")
@js.native
object getPointResolution extends js.Object {
  def apply(projection: ProjectionLike, resolution: Double, point: Coordinate): Double = js.native
  def apply(projection: ProjectionLike, resolution: Double, point: Coordinate, opt_units: Units): Double = js.native
}

