package typingsSlinky.ol.modifyMod

import typingsSlinky.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentData extends js.Object {
  var depth: js.UndefOr[js.Array[Double]] = js.undefined
  var feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]
  var featureSegments: js.UndefOr[js.Array[SegmentData]] = js.undefined
  var geometry: typingsSlinky.ol.simpleGeometryMod.default
  var index: js.UndefOr[Double] = js.undefined
  var segment: js.Array[Extent]
}

object SegmentData {
  @scala.inline
  def apply(
    feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default],
    geometry: typingsSlinky.ol.simpleGeometryMod.default,
    segment: js.Array[Extent],
    depth: js.Array[Double] = null,
    featureSegments: js.Array[SegmentData] = null,
    index: js.UndefOr[Double] = js.undefined
  ): SegmentData = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (featureSegments != null) __obj.updateDynamic("featureSegments")(featureSegments.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentData]
  }
}

