package typingsSlinky.domDashHelpers

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.domDashHelpers.cjsAddEventListenerMod.EventHandler
import typingsSlinky.domDashHelpers.domDashHelpersStrings.abort
import typingsSlinky.domDashHelpers.domDashHelpersStrings.animationcancel
import typingsSlinky.domDashHelpers.domDashHelpersStrings.animationend
import typingsSlinky.domDashHelpers.domDashHelpersStrings.animationiteration
import typingsSlinky.domDashHelpers.domDashHelpersStrings.animationstart
import typingsSlinky.domDashHelpers.domDashHelpersStrings.auxclick
import typingsSlinky.domDashHelpers.domDashHelpersStrings.blur
import typingsSlinky.domDashHelpers.domDashHelpersStrings.cancel
import typingsSlinky.domDashHelpers.domDashHelpersStrings.canplay
import typingsSlinky.domDashHelpers.domDashHelpersStrings.canplaythrough
import typingsSlinky.domDashHelpers.domDashHelpersStrings.change
import typingsSlinky.domDashHelpers.domDashHelpersStrings.click
import typingsSlinky.domDashHelpers.domDashHelpersStrings.close
import typingsSlinky.domDashHelpers.domDashHelpersStrings.contextmenu
import typingsSlinky.domDashHelpers.domDashHelpersStrings.copy
import typingsSlinky.domDashHelpers.domDashHelpersStrings.cuechange
import typingsSlinky.domDashHelpers.domDashHelpersStrings.cut
import typingsSlinky.domDashHelpers.domDashHelpersStrings.dblclick
import typingsSlinky.domDashHelpers.domDashHelpersStrings.drag
import typingsSlinky.domDashHelpers.domDashHelpersStrings.dragend
import typingsSlinky.domDashHelpers.domDashHelpersStrings.dragenter
import typingsSlinky.domDashHelpers.domDashHelpersStrings.dragexit
import typingsSlinky.domDashHelpers.domDashHelpersStrings.dragleave
import typingsSlinky.domDashHelpers.domDashHelpersStrings.dragover
import typingsSlinky.domDashHelpers.domDashHelpersStrings.dragstart
import typingsSlinky.domDashHelpers.domDashHelpersStrings.drop
import typingsSlinky.domDashHelpers.domDashHelpersStrings.durationchange
import typingsSlinky.domDashHelpers.domDashHelpersStrings.emptied
import typingsSlinky.domDashHelpers.domDashHelpersStrings.ended
import typingsSlinky.domDashHelpers.domDashHelpersStrings.error
import typingsSlinky.domDashHelpers.domDashHelpersStrings.focus
import typingsSlinky.domDashHelpers.domDashHelpersStrings.focusin
import typingsSlinky.domDashHelpers.domDashHelpersStrings.focusout
import typingsSlinky.domDashHelpers.domDashHelpersStrings.fullscreenchange
import typingsSlinky.domDashHelpers.domDashHelpersStrings.fullscreenerror
import typingsSlinky.domDashHelpers.domDashHelpersStrings.gotpointercapture
import typingsSlinky.domDashHelpers.domDashHelpersStrings.input
import typingsSlinky.domDashHelpers.domDashHelpersStrings.invalid
import typingsSlinky.domDashHelpers.domDashHelpersStrings.keydown
import typingsSlinky.domDashHelpers.domDashHelpersStrings.keypress
import typingsSlinky.domDashHelpers.domDashHelpersStrings.keyup
import typingsSlinky.domDashHelpers.domDashHelpersStrings.load
import typingsSlinky.domDashHelpers.domDashHelpersStrings.loadeddata
import typingsSlinky.domDashHelpers.domDashHelpersStrings.loadedmetadata
import typingsSlinky.domDashHelpers.domDashHelpersStrings.loadend
import typingsSlinky.domDashHelpers.domDashHelpersStrings.loadstart
import typingsSlinky.domDashHelpers.domDashHelpersStrings.lostpointercapture
import typingsSlinky.domDashHelpers.domDashHelpersStrings.mousedown
import typingsSlinky.domDashHelpers.domDashHelpersStrings.mouseenter
import typingsSlinky.domDashHelpers.domDashHelpersStrings.mouseleave
import typingsSlinky.domDashHelpers.domDashHelpersStrings.mousemove
import typingsSlinky.domDashHelpers.domDashHelpersStrings.mouseout
import typingsSlinky.domDashHelpers.domDashHelpersStrings.mouseover
import typingsSlinky.domDashHelpers.domDashHelpersStrings.mouseup
import typingsSlinky.domDashHelpers.domDashHelpersStrings.paste
import typingsSlinky.domDashHelpers.domDashHelpersStrings.pause
import typingsSlinky.domDashHelpers.domDashHelpersStrings.play
import typingsSlinky.domDashHelpers.domDashHelpersStrings.playing
import typingsSlinky.domDashHelpers.domDashHelpersStrings.pointercancel
import typingsSlinky.domDashHelpers.domDashHelpersStrings.pointerdown
import typingsSlinky.domDashHelpers.domDashHelpersStrings.pointerenter
import typingsSlinky.domDashHelpers.domDashHelpersStrings.pointerleave
import typingsSlinky.domDashHelpers.domDashHelpersStrings.pointermove
import typingsSlinky.domDashHelpers.domDashHelpersStrings.pointerout
import typingsSlinky.domDashHelpers.domDashHelpersStrings.pointerover
import typingsSlinky.domDashHelpers.domDashHelpersStrings.pointerup
import typingsSlinky.domDashHelpers.domDashHelpersStrings.progress
import typingsSlinky.domDashHelpers.domDashHelpersStrings.ratechange
import typingsSlinky.domDashHelpers.domDashHelpersStrings.reset
import typingsSlinky.domDashHelpers.domDashHelpersStrings.resize
import typingsSlinky.domDashHelpers.domDashHelpersStrings.scroll
import typingsSlinky.domDashHelpers.domDashHelpersStrings.securitypolicyviolation
import typingsSlinky.domDashHelpers.domDashHelpersStrings.seeked
import typingsSlinky.domDashHelpers.domDashHelpersStrings.seeking
import typingsSlinky.domDashHelpers.domDashHelpersStrings.select
import typingsSlinky.domDashHelpers.domDashHelpersStrings.selectionchange
import typingsSlinky.domDashHelpers.domDashHelpersStrings.selectstart
import typingsSlinky.domDashHelpers.domDashHelpersStrings.stalled
import typingsSlinky.domDashHelpers.domDashHelpersStrings.submit
import typingsSlinky.domDashHelpers.domDashHelpersStrings.suspend
import typingsSlinky.domDashHelpers.domDashHelpersStrings.timeupdate
import typingsSlinky.domDashHelpers.domDashHelpersStrings.toggle
import typingsSlinky.domDashHelpers.domDashHelpersStrings.touchcancel
import typingsSlinky.domDashHelpers.domDashHelpersStrings.touchend
import typingsSlinky.domDashHelpers.domDashHelpersStrings.touchmove
import typingsSlinky.domDashHelpers.domDashHelpersStrings.touchstart
import typingsSlinky.domDashHelpers.domDashHelpersStrings.transitioncancel
import typingsSlinky.domDashHelpers.domDashHelpersStrings.transitionend
import typingsSlinky.domDashHelpers.domDashHelpersStrings.transitionrun
import typingsSlinky.domDashHelpers.domDashHelpersStrings.transitionstart
import typingsSlinky.domDashHelpers.domDashHelpersStrings.volumechange
import typingsSlinky.domDashHelpers.domDashHelpersStrings.waiting
import typingsSlinky.domDashHelpers.domDashHelpersStrings.wheel
import typingsSlinky.std.AddEventListenerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/listen", JSImport.Namespace)
@js.native
object cjsListenMod extends js.Object {
  @JSName("default")
  def default_abort(node: HTMLElement, eventName: abort, handler: EventHandler[abort]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_abort(node: HTMLElement, eventName: abort, handler: EventHandler[abort], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_abort(
    node: HTMLElement,
    eventName: abort,
    handler: EventHandler[abort],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_animationcancel(node: HTMLElement, eventName: animationcancel, handler: EventHandler[animationcancel]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: EventHandler[animationcancel],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: EventHandler[animationcancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_animationend(node: HTMLElement, eventName: animationend, handler: EventHandler[animationend]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_animationend(node: HTMLElement, eventName: animationend, handler: EventHandler[animationend], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_animationend(
    node: HTMLElement,
    eventName: animationend,
    handler: EventHandler[animationend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_animationiteration(node: HTMLElement, eventName: animationiteration, handler: EventHandler[animationiteration]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: EventHandler[animationiteration],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: EventHandler[animationiteration],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_animationstart(node: HTMLElement, eventName: animationstart, handler: EventHandler[animationstart]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: EventHandler[animationstart],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: EventHandler[animationstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_auxclick(node: HTMLElement, eventName: auxclick, handler: EventHandler[auxclick]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_auxclick(node: HTMLElement, eventName: auxclick, handler: EventHandler[auxclick], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_auxclick(
    node: HTMLElement,
    eventName: auxclick,
    handler: EventHandler[auxclick],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSName("default")
  def default_cancel(node: HTMLElement, eventName: cancel, handler: EventHandler[cancel]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_cancel(node: HTMLElement, eventName: cancel, handler: EventHandler[cancel], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_cancel(
    node: HTMLElement,
    eventName: cancel,
    handler: EventHandler[cancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_canplay(node: HTMLElement, eventName: canplay, handler: EventHandler[canplay]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_canplay(node: HTMLElement, eventName: canplay, handler: EventHandler[canplay], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_canplay(
    node: HTMLElement,
    eventName: canplay,
    handler: EventHandler[canplay],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_canplaythrough(node: HTMLElement, eventName: canplaythrough, handler: EventHandler[canplaythrough]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: EventHandler[canplaythrough],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: EventHandler[canplaythrough],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_change(node: HTMLElement, eventName: change, handler: EventHandler[change]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_change(node: HTMLElement, eventName: change, handler: EventHandler[change], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_change(
    node: HTMLElement,
    eventName: change,
    handler: EventHandler[change],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_click(node: HTMLElement, eventName: click, handler: EventHandler[click]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_click(node: HTMLElement, eventName: click, handler: EventHandler[click], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_click(
    node: HTMLElement,
    eventName: click,
    handler: EventHandler[click],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_close(node: HTMLElement, eventName: close, handler: EventHandler[close]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_close(node: HTMLElement, eventName: close, handler: EventHandler[close], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_close(
    node: HTMLElement,
    eventName: close,
    handler: EventHandler[close],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_contextmenu(node: HTMLElement, eventName: contextmenu, handler: EventHandler[contextmenu]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_contextmenu(node: HTMLElement, eventName: contextmenu, handler: EventHandler[contextmenu], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_contextmenu(
    node: HTMLElement,
    eventName: contextmenu,
    handler: EventHandler[contextmenu],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSName("default")
  def default_cuechange(node: HTMLElement, eventName: cuechange, handler: EventHandler[cuechange]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_cuechange(node: HTMLElement, eventName: cuechange, handler: EventHandler[cuechange], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_cuechange(
    node: HTMLElement,
    eventName: cuechange,
    handler: EventHandler[cuechange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSName("default")
  def default_dblclick(node: HTMLElement, eventName: dblclick, handler: EventHandler[dblclick]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_dblclick(node: HTMLElement, eventName: dblclick, handler: EventHandler[dblclick], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_dblclick(
    node: HTMLElement,
    eventName: dblclick,
    handler: EventHandler[dblclick],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSName("default")
  def default_dragend(node: HTMLElement, eventName: dragend, handler: EventHandler[dragend]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_dragend(node: HTMLElement, eventName: dragend, handler: EventHandler[dragend], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_dragend(
    node: HTMLElement,
    eventName: dragend,
    handler: EventHandler[dragend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_dragenter(node: HTMLElement, eventName: dragenter, handler: EventHandler[dragenter]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_dragenter(node: HTMLElement, eventName: dragenter, handler: EventHandler[dragenter], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_dragenter(
    node: HTMLElement,
    eventName: dragenter,
    handler: EventHandler[dragenter],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_dragexit(node: HTMLElement, eventName: dragexit, handler: EventHandler[dragexit]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_dragexit(node: HTMLElement, eventName: dragexit, handler: EventHandler[dragexit], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_dragexit(
    node: HTMLElement,
    eventName: dragexit,
    handler: EventHandler[dragexit],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_dragleave(node: HTMLElement, eventName: dragleave, handler: EventHandler[dragleave]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_dragleave(node: HTMLElement, eventName: dragleave, handler: EventHandler[dragleave], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_dragleave(
    node: HTMLElement,
    eventName: dragleave,
    handler: EventHandler[dragleave],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_dragover(node: HTMLElement, eventName: dragover, handler: EventHandler[dragover]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_dragover(node: HTMLElement, eventName: dragover, handler: EventHandler[dragover], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_dragover(
    node: HTMLElement,
    eventName: dragover,
    handler: EventHandler[dragover],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_dragstart(node: HTMLElement, eventName: dragstart, handler: EventHandler[dragstart]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_dragstart(node: HTMLElement, eventName: dragstart, handler: EventHandler[dragstart], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_dragstart(
    node: HTMLElement,
    eventName: dragstart,
    handler: EventHandler[dragstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSName("default")
  def default_durationchange(node: HTMLElement, eventName: durationchange, handler: EventHandler[durationchange]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: EventHandler[durationchange],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: EventHandler[durationchange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_emptied(node: HTMLElement, eventName: emptied, handler: EventHandler[emptied]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_emptied(node: HTMLElement, eventName: emptied, handler: EventHandler[emptied], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_emptied(
    node: HTMLElement,
    eventName: emptied,
    handler: EventHandler[emptied],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_ended(node: HTMLElement, eventName: ended, handler: EventHandler[ended]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_ended(node: HTMLElement, eventName: ended, handler: EventHandler[ended], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_ended(
    node: HTMLElement,
    eventName: ended,
    handler: EventHandler[ended],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_error(node: HTMLElement, eventName: error, handler: EventHandler[error]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_error(node: HTMLElement, eventName: error, handler: EventHandler[error], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_error(
    node: HTMLElement,
    eventName: error,
    handler: EventHandler[error],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_focus(node: HTMLElement, eventName: focus, handler: EventHandler[focus]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_focus(node: HTMLElement, eventName: focus, handler: EventHandler[focus], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_focus(
    node: HTMLElement,
    eventName: focus,
    handler: EventHandler[focus],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_focusin(node: HTMLElement, eventName: focusin, handler: EventHandler[focusin]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_focusin(node: HTMLElement, eventName: focusin, handler: EventHandler[focusin], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_focusin(
    node: HTMLElement,
    eventName: focusin,
    handler: EventHandler[focusin],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_focusout(node: HTMLElement, eventName: focusout, handler: EventHandler[focusout]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_focusout(node: HTMLElement, eventName: focusout, handler: EventHandler[focusout], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_focusout(
    node: HTMLElement,
    eventName: focusout,
    handler: EventHandler[focusout],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_fullscreenchange(node: HTMLElement, eventName: fullscreenchange, handler: EventHandler[fullscreenchange]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: EventHandler[fullscreenchange],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: EventHandler[fullscreenchange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_fullscreenerror(node: HTMLElement, eventName: fullscreenerror, handler: EventHandler[fullscreenerror]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: EventHandler[fullscreenerror],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: EventHandler[fullscreenerror],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_gotpointercapture(node: HTMLElement, eventName: gotpointercapture, handler: EventHandler[gotpointercapture]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: EventHandler[gotpointercapture],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: EventHandler[gotpointercapture],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_input(node: HTMLElement, eventName: input, handler: EventHandler[input]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_input(node: HTMLElement, eventName: input, handler: EventHandler[input], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_input(
    node: HTMLElement,
    eventName: input,
    handler: EventHandler[input],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_invalid(node: HTMLElement, eventName: invalid, handler: EventHandler[invalid]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_invalid(node: HTMLElement, eventName: invalid, handler: EventHandler[invalid], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_invalid(
    node: HTMLElement,
    eventName: invalid,
    handler: EventHandler[invalid],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_keydown(node: HTMLElement, eventName: keydown, handler: EventHandler[keydown]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_keydown(node: HTMLElement, eventName: keydown, handler: EventHandler[keydown], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_keydown(
    node: HTMLElement,
    eventName: keydown,
    handler: EventHandler[keydown],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_keypress(node: HTMLElement, eventName: keypress, handler: EventHandler[keypress]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_keypress(node: HTMLElement, eventName: keypress, handler: EventHandler[keypress], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_keypress(
    node: HTMLElement,
    eventName: keypress,
    handler: EventHandler[keypress],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_keyup(node: HTMLElement, eventName: keyup, handler: EventHandler[keyup]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_keyup(node: HTMLElement, eventName: keyup, handler: EventHandler[keyup], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_keyup(
    node: HTMLElement,
    eventName: keyup,
    handler: EventHandler[keyup],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_load(node: HTMLElement, eventName: load, handler: EventHandler[load]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_load(node: HTMLElement, eventName: load, handler: EventHandler[load], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_load(node: HTMLElement, eventName: load, handler: EventHandler[load], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSName("default")
  def default_loadeddata(node: HTMLElement, eventName: loadeddata, handler: EventHandler[loadeddata]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_loadeddata(node: HTMLElement, eventName: loadeddata, handler: EventHandler[loadeddata], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_loadeddata(
    node: HTMLElement,
    eventName: loadeddata,
    handler: EventHandler[loadeddata],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_loadedmetadata(node: HTMLElement, eventName: loadedmetadata, handler: EventHandler[loadedmetadata]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: EventHandler[loadedmetadata],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: EventHandler[loadedmetadata],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_loadend(node: HTMLElement, eventName: loadend, handler: EventHandler[loadend]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_loadend(node: HTMLElement, eventName: loadend, handler: EventHandler[loadend], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_loadend(
    node: HTMLElement,
    eventName: loadend,
    handler: EventHandler[loadend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_loadstart(node: HTMLElement, eventName: loadstart, handler: EventHandler[loadstart]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_loadstart(node: HTMLElement, eventName: loadstart, handler: EventHandler[loadstart], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_loadstart(
    node: HTMLElement,
    eventName: loadstart,
    handler: EventHandler[loadstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_lostpointercapture(node: HTMLElement, eventName: lostpointercapture, handler: EventHandler[lostpointercapture]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: EventHandler[lostpointercapture],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: EventHandler[lostpointercapture],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_mousedown(node: HTMLElement, eventName: mousedown, handler: EventHandler[mousedown]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_mousedown(node: HTMLElement, eventName: mousedown, handler: EventHandler[mousedown], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_mousedown(
    node: HTMLElement,
    eventName: mousedown,
    handler: EventHandler[mousedown],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_mouseenter(node: HTMLElement, eventName: mouseenter, handler: EventHandler[mouseenter]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_mouseenter(node: HTMLElement, eventName: mouseenter, handler: EventHandler[mouseenter], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_mouseenter(
    node: HTMLElement,
    eventName: mouseenter,
    handler: EventHandler[mouseenter],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_mouseleave(node: HTMLElement, eventName: mouseleave, handler: EventHandler[mouseleave]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_mouseleave(node: HTMLElement, eventName: mouseleave, handler: EventHandler[mouseleave], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_mouseleave(
    node: HTMLElement,
    eventName: mouseleave,
    handler: EventHandler[mouseleave],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_mousemove(node: HTMLElement, eventName: mousemove, handler: EventHandler[mousemove]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_mousemove(node: HTMLElement, eventName: mousemove, handler: EventHandler[mousemove], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_mousemove(
    node: HTMLElement,
    eventName: mousemove,
    handler: EventHandler[mousemove],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_mouseout(node: HTMLElement, eventName: mouseout, handler: EventHandler[mouseout]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_mouseout(node: HTMLElement, eventName: mouseout, handler: EventHandler[mouseout], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_mouseout(
    node: HTMLElement,
    eventName: mouseout,
    handler: EventHandler[mouseout],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_mouseover(node: HTMLElement, eventName: mouseover, handler: EventHandler[mouseover]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_mouseover(node: HTMLElement, eventName: mouseover, handler: EventHandler[mouseover], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_mouseover(
    node: HTMLElement,
    eventName: mouseover,
    handler: EventHandler[mouseover],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_mouseup(node: HTMLElement, eventName: mouseup, handler: EventHandler[mouseup]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_mouseup(node: HTMLElement, eventName: mouseup, handler: EventHandler[mouseup], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_mouseup(
    node: HTMLElement,
    eventName: mouseup,
    handler: EventHandler[mouseup],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_paste(node: HTMLElement, eventName: paste, handler: EventHandler[paste]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_paste(node: HTMLElement, eventName: paste, handler: EventHandler[paste], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_paste(
    node: HTMLElement,
    eventName: paste,
    handler: EventHandler[paste],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pause(node: HTMLElement, eventName: pause, handler: EventHandler[pause]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pause(node: HTMLElement, eventName: pause, handler: EventHandler[pause], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pause(
    node: HTMLElement,
    eventName: pause,
    handler: EventHandler[pause],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_play(node: HTMLElement, eventName: play, handler: EventHandler[play]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_play(node: HTMLElement, eventName: play, handler: EventHandler[play], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_play(node: HTMLElement, eventName: play, handler: EventHandler[play], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSName("default")
  def default_playing(node: HTMLElement, eventName: playing, handler: EventHandler[playing]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_playing(node: HTMLElement, eventName: playing, handler: EventHandler[playing], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_playing(
    node: HTMLElement,
    eventName: playing,
    handler: EventHandler[playing],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointercancel(node: HTMLElement, eventName: pointercancel, handler: EventHandler[pointercancel]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: EventHandler[pointercancel],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: EventHandler[pointercancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointerdown(node: HTMLElement, eventName: pointerdown, handler: EventHandler[pointerdown]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointerdown(node: HTMLElement, eventName: pointerdown, handler: EventHandler[pointerdown], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointerdown(
    node: HTMLElement,
    eventName: pointerdown,
    handler: EventHandler[pointerdown],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointerenter(node: HTMLElement, eventName: pointerenter, handler: EventHandler[pointerenter]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointerenter(node: HTMLElement, eventName: pointerenter, handler: EventHandler[pointerenter], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointerenter(
    node: HTMLElement,
    eventName: pointerenter,
    handler: EventHandler[pointerenter],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointerleave(node: HTMLElement, eventName: pointerleave, handler: EventHandler[pointerleave]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointerleave(node: HTMLElement, eventName: pointerleave, handler: EventHandler[pointerleave], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointerleave(
    node: HTMLElement,
    eventName: pointerleave,
    handler: EventHandler[pointerleave],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointermove(node: HTMLElement, eventName: pointermove, handler: EventHandler[pointermove]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointermove(node: HTMLElement, eventName: pointermove, handler: EventHandler[pointermove], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointermove(
    node: HTMLElement,
    eventName: pointermove,
    handler: EventHandler[pointermove],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointerout(node: HTMLElement, eventName: pointerout, handler: EventHandler[pointerout]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointerout(node: HTMLElement, eventName: pointerout, handler: EventHandler[pointerout], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointerout(
    node: HTMLElement,
    eventName: pointerout,
    handler: EventHandler[pointerout],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointerover(node: HTMLElement, eventName: pointerover, handler: EventHandler[pointerover]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointerover(node: HTMLElement, eventName: pointerover, handler: EventHandler[pointerover], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointerover(
    node: HTMLElement,
    eventName: pointerover,
    handler: EventHandler[pointerover],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointerup(node: HTMLElement, eventName: pointerup, handler: EventHandler[pointerup]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointerup(node: HTMLElement, eventName: pointerup, handler: EventHandler[pointerup], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_pointerup(
    node: HTMLElement,
    eventName: pointerup,
    handler: EventHandler[pointerup],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_progress(node: HTMLElement, eventName: progress, handler: EventHandler[progress]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_progress(node: HTMLElement, eventName: progress, handler: EventHandler[progress], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_progress(
    node: HTMLElement,
    eventName: progress,
    handler: EventHandler[progress],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_ratechange(node: HTMLElement, eventName: ratechange, handler: EventHandler[ratechange]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_ratechange(node: HTMLElement, eventName: ratechange, handler: EventHandler[ratechange], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_ratechange(
    node: HTMLElement,
    eventName: ratechange,
    handler: EventHandler[ratechange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_reset(node: HTMLElement, eventName: reset, handler: EventHandler[reset]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_reset(node: HTMLElement, eventName: reset, handler: EventHandler[reset], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_reset(
    node: HTMLElement,
    eventName: reset,
    handler: EventHandler[reset],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_resize(node: HTMLElement, eventName: resize, handler: EventHandler[resize]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_resize(node: HTMLElement, eventName: resize, handler: EventHandler[resize], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_resize(
    node: HTMLElement,
    eventName: resize,
    handler: EventHandler[resize],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_scroll(node: HTMLElement, eventName: scroll, handler: EventHandler[scroll]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_scroll(node: HTMLElement, eventName: scroll, handler: EventHandler[scroll], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_scroll(
    node: HTMLElement,
    eventName: scroll,
    handler: EventHandler[scroll],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: EventHandler[securitypolicyviolation]
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: EventHandler[securitypolicyviolation],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: EventHandler[securitypolicyviolation],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_seeked(node: HTMLElement, eventName: seeked, handler: EventHandler[seeked]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_seeked(node: HTMLElement, eventName: seeked, handler: EventHandler[seeked], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_seeked(
    node: HTMLElement,
    eventName: seeked,
    handler: EventHandler[seeked],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_seeking(node: HTMLElement, eventName: seeking, handler: EventHandler[seeking]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_seeking(node: HTMLElement, eventName: seeking, handler: EventHandler[seeking], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_seeking(
    node: HTMLElement,
    eventName: seeking,
    handler: EventHandler[seeking],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_select(node: HTMLElement, eventName: select, handler: EventHandler[select]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_select(node: HTMLElement, eventName: select, handler: EventHandler[select], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_select(
    node: HTMLElement,
    eventName: select,
    handler: EventHandler[select],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_selectionchange(node: HTMLElement, eventName: selectionchange, handler: EventHandler[selectionchange]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: EventHandler[selectionchange],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: EventHandler[selectionchange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_selectstart(node: HTMLElement, eventName: selectstart, handler: EventHandler[selectstart]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_selectstart(node: HTMLElement, eventName: selectstart, handler: EventHandler[selectstart], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_selectstart(
    node: HTMLElement,
    eventName: selectstart,
    handler: EventHandler[selectstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_stalled(node: HTMLElement, eventName: stalled, handler: EventHandler[stalled]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_stalled(node: HTMLElement, eventName: stalled, handler: EventHandler[stalled], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_stalled(
    node: HTMLElement,
    eventName: stalled,
    handler: EventHandler[stalled],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_submit(node: HTMLElement, eventName: submit, handler: EventHandler[submit]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_submit(node: HTMLElement, eventName: submit, handler: EventHandler[submit], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_submit(
    node: HTMLElement,
    eventName: submit,
    handler: EventHandler[submit],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_suspend(node: HTMLElement, eventName: suspend, handler: EventHandler[suspend]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_suspend(node: HTMLElement, eventName: suspend, handler: EventHandler[suspend], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_suspend(
    node: HTMLElement,
    eventName: suspend,
    handler: EventHandler[suspend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_timeupdate(node: HTMLElement, eventName: timeupdate, handler: EventHandler[timeupdate]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_timeupdate(node: HTMLElement, eventName: timeupdate, handler: EventHandler[timeupdate], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_timeupdate(
    node: HTMLElement,
    eventName: timeupdate,
    handler: EventHandler[timeupdate],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_toggle(node: HTMLElement, eventName: toggle, handler: EventHandler[toggle]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_toggle(node: HTMLElement, eventName: toggle, handler: EventHandler[toggle], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_toggle(
    node: HTMLElement,
    eventName: toggle,
    handler: EventHandler[toggle],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_touchcancel(node: HTMLElement, eventName: touchcancel, handler: EventHandler[touchcancel]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_touchcancel(node: HTMLElement, eventName: touchcancel, handler: EventHandler[touchcancel], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_touchcancel(
    node: HTMLElement,
    eventName: touchcancel,
    handler: EventHandler[touchcancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_touchend(node: HTMLElement, eventName: touchend, handler: EventHandler[touchend]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_touchend(node: HTMLElement, eventName: touchend, handler: EventHandler[touchend], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_touchend(
    node: HTMLElement,
    eventName: touchend,
    handler: EventHandler[touchend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_touchmove(node: HTMLElement, eventName: touchmove, handler: EventHandler[touchmove]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_touchmove(node: HTMLElement, eventName: touchmove, handler: EventHandler[touchmove], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_touchmove(
    node: HTMLElement,
    eventName: touchmove,
    handler: EventHandler[touchmove],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_touchstart(node: HTMLElement, eventName: touchstart, handler: EventHandler[touchstart]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_touchstart(node: HTMLElement, eventName: touchstart, handler: EventHandler[touchstart], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_touchstart(
    node: HTMLElement,
    eventName: touchstart,
    handler: EventHandler[touchstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_transitioncancel(node: HTMLElement, eventName: transitioncancel, handler: EventHandler[transitioncancel]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: EventHandler[transitioncancel],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: EventHandler[transitioncancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_transitionend(node: HTMLElement, eventName: transitionend, handler: EventHandler[transitionend]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: EventHandler[transitionend],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: EventHandler[transitionend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_transitionrun(node: HTMLElement, eventName: transitionrun, handler: EventHandler[transitionrun]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: EventHandler[transitionrun],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: EventHandler[transitionrun],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_transitionstart(node: HTMLElement, eventName: transitionstart, handler: EventHandler[transitionstart]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: EventHandler[transitionstart],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: EventHandler[transitionstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_volumechange(node: HTMLElement, eventName: volumechange, handler: EventHandler[volumechange]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_volumechange(node: HTMLElement, eventName: volumechange, handler: EventHandler[volumechange], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_volumechange(
    node: HTMLElement,
    eventName: volumechange,
    handler: EventHandler[volumechange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_waiting(node: HTMLElement, eventName: waiting, handler: EventHandler[waiting]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_waiting(node: HTMLElement, eventName: waiting, handler: EventHandler[waiting], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_waiting(
    node: HTMLElement,
    eventName: waiting,
    handler: EventHandler[waiting],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("default")
  def default_wheel(node: HTMLElement, eventName: wheel, handler: EventHandler[wheel]): js.Function0[Unit] = js.native
  @JSName("default")
  def default_wheel(node: HTMLElement, eventName: wheel, handler: EventHandler[wheel], options: Boolean): js.Function0[Unit] = js.native
  @JSName("default")
  def default_wheel(
    node: HTMLElement,
    eventName: wheel,
    handler: EventHandler[wheel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
}

