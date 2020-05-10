package typingsSlinky.fancybox

import typingsSlinky.fancybox.fancyboxBooleans.`false`
import typingsSlinky.fancybox.fancyboxStrings.`inline`
import typingsSlinky.fancybox.fancyboxStrings.`zoom-in-out`
import typingsSlinky.fancybox.fancyboxStrings.ajax
import typingsSlinky.fancybox.fancyboxStrings.auto
import typingsSlinky.fancybox.fancyboxStrings.circular
import typingsSlinky.fancybox.fancyboxStrings.close
import typingsSlinky.fancybox.fancyboxStrings.download
import typingsSlinky.fancybox.fancyboxStrings.fade
import typingsSlinky.fancybox.fancyboxStrings.fullScreen
import typingsSlinky.fancybox.fancyboxStrings.html
import typingsSlinky.fancybox.fancyboxStrings.iframe
import typingsSlinky.fancybox.fancyboxStrings.image
import typingsSlinky.fancybox.fancyboxStrings.rotate
import typingsSlinky.fancybox.fancyboxStrings.share
import typingsSlinky.fancybox.fancyboxStrings.slide
import typingsSlinky.fancybox.fancyboxStrings.slideShow
import typingsSlinky.fancybox.fancyboxStrings.thumbs
import typingsSlinky.fancybox.fancyboxStrings.tube
import typingsSlinky.fancybox.fancyboxStrings.zoom
import typingsSlinky.jquery.JQuery_.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancyBoxOptions extends js.Object {
  /**
    * After instance has been closed
    */
  var afterClose: js.UndefOr[js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, Unit]] = js.native
  /**
    * When the content of a slide is done loading
    */
  var afterLoad: js.UndefOr[js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, Unit]] = js.native
  /**
    * When content is done loading and animating
    */
  var afterShow: js.UndefOr[js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, Unit]] = js.native
  var ajax: js.UndefOr[FancyBoxAjaxOption] = js.native
  /**
    * Duration in ms for open/close animation
    */
  var animationDuration: js.UndefOr[Double] = js.native
  /**
    * Open/close animation type
    * Possible values:
    * false                    - disable
    * "zoom"               - zoom images from/to thumbnail
    * "fade"
    * "zoom-in-out"
    */
  var animationEffect: js.UndefOr[Boolean | zoom | fade | `zoom-in-out`] = js.native
  /**
    * Should display navigation arrows at the screen edges
    */
  var arrows: js.UndefOr[Boolean] = js.native
  /**
    * Try to focus on the first focusable element after opening
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
  /**
    * Put focus back to active element after closing
    */
  var backFocus: js.UndefOr[Boolean] = js.native
  /**
    * Custom CSS class for layout
    */
  var baseClass: js.UndefOr[String] = js.native
  /**
    * Base template for layout
    */
  var baseTpl: js.UndefOr[String] = js.native
  /**
    * Before the instance attempts to close. Return false to cancel the close.
    */
  var beforeClose: js.UndefOr[js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, Unit]] = js.native
  /**
    * Before the content of a slide is being loaded
    */
  var beforeLoad: js.UndefOr[js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, Unit]] = js.native
  /**
    * Before open animation starts
    */
  var beforeShow: js.UndefOr[js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, Unit]] = js.native
  /**
    * Button templates
    */
  var btnTpl: js.UndefOr[FancyBoxButtonTemplateOptions] = js.native
  /**
    * What buttons should appear in the top right corner.
    * Buttons will be created using templates from `btnTpl` option
    * and they will be placed into toolbar (class="fancybox-toolbar"` element)
    */
  var buttons: js.UndefOr[js.Array[zoom | share | slideShow | fullScreen | download | thumbs | close]] = js.native
  var caption: js.UndefOr[
    String | (js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, String])
  ] = js.native
  /**
    * Clicked on the content
    */
  var clickContent: js.UndefOr[FancyBoxInteractions] = js.native
  /**
    * Clicked on the background (backdrop) element;
    * if you have not changed the layout, then most likely you need to use `clickSlide` option
    */
  var clickOutside: js.UndefOr[FancyBoxInteractions] = js.native
  /**
    * Clicked on the slide
    */
  var clickSlide: js.UndefOr[FancyBoxInteractions] = js.native
  /**
    * Close existing modals
    * Set this to false if you do not need to stack multiple instances
    */
  var closeExisting: js.UndefOr[Boolean] = js.native
  /**
    * Same as previous two, but for double click
    */
  var dblclickContent: js.UndefOr[FancyBoxInteractions] = js.native
  /**
    * Same as previous two, but for double click
    */
  var dblclickOutside: js.UndefOr[FancyBoxInteractions] = js.native
  /**
    * Same as previous two, but for double click
    */
  var dblclickSlide: js.UndefOr[FancyBoxInteractions] = js.native
  /**
    * Default content type if cannot be detected automatically
    */
  var defaultType: js.UndefOr[image | `inline` | ajax | iframe | html] = js.native
  /**
    * Error message template
    */
  var errorTpl: js.UndefOr[String] = js.native
  var fullScreen: js.UndefOr[AnonAutostart] = js.native
  /**
    * Horizontal space between slides
    */
  var gutter: js.UndefOr[Double] = js.native
  /**
    * Hash value when initializing manually,
    * set `false` to disable hash change
    */
  var hash: js.UndefOr[js.Any] = js.native
  /**
    * Hide browser vertical scrollbars; use at your own risk
    */
  var hideScrollbar: js.UndefOr[Boolean] = js.native
  var i18n: js.UndefOr[FancyBoxInternationalizationOptions] = js.native
  /**
    * Detect "idle" time in seconds
    */
  var idleTime: js.UndefOr[Double] = js.native
  var iframe: js.UndefOr[FancyBoxIframeSettings] = js.native
  var image: js.UndefOr[FancyBoxImageOption] = js.native
  /**
    * Should display counter at the top left corner
    */
  var infobar: js.UndefOr[Boolean] = js.native
  /**
    * Enable keyboard navigation
    */
  var keyboard: js.UndefOr[Boolean] = js.native
  var lang: js.UndefOr[String] = js.native
  /**
    * Enable infinite gallery navigation
    */
  var loop: js.UndefOr[Boolean] = js.native
  /**
    * Customize or add new media types
    * Example:
    * media : {
    *   youtube : {
    *     params : {
    *       autoplay : 0
    *     }
    *   }
    * }
    */
  var media: js.UndefOr[FancyBoxPlainObject] = js.native
  /**
    * Shortcut to make content "modal" - disable keyboard navigtion, hide buttons, etc
    */
  var modal: js.UndefOr[Boolean] = js.native
  /**
    * When instance is brought to front
    */
  var onActivate: js.UndefOr[js.Function1[/* instance */ FancyBoxInstance, Unit]] = js.native
  /**
    * When other instance has been activated
    */
  var onDeactivate: js.UndefOr[js.Function1[/* instance */ FancyBoxInstance, Unit]] = js.native
  /**
    * When instance has been initialized
    */
  var onInit: js.UndefOr[js.Function1[/* instance */ FancyBoxInstance, Unit]] = js.native
  /**
    * Container is injected into this element
    */
  var parentEl: js.UndefOr[String] = js.native
  /**
    * Should allow caption to overlap the content
    */
  var preventCaptionOverlap: js.UndefOr[Boolean] = js.native
  /**
    * Disable right-click and use simple image protection for images
    */
  var protect: js.UndefOr[Boolean] = js.native
  /**
    * Custom CSS class for slide element
    */
  var slideClass: js.UndefOr[String] = js.native
  var slideShow: js.UndefOr[AnonAutoStart_] = js.native
  /**
    * Should display close button (using `btnTpl.smallBtn` template) over the content
    * Can be true, false, "auto"
    * If "auto" - will be automatically enabled for "html", "inline" or "ajax" items
    */
  var smallBtn: js.UndefOr[Boolean | auto] = js.native
  /**
    * Loading indicator template
    */
  var spinnerTpl: js.UndefOr[String] = js.native
  var thumbs: js.UndefOr[FancyThumbsOptions] = js.native
  /**
    * Should display toolbar (buttons at the top)
    * Can be true, false, "auto"
    * If "auto" - will be automatically hidden if "smallBtn" is enabled
    */
  var toolbar: js.UndefOr[Boolean | auto] = js.native
  /**
    * Set `touch: false` to disable panning/swiping
    */
  var touch: js.UndefOr[FancyBoxTouchOptions | `false`] = js.native
  /**
    * Duration in ms for transition animation
    */
  var transitionDuration: js.UndefOr[Double] = js.native
  /**
    * Transition effect between slides
    * Possible values:
    * false
    * "fade"
    * "slide"
    * "circular"
    * "tube"
    * "zoom-in-out"
    * "rotate"
    */
  var transitionEffect: js.UndefOr[fade | slide | circular | tube | `zoom-in-out` | rotate | Boolean] = js.native
  /**
    * Do not let user to focus on element outside modal content
    */
  var trapFocus: js.UndefOr[Boolean] = js.native
  /**
    * For HTML5 video only
    */
  var video: js.UndefOr[FancyBoxVideoOptions] = js.native
  /**
    * Use mousewheel to navigate gallery
    * If 'auto' - enabled for images only
    */
  var wheel: js.UndefOr[auto | `false`] = js.native
  /**
    * Should image change opacity while zooming
    * If opacity is "auto", then opacity will be changed if image and thumbnail have different aspect ratios
    */
  var zoomOpacity: js.UndefOr[auto | Boolean] = js.native
}

