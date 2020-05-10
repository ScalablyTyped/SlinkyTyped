package typingsSlinky.leafletGeosearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenStreetMapProviderOptionsPolygonOutput extends js.Object {
  var polygon_geojson: js.UndefOr[Double] = js.native
  var polygon_kml: js.UndefOr[Double] = js.native
  var polygon_svg: js.UndefOr[Double] = js.native
  var polygon_text: js.UndefOr[Double] = js.native
  var polygon_threshold: js.UndefOr[String] = js.native
}

object OpenStreetMapProviderOptionsPolygonOutput {
  @scala.inline
  def apply(): OpenStreetMapProviderOptionsPolygonOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenStreetMapProviderOptionsPolygonOutput]
  }
  @scala.inline
  implicit class OpenStreetMapProviderOptionsPolygonOutputOps[Self <: OpenStreetMapProviderOptionsPolygonOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolygon_geojson(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygon_geojson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygon_geojson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygon_geojson")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygon_kml(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygon_kml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygon_kml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygon_kml")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygon_svg(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygon_svg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygon_svg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygon_svg")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygon_text(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygon_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygon_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygon_text")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygon_threshold(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygon_threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygon_threshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygon_threshold")(js.undefined)
        ret
    }
  }
  
}

