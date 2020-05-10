package typingsSlinky.mapsjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait repositionStatsObj extends js.Object {
  var centerX: Double = js.native
  var centerY: Double = js.native
  var mapUnitsPerPixel: Double = js.native
  var zoomLevel: Double = js.native
}

object repositionStatsObj {
  @scala.inline
  def apply(centerX: Double, centerY: Double, mapUnitsPerPixel: Double, zoomLevel: Double): repositionStatsObj = {
    val __obj = js.Dynamic.literal(centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], mapUnitsPerPixel = mapUnitsPerPixel.asInstanceOf[js.Any], zoomLevel = zoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[repositionStatsObj]
  }
  @scala.inline
  implicit class repositionStatsObjOps[Self <: repositionStatsObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenterX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenterY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapUnitsPerPixel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapUnitsPerPixel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

