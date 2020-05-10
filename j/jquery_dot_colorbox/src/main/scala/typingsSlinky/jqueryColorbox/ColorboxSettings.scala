package typingsSlinky.jqueryColorbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorboxSettings extends js.Object {
  /**
    * This property isn't actually used as Colorbox assumes all hrefs should be treated as either ajax or photos, unless one of the other content types were specified.
    */
  var ajax: js.UndefOr[js.Any] = js.native
  /**
    * If false, will disable the left and right arrow keys from navigating between the items in a group.
    */
  var arrowKey: js.UndefOr[Boolean] = js.native
  /**
    * Accepts a pixel or percent value (50, "50px", "10%"). Controls Colorbox's vertical positioning instead of using the default position of being centered in the viewport.
    */
  var bottom: js.UndefOr[js.Any] = js.native
  /**
    * Adds a given class to colorbox and the overlay.
    */
  var className: js.UndefOr[js.Any] = js.native
  /**
    * Text or HTML for the close button. The 'esc' key will also close Colorbox.
    */
  var close: js.UndefOr[String] = js.native
  /**
    * Set to false to remove the close button.
    */
  var closeButton: js.UndefOr[Boolean] = js.native
  /**
    * Text or HTML for the group counter while viewing a group. {current} and {total} are detected and replaced with actual numbers while Colorbox runs.
    */
  var current: js.UndefOr[String] = js.native
  /**
    * For submitting GET or POST values through an ajax request. The data property will act exactly like jQuery's .load() data argument, as Colorbox uses .load() for ajax handling.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * If false, will disable closing colorbox on 'esc' key press.
    */
  var escKey: js.UndefOr[Boolean] = js.native
  /**
    * Sets the fadeOut speed, in milliseconds, when closing Colorbox.
    */
  var fadeOut: js.UndefOr[Double] = js.native
  /**
    * If false, the loading graphic removal and onComplete event will be delayed until iframe's content has completely loaded.
    */
  var fastIframe: js.UndefOr[Boolean] = js.native
  /**
    * If true, Colorbox will be displayed in a fixed position within the visitor's viewport. This is unlike the default absolute positioning relative to the document.
    */
  var fixed: js.UndefOr[Boolean] = js.native
  /**
    * Set a fixed total height. This includes borders and buttons. Example: "100%", "500px", or 500
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * This can be used as an alternative anchor URL or to associate a URL for non-anchor elements such as images or form buttons.
    */
  var href: js.UndefOr[js.Any] = js.native
  /**
    * For displaying a string of HTML or text: $.colorbox({html:"<p>Hello</p>"});
    */
  var html: js.UndefOr[js.Any] = js.native
  /**
    * If true, specifies that content should be displayed in an iFrame.
    */
  var iframe: js.UndefOr[Boolean] = js.native
  /**
    * Error message given when a link to an image fails to load.
    */
  var imgError: js.UndefOr[String] = js.native
  /**
    * Set the initial height, prior to any content being loaded.
    */
  var initialHeight: js.UndefOr[Double | String] = js.native
  /**
    * Set the initial width, prior to any content being loaded.
    */
  var initialWidth: js.UndefOr[Double | String] = js.native
  /**
    * If true, content from the current document can be displayed by passing the href property a jQuery selector, or jQuery object.
    */
  var `inline`: js.UndefOr[Boolean] = js.native
  /**
    * This is an alternative to 'height' used to set a fixed inner height. This excludes borders and buttons. Example: "50%", "500px", or 500
    */
  var innerHeight: js.UndefOr[Double | String] = js.native
  /**
    * This is an alternative to 'width' used to set a fixed inner width. This excludes borders and buttons. Example: "50%", "500px", or 500
    */
  var innerWidth: js.UndefOr[Double | String] = js.native
  /**
    * Accepts a pixel or percent value (50, "50px", "10%"). Controls Colorbox's horizontal positioning instead of using the default position of being centered in the viewport.
    */
  var left: js.UndefOr[js.Any] = js.native
  /**
    * If false, will disable the ability to loop back to the beginning of the group when on the last element.
    */
  var loop: js.UndefOr[Boolean] = js.native
  /**
    * Set a maximum height for loaded content. Example: "100%", 500, "500px"
    */
  var maxHeight: js.UndefOr[Double | String] = js.native
  /**
    * Set a maximum width for loaded content. Example: "100%", 500, "500px"
    */
  var maxWidth: js.UndefOr[Double | String] = js.native
  /**
    * Text or HTML for the next button while viewing a group.
    */
  var next: js.UndefOr[String] = js.native
  /**
    * Callback that fires at the start of the close process.
    */
  var onCleanup: js.UndefOr[js.Any] = js.native
  /**
    * Callback that fires once Colorbox is closed.
    */
  var onClosed: js.UndefOr[js.Any] = js.native
  /**
    * Callback that fires right after loaded content is displayed.
    */
  var onComplete: js.UndefOr[js.Any] = js.native
  /**
    * Callback that fires right before attempting to load the target content.
    */
  var onLoad: js.UndefOr[js.Any] = js.native
  /**
    * Callback that fires right before Colorbox begins to open.
    */
  var onOpen: js.UndefOr[js.Any] = js.native
  /**
    * The overlay opacity level. Range: 0 to 1.
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * If true, Colorbox will immediately open.
    */
  var open: js.UndefOr[Boolean] = js.native
  /**
    * If false, disables closing Colorbox by clicking on the background overlay.
    */
  var overlayClose: js.UndefOr[Boolean] = js.native
  /**
    * If true, this setting forces Colorbox to display a link as a photo. Use this when automatic photo detection fails (such as using a url like 'photo.php' instead of 'photo.jpg')
    */
  var photo: js.UndefOr[Boolean] = js.native
  /**
    * Allows for preloading of 'Next' and 'Previous' content in a group, after the current content has finished loading. Set to false to disable.
    */
  var preloading: js.UndefOr[Boolean] = js.native
  /**
    * Text or HTML for the previous button while viewing a group.
    */
  var previous: js.UndefOr[String] = js.native
  /**
    * This can be used as an anchor rel alternative for Colorbox.
    */
  var rel: js.UndefOr[js.Any] = js.native
  /**
    * Repositions Colorbox if the window's resize event is fired.
    */
  var reposition: js.UndefOr[Boolean] = js.native
  /**
    * If true, Colorbox will scale down the current photo to match the screen's pixel ratio
    */
  var retinaImage: js.UndefOr[Boolean] = js.native
  /**
    * If retinaUrl is true and the device has a high resolution display, the href value will have it's extention extended with this suffix. For example, the default value would change `my-photo.jpg` to `my-photo@2x.jpg`
    */
  var retinaSuffix: js.UndefOr[String] = js.native
  /**
    * If true and the device has a high resolution display, Colorbox will replace the current photo's file extention with the retinaSuffix+extension
    */
  var retinaUrl: js.UndefOr[Boolean] = js.native
  /**
    * If true, focus will be returned when Colorbox exits to the element it was launched from.
    */
  var returnFocus: js.UndefOr[Boolean] = js.native
  /**
    * Accepts a pixel or percent value (50, "50px", "10%"). Controls Colorbox's horizontal positioning instead of using the default position of being centered in the viewport.
    */
  var right: js.UndefOr[js.Any] = js.native
  /**
    * If true, and if maxWidth, maxHeight, innerWidth, innerHeight, width, or height have been defined, Colorbox will scale photos to fit within the those values.
    */
  var scalePhotos: js.UndefOr[Boolean] = js.native
  /**
    * If false, Colorbox will hide scrollbars for overflowing content.
    */
  var scrolling: js.UndefOr[Boolean] = js.native
  /**
    * If true, adds an automatic slideshow to a content group / gallery.
    */
  var slideshow: js.UndefOr[Boolean] = js.native
  /**
    * If true, the slideshow will automatically start to play.
    */
  var slideshowAuto: js.UndefOr[Boolean] = js.native
  /**
    * Sets the speed of the slideshow, in milliseconds.
    */
  var slideshowSpeed: js.UndefOr[Double] = js.native
  /**
    * Text for the slideshow start button.
    */
  var slideshowStart: js.UndefOr[String] = js.native
  /**
    * Text for the slideshow stop button
    */
  var slideshowStop: js.UndefOr[String] = js.native
  /**
    * Sets the speed of the fade and elastic transitions, in milliseconds.
    */
  var speed: js.UndefOr[Double] = js.native
  /**
    * This can be used as an anchor title alternative for Colorbox.
    */
  var title: js.UndefOr[js.Any] = js.native
  /**
    * Accepts a pixel or percent value (50, "50px", "10%"). Controls Colorbox's vertical positioning instead of using the default position of being centered in the viewport.
    */
  var top: js.UndefOr[js.Any] = js.native
  /**
    * The transition type. Can be set to "elastic", "fade", or "none".
    */
  var transition: js.UndefOr[String] = js.native
  /**
    * Set a fixed total width. This includes borders and buttons. Example: "100%", "500px", or 500
    */
  var width: js.UndefOr[Double | String] = js.native
  /**
    * Error message given when ajax content for a given URL cannot be loaded.
    */
  var xhrError: js.UndefOr[String] = js.native
}

