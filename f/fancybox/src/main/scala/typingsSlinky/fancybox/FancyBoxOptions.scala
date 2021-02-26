package typingsSlinky.fancybox

import typingsSlinky.fancybox.anon.AutoStart_
import typingsSlinky.fancybox.anon.Autostart
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
import typingsSlinky.jquery.JQuery.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyBoxOptions extends StObject {
  
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
  
  var fullScreen: js.UndefOr[Autostart] = js.native
  
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
  
  var slideShow: js.UndefOr[AutoStart_] = js.native
  
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
  implicit class FancyBoxOptionsMutableBuilder[Self <: FancyBoxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterClose(value: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
    
    @scala.inline
    def setAfterLoad(value: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit): Self = StObject.set(x, "afterLoad", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterLoadUndefined: Self = StObject.set(x, "afterLoad", js.undefined)
    
    @scala.inline
    def setAfterShow(value: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit): Self = StObject.set(x, "afterShow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterShowUndefined: Self = StObject.set(x, "afterShow", js.undefined)
    
    @scala.inline
    def setAjax(value: FancyBoxAjaxOption): Self = StObject.set(x, "ajax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAjaxUndefined: Self = StObject.set(x, "ajax", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationEffect(value: Boolean | zoom | fade | `zoom-in-out`): Self = StObject.set(x, "animationEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationEffectUndefined: Self = StObject.set(x, "animationEffect", js.undefined)
    
    @scala.inline
    def setArrows(value: Boolean): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setBackFocus(value: Boolean): Self = StObject.set(x, "backFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackFocusUndefined: Self = StObject.set(x, "backFocus", js.undefined)
    
    @scala.inline
    def setBaseClass(value: String): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseClassUndefined: Self = StObject.set(x, "baseClass", js.undefined)
    
    @scala.inline
    def setBaseTpl(value: String): Self = StObject.set(x, "baseTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseTplUndefined: Self = StObject.set(x, "baseTpl", js.undefined)
    
    @scala.inline
    def setBeforeClose(value: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit): Self = StObject.set(x, "beforeClose", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
    
    @scala.inline
    def setBeforeLoad(value: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit): Self = StObject.set(x, "beforeLoad", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeLoadUndefined: Self = StObject.set(x, "beforeLoad", js.undefined)
    
    @scala.inline
    def setBeforeShow(value: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit): Self = StObject.set(x, "beforeShow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeShowUndefined: Self = StObject.set(x, "beforeShow", js.undefined)
    
    @scala.inline
    def setBtnTpl(value: FancyBoxButtonTemplateOptions): Self = StObject.set(x, "btnTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBtnTplUndefined: Self = StObject.set(x, "btnTpl", js.undefined)
    
    @scala.inline
    def setButtons(value: js.Array[zoom | share | slideShow | fullScreen | download | thumbs | close]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: (zoom | share | slideShow | fullScreen | download | thumbs | close)*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setCaption(
      value: String | (js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, String])
    ): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionFunction2(value: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => String): Self = StObject.set(x, "caption", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setClickContent(value: FancyBoxInteractions): Self = StObject.set(x, "clickContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickContentFunction2(
      value: (/* slide */ js.UndefOr[FancyBoxSlide], /* event */ js.UndefOr[Event]) => FancyBoxInteractionTypes
    ): Self = StObject.set(x, "clickContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClickContentUndefined: Self = StObject.set(x, "clickContent", js.undefined)
    
    @scala.inline
    def setClickOutside(value: FancyBoxInteractions): Self = StObject.set(x, "clickOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickOutsideFunction2(
      value: (/* slide */ js.UndefOr[FancyBoxSlide], /* event */ js.UndefOr[Event]) => FancyBoxInteractionTypes
    ): Self = StObject.set(x, "clickOutside", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClickOutsideUndefined: Self = StObject.set(x, "clickOutside", js.undefined)
    
    @scala.inline
    def setClickSlide(value: FancyBoxInteractions): Self = StObject.set(x, "clickSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickSlideFunction2(
      value: (/* slide */ js.UndefOr[FancyBoxSlide], /* event */ js.UndefOr[Event]) => FancyBoxInteractionTypes
    ): Self = StObject.set(x, "clickSlide", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClickSlideUndefined: Self = StObject.set(x, "clickSlide", js.undefined)
    
    @scala.inline
    def setCloseExisting(value: Boolean): Self = StObject.set(x, "closeExisting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseExistingUndefined: Self = StObject.set(x, "closeExisting", js.undefined)
    
    @scala.inline
    def setDblclickContent(value: FancyBoxInteractions): Self = StObject.set(x, "dblclickContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclickContentFunction2(
      value: (/* slide */ js.UndefOr[FancyBoxSlide], /* event */ js.UndefOr[Event]) => FancyBoxInteractionTypes
    ): Self = StObject.set(x, "dblclickContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDblclickContentUndefined: Self = StObject.set(x, "dblclickContent", js.undefined)
    
    @scala.inline
    def setDblclickOutside(value: FancyBoxInteractions): Self = StObject.set(x, "dblclickOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclickOutsideFunction2(
      value: (/* slide */ js.UndefOr[FancyBoxSlide], /* event */ js.UndefOr[Event]) => FancyBoxInteractionTypes
    ): Self = StObject.set(x, "dblclickOutside", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDblclickOutsideUndefined: Self = StObject.set(x, "dblclickOutside", js.undefined)
    
    @scala.inline
    def setDblclickSlide(value: FancyBoxInteractions): Self = StObject.set(x, "dblclickSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclickSlideFunction2(
      value: (/* slide */ js.UndefOr[FancyBoxSlide], /* event */ js.UndefOr[Event]) => FancyBoxInteractionTypes
    ): Self = StObject.set(x, "dblclickSlide", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDblclickSlideUndefined: Self = StObject.set(x, "dblclickSlide", js.undefined)
    
    @scala.inline
    def setDefaultType(value: image | `inline` | ajax | iframe | html): Self = StObject.set(x, "defaultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTypeUndefined: Self = StObject.set(x, "defaultType", js.undefined)
    
    @scala.inline
    def setErrorTpl(value: String): Self = StObject.set(x, "errorTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorTplUndefined: Self = StObject.set(x, "errorTpl", js.undefined)
    
    @scala.inline
    def setFullScreen(value: Autostart): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
    
    @scala.inline
    def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
    
    @scala.inline
    def setHash(value: js.Any): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setHideScrollbar(value: Boolean): Self = StObject.set(x, "hideScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideScrollbarUndefined: Self = StObject.set(x, "hideScrollbar", js.undefined)
    
    @scala.inline
    def setI18n(value: FancyBoxInternationalizationOptions): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    @scala.inline
    def setIdleTime(value: Double): Self = StObject.set(x, "idleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleTimeUndefined: Self = StObject.set(x, "idleTime", js.undefined)
    
    @scala.inline
    def setIframe(value: FancyBoxIframeSettings): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIframeUndefined: Self = StObject.set(x, "iframe", js.undefined)
    
    @scala.inline
    def setImage(value: FancyBoxImageOption): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setInfobar(value: Boolean): Self = StObject.set(x, "infobar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfobarUndefined: Self = StObject.set(x, "infobar", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setMedia(value: FancyBoxPlainObject): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    @scala.inline
    def setOnActivate(value: /* instance */ FancyBoxInstance => Unit): Self = StObject.set(x, "onActivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnActivateUndefined: Self = StObject.set(x, "onActivate", js.undefined)
    
    @scala.inline
    def setOnDeactivate(value: /* instance */ FancyBoxInstance => Unit): Self = StObject.set(x, "onDeactivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDeactivateUndefined: Self = StObject.set(x, "onDeactivate", js.undefined)
    
    @scala.inline
    def setOnInit(value: /* instance */ FancyBoxInstance => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
    
    @scala.inline
    def setParentEl(value: String): Self = StObject.set(x, "parentEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentElUndefined: Self = StObject.set(x, "parentEl", js.undefined)
    
    @scala.inline
    def setPreventCaptionOverlap(value: Boolean): Self = StObject.set(x, "preventCaptionOverlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventCaptionOverlapUndefined: Self = StObject.set(x, "preventCaptionOverlap", js.undefined)
    
    @scala.inline
    def setProtect(value: Boolean): Self = StObject.set(x, "protect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectUndefined: Self = StObject.set(x, "protect", js.undefined)
    
    @scala.inline
    def setSlideClass(value: String): Self = StObject.set(x, "slideClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideClassUndefined: Self = StObject.set(x, "slideClass", js.undefined)
    
    @scala.inline
    def setSlideShow(value: AutoStart_): Self = StObject.set(x, "slideShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideShowUndefined: Self = StObject.set(x, "slideShow", js.undefined)
    
    @scala.inline
    def setSmallBtn(value: Boolean | auto): Self = StObject.set(x, "smallBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallBtnUndefined: Self = StObject.set(x, "smallBtn", js.undefined)
    
    @scala.inline
    def setSpinnerTpl(value: String): Self = StObject.set(x, "spinnerTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpinnerTplUndefined: Self = StObject.set(x, "spinnerTpl", js.undefined)
    
    @scala.inline
    def setThumbs(value: FancyThumbsOptions): Self = StObject.set(x, "thumbs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbsUndefined: Self = StObject.set(x, "thumbs", js.undefined)
    
    @scala.inline
    def setToolbar(value: Boolean | auto): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    @scala.inline
    def setTouch(value: FancyBoxTouchOptions | `false`): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    
    @scala.inline
    def setTransitionEffect(value: fade | slide | circular | tube | `zoom-in-out` | rotate | Boolean): Self = StObject.set(x, "transitionEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionEffectUndefined: Self = StObject.set(x, "transitionEffect", js.undefined)
    
    @scala.inline
    def setTrapFocus(value: Boolean): Self = StObject.set(x, "trapFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrapFocusUndefined: Self = StObject.set(x, "trapFocus", js.undefined)
    
    @scala.inline
    def setVideo(value: FancyBoxVideoOptions): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    
    @scala.inline
    def setWheel(value: auto | `false`): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheelUndefined: Self = StObject.set(x, "wheel", js.undefined)
    
    @scala.inline
    def setZoomOpacity(value: auto | Boolean): Self = StObject.set(x, "zoomOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomOpacityUndefined: Self = StObject.set(x, "zoomOpacity", js.undefined)
  }
}
