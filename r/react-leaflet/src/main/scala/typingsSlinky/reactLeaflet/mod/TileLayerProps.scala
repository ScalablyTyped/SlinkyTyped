package typingsSlinky.reactLeaflet.mod

import typingsSlinky.leaflet.mod.CrossOrigin
import typingsSlinky.leaflet.mod.LatLngBoundsExpression
import typingsSlinky.leaflet.mod.Point_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.leaflet.mod.GridLayerOptions because var conflicts: attribution, pane. Inlined bounds, className, keepBuffer, maxZoom, minZoom, noWrap, opacity, tileSize, updateInterval, updateWhenIdle, updateWhenZooming, zIndex
- typingsSlinky.leaflet.mod.TileLayerOptions because var conflicts: attribution, pane. Inlined accessToken, crossOrigin, detectRetina, errorTileUrl, id, maxNativeZoom, minNativeZoom, subdomains, tms, zoomOffset, zoomReverse */ @js.native
trait TileLayerProps
  extends MapLayerProps
     with TileLayerEvents {
  var accessToken: js.UndefOr[String] = js.native
  var bounds: js.UndefOr[LatLngBoundsExpression] = js.native
  var className: js.UndefOr[String] = js.native
  var crossOrigin: js.UndefOr[CrossOrigin] = js.native
  var detectRetina: js.UndefOr[Boolean] = js.native
  var errorTileUrl: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var keepBuffer: js.UndefOr[Double] = js.native
  var maxNativeZoom: js.UndefOr[Double] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minNativeZoom: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
  var noWrap: js.UndefOr[Boolean] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var subdomains: js.UndefOr[String | js.Array[String]] = js.native
  var tileSize: js.UndefOr[Double | Point_] = js.native
  var tms: js.UndefOr[Boolean] = js.native
  var updateInterval: js.UndefOr[Double] = js.native
  var updateWhenIdle: js.UndefOr[Boolean] = js.native
  var updateWhenZooming: js.UndefOr[Boolean] = js.native
  var url: String = js.native
  var zIndex: js.UndefOr[Double] = js.native
  var zoomOffset: js.UndefOr[Double] = js.native
  var zoomReverse: js.UndefOr[Boolean] = js.native
}

object TileLayerProps {
  @scala.inline
  def apply(url: String): TileLayerProps = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileLayerProps]
  }
  @scala.inline
  implicit class TileLayerPropsOps[Self <: TileLayerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(js.undefined)
        ret
    }
    @scala.inline
    def withBounds(value: LatLngBoundsExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossOrigin(value: CrossOrigin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectRetina(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectRetina")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectRetina: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectRetina")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorTileUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorTileUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorTileUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorTileUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepBuffer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxNativeZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNativeZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNativeZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNativeZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinNativeZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minNativeZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinNativeZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minNativeZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withNoWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noWrap")(js.undefined)
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
    def withSubdomains(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubdomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdomains")(js.undefined)
        ret
    }
    @scala.inline
    def withTileSize(value: Double | Point_): Self = {
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
    def withTms(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tms")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateWhenIdle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateWhenIdle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateWhenIdle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateWhenIdle")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateWhenZooming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateWhenZooming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateWhenZooming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateWhenZooming")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomReverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomReverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomReverse")(js.undefined)
        ret
    }
  }
  
}

