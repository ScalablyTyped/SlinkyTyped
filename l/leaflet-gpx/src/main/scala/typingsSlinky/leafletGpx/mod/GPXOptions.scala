package typingsSlinky.leafletGpx.mod

import typingsSlinky.leaflet.mod.MarkerOptions
import typingsSlinky.leaflet.mod.PolylineOptions
import typingsSlinky.leafletGpx.AnonParseElements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GPXOptions extends js.Object {
  var async: js.UndefOr[Boolean] = js.native
  var gpx_options: js.UndefOr[AnonParseElements] = js.native
  var marker_options: js.UndefOr[MarkerOptions] = js.native
  var max_point_interval: js.UndefOr[Double] = js.native
  var polyline_options: js.UndefOr[PolylineOptions] = js.native
}

object GPXOptions {
  @scala.inline
  def apply(): GPXOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPXOptions]
  }
  @scala.inline
  implicit class GPXOptionsOps[Self <: GPXOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withGpx_options(value: AnonParseElements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gpx_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGpx_options: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gpx_options")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker_options(value: MarkerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker_options: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker_options")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_point_interval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_point_interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_point_interval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_point_interval")(js.undefined)
        ret
    }
    @scala.inline
    def withPolyline_options(value: PolylineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyline_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolyline_options: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyline_options")(js.undefined)
        ret
    }
  }
  
}

