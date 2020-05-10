package typingsSlinky.ezPlus.mod

import typingsSlinky.ezPlus.ezPlusBooleans.`false`
import typingsSlinky.ezPlus.ezPlusNumbers.`0`
import typingsSlinky.ezPlus.ezPlusNumbers.`1`
import typingsSlinky.ezPlus.ezPlusStrings.click
import typingsSlinky.ezPlus.ezPlusStrings.crosshair
import typingsSlinky.ezPlus.ezPlusStrings.cursor
import typingsSlinky.ezPlus.ezPlusStrings.default
import typingsSlinky.ezPlus.ezPlusStrings.height
import typingsSlinky.ezPlus.ezPlusStrings.hover
import typingsSlinky.ezPlus.ezPlusStrings.inner
import typingsSlinky.ezPlus.ezPlusStrings.lens
import typingsSlinky.ezPlus.ezPlusStrings.round
import typingsSlinky.ezPlus.ezPlusStrings.square
import typingsSlinky.ezPlus.ezPlusStrings.width
import typingsSlinky.ezPlus.ezPlusStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Attribute to plugin use for zoom
    */
  var attrImageZoomSrc: js.UndefOr[String] = js.native
  /**
    * Border Colour
    */
  var borderColour: js.UndefOr[String] = js.native
  /**
    * Border Size of the ZoomBox
    */
  var borderSize: js.UndefOr[Double] = js.native
  /**
    * In pixels the dimensions you want to constrain on
    */
  var constrainSize: js.UndefOr[Double | `false`] = js.native
  var constrainType: js.UndefOr[width | height] = js.native
  var containLensZoom: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[String] = js.native
  /**
    * Type of cursor
    */
  var cursor: js.UndefOr[default | typingsSlinky.ezPlus.ezPlusStrings.cursor | crosshair] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Activate easing
    */
  var easing: js.UndefOr[Boolean] = js.native
  var easingAmount: js.UndefOr[Double] = js.native
  var easingDuration: js.UndefOr[Double] = js.native
  var easingType: js.UndefOr[String] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * This assigns a set of gallery links to the zoom image
    */
  var gallery: js.UndefOr[String] = js.native
  var galleryActiveClass: js.UndefOr[String] = js.native
  var galleryEvent: js.UndefOr[String] = js.native
  var galleryItem: js.UndefOr[String] = js.native
  var gallerySelector: js.UndefOr[String | `false`] = js.native
  /**
    * Activate simultaneous crossfade of images on gallery change
    */
  var imageCrossfade: js.UndefOr[Boolean] = js.native
  /**
    * Width in pixels of the lens border
    */
  var lensBorder: js.UndefOr[Double] = js.native
  /**
    * Colour of the lens background
    */
  var lensColour: js.UndefOr[String] = js.native
  /**
    * Speed of Lens fadeIn
    */
  var lensFadeIn: js.UndefOr[Double] = js.native
  /**
    * Speed of Lens fadeOut
    */
  var lensFadeOut: js.UndefOr[Double] = js.native
  /**
    * Opacity of lens
    */
  var lensOpacity: js.UndefOr[Double] = js.native
  /**
    * Type of lens
    */
  var lensShape: js.UndefOr[square | round] = js.native
  /**
    * Used when zoomType set to lens
    */
  var lensSize: js.UndefOr[Double] = js.native
  var lenszoom: js.UndefOr[Boolean] = js.native
  /**
    * Activate spinner icon or url
    */
  var loadingIcon: js.UndefOr[Boolean | String] = js.native
  var mantainZoomAspectRatio: js.UndefOr[Boolean] = js.native
  var maxZoomLevel: js.UndefOr[Double | `false`] = js.native
  var minZoomLevel: js.UndefOr[Double] = js.native
  var preloading: js.UndefOr[`0` | `1`] = js.native
  var respond: js.UndefOr[js.Array[_]] = js.native
  /**
    * Activate responsivenes
    */
  var responsive: js.UndefOr[Boolean] = js.native
  /**
    * Activate zoom on mouse scroll
    */
  var scrollZoom: js.UndefOr[Boolean] = js.native
  /**
    * Steps of the scrollzoom
    */
  var scrollZoomIncrement: js.UndefOr[Double] = js.native
  /**
    * Enable a tint overlay
    */
  var tint: js.UndefOr[Boolean] = js.native
  /**
    * Colour of the tin
    */
  var tintColour: js.UndefOr[String] = js.native
  /**
    * Opacity of the tint
    */
  var tintOpacity: js.UndefOr[Double] = js.native
  var touchEnabled: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
  var zoomActivation: js.UndefOr[click | hover] = js.native
  /**
    * Zoom container parent selector
    */
  var zoomContainerAppendTo: js.UndefOr[String] = js.native
  /**
    * Identifier for the zoom container
    */
  var zoomId: js.UndefOr[Double] = js.native
  /**
    * Enable Lens
    */
  var zoomLens: js.UndefOr[Boolean] = js.native
  /**
    * Zoom level of image
    */
  var zoomLevel: js.UndefOr[Double] = js.native
  /**
    * Speed of Tint fadeIn
    */
  var zoomTintFadeIn: js.UndefOr[Double] = js.native
  /**
    * Speed of Tint fadeOut
    */
  var zoomTintFadeOut: js.UndefOr[Double] = js.native
  /**
    * Type of zoom
    */
  var zoomType: js.UndefOr[lens | window | inner] = js.native
  /**
    * Speed of Window fadeIn
    */
  var zoomWindowFadeIn: js.UndefOr[Double] = js.native
  /**
    * Speed of Window fadeOut
    */
  var zoomWindowFadeOut: js.UndefOr[Double] = js.native
  /**
    * Height of the zoomWindow
    */
  var zoomWindowHeight: js.UndefOr[Double] = js.native
  /**
    * x-axis offset of the zoom window
    */
  var zoomWindowOffsetX: js.UndefOr[Double] = js.native
  /**
    * y-axis offset of the zoom window
    */
  var zoomWindowOffsetY: js.UndefOr[Double] = js.native
  var zoomWindowPosition: js.UndefOr[Double | String] = js.native
  /**
    * Width of the zoomWindow
    */
  var zoomWindowWidth: js.UndefOr[Double] = js.native
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
    def withAttrImageZoomSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrImageZoomSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrImageZoomSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrImageZoomSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColour(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColour")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderSize")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrainSize(value: Double | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainSize")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrainType(value: width | height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainType")(js.undefined)
        ret
    }
    @scala.inline
    def withContainLensZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containLensZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainLensZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containLensZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: default | cursor | crosshair): Self = {
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
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withEasingAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easingAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasingAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easingAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withEasingDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easingDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasingDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easingDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withEasingType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easingType")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withGallery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gallery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGallery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gallery")(js.undefined)
        ret
    }
    @scala.inline
    def withGalleryActiveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("galleryActiveClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGalleryActiveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("galleryActiveClass")(js.undefined)
        ret
    }
    @scala.inline
    def withGalleryEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("galleryEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGalleryEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("galleryEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withGalleryItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("galleryItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGalleryItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("galleryItem")(js.undefined)
        ret
    }
    @scala.inline
    def withGallerySelector(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gallerySelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGallerySelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gallerySelector")(js.undefined)
        ret
    }
    @scala.inline
    def withImageCrossfade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageCrossfade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageCrossfade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageCrossfade")(js.undefined)
        ret
    }
    @scala.inline
    def withLensBorder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lensBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLensBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lensBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withLensColour(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lensColour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLensColour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lensColour")(js.undefined)
        ret
    }
    @scala.inline
    def withLensFadeIn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lensFadeIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLensFadeIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lensFadeIn")(js.undefined)
        ret
    }
    @scala.inline
    def withLensFadeOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lensFadeOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLensFadeOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lensFadeOut")(js.undefined)
        ret
    }
    @scala.inline
    def withLensOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lensOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLensOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lensOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withLensShape(value: square | round): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lensShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLensShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lensShape")(js.undefined)
        ret
    }
    @scala.inline
    def withLensSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lensSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLensSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lensSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLenszoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lenszoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLenszoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lenszoom")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingIcon(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withMantainZoomAspectRatio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mantainZoomAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMantainZoomAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mantainZoomAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoomLevel(value: Double | `false`): Self = {
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
    def withPreloading(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloading")(js.undefined)
        ret
    }
    @scala.inline
    def withRespond(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRespond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respond")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollZoomIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollZoomIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollZoomIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollZoomIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withTint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tint")(js.undefined)
        ret
    }
    @scala.inline
    def withTintColour(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTintColour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColour")(js.undefined)
        ret
    }
    @scala.inline
    def withTintOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTintOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchEnabled")(js.undefined)
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
    def withZoomActivation(value: click | hover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomActivation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomActivation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomActivation")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomContainerAppendTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomContainerAppendTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomContainerAppendTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomContainerAppendTo")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomId")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomLens(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomLens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomLens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomLens")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomTintFadeIn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomTintFadeIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomTintFadeIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomTintFadeIn")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomTintFadeOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomTintFadeOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomTintFadeOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomTintFadeOut")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomType(value: lens | window | inner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomType")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomWindowFadeIn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomWindowFadeIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomWindowFadeIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomWindowFadeIn")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomWindowFadeOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomWindowFadeOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomWindowFadeOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomWindowFadeOut")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomWindowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomWindowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomWindowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomWindowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomWindowOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomWindowOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomWindowOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomWindowOffsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomWindowOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomWindowOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomWindowOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomWindowOffsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomWindowPosition(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomWindowPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomWindowPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomWindowPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomWindowWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomWindowWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomWindowWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomWindowWidth")(js.undefined)
        ret
    }
  }
  
}

