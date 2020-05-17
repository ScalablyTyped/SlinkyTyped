package typingsSlinky.chromeApps

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.chromeApps.WebView.ClearDataOptions
import typingsSlinky.chromeApps.WebView.ClearDataTypeSet
import typingsSlinky.chromeApps.WebView.ContentScriptDetails
import typingsSlinky.chromeApps.WebView.ContentWindow
import typingsSlinky.chromeApps.WebView.ContextMenus
import typingsSlinky.chromeApps.WebView.Events.ConsoleMessageEvent
import typingsSlinky.chromeApps.WebView.Events.DialogEvent
import typingsSlinky.chromeApps.WebView.Events.ExitEvent
import typingsSlinky.chromeApps.WebView.Events.FindUpdateEvent
import typingsSlinky.chromeApps.WebView.Events.LoadAbortEvent
import typingsSlinky.chromeApps.WebView.Events.LoadCommitEvent
import typingsSlinky.chromeApps.WebView.Events.LoadRedirectEvent
import typingsSlinky.chromeApps.WebView.Events.LoadStartEvent
import typingsSlinky.chromeApps.WebView.Events.NewWindowEvent
import typingsSlinky.chromeApps.WebView.Events.PermissionRequestEvent
import typingsSlinky.chromeApps.WebView.Events.ResponsiveEvent
import typingsSlinky.chromeApps.WebView.Events.SizeChangedEvent
import typingsSlinky.chromeApps.WebView.Events.UnresponsiveEvent
import typingsSlinky.chromeApps.WebView.Events.ZoomChangeEvent
import typingsSlinky.chromeApps.WebView.FindCallbackResults
import typingsSlinky.chromeApps.WebView.FindOptions
import typingsSlinky.chromeApps.WebView.InjectDetails
import typingsSlinky.chromeApps.WebView.WebRequestEventInterface
import typingsSlinky.chromeApps.WebView.ZoomMode
import typingsSlinky.chromeApps.chrome.double
import typingsSlinky.chromeApps.chrome.extensionTypes.ImageDetails
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsStrings.abort_
import typingsSlinky.chromeApps.chromeAppsStrings.activate
import typingsSlinky.chromeApps.chromeAppsStrings.animationcancel
import typingsSlinky.chromeApps.chromeAppsStrings.animationend
import typingsSlinky.chromeApps.chromeAppsStrings.animationiteration
import typingsSlinky.chromeApps.chromeAppsStrings.animationstart
import typingsSlinky.chromeApps.chromeAppsStrings.auxclick
import typingsSlinky.chromeApps.chromeAppsStrings.blur
import typingsSlinky.chromeApps.chromeAppsStrings.cancel
import typingsSlinky.chromeApps.chromeAppsStrings.canplay
import typingsSlinky.chromeApps.chromeAppsStrings.canplaythrough
import typingsSlinky.chromeApps.chromeAppsStrings.change
import typingsSlinky.chromeApps.chromeAppsStrings.clear
import typingsSlinky.chromeApps.chromeAppsStrings.click
import typingsSlinky.chromeApps.chromeAppsStrings.close
import typingsSlinky.chromeApps.chromeAppsStrings.consolemessage
import typingsSlinky.chromeApps.chromeAppsStrings.contentload
import typingsSlinky.chromeApps.chromeAppsStrings.contextmenu
import typingsSlinky.chromeApps.chromeAppsStrings.copy
import typingsSlinky.chromeApps.chromeAppsStrings.cuechange
import typingsSlinky.chromeApps.chromeAppsStrings.cut
import typingsSlinky.chromeApps.chromeAppsStrings.dblclick
import typingsSlinky.chromeApps.chromeAppsStrings.dialog
import typingsSlinky.chromeApps.chromeAppsStrings.drag
import typingsSlinky.chromeApps.chromeAppsStrings.dragend
import typingsSlinky.chromeApps.chromeAppsStrings.dragenter
import typingsSlinky.chromeApps.chromeAppsStrings.dragexit
import typingsSlinky.chromeApps.chromeAppsStrings.dragleave
import typingsSlinky.chromeApps.chromeAppsStrings.dragover
import typingsSlinky.chromeApps.chromeAppsStrings.dragstart
import typingsSlinky.chromeApps.chromeAppsStrings.drop
import typingsSlinky.chromeApps.chromeAppsStrings.durationchange
import typingsSlinky.chromeApps.chromeAppsStrings.emptied
import typingsSlinky.chromeApps.chromeAppsStrings.ended
import typingsSlinky.chromeApps.chromeAppsStrings.error_
import typingsSlinky.chromeApps.chromeAppsStrings.exit
import typingsSlinky.chromeApps.chromeAppsStrings.findupdate
import typingsSlinky.chromeApps.chromeAppsStrings.focus
import typingsSlinky.chromeApps.chromeAppsStrings.focusin
import typingsSlinky.chromeApps.chromeAppsStrings.focusout
import typingsSlinky.chromeApps.chromeAppsStrings.fullscreenchange
import typingsSlinky.chromeApps.chromeAppsStrings.fullscreenerror
import typingsSlinky.chromeApps.chromeAppsStrings.gotpointercapture
import typingsSlinky.chromeApps.chromeAppsStrings.input_
import typingsSlinky.chromeApps.chromeAppsStrings.invalid
import typingsSlinky.chromeApps.chromeAppsStrings.keep
import typingsSlinky.chromeApps.chromeAppsStrings.keydown
import typingsSlinky.chromeApps.chromeAppsStrings.keypress
import typingsSlinky.chromeApps.chromeAppsStrings.keyup
import typingsSlinky.chromeApps.chromeAppsStrings.load
import typingsSlinky.chromeApps.chromeAppsStrings.loadabort
import typingsSlinky.chromeApps.chromeAppsStrings.loadcommit
import typingsSlinky.chromeApps.chromeAppsStrings.loadeddata
import typingsSlinky.chromeApps.chromeAppsStrings.loadedmetadata
import typingsSlinky.chromeApps.chromeAppsStrings.loadredirect
import typingsSlinky.chromeApps.chromeAppsStrings.loadstart
import typingsSlinky.chromeApps.chromeAppsStrings.loadstop
import typingsSlinky.chromeApps.chromeAppsStrings.lostpointercapture
import typingsSlinky.chromeApps.chromeAppsStrings.mousedown
import typingsSlinky.chromeApps.chromeAppsStrings.mouseenter
import typingsSlinky.chromeApps.chromeAppsStrings.mouseleave
import typingsSlinky.chromeApps.chromeAppsStrings.mousemove
import typingsSlinky.chromeApps.chromeAppsStrings.mouseout
import typingsSlinky.chromeApps.chromeAppsStrings.mouseover
import typingsSlinky.chromeApps.chromeAppsStrings.mouseup
import typingsSlinky.chromeApps.chromeAppsStrings.newwindow
import typingsSlinky.chromeApps.chromeAppsStrings.on
import typingsSlinky.chromeApps.chromeAppsStrings.paste
import typingsSlinky.chromeApps.chromeAppsStrings.pause
import typingsSlinky.chromeApps.chromeAppsStrings.permissionrequest
import typingsSlinky.chromeApps.chromeAppsStrings.play
import typingsSlinky.chromeApps.chromeAppsStrings.playing
import typingsSlinky.chromeApps.chromeAppsStrings.pointercancel
import typingsSlinky.chromeApps.chromeAppsStrings.pointerdown
import typingsSlinky.chromeApps.chromeAppsStrings.pointerenter
import typingsSlinky.chromeApps.chromeAppsStrings.pointerleave
import typingsSlinky.chromeApps.chromeAppsStrings.pointermove
import typingsSlinky.chromeApps.chromeAppsStrings.pointerout
import typingsSlinky.chromeApps.chromeAppsStrings.pointerover
import typingsSlinky.chromeApps.chromeAppsStrings.pointerup
import typingsSlinky.chromeApps.chromeAppsStrings.progress_
import typingsSlinky.chromeApps.chromeAppsStrings.ratechange
import typingsSlinky.chromeApps.chromeAppsStrings.reset
import typingsSlinky.chromeApps.chromeAppsStrings.resize
import typingsSlinky.chromeApps.chromeAppsStrings.responsive
import typingsSlinky.chromeApps.chromeAppsStrings.scroll
import typingsSlinky.chromeApps.chromeAppsStrings.securitypolicyviolation
import typingsSlinky.chromeApps.chromeAppsStrings.seeked
import typingsSlinky.chromeApps.chromeAppsStrings.seeking
import typingsSlinky.chromeApps.chromeAppsStrings.select
import typingsSlinky.chromeApps.chromeAppsStrings.selectionchange
import typingsSlinky.chromeApps.chromeAppsStrings.selectstart
import typingsSlinky.chromeApps.chromeAppsStrings.sizechanged
import typingsSlinky.chromeApps.chromeAppsStrings.stalled
import typingsSlinky.chromeApps.chromeAppsStrings.submit
import typingsSlinky.chromeApps.chromeAppsStrings.suspend_
import typingsSlinky.chromeApps.chromeAppsStrings.timeupdate
import typingsSlinky.chromeApps.chromeAppsStrings.toggle
import typingsSlinky.chromeApps.chromeAppsStrings.touchcancel
import typingsSlinky.chromeApps.chromeAppsStrings.touchend
import typingsSlinky.chromeApps.chromeAppsStrings.touchmove
import typingsSlinky.chromeApps.chromeAppsStrings.touchstart
import typingsSlinky.chromeApps.chromeAppsStrings.transitioncancel
import typingsSlinky.chromeApps.chromeAppsStrings.transitionend
import typingsSlinky.chromeApps.chromeAppsStrings.transitionrun
import typingsSlinky.chromeApps.chromeAppsStrings.transitionstart
import typingsSlinky.chromeApps.chromeAppsStrings.unresponsive
import typingsSlinky.chromeApps.chromeAppsStrings.volumechange
import typingsSlinky.chromeApps.chromeAppsStrings.waiting
import typingsSlinky.chromeApps.chromeAppsStrings.wheel
import typingsSlinky.chromeApps.chromeAppsStrings.zoomchange
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.SecurityPolicyViolationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Type definitions for Chrome packaged application development
// Project: http://developer.chrome.com/apps/
// Definitions by: Nikolai Ommundsen <https://github.com/niikoo>, Adam Lay <https://github.com/AdamLay>, MIZUNE Pine <https://github.com/pine613>, MIZUSHIMA Junki <https://github.com/mzsm>, Ingconst Stepanyan <https://github.com/RReverser>, Adam Pyle <https://github.com/pyle>, Matthew Kimber <https://github.com/matthewkimber>, otiai10 <https://github.com/otiai10>, couven92 <https://github.com/couven92>, RReverser <https://github.com/rreverser>, sreimer15 <https://github.com/sreimer15>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.8
/////////////////
// Webview Tag //
/////////////////
/**
  * Use the webview tag to actively load live content from the web over the network and embed it in your Chrome App.
  * Your app can control the appearance of the *webview* and interact with the web content, initiate navigations in
  * an embedded web page, react to error events that happen within it.
  */
