package typingsSlinky.cesium

import typingsSlinky.cesium.mod.Cartesian2
import typingsSlinky.cesium.mod.Ellipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNumberOfLevelZeroTilesY extends js.Object {
  var ellipsoid: js.UndefOr[Ellipsoid] = js.native
  var numberOfLevelZeroTilesX: js.UndefOr[Double] = js.native
  var numberOfLevelZeroTilesY: js.UndefOr[Double] = js.native
  var rectangleNortheastInMeters: js.UndefOr[Cartesian2] = js.native
  var rectangleSouthwestInMeters: js.UndefOr[Cartesian2] = js.native
}

object AnonNumberOfLevelZeroTilesY {
  @scala.inline
  def apply(): AnonNumberOfLevelZeroTilesY = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonNumberOfLevelZeroTilesY]
  }
  @scala.inline
  implicit class AnonNumberOfLevelZeroTilesYOps[Self <: AnonNumberOfLevelZeroTilesY] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withNumberOfLevelZeroTilesX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfLevelZeroTilesX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfLevelZeroTilesX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfLevelZeroTilesX")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfLevelZeroTilesY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfLevelZeroTilesY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfLevelZeroTilesY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfLevelZeroTilesY")(js.undefined)
        ret
    }
    @scala.inline
    def withRectangleNortheastInMeters(value: Cartesian2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangleNortheastInMeters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRectangleNortheastInMeters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangleNortheastInMeters")(js.undefined)
        ret
    }
    @scala.inline
    def withRectangleSouthwestInMeters(value: Cartesian2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangleSouthwestInMeters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRectangleSouthwestInMeters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangleSouthwestInMeters")(js.undefined)
        ret
    }
  }
  
}

