package typingsSlinky.openseadragon.mod

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.openseadragon.anon.Image
import typingsSlinky.openseadragon.anon.Levels
import typingsSlinky.openseadragon.openseadragonBooleans.`false`
import typingsSlinky.openseadragon.openseadragonStrings.ABSOLUTE
import typingsSlinky.openseadragon.openseadragonStrings.Anonymous
import typingsSlinky.openseadragon.openseadragonStrings.BOTTOM_LEFT
import typingsSlinky.openseadragon.openseadragonStrings.BOTTOM_RIGHT
import typingsSlinky.openseadragon.openseadragonStrings.TOP_LEFT
import typingsSlinky.openseadragon.openseadragonStrings.TOP_RIGHT
import typingsSlinky.openseadragon.openseadragonStrings.`destination-atop`
import typingsSlinky.openseadragon.openseadragonStrings.`destination-in`
import typingsSlinky.openseadragon.openseadragonStrings.`destination-out`
import typingsSlinky.openseadragon.openseadragonStrings.`destination-over`
import typingsSlinky.openseadragon.openseadragonStrings.`source-atop`
import typingsSlinky.openseadragon.openseadragonStrings.`source-in`
import typingsSlinky.openseadragon.openseadragonStrings.`source-out`
import typingsSlinky.openseadragon.openseadragonStrings.`source-over`
import typingsSlinky.openseadragon.openseadragonStrings.`use-credentials`
import typingsSlinky.openseadragon.openseadragonStrings.copy
import typingsSlinky.openseadragon.openseadragonStrings.horizontal
import typingsSlinky.openseadragon.openseadragonStrings.lighter
import typingsSlinky.openseadragon.openseadragonStrings.vertical
import typingsSlinky.openseadragon.openseadragonStrings.xor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var ajaxHeaders: js.UndefOr[js.Object] = js.native
  var ajaxWithCredentials: js.UndefOr[Boolean] = js.native
  var alwaysBlend: js.UndefOr[Boolean] = js.native
  var animationTime: js.UndefOr[Double] = js.native
  var autoHideControls: js.UndefOr[Boolean] = js.native
  var autoResize: js.UndefOr[Boolean] = js.native
  var blendTime: js.UndefOr[Double] = js.native
  var clickDistThreshold: js.UndefOr[Double] = js.native
  var clickTimeThreshold: js.UndefOr[Double] = js.native
  var collectionColumns: js.UndefOr[Double] = js.native
  var collectionLayout: js.UndefOr[horizontal | vertical] = js.native
  var collectionMode: js.UndefOr[Boolean] = js.native
  var collectionRows: js.UndefOr[Double] = js.native
  var collectionTileMargin: js.UndefOr[Double] = js.native
  var collectionTileSize: js.UndefOr[Double] = js.native
  var compositeOperation: js.UndefOr[
    `source-over` | `source-atop` | `source-in` | `source-out` | `destination-over` | `destination-atop` | `destination-in` | `destination-out` | lighter | copy | xor
  ] = js.native
  var constrainDuringPan: js.UndefOr[Boolean] = js.native
  var controlsFadeDelay: js.UndefOr[Double] = js.native
  var controlsFadeLength: js.UndefOr[Double] = js.native
  var crossOriginPolicy: js.UndefOr[Anonymous | `use-credentials` | `false`] = js.native
  var dblClickDistThreshold: js.UndefOr[Double] = js.native
  var dblClickTimeThreshold: js.UndefOr[Double] = js.native
  var debugGridColor: js.UndefOr[js.Array[String]] = js.native
  var debugMode: js.UndefOr[Boolean] = js.native
  var defaultZoomLevel: js.UndefOr[Double] = js.native
  var degrees: js.UndefOr[Double] = js.native
  var element: js.UndefOr[HTMLElement] = js.native
  var flipped: js.UndefOr[Boolean] = js.native
  var fullPageButton: js.UndefOr[String] = js.native
  var gestureSettingsMouse: js.UndefOr[GestureSettings] = js.native
  var gestureSettingsPen: js.UndefOr[GestureSettings] = js.native
  var gestureSettingsTouch: js.UndefOr[GestureSettings] = js.native
  var gestureSettingsUnknown: js.UndefOr[GestureSettings] = js.native
  var homeButton: js.UndefOr[String] = js.native
  var homeFillsViewer: js.UndefOr[Boolean] = js.native
  var iOSDevice: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var imageLoaderLimit: js.UndefOr[Double] = js.native
  var imageSmoothingEnabled: js.UndefOr[Boolean] = js.native
  var initialPage: js.UndefOr[Boolean] = js.native
  var inmediateRender: js.UndefOr[Boolean] = js.native
  var loadTilesWithAjax: js.UndefOr[Boolean] = js.native
  var maxImageCacheCount: js.UndefOr[Double] = js.native
  var maxZoomLevel: js.UndefOr[Double] = js.native
  var maxZoomPixelRatio: js.UndefOr[Double] = js.native
  var minPixelRatio: js.UndefOr[Double] = js.native
  var minScrollDeltaTime: js.UndefOr[Double] = js.native
  var minZoomImageRatio: js.UndefOr[Double] = js.native
  var minZoomLevel: js.UndefOr[Double] = js.native
  var mouseNavEnabled: js.UndefOr[Double] = js.native
  var navImages: js.UndefOr[NavImages] = js.native
  var navPrevNextWrap: js.UndefOr[Boolean] = js.native
  var navigationControlAnchor: js.UndefOr[ControlAnchor] = js.native
  var navigatorAutoFade: js.UndefOr[Boolean] = js.native
  var navigatorAutoResize: js.UndefOr[Boolean] = js.native
  var navigatorBackground: js.UndefOr[String] = js.native
  var navigatorBorderColor: js.UndefOr[String] = js.native
  var navigatorDisplayRegionColor: js.UndefOr[String] = js.native
  var navigatorHeight: js.UndefOr[Double | String] = js.native
  var navigatorId: js.UndefOr[String] = js.native
  var navigatorLeft: js.UndefOr[Double | String] = js.native
  var navigatorMaintainSizeRatio: js.UndefOr[Boolean] = js.native
  var navigatorOpacity: js.UndefOr[Double] = js.native
  var navigatorPosition: js.UndefOr[TOP_LEFT | TOP_RIGHT | BOTTOM_LEFT | BOTTOM_RIGHT | ABSOLUTE] = js.native
  var navigatorRotate: js.UndefOr[Boolean] = js.native
  var navigatorSizeRatio: js.UndefOr[Double] = js.native
  var navigatorTop: js.UndefOr[Double | String] = js.native
  var navigatorWidth: js.UndefOr[Double | String] = js.native
  var nextButton: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var overlays: js.UndefOr[js.Array[_]] = js.native
  var panHorizontal: js.UndefOr[Boolean] = js.native
  var panVertical: js.UndefOr[Boolean] = js.native
  var pixelsPerArrowPress: js.UndefOr[Double] = js.native
  var pixelsPerWheelLine: js.UndefOr[Double] = js.native
  var placeholderFillStyle: js.UndefOr[String | CanvasGradient | CanvasPattern] = js.native
  var prefixUrl: js.UndefOr[String] = js.native
  var preload: js.UndefOr[Boolean] = js.native
  var preserveImageSizeOnResize: js.UndefOr[Boolean] = js.native
  var preserveOverlays: js.UndefOr[Boolean] = js.native
  var preserveViewport: js.UndefOr[Boolean] = js.native
  var previousButton: js.UndefOr[String] = js.native
  var referenceStripElement: js.UndefOr[HTMLElement] = js.native
  var referenceStripHeight: js.UndefOr[Double] = js.native
  var referenceStripPosition: js.UndefOr[String] = js.native
  var referenceStripScroll: js.UndefOr[String] = js.native
  var referenceStripSizeRatio: js.UndefOr[Double] = js.native
  var referenceStripWidth: js.UndefOr[Double] = js.native
  var rotateLeftButton: js.UndefOr[String] = js.native
  var rotateRightButton: js.UndefOr[String] = js.native
  var sequenceControlAnchor: js.UndefOr[ControlAnchor] = js.native
  var sequenceMode: js.UndefOr[Boolean] = js.native
  var showFlipControl: js.UndefOr[Boolean] = js.native
  var showFullPageControl: js.UndefOr[Boolean] = js.native
  var showHomeControl: js.UndefOr[Boolean] = js.native
  var showNavigationControl: js.UndefOr[Boolean] = js.native
  var showNavigator: js.UndefOr[Boolean] = js.native
  var showReferenceStrip: js.UndefOr[Boolean] = js.native
  var showRotationControl: js.UndefOr[Boolean] = js.native
  var showSequenceControl: js.UndefOr[Boolean] = js.native
  var showZoomControl: js.UndefOr[Boolean] = js.native
  var smoothTileEdgesMinZoom: js.UndefOr[Double] = js.native
  var springStiffness: js.UndefOr[Double] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var tileSources: js.UndefOr[String | (js.Array[String | TileSource]) | TileSourceOptions | Levels | Image] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var useCanvas: js.UndefOr[Boolean] = js.native
  var viewportMargins: js.UndefOr[js.Object] = js.native
  var visibilityRatio: js.UndefOr[Double] = js.native
  var wrapHorizontal: js.UndefOr[Boolean] = js.native
  var wrapVertical: js.UndefOr[Boolean] = js.native
  var zoomInButton: js.UndefOr[String] = js.native
  var zoomOutButton: js.UndefOr[String] = js.native
  var zoomPerClick: js.UndefOr[Double] = js.native
  var zoomPerScroll: js.UndefOr[Double] = js.native
  var zoomPerSecond: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withAnimationTime(value: Double): Self = {
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
    def withAutoHideControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHideControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideControls")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResize")(js.undefined)
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
    def withClickDistThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickDistThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickDistThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickDistThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withClickTimeThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickTimeThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickTimeThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickTimeThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectionColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectionLayout(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectionMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectionRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionRows")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectionTileMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionTileMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionTileMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionTileMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectionTileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionTileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionTileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionTileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCompositeOperation(
      value: `source-over` | `source-atop` | `source-in` | `source-out` | `destination-over` | `destination-atop` | `destination-in` | `destination-out` | lighter | copy | xor
    ): Self = {
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
    def withConstrainDuringPan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainDuringPan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainDuringPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainDuringPan")(js.undefined)
        ret
    }
    @scala.inline
    def withControlsFadeDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsFadeDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlsFadeDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsFadeDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withControlsFadeLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsFadeLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlsFadeLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsFadeLength")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossOriginPolicy(value: Anonymous | `use-credentials` | `false`): Self = {
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
    def withDblClickDistThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblClickDistThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDblClickDistThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblClickDistThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withDblClickTimeThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblClickTimeThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDblClickTimeThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblClickTimeThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugGridColor(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugGridColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugGridColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugGridColor")(js.undefined)
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
    def withDefaultZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultZoomLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withDegrees(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degrees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDegrees: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degrees")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withFlipped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlipped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipped")(js.undefined)
        ret
    }
    @scala.inline
    def withFullPageButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullPageButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullPageButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullPageButton")(js.undefined)
        ret
    }
    @scala.inline
    def withGestureSettingsMouse(value: GestureSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureSettingsMouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGestureSettingsMouse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureSettingsMouse")(js.undefined)
        ret
    }
    @scala.inline
    def withGestureSettingsPen(value: GestureSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureSettingsPen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGestureSettingsPen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureSettingsPen")(js.undefined)
        ret
    }
    @scala.inline
    def withGestureSettingsTouch(value: GestureSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureSettingsTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGestureSettingsTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureSettingsTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withGestureSettingsUnknown(value: GestureSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureSettingsUnknown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGestureSettingsUnknown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureSettingsUnknown")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeButton")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeFillsViewer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeFillsViewer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeFillsViewer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeFillsViewer")(js.undefined)
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
    def withImageLoaderLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLoaderLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageLoaderLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLoaderLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withImageSmoothingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSmoothingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageSmoothingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSmoothingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPage")(js.undefined)
        ret
    }
    @scala.inline
    def withInmediateRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inmediateRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInmediateRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inmediateRender")(js.undefined)
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
    def withMaxImageCacheCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxImageCacheCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxImageCacheCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxImageCacheCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoomPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomPixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoomPixelRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomPixelRatio")(js.undefined)
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
    def withMinScrollDeltaTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScrollDeltaTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinScrollDeltaTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScrollDeltaTime")(js.undefined)
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
    def withMinZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoomLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseNavEnabled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseNavEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseNavEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseNavEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withNavImages(value: NavImages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navImages")(js.undefined)
        ret
    }
    @scala.inline
    def withNavPrevNextWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navPrevNextWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavPrevNextWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navPrevNextWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationControlAnchor(value: ControlAnchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationControlAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationControlAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationControlAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigatorAutoFade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorAutoFade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigatorAutoFade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorAutoFade")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigatorAutoResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorAutoResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigatorAutoResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorAutoResize")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigatorBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigatorBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigatorBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigatorBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigatorDisplayRegionColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorDisplayRegionColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigatorDisplayRegionColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorDisplayRegionColor")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigatorHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigatorHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigatorId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigatorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorId")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigatorLeft(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigatorLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigatorMaintainSizeRatio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorMaintainSizeRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigatorMaintainSizeRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorMaintainSizeRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigatorOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigatorOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigatorPosition(value: TOP_LEFT | TOP_RIGHT | BOTTOM_LEFT | BOTTOM_RIGHT | ABSOLUTE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigatorPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigatorRotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorRotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigatorRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorRotate")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigatorSizeRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorSizeRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigatorSizeRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorSizeRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigatorTop(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigatorTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorTop")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigatorWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigatorWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withNextButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButton")(js.undefined)
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
    def withOverlays(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlays")(js.undefined)
        ret
    }
    @scala.inline
    def withPanHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panHorizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withPanVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panVertical")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelsPerArrowPress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelsPerArrowPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelsPerArrowPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelsPerArrowPress")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelsPerWheelLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelsPerWheelLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelsPerWheelLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelsPerWheelLine")(js.undefined)
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
    def withPrefixUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixUrl")(js.undefined)
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
    def withPreserveImageSizeOnResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveImageSizeOnResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveImageSizeOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveImageSizeOnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveOverlays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveOverlays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveOverlays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveOverlays")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveViewport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveViewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveViewport")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousButton")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceStripElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceStripElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceStripElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceStripElement")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceStripHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceStripHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceStripHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceStripHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceStripPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceStripPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceStripPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceStripPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceStripScroll(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceStripScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceStripScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceStripScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceStripSizeRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceStripSizeRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceStripSizeRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceStripSizeRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceStripWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceStripWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceStripWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceStripWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateLeftButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateLeftButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotateLeftButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateLeftButton")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateRightButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateRightButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotateRightButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateRightButton")(js.undefined)
        ret
    }
    @scala.inline
    def withSequenceControlAnchor(value: ControlAnchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceControlAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequenceControlAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceControlAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withSequenceMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequenceMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceMode")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFlipControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFlipControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFlipControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFlipControl")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFullPageControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFullPageControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFullPageControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFullPageControl")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHomeControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHomeControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHomeControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHomeControl")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNavigationControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavigationControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNavigationControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavigationControl")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNavigator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavigator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNavigator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavigator")(js.undefined)
        ret
    }
    @scala.inline
    def withShowReferenceStrip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showReferenceStrip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowReferenceStrip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showReferenceStrip")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRotationControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRotationControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRotationControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRotationControl")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSequenceControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSequenceControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSequenceControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSequenceControl")(js.undefined)
        ret
    }
    @scala.inline
    def withShowZoomControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showZoomControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowZoomControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showZoomControl")(js.undefined)
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
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTileSources(value: String | (js.Array[String | TileSource]) | TileSourceOptions | Levels | Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSources")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCanvas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCanvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCanvas")(js.undefined)
        ret
    }
    @scala.inline
    def withViewportMargins(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportMargins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewportMargins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportMargins")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibilityRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilityRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibilityRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilityRatio")(js.undefined)
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
    def withZoomInButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomInButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomInButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomInButton")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomOutButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOutButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomOutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOutButton")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomPerClick(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomPerClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomPerClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomPerClick")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomPerScroll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomPerScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomPerScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomPerScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomPerSecond")(js.undefined)
        ret
    }
  }
  
}