@js.native
trait HTMLWebViewElement extends HTMLElement {
  /**
    * Allow scaling?
    * @default false
    */
  var allowscaling: js.UndefOr[Boolean] = js.native
  /**
    * If present, portions of the embedder could be visible through the webview,
    * where the contents are transparent. Without allowtransparency enabled,
    * no part of the embedder will be shown through the webview,
    * even if elements exist that are specified as transparent.
    * This does not affect transparency within the contents of the webview itself.
    */
  var allowtransparency: js.UndefOr[Boolean] = js.native
  /**
    * If 'on', the webview container will automatically resize within the bounds specified by the attributes minwidth, minheight, maxwidth, and maxheight.
    * These constraints do not impact the webview UNLESS autosize is enabled.
    * When autosize is enabled, the webview container size cannot be less than the minimum values or greater than the maximum.
    */
  var autosize: js.UndefOr[on | Boolean] = js.native
  /**
    * Object reference which can be used to post messages into the guest page.
    */
  var contentWindow: ContentWindow = js.native
  /** Similar to chrome's ContextMenus API, but applies to webview instead of browser.
    * Use the webview.contextMenus API to add items to webview's context menu.
    * You can choose what types of objects your context menu additions apply to, such as images, hyperlinks, and pages. */
  var contextMenus: ContextMenus = js.native
  ///
  /// STYLE
  ///
  /** Maximum height */
  var maxheight: Double = js.native
  /** Maximum width */
  var maxwidth: Double = js.native
  /** Minimum height */
  var minheight: Double = js.native
  /** Minimum width */
  var minwidth: Double = js.native
  /** This sets the guest content's window.name object.**/
  var name: String = js.native
  ///
  /// DOM Events
  ///
  /** Fired when the guest window logs a console message. */
  var onconsolemessage: (js.ThisFunction1[/* this */ this.type, /* ev */ ConsoleMessageEvent, _]) | Null = js.native
  /**
    * Fired when the guest window fires a load event, i.e.,
    * when a new document is loaded. This does not include
    * page navigation within the current document or
    * asynchronous resource loads.
    */
  var oncontentload: (js.ThisFunction1[/* this */ this.type, Event, _]) | Null = js.native
  /**
    * Fired when the guest window attempts to open a modal dialog via
    * window.alert, window.confirm, or window.prompt.
    * Handling this event will block the guest process until each event listener
    * returns or the dialog object becomes unreachable
    * (if preventDefault() was called.)
    */
  var ondialog: (js.ThisFunction1[/* this */ this.type, /* ev */ DialogEvent, _]) | Null = js.native
  /**
    * Fired when the process rendering the guest web content has exited.
    */
  var onexit: (js.ThisFunction1[/* this */ this.type, /* ev */ ExitEvent, _]) | Null = js.native
  /**
    * Fired when new find results are available for an active find request.
    * This might happen multiple times for a single find request as matches are found.
    */
  var onfindupdate: (js.ThisFunction1[/* this */ this.type, /* ev */ FindUpdateEvent, _]) | Null = js.native
  /**
    * Fired when a top-level load has aborted without committing.
    * An error message will be printed to the console unless the
    * event is default-prevented.
    *
    * Note: When a resource load is aborted, a loadabort event will
    * eventually be followed by a loadstop event, even if all
    * committed loads since the last loadstop event (if any) were aborted.
    *
    * Note: When the load of either an about URL or a JavaScript URL is aborted,
    * loadabort will be fired and then the webview will be navigated to 'about:blank'.
    */
  var onloadabort: (js.ThisFunction1[/* this */ this.type, /* ev */ LoadAbortEvent, _]) | Null = js.native
  /**
    * Fired when a load has committed. This includes navigation within the current document
    * as well as subframe document-level loads, but does not include asynchronous resource loads.
    */
  var onloadcommit: (js.ThisFunction1[/* this */ this.type, /* ev */ LoadCommitEvent, _]) | Null = js.native
  /**
    * Fired when a top-level load request has redirected to a different URL.
    */
  var onloadredirect: (js.ThisFunction1[/* this */ this.type, /* ev */ LoadRedirectEvent, _]) | Null = js.native
  /**
    * Fired when all frame-level loads in a guest page (including all its subframes)
    * have completed. This includes navigation within the current document as well
    * as subframe document-level loads, but does not include asynchronous resource
    * loads. This event fires every time the number of document-level loads
    * transitions from one (or more) to zero. For example, if a page that has
    * already finished loading (i.e., loadstop already fired once) creates a new
    * iframe which loads a page, then a second loadstop will fire when the iframe
    * page load completes. This pattern is commonly observed on pages that load ads.
    *
    * Note: When a committed load is aborted, a loadstop event will eventually
    * follow a loadabort event, even if all committed loads since the last loadstop
    * event (if any) were aborted.
    */
  var onloadstop: (js.ThisFunction1[/* this */ this.type, Event, _]) | Null = js.native
  /**
    * Fired when the guest page attempts to open a new browser window.
    */
  var onnewwwindow: (js.ThisFunction1[/* this */ this.type, /* ev */ NewWindowEvent, _]) | Null = js.native
  /**
    * Fired when the guest page needs to request special permission from the embedder.
    */
  var onpermissionrequest: (js.ThisFunction1[/* this */ this.type, /* ev */ PermissionRequestEvent, _]) | Null = js.native
  /**
    * Fired when the process rendering the guest web content has become responsive again after being unresponsive.
    */
  var onresponsive: (js.ThisFunction1[/* this */ this.type, /* ev */ ResponsiveEvent, _]) | Null = js.native
  /**
    * @requires autosize: enabled
    * Fired when the embedded web content has been resized via autosize.
    * Only fires if autosize is enabled.
    */
  var onsizechanged: (js.ThisFunction1[/* this */ this.type, /* ev */ SizeChangedEvent, _]) | Null = js.native
  /**
    * Fired when the process rendering the guest web content has become unresponsive.
    * This event will be generated once with a matching responsive event if the guest
    * begins to respond again.
    */
  var onunresponsive: (js.ThisFunction1[/* this */ this.type, /* ev */ UnresponsiveEvent, _]) | Null = js.native
  /**
    * Fired when the page's zoom changes.
    */
  var onzoomchange: (js.ThisFunction1[/* this */ this.type, /* ev */ ZoomChangeEvent, _]) | Null = js.native
  /**
    * Storage partition ID used by the webview tag.
    * If the storage partition ID starts with persist: (partition='persist:googlepluswidgets'),
    * the webview will use a persistent storage partition available to all guests in the app with the same storage partition ID.
    * If the ID is unset or if there is no 'persist': prefix, the webview will use an in-memory storage partition.
    * This value can only be modified before the first navigation, since the storage partition of an active renderer process cannot change.
    * Subsequent attempts to modify the value will fail with a DOM exception.
    * By assigning the same partition ID, multiple webviews can share the same storage partition.
    */
  var partition: js.UndefOr[String] = js.native
  /** Interface which provides access to webRequest events on the guest page. */
  var request: WebRequestEventInterface = js.native
  /**
    * Returns the visible URL. Mirrors the logic in the browser's omnibox: either returning a pending new navigation if initiated by the embedder page, or the last committed navigation. Writing to this attribute initiates top-level navigation.
    * Assigning src its own value will reload the current page.
    * The src attribute cannot be cleared or removed once it has been set, unless the webview is removed from the DOM.
    * The src attribute can also accept data URLs, such as 'data:text/plain,Hello, world!'.
    */
  var src: String = js.native
  /**
    * Adds content script injection rules to the webview.
    * When the webview navigates to a page matching one or more rules, the associated scripts will be injected.
    * You can programmatically add rules or update existing rules.
    * The following example adds two rules to the webview: 'myRule' and 'anotherRule'.
    * @example
    * webview.addContentScripts([
    * {
    *    name: 'myRule',
    *    matches: ['http://www.foo.com/ *'],
    *    css: { files: ['mystyles.css'] },
    *    js: { files: ['jquery.js', 'myscript.js'] },
    *    run_at: 'document_start'
    *  },
    *  {
    *    name: 'anotherRule',
    *    matches: ['http://www.bar.com/ *'],
    *    js: { code: 'document.body.style.backgroundColor = 'red';' },
    *    run_at: 'document_end'
    *  }]);
    * ...
    * // Navigates webview.
    * webview.src = 'http://www.foo.com';
    *
    * @description
    * You can defer addContentScripts call until you needs to inject scripts.
    * The following example shows how to overwrite an existing rule.
    * @example
    * webview.addContentScripts([{
    *    name: 'rule',
    *    matches: ['http://www.foo.com/ *'],
    *    js: { files: ['scriptA.js'] },
    *    run_at: 'document_start'}]);
    *
    * // Do something.
    * webview.src = 'http://www.foo.com/ *';
    * ...
    * // Overwrite 'rule' defined before.
    * webview.addContentScripts([{
    *   name: 'rule',
    *   matches: ['http://www.bar.com/ *'],
    *   js: { files: ['scriptB.js'] },
    *   run_at: 'document_end'}]);
    * @description
    * If webview has been naviagted to the origin (e.g., foo.com) and
    * calls webview.addContentScripts to add 'myRule',
    * you need to wait for next navigation to make the scripts injected.
    * If you want immediate injection, executeScript will do the right thing.
    * Rules are preserved even if the guest process crashes
    * or is killed or even if the webview is reparented.
    * Refer to the /extensions/content_scripts documentation for more details.
    * @param contentScriptList Details of the content scripts to add.
    * @since Chrome 44.
    */
  def addContentScripts(contentScriptList: js.Array[ContentScriptDetails]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(`type`: auxclick, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(`type`: blur, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(`type`: cancel, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(`type`: canplay, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(`type`: click, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ HTMLElement, Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ HTMLElement, Event, _], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ HTMLElement, Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_consolemessage(
    `type`: consolemessage,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ConsoleMessageEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_consolemessage(
    `type`: consolemessage,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ConsoleMessageEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_consolemessage(
    `type`: consolemessage,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ConsoleMessageEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contentload(`type`: contentload, listener: js.ThisFunction1[/* this */ HTMLElement, Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contentload(
    `type`: contentload,
    listener: js.ThisFunction1[/* this */ HTMLElement, Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contentload(
    `type`: contentload,
    listener: js.ThisFunction1[/* this */ HTMLElement, Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(`type`: contextmenu, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(`type`: copy, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(`type`: cut, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(`type`: dblclick, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dialog(`type`: dialog, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DialogEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dialog(
    `type`: dialog,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DialogEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dialog(
    `type`: dialog,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DialogEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(`type`: drag, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(`type`: dragend, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(`type`: dragenter, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(`type`: dragexit, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: dragexit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: dragexit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(`type`: dragleave, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(`type`: dragover, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(`type`: dragstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(`type`: drop, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(`type`: durationchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(`type`: emptied, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(`type`: exit, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ExitEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(
    `type`: exit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ExitEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(
    `type`: exit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ExitEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_findupdate(
    `type`: findupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FindUpdateEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_findupdate(
    `type`: findupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FindUpdateEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_findupdate(
    `type`: findupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FindUpdateEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(`type`: focus, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(`type`: focusin, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(`type`: focusout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: fullscreenchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: fullscreenchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(`type`: fullscreenerror, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: fullscreenerror,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: fullscreenerror,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(`type`: input_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: input_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: input_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(`type`: invalid, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(`type`: keydown, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(`type`: keypress, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(`type`: keyup, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadabort(`type`: loadabort, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadAbortEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadabort(
    `type`: loadabort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadAbortEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadabort(
    `type`: loadabort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadAbortEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadcommit(
    `type`: loadcommit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadCommitEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadcommit(
    `type`: loadcommit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadCommitEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadcommit(
    `type`: loadcommit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadCommitEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(`type`: loadeddata, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadredirect(
    `type`: loadredirect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadRedirectEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadredirect(
    `type`: loadredirect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadRedirectEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadredirect(
    `type`: loadredirect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadRedirectEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(`type`: loadstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadStartEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadStartEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadStartEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstop(`type`: loadstop, listener: js.ThisFunction1[/* this */ HTMLElement, Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstop(`type`: loadstop, listener: js.ThisFunction1[/* this */ HTMLElement, Event, _], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstop(
    `type`: loadstop,
    listener: js.ThisFunction1[/* this */ HTMLElement, Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(`type`: mousedown, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(`type`: mouseenter, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(`type`: mouseleave, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(`type`: mousemove, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(`type`: mouseout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(`type`: mouseover, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(`type`: mouseup, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_newwindow(`type`: newwindow, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ NewWindowEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_newwindow(
    `type`: newwindow,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ NewWindowEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_newwindow(
    `type`: newwindow,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ NewWindowEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(`type`: paste, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_permissionrequest(
    `type`: permissionrequest,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PermissionRequestEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_permissionrequest(
    `type`: permissionrequest,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PermissionRequestEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_permissionrequest(
    `type`: permissionrequest,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PermissionRequestEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(`type`: play, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(`type`: playing, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(`type`: pointerdown, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(`type`: pointerenter, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(`type`: pointerleave, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(`type`: pointermove, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(`type`: pointerout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(`type`: pointerover, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(`type`: pointerup, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(`type`: progress_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(`type`: ratechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(`type`: reset, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(`type`: resize, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_responsive(
    `type`: responsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ResponsiveEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_responsive(
    `type`: responsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ResponsiveEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_responsive(
    `type`: responsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ResponsiveEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(`type`: scroll, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(`type`: seeked, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(`type`: seeking, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(`type`: selectionchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(`type`: selectstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sizechanged(
    `type`: sizechanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SizeChangedEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sizechanged(
    `type`: sizechanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SizeChangedEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sizechanged(
    `type`: sizechanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SizeChangedEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(`type`: stalled, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(`type`: suspend_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: suspend_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: suspend_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(`type`: timeupdate, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(`type`: toggle, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(`type`: touchcancel, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(`type`: touchend, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(`type`: touchmove, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(`type`: touchstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unresponsive(
    `type`: unresponsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UnresponsiveEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unresponsive(
    `type`: unresponsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UnresponsiveEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unresponsive(
    `type`: unresponsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UnresponsiveEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(`type`: volumechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(`type`: waiting, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(`type`: wheel, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_zoomchange(
    `type`: zoomchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ZoomChangeEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_zoomchange(
    `type`: zoomchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ZoomChangeEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_zoomchange(
    `type`: zoomchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ZoomChangeEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  /**
    * Navigates backward one history entry if possible.
    * Equivalent to go(-1).
    * @param [callback] Called after the navigation has either failed or completed successfully. Success parameter indicates whether the navigation was successful.
    */
  def back(): Unit = js.native
  def back(callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  /**
    * Indicates whether or not it is possible to navigate backward through history.
    * The state of this function is cached, and updated before each loadcommit,
    * so the best place to call it is on loadcommit.
    */
  def canGoBack(): Unit = js.native
  /**
    * Indicates whether or not it is possible to navigate forward through history.
    * The state of this function is cached, and updated before each loadcommit,
    * so the best place to call it is on loadcommit.
    */
  def canGoForward(): Unit = js.native
  /**
    * Captures the visible region of the webview.
    * @param callback Provides a data URL which encodes an image of the visible area of the captured webview.
    *                 May be assigned to the 'src' property of an HTML Image element for display.
    * @since Chrome 50.
    */
  def captureVisibleRegion(callback: js.Function1[/* dataUrl */ String, Unit]): Unit = js.native
  /**
    * Captures the visible region of the webview.
    * @param options Extension type
    * @param callback Provides a data URL which encodes an image of the visible area of the captured webview.
    *                 May be assigned to the 'src' property of an HTML Image element for display.
    * @since Chrome 50.
    */
  def captureVisibleRegion(options: ImageDetails, callback: js.Function1[/* dataUrl */ String, Unit]): Unit = js.native
  /**
    * Clears browsing data for the webview partition.
    * @param options Options determining which data to clear.
    * @param types The types of data to be cleared.
    * @param callback Called after the data has been successfully cleared.
    * @since Chrome 33.
    */
  def clearData(options: ClearDataOptions, types: ClearDataTypeSet): Unit = js.native
  def clearData(options: ClearDataOptions, types: ClearDataTypeSet, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Injects JavaScript code into the guest page.
    * The following sample code uses script injection
    * to set the guest page's background color to red:
    * @example
    * webview.executeScript({ code: 'document.body.style.backgroundColor = 'red'' });
    * @param details  Details of the script to run.
    * @param [callback] Called after all the JavaScript has been executed.
    */
  def executeScript(details: InjectDetails): Unit = js.native
  def executeScript(details: InjectDetails, callback: js.Function1[/* result */ js.UndefOr[js.Array[_]], Unit]): Unit = js.native
  /**
    * Initiates a find-in-page request.
    * @param searchText The string to find in the page.
    * @param [options]  Options for the find request.
    * @param [callback] Called after all find results have been returned for this find request.
    *                 Provides optionally:
    *                 results: Contains all of the results of the find request.
    *                 results can be omitted if it is not utilized in the callback function body;
    *                 e.g. if the callback is only used to discern when the find request has completed.
    */
  def find(searchText: String): Unit = js.native
  def find(searchText: String, options: FindOptions): Unit = js.native
  def find(
    searchText: String,
    options: FindOptions,
    callback: js.Function1[/* results */ js.UndefOr[FindCallbackResults], Unit]
  ): Unit = js.native
  /**
    * Navigates forward one history entry if possible. Equivalent to go(1).
    * @param [callback] Called after the navigation has either failed or completed successfully.
    *                   Provides *success* which indicates whether the navigation was successful.
    */
  def forward(): Unit = js.native
  def forward(callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  /**
    * Queries audio state.
    * @since Chrome 62.
    **/
  def getAudioState(callback: js.Function1[/* audible */ Boolean, Unit]): Unit = js.native
  /**
    * Returns Chrome's internal process ID for the guest web page's current process,
    * allowing embedders to know how many guests would be affected by terminating
    * the process. Two guests will share a process only if they belong to the same
    * app and have the same **storage partition ID**. The call is synchronous and returns
    * the embedder's cached notion of the current process ID. The process ID isn't
    * the same as the operating system's process ID.
    */
  def getProcessId(): integer = js.native
  /**
    * Returns the user agent string used by the webview for guest page requests.
    * @since Chrome 33.
    */
  def getUserAgent(): String = js.native
  /**
    * Gets the current zoom factor.
    * @param callback Called after the current zoom factor is retrieved. Provides the current zoom factor.
    * @since Chrome 36.
    */
  def getZoom(callback: js.Function1[/* zoomFactor */ double, Unit]): Unit = js.native
  /**
    * Gets the current zoom mode.
    * @param callback Called with the webview's current zoom mode.
    * @since Chrome 43.
    */
  def getZoomMode(callback: js.Function1[/* ZoomMode */ ZoomMode, Unit]): Unit = js.native
  /**
    * Navigates to a history entry using a history index relative to the current navigation.
    * If the requested navigation is impossible, this method has no effect.
    * @param relativeIndex Relative history index to which the webview should be navigated.
    *                      For example, a value of 2 will navigate forward 2 history entries if possible;
    *                        a value of -3 will navigate backward 3 entries.
    * @param [callback] Called after the navigation has either failed or completed successfully.
    *                   Provides a boolean, *success*, which indicates whether the navigation was successful.
    */
  def go(relativeIndex: integer): Unit = js.native
  def go(relativeIndex: integer, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  /**
    * Injects CSS into the guest page.
    * @param details Details of the CSS to insert.
    * @param callback Called after the CSS has been inserted.
    */
  def insertCSS(details: InjectDetails): Unit = js.native
  def insertCSS(details: InjectDetails, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Queries whether audio is muted.
    * @since Chrome 62.
    */
  def isAudioMuted(callback: js.Function1[/* muted */ Boolean, Unit]): Unit = js.native
  /**
    * @since Chrome 71
    * @description Queries whether spatial navigation is enabled for the webview.
    * @param callback Callback that will provide the value of the spatial navigation state.
    */
  def isSpatialNavigationEnabled(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit = js.native
  /**
    * Indicates whether or not the webview's user agent string has been overridden by *setUserAgentOverride*.
    * @since Chrome 33.
    */
  def isUserAgentOverridden(): Unit = js.native
  /**
    * Loads a data URL with a specified base URL used for relative links.
    * Optionally, a virtual URL can be provided to be shown to the user instead of the data URL.
    * @param dataUrl The data URL to load.
    * @param baseUrl The base URL that will be used for relative links.
    * @param virtualUrl The URL that will be displayed to the user (in the address bar).
    * @since Chrome 40.
    */
  def loadDataWithBaseUrl(dataUrl: String, baseUrl: String): Unit = js.native
  def loadDataWithBaseUrl(dataUrl: String, baseUrl: String, virtualUrl: String): Unit = js.native
  /**
    * Prints the contents of the webview.
    * This is equivalent to calling scripted print function from the webview itself.
    * @since Chrome 38.
    */
  def print(): Unit = js.native
  /** Reloads the current top-level page. */
  def reload(): Unit = js.native
  /**
    * Removes content scripts from a webview.
    * The following example removes 'myRule' which was added before.
    * @example webview.removeContentScripts(['myRule']);
    * @description You can remove all the rules by calling:
    * @example webview.removeContentScripts();
    * @param scriptNameList A list of names of content scripts that will be removed.
    *                       If the list is empty, all the content scripts added to the webview will be removed.
    * @since Chrome 44.
    */
  def removeContentScripts(): Unit = js.native
  def removeContentScripts(scriptNameList: js.Array[String]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(`type`: abort_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(`type`: auxclick, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(`type`: blur, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(`type`: cancel, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(`type`: canplay, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(`type`: click, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ HTMLElement, Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ HTMLElement, Event, _], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ HTMLElement, Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_consolemessage(
    `type`: consolemessage,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ConsoleMessageEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_consolemessage(
    `type`: consolemessage,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ConsoleMessageEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_consolemessage(
    `type`: consolemessage,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ConsoleMessageEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contentload(`type`: contentload, listener: js.ThisFunction1[/* this */ HTMLElement, Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contentload(
    `type`: contentload,
    listener: js.ThisFunction1[/* this */ HTMLElement, Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contentload(
    `type`: contentload,
    listener: js.ThisFunction1[/* this */ HTMLElement, Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(`type`: contextmenu, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_copy(`type`: copy, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(`type`: cut, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(`type`: dblclick, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dialog(`type`: dialog, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DialogEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dialog(
    `type`: dialog,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DialogEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dialog(
    `type`: dialog,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DialogEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(`type`: drag, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(`type`: dragend, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(`type`: dragenter, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(`type`: dragexit, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: dragexit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: dragexit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(`type`: dragleave, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(`type`: dragover, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(`type`: dragstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(`type`: drop, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(`type`: durationchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(`type`: emptied, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_exit(`type`: exit, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ExitEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_exit(
    `type`: exit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ExitEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_exit(
    `type`: exit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ExitEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_findupdate(
    `type`: findupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FindUpdateEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_findupdate(
    `type`: findupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FindUpdateEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_findupdate(
    `type`: findupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FindUpdateEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(`type`: focus, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusin(`type`: focusin, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusout(`type`: focusout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: fullscreenchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: fullscreenchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(`type`: fullscreenerror, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: fullscreenerror,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: fullscreenerror,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(`type`: input_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: input_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: input_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(`type`: invalid, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(`type`: keydown, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(`type`: keypress, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(`type`: keyup, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadabort(`type`: loadabort, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadAbortEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadabort(
    `type`: loadabort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadAbortEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadabort(
    `type`: loadabort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadAbortEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadcommit(
    `type`: loadcommit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadCommitEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadcommit(
    `type`: loadcommit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadCommitEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadcommit(
    `type`: loadcommit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadCommitEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(`type`: loadeddata, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadredirect(
    `type`: loadredirect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadRedirectEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadredirect(
    `type`: loadredirect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadRedirectEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadredirect(
    `type`: loadredirect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadRedirectEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(`type`: loadstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadStartEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadStartEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadStartEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstop(`type`: loadstop, listener: js.ThisFunction1[/* this */ HTMLElement, Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstop(`type`: loadstop, listener: js.ThisFunction1[/* this */ HTMLElement, Event, _], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstop(
    `type`: loadstop,
    listener: js.ThisFunction1[/* this */ HTMLElement, Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(`type`: mousedown, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(`type`: mouseenter, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(`type`: mouseleave, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(`type`: mousemove, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(`type`: mouseout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(`type`: mouseover, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(`type`: mouseup, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_newwindow(`type`: newwindow, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ NewWindowEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_newwindow(
    `type`: newwindow,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ NewWindowEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_newwindow(
    `type`: newwindow,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ NewWindowEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(`type`: paste, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_permissionrequest(
    `type`: permissionrequest,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PermissionRequestEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_permissionrequest(
    `type`: permissionrequest,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PermissionRequestEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_permissionrequest(
    `type`: permissionrequest,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PermissionRequestEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(`type`: play, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(`type`: playing, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(`type`: pointerdown, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(`type`: pointerenter, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(`type`: pointerleave, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(`type`: pointermove, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(`type`: pointerout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(`type`: pointerover, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(`type`: pointerup, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(`type`: progress_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(`type`: ratechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(`type`: reset, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(`type`: resize, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_responsive(
    `type`: responsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ResponsiveEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_responsive(
    `type`: responsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ResponsiveEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_responsive(
    `type`: responsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ResponsiveEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(`type`: scroll, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(`type`: seeked, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(`type`: seeking, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(`type`: selectionchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(`type`: selectstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sizechanged(
    `type`: sizechanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SizeChangedEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sizechanged(
    `type`: sizechanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SizeChangedEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sizechanged(
    `type`: sizechanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SizeChangedEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(`type`: stalled, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(`type`: suspend_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: suspend_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: suspend_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(`type`: timeupdate, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(`type`: toggle, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(`type`: touchcancel, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(`type`: touchend, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(`type`: touchmove, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(`type`: touchstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unresponsive(
    `type`: unresponsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UnresponsiveEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unresponsive(
    `type`: unresponsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UnresponsiveEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unresponsive(
    `type`: unresponsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UnresponsiveEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(`type`: volumechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(`type`: waiting, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(`type`: wheel, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomchange(
    `type`: zoomchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ZoomChangeEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomchange(
    `type`: zoomchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ZoomChangeEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomchange(
    `type`: zoomchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ZoomChangeEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  /** Set an attribute */
  def setAttribute(attributeName: String, value: String): Unit = js.native
  def setAttribute(attributeName: String, value: Boolean): Unit = js.native
  def setAttribute(attributeName: String, value: Double): Unit = js.native
  /**
    * Sets audio mute state of the webview.
    * @param mute Mute audio value
    * @since Chrome 62.
    */
  def setAudioMuted(mute: Boolean): Unit = js.native
  /**
    * @since Chrome 71
    * @description Sets spatial navigation state of the webview.
    * @param enabled Spatial navigation state value.
    */
  def setSpatialNavigationEnabled(enabled: Boolean): Unit = js.native
  /**
    * Override the user agent string used by the webview for guest page requests.
    * @param userAgent The user agent string to use.
    * @since Chrome 33.
    */
  def setUserAgentOverride(userAgent: String): Unit = js.native
  /**
    * Changes the zoom factor of the page.
    * The scope and persistence of this change
    * are determined by the webview's current zoom mode.
    * @param zoomFactor The new zoom factor.
    * @param [callback] Called after the page has been zoomed.
    * @since Chrome 36.
    */
  def setZoom(zoomFactor: double): Unit = js.native
  def setZoom(zoomFactor: double, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Sets the zoom mode of the webview.
    * @param ZoomMode Defines how zooming is handled in the webview.
    * @param [callback] Called after the zoom mode has been changed.
    * @since Chrome 43.
    */
  def setZoomMode(ZoomMode: ZoomMode): Unit = js.native
  def setZoomMode(ZoomMode: ZoomMode, callback: js.Function0[Unit]): Unit = js.native
  /** Stops loading the current webview navigation if in progress. */
  def stop(): Unit = js.native
  /**
    * Ends the current find session (clearing all highlighting)
    * and cancels all find requests in progress.
    * @param action Determines what to do with the active match after the find session has ended.
    *               *clear* will clear the highlighting over the active match;
    *               keep will keep the active match highlighted;
    *               activate will keep the active match highlighted and simulate a user click on that match.
    *               The default action is keep.
    * @since Chrome 35.
    */
  def stopFinding(): Unit = js.native
  @JSName("stopFinding")
  def stopFinding_activate(action: activate): Unit = js.native
  @JSName("stopFinding")
  def stopFinding_clear(action: clear): Unit = js.native
  @JSName("stopFinding")
  def stopFinding_keep(action: keep): Unit = js.native
  /**
    * Forcibly kills the guest web page's renderer process.
    * This may affect multiple webview tags in the current app if they share the same process,
    * but it will not affect webview tags in other apps.
    */
  def terminate(): Unit = js.native
}

