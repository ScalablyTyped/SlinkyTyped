package typingsSlinky.ol.projMod

import typingsSlinky.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/proj", "transformExtent")
@js.native
object transformExtent extends js.Object {
  def apply(extent: Extent, source: ProjectionLike, destination: ProjectionLike): Extent = js.native
  def apply(extent: Extent, source: ProjectionLike, destination: ProjectionLike, opt_stops: Double): Extent = js.native
}

