package typingsSlinky.antvG2.mod

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.Event
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
import typingsSlinky.antvG2.anon.Left
import typingsSlinky.antvG2.antvG2Strings.abort
import typingsSlinky.antvG2.antvG2Strings.animationcancel
import typingsSlinky.antvG2.antvG2Strings.animationend
import typingsSlinky.antvG2.antvG2Strings.animationiteration
import typingsSlinky.antvG2.antvG2Strings.animationstart
import typingsSlinky.antvG2.antvG2Strings.auxclick
import typingsSlinky.antvG2.antvG2Strings.blur
import typingsSlinky.antvG2.antvG2Strings.cancel
import typingsSlinky.antvG2.antvG2Strings.canplay
import typingsSlinky.antvG2.antvG2Strings.canplaythrough
import typingsSlinky.antvG2.antvG2Strings.change
import typingsSlinky.antvG2.antvG2Strings.click
import typingsSlinky.antvG2.antvG2Strings.close
import typingsSlinky.antvG2.antvG2Strings.contextmenu
import typingsSlinky.antvG2.antvG2Strings.copy
import typingsSlinky.antvG2.antvG2Strings.cuechange
import typingsSlinky.antvG2.antvG2Strings.cut
import typingsSlinky.antvG2.antvG2Strings.dblclick
import typingsSlinky.antvG2.antvG2Strings.drag
import typingsSlinky.antvG2.antvG2Strings.dragend
import typingsSlinky.antvG2.antvG2Strings.dragenter
import typingsSlinky.antvG2.antvG2Strings.dragexit
import typingsSlinky.antvG2.antvG2Strings.dragleave
import typingsSlinky.antvG2.antvG2Strings.dragover
import typingsSlinky.antvG2.antvG2Strings.dragstart
import typingsSlinky.antvG2.antvG2Strings.drop
import typingsSlinky.antvG2.antvG2Strings.durationchange
import typingsSlinky.antvG2.antvG2Strings.emptied
import typingsSlinky.antvG2.antvG2Strings.ended
import typingsSlinky.antvG2.antvG2Strings.error
import typingsSlinky.antvG2.antvG2Strings.focus
import typingsSlinky.antvG2.antvG2Strings.focusin
import typingsSlinky.antvG2.antvG2Strings.focusout
import typingsSlinky.antvG2.antvG2Strings.fullscreenchange
import typingsSlinky.antvG2.antvG2Strings.fullscreenerror
import typingsSlinky.antvG2.antvG2Strings.gotpointercapture
import typingsSlinky.antvG2.antvG2Strings.input
import typingsSlinky.antvG2.antvG2Strings.invalid
import typingsSlinky.antvG2.antvG2Strings.keydown
import typingsSlinky.antvG2.antvG2Strings.keypress
import typingsSlinky.antvG2.antvG2Strings.keyup
import typingsSlinky.antvG2.antvG2Strings.load
import typingsSlinky.antvG2.antvG2Strings.loadeddata
import typingsSlinky.antvG2.antvG2Strings.loadedmetadata
import typingsSlinky.antvG2.antvG2Strings.loadstart
import typingsSlinky.antvG2.antvG2Strings.lostpointercapture
import typingsSlinky.antvG2.antvG2Strings.mousedown
import typingsSlinky.antvG2.antvG2Strings.mouseenter
import typingsSlinky.antvG2.antvG2Strings.mouseleave
import typingsSlinky.antvG2.antvG2Strings.mousemove
import typingsSlinky.antvG2.antvG2Strings.mouseout
import typingsSlinky.antvG2.antvG2Strings.mouseover
import typingsSlinky.antvG2.antvG2Strings.mouseup
import typingsSlinky.antvG2.antvG2Strings.paste
import typingsSlinky.antvG2.antvG2Strings.pause
import typingsSlinky.antvG2.antvG2Strings.play
import typingsSlinky.antvG2.antvG2Strings.playing
import typingsSlinky.antvG2.antvG2Strings.pointercancel
import typingsSlinky.antvG2.antvG2Strings.pointerdown
import typingsSlinky.antvG2.antvG2Strings.pointerenter
import typingsSlinky.antvG2.antvG2Strings.pointerleave
import typingsSlinky.antvG2.antvG2Strings.pointermove
import typingsSlinky.antvG2.antvG2Strings.pointerout
import typingsSlinky.antvG2.antvG2Strings.pointerover
import typingsSlinky.antvG2.antvG2Strings.pointerup
import typingsSlinky.antvG2.antvG2Strings.progress
import typingsSlinky.antvG2.antvG2Strings.ratechange
import typingsSlinky.antvG2.antvG2Strings.reset
import typingsSlinky.antvG2.antvG2Strings.resize
import typingsSlinky.antvG2.antvG2Strings.scroll
import typingsSlinky.antvG2.antvG2Strings.securitypolicyviolation
import typingsSlinky.antvG2.antvG2Strings.seeked
import typingsSlinky.antvG2.antvG2Strings.seeking
import typingsSlinky.antvG2.antvG2Strings.select
import typingsSlinky.antvG2.antvG2Strings.selectionchange
import typingsSlinky.antvG2.antvG2Strings.selectstart
import typingsSlinky.antvG2.antvG2Strings.stalled
import typingsSlinky.antvG2.antvG2Strings.submit
import typingsSlinky.antvG2.antvG2Strings.suspend
import typingsSlinky.antvG2.antvG2Strings.timeupdate
import typingsSlinky.antvG2.antvG2Strings.toggle
import typingsSlinky.antvG2.antvG2Strings.touchcancel
import typingsSlinky.antvG2.antvG2Strings.touchend
import typingsSlinky.antvG2.antvG2Strings.touchmove
import typingsSlinky.antvG2.antvG2Strings.touchstart
import typingsSlinky.antvG2.antvG2Strings.transitioncancel
import typingsSlinky.antvG2.antvG2Strings.transitionend
import typingsSlinky.antvG2.antvG2Strings.transitionrun
import typingsSlinky.antvG2.antvG2Strings.transitionstart
import typingsSlinky.antvG2.antvG2Strings.volumechange
import typingsSlinky.antvG2.antvG2Strings.waiting
import typingsSlinky.antvG2.antvG2Strings.wheel
import typingsSlinky.std.SecurityPolicyViolationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2", "DomUtil")
@js.native
class DomUtil () extends js.Object {
  
