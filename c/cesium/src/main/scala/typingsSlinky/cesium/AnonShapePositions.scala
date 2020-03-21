package typingsSlinky.cesium

import typingsSlinky.cesium.mod.Cartesian3
import typingsSlinky.cesium.mod.CornerType
import typingsSlinky.cesium.mod.Ellipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShapePositions extends js.Object {
  var cornerType: js.UndefOr[CornerType] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var polylinePositions: js.Array[Cartesian3]
  var shapePositions: Double
}

object AnonShapePositions {
  @scala.inline
  def apply(
    polylinePositions: js.Array[Cartesian3],
    shapePositions: Double,
    cornerType: CornerType = null,
    ellipsoid: Ellipsoid = null,
    granularity: Int | Double = null
  ): AnonShapePositions = {
    val __obj = js.Dynamic.literal(polylinePositions = polylinePositions.asInstanceOf[js.Any], shapePositions = shapePositions.asInstanceOf[js.Any])
    if (cornerType != null) __obj.updateDynamic("cornerType")(cornerType.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShapePositions]
  }
}

