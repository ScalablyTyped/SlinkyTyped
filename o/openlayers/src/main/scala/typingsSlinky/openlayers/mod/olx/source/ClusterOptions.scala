package typingsSlinky.openlayers.mod.olx.source

import typingsSlinky.openlayers.mod.AttributionLike
import typingsSlinky.openlayers.mod.Extent_
import typingsSlinky.openlayers.mod.ProjectionLike
import typingsSlinky.openlayers.mod.format.Feature
import typingsSlinky.openlayers.mod.geom.Point
import typingsSlinky.openlayers.mod.source.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var extent: js.UndefOr[Extent_] = js.undefined
  var format: js.UndefOr[Feature] = js.undefined
  var geometryFunction: js.UndefOr[js.Function1[/* feature */ typingsSlinky.openlayers.mod.Feature, Point]] = js.undefined
  var logo: js.UndefOr[String] = js.undefined
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var source: Vector
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object ClusterOptions {
  @scala.inline
  def apply(
    source: Vector,
    attributions: AttributionLike = null,
    distance: Int | Double = null,
    extent: Extent_ = null,
    format: Feature = null,
    geometryFunction: /* feature */ typingsSlinky.openlayers.mod.Feature => Point = null,
    logo: String = null,
    projection: ProjectionLike = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): ClusterOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (geometryFunction != null) __obj.updateDynamic("geometryFunction")(js.Any.fromFunction1(geometryFunction))
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOptions]
  }
}

