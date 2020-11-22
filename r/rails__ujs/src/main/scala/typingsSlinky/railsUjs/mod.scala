package typingsSlinky.railsUjs

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.railsUjs.ajaxMod.AjaxOptions
import typingsSlinky.railsUjs.domMod.SelectorObject
import typingsSlinky.railsUjs.railsUjsStrings.abort
import typingsSlinky.railsUjs.railsUjsStrings.animationcancel
import typingsSlinky.railsUjs.railsUjsStrings.animationend
import typingsSlinky.railsUjs.railsUjsStrings.animationiteration
import typingsSlinky.railsUjs.railsUjsStrings.animationstart
import typingsSlinky.railsUjs.railsUjsStrings.auxclick
import typingsSlinky.railsUjs.railsUjsStrings.blur
import typingsSlinky.railsUjs.railsUjsStrings.cancel
import typingsSlinky.railsUjs.railsUjsStrings.canplay
import typingsSlinky.railsUjs.railsUjsStrings.canplaythrough
import typingsSlinky.railsUjs.railsUjsStrings.change
import typingsSlinky.railsUjs.railsUjsStrings.click
import typingsSlinky.railsUjs.railsUjsStrings.close
import typingsSlinky.railsUjs.railsUjsStrings.contextmenu
import typingsSlinky.railsUjs.railsUjsStrings.copy
import typingsSlinky.railsUjs.railsUjsStrings.cuechange
import typingsSlinky.railsUjs.railsUjsStrings.cut
import typingsSlinky.railsUjs.railsUjsStrings.dblclick
import typingsSlinky.railsUjs.railsUjsStrings.drag
import typingsSlinky.railsUjs.railsUjsStrings.dragend
import typingsSlinky.railsUjs.railsUjsStrings.dragenter
import typingsSlinky.railsUjs.railsUjsStrings.dragexit
import typingsSlinky.railsUjs.railsUjsStrings.dragleave
import typingsSlinky.railsUjs.railsUjsStrings.dragover
import typingsSlinky.railsUjs.railsUjsStrings.dragstart
import typingsSlinky.railsUjs.railsUjsStrings.drop
import typingsSlinky.railsUjs.railsUjsStrings.durationchange
import typingsSlinky.railsUjs.railsUjsStrings.emptied
import typingsSlinky.railsUjs.railsUjsStrings.ended
import typingsSlinky.railsUjs.railsUjsStrings.error
import typingsSlinky.railsUjs.railsUjsStrings.focus
import typingsSlinky.railsUjs.railsUjsStrings.focusin
import typingsSlinky.railsUjs.railsUjsStrings.focusout
import typingsSlinky.railsUjs.railsUjsStrings.fullscreenchange
import typingsSlinky.railsUjs.railsUjsStrings.fullscreenerror
import typingsSlinky.railsUjs.railsUjsStrings.gotpointercapture
import typingsSlinky.railsUjs.railsUjsStrings.input
import typingsSlinky.railsUjs.railsUjsStrings.invalid
import typingsSlinky.railsUjs.railsUjsStrings.keydown
import typingsSlinky.railsUjs.railsUjsStrings.keypress
import typingsSlinky.railsUjs.railsUjsStrings.keyup
import typingsSlinky.railsUjs.railsUjsStrings.load
import typingsSlinky.railsUjs.railsUjsStrings.loadeddata
import typingsSlinky.railsUjs.railsUjsStrings.loadedmetadata
import typingsSlinky.railsUjs.railsUjsStrings.loadstart
import typingsSlinky.railsUjs.railsUjsStrings.lostpointercapture
import typingsSlinky.railsUjs.railsUjsStrings.mousedown
import typingsSlinky.railsUjs.railsUjsStrings.mouseenter
import typingsSlinky.railsUjs.railsUjsStrings.mouseleave
import typingsSlinky.railsUjs.railsUjsStrings.mousemove
import typingsSlinky.railsUjs.railsUjsStrings.mouseout
import typingsSlinky.railsUjs.railsUjsStrings.mouseover
import typingsSlinky.railsUjs.railsUjsStrings.mouseup
import typingsSlinky.railsUjs.railsUjsStrings.paste
import typingsSlinky.railsUjs.railsUjsStrings.pause
import typingsSlinky.railsUjs.railsUjsStrings.play
import typingsSlinky.railsUjs.railsUjsStrings.playing
import typingsSlinky.railsUjs.railsUjsStrings.pointercancel
import typingsSlinky.railsUjs.railsUjsStrings.pointerdown
import typingsSlinky.railsUjs.railsUjsStrings.pointerenter
import typingsSlinky.railsUjs.railsUjsStrings.pointerleave
import typingsSlinky.railsUjs.railsUjsStrings.pointermove
import typingsSlinky.railsUjs.railsUjsStrings.pointerout
import typingsSlinky.railsUjs.railsUjsStrings.pointerover
import typingsSlinky.railsUjs.railsUjsStrings.pointerup
import typingsSlinky.railsUjs.railsUjsStrings.progress
import typingsSlinky.railsUjs.railsUjsStrings.ratechange
import typingsSlinky.railsUjs.railsUjsStrings.reset
import typingsSlinky.railsUjs.railsUjsStrings.resize
import typingsSlinky.railsUjs.railsUjsStrings.scroll
import typingsSlinky.railsUjs.railsUjsStrings.securitypolicyviolation
import typingsSlinky.railsUjs.railsUjsStrings.seeked
import typingsSlinky.railsUjs.railsUjsStrings.seeking
import typingsSlinky.railsUjs.railsUjsStrings.select
import typingsSlinky.railsUjs.railsUjsStrings.selectionchange
import typingsSlinky.railsUjs.railsUjsStrings.selectstart
import typingsSlinky.railsUjs.railsUjsStrings.stalled
import typingsSlinky.railsUjs.railsUjsStrings.submit
import typingsSlinky.railsUjs.railsUjsStrings.suspend
import typingsSlinky.railsUjs.railsUjsStrings.timeupdate
import typingsSlinky.railsUjs.railsUjsStrings.toggle
import typingsSlinky.railsUjs.railsUjsStrings.touchcancel
import typingsSlinky.railsUjs.railsUjsStrings.touchend
import typingsSlinky.railsUjs.railsUjsStrings.touchmove
import typingsSlinky.railsUjs.railsUjsStrings.touchstart
import typingsSlinky.railsUjs.railsUjsStrings.transitioncancel
import typingsSlinky.railsUjs.railsUjsStrings.transitionend
import typingsSlinky.railsUjs.railsUjsStrings.transitionrun
import typingsSlinky.railsUjs.railsUjsStrings.transitionstart
import typingsSlinky.railsUjs.railsUjsStrings.volumechange
import typingsSlinky.railsUjs.railsUjsStrings.waiting
import typingsSlinky.railsUjs.railsUjsStrings.wheel
import typingsSlinky.std.EventListener
import typingsSlinky.std.SecurityPolicyViolationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@rails/ujs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def CSRFProtection(xhr: XMLHttpRequest): Unit = js.native
  
  @JSName("$")
  def _empty(selector: String): js.Array[Element] = js.native
  
  def ajax(options: AjaxOptions): Unit = js.native
  
  val buttonClickSelector: SelectorObject = js.native
  
  val buttonDisableSelector: String = js.native
  
  def confirm(message: String): Boolean = js.native
  def confirm(message: String, element: Element): Boolean = js.native
  
  def cspNonce(): js.UndefOr[String] = js.native
  
  def csrfParam(): String | Null = js.native
  
  def csrfToken(): String | Null = js.native
  
  def delegate(element: EventTarget, selector: String, eventType: String, handler: EventListener): Unit = js.native
  def delegate(element: EventTarget, selector: SelectorObject, eventType: String, handler: EventListener): Unit = js.native
  @JSName("delegate")
  def delegate_abort(
    element: EventTarget,
    selector: String,
    eventType: abort,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_abort(
    element: EventTarget,
    selector: SelectorObject,
    eventType: abort,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_animationcancel(
    element: EventTarget,
    selector: String,
    eventType: animationcancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_animationcancel(
    element: EventTarget,
    selector: SelectorObject,
    eventType: animationcancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_animationend(
    element: EventTarget,
    selector: String,
    eventType: animationend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_animationend(
    element: EventTarget,
    selector: SelectorObject,
    eventType: animationend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_animationiteration(
    element: EventTarget,
    selector: String,
    eventType: animationiteration,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_animationiteration(
    element: EventTarget,
    selector: SelectorObject,
    eventType: animationiteration,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_animationstart(
    element: EventTarget,
    selector: String,
    eventType: animationstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_animationstart(
    element: EventTarget,
    selector: SelectorObject,
    eventType: animationstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_auxclick(
    element: EventTarget,
    selector: String,
    eventType: auxclick,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_auxclick(
    element: EventTarget,
    selector: SelectorObject,
    eventType: auxclick,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_blur(
    element: EventTarget,
    selector: String,
    eventType: blur,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_blur(
    element: EventTarget,
    selector: SelectorObject,
    eventType: blur,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_cancel(
    element: EventTarget,
    selector: String,
    eventType: cancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_cancel(
    element: EventTarget,
    selector: SelectorObject,
    eventType: cancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_canplay(
    element: EventTarget,
    selector: String,
    eventType: canplay,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_canplay(
    element: EventTarget,
    selector: SelectorObject,
    eventType: canplay,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_canplaythrough(
    element: EventTarget,
    selector: String,
    eventType: canplaythrough,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_canplaythrough(
    element: EventTarget,
    selector: SelectorObject,
    eventType: canplaythrough,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_change(
    element: EventTarget,
    selector: String,
    eventType: change,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_change(
    element: EventTarget,
    selector: SelectorObject,
    eventType: change,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_click(
    element: EventTarget,
    selector: String,
    eventType: click,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_click(
    element: EventTarget,
    selector: SelectorObject,
    eventType: click,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_close(
    element: EventTarget,
    selector: String,
    eventType: close,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_close(
    element: EventTarget,
    selector: SelectorObject,
    eventType: close,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_contextmenu(
    element: EventTarget,
    selector: String,
    eventType: contextmenu,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_contextmenu(
    element: EventTarget,
    selector: SelectorObject,
    eventType: contextmenu,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_copy(
    element: EventTarget,
    selector: String,
    eventType: copy,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_copy(
    element: EventTarget,
    selector: SelectorObject,
    eventType: copy,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_cuechange(
    element: EventTarget,
    selector: String,
    eventType: cuechange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_cuechange(
    element: EventTarget,
    selector: SelectorObject,
    eventType: cuechange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_cut(
    element: EventTarget,
    selector: String,
    eventType: cut,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_cut(
    element: EventTarget,
    selector: SelectorObject,
    eventType: cut,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_dblclick(
    element: EventTarget,
    selector: String,
    eventType: dblclick,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_dblclick(
    element: EventTarget,
    selector: SelectorObject,
    eventType: dblclick,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_drag(
    element: EventTarget,
    selector: String,
    eventType: drag,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_drag(
    element: EventTarget,
    selector: SelectorObject,
    eventType: drag,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_dragend(
    element: EventTarget,
    selector: String,
    eventType: dragend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_dragend(
    element: EventTarget,
    selector: SelectorObject,
    eventType: dragend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_dragenter(
    element: EventTarget,
    selector: String,
    eventType: dragenter,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_dragenter(
    element: EventTarget,
    selector: SelectorObject,
    eventType: dragenter,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_dragexit(
    element: EventTarget,
    selector: String,
    eventType: dragexit,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_dragexit(
    element: EventTarget,
    selector: SelectorObject,
    eventType: dragexit,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_dragleave(
    element: EventTarget,
    selector: String,
    eventType: dragleave,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_dragleave(
    element: EventTarget,
    selector: SelectorObject,
    eventType: dragleave,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_dragover(
    element: EventTarget,
    selector: String,
    eventType: dragover,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_dragover(
    element: EventTarget,
    selector: SelectorObject,
    eventType: dragover,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_dragstart(
    element: EventTarget,
    selector: String,
    eventType: dragstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_dragstart(
    element: EventTarget,
    selector: SelectorObject,
    eventType: dragstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_drop(
    element: EventTarget,
    selector: String,
    eventType: drop,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_drop(
    element: EventTarget,
    selector: SelectorObject,
    eventType: drop,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_durationchange(
    element: EventTarget,
    selector: String,
    eventType: durationchange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_durationchange(
    element: EventTarget,
    selector: SelectorObject,
    eventType: durationchange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_emptied(
    element: EventTarget,
    selector: String,
    eventType: emptied,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_emptied(
    element: EventTarget,
    selector: SelectorObject,
    eventType: emptied,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_ended(
    element: EventTarget,
    selector: String,
    eventType: ended,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_ended(
    element: EventTarget,
    selector: SelectorObject,
    eventType: ended,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_error(
    element: EventTarget,
    selector: String,
    eventType: error,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_error(
    element: EventTarget,
    selector: SelectorObject,
    eventType: error,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_focus(
    element: EventTarget,
    selector: String,
    eventType: focus,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_focus(
    element: EventTarget,
    selector: SelectorObject,
    eventType: focus,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_focusin(
    element: EventTarget,
    selector: String,
    eventType: focusin,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_focusin(
    element: EventTarget,
    selector: SelectorObject,
    eventType: focusin,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_focusout(
    element: EventTarget,
    selector: String,
    eventType: focusout,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_focusout(
    element: EventTarget,
    selector: SelectorObject,
    eventType: focusout,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_fullscreenchange(
    element: EventTarget,
    selector: String,
    eventType: fullscreenchange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_fullscreenchange(
    element: EventTarget,
    selector: SelectorObject,
    eventType: fullscreenchange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_fullscreenerror(
    element: EventTarget,
    selector: String,
    eventType: fullscreenerror,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_fullscreenerror(
    element: EventTarget,
    selector: SelectorObject,
    eventType: fullscreenerror,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_gotpointercapture(
    element: EventTarget,
    selector: String,
    eventType: gotpointercapture,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_gotpointercapture(
    element: EventTarget,
    selector: SelectorObject,
    eventType: gotpointercapture,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_input(
    element: EventTarget,
    selector: String,
    eventType: input,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_input(
    element: EventTarget,
    selector: SelectorObject,
    eventType: input,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_invalid(
    element: EventTarget,
    selector: String,
    eventType: invalid,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_invalid(
    element: EventTarget,
    selector: SelectorObject,
    eventType: invalid,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_keydown(
    element: EventTarget,
    selector: String,
    eventType: keydown,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_keydown(
    element: EventTarget,
    selector: SelectorObject,
    eventType: keydown,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_keypress(
    element: EventTarget,
    selector: String,
    eventType: keypress,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_keypress(
    element: EventTarget,
    selector: SelectorObject,
    eventType: keypress,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_keyup(
    element: EventTarget,
    selector: String,
    eventType: keyup,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_keyup(
    element: EventTarget,
    selector: SelectorObject,
    eventType: keyup,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_load(
    element: EventTarget,
    selector: String,
    eventType: load,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_load(
    element: EventTarget,
    selector: SelectorObject,
    eventType: load,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_loadeddata(
    element: EventTarget,
    selector: String,
    eventType: loadeddata,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_loadeddata(
    element: EventTarget,
    selector: SelectorObject,
    eventType: loadeddata,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_loadedmetadata(
    element: EventTarget,
    selector: String,
    eventType: loadedmetadata,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_loadedmetadata(
    element: EventTarget,
    selector: SelectorObject,
    eventType: loadedmetadata,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_loadstart(
    element: EventTarget,
    selector: String,
    eventType: loadstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_loadstart(
    element: EventTarget,
    selector: SelectorObject,
    eventType: loadstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_lostpointercapture(
    element: EventTarget,
    selector: String,
    eventType: lostpointercapture,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_lostpointercapture(
    element: EventTarget,
    selector: SelectorObject,
    eventType: lostpointercapture,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_mousedown(
    element: EventTarget,
    selector: String,
    eventType: mousedown,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_mousedown(
    element: EventTarget,
    selector: SelectorObject,
    eventType: mousedown,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_mouseenter(
    element: EventTarget,
    selector: String,
    eventType: mouseenter,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_mouseenter(
    element: EventTarget,
    selector: SelectorObject,
    eventType: mouseenter,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_mouseleave(
    element: EventTarget,
    selector: String,
    eventType: mouseleave,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_mouseleave(
    element: EventTarget,
    selector: SelectorObject,
    eventType: mouseleave,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_mousemove(
    element: EventTarget,
    selector: String,
    eventType: mousemove,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_mousemove(
    element: EventTarget,
    selector: SelectorObject,
    eventType: mousemove,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_mouseout(
    element: EventTarget,
    selector: String,
    eventType: mouseout,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_mouseout(
    element: EventTarget,
    selector: SelectorObject,
    eventType: mouseout,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_mouseover(
    element: EventTarget,
    selector: String,
    eventType: mouseover,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_mouseover(
    element: EventTarget,
    selector: SelectorObject,
    eventType: mouseover,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_mouseup(
    element: EventTarget,
    selector: String,
    eventType: mouseup,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_mouseup(
    element: EventTarget,
    selector: SelectorObject,
    eventType: mouseup,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_paste(
    element: EventTarget,
    selector: String,
    eventType: paste,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_paste(
    element: EventTarget,
    selector: SelectorObject,
    eventType: paste,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_pause(
    element: EventTarget,
    selector: String,
    eventType: pause,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_pause(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pause,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_play(
    element: EventTarget,
    selector: String,
    eventType: play,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_play(
    element: EventTarget,
    selector: SelectorObject,
    eventType: play,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_playing(
    element: EventTarget,
    selector: String,
    eventType: playing,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_playing(
    element: EventTarget,
    selector: SelectorObject,
    eventType: playing,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_pointercancel(
    element: EventTarget,
    selector: String,
    eventType: pointercancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_pointercancel(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointercancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_pointerdown(
    element: EventTarget,
    selector: String,
    eventType: pointerdown,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_pointerdown(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointerdown,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_pointerenter(
    element: EventTarget,
    selector: String,
    eventType: pointerenter,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_pointerenter(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointerenter,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_pointerleave(
    element: EventTarget,
    selector: String,
    eventType: pointerleave,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_pointerleave(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointerleave,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_pointermove(
    element: EventTarget,
    selector: String,
    eventType: pointermove,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_pointermove(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointermove,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_pointerout(
    element: EventTarget,
    selector: String,
    eventType: pointerout,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_pointerout(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointerout,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_pointerover(
    element: EventTarget,
    selector: String,
    eventType: pointerover,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_pointerover(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointerover,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_pointerup(
    element: EventTarget,
    selector: String,
    eventType: pointerup,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_pointerup(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointerup,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_progress(
    element: EventTarget,
    selector: String,
    eventType: progress,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_progress(
    element: EventTarget,
    selector: SelectorObject,
    eventType: progress,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_ratechange(
    element: EventTarget,
    selector: String,
    eventType: ratechange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_ratechange(
    element: EventTarget,
    selector: SelectorObject,
    eventType: ratechange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_reset(
    element: EventTarget,
    selector: String,
    eventType: reset,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_reset(
    element: EventTarget,
    selector: SelectorObject,
    eventType: reset,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_resize(
    element: EventTarget,
    selector: String,
    eventType: resize,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_resize(
    element: EventTarget,
    selector: SelectorObject,
    eventType: resize,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_scroll(
    element: EventTarget,
    selector: String,
    eventType: scroll,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_scroll(
    element: EventTarget,
    selector: SelectorObject,
    eventType: scroll,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_securitypolicyviolation(
    element: EventTarget,
    selector: String,
    eventType: securitypolicyviolation,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_securitypolicyviolation(
    element: EventTarget,
    selector: SelectorObject,
    eventType: securitypolicyviolation,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_seeked(
    element: EventTarget,
    selector: String,
    eventType: seeked,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_seeked(
    element: EventTarget,
    selector: SelectorObject,
    eventType: seeked,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_seeking(
    element: EventTarget,
    selector: String,
    eventType: seeking,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_seeking(
    element: EventTarget,
    selector: SelectorObject,
    eventType: seeking,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_select(
    element: EventTarget,
    selector: String,
    eventType: select,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_select(
    element: EventTarget,
    selector: SelectorObject,
    eventType: select,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_selectionchange(
    element: EventTarget,
    selector: String,
    eventType: selectionchange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_selectionchange(
    element: EventTarget,
    selector: SelectorObject,
    eventType: selectionchange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_selectstart(
    element: EventTarget,
    selector: String,
    eventType: selectstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_selectstart(
    element: EventTarget,
    selector: SelectorObject,
    eventType: selectstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_stalled(
    element: EventTarget,
    selector: String,
    eventType: stalled,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_stalled(
    element: EventTarget,
    selector: SelectorObject,
    eventType: stalled,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_submit(
    element: EventTarget,
    selector: String,
    eventType: submit,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_submit(
    element: EventTarget,
    selector: SelectorObject,
    eventType: submit,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_suspend(
    element: EventTarget,
    selector: String,
    eventType: suspend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_suspend(
    element: EventTarget,
    selector: SelectorObject,
    eventType: suspend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_timeupdate(
    element: EventTarget,
    selector: String,
    eventType: timeupdate,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_timeupdate(
    element: EventTarget,
    selector: SelectorObject,
    eventType: timeupdate,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_toggle(
    element: EventTarget,
    selector: String,
    eventType: toggle,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_toggle(
    element: EventTarget,
    selector: SelectorObject,
    eventType: toggle,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_touchcancel(
    element: EventTarget,
    selector: String,
    eventType: touchcancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_touchcancel(
    element: EventTarget,
    selector: SelectorObject,
    eventType: touchcancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_touchend(
    element: EventTarget,
    selector: String,
    eventType: touchend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_touchend(
    element: EventTarget,
    selector: SelectorObject,
    eventType: touchend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_touchmove(
    element: EventTarget,
    selector: String,
    eventType: touchmove,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_touchmove(
    element: EventTarget,
    selector: SelectorObject,
    eventType: touchmove,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_touchstart(
    element: EventTarget,
    selector: String,
    eventType: touchstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_touchstart(
    element: EventTarget,
    selector: SelectorObject,
    eventType: touchstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_transitioncancel(
    element: EventTarget,
    selector: String,
    eventType: transitioncancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_transitioncancel(
    element: EventTarget,
    selector: SelectorObject,
    eventType: transitioncancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_transitionend(
    element: EventTarget,
    selector: String,
    eventType: transitionend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_transitionend(
    element: EventTarget,
    selector: SelectorObject,
    eventType: transitionend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_transitionrun(
    element: EventTarget,
    selector: String,
    eventType: transitionrun,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_transitionrun(
    element: EventTarget,
    selector: SelectorObject,
    eventType: transitionrun,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_transitionstart(
    element: EventTarget,
    selector: String,
    eventType: transitionstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_transitionstart(
    element: EventTarget,
    selector: SelectorObject,
    eventType: transitionstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_volumechange(
    element: EventTarget,
    selector: String,
    eventType: volumechange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_volumechange(
    element: EventTarget,
    selector: SelectorObject,
    eventType: volumechange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_waiting(
    element: EventTarget,
    selector: String,
    eventType: waiting,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_waiting(
    element: EventTarget,
    selector: SelectorObject,
    eventType: waiting,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_wheel(
    element: EventTarget,
    selector: String,
    eventType: wheel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, _]
  ): Unit = js.native
  @JSName("delegate")
  def delegate_wheel(
    element: EventTarget,
    selector: SelectorObject,
    eventType: wheel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, _]
  ): Unit = js.native
  
  def disableElement(e: Element): Unit = js.native
  def disableElement(e: Event): Unit = js.native
  
  def enableElement(e: Element): Unit = js.native
  def enableElement(e: Event): Unit = js.native
  
  val fileInputSelector: String = js.native
  
  def fire(obj: EventTarget, name: String): Boolean = js.native
  def fire(obj: EventTarget, name: String, data: js.Any): Boolean = js.native
  
  val formDisableSelector: String = js.native
  
  def formElements(form: Element, selector: String): js.Array[HTMLElement] = js.native
  
  val formEnableSelector: String = js.native
  
  val formInputClickSelector: String = js.native
  
  def formSubmitButtonClick(e: Event): Unit = js.native
  
  val formSubmitSelector: String = js.native
  
  def getData(element: Element, key: String): js.Any = js.native
  
  def handleConfirm(e: Event): Unit = js.native
  
  def handleDisabledElement(e: Event): Unit = js.native
  
  def handleMethod(e: Event): Unit = js.native
  
  def handleRemote(e: Event): Unit = js.native
  
  def href(element: HTMLElement): js.UndefOr[String] = js.native
  
  val inputChangeSelector: String = js.native
  
  def isCrossDomain(url: String): Boolean = js.native
  
  val linkClickSelector: String = js.native
  
  val linkDisableSelector: String = js.native
  
  def loadCSPNonce(): js.UndefOr[String] = js.native
  
  def matches(element: Element, selector: String): Boolean = js.native
  def matches(element: Element, selector: SelectorObject): Boolean = js.native
  
  def preventInsignificantClick(e: Event): Unit = js.native
  
  def refreshCSRFTokens(): Unit = js.native
  
  def serializeElement(element: Element, additionalParam: js.Any): String = js.native
  
  def setData(element: Element, key: String, value: js.Any): Unit = js.native
  
  def start(): Unit = js.native
  
  def stopEverything(e: Event): Unit = js.native
}
