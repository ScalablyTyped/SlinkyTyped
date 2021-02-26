package typingsSlinky.electron.Electron

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.electron.electronStrings.`console-message`
import typingsSlinky.electron.electronStrings.`devtools-closed`
import typingsSlinky.electron.electronStrings.`devtools-focused`
import typingsSlinky.electron.electronStrings.`devtools-opened`
import typingsSlinky.electron.electronStrings.`did-change-theme-color`
import typingsSlinky.electron.electronStrings.`did-fail-load`
import typingsSlinky.electron.electronStrings.`did-finish-load`
import typingsSlinky.electron.electronStrings.`did-frame-finish-load`
import typingsSlinky.electron.electronStrings.`did-navigate-in-page`
import typingsSlinky.electron.electronStrings.`did-navigate`
import typingsSlinky.electron.electronStrings.`did-start-loading`
import typingsSlinky.electron.electronStrings.`did-stop-loading`
import typingsSlinky.electron.electronStrings.`dom-ready`
import typingsSlinky.electron.electronStrings.`enter-html-full-screen`
import typingsSlinky.electron.electronStrings.`found-in-page`
import typingsSlinky.electron.electronStrings.`ipc-message`
import typingsSlinky.electron.electronStrings.`leave-html-full-screen`
import typingsSlinky.electron.electronStrings.`load-commit`
import typingsSlinky.electron.electronStrings.`media-paused`
import typingsSlinky.electron.electronStrings.`media-started-playing`
import typingsSlinky.electron.electronStrings.`new-window`
import typingsSlinky.electron.electronStrings.`page-favicon-updated`
import typingsSlinky.electron.electronStrings.`page-title-updated`
import typingsSlinky.electron.electronStrings.`plugin-crashed`
import typingsSlinky.electron.electronStrings.`update-target-url`
import typingsSlinky.electron.electronStrings.`will-navigate`
import typingsSlinky.electron.electronStrings.abort
import typingsSlinky.electron.electronStrings.activateSelection
import typingsSlinky.electron.electronStrings.animationcancel
import typingsSlinky.electron.electronStrings.animationend
import typingsSlinky.electron.electronStrings.animationiteration
import typingsSlinky.electron.electronStrings.animationstart
import typingsSlinky.electron.electronStrings.auxclick
import typingsSlinky.electron.electronStrings.blur
import typingsSlinky.electron.electronStrings.cancel
import typingsSlinky.electron.electronStrings.canplay
import typingsSlinky.electron.electronStrings.canplaythrough
import typingsSlinky.electron.electronStrings.change
import typingsSlinky.electron.electronStrings.clearSelection
import typingsSlinky.electron.electronStrings.click
import typingsSlinky.electron.electronStrings.close
import typingsSlinky.electron.electronStrings.contextmenu_
import typingsSlinky.electron.electronStrings.copy
import typingsSlinky.electron.electronStrings.crashed
import typingsSlinky.electron.electronStrings.cuechange
import typingsSlinky.electron.electronStrings.cut
import typingsSlinky.electron.electronStrings.dblclick
import typingsSlinky.electron.electronStrings.destroyed
import typingsSlinky.electron.electronStrings.drag
import typingsSlinky.electron.electronStrings.dragend
import typingsSlinky.electron.electronStrings.dragenter
import typingsSlinky.electron.electronStrings.dragexit
import typingsSlinky.electron.electronStrings.dragleave
import typingsSlinky.electron.electronStrings.dragover
import typingsSlinky.electron.electronStrings.dragstart
import typingsSlinky.electron.electronStrings.drop
import typingsSlinky.electron.electronStrings.durationchange
import typingsSlinky.electron.electronStrings.emptied
import typingsSlinky.electron.electronStrings.ended
import typingsSlinky.electron.electronStrings.error
import typingsSlinky.electron.electronStrings.focus
import typingsSlinky.electron.electronStrings.focusin
import typingsSlinky.electron.electronStrings.focusout
import typingsSlinky.electron.electronStrings.fullscreenchange
import typingsSlinky.electron.electronStrings.fullscreenerror
import typingsSlinky.electron.electronStrings.gotpointercapture
import typingsSlinky.electron.electronStrings.input
import typingsSlinky.electron.electronStrings.invalid
import typingsSlinky.electron.electronStrings.keepSelection
import typingsSlinky.electron.electronStrings.keydown_
import typingsSlinky.electron.electronStrings.keypress
import typingsSlinky.electron.electronStrings.keyup_
import typingsSlinky.electron.electronStrings.load
import typingsSlinky.electron.electronStrings.loadeddata
import typingsSlinky.electron.electronStrings.loadedmetadata
import typingsSlinky.electron.electronStrings.loadstart
import typingsSlinky.electron.electronStrings.lostpointercapture
import typingsSlinky.electron.electronStrings.mousedown_
import typingsSlinky.electron.electronStrings.mouseenter_
import typingsSlinky.electron.electronStrings.mouseleave_
import typingsSlinky.electron.electronStrings.mousemove_
import typingsSlinky.electron.electronStrings.mouseout
import typingsSlinky.electron.electronStrings.mouseover
import typingsSlinky.electron.electronStrings.mouseup_
import typingsSlinky.electron.electronStrings.paste
import typingsSlinky.electron.electronStrings.pause
import typingsSlinky.electron.electronStrings.play
import typingsSlinky.electron.electronStrings.playing
import typingsSlinky.electron.electronStrings.pointercancel
import typingsSlinky.electron.electronStrings.pointerdown
import typingsSlinky.electron.electronStrings.pointerenter
import typingsSlinky.electron.electronStrings.pointerleave
import typingsSlinky.electron.electronStrings.pointermove
import typingsSlinky.electron.electronStrings.pointerout
import typingsSlinky.electron.electronStrings.pointerover
import typingsSlinky.electron.electronStrings.pointerup
import typingsSlinky.electron.electronStrings.progress
import typingsSlinky.electron.electronStrings.ratechange
import typingsSlinky.electron.electronStrings.reset
import typingsSlinky.electron.electronStrings.resize
import typingsSlinky.electron.electronStrings.scroll
import typingsSlinky.electron.electronStrings.securitypolicyviolation
import typingsSlinky.electron.electronStrings.seeked
import typingsSlinky.electron.electronStrings.seeking
import typingsSlinky.electron.electronStrings.select
import typingsSlinky.electron.electronStrings.selectionchange
import typingsSlinky.electron.electronStrings.selectstart
import typingsSlinky.electron.electronStrings.stalled
import typingsSlinky.electron.electronStrings.submit
import typingsSlinky.electron.electronStrings.suspend
import typingsSlinky.electron.electronStrings.timeupdate
import typingsSlinky.electron.electronStrings.toggle
import typingsSlinky.electron.electronStrings.touchcancel
import typingsSlinky.electron.electronStrings.touchend
import typingsSlinky.electron.electronStrings.touchmove
import typingsSlinky.electron.electronStrings.touchstart
import typingsSlinky.electron.electronStrings.transitioncancel
import typingsSlinky.electron.electronStrings.transitionend
import typingsSlinky.electron.electronStrings.transitionrun
import typingsSlinky.electron.electronStrings.transitionstart
import typingsSlinky.electron.electronStrings.volumechange
import typingsSlinky.electron.electronStrings.waiting
import typingsSlinky.electron.electronStrings.wheel
import typingsSlinky.std.HTMLElement
import typingsSlinky.std.SecurityPolicyViolationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebviewTag extends HTMLElement {
  
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ UIEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ UIEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  /**
    * Fired when the guest page attempts to close itself.
    *
    * The following example code navigates the `webview` to `about:blank` when the
    * guest attempts to close itself.
    */
  @JSName("addEventListener")
  def addEventListener_close(event: close, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_close(event: close, listener: js.Function1[/* event */ Event, Unit], useCapture: Boolean): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  /**
    * Fired when the guest window logs a console message.
    *
    * The following example code forwards all log messages to the embedder's console
    * without regard for log level or other properties.
    */
  @JSName("addEventListener")
  def addEventListener_consolemessage(event: `console-message`, listener: js.Function1[/* event */ ConsoleMessageEvent, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_consolemessage(
    event: `console-message`,
    listener: js.Function1[/* event */ ConsoleMessageEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: contextmenu_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: contextmenu_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  /**
    * Fired when the renderer process is crashed.
    */
  @JSName("addEventListener")
  def addEventListener_crashed(event: crashed, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_crashed(event: crashed, listener: js.Function1[/* event */ Event, Unit], useCapture: Boolean): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  /**
    * Fired when the WebContents is destroyed.
    */
  @JSName("addEventListener")
  def addEventListener_destroyed(event: destroyed, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_destroyed(event: destroyed, listener: js.Function1[/* event */ Event, Unit], useCapture: Boolean): this.type = js.native
  /**
    * Emitted when DevTools is closed.
    */
  @JSName("addEventListener")
  def addEventListener_devtoolsclosed(event: `devtools-closed`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_devtoolsclosed(event: `devtools-closed`, listener: js.Function1[/* event */ Event, Unit], useCapture: Boolean): this.type = js.native
  /**
    * Emitted when DevTools is focused / opened.
    */
  @JSName("addEventListener")
  def addEventListener_devtoolsfocused(event: `devtools-focused`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_devtoolsfocused(event: `devtools-focused`, listener: js.Function1[/* event */ Event, Unit], useCapture: Boolean): this.type = js.native
  /**
    * Emitted when DevTools is opened.
    */
  @JSName("addEventListener")
  def addEventListener_devtoolsopened(event: `devtools-opened`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_devtoolsopened(event: `devtools-opened`, listener: js.Function1[/* event */ Event, Unit], useCapture: Boolean): this.type = js.native
  /**
    * Emitted when a page's theme color changes. This is usually due to encountering a
    * meta tag:
    */
  @JSName("addEventListener")
  def addEventListener_didchangethemecolor(
    event: `did-change-theme-color`,
    listener: js.Function1[/* event */ DidChangeThemeColorEvent, Unit]
  ): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_didchangethemecolor(
    event: `did-change-theme-color`,
    listener: js.Function1[/* event */ DidChangeThemeColorEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  /**
    * This event is like `did-finish-load`, but fired when the load failed or was
    * cancelled, e.g. `window.stop()` is invoked.
    */
  @JSName("addEventListener")
  def addEventListener_didfailload(event: `did-fail-load`, listener: js.Function1[/* event */ DidFailLoadEvent, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_didfailload(
    event: `did-fail-load`,
    listener: js.Function1[/* event */ DidFailLoadEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  /**
    * Fired when the navigation is done, i.e. the spinner of the tab will stop
    * spinning, and the `onload` event is dispatched.
    */
  @JSName("addEventListener")
  def addEventListener_didfinishload(event: `did-finish-load`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_didfinishload(event: `did-finish-load`, listener: js.Function1[/* event */ Event, Unit], useCapture: Boolean): this.type = js.native
  /**
    * Fired when a frame has done navigation.
    */
  @JSName("addEventListener")
  def addEventListener_didframefinishload(event: `did-frame-finish-load`, listener: js.Function1[/* event */ DidFrameFinishLoadEvent, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_didframefinishload(
    event: `did-frame-finish-load`,
    listener: js.Function1[/* event */ DidFrameFinishLoadEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  /**
    * Emitted when a navigation is done.
    *
    * This event is not emitted for in-page navigations, such as clicking anchor links
    * or updating the `window.location.hash`. Use `did-navigate-in-page` event for
    * this purpose.
    */
  @JSName("addEventListener")
  def addEventListener_didnavigate(event: `did-navigate`, listener: js.Function1[/* event */ DidNavigateEvent, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_didnavigate(
    event: `did-navigate`,
    listener: js.Function1[/* event */ DidNavigateEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  /**
    * Emitted when an in-page navigation happened.
    *
    * When in-page navigation happens, the page URL changes but does not cause
    * navigation outside of the page. Examples of this occurring are when anchor links
    * are clicked or when the DOM `hashchange` event is triggered.
    */
  @JSName("addEventListener")
  def addEventListener_didnavigateinpage(event: `did-navigate-in-page`, listener: js.Function1[/* event */ DidNavigateInPageEvent, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_didnavigateinpage(
    event: `did-navigate-in-page`,
    listener: js.Function1[/* event */ DidNavigateInPageEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  /**
    * Corresponds to the points in time when the spinner of the tab starts spinning.
    */
  @JSName("addEventListener")
  def addEventListener_didstartloading(event: `did-start-loading`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_didstartloading(event: `did-start-loading`, listener: js.Function1[/* event */ Event, Unit], useCapture: Boolean): this.type = js.native
  /**
    * Corresponds to the points in time when the spinner of the tab stops spinning.
    */
  @JSName("addEventListener")
  def addEventListener_didstoploading(event: `did-stop-loading`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_didstoploading(event: `did-stop-loading`, listener: js.Function1[/* event */ Event, Unit], useCapture: Boolean): this.type = js.native
  /**
    * Fired when document in the given frame is loaded.
    */
  @JSName("addEventListener")
  def addEventListener_domready(event: `dom-ready`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_domready(event: `dom-ready`, listener: js.Function1[/* event */ Event, Unit], useCapture: Boolean): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: dragexit,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: dragexit,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  /**
    * Fired when page enters fullscreen triggered by HTML API.
    */
  @JSName("addEventListener")
  def addEventListener_enterhtmlfullscreen(event: `enter-html-full-screen`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_enterhtmlfullscreen(
    event: `enter-html-full-screen`,
    listener: js.Function1[/* event */ Event, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ErrorEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ErrorEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  /**
    * Fired when a result is available for `webview.findInPage` request.
    */
  @JSName("addEventListener")
  def addEventListener_foundinpage(event: `found-in-page`, listener: js.Function1[/* event */ FoundInPageEvent, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_foundinpage(
    event: `found-in-page`,
    listener: js.Function1[/* event */ FoundInPageEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: fullscreenchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: fullscreenchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: fullscreenerror,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: fullscreenerror,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  /**
    * Fired when the guest page has sent an asynchronous message to embedder page.
    *
    * With `sendToHost` method and `ipc-message` event you can communicate between
    * guest page and embedder page:
    */
  @JSName("addEventListener")
  def addEventListener_ipcmessage(event: `ipc-message`, listener: js.Function1[/* event */ IpcMessageEvent, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_ipcmessage(
    event: `ipc-message`,
    listener: js.Function1[/* event */ IpcMessageEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: keydown_,
    listener: js.ThisFunction1[
      /* this */ org.scalajs.dom.raw.HTMLElement, 
      /* ev */ org.scalajs.dom.raw.KeyboardEvent, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: keydown_,
    listener: js.ThisFunction1[
      /* this */ org.scalajs.dom.raw.HTMLElement, 
      /* ev */ org.scalajs.dom.raw.KeyboardEvent, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[
      /* this */ org.scalajs.dom.raw.HTMLElement, 
      /* ev */ org.scalajs.dom.raw.KeyboardEvent, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[
      /* this */ org.scalajs.dom.raw.HTMLElement, 
      /* ev */ org.scalajs.dom.raw.KeyboardEvent, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: keyup_,
    listener: js.ThisFunction1[
      /* this */ org.scalajs.dom.raw.HTMLElement, 
      /* ev */ org.scalajs.dom.raw.KeyboardEvent, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: keyup_,
    listener: js.ThisFunction1[
      /* this */ org.scalajs.dom.raw.HTMLElement, 
      /* ev */ org.scalajs.dom.raw.KeyboardEvent, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  /**
    * Fired when page leaves fullscreen triggered by HTML API.
    */
  @JSName("addEventListener")
  def addEventListener_leavehtmlfullscreen(event: `leave-html-full-screen`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_leavehtmlfullscreen(
    event: `leave-html-full-screen`,
    listener: js.Function1[/* event */ Event, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  // Docs: https://electronjs.org/docs/api/webview-tag
  /**
    * Fired when a load has committed. This includes navigation within the current
    * document as well as subframe document-level loads, but does not include
    * asynchronous resource loads.
    */
  @JSName("addEventListener")
  def addEventListener_loadcommit(event: `load-commit`, listener: js.Function1[/* event */ LoadCommitEvent, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_loadcommit(
    event: `load-commit`,
    listener: js.Function1[/* event */ LoadCommitEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  /**
    * Emitted when media is paused or done playing.
    */
  @JSName("addEventListener")
  def addEventListener_mediapaused(event: `media-paused`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_mediapaused(event: `media-paused`, listener: js.Function1[/* event */ Event, Unit], useCapture: Boolean): this.type = js.native
  /**
    * Emitted when media starts playing.
    */
  @JSName("addEventListener")
  def addEventListener_mediastartedplaying(event: `media-started-playing`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_mediastartedplaying(
    event: `media-started-playing`,
    listener: js.Function1[/* event */ Event, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: mousedown_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: mousedown_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: mouseenter_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: mouseenter_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: mouseleave_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: mouseleave_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: mousemove_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: mousemove_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: mouseup_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: mouseup_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  /**
    * Fired when the guest page attempts to open a new browser window.
    * 
  The following example code opens the new url in system's default browser.
    */
  @JSName("addEventListener")
  def addEventListener_newwindow(event: `new-window`, listener: js.Function1[/* event */ NewWindowEvent, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_newwindow(event: `new-window`, listener: js.Function1[/* event */ NewWindowEvent, Unit], useCapture: Boolean): this.type = js.native
  /**
    * Fired when page receives favicon urls.
    */
  @JSName("addEventListener")
  def addEventListener_pagefaviconupdated(event: `page-favicon-updated`, listener: js.Function1[/* event */ PageFaviconUpdatedEvent, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_pagefaviconupdated(
    event: `page-favicon-updated`,
    listener: js.Function1[/* event */ PageFaviconUpdatedEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  /**
    * Fired when page title is set during navigation. `explicitSet` is false when
    * title is synthesized from file url.
    */
  @JSName("addEventListener")
  def addEventListener_pagetitleupdated(event: `page-title-updated`, listener: js.Function1[/* event */ PageTitleUpdatedEvent, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_pagetitleupdated(
    event: `page-title-updated`,
    listener: js.Function1[/* event */ PageTitleUpdatedEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  /**
    * Fired when a plugin process is crashed.
    */
  @JSName("addEventListener")
  def addEventListener_plugincrashed(event: `plugin-crashed`, listener: js.Function1[/* event */ PluginCrashedEvent, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_plugincrashed(
    event: `plugin-crashed`,
    listener: js.Function1[/* event */ PluginCrashedEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ProgressEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ProgressEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ UIEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ UIEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ SecurityPolicyViolationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ SecurityPolicyViolationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  /**
    * Emitted when mouse moves over a link or the keyboard moves the focus to a link.
    */
  @JSName("addEventListener")
  def addEventListener_updatetargeturl(event: `update-target-url`, listener: js.Function1[/* event */ UpdateTargetUrlEvent, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_updatetargeturl(
    event: `update-target-url`,
    listener: js.Function1[/* event */ UpdateTargetUrlEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ WheelEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ WheelEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  /**
    * Emitted when a user or the page wants to start navigation. It can happen when
    * the `window.location` object is changed or a user clicks a link in the page.
    *
    * This event will not emit when the navigation is started programmatically with
    * APIs like `<webview>.loadURL` and `<webview>.back`.
    *
    * It is also not emitted during in-page navigation, such as clicking anchor links
    * or updating the `window.location.hash`. Use `did-navigate-in-page` event for
    * this purpose.
  Calling `event.preventDefault()` does __NOT__ have any effect.
    */
  @JSName("addEventListener")
  def addEventListener_willnavigate(event: `will-navigate`, listener: js.Function1[/* event */ WillNavigateEvent, Unit]): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_willnavigate(
    event: `will-navigate`,
    listener: js.Function1[/* event */ WillNavigateEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  
  /**
    * A `Boolean`. When this attribute is present the guest page will be allowed to
    * open new windows. Popups are disabled by default.
    */
  var allowpopups: Boolean = js.native
  
  /**
    * Whether the guest page can go back.
    */
  def canGoBack(): Boolean = js.native
  
  /**
    * Whether the guest page can go forward.
    */
  def canGoForward(): Boolean = js.native
  
  /**
    * Whether the guest page can go to `offset`.
    */
  def canGoToOffset(offset: Double): Boolean = js.native
  
  /**
    * Resolves with a NativeImage
    *
    * Captures a snapshot of the page within `rect`. Omitting `rect` will capture the
    * whole visible page.
    */
  def capturePage(): js.Promise[NativeImage_] = js.native
  def capturePage(rect: Rectangle): js.Promise[NativeImage_] = js.native
  
  /**
    * Clears the navigation history.
    */
  def clearHistory(): Unit = js.native
  
  /**
    * Closes the DevTools window of guest page.
    */
  def closeDevTools(): Unit = js.native
  
  /**
    * Executes editing command `copy` in page.
    */
  def copy(): Unit = js.native
  
  /**
    * Executes editing command `cut` in page.
    */
  def cut(): Unit = js.native
  
  /**
    * Executes editing command `delete` in page.
    */
  def delete(): Unit = js.native
  
  /**
    * A `String` which is a list of strings which specifies the blink features to be
    * disabled separated by `,`. The full list of supported feature strings can be
    * found in the RuntimeEnabledFeatures.json5 file.
    */
  var disableblinkfeatures: String = js.native
  
  /**
    * A `Boolean`. When this attribute is present the guest page will have web
    * security disabled. Web security is enabled by default.
    */
  var disablewebsecurity: Boolean = js.native
  
  /**
    * Initiates a download of the resource at `url` without navigating.
    */
  def downloadURL(url: String): Unit = js.native
  
  /**
    * A `String` which is a list of strings which specifies the blink features to be
    * enabled separated by `,`. The full list of supported feature strings can be
    * found in the RuntimeEnabledFeatures.json5 file.
    */
  var enableblinkfeatures: String = js.native
  
  /**
    * A `Boolean`. When this attribute is `false` the guest page in `webview` will not
    * have access to the `remote` module. The remote module is available by default.
    */
  var enableremotemodule: Boolean = js.native
  
  /**
    * A promise that resolves with the result of the executed code or is rejected if
    * the result of the code is a rejected promise.
    *
    * Evaluates `code` in page. If `userGesture` is set, it will create the user
    * gesture context in the page. HTML APIs like `requestFullScreen`, which require
    * user action, can take advantage of this option for automation.
    */
  def executeJavaScript(code: String): js.Promise[_] = js.native
  def executeJavaScript(code: String, userGesture: Boolean): js.Promise[_] = js.native
  
  /**
    * The request id used for the request.
    *
    * Starts a request to find all matches for the `text` in the web page. The result
    * of the request can be obtained by subscribing to `found-in-page` event.
    */
  def findInPage(text: String): Double = js.native
  def findInPage(text: String, options: FindInPageOptions): Double = js.native
  
  /**
    * The title of guest page.
    */
  def getTitle(): String = js.native
  
  /**
    * The URL of guest page.
    */
  def getURL(): String = js.native
  
  /**
    * The user agent for guest page.
    */
  def getUserAgent(): String = js.native
  
  /**
    * The WebContents ID of this `webview`.
    */
  def getWebContentsId(): Double = js.native
  
  /**
    * the current zoom factor.
    */
  def getZoomFactor(): Double = js.native
  
  /**
    * the current zoom level.
    */
  def getZoomLevel(): Double = js.native
  
  /**
    * Makes the guest page go back.
    */
  def goBack(): Unit = js.native
  
  /**
    * Makes the guest page go forward.
    */
  def goForward(): Unit = js.native
  
  /**
    * Navigates to the specified absolute index.
    */
  def goToIndex(index: Double): Unit = js.native
  
  /**
    * Navigates to the specified offset from the "current entry".
    */
  def goToOffset(offset: Double): Unit = js.native
  
  /**
    * A `String` that sets the referrer URL for the guest page.
    */
  var httpreferrer: String = js.native
  
  /**
    * A promise that resolves with a key for the inserted CSS that can later be used
    * to remove the CSS via `<webview>.removeInsertedCSS(key)`.
    *
    * Injects CSS into the current web page and returns a unique key for the inserted
    * stylesheet.
    */
  def insertCSS(css: String): js.Promise[String] = js.native
  
  /**
    * Inserts `text` to the focused element.
    */
  def insertText(text: String): js.Promise[Unit] = js.native
  
  /**
    * Starts inspecting element at position (`x`, `y`) of guest page.
    */
  def inspectElement(x: Double, y: Double): Unit = js.native
  
  /**
    * Opens the DevTools for the service worker context present in the guest page.
    */
  def inspectServiceWorker(): Unit = js.native
  
  /**
    * Opens the DevTools for the shared worker context present in the guest page.
    */
  def inspectSharedWorker(): Unit = js.native
  
  /**
    * Whether guest page has been muted.
    */
  def isAudioMuted(): Boolean = js.native
  
  /**
    * Whether the renderer process has crashed.
    */
  def isCrashed(): Boolean = js.native
  
  /**
    * Whether audio is currently playing.
    */
  def isCurrentlyAudible(): Boolean = js.native
  
  /**
    * Whether DevTools window of guest page is focused.
    */
  def isDevToolsFocused(): Boolean = js.native
  
  /**
    * Whether guest page has a DevTools window attached.
    */
  def isDevToolsOpened(): Boolean = js.native
  
  /**
    * Whether guest page is still loading resources.
    */
  def isLoading(): Boolean = js.native
  
  /**
    * Whether the main frame (and not just iframes or frames within it) is still
    * loading.
    */
  def isLoadingMainFrame(): Boolean = js.native
  
  /**
    * Whether the guest page is waiting for a first-response for the main resource of
    * the page.
    */
  def isWaitingForResponse(): Boolean = js.native
  
  /**
    * The promise will resolve when the page has finished loading (see
    * `did-finish-load`), and rejects if the page fails to load (see `did-fail-load`).
    *
    * Loads the `url` in the webview, the `url` must contain the protocol prefix, e.g.
    * the `http://` or `file://`.
    */
  def loadURL(url: String): js.Promise[Unit] = js.native
  def loadURL(url: String, options: LoadURLOptions): js.Promise[Unit] = js.native
  
  /**
    * A `Boolean`. When this attribute is present the guest page in `webview` will
    * have node integration and can use node APIs like `require` and `process` to
    * access low level system resources. Node integration is disabled by default in
    * the guest page.
    */
  var nodeintegration: Boolean = js.native
  
  /**
    * A `Boolean` for the experimental option for enabling NodeJS support in
    * sub-frames such as iframes inside the `webview`. All your preloads will load for
    * every iframe, you can use `process.isMainFrame` to determine if you are in the
    * main frame or not. This option is disabled by default in the guest page.
    */
  var nodeintegrationinsubframes: Boolean = js.native
  
  /**
    * Opens a DevTools window for guest page.
    */
  def openDevTools(): Unit = js.native
  
  /**
    * A `String` that sets the session used by the page. If `partition` starts with
    * `persist:`, the page will use a persistent session available to all pages in the
    * app with the same `partition`. if there is no `persist:` prefix, the page will
    * use an in-memory session. By assigning the same `partition`, multiple pages can
    * share the same session. If the `partition` is unset then default session of the
    * app will be used.
    *
    * This value can only be modified before the first navigation, since the session
    * of an active renderer process cannot change. Subsequent attempts to modify the
    * value will fail with a DOM exception.
    */
  var partition: String = js.native
  
  /**
    * Executes editing command `paste` in page.
    */
  def paste(): Unit = js.native
  
  /**
    * Executes editing command `pasteAndMatchStyle` in page.
    */
  def pasteAndMatchStyle(): Unit = js.native
  
  /**
    * A `Boolean`. When this attribute is present the guest page in `webview` will be
    * able to use browser plugins. Plugins are disabled by default.
    */
  var plugins: Boolean = js.native
  
  /**
    * A `String` that specifies a script that will be loaded before other scripts run
    * in the guest page. The protocol of script's URL must be either `file:` or
    * `asar:`, because it will be loaded by `require` in guest page under the hood.
    *
    * When the guest page doesn't have node integration this script will still have
    * access to all Node APIs, but global objects injected by Node will be deleted
    * after this script has finished executing.
    *
    * **Note:** This option will appear as `preloadURL` (not `preload`) in the
    * `webPreferences` specified to the `will-attach-webview` event.
    */
  var preload: String = js.native
  
  /**
    * Prints `webview`'s web page. Same as `webContents.print([options])`.
    */
  def print(): js.Promise[Unit] = js.native
  def print(options: WebviewTagPrintOptions): js.Promise[Unit] = js.native
  
  /**
    * Resolves with the generated PDF data.
    * 
  Prints `webview`'s web page as PDF, Same as `webContents.printToPDF(options)`.
    */
  def printToPDF(options: PrintToPDFOptions): js.Promise[js.typedarray.Uint8Array] = js.native
  
  /**
    * Executes editing command `redo` in page.
    */
  def redo(): Unit = js.native
  
  /**
    * Reloads the guest page.
    */
  def reload(): Unit = js.native
  
  /**
    * Reloads the guest page and ignores cache.
    */
  def reloadIgnoringCache(): Unit = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ UIEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ UIEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(event: close, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_consolemessage(event: `console-message`, listener: js.Function1[/* event */ ConsoleMessageEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: contextmenu_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: contextmenu_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_crashed(event: crashed, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_destroyed(event: destroyed, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_devtoolsclosed(event: `devtools-closed`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_devtoolsfocused(event: `devtools-focused`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_devtoolsopened(event: `devtools-opened`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_didchangethemecolor(
    event: `did-change-theme-color`,
    listener: js.Function1[/* event */ DidChangeThemeColorEvent, Unit]
  ): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_didfailload(event: `did-fail-load`, listener: js.Function1[/* event */ DidFailLoadEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_didfinishload(event: `did-finish-load`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_didframefinishload(event: `did-frame-finish-load`, listener: js.Function1[/* event */ DidFrameFinishLoadEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_didnavigate(event: `did-navigate`, listener: js.Function1[/* event */ DidNavigateEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_didnavigateinpage(event: `did-navigate-in-page`, listener: js.Function1[/* event */ DidNavigateInPageEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_didstartloading(event: `did-start-loading`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_didstoploading(event: `did-stop-loading`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_domready(event: `dom-ready`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: dragexit,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: dragexit,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enterhtmlfullscreen(event: `enter-html-full-screen`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ErrorEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ErrorEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_foundinpage(event: `found-in-page`, listener: js.Function1[/* event */ FoundInPageEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: fullscreenchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: fullscreenchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: fullscreenerror,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: fullscreenerror,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ipcmessage(event: `ipc-message`, listener: js.Function1[/* event */ IpcMessageEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: keydown_,
    listener: js.ThisFunction1[
      /* this */ org.scalajs.dom.raw.HTMLElement, 
      /* ev */ org.scalajs.dom.raw.KeyboardEvent, 
      _
    ]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: keydown_,
    listener: js.ThisFunction1[
      /* this */ org.scalajs.dom.raw.HTMLElement, 
      /* ev */ org.scalajs.dom.raw.KeyboardEvent, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[
      /* this */ org.scalajs.dom.raw.HTMLElement, 
      /* ev */ org.scalajs.dom.raw.KeyboardEvent, 
      _
    ]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[
      /* this */ org.scalajs.dom.raw.HTMLElement, 
      /* ev */ org.scalajs.dom.raw.KeyboardEvent, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: keyup_,
    listener: js.ThisFunction1[
      /* this */ org.scalajs.dom.raw.HTMLElement, 
      /* ev */ org.scalajs.dom.raw.KeyboardEvent, 
      _
    ]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: keyup_,
    listener: js.ThisFunction1[
      /* this */ org.scalajs.dom.raw.HTMLElement, 
      /* ev */ org.scalajs.dom.raw.KeyboardEvent, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_leavehtmlfullscreen(event: `leave-html-full-screen`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadcommit(event: `load-commit`, listener: js.Function1[/* event */ LoadCommitEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mediapaused(event: `media-paused`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mediastartedplaying(event: `media-started-playing`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: mousedown_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: mousedown_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: mouseenter_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: mouseenter_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: mouseleave_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: mouseleave_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: mousemove_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: mousemove_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: mouseup_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: mouseup_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_newwindow(event: `new-window`, listener: js.Function1[/* event */ NewWindowEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagefaviconupdated(event: `page-favicon-updated`, listener: js.Function1[/* event */ PageFaviconUpdatedEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagetitleupdated(event: `page-title-updated`, listener: js.Function1[/* event */ PageTitleUpdatedEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_plugincrashed(event: `plugin-crashed`, listener: js.Function1[/* event */ PluginCrashedEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ProgressEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ProgressEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ UIEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ UIEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ SecurityPolicyViolationEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ SecurityPolicyViolationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updatetargeturl(event: `update-target-url`, listener: js.Function1[/* event */ UpdateTargetUrlEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ org.scalajs.dom.raw.Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ WheelEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ WheelEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_willnavigate(event: `will-navigate`, listener: js.Function1[/* event */ WillNavigateEvent, Unit]): this.type = js.native
  
  /**
    * Resolves if the removal was successful.
    *
    * Removes the inserted CSS from the current web page. The stylesheet is identified
    * by its key, which is returned from `<webview>.insertCSS(css)`.
    */
  def removeInsertedCSS(key: String): js.Promise[Unit] = js.native
  
  /**
    * Executes editing command `replace` in page.
    */
  def replace(text: String): Unit = js.native
  
  /**
    * Executes editing command `replaceMisspelling` in page.
    */
  def replaceMisspelling(text: String): Unit = js.native
  
  /**
    * Executes editing command `selectAll` in page.
    */
  def selectAll(): Unit = js.native
  
  /**
    * Send an asynchronous message to renderer process via `channel`, you can also
    * send arbitrary arguments. The renderer process can handle the message by
    * listening to the `channel` event with the `ipcRenderer` module.
    * 
  See webContents.send for examples.
    */
  def send(channel: String, args: js.Any*): js.Promise[Unit] = js.native
  
  def sendInputEvent(event: KeyboardInputEvent): js.Promise[Unit] = js.native
  /**
    * Sends an input `event` to the page.
    * 
  See webContents.sendInputEvent for detailed description of `event` object.
    */
  def sendInputEvent(event: MouseInputEvent): js.Promise[Unit] = js.native
  def sendInputEvent(event: MouseWheelInputEvent): js.Promise[Unit] = js.native
  
  /**
    * Set guest page muted.
    */
  def setAudioMuted(muted: Boolean): Unit = js.native
  
  /**
    * Overrides the user agent for the guest page.
    */
  def setUserAgent(userAgent: String): Unit = js.native
  
  /**
    * Sets the maximum and minimum pinch-to-zoom level.
    */
  def setVisualZoomLevelLimits(minimumLevel: Double, maximumLevel: Double): js.Promise[Unit] = js.native
  
  /**
    * Changes the zoom factor to the specified factor. Zoom factor is zoom percent
    * divided by 100, so 300% = 3.0.
    */
  def setZoomFactor(factor: Double): Unit = js.native
  
  /**
    * Changes the zoom level to the specified level. The original size is 0 and each
    * increment above or below represents zooming 20% larger or smaller to default
    * limits of 300% and 50% of original size, respectively. The formula for this is
    * `scale := 1.2 ^ level`.
    */
  def setZoomLevel(level: Double): Unit = js.native
  
  /**
    * Shows pop-up dictionary that searches the selected word on the page.
    *
    * @platform darwin
    */
  def showDefinitionForSelection(): Unit = js.native
  
  /**
    * A `String` representing the visible URL. Writing to this attribute initiates
    * top-level navigation.
    *
    * Assigning `src` its own value will reload the current page.
    *
    * The `src` attribute can also accept data URLs, such as `data:text/plain,Hello,
    * world!`.
    */
  var src: String = js.native
  
  /**
    * Stops any pending navigation.
    */
  def stop(): Unit = js.native
  
  @JSName("stopFindInPage")
  def stopFindInPage_activateSelection(action: activateSelection): Unit = js.native
  /**
    * Stops any `findInPage` request for the `webview` with the provided `action`.
    */
  @JSName("stopFindInPage")
  def stopFindInPage_clearSelection(action: clearSelection): Unit = js.native
  @JSName("stopFindInPage")
  def stopFindInPage_keepSelection(action: keepSelection): Unit = js.native
  
  /**
    * Executes editing command `undo` in page.
    */
  def undo(): Unit = js.native
  
  /**
    * Executes editing command `unselect` in page.
    */
  def unselect(): Unit = js.native
  
  /**
    * A `String` that sets the user agent for the guest page before the page is
    * navigated to. Once the page is loaded, use the `setUserAgent` method to change
    * the user agent.
    */
  var useragent: String = js.native
  
  /**
    * A `String` which is a comma separated list of strings which specifies the web
    * preferences to be set on the webview. The full list of supported preference
    * strings can be found in BrowserWindow.
    *
    * The string follows the same format as the features string in `window.open`. A
    * name by itself is given a `true` boolean value. A preference can be set to
    * another value by including an `=`, followed by the value. Special values `yes`
    * and `1` are interpreted as `true`, while `no` and `0` are interpreted as
    * `false`.
    */
  var webpreferences: String = js.native
}
