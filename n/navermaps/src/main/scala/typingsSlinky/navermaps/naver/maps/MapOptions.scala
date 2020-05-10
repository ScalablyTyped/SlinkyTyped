package typingsSlinky.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapOptions extends js.Object {
  var background: js.UndefOr[String] = js.native
  var baseTileOpacity: js.UndefOr[Double] = js.native
  var bounds: js.UndefOr[js.Any] = js.native
  var center: js.UndefOr[js.Any] = js.native
  var disableDoubleClickZoom: js.UndefOr[Boolean] = js.native
  var disableDoubleTapZoom: js.UndefOr[Boolean] = js.native
  var disableKineticPan: js.UndefOr[Boolean] = js.native
  var disableTwoFingerTapZoom: js.UndefOr[Boolean] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var keyboardShortcuts: js.UndefOr[Boolean] = js.native
  var logoControl: js.UndefOr[Boolean] = js.native
  var logoControlOptions: js.UndefOr[js.Any] = js.native
  var mapDataControl: js.UndefOr[Boolean] = js.native
  var mapDataControlOptions: js.UndefOr[js.Any] = js.native
  var mapTypeControl: js.UndefOr[Boolean] = js.native
  var mapTypeControlOptions: js.UndefOr[js.Any] = js.native
  var mapTypeId: js.UndefOr[String] = js.native
  var mapTypes: js.UndefOr[js.Any] = js.native
  var maxBounds: js.UndefOr[js.Any] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
  var overlayZoomEffect: js.UndefOr[Null | String] = js.native
  var padding: js.UndefOr[js.Any] = js.native
  var pinchZoom: js.UndefOr[Boolean] = js.native
  var resizeOrigin: js.UndefOr[js.Any] = js.native
  var scaleControl: js.UndefOr[Boolean] = js.native
  var scaleControlOptions: js.UndefOr[js.Any] = js.native
  var scrollWheel: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[js.Any] = js.native
  var tileSpare: js.UndefOr[Double] = js.native
  var tileTransition: js.UndefOr[Boolean] = js.native
  var zoom: js.UndefOr[Double] = js.native
  var zoomControl: js.UndefOr[Boolean] = js.native
  var zoomControlOptions: js.UndefOr[js.Any] = js.native
  var zoomOrigin: js.UndefOr[js.Any] = js.native
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
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseTileOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTileOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseTileOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTileOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withBounds(value: js.Any): Self = {
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
    def withCenter(value: js.Any): Self = {
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
    def withDisableDoubleClickZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDoubleClickZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableDoubleClickZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDoubleClickZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableDoubleTapZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDoubleTapZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableDoubleTapZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDoubleTapZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableKineticPan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableKineticPan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableKineticPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableKineticPan")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableTwoFingerTapZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTwoFingerTapZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableTwoFingerTapZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTwoFingerTapZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardShortcuts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardShortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardShortcuts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardShortcuts")(js.undefined)
        ret
    }
    @scala.inline
    def withLogoControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogoControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoControl")(js.undefined)
        ret
    }
    @scala.inline
    def withLogoControlOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoControlOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogoControlOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoControlOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMapDataControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapDataControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapDataControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapDataControl")(js.undefined)
        ret
    }
    @scala.inline
    def withMapDataControlOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapDataControlOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapDataControlOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapDataControlOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMapTypeControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTypeControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapTypeControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTypeControl")(js.undefined)
        ret
    }
    @scala.inline
    def withMapTypeControlOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTypeControlOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapTypeControlOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTypeControlOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMapTypeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapTypeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTypeId")(js.undefined)
        ret
    }
    @scala.inline
    def withMapTypes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBounds(value: js.Any): Self = {
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
    def withOverlayZoomEffect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayZoomEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayZoomEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayZoomEffect")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayZoomEffectNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayZoomEffect")(null)
        ret
    }
    @scala.inline
    def withPadding(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPinchZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinchZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinchZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinchZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeOrigin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleControl")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleControlOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleControlOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleControlOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleControlOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollWheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withTileSpare(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSpare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileSpare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSpare")(js.undefined)
        ret
    }
    @scala.inline
    def withTileTransition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileTransition")(js.undefined)
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
    def withZoomControlOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomControlOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomControlOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomControlOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomOrigin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOrigin")(js.undefined)
        ret
    }
  }
  
}

