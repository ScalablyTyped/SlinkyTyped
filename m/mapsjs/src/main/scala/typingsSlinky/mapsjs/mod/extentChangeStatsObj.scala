package typingsSlinky.mapsjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait extentChangeStatsObj extends js.Object {
  var centerLat: Double = js.native
  var centerLon: Double = js.native
  var centerX: Double = js.native
  var centerY: Double = js.native
  var extents: envelope = js.native
  var mapScale: Double = js.native
  var mapScaleProjected: Double = js.native
  var mapUnitsPerPixel: Double = js.native
  var zoomLevel: Double = js.native
}

object extentChangeStatsObj {
  @scala.inline
  def apply(
    centerLat: Double,
    centerLon: Double,
    centerX: Double,
    centerY: Double,
    extents: envelope,
    mapScale: Double,
    mapScaleProjected: Double,
    mapUnitsPerPixel: Double,
    zoomLevel: Double
  ): extentChangeStatsObj = {
    val __obj = js.Dynamic.literal(centerLat = centerLat.asInstanceOf[js.Any], centerLon = centerLon.asInstanceOf[js.Any], centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], extents = extents.asInstanceOf[js.Any], mapScale = mapScale.asInstanceOf[js.Any], mapScaleProjected = mapScaleProjected.asInstanceOf[js.Any], mapUnitsPerPixel = mapUnitsPerPixel.asInstanceOf[js.Any], zoomLevel = zoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[extentChangeStatsObj]
  }
  @scala.inline
  implicit class extentChangeStatsObjOps[Self <: extentChangeStatsObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenterLat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerLat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenterLon(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerLon")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withExtents(value: envelope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapScaleProjected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapScaleProjected")(value.asInstanceOf[js.Any])
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

