package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreetViewTileData extends js.Object {
  var centerHeading: js.UndefOr[Double] = js.native
  var tileSize: js.UndefOr[Size] = js.native
  var worldSize: js.UndefOr[Size] = js.native
  def getTileUrl(pano: String, tileZoom: Double, tileX: Double, tileY: Double): String = js.native
}

object StreetViewTileData {
  @scala.inline
  def apply(getTileUrl: (String, Double, Double, Double) => String): StreetViewTileData = {
    val __obj = js.Dynamic.literal(getTileUrl = js.Any.fromFunction4(getTileUrl))
    __obj.asInstanceOf[StreetViewTileData]
  }
  @scala.inline
  implicit class StreetViewTileDataOps[Self <: StreetViewTileData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetTileUrl(value: (String, Double, Double, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTileUrl")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withCenterHeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerHeading")(js.undefined)
        ret
    }
    @scala.inline
    def withTileSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withWorldSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorldSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldSize")(js.undefined)
        ret
    }
  }
  
}