  def addEventListener(target: HTMLElement, eventType: String, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    target: HTMLElement,
    eventType: abort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    target: HTMLElement,
    eventType: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    target: HTMLElement,
    eventType: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    target: HTMLElement,
    eventType: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    target: HTMLElement,
    eventType: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    target: HTMLElement,
    eventType: auxclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    target: HTMLElement,
    eventType: blur,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    target: HTMLElement,
    eventType: cancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    target: HTMLElement,
    eventType: canplay,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    target: HTMLElement,
    eventType: canplaythrough,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    target: HTMLElement,
    eventType: change,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    target: HTMLElement,
    eventType: click,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    target: HTMLElement,
    eventType: close,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    target: HTMLElement,
    eventType: contextmenu,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    target: HTMLElement,
    eventType: copy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    target: HTMLElement,
    eventType: cuechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    target: HTMLElement,
    eventType: cut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    target: HTMLElement,
    eventType: dblclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    target: HTMLElement,
    eventType: drag,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    target: HTMLElement,
    eventType: dragend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    target: HTMLElement,
    eventType: dragenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    target: HTMLElement,
    eventType: dragexit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    target: HTMLElement,
    eventType: dragleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    target: HTMLElement,
    eventType: dragover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    target: HTMLElement,
    eventType: dragstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    target: HTMLElement,
    eventType: drop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    target: HTMLElement,
    eventType: durationchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    target: HTMLElement,
    eventType: emptied,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    target: HTMLElement,
    eventType: ended,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    target: HTMLElement,
    eventType: error,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    target: HTMLElement,
    eventType: focus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(
    target: HTMLElement,
    eventType: focusin,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(
    target: HTMLElement,
    eventType: focusout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    target: HTMLElement,
    eventType: fullscreenchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    target: HTMLElement,
    eventType: fullscreenerror,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    target: HTMLElement,
    eventType: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    target: HTMLElement,
    eventType: input,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    target: HTMLElement,
    eventType: invalid,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    target: HTMLElement,
    eventType: keydown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    target: HTMLElement,
    eventType: keypress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    target: HTMLElement,
    eventType: keyup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    target: HTMLElement,
    eventType: load,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    target: HTMLElement,
    eventType: loadeddata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    target: HTMLElement,
    eventType: loadedmetadata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    target: HTMLElement,
    eventType: loadstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    target: HTMLElement,
    eventType: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    target: HTMLElement,
    eventType: mousedown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    target: HTMLElement,
    eventType: mouseenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    target: HTMLElement,
    eventType: mouseleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    target: HTMLElement,
    eventType: mousemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    target: HTMLElement,
    eventType: mouseout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    target: HTMLElement,
    eventType: mouseover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    target: HTMLElement,
    eventType: mouseup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    target: HTMLElement,
    eventType: paste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    target: HTMLElement,
    eventType: pause,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    target: HTMLElement,
    eventType: play,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    target: HTMLElement,
    eventType: playing,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    target: HTMLElement,
    eventType: pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    target: HTMLElement,
    eventType: pointerdown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    target: HTMLElement,
    eventType: pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    target: HTMLElement,
    eventType: pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    target: HTMLElement,
    eventType: pointermove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    target: HTMLElement,
    eventType: pointerout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    target: HTMLElement,
    eventType: pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    target: HTMLElement,
    eventType: pointerup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    target: HTMLElement,
    eventType: progress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    target: HTMLElement,
    eventType: ratechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    target: HTMLElement,
    eventType: reset,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    target: HTMLElement,
    eventType: resize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    target: HTMLElement,
    eventType: scroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    target: HTMLElement,
    eventType: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    target: HTMLElement,
    eventType: seeked,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    target: HTMLElement,
    eventType: seeking,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    target: HTMLElement,
    eventType: select,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    target: HTMLElement,
    eventType: selectionchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    target: HTMLElement,
    eventType: selectstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    target: HTMLElement,
    eventType: stalled,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    target: HTMLElement,
    eventType: submit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    target: HTMLElement,
    eventType: suspend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    target: HTMLElement,
    eventType: timeupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    target: HTMLElement,
    eventType: toggle,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    target: HTMLElement,
    eventType: touchcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    target: HTMLElement,
    eventType: touchend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    target: HTMLElement,
    eventType: touchmove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    target: HTMLElement,
    eventType: touchstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    target: HTMLElement,
    eventType: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    target: HTMLElement,
    eventType: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    target: HTMLElement,
    eventType: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    target: HTMLElement,
    eventType: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    target: HTMLElement,
    eventType: volumechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    target: HTMLElement,
    eventType: waiting,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    target: HTMLElement,
    eventType: wheel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, _]
  ): Unit = js.native
  
  def createDom(str: String): HTMLElement = js.native
  
  def getBoundingClientRect(node: Element): Left = js.native
  
  def getHeight(el: HTMLElement): Double = js.native
  
  def getOuterHeight(el: HTMLElement): Double = js.native
  
  def getOuterWidth(el: HTMLElement): Double = js.native
  
  def getRatio(): Double = js.native
  
  def getStyle(dom: HTMLElement, name: String): js.Any = js.native
  
  def getWidth(el: HTMLElement): Double = js.native
  
  def modifyCSS(dom: HTMLElement, css: js.Any): HTMLElement = js.native
  
  def requestAnimationFrame(fn: js.Function0[Unit]): Unit = js.native
}
