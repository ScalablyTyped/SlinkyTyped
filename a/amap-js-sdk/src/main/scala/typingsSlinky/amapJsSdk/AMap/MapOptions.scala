package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapOptions extends js.Object {
  var animateEnable: js.UndefOr[Boolean] = js.native
  var center: js.UndefOr[LngLat] = js.native
  var crs: js.UndefOr[String] = js.native
  var cursor: js.UndefOr[String] = js.native
  var defaultLayer: js.UndefOr[TileLayer] = js.native
  var doubleClickZoom: js.UndefOr[Boolean] = js.native
  var dragEnable: js.UndefOr[Boolean] = js.native
  var expandZoomRange: js.UndefOr[Boolean] = js.native
  var features: js.UndefOr[js.Array[String]] = js.native
  var indoorMap: js.UndefOr[IndoorMap] = js.native
  var isHotspot: js.UndefOr[Boolean] = js.native
  var jogEnable: js.UndefOr[Boolean] = js.native
  var keyboardEnable: js.UndefOr[Boolean] = js.native
  var labelzIndex: js.UndefOr[Double] = js.native
  var lang: js.UndefOr[String] = js.native
  var layers: js.UndefOr[js.Array[TileLayer]] = js.native
  var level: js.UndefOr[Double] = js.native
  var mapStyle: js.UndefOr[String] = js.native
  var resizeEnable: js.UndefOr[Boolean] = js.native
  var rotateEnable: js.UndefOr[Boolean] = js.native
  var scrollWheel: js.UndefOr[Boolean] = js.native
  var showIndoorMap: js.UndefOr[Boolean] = js.native
  var touchZoom: js.UndefOr[Boolean] = js.native
  var view: js.UndefOr[View2D] = js.native
  var zoomEnable: js.UndefOr[Boolean] = js.native
  var zooms: js.UndefOr[js.Array[Double]] = js.native
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
    def withAnimateEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: LngLat): Self = {
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
    def withCrs(value: String): Self = {
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
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLayer(value: TileLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleClickZoom(value: Boolean): Self = {
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
    def withDragEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandZoomRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandZoomRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandZoomRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandZoomRange")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatures(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
    @scala.inline
    def withIndoorMap(value: IndoorMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indoorMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndoorMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indoorMap")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHotspot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHotspot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHotspot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHotspot")(js.undefined)
        ret
    }
    @scala.inline
    def withJogEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jogEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJogEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jogEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelzIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelzIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelzIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelzIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[TileLayer]): Self = {
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
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withMapStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotateEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateEnable")(js.undefined)
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
    def withShowIndoorMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIndoorMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowIndoorMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIndoorMap")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchZoom(value: Boolean): Self = {
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
    def withView(value: View2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withZooms(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZooms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooms")(js.undefined)
        ret
    }
  }
  
}

