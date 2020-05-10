package typingsSlinky.cesium

import typingsSlinky.cesium.mod.Cartesian3
import typingsSlinky.cesium.mod.CornerType
import typingsSlinky.cesium.mod.Ellipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonShapePositions extends js.Object {
  var cornerType: js.UndefOr[CornerType] = js.native
  var ellipsoid: js.UndefOr[Ellipsoid] = js.native
  var granularity: js.UndefOr[Double] = js.native
  var polylinePositions: js.Array[Cartesian3] = js.native
  var shapePositions: Double = js.native
}

object AnonShapePositions {
  @scala.inline
  def apply(polylinePositions: js.Array[Cartesian3], shapePositions: Double): AnonShapePositions = {
    val __obj = js.Dynamic.literal(polylinePositions = polylinePositions.asInstanceOf[js.Any], shapePositions = shapePositions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShapePositions]
  }
  @scala.inline
  implicit class AnonShapePositionsOps[Self <: AnonShapePositions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolylinePositions(value: js.Array[Cartesian3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylinePositions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapePositions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapePositions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCornerType(value: CornerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerType")(js.undefined)
        ret
    }
    @scala.inline
    def withEllipsoid(value: Ellipsoid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipsoid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(js.undefined)
        ret
    }
    @scala.inline
    def withGranularity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGranularity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granularity")(js.undefined)
        ret
    }
  }
  
}