object ColorboxSettings {
  @scala.inline
  def apply(): ColorboxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorboxSettings]
  }
  @scala.inline
  implicit class ColorboxSettingsOps[Self <: ColorboxSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAjax(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajax")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowKey")(js.undefined)
        ret
    }
    @scala.inline
    def withBottom(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: js.Any): Self = {
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
    def withClose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButton")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withEscKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escKey")(js.undefined)
        ret
    }
    @scala.inline
    def withFadeOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeOut")(js.undefined)
        ret
    }
    @scala.inline
    def withFastIframe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastIframe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFastIframe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastIframe")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
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
    def withHref(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withIframe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIframe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframe")(js.undefined)
        ret
    }
    @scala.inline
    def withImgError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImgError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgError")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
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
    def withMaxHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withNext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCleanup(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCleanup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCleanup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCleanup")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClosed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComplete(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
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
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayClose")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloading(value: Boolean): Self = {
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
    def withPrevious(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevious: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(js.undefined)
        ret
    }
    @scala.inline
    def withRel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rel")(js.undefined)
        ret
    }
    @scala.inline
    def withReposition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reposition")(js.undefined)
        ret
    }
    @scala.inline
    def withRetinaImage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retinaImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetinaImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retinaImage")(js.undefined)
        ret
    }
    @scala.inline
    def withRetinaSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retinaSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetinaSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retinaSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withRetinaUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retinaUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetinaUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retinaUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withScalePhotos(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalePhotos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalePhotos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalePhotos")(js.undefined)
        ret
    }
    @scala.inline
    def withScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideshow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideshow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideshow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideshow")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideshowAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideshowAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideshowAuto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideshowAuto")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideshowSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideshowSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideshowSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideshowSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideshowStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideshowStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideshowStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideshowStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideshowStop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideshowStop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideshowStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideshowStop")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
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
    def withXhrError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhrError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXhrError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhrError")(js.undefined)
        ret
    }
  }
  
}

