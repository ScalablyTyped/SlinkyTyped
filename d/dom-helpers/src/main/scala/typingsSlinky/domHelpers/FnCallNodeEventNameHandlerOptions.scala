package typingsSlinky.domHelpers

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.domHelpers.addEventListenerMod.TaggedEventHandler
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
trait FnCallNodeEventNameHandlerOptions extends js.Object {
  def apply(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort]): Unit = js.native
  def apply(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: abort,
    handler: TaggedEventHandler[abort],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: animationcancel, handler: TaggedEventHandler[animationcancel]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: animationcancel,
    handler: TaggedEventHandler[animationcancel],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: animationcancel,
    handler: TaggedEventHandler[animationcancel],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: animationend, handler: TaggedEventHandler[animationend]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: animationend,
    handler: TaggedEventHandler[animationend],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: animationend,
    handler: TaggedEventHandler[animationend],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: animationiteration, handler: TaggedEventHandler[animationiteration]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: animationiteration,
    handler: TaggedEventHandler[animationiteration],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: animationiteration,
    handler: TaggedEventHandler[animationiteration],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: animationstart, handler: TaggedEventHandler[animationstart]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: animationstart,
    handler: TaggedEventHandler[animationstart],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: animationstart,
    handler: TaggedEventHandler[animationstart],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick]): Unit = js.native
  def apply(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: auxclick,
    handler: TaggedEventHandler[auxclick],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur]): Unit = js.native
  def apply(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: blur,
    handler: TaggedEventHandler[blur],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel]): Unit = js.native
  def apply(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: cancel,
    handler: TaggedEventHandler[cancel],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay]): Unit = js.native
  def apply(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: canplay,
    handler: TaggedEventHandler[canplay],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: canplaythrough, handler: TaggedEventHandler[canplaythrough]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: TaggedEventHandler[canplaythrough],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: TaggedEventHandler[canplaythrough],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change]): Unit = js.native
  def apply(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: change,
    handler: TaggedEventHandler[change],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click]): Unit = js.native
  def apply(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: click,
    handler: TaggedEventHandler[click],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close]): Unit = js.native
  def apply(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: close,
    handler: TaggedEventHandler[close],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: contextmenu, handler: TaggedEventHandler[contextmenu]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: contextmenu,
    handler: TaggedEventHandler[contextmenu],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: contextmenu,
    handler: TaggedEventHandler[contextmenu],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy]): Unit = js.native
  def apply(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: copy,
    handler: TaggedEventHandler[copy],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange]): Unit = js.native
  def apply(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: cuechange,
    handler: TaggedEventHandler[cuechange],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut]): Unit = js.native
  def apply(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: cut,
    handler: TaggedEventHandler[cut],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick]): Unit = js.native
  def apply(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: dblclick,
    handler: TaggedEventHandler[dblclick],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend]): Unit = js.native
  def apply(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: dragend,
    handler: TaggedEventHandler[dragend],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter]): Unit = js.native
  def apply(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: dragenter,
    handler: TaggedEventHandler[dragenter],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit]): Unit = js.native
  def apply(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: dragexit,
    handler: TaggedEventHandler[dragexit],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag]): Unit = js.native
  def apply(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: drag,
    handler: TaggedEventHandler[drag],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave]): Unit = js.native
  def apply(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: dragleave,
    handler: TaggedEventHandler[dragleave],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover]): Unit = js.native
  def apply(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: dragover,
    handler: TaggedEventHandler[dragover],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart]): Unit = js.native
  def apply(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: dragstart,
    handler: TaggedEventHandler[dragstart],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop]): Unit = js.native
  def apply(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: drop,
    handler: TaggedEventHandler[drop],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: durationchange, handler: TaggedEventHandler[durationchange]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: durationchange,
    handler: TaggedEventHandler[durationchange],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: durationchange,
    handler: TaggedEventHandler[durationchange],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied]): Unit = js.native
  def apply(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: emptied,
    handler: TaggedEventHandler[emptied],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended]): Unit = js.native
  def apply(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: ended,
    handler: TaggedEventHandler[ended],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error]): Unit = js.native
  def apply(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: error,
    handler: TaggedEventHandler[error],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus]): Unit = js.native
  def apply(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: focus,
    handler: TaggedEventHandler[focus],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin]): Unit = js.native
  def apply(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: focusin,
    handler: TaggedEventHandler[focusin],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout]): Unit = js.native
  def apply(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: focusout,
    handler: TaggedEventHandler[focusout],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: fullscreenchange, handler: TaggedEventHandler[fullscreenchange]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: TaggedEventHandler[fullscreenchange],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: TaggedEventHandler[fullscreenchange],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: fullscreenerror, handler: TaggedEventHandler[fullscreenerror]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: TaggedEventHandler[fullscreenerror],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: TaggedEventHandler[fullscreenerror],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: gotpointercapture, handler: TaggedEventHandler[gotpointercapture]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: TaggedEventHandler[gotpointercapture],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: TaggedEventHandler[gotpointercapture],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input]): Unit = js.native
  def apply(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: input,
    handler: TaggedEventHandler[input],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid]): Unit = js.native
  def apply(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: invalid,
    handler: TaggedEventHandler[invalid],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown]): Unit = js.native
  def apply(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: keydown,
    handler: TaggedEventHandler[keydown],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress]): Unit = js.native
  def apply(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: keypress,
    handler: TaggedEventHandler[keypress],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup]): Unit = js.native
  def apply(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: keyup,
    handler: TaggedEventHandler[keyup],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: loadeddata, handler: TaggedEventHandler[loadeddata]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: loadeddata,
    handler: TaggedEventHandler[loadeddata],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: loadeddata,
    handler: TaggedEventHandler[loadeddata],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: loadedmetadata, handler: TaggedEventHandler[loadedmetadata]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: TaggedEventHandler[loadedmetadata],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: TaggedEventHandler[loadedmetadata],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load]): Unit = js.native
  def apply(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: load,
    handler: TaggedEventHandler[load],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart]): Unit = js.native
  def apply(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: loadstart,
    handler: TaggedEventHandler[loadstart],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: lostpointercapture, handler: TaggedEventHandler[lostpointercapture]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: TaggedEventHandler[lostpointercapture],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: TaggedEventHandler[lostpointercapture],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown]): Unit = js.native
  def apply(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: mousedown,
    handler: TaggedEventHandler[mousedown],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: mouseenter, handler: TaggedEventHandler[mouseenter]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: mouseenter,
    handler: TaggedEventHandler[mouseenter],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: mouseenter,
    handler: TaggedEventHandler[mouseenter],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: mouseleave, handler: TaggedEventHandler[mouseleave]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: mouseleave,
    handler: TaggedEventHandler[mouseleave],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: mouseleave,
    handler: TaggedEventHandler[mouseleave],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove]): Unit = js.native
  def apply(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: mousemove,
    handler: TaggedEventHandler[mousemove],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout]): Unit = js.native
  def apply(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: mouseout,
    handler: TaggedEventHandler[mouseout],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover]): Unit = js.native
  def apply(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: mouseover,
    handler: TaggedEventHandler[mouseover],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup]): Unit = js.native
  def apply(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: mouseup,
    handler: TaggedEventHandler[mouseup],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste]): Unit = js.native
  def apply(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: paste,
    handler: TaggedEventHandler[paste],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause]): Unit = js.native
  def apply(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: pause,
    handler: TaggedEventHandler[pause],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play]): Unit = js.native
  def apply(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: play,
    handler: TaggedEventHandler[play],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing]): Unit = js.native
  def apply(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: playing,
    handler: TaggedEventHandler[playing],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: pointercancel, handler: TaggedEventHandler[pointercancel]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: pointercancel,
    handler: TaggedEventHandler[pointercancel],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: pointercancel,
    handler: TaggedEventHandler[pointercancel],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: pointerdown, handler: TaggedEventHandler[pointerdown]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: pointerdown,
    handler: TaggedEventHandler[pointerdown],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: pointerdown,
    handler: TaggedEventHandler[pointerdown],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: pointerenter, handler: TaggedEventHandler[pointerenter]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: pointerenter,
    handler: TaggedEventHandler[pointerenter],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: pointerenter,
    handler: TaggedEventHandler[pointerenter],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: pointerleave, handler: TaggedEventHandler[pointerleave]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: pointerleave,
    handler: TaggedEventHandler[pointerleave],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: pointerleave,
    handler: TaggedEventHandler[pointerleave],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: pointermove, handler: TaggedEventHandler[pointermove]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: pointermove,
    handler: TaggedEventHandler[pointermove],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: pointermove,
    handler: TaggedEventHandler[pointermove],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: pointerout, handler: TaggedEventHandler[pointerout]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: pointerout,
    handler: TaggedEventHandler[pointerout],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: pointerout,
    handler: TaggedEventHandler[pointerout],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: pointerover, handler: TaggedEventHandler[pointerover]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: pointerover,
    handler: TaggedEventHandler[pointerover],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: pointerover,
    handler: TaggedEventHandler[pointerover],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup]): Unit = js.native
  def apply(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: pointerup,
    handler: TaggedEventHandler[pointerup],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress]): Unit = js.native
  def apply(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: progress,
    handler: TaggedEventHandler[progress],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: ratechange, handler: TaggedEventHandler[ratechange]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: ratechange,
    handler: TaggedEventHandler[ratechange],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: ratechange,
    handler: TaggedEventHandler[ratechange],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset]): Unit = js.native
  def apply(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: reset,
    handler: TaggedEventHandler[reset],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize]): Unit = js.native
  def apply(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: resize,
    handler: TaggedEventHandler[resize],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll]): Unit = js.native
  def apply(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: scroll,
    handler: TaggedEventHandler[scroll],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation]
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked]): Unit = js.native
  def apply(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: seeked,
    handler: TaggedEventHandler[seeked],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking]): Unit = js.native
  def apply(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: seeking,
    handler: TaggedEventHandler[seeking],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select]): Unit = js.native
  def apply(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: select,
    handler: TaggedEventHandler[select],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: selectionchange, handler: TaggedEventHandler[selectionchange]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: selectionchange,
    handler: TaggedEventHandler[selectionchange],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: selectionchange,
    handler: TaggedEventHandler[selectionchange],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: selectstart, handler: TaggedEventHandler[selectstart]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: selectstart,
    handler: TaggedEventHandler[selectstart],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: selectstart,
    handler: TaggedEventHandler[selectstart],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled]): Unit = js.native
  def apply(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: stalled,
    handler: TaggedEventHandler[stalled],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit]): Unit = js.native
  def apply(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: submit,
    handler: TaggedEventHandler[submit],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend]): Unit = js.native
  def apply(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: suspend,
    handler: TaggedEventHandler[suspend],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: timeupdate, handler: TaggedEventHandler[timeupdate]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: timeupdate,
    handler: TaggedEventHandler[timeupdate],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: timeupdate,
    handler: TaggedEventHandler[timeupdate],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle]): Unit = js.native
  def apply(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: toggle,
    handler: TaggedEventHandler[toggle],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: touchcancel, handler: TaggedEventHandler[touchcancel]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: touchcancel,
    handler: TaggedEventHandler[touchcancel],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: touchcancel,
    handler: TaggedEventHandler[touchcancel],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend]): Unit = js.native
  def apply(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: touchend,
    handler: TaggedEventHandler[touchend],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove]): Unit = js.native
  def apply(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: touchmove,
    handler: TaggedEventHandler[touchmove],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: touchstart, handler: TaggedEventHandler[touchstart]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: touchstart,
    handler: TaggedEventHandler[touchstart],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: touchstart,
    handler: TaggedEventHandler[touchstart],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: transitioncancel, handler: TaggedEventHandler[transitioncancel]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: TaggedEventHandler[transitioncancel],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: TaggedEventHandler[transitioncancel],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: transitionend, handler: TaggedEventHandler[transitionend]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: transitionend,
    handler: TaggedEventHandler[transitionend],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: transitionend,
    handler: TaggedEventHandler[transitionend],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: transitionrun, handler: TaggedEventHandler[transitionrun]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: transitionrun,
    handler: TaggedEventHandler[transitionrun],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: transitionrun,
    handler: TaggedEventHandler[transitionrun],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: transitionstart, handler: TaggedEventHandler[transitionstart]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: transitionstart,
    handler: TaggedEventHandler[transitionstart],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: transitionstart,
    handler: TaggedEventHandler[transitionstart],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: volumechange, handler: TaggedEventHandler[volumechange]): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: volumechange,
    handler: TaggedEventHandler[volumechange],
    options: Boolean
  ): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: volumechange,
    handler: TaggedEventHandler[volumechange],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting]): Unit = js.native
  def apply(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: waiting,
    handler: TaggedEventHandler[waiting],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel]): Unit = js.native
  def apply(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel], options: Boolean): Unit = js.native
  def apply(
    node: HTMLElement,
    eventName: wheel,
    handler: TaggedEventHandler[wheel],
    options: AddEventListenerOptions
  ): Unit = js.native
}

