package typingsSlinky.royalslider.RoyalSlider

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoyalSliderOptions extends js.Object {
  /**
    * Adds rsActiveSlide class to current slide before transition. (default: false)
    */
  var addActiveClass: js.UndefOr[Boolean] = js.native
  /**
    * Allows usage of CSS3 transitions. Might be useful if you're experiencing font-rendering problems, or other CSS3-related bugs. (default: true)
    */
  var allowCSS3: js.UndefOr[Boolean] = js.native
  /**
    * Direction arrows navigation. (default: true)
    */
  var arrowsNav: js.UndefOr[Boolean] = js.native
  /**
    * Auto hide arrows. (default: true)
    */
  var arrowsNavAutoHide: js.UndefOr[Boolean] = js.native
  /**
    * Hides arrows completely on touch devices. (default: false)
    */
  var arrowsNavHideOnTouch: js.UndefOr[Boolean] = js.native
  /**
    * Scales and animates height based on current slide. Please note: if you have images in slide that don't have rsImg class) or don't have fixed size, use $(window).load() instead of $(document).ready() before initializing slider. Also, autoHeight doesn't work with properties like autoScaleSlider, imageScaleMode and imageAlignCenter.  (default: false)
    */
  var autoHeight: js.UndefOr[Boolean] = js.native
  /**
    * Automatically updates slider height based on base width. (default: false)
    */
  var autoScaleSlider: js.UndefOr[Boolean] = js.native
  /**
    * 400 Base slider height
    */
  var autoScaleSliderHeight: js.UndefOr[Double] = js.native
  /**
    * Base slider width.Slider will autocalculate the ratio based on these values. (default: 800)
    */
  var autoScaleSliderWidth: js.UndefOr[Double] = js.native
  /**
    * Autoplay slideshow can be enabled via slider options. Delay between items can be set globally via delay option, or specifically for each item by adding data-rsDelay="1000" to root element of the slide (1000 = 1sec).
    */
  var autoplay: js.UndefOr[RoyalSliderAutoplayOptions] = js.native
  /**
    * All elements inside slide that have class rsABlock will be treated by slider as animated blocks (tag name doesn't matter). Blocks can not be nested, but you can put multiple instances of them into one slide, or make slide itself animated block.
    */
  var block: js.UndefOr[RoyalSliderBlockOptions] = js.native
  /**
    * Navigation type, can be 'bullets', 'thumbnails', 'tabs' or 'none' (default: 'bullets')
    */
  var controlNavigation: js.UndefOr[String] = js.native
  /**
    *  If set to true adds arrows and fullscreen button inside rsOverflow container, otherwise inside root slider container. (default: true)
    */
  var controlsInside: js.UndefOr[Boolean] = js.native
  /**
    * Deep linking module makes URL automatically change when you switch slides and you can easily link to specific slide (aka permalink).
    */
  var deeplinking: js.UndefOr[RoyalSliderDeeplinkingOptions] = js.native
  /**
    * Easing function for simple transition.Read more in the easing section of the documentation. (default: 'easeInOutSine')
    */
  var easeInOut: js.UndefOr[String] = js.native
  /**
    * Easing function of animation after ending of the swipe gesture. Read more in the easing section of the documentation. (default: 'easeOutSine')
    */
  var easeOut: js.UndefOr[String] = js.native
  /**
    * Fades in slide after it's loaded. (default: true)
    */
  var fadeinLoadedSlide: js.UndefOr[Boolean] = js.native
  /**
    * You may specify larger images when slider is in fullscreen mode by adding data-rsBigImg attribute to rsImg element. A few examples:
    */
  var fullscreen: js.UndefOr[RoyalSliderFullscreenOptions] = js.native
  /**
    * Adds global caption element to slider, read more in the global caption section of documentation. (default: false)
    */
  var globalCaption: js.UndefOr[Boolean] = js.native
  /**
    * Aligns image to center of slide. (default: true)
    */
  var imageAlignCenter: js.UndefOr[Boolean] = js.native
  /**
    * Scale mode for images."fill", "fit", "fit-if-smaller" or "none". (default: 'fit-if-smaller')
    */
  var imageScaleMode: js.UndefOr[String] = js.native
  /**
    * Distance between image and edge of slide (doesn't work with 'fill' scale mode). (default: 4)
    */
  var imageScalePadding: js.UndefOr[Double] = js.native
  /**
    * Adds base height to all images for better-looking loading. Can be specified separately for each image. (default: null)
    */
  var imgHeight: js.UndefOr[Double] = js.native
  /**
    * Adds base width to all images for better-looking loading. Can be specified separately for each image. (default: null)
    */
  var imgWidth: js.UndefOr[Double] = js.native
  /**
    * Navigate slider with keyboard left and right arrows. (default: false)
    */
  var keyboardNavEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Makes slider to go from last slide to first. (default: false)
    */
  var loop: js.UndefOr[Boolean] = js.native
  /**
    * Makes slider to go from last slide to first with rewind. Overrides prev option. (default: false)
    */
  var loopRewind: js.UndefOr[Boolean] = js.native
  /**
    * Minimum distance in pixels to show next slide while dragging. (default: 10)
    */
  var minSlideOffset: js.UndefOr[Double] = js.native
  /**
    * Navigates forward by clicking on slide. (default: true)
    */
  var navigateByClick: js.UndefOr[Boolean] = js.native
  /**
    * Number of slides to preload on sides.If you set it to 0, only one slide will be kept in the display list at once. (default: 4)
    */
  var numImagesToPreload: js.UndefOr[Double] = js.native
  /**
    * Randomizes all slides at start. (default: false)
    */
  var randomizeSlides: js.UndefOr[Boolean] = js.native
  /**
    * Mouse drag navigation over slider. (default: true)
    */
  var sliderDrag: js.UndefOr[Boolean] = js.native
  /**
    * Touch navigation of slider. (default: true)
    */
  var sliderTouch: js.UndefOr[Boolean] = js.native
  // false
  /**
    * Overrides HTML of slides, used for creating of slides from HTML that is not attached to DOM. More info in knowledge base.  (default: null)
    */
  var slides: js.UndefOr[Element] = js.native
  /**
    * Can be 'vertical' or 'horizontal'. (default: 'horizontal')
    */
  var slidesOrientation: js.UndefOr[String] = js.native
  /**
    * Spacing between slides in pixels. (default: 8)
    */
  var slidesSpacing: js.UndefOr[Double] = js.native
  /**
    * Start slide index. (default: 0)
    */
  var startSlideId: js.UndefOr[Double] = js.native
  /**
    * Thumbnail options
    */
  var thumbs: js.UndefOr[RoyalSliderThumbsOptions] = js.native
  /**
    * Slider transition speed, in ms. (default: 600)
    */
  var transitionSpeed: js.UndefOr[Double] = js.native
  /**
    * 'move' or 'fade'. Important note about fade transition, slides must have background as only one image is animating. (default: 'move')
    */
  var transitionType: js.UndefOr[String] = js.native
  /**
    * Enables spinning preloader, you may style it via CSS (class rsPreloader). (default: true)
    */
  var usePreloader: js.UndefOr[Boolean] = js.native
  /**
    * To add video to slide, you need to add data-rsVideo="" attribute to image. It can contain link to YouTube or Vimeo video.
    */
  var video: js.UndefOr[RoyalSliderVideoOptions] = js.native
  /**
    * Module "reveals" next and previous slides, like in this template.
    */
  var visibleNearby: js.UndefOr[RoyalSliderVisibleOptions] = js.native
}

