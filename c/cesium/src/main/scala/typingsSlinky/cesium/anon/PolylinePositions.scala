package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Cartesian2
import typingsSlinky.cesium.mod.Cartesian3
import typingsSlinky.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylinePositions extends js.Object {
  var cornerType: js.UndefOr[typingsSlinky.cesium.mod.CornerType] = js.undefined
  var ellipsoid: js.UndefOr[typingsSlinky.cesium.mod.Ellipsoid] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var polylinePositions: js.Array[Cartesian3]
  var shapePositions: js.Array[Cartesian2]
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
}

object PolylinePositions {
  @scala.inline
  def apply(
    polylinePositions: js.Array[Cartesian3],
    shapePositions: js.Array[Cartesian2],
    cornerType: typingsSlinky.cesium.mod.CornerType = null,
    ellipsoid: typingsSlinky.cesium.mod.Ellipsoid = null,
    granularity: js.UndefOr[Double] = js.undefined,
    vertexFormat: VertexFormat = null
  ): PolylinePositions = {
    val __obj = js.Dynamic.literal(polylinePositions = polylinePositions.asInstanceOf[js.Any], shapePositions = shapePositions.asInstanceOf[js.Any])
    if (cornerType != null) __obj.updateDynamic("cornerType")(cornerType.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(granularity)) __obj.updateDynamic("granularity")(granularity.get.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylinePositions]
  }
}

