package typingsSlinky.openseadragon

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import typingsSlinky.openseadragon.mod.Drawer
import typingsSlinky.openseadragon.mod.ImageLoader
import typingsSlinky.openseadragon.mod.Placement
import typingsSlinky.openseadragon.mod.Rect
import typingsSlinky.openseadragon.mod.TileCache
import typingsSlinky.openseadragon.mod.TileSource
import typingsSlinky.openseadragon.mod.Viewer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAjaxHeaders extends js.Object {
  var ajaxHeaders: js.UndefOr[js.Object] = js.native
  var ajaxWithCredentials: js.UndefOr[Boolean] = js.native
  var alwaysBlend: js.UndefOr[Boolean] = js.native
  var animationTime: js.UndefOr[Boolean] = js.native
  var blendTime: js.UndefOr[Double] = js.native
  var clip: js.UndefOr[Rect] = js.native
  var compositeOperation: js.UndefOr[String] = js.native
  var crossOriginPolicy: js.UndefOr[String | Boolean] = js.native
  var debugMode: js.UndefOr[Boolean] = js.native
  var drawer: Drawer = js.native
  var fitBounds: js.UndefOr[Rect] = js.native
  var fitBoundsPlacement: js.UndefOr[Placement] = js.native
  var height: js.UndefOr[Double] = js.native
  var iOSDevice: js.UndefOr[Boolean] = js.native
  var imageLoader: ImageLoader = js.native
  var immediateRender: js.UndefOr[Boolean] = js.native
  var loadTilesWithAjax: js.UndefOr[Boolean] = js.native
  var minPixelRatio: js.UndefOr[Double] = js.native
  var minZoomImageRatio: js.UndefOr[Double] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var placeholderFillStyle: js.UndefOr[String | CanvasGradient | CanvasPattern] = js.native
  var preload: js.UndefOr[Boolean] = js.native
  var smoothTileEdgesMinZoom: js.UndefOr[Double] = js.native
  var source: TileSource = js.native
  var springStiffness: js.UndefOr[Double] = js.native
  var tileCache: TileCache = js.native
  var viewer: Viewer = js.native
  var width: js.UndefOr[Double] = js.native
  var wrapHorizontal: js.UndefOr[Boolean] = js.native
  var wrapVertical: js.UndefOr[Boolean] = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
}

object AnonAjaxHeaders {
  @scala.inline
  def apply(drawer: Drawer, imageLoader: ImageLoader, source: TileSource, tileCache: TileCache, viewer: Viewer): AnonAjaxHeaders = {
    val __obj = js.Dynamic.literal(drawer = drawer.asInstanceOf[js.Any], imageLoader = imageLoader.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tileCache = tileCache.asInstanceOf[js.Any], viewer = viewer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAjaxHeaders]
  }
  @scala.inline
  implicit class AnonAjaxHeadersOps[Self <: AnonAjaxHeaders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawer(value: Drawer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageLoader(value: ImageLoader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLoader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: TileSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileCache(value: TileCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewer(value: Viewer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAjaxHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxWithCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxWithCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withAlwaysBlend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysBlend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysBlend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysBlend")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withBlendTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlendTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendTime")(js.undefined)
        ret
    }
    @scala.inline
    def withClip(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(js.undefined)
        ret
    }
    @scala.inline
    def withCompositeOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositeOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompositeOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositeOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossOriginPolicy(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOriginPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossOriginPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOriginPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFitBounds(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFitBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withFitBoundsPlacement(value: Placement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitBoundsPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFitBoundsPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitBoundsPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIOSDevice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOSDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIOSDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOSDevice")(js.undefined)
        ret
    }
    @scala.inline
    def withImmediateRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediateRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmediateRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediateRender")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadTilesWithAjax(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadTilesWithAjax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadTilesWithAjax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadTilesWithAjax")(js.undefined)
        ret
    }
    @scala.inline
    def withMinPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPixelRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPixelRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoomImageRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoomImageRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoomImageRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoomImageRatio")(js.undefined)
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
    def withPlaceholderFillStyleCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderFillStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholderFillStyleCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderFillStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholderFillStyle(value: String | CanvasGradient | CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderFillStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderFillStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderFillStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPreload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(js.undefined)
        ret
    }
    @scala.inline
    def withSmoothTileEdgesMinZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothTileEdgesMinZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmoothTileEdgesMinZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothTileEdgesMinZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withSpringStiffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springStiffness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpringStiffness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springStiffness")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapHorizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapVertical")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

