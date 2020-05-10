package typingsSlinky.cesium

import typingsSlinky.cesium.mod.Ellipsoid
import typingsSlinky.cesium.mod.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNumberOfLevelZeroTilesX extends js.Object {
  var ellipsoid: js.UndefOr[Ellipsoid] = js.native
  var numberOfLevelZeroTilesX: js.UndefOr[Double] = js.native
  var numberOfLevelZeroTilesY: js.UndefOr[Double] = js.native
  var rectangle: js.UndefOr[Rectangle] = js.native
}

object AnonNumberOfLevelZeroTilesX {
  @scala.inline
  def apply(): AnonNumberOfLevelZeroTilesX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonNumberOfLevelZeroTilesX]
  }
  @scala.inline
  implicit class AnonNumberOfLevelZeroTilesXOps[Self <: AnonNumberOfLevelZeroTilesX] (val x: Self) extends AnyVal {
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
    def withRectangle(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRectangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(js.undefined)
        ret
    }
  }
  
}

