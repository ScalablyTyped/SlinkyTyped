package typingsSlinky.navermaps.naver.maps.visualization

import typingsSlinky.navermaps.naver.maps.LatLng
import typingsSlinky.navermaps.naver.maps.Map
import typingsSlinky.navermaps.naver.maps.PointArrayLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatMapOptions extends js.Object {
  var colorMap: js.UndefOr[SpectrumStyle] = js.native
  var data: js.Array[LatLng | PointArrayLiteral | WeightedLocation] = js.native
  var map: Map = js.native
  var opacity: js.UndefOr[Double] = js.native
  var radius: js.UndefOr[Double] = js.native
}

object HeatMapOptions {
  @scala.inline
  def apply(data: js.Array[LatLng | PointArrayLiteral | WeightedLocation], map: Map): HeatMapOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatMapOptions]
  }
  @scala.inline
  implicit class HeatMapOptionsOps[Self <: HeatMapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[LatLng | PointArrayLiteral | WeightedLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: Map): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorMap(value: SpectrumStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMap")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
  }
  
}