object FancyBoxOptions {
  @scala.inline
  def apply(): FancyBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyBoxOptions]
  }
  @scala.inline
  implicit class FancyBoxOptionsOps[Self <: FancyBoxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterClose(value: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterClose")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterClose")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterLoad(value: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLoad")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterShow(value: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterShow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterShow")(js.undefined)
        ret
    }
    @scala.inline
    def withAjax(value: FancyBoxAjaxOption): Self = {
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
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationEffect(value: Boolean | zoom | fade | `zoom-in-out`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEffect")(js.undefined)
        ret
    }
    @scala.inline
    def withArrows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withBackFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseClass")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseTpl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeClose(value: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeClose")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeClose")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeLoad(value: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLoad")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeShow(value: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShow")(js.undefined)
        ret
    }
    @scala.inline
    def withBtnTpl(value: FancyBoxButtonTemplateOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withButtons(value: js.Array[zoom | share | slideShow | fullScreen | download | thumbs | close]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptionFunction2(value: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCaption(
      value: String | (js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, String])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withClickContentFunction2(
      value: (/* slide */ js.UndefOr[FancyBoxSlide], /* event */ js.UndefOr[Event]) => FancyBoxInteractionTypes
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickContent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClickContent(value: FancyBoxInteractions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickContent")(js.undefined)
        ret
    }
    @scala.inline
    def withClickOutsideFunction2(
      value: (/* slide */ js.UndefOr[FancyBoxSlide], /* event */ js.UndefOr[Event]) => FancyBoxInteractionTypes
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickOutside")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClickOutside(value: FancyBoxInteractions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickOutside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickOutside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickOutside")(js.undefined)
        ret
    }
    @scala.inline
    def withClickSlideFunction2(
      value: (/* slide */ js.UndefOr[FancyBoxSlide], /* event */ js.UndefOr[Event]) => FancyBoxInteractionTypes
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickSlide")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClickSlide(value: FancyBoxInteractions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseExisting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeExisting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseExisting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeExisting")(js.undefined)
        ret
    }
    @scala.inline
    def withDblclickContentFunction2(
      value: (/* slide */ js.UndefOr[FancyBoxSlide], /* event */ js.UndefOr[Event]) => FancyBoxInteractionTypes
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclickContent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDblclickContent(value: FancyBoxInteractions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclickContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDblclickContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclickContent")(js.undefined)
        ret
    }
    @scala.inline
    def withDblclickOutsideFunction2(
      value: (/* slide */ js.UndefOr[FancyBoxSlide], /* event */ js.UndefOr[Event]) => FancyBoxInteractionTypes
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclickOutside")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDblclickOutside(value: FancyBoxInteractions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclickOutside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDblclickOutside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclickOutside")(js.undefined)
        ret
    }
    @scala.inline
    def withDblclickSlideFunction2(
      value: (/* slide */ js.UndefOr[FancyBoxSlide], /* event */ js.UndefOr[Event]) => FancyBoxInteractionTypes
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclickSlide")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDblclickSlide(value: FancyBoxInteractions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclickSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDblclickSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclickSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultType(value: image | `inline` | ajax | iframe | html): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultType")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorTpl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withFullScreen(value: AnonAutostart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withGutter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(js.undefined)
        ret
    }
    @scala.inline
    def withHash(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withHideScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideScrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withI18n(value: FancyBoxInternationalizationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI18n: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(js.undefined)
        ret
    }
    @scala.inline
    def withIdleTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdleTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleTime")(js.undefined)
        ret
    }
    @scala.inline
    def withIframe(value: FancyBoxIframeSettings): Self = {
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
    def withImage(value: FancyBoxImageOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withInfobar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infobar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfobar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infobar")(js.undefined)
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
    def withMedia(value: FancyBoxPlainObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.undefined)
        ret
    }
    @scala.inline
    def withModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(js.undefined)
        ret
    }
    @scala.inline
    def withOnActivate(value: /* instance */ FancyBoxInstance => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDeactivate(value: /* instance */ FancyBoxInstance => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeactivate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDeactivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeactivate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInit(value: /* instance */ FancyBoxInstance => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.undefined)
        ret
    }
    @scala.inline
    def withParentEl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentEl")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventCaptionOverlap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventCaptionOverlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventCaptionOverlap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventCaptionOverlap")(js.undefined)
        ret
    }
    @scala.inline
    def withProtect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protect")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideShow(value: AnonAutoStart_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideShow")(js.undefined)
        ret
    }
    @scala.inline
    def withSmallBtn(value: Boolean | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmallBtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallBtn")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinnerTpl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinnerTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbs(value: FancyThumbsOptions): Self = {
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
    def withToolbar(value: Boolean | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withTouch(value: FancyBoxTouchOptions | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionEffect(value: fade | slide | circular | tube | `zoom-in-out` | rotate | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEffect")(js.undefined)
        ret
    }
    @scala.inline
    def withTrapFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trapFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrapFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trapFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo(value: FancyBoxVideoOptions): Self = {
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
    def withWheel(value: auto | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheel")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomOpacity(value: auto | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOpacity")(js.undefined)
        ret
    }
  }
  
}