object RoyalSliderOptions {
  @scala.inline
  def apply(): RoyalSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoyalSliderOptions]
  }
  @scala.inline
  implicit class RoyalSliderOptionsOps[Self <: RoyalSliderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddActiveClass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addActiveClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddActiveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addActiveClass")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowCSS3(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCSS3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCSS3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCSS3")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowsNav(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowsNav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowsNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowsNav")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowsNavAutoHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowsNavAutoHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowsNavAutoHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowsNavAutoHide")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowsNavHideOnTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowsNavHideOnTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowsNavHideOnTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowsNavHideOnTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScaleSlider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScaleSlider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScaleSlider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScaleSlider")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScaleSliderHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScaleSliderHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScaleSliderHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScaleSliderHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScaleSliderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScaleSliderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScaleSliderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScaleSliderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplay(value: RoyalSliderAutoplayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
    @scala.inline
    def withBlock(value: RoyalSliderBlockOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(js.undefined)
        ret
    }
    @scala.inline
    def withControlNavigation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withControlsInside(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsInside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlsInside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsInside")(js.undefined)
        ret
    }
    @scala.inline
    def withDeeplinking(value: RoyalSliderDeeplinkingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deeplinking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeeplinking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deeplinking")(js.undefined)
        ret
    }
    @scala.inline
    def withEaseInOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEaseInOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInOut")(js.undefined)
        ret
    }
    @scala.inline
    def withEaseOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEaseOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeOut")(js.undefined)
        ret
    }
    @scala.inline
    def withFadeinLoadedSlide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeinLoadedSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeinLoadedSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeinLoadedSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreen(value: RoyalSliderFullscreenOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalCaption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalCaption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalCaption")(js.undefined)
        ret
    }
    @scala.inline
    def withImageAlignCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageAlignCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageAlignCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageAlignCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withImageScaleMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageScaleMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageScaleMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageScaleMode")(js.undefined)
        ret
    }
    @scala.inline
    def withImageScalePadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageScalePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageScalePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageScalePadding")(js.undefined)
        ret
    }
    @scala.inline
    def withImgHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImgHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withImgWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImgWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardNavEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardNavEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardNavEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardNavEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withLoopRewind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopRewind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoopRewind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopRewind")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSlideOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSlideOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSlideOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSlideOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigateByClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateByClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigateByClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateByClick")(js.undefined)
        ret
    }
    @scala.inline
    def withNumImagesToPreload(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numImagesToPreload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumImagesToPreload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numImagesToPreload")(js.undefined)
        ret
    }
    @scala.inline
    def withRandomizeSlides(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomizeSlides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandomizeSlides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomizeSlides")(js.undefined)
        ret
    }
    @scala.inline
    def withSliderDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliderDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withSliderTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliderTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withSlides(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slides")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidesOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidesOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidesSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidesSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withStartSlideId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startSlideId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartSlideId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startSlideId")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbs(value: RoyalSliderThumbsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbs")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionType")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePreloader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePreloader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePreloader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePreloader")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo(value: RoyalSliderVideoOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleNearby(value: RoyalSliderVisibleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleNearby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleNearby: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleNearby")(js.undefined)
        ret
    }
  }
  
}

