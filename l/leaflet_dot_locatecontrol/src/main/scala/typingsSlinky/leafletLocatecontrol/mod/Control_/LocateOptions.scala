package typingsSlinky.leafletLocatecontrol.mod.Control_

import typingsSlinky.leaflet.mod.Layer
import typingsSlinky.leaflet.mod.MarkerOptions
import typingsSlinky.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocateOptions extends js.Object {
  var cacheLocation: js.UndefOr[Boolean] = js.native
  var circlePadding: js.UndefOr[js.Array[Double]] = js.native
  var circleStyle: js.UndefOr[PathOptions] = js.native
  var clickBehavior: js.UndefOr[js.Any] = js.native
  var drawCircle: js.UndefOr[Boolean] = js.native
  var drawMarker: js.UndefOr[Boolean] = js.native
  var flyTo: js.UndefOr[Boolean] = js.native
  var followCircleStyle: js.UndefOr[PathOptions] = js.native
  var followMarkerStyle: js.UndefOr[PathOptions] = js.native
  var icon: js.UndefOr[String] = js.native
  var iconElementTag: js.UndefOr[String] = js.native
  var iconLoading: js.UndefOr[String] = js.native
  var keepCurrentZoomLevel: js.UndefOr[Boolean] = js.native
  var layer: js.UndefOr[Layer] = js.native
  var locateOptions: js.UndefOr[typingsSlinky.leaflet.mod.LocateOptions] = js.native
  var markerClass: js.UndefOr[js.Any] = js.native
  var markerStyle: js.UndefOr[PathOptions | MarkerOptions] = js.native
  var onLocationError: js.UndefOr[js.Any] = js.native
  var onLocationOutsideMapBounds: js.UndefOr[js.Any] = js.native
  var position: js.UndefOr[String] = js.native
  var returnToPrevBounds: js.UndefOr[Boolean] = js.native
  var setView: js.UndefOr[Boolean | String] = js.native
  var showPopup: js.UndefOr[Boolean] = js.native
  var strings: js.UndefOr[js.Any] = js.native
}

object LocateOptions {
  @scala.inline
  def apply(): LocateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocateOptions]
  }
  @scala.inline
  implicit class LocateOptionsOps[Self <: LocateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheLocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withCirclePadding(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circlePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCirclePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circlePadding")(js.undefined)
        ret
    }
    @scala.inline
    def withCircleStyle(value: PathOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withClickBehavior(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawCircle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawCircle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawCircle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawCircle")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawMarker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withFlyTo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flyTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlyTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flyTo")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowCircleStyle(value: PathOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followCircleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowCircleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followCircleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowMarkerStyle(value: PathOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followMarkerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowMarkerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followMarkerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconElementTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconElementTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconElementTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconElementTag")(js.undefined)
        ret
    }
    @scala.inline
    def withIconLoading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepCurrentZoomLevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepCurrentZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepCurrentZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepCurrentZoomLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLayer(value: Layer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(js.undefined)
        ret
    }
    @scala.inline
    def withLocateOptions(value: typingsSlinky.leaflet.mod.LocateOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locateOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocateOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locateOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerClass(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerStyle(value: PathOptions | MarkerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLocationError(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLocationError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLocationError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLocationError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLocationOutsideMapBounds(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLocationOutsideMapBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLocationOutsideMapBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLocationOutsideMapBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnToPrevBounds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnToPrevBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnToPrevBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnToPrevBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withSetView(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setView")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPopup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPopup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPopup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPopup")(js.undefined)
        ret
    }
    @scala.inline
    def withStrings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(js.undefined)
        ret
    }
  }
  
}

