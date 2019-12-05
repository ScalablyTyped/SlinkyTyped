package typingsSlinky.ol.sourceClusterMod

import typingsSlinky.ol.sourceSourceMod.AttributionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var geometryFunction: js.UndefOr[
    js.Function1[
      /* p0 */ typingsSlinky.ol.featureMod.default, 
      typingsSlinky.ol.geomPointMod.default
    ]
  ] = js.undefined
  var source: typingsSlinky.ol.sourceVectorMod.default
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    source: typingsSlinky.ol.sourceVectorMod.default,
    attributions: AttributionLike = null,
    distance: Int | Double = null,
    geometryFunction: /* p0 */ typingsSlinky.ol.featureMod.default => typingsSlinky.ol.geomPointMod.default = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (geometryFunction != null) __obj.updateDynamic("geometryFunction")(js.Any.fromFunction1(geometryFunction))
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

