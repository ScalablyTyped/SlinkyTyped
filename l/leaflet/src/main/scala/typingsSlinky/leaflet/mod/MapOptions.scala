package typingsSlinky.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapOptions extends js.Object {
  // Control options
  var attributionControl: js.UndefOr[Boolean] = js.native
  var bounceAtZoomLimits: js.UndefOr[Boolean] = js.native
  var boxZoom: js.UndefOr[Boolean] = js.native
  var center: js.UndefOr[LatLngExpression] = js.native
  // Interaction options
  var closePopupOnClick: js.UndefOr[Boolean] = js.native
  // Map state options
  var crs: js.UndefOr[CRS] = js.native
  var doubleClickZoom: js.UndefOr[Zoom] = js.native
  var dragging: js.UndefOr[Boolean] = js.native
  var easeLinearity: js.UndefOr[Double] = js.native
  // Animation options
  var fadeAnimation: js.UndefOr[Boolean] = js.native
  // Panning inertia options
  var inertia: js.UndefOr[Boolean] = js.native
  var inertiaDeceleration: js.UndefOr[Double] = js.native
  var inertiaMaxSpeed: js.UndefOr[Double] = js.native
  // Keyboard navigation options
  var keyboard: js.UndefOr[Boolean] = js.native
  var keyboardPanDelta: js.UndefOr[Double] = js.native
  var layers: js.UndefOr[js.Array[Layer]] = js.native
  var markerZoomAnimation: js.UndefOr[Boolean] = js.native
  var maxBounds: js.UndefOr[LatLngBoundsExpression] = js.native
  var maxBoundsViscosity: js.UndefOr[Double] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
  var preferCanvas: js.UndefOr[Boolean] = js.native
  var renderer: js.UndefOr[Renderer] = js.native
  // Mousewheel options
  var scrollWheelZoom: js.UndefOr[Zoom] = js.native
  // Touch interaction options
  var tap: js.UndefOr[Boolean] = js.native
  var tapTolerance: js.UndefOr[Double] = js.native
  var touchZoom: js.UndefOr[Zoom] = js.native
  var trackResize: js.UndefOr[Boolean] = js.native
  var transform3DLimit: js.UndefOr[Double] = js.native
  var wheelDebounceTime: js.UndefOr[Double] = js.native
  var wheelPxPerZoomLevel: js.UndefOr[Double] = js.native
  var worldCopyJump: js.UndefOr[Boolean] = js.native
  var zoom: js.UndefOr[Double] = js.native
  var zoomAnimation: js.UndefOr[Boolean] = js.native
  var zoomAnimationThreshold: js.UndefOr[Double] = js.native
  var zoomControl: js.UndefOr[Boolean] = js.native
  var zoomDelta: js.UndefOr[Double] = js.native
  var zoomSnap: js.UndefOr[Double] = js.native
}

object MapOptions {
  @scala.inline
  def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  @scala.inline
  implicit class MapOptionsOps[Self <: MapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributionControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributionControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributionControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributionControl")(js.undefined)
        ret
    }
    @scala.inline
    def withBounceAtZoomLimits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceAtZoomLimits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounceAtZoomLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceAtZoomLimits")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: LatLngExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withClosePopupOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closePopupOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosePopupOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closePopupOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCrs(value: CRS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crs")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleClickZoom(value: Zoom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClickZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleClickZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClickZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(js.undefined)
        ret
    }
    @scala.inline
    def withEaseLinearity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeLinearity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEaseLinearity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeLinearity")(js.undefined)
        ret
    }
    @scala.inline
    def withFadeAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withInertia(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInertia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertia")(js.undefined)
        ret
    }
    @scala.inline
    def withInertiaDeceleration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaDeceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInertiaDeceleration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaDeceleration")(js.undefined)
        ret
    }
    @scala.inline
    def withInertiaMaxSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaMaxSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInertiaMaxSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaMaxSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardPanDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardPanDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardPanDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardPanDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[Layer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerZoomAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerZoomAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerZoomAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerZoomAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBounds(value: LatLngBoundsExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBoundsViscosity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBoundsViscosity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBoundsViscosity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBoundsViscosity")(js.undefined)
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
    def withPreferCanvas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferCanvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferCanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferCanvas")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(value: Renderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollWheelZoom(value: Zoom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWheelZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollWheelZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWheelZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withTap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tap")(js.undefined)
        ret
    }
    @scala.inline
    def withTapTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchZoom(value: Zoom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackResize")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform3DLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform3DLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform3DLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform3DLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelDebounceTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelDebounceTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheelDebounceTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelDebounceTime")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelPxPerZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelPxPerZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheelPxPerZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelPxPerZoomLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withWorldCopyJump(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldCopyJump")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorldCopyJump: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldCopyJump")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomAnimationThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomAnimationThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomAnimationThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomAnimationThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomControl")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomSnap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomSnap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomSnap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomSnap")(js.undefined)
        ret
    }
  }
  
}

