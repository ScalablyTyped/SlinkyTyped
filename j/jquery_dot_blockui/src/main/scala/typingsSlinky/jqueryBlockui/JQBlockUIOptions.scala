package typingsSlinky.jqueryBlockui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQBlockUIOptions extends js.Object {
  /** 
    * allow body element to be stetched in ie6; this makes blocking look better
    * on "short" pages.  disable if you wish to prevent changes to the body height 
    */
  var allowBodyStretch: js.UndefOr[Boolean] = js.native
  /** z-index for the blocking overlay */
  var baseZ: js.UndefOr[Double] = js.native
  /** enable if you want key and mouse events to be disabled for content that is blocked */
  var bindEvents: js.UndefOr[Boolean] = js.native
  /** class name of the message block */
  var blockMsgClass: js.UndefOr[String] = js.native
  /** set true to have the message automatically centered for X */
  var centerX: js.UndefOr[Boolean] = js.native
  /** set true to have the message automatically centered for Y */
  var centerY: js.UndefOr[Boolean] = js.native
  /** be default blockUI will supress tab navigation from leaving blocking content(if bindEvents is true) */
  var constrainTabKey: js.UndefOr[Boolean] = js.native
  /** 
    * styles for the message when blocking; if you wish to disable 
    * these and use an external stylesheet then do this in your code: 
    * $.blockUI.defaults.css = {}; 
    */
  var css: js.UndefOr[js.Any] = js.native
  /** style to replace wait cursor before unblocking to correct issue of lingering wait cursor */
  var cursorReset: js.UndefOr[String] = js.native
  /** only used when theme == true (requires jquery-ui.js to be loaded) */
  var draggable: js.UndefOr[Boolean] = js.native
  /** fadeIn time in millis; set to 0 to disable fadeIn on block  */
  var fadeIn: js.UndefOr[Double] = js.native
  /** fadeOut time in millis; set to 0 to disable fadeOut on unblock */
  var fadeOut: js.UndefOr[Double] = js.native
  /** if true, focus will be placed in the first available input field when page blocking */
  var focusInput: js.UndefOr[Boolean] = js.native
  /** force usage of iframe in non-IE browsers (handy for blocking applets) */
  var forceIframe: js.UndefOr[Boolean] = js.native
  /** styles applied when using $.growlUI */
  var growlCSS: js.UndefOr[js.Any] = js.native
  /** ifreamSrc for IE */
  var iframeSrc: js.UndefOr[String] = js.native
  /** if it is already blocked, then ignore it (don't unblock and reblock) */
  var ignoreIfBlocked: js.UndefOr[Boolean] = js.native
  /** message displayed when blocking (use null for no message) */
  var message: js.UndefOr[js.Any] = js.native
  /** callback method invoked when fadeIn has completed and blocking message is visible */
  var onBlock: js.UndefOr[js.Function0[Unit]] = js.native
  /** 
    * callback method invoked when unblocking has completed; the callback is 
    * passed the element that has been unblocked (which is the window object for page 
    * blocks) and the options that were passed to the unblock call: 
    * onUnblock(element, options) 
    */
  var onUnblock: js.UndefOr[js.Function2[/* element */ js.Any, /* options */ js.Any, Unit]] = js.native
  /** styles for the overlay */
  var overlayCSS: js.UndefOr[js.Any] = js.native
  // don't ask; if you really must know: http://groups.google.com/group/jquery-en/browse_thread/thread/36640a8730503595/2f6a79a77a78e493#2f6a79a77a78e493 
  /** quirksmodeOffsetHack */
  var quirksmodeOffsetHack: js.UndefOr[Double] = js.native
  /** disable if you don't want to show the overlay */
  var showOverlay: js.UndefOr[Boolean] = js.native
  /** set to true to use with jQuery UI themes */
  var theme: js.UndefOr[Boolean] = js.native
  /** minimal style set used when themes are used  */
  var themedCSS: js.UndefOr[js.Any] = js.native
  /** time in millis to wait before auto-unblocking; set to 0 to disable auto-unblock */
  var timeout: js.UndefOr[Double] = js.native
  /** title string; only used when theme == true  */
  var title: js.UndefOr[String] = js.native
}

object JQBlockUIOptions {
  @scala.inline
  def apply(): JQBlockUIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQBlockUIOptions]
  }
  @scala.inline
  implicit class JQBlockUIOptionsOps[Self <: JQBlockUIOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowBodyStretch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowBodyStretch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowBodyStretch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowBodyStretch")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseZ")(js.undefined)
        ret
    }
    @scala.inline
    def withBindEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockMsgClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockMsgClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockMsgClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockMsgClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerX")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerY")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrainTabKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainTabKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainTabKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainTabKey")(js.undefined)
        ret
    }
    @scala.inline
    def withCss(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorReset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorReset")(js.undefined)
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
    def withFadeIn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeIn")(js.undefined)
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
    def withFocusInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusInput")(js.undefined)
        ret
    }
    @scala.inline
    def withForceIframe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIframe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceIframe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIframe")(js.undefined)
        ret
    }
    @scala.inline
    def withGrowlCSS(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growlCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrowlCSS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growlCSS")(js.undefined)
        ret
    }
    @scala.inline
    def withIframeSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIframeSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreIfBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreIfBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreIfBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreIfBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlock(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlock")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnblock(value: (/* element */ js.Any, /* options */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnblock")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnUnblock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnblock")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayCSS(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayCSS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayCSS")(js.undefined)
        ret
    }
    @scala.inline
    def withQuirksmodeOffsetHack(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quirksmodeOffsetHack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuirksmodeOffsetHack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quirksmodeOffsetHack")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOverlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withThemedCSS(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themedCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemedCSS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themedCSS")(js.undefined)
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
    def withTitle(value: String): Self = {
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
  }
  
}

