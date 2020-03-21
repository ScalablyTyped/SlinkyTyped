package typingsSlinky.domHelpers

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.domHelpers.addEventListenerMod.EventHandler
import typingsSlinky.domHelpers.domHelpersStrings.abort
import typingsSlinky.domHelpers.domHelpersStrings.animationcancel
import typingsSlinky.domHelpers.domHelpersStrings.animationend
import typingsSlinky.domHelpers.domHelpersStrings.animationiteration
import typingsSlinky.domHelpers.domHelpersStrings.animationstart
import typingsSlinky.domHelpers.domHelpersStrings.auxclick
import typingsSlinky.domHelpers.domHelpersStrings.blur
import typingsSlinky.domHelpers.domHelpersStrings.cancel
import typingsSlinky.domHelpers.domHelpersStrings.canplay
import typingsSlinky.domHelpers.domHelpersStrings.canplaythrough
import typingsSlinky.domHelpers.domHelpersStrings.change
import typingsSlinky.domHelpers.domHelpersStrings.click
import typingsSlinky.domHelpers.domHelpersStrings.close
import typingsSlinky.domHelpers.domHelpersStrings.contextmenu
import typingsSlinky.domHelpers.domHelpersStrings.copy
import typingsSlinky.domHelpers.domHelpersStrings.cuechange
import typingsSlinky.domHelpers.domHelpersStrings.cut
import typingsSlinky.domHelpers.domHelpersStrings.dblclick
import typingsSlinky.domHelpers.domHelpersStrings.drag
import typingsSlinky.domHelpers.domHelpersStrings.dragend
import typingsSlinky.domHelpers.domHelpersStrings.dragenter
import typingsSlinky.domHelpers.domHelpersStrings.dragexit
import typingsSlinky.domHelpers.domHelpersStrings.dragleave
import typingsSlinky.domHelpers.domHelpersStrings.dragover
import typingsSlinky.domHelpers.domHelpersStrings.dragstart
import typingsSlinky.domHelpers.domHelpersStrings.drop
import typingsSlinky.domHelpers.domHelpersStrings.durationchange
import typingsSlinky.domHelpers.domHelpersStrings.emptied
import typingsSlinky.domHelpers.domHelpersStrings.ended
import typingsSlinky.domHelpers.domHelpersStrings.error
import typingsSlinky.domHelpers.domHelpersStrings.focus
import typingsSlinky.domHelpers.domHelpersStrings.focusin
import typingsSlinky.domHelpers.domHelpersStrings.focusout
import typingsSlinky.domHelpers.domHelpersStrings.fullscreenchange
import typingsSlinky.domHelpers.domHelpersStrings.fullscreenerror
import typingsSlinky.domHelpers.domHelpersStrings.gotpointercapture
import typingsSlinky.domHelpers.domHelpersStrings.input
import typingsSlinky.domHelpers.domHelpersStrings.invalid
import typingsSlinky.domHelpers.domHelpersStrings.keydown
import typingsSlinky.domHelpers.domHelpersStrings.keypress
import typingsSlinky.domHelpers.domHelpersStrings.keyup
import typingsSlinky.domHelpers.domHelpersStrings.load
import typingsSlinky.domHelpers.domHelpersStrings.loadeddata
import typingsSlinky.domHelpers.domHelpersStrings.loadedmetadata
import typingsSlinky.domHelpers.domHelpersStrings.loadstart
import typingsSlinky.domHelpers.domHelpersStrings.lostpointercapture
import typingsSlinky.domHelpers.domHelpersStrings.mousedown
import typingsSlinky.domHelpers.domHelpersStrings.mouseenter
import typingsSlinky.domHelpers.domHelpersStrings.mouseleave
import typingsSlinky.domHelpers.domHelpersStrings.mousemove
import typingsSlinky.domHelpers.domHelpersStrings.mouseout
import typingsSlinky.domHelpers.domHelpersStrings.mouseover
import typingsSlinky.domHelpers.domHelpersStrings.mouseup
import typingsSlinky.domHelpers.domHelpersStrings.paste
import typingsSlinky.domHelpers.domHelpersStrings.pause
import typingsSlinky.domHelpers.domHelpersStrings.play
import typingsSlinky.domHelpers.domHelpersStrings.playing
import typingsSlinky.domHelpers.domHelpersStrings.pointercancel
import typingsSlinky.domHelpers.domHelpersStrings.pointerdown
import typingsSlinky.domHelpers.domHelpersStrings.pointerenter
import typingsSlinky.domHelpers.domHelpersStrings.pointerleave
import typingsSlinky.domHelpers.domHelpersStrings.pointermove
import typingsSlinky.domHelpers.domHelpersStrings.pointerout
import typingsSlinky.domHelpers.domHelpersStrings.pointerover
import typingsSlinky.domHelpers.domHelpersStrings.pointerup
import typingsSlinky.domHelpers.domHelpersStrings.progress
import typingsSlinky.domHelpers.domHelpersStrings.ratechange
import typingsSlinky.domHelpers.domHelpersStrings.reset
import typingsSlinky.domHelpers.domHelpersStrings.resize
import typingsSlinky.domHelpers.domHelpersStrings.scroll
import typingsSlinky.domHelpers.domHelpersStrings.securitypolicyviolation
import typingsSlinky.domHelpers.domHelpersStrings.seeked
import typingsSlinky.domHelpers.domHelpersStrings.seeking
import typingsSlinky.domHelpers.domHelpersStrings.select
import typingsSlinky.domHelpers.domHelpersStrings.selectionchange
import typingsSlinky.domHelpers.domHelpersStrings.selectstart
import typingsSlinky.domHelpers.domHelpersStrings.stalled
import typingsSlinky.domHelpers.domHelpersStrings.submit
import typingsSlinky.domHelpers.domHelpersStrings.suspend
import typingsSlinky.domHelpers.domHelpersStrings.timeupdate
import typingsSlinky.domHelpers.domHelpersStrings.toggle
import typingsSlinky.domHelpers.domHelpersStrings.touchcancel
import typingsSlinky.domHelpers.domHelpersStrings.touchend
import typingsSlinky.domHelpers.domHelpersStrings.touchmove
import typingsSlinky.domHelpers.domHelpersStrings.touchstart
import typingsSlinky.domHelpers.domHelpersStrings.transitioncancel
import typingsSlinky.domHelpers.domHelpersStrings.transitionend
import typingsSlinky.domHelpers.domHelpersStrings.transitionrun
import typingsSlinky.domHelpers.domHelpersStrings.transitionstart
import typingsSlinky.domHelpers.domHelpersStrings.volumechange
import typingsSlinky.domHelpers.domHelpersStrings.waiting
import typingsSlinky.domHelpers.domHelpersStrings.wheel
import typingsSlinky.std.AddEventListenerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn1 extends js.Object {
  def apply(node: HTMLElement, eventName: abort, handler: EventHandler[abort]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: abort, handler: EventHandler[abort], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: abort,
    handler: EventHandler[abort],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: animationcancel, handler: EventHandler[animationcancel]): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: animationcancel,
    handler: EventHandler[animationcancel],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: animationcancel,
    handler: EventHandler[animationcancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: animationend, handler: EventHandler[animationend]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: animationend, handler: EventHandler[animationend], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: animationend,
    handler: EventHandler[animationend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: animationiteration, handler: EventHandler[animationiteration]): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: animationiteration,
    handler: EventHandler[animationiteration],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: animationiteration,
    handler: EventHandler[animationiteration],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: animationstart, handler: EventHandler[animationstart]): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: animationstart,
    handler: EventHandler[animationstart],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: animationstart,
    handler: EventHandler[animationstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: auxclick, handler: EventHandler[auxclick]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: auxclick, handler: EventHandler[auxclick], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: auxclick,
    handler: EventHandler[auxclick],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: blur, handler: EventHandler[blur]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: blur, handler: EventHandler[blur], options: Boolean): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: blur, handler: EventHandler[blur], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: cancel, handler: EventHandler[cancel]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: cancel, handler: EventHandler[cancel], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: cancel,
    handler: EventHandler[cancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: canplay, handler: EventHandler[canplay]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: canplay, handler: EventHandler[canplay], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: canplay,
    handler: EventHandler[canplay],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: canplaythrough, handler: EventHandler[canplaythrough]): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: EventHandler[canplaythrough],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: EventHandler[canplaythrough],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: change, handler: EventHandler[change]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: change, handler: EventHandler[change], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: change,
    handler: EventHandler[change],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: click, handler: EventHandler[click]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: click, handler: EventHandler[click], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: click,
    handler: EventHandler[click],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: close, handler: EventHandler[close]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: close, handler: EventHandler[close], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: close,
    handler: EventHandler[close],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: contextmenu, handler: EventHandler[contextmenu]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: contextmenu, handler: EventHandler[contextmenu], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: contextmenu,
    handler: EventHandler[contextmenu],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: copy, handler: EventHandler[copy]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: copy, handler: EventHandler[copy], options: Boolean): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: copy, handler: EventHandler[copy], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: cuechange, handler: EventHandler[cuechange]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: cuechange, handler: EventHandler[cuechange], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: cuechange,
    handler: EventHandler[cuechange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: cut, handler: EventHandler[cut]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: cut, handler: EventHandler[cut], options: Boolean): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: cut, handler: EventHandler[cut], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: dblclick, handler: EventHandler[dblclick]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: dblclick, handler: EventHandler[dblclick], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: dblclick,
    handler: EventHandler[dblclick],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: dragend, handler: EventHandler[dragend]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: dragend, handler: EventHandler[dragend], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: dragend,
    handler: EventHandler[dragend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: dragenter, handler: EventHandler[dragenter]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: dragenter, handler: EventHandler[dragenter], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: dragenter,
    handler: EventHandler[dragenter],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: dragexit, handler: EventHandler[dragexit]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: dragexit, handler: EventHandler[dragexit], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: dragexit,
    handler: EventHandler[dragexit],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: drag, handler: EventHandler[drag]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: drag, handler: EventHandler[drag], options: Boolean): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: drag, handler: EventHandler[drag], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: dragleave, handler: EventHandler[dragleave]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: dragleave, handler: EventHandler[dragleave], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: dragleave,
    handler: EventHandler[dragleave],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: dragover, handler: EventHandler[dragover]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: dragover, handler: EventHandler[dragover], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: dragover,
    handler: EventHandler[dragover],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: dragstart, handler: EventHandler[dragstart]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: dragstart, handler: EventHandler[dragstart], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: dragstart,
    handler: EventHandler[dragstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: drop, handler: EventHandler[drop]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: drop, handler: EventHandler[drop], options: Boolean): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: drop, handler: EventHandler[drop], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: durationchange, handler: EventHandler[durationchange]): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: durationchange,
    handler: EventHandler[durationchange],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: durationchange,
    handler: EventHandler[durationchange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: emptied, handler: EventHandler[emptied]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: emptied, handler: EventHandler[emptied], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: emptied,
    handler: EventHandler[emptied],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: ended, handler: EventHandler[ended]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: ended, handler: EventHandler[ended], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: ended,
    handler: EventHandler[ended],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: error, handler: EventHandler[error]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: error, handler: EventHandler[error], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: error,
    handler: EventHandler[error],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: focus, handler: EventHandler[focus]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: focus, handler: EventHandler[focus], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: focus,
    handler: EventHandler[focus],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: focusin, handler: EventHandler[focusin]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: focusin, handler: EventHandler[focusin], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: focusin,
    handler: EventHandler[focusin],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: focusout, handler: EventHandler[focusout]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: focusout, handler: EventHandler[focusout], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: focusout,
    handler: EventHandler[focusout],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: fullscreenchange, handler: EventHandler[fullscreenchange]): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: EventHandler[fullscreenchange],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: EventHandler[fullscreenchange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: fullscreenerror, handler: EventHandler[fullscreenerror]): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: EventHandler[fullscreenerror],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: EventHandler[fullscreenerror],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: gotpointercapture, handler: EventHandler[gotpointercapture]): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: EventHandler[gotpointercapture],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: EventHandler[gotpointercapture],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: input, handler: EventHandler[input]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: input, handler: EventHandler[input], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: input,
    handler: EventHandler[input],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: invalid, handler: EventHandler[invalid]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: invalid, handler: EventHandler[invalid], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: invalid,
    handler: EventHandler[invalid],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: keydown, handler: EventHandler[keydown]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: keydown, handler: EventHandler[keydown], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: keydown,
    handler: EventHandler[keydown],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: keypress, handler: EventHandler[keypress]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: keypress, handler: EventHandler[keypress], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: keypress,
    handler: EventHandler[keypress],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: keyup, handler: EventHandler[keyup]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: keyup, handler: EventHandler[keyup], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: keyup,
    handler: EventHandler[keyup],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: loadeddata, handler: EventHandler[loadeddata]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: loadeddata, handler: EventHandler[loadeddata], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: loadeddata,
    handler: EventHandler[loadeddata],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: loadedmetadata, handler: EventHandler[loadedmetadata]): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: EventHandler[loadedmetadata],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: EventHandler[loadedmetadata],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: load, handler: EventHandler[load]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: load, handler: EventHandler[load], options: Boolean): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: load, handler: EventHandler[load], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: loadstart, handler: EventHandler[loadstart]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: loadstart, handler: EventHandler[loadstart], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: loadstart,
    handler: EventHandler[loadstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: lostpointercapture, handler: EventHandler[lostpointercapture]): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: EventHandler[lostpointercapture],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: EventHandler[lostpointercapture],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: mousedown, handler: EventHandler[mousedown]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: mousedown, handler: EventHandler[mousedown], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: mousedown,
    handler: EventHandler[mousedown],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: mouseenter, handler: EventHandler[mouseenter]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: mouseenter, handler: EventHandler[mouseenter], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: mouseenter,
    handler: EventHandler[mouseenter],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: mouseleave, handler: EventHandler[mouseleave]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: mouseleave, handler: EventHandler[mouseleave], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: mouseleave,
    handler: EventHandler[mouseleave],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: mousemove, handler: EventHandler[mousemove]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: mousemove, handler: EventHandler[mousemove], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: mousemove,
    handler: EventHandler[mousemove],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: mouseout, handler: EventHandler[mouseout]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: mouseout, handler: EventHandler[mouseout], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: mouseout,
    handler: EventHandler[mouseout],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: mouseover, handler: EventHandler[mouseover]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: mouseover, handler: EventHandler[mouseover], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: mouseover,
    handler: EventHandler[mouseover],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: mouseup, handler: EventHandler[mouseup]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: mouseup, handler: EventHandler[mouseup], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: mouseup,
    handler: EventHandler[mouseup],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: paste, handler: EventHandler[paste]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: paste, handler: EventHandler[paste], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: paste,
    handler: EventHandler[paste],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: pause, handler: EventHandler[pause]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: pause, handler: EventHandler[pause], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: pause,
    handler: EventHandler[pause],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: play, handler: EventHandler[play]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: play, handler: EventHandler[play], options: Boolean): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: play, handler: EventHandler[play], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: playing, handler: EventHandler[playing]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: playing, handler: EventHandler[playing], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: playing,
    handler: EventHandler[playing],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: pointercancel, handler: EventHandler[pointercancel]): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: pointercancel,
    handler: EventHandler[pointercancel],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: pointercancel,
    handler: EventHandler[pointercancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: pointerdown, handler: EventHandler[pointerdown]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: pointerdown, handler: EventHandler[pointerdown], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: pointerdown,
    handler: EventHandler[pointerdown],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: pointerenter, handler: EventHandler[pointerenter]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: pointerenter, handler: EventHandler[pointerenter], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: pointerenter,
    handler: EventHandler[pointerenter],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: pointerleave, handler: EventHandler[pointerleave]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: pointerleave, handler: EventHandler[pointerleave], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: pointerleave,
    handler: EventHandler[pointerleave],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: pointermove, handler: EventHandler[pointermove]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: pointermove, handler: EventHandler[pointermove], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: pointermove,
    handler: EventHandler[pointermove],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: pointerout, handler: EventHandler[pointerout]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: pointerout, handler: EventHandler[pointerout], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: pointerout,
    handler: EventHandler[pointerout],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: pointerover, handler: EventHandler[pointerover]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: pointerover, handler: EventHandler[pointerover], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: pointerover,
    handler: EventHandler[pointerover],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: pointerup, handler: EventHandler[pointerup]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: pointerup, handler: EventHandler[pointerup], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: pointerup,
    handler: EventHandler[pointerup],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: progress, handler: EventHandler[progress]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: progress, handler: EventHandler[progress], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: progress,
    handler: EventHandler[progress],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: ratechange, handler: EventHandler[ratechange]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: ratechange, handler: EventHandler[ratechange], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: ratechange,
    handler: EventHandler[ratechange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: reset, handler: EventHandler[reset]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: reset, handler: EventHandler[reset], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: reset,
    handler: EventHandler[reset],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: resize, handler: EventHandler[resize]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: resize, handler: EventHandler[resize], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: resize,
    handler: EventHandler[resize],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: scroll, handler: EventHandler[scroll]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: scroll, handler: EventHandler[scroll], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: scroll,
    handler: EventHandler[scroll],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: EventHandler[securitypolicyviolation]
  ): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: EventHandler[securitypolicyviolation],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: EventHandler[securitypolicyviolation],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: seeked, handler: EventHandler[seeked]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: seeked, handler: EventHandler[seeked], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: seeked,
    handler: EventHandler[seeked],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: seeking, handler: EventHandler[seeking]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: seeking, handler: EventHandler[seeking], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: seeking,
    handler: EventHandler[seeking],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: select, handler: EventHandler[select]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: select, handler: EventHandler[select], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: select,
    handler: EventHandler[select],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: selectionchange, handler: EventHandler[selectionchange]): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: selectionchange,
    handler: EventHandler[selectionchange],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: selectionchange,
    handler: EventHandler[selectionchange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: selectstart, handler: EventHandler[selectstart]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: selectstart, handler: EventHandler[selectstart], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: selectstart,
    handler: EventHandler[selectstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: stalled, handler: EventHandler[stalled]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: stalled, handler: EventHandler[stalled], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: stalled,
    handler: EventHandler[stalled],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: submit, handler: EventHandler[submit]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: submit, handler: EventHandler[submit], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: submit,
    handler: EventHandler[submit],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: suspend, handler: EventHandler[suspend]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: suspend, handler: EventHandler[suspend], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: suspend,
    handler: EventHandler[suspend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: timeupdate, handler: EventHandler[timeupdate]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: timeupdate, handler: EventHandler[timeupdate], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: timeupdate,
    handler: EventHandler[timeupdate],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: toggle, handler: EventHandler[toggle]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: toggle, handler: EventHandler[toggle], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: toggle,
    handler: EventHandler[toggle],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: touchcancel, handler: EventHandler[touchcancel]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: touchcancel, handler: EventHandler[touchcancel], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: touchcancel,
    handler: EventHandler[touchcancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: touchend, handler: EventHandler[touchend]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: touchend, handler: EventHandler[touchend], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: touchend,
    handler: EventHandler[touchend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: touchmove, handler: EventHandler[touchmove]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: touchmove, handler: EventHandler[touchmove], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: touchmove,
    handler: EventHandler[touchmove],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: touchstart, handler: EventHandler[touchstart]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: touchstart, handler: EventHandler[touchstart], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: touchstart,
    handler: EventHandler[touchstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: transitioncancel, handler: EventHandler[transitioncancel]): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: EventHandler[transitioncancel],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: EventHandler[transitioncancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: transitionend, handler: EventHandler[transitionend]): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: transitionend,
    handler: EventHandler[transitionend],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: transitionend,
    handler: EventHandler[transitionend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: transitionrun, handler: EventHandler[transitionrun]): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: transitionrun,
    handler: EventHandler[transitionrun],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: transitionrun,
    handler: EventHandler[transitionrun],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: transitionstart, handler: EventHandler[transitionstart]): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: transitionstart,
    handler: EventHandler[transitionstart],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: transitionstart,
    handler: EventHandler[transitionstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: volumechange, handler: EventHandler[volumechange]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: volumechange, handler: EventHandler[volumechange], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: volumechange,
    handler: EventHandler[volumechange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: waiting, handler: EventHandler[waiting]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: waiting, handler: EventHandler[waiting], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: waiting,
    handler: EventHandler[waiting],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: wheel, handler: EventHandler[wheel]): js.Function0[Unit] = js.native
  def apply(node: HTMLElement, eventName: wheel, handler: EventHandler[wheel], options: Boolean): js.Function0[Unit] = js.native
  def apply(
    node: HTMLElement,
    eventName: wheel,
    handler: EventHandler[wheel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
}

