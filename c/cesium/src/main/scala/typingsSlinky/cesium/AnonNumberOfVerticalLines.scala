package typingsSlinky.cesium

import typingsSlinky.cesium.mod.Cartesian3
import typingsSlinky.cesium.mod.Ellipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNumberOfVerticalLines extends js.Object {
  var center: Cartesian3 = js.native
  var ellipsoid: js.UndefOr[Ellipsoid] = js.native
  var extrudedHeight: js.UndefOr[Double] = js.native
  var granularity: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var numberOfVerticalLines: js.UndefOr[Double] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var semiMajorAxis: Double = js.native
  var semiMinorAxis: Double = js.native
}

object AnonNumberOfVerticalLines {
  @scala.inline
  def apply(center: Cartesian3, semiMajorAxis: Double, semiMinorAxis: Double): AnonNumberOfVerticalLines = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], semiMajorAxis = semiMajorAxis.asInstanceOf[js.Any], semiMinorAxis = semiMinorAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNumberOfVerticalLines]
  }
  @scala.inline
  implicit class AnonNumberOfVerticalLinesOps[Self <: AnonNumberOfVerticalLines] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: Cartesian3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemiMajorAxis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semiMajorAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemiMinorAxis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semiMinorAxis")(value.asInstanceOf[js.Any])
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
    def withExtrudedHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extrudedHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtrudedHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extrudedHeight")(js.undefined)
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
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfVerticalLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfVerticalLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfVerticalLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfVerticalLines")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
  }
  
}

