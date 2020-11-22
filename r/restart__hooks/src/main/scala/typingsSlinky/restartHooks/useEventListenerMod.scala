package typingsSlinky.restartHooks

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import typingsSlinky.restartHooks.restartHooksStrings.abort
import typingsSlinky.restartHooks.restartHooksStrings.animationcancel
import typingsSlinky.restartHooks.restartHooksStrings.animationend
import typingsSlinky.restartHooks.restartHooksStrings.animationiteration
import typingsSlinky.restartHooks.restartHooksStrings.animationstart
import typingsSlinky.restartHooks.restartHooksStrings.auxclick
import typingsSlinky.restartHooks.restartHooksStrings.blur
import typingsSlinky.restartHooks.restartHooksStrings.cancel
import typingsSlinky.restartHooks.restartHooksStrings.canplay
import typingsSlinky.restartHooks.restartHooksStrings.canplaythrough
import typingsSlinky.restartHooks.restartHooksStrings.change
import typingsSlinky.restartHooks.restartHooksStrings.click
import typingsSlinky.restartHooks.restartHooksStrings.close
import typingsSlinky.restartHooks.restartHooksStrings.contextmenu
import typingsSlinky.restartHooks.restartHooksStrings.copy
import typingsSlinky.restartHooks.restartHooksStrings.cuechange
import typingsSlinky.restartHooks.restartHooksStrings.cut
import typingsSlinky.restartHooks.restartHooksStrings.dblclick
import typingsSlinky.restartHooks.restartHooksStrings.drag
import typingsSlinky.restartHooks.restartHooksStrings.dragend
import typingsSlinky.restartHooks.restartHooksStrings.dragenter
import typingsSlinky.restartHooks.restartHooksStrings.dragexit
import typingsSlinky.restartHooks.restartHooksStrings.dragleave
import typingsSlinky.restartHooks.restartHooksStrings.dragover
import typingsSlinky.restartHooks.restartHooksStrings.dragstart
import typingsSlinky.restartHooks.restartHooksStrings.drop
import typingsSlinky.restartHooks.restartHooksStrings.durationchange
import typingsSlinky.restartHooks.restartHooksStrings.emptied
import typingsSlinky.restartHooks.restartHooksStrings.ended
import typingsSlinky.restartHooks.restartHooksStrings.error
import typingsSlinky.restartHooks.restartHooksStrings.focus
import typingsSlinky.restartHooks.restartHooksStrings.focusin
import typingsSlinky.restartHooks.restartHooksStrings.focusout
import typingsSlinky.restartHooks.restartHooksStrings.fullscreenchange
import typingsSlinky.restartHooks.restartHooksStrings.fullscreenerror
import typingsSlinky.restartHooks.restartHooksStrings.gotpointercapture
import typingsSlinky.restartHooks.restartHooksStrings.input
import typingsSlinky.restartHooks.restartHooksStrings.invalid
import typingsSlinky.restartHooks.restartHooksStrings.keydown
import typingsSlinky.restartHooks.restartHooksStrings.keypress
import typingsSlinky.restartHooks.restartHooksStrings.keyup
import typingsSlinky.restartHooks.restartHooksStrings.load
import typingsSlinky.restartHooks.restartHooksStrings.loadeddata
import typingsSlinky.restartHooks.restartHooksStrings.loadedmetadata
import typingsSlinky.restartHooks.restartHooksStrings.loadstart
import typingsSlinky.restartHooks.restartHooksStrings.lostpointercapture
import typingsSlinky.restartHooks.restartHooksStrings.mousedown
import typingsSlinky.restartHooks.restartHooksStrings.mouseenter
import typingsSlinky.restartHooks.restartHooksStrings.mouseleave
import typingsSlinky.restartHooks.restartHooksStrings.mousemove
import typingsSlinky.restartHooks.restartHooksStrings.mouseout
import typingsSlinky.restartHooks.restartHooksStrings.mouseover
import typingsSlinky.restartHooks.restartHooksStrings.mouseup
import typingsSlinky.restartHooks.restartHooksStrings.paste
import typingsSlinky.restartHooks.restartHooksStrings.pause
import typingsSlinky.restartHooks.restartHooksStrings.play
import typingsSlinky.restartHooks.restartHooksStrings.playing
import typingsSlinky.restartHooks.restartHooksStrings.pointercancel
import typingsSlinky.restartHooks.restartHooksStrings.pointerdown
import typingsSlinky.restartHooks.restartHooksStrings.pointerenter
import typingsSlinky.restartHooks.restartHooksStrings.pointerleave
import typingsSlinky.restartHooks.restartHooksStrings.pointerlockchange
import typingsSlinky.restartHooks.restartHooksStrings.pointerlockerror
import typingsSlinky.restartHooks.restartHooksStrings.pointermove
import typingsSlinky.restartHooks.restartHooksStrings.pointerout
import typingsSlinky.restartHooks.restartHooksStrings.pointerover
import typingsSlinky.restartHooks.restartHooksStrings.pointerup
import typingsSlinky.restartHooks.restartHooksStrings.progress
import typingsSlinky.restartHooks.restartHooksStrings.ratechange
import typingsSlinky.restartHooks.restartHooksStrings.readystatechange
import typingsSlinky.restartHooks.restartHooksStrings.reset
import typingsSlinky.restartHooks.restartHooksStrings.resize
import typingsSlinky.restartHooks.restartHooksStrings.scroll
import typingsSlinky.restartHooks.restartHooksStrings.securitypolicyviolation
import typingsSlinky.restartHooks.restartHooksStrings.seeked
import typingsSlinky.restartHooks.restartHooksStrings.seeking
import typingsSlinky.restartHooks.restartHooksStrings.select
import typingsSlinky.restartHooks.restartHooksStrings.selectionchange
import typingsSlinky.restartHooks.restartHooksStrings.selectstart
import typingsSlinky.restartHooks.restartHooksStrings.stalled
import typingsSlinky.restartHooks.restartHooksStrings.submit
import typingsSlinky.restartHooks.restartHooksStrings.suspend
import typingsSlinky.restartHooks.restartHooksStrings.timeupdate
import typingsSlinky.restartHooks.restartHooksStrings.toggle
import typingsSlinky.restartHooks.restartHooksStrings.touchcancel
import typingsSlinky.restartHooks.restartHooksStrings.touchend
import typingsSlinky.restartHooks.restartHooksStrings.touchmove
import typingsSlinky.restartHooks.restartHooksStrings.touchstart
import typingsSlinky.restartHooks.restartHooksStrings.transitioncancel
import typingsSlinky.restartHooks.restartHooksStrings.transitionend
import typingsSlinky.restartHooks.restartHooksStrings.transitionrun
import typingsSlinky.restartHooks.restartHooksStrings.transitionstart
import typingsSlinky.restartHooks.restartHooksStrings.visibilitychange
import typingsSlinky.restartHooks.restartHooksStrings.volumechange
import typingsSlinky.restartHooks.restartHooksStrings.waiting
import typingsSlinky.restartHooks.restartHooksStrings.wheel
import typingsSlinky.std.AddEventListenerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@restart/hooks/cjs/useEventListener", JSImport.Namespace)
@js.native
object useEventListenerMod extends js.Object {
  
  @JSName("default")
  def default_abort[T /* <: Element | Document | Window */](eventTarget: T, event: abort, listener: EventHandler[T, abort]): Unit = js.native
  @JSName("default")
  def default_abort[T /* <: Element | Document | Window */](eventTarget: T, event: abort, listener: EventHandler[T, abort], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_abort[T /* <: Element | Document | Window */](eventTarget: T, event: abort, listener: EventHandler[T, abort], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_abort[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: abort, listener: EventHandler[T, abort]): Unit = js.native
  @JSName("default")
  def default_abort[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: abort, listener: EventHandler[T, abort], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_abort[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: abort,
    listener: EventHandler[T, abort],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_animationcancel[T /* <: Element | Document | Window */](eventTarget: T, event: animationcancel, listener: EventHandler[T, animationcancel]): Unit = js.native
  @JSName("default")
  def default_animationcancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationcancel,
    listener: EventHandler[T, animationcancel],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_animationcancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationcancel,
    listener: EventHandler[T, animationcancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_animationcancel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: animationcancel, listener: EventHandler[T, animationcancel]): Unit = js.native
  @JSName("default")
  def default_animationcancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationcancel,
    listener: EventHandler[T, animationcancel],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_animationcancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationcancel,
    listener: EventHandler[T, animationcancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_animationend[T /* <: Element | Document | Window */](eventTarget: T, event: animationend, listener: EventHandler[T, animationend]): Unit = js.native
  @JSName("default")
  def default_animationend[T /* <: Element | Document | Window */](eventTarget: T, event: animationend, listener: EventHandler[T, animationend], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_animationend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationend,
    listener: EventHandler[T, animationend],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_animationend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: animationend, listener: EventHandler[T, animationend]): Unit = js.native
  @JSName("default")
  def default_animationend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationend,
    listener: EventHandler[T, animationend],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_animationend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationend,
    listener: EventHandler[T, animationend],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_animationiteration[T /* <: Element | Document | Window */](eventTarget: T, event: animationiteration, listener: EventHandler[T, animationiteration]): Unit = js.native
  @JSName("default")
  def default_animationiteration[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationiteration,
    listener: EventHandler[T, animationiteration],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_animationiteration[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationiteration,
    listener: EventHandler[T, animationiteration],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_animationiteration[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationiteration,
    listener: EventHandler[T, animationiteration]
  ): Unit = js.native
  @JSName("default")
  def default_animationiteration[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationiteration,
    listener: EventHandler[T, animationiteration],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_animationiteration[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationiteration,
    listener: EventHandler[T, animationiteration],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_animationstart[T /* <: Element | Document | Window */](eventTarget: T, event: animationstart, listener: EventHandler[T, animationstart]): Unit = js.native
  @JSName("default")
  def default_animationstart[T /* <: Element | Document | Window */](eventTarget: T, event: animationstart, listener: EventHandler[T, animationstart], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_animationstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationstart,
    listener: EventHandler[T, animationstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_animationstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: animationstart, listener: EventHandler[T, animationstart]): Unit = js.native
  @JSName("default")
  def default_animationstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationstart,
    listener: EventHandler[T, animationstart],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_animationstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationstart,
    listener: EventHandler[T, animationstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_auxclick[T /* <: Element | Document | Window */](eventTarget: T, event: auxclick, listener: EventHandler[T, auxclick]): Unit = js.native
  @JSName("default")
  def default_auxclick[T /* <: Element | Document | Window */](eventTarget: T, event: auxclick, listener: EventHandler[T, auxclick], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_auxclick[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: auxclick,
    listener: EventHandler[T, auxclick],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_auxclick[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: auxclick, listener: EventHandler[T, auxclick]): Unit = js.native
  @JSName("default")
  def default_auxclick[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: auxclick,
    listener: EventHandler[T, auxclick],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_auxclick[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: auxclick,
    listener: EventHandler[T, auxclick],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_blur[T /* <: Element | Document | Window */](eventTarget: T, event: blur, listener: EventHandler[T, blur]): Unit = js.native
  @JSName("default")
  def default_blur[T /* <: Element | Document | Window */](eventTarget: T, event: blur, listener: EventHandler[T, blur], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_blur[T /* <: Element | Document | Window */](eventTarget: T, event: blur, listener: EventHandler[T, blur], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_blur[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: blur, listener: EventHandler[T, blur]): Unit = js.native
  @JSName("default")
  def default_blur[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: blur, listener: EventHandler[T, blur], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_blur[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: blur,
    listener: EventHandler[T, blur],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_cancel[T /* <: Element | Document | Window */](eventTarget: T, event: cancel, listener: EventHandler[T, cancel]): Unit = js.native
  @JSName("default")
  def default_cancel[T /* <: Element | Document | Window */](eventTarget: T, event: cancel, listener: EventHandler[T, cancel], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_cancel[T /* <: Element | Document | Window */](eventTarget: T, event: cancel, listener: EventHandler[T, cancel], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_cancel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: cancel, listener: EventHandler[T, cancel]): Unit = js.native
  @JSName("default")
  def default_cancel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: cancel, listener: EventHandler[T, cancel], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_cancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: cancel,
    listener: EventHandler[T, cancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_canplay[T /* <: Element | Document | Window */](eventTarget: T, event: canplay, listener: EventHandler[T, canplay]): Unit = js.native
  @JSName("default")
  def default_canplay[T /* <: Element | Document | Window */](eventTarget: T, event: canplay, listener: EventHandler[T, canplay], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_canplay[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: canplay,
    listener: EventHandler[T, canplay],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_canplay[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: canplay, listener: EventHandler[T, canplay]): Unit = js.native
  @JSName("default")
  def default_canplay[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: canplay, listener: EventHandler[T, canplay], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_canplay[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: canplay,
    listener: EventHandler[T, canplay],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_canplaythrough[T /* <: Element | Document | Window */](eventTarget: T, event: canplaythrough, listener: EventHandler[T, canplaythrough]): Unit = js.native
  @JSName("default")
  def default_canplaythrough[T /* <: Element | Document | Window */](eventTarget: T, event: canplaythrough, listener: EventHandler[T, canplaythrough], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_canplaythrough[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: canplaythrough,
    listener: EventHandler[T, canplaythrough],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_canplaythrough[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: canplaythrough, listener: EventHandler[T, canplaythrough]): Unit = js.native
  @JSName("default")
  def default_canplaythrough[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: canplaythrough,
    listener: EventHandler[T, canplaythrough],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_canplaythrough[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: canplaythrough,
    listener: EventHandler[T, canplaythrough],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_change[T /* <: Element | Document | Window */](eventTarget: T, event: change, listener: EventHandler[T, change]): Unit = js.native
  @JSName("default")
  def default_change[T /* <: Element | Document | Window */](eventTarget: T, event: change, listener: EventHandler[T, change], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_change[T /* <: Element | Document | Window */](eventTarget: T, event: change, listener: EventHandler[T, change], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_change[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: change, listener: EventHandler[T, change]): Unit = js.native
  @JSName("default")
  def default_change[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: change, listener: EventHandler[T, change], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_change[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: change,
    listener: EventHandler[T, change],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_click[T /* <: Element | Document | Window */](eventTarget: T, event: click, listener: EventHandler[T, click]): Unit = js.native
  @JSName("default")
  def default_click[T /* <: Element | Document | Window */](eventTarget: T, event: click, listener: EventHandler[T, click], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_click[T /* <: Element | Document | Window */](eventTarget: T, event: click, listener: EventHandler[T, click], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_click[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: click, listener: EventHandler[T, click]): Unit = js.native
  @JSName("default")
  def default_click[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: click, listener: EventHandler[T, click], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_click[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: click,
    listener: EventHandler[T, click],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_close[T /* <: Element | Document | Window */](eventTarget: T, event: close, listener: EventHandler[T, close]): Unit = js.native
  @JSName("default")
  def default_close[T /* <: Element | Document | Window */](eventTarget: T, event: close, listener: EventHandler[T, close], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_close[T /* <: Element | Document | Window */](eventTarget: T, event: close, listener: EventHandler[T, close], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_close[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: close, listener: EventHandler[T, close]): Unit = js.native
  @JSName("default")
  def default_close[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: close, listener: EventHandler[T, close], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_close[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: close,
    listener: EventHandler[T, close],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_contextmenu[T /* <: Element | Document | Window */](eventTarget: T, event: contextmenu, listener: EventHandler[T, contextmenu]): Unit = js.native
  @JSName("default")
  def default_contextmenu[T /* <: Element | Document | Window */](eventTarget: T, event: contextmenu, listener: EventHandler[T, contextmenu], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_contextmenu[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: contextmenu,
    listener: EventHandler[T, contextmenu],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_contextmenu[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: contextmenu, listener: EventHandler[T, contextmenu]): Unit = js.native
  @JSName("default")
  def default_contextmenu[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: contextmenu,
    listener: EventHandler[T, contextmenu],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_contextmenu[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: contextmenu,
    listener: EventHandler[T, contextmenu],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_copy[T /* <: Element | Document | Window */](eventTarget: T, event: copy, listener: EventHandler[T, copy]): Unit = js.native
  @JSName("default")
  def default_copy[T /* <: Element | Document | Window */](eventTarget: T, event: copy, listener: EventHandler[T, copy], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_copy[T /* <: Element | Document | Window */](eventTarget: T, event: copy, listener: EventHandler[T, copy], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_copy[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: copy, listener: EventHandler[T, copy]): Unit = js.native
  @JSName("default")
  def default_copy[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: copy, listener: EventHandler[T, copy], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_copy[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: copy,
    listener: EventHandler[T, copy],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_cuechange[T /* <: Element | Document | Window */](eventTarget: T, event: cuechange, listener: EventHandler[T, cuechange]): Unit = js.native
  @JSName("default")
  def default_cuechange[T /* <: Element | Document | Window */](eventTarget: T, event: cuechange, listener: EventHandler[T, cuechange], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_cuechange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: cuechange,
    listener: EventHandler[T, cuechange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_cuechange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: cuechange, listener: EventHandler[T, cuechange]): Unit = js.native
  @JSName("default")
  def default_cuechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: cuechange,
    listener: EventHandler[T, cuechange],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_cuechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: cuechange,
    listener: EventHandler[T, cuechange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_cut[T /* <: Element | Document | Window */](eventTarget: T, event: cut, listener: EventHandler[T, cut]): Unit = js.native
  @JSName("default")
  def default_cut[T /* <: Element | Document | Window */](eventTarget: T, event: cut, listener: EventHandler[T, cut], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_cut[T /* <: Element | Document | Window */](eventTarget: T, event: cut, listener: EventHandler[T, cut], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_cut[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: cut, listener: EventHandler[T, cut]): Unit = js.native
  @JSName("default")
  def default_cut[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: cut, listener: EventHandler[T, cut], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_cut[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: cut,
    listener: EventHandler[T, cut],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_dblclick[T /* <: Element | Document | Window */](eventTarget: T, event: dblclick, listener: EventHandler[T, dblclick]): Unit = js.native
  @JSName("default")
  def default_dblclick[T /* <: Element | Document | Window */](eventTarget: T, event: dblclick, listener: EventHandler[T, dblclick], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_dblclick[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dblclick,
    listener: EventHandler[T, dblclick],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_dblclick[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dblclick, listener: EventHandler[T, dblclick]): Unit = js.native
  @JSName("default")
  def default_dblclick[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dblclick,
    listener: EventHandler[T, dblclick],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_dblclick[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dblclick,
    listener: EventHandler[T, dblclick],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_drag[T /* <: Element | Document | Window */](eventTarget: T, event: drag, listener: EventHandler[T, drag]): Unit = js.native
  @JSName("default")
  def default_drag[T /* <: Element | Document | Window */](eventTarget: T, event: drag, listener: EventHandler[T, drag], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_drag[T /* <: Element | Document | Window */](eventTarget: T, event: drag, listener: EventHandler[T, drag], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_drag[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: drag, listener: EventHandler[T, drag]): Unit = js.native
  @JSName("default")
  def default_drag[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: drag, listener: EventHandler[T, drag], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_drag[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: drag,
    listener: EventHandler[T, drag],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_dragend[T /* <: Element | Document | Window */](eventTarget: T, event: dragend, listener: EventHandler[T, dragend]): Unit = js.native
  @JSName("default")
  def default_dragend[T /* <: Element | Document | Window */](eventTarget: T, event: dragend, listener: EventHandler[T, dragend], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_dragend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dragend,
    listener: EventHandler[T, dragend],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_dragend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragend, listener: EventHandler[T, dragend]): Unit = js.native
  @JSName("default")
  def default_dragend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragend, listener: EventHandler[T, dragend], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_dragend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragend,
    listener: EventHandler[T, dragend],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_dragenter[T /* <: Element | Document | Window */](eventTarget: T, event: dragenter, listener: EventHandler[T, dragenter]): Unit = js.native
  @JSName("default")
  def default_dragenter[T /* <: Element | Document | Window */](eventTarget: T, event: dragenter, listener: EventHandler[T, dragenter], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_dragenter[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dragenter,
    listener: EventHandler[T, dragenter],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_dragenter[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragenter, listener: EventHandler[T, dragenter]): Unit = js.native
  @JSName("default")
  def default_dragenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragenter,
    listener: EventHandler[T, dragenter],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_dragenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragenter,
    listener: EventHandler[T, dragenter],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_dragexit[T /* <: Element | Document | Window */](eventTarget: T, event: dragexit, listener: EventHandler[T, dragexit]): Unit = js.native
  @JSName("default")
  def default_dragexit[T /* <: Element | Document | Window */](eventTarget: T, event: dragexit, listener: EventHandler[T, dragexit], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_dragexit[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dragexit,
    listener: EventHandler[T, dragexit],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_dragexit[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragexit, listener: EventHandler[T, dragexit]): Unit = js.native
  @JSName("default")
  def default_dragexit[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragexit,
    listener: EventHandler[T, dragexit],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_dragexit[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragexit,
    listener: EventHandler[T, dragexit],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_dragleave[T /* <: Element | Document | Window */](eventTarget: T, event: dragleave, listener: EventHandler[T, dragleave]): Unit = js.native
  @JSName("default")
  def default_dragleave[T /* <: Element | Document | Window */](eventTarget: T, event: dragleave, listener: EventHandler[T, dragleave], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_dragleave[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dragleave,
    listener: EventHandler[T, dragleave],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_dragleave[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragleave, listener: EventHandler[T, dragleave]): Unit = js.native
  @JSName("default")
  def default_dragleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragleave,
    listener: EventHandler[T, dragleave],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_dragleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragleave,
    listener: EventHandler[T, dragleave],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_dragover[T /* <: Element | Document | Window */](eventTarget: T, event: dragover, listener: EventHandler[T, dragover]): Unit = js.native
  @JSName("default")
  def default_dragover[T /* <: Element | Document | Window */](eventTarget: T, event: dragover, listener: EventHandler[T, dragover], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_dragover[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dragover,
    listener: EventHandler[T, dragover],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_dragover[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragover, listener: EventHandler[T, dragover]): Unit = js.native
  @JSName("default")
  def default_dragover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragover,
    listener: EventHandler[T, dragover],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_dragover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragover,
    listener: EventHandler[T, dragover],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_dragstart[T /* <: Element | Document | Window */](eventTarget: T, event: dragstart, listener: EventHandler[T, dragstart]): Unit = js.native
  @JSName("default")
  def default_dragstart[T /* <: Element | Document | Window */](eventTarget: T, event: dragstart, listener: EventHandler[T, dragstart], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_dragstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dragstart,
    listener: EventHandler[T, dragstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_dragstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragstart, listener: EventHandler[T, dragstart]): Unit = js.native
  @JSName("default")
  def default_dragstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragstart,
    listener: EventHandler[T, dragstart],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_dragstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragstart,
    listener: EventHandler[T, dragstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_drop[T /* <: Element | Document | Window */](eventTarget: T, event: drop, listener: EventHandler[T, drop]): Unit = js.native
  @JSName("default")
  def default_drop[T /* <: Element | Document | Window */](eventTarget: T, event: drop, listener: EventHandler[T, drop], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_drop[T /* <: Element | Document | Window */](eventTarget: T, event: drop, listener: EventHandler[T, drop], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_drop[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: drop, listener: EventHandler[T, drop]): Unit = js.native
  @JSName("default")
  def default_drop[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: drop, listener: EventHandler[T, drop], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_drop[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: drop,
    listener: EventHandler[T, drop],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_durationchange[T /* <: Element | Document | Window */](eventTarget: T, event: durationchange, listener: EventHandler[T, durationchange]): Unit = js.native
  @JSName("default")
  def default_durationchange[T /* <: Element | Document | Window */](eventTarget: T, event: durationchange, listener: EventHandler[T, durationchange], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_durationchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: durationchange,
    listener: EventHandler[T, durationchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_durationchange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: durationchange, listener: EventHandler[T, durationchange]): Unit = js.native
  @JSName("default")
  def default_durationchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: durationchange,
    listener: EventHandler[T, durationchange],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_durationchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: durationchange,
    listener: EventHandler[T, durationchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_emptied[T /* <: Element | Document | Window */](eventTarget: T, event: emptied, listener: EventHandler[T, emptied]): Unit = js.native
  @JSName("default")
  def default_emptied[T /* <: Element | Document | Window */](eventTarget: T, event: emptied, listener: EventHandler[T, emptied], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_emptied[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: emptied,
    listener: EventHandler[T, emptied],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_emptied[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: emptied, listener: EventHandler[T, emptied]): Unit = js.native
  @JSName("default")
  def default_emptied[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: emptied, listener: EventHandler[T, emptied], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_emptied[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: emptied,
    listener: EventHandler[T, emptied],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_ended[T /* <: Element | Document | Window */](eventTarget: T, event: ended, listener: EventHandler[T, ended]): Unit = js.native
  @JSName("default")
  def default_ended[T /* <: Element | Document | Window */](eventTarget: T, event: ended, listener: EventHandler[T, ended], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_ended[T /* <: Element | Document | Window */](eventTarget: T, event: ended, listener: EventHandler[T, ended], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_ended[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: ended, listener: EventHandler[T, ended]): Unit = js.native
  @JSName("default")
  def default_ended[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: ended, listener: EventHandler[T, ended], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_ended[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: ended,
    listener: EventHandler[T, ended],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_error[T /* <: Element | Document | Window */](eventTarget: T, event: error, listener: EventHandler[T, error]): Unit = js.native
  @JSName("default")
  def default_error[T /* <: Element | Document | Window */](eventTarget: T, event: error, listener: EventHandler[T, error], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_error[T /* <: Element | Document | Window */](eventTarget: T, event: error, listener: EventHandler[T, error], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_error[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: error, listener: EventHandler[T, error]): Unit = js.native
  @JSName("default")
  def default_error[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: error, listener: EventHandler[T, error], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_error[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: error,
    listener: EventHandler[T, error],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_focus[T /* <: Element | Document | Window */](eventTarget: T, event: focus, listener: EventHandler[T, focus]): Unit = js.native
  @JSName("default")
  def default_focus[T /* <: Element | Document | Window */](eventTarget: T, event: focus, listener: EventHandler[T, focus], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_focus[T /* <: Element | Document | Window */](eventTarget: T, event: focus, listener: EventHandler[T, focus], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_focus[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: focus, listener: EventHandler[T, focus]): Unit = js.native
  @JSName("default")
  def default_focus[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: focus, listener: EventHandler[T, focus], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_focus[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: focus,
    listener: EventHandler[T, focus],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_focusin[T /* <: Element | Document | Window */](eventTarget: T, event: focusin, listener: EventHandler[T, focusin]): Unit = js.native
  @JSName("default")
  def default_focusin[T /* <: Element | Document | Window */](eventTarget: T, event: focusin, listener: EventHandler[T, focusin], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_focusin[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: focusin,
    listener: EventHandler[T, focusin],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_focusin[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: focusin, listener: EventHandler[T, focusin]): Unit = js.native
  @JSName("default")
  def default_focusin[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: focusin, listener: EventHandler[T, focusin], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_focusin[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: focusin,
    listener: EventHandler[T, focusin],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_focusout[T /* <: Element | Document | Window */](eventTarget: T, event: focusout, listener: EventHandler[T, focusout]): Unit = js.native
  @JSName("default")
  def default_focusout[T /* <: Element | Document | Window */](eventTarget: T, event: focusout, listener: EventHandler[T, focusout], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_focusout[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: focusout,
    listener: EventHandler[T, focusout],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_focusout[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: focusout, listener: EventHandler[T, focusout]): Unit = js.native
  @JSName("default")
  def default_focusout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: focusout,
    listener: EventHandler[T, focusout],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_focusout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: focusout,
    listener: EventHandler[T, focusout],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_fullscreenchange[T /* <: Element | Document | Window */](eventTarget: T, event: fullscreenchange, listener: EventHandler[T, fullscreenchange]): Unit = js.native
  @JSName("default")
  def default_fullscreenchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: fullscreenchange,
    listener: EventHandler[T, fullscreenchange],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_fullscreenchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: fullscreenchange,
    listener: EventHandler[T, fullscreenchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_fullscreenchange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: fullscreenchange, listener: EventHandler[T, fullscreenchange]): Unit = js.native
  @JSName("default")
  def default_fullscreenchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: fullscreenchange,
    listener: EventHandler[T, fullscreenchange],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_fullscreenchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: fullscreenchange,
    listener: EventHandler[T, fullscreenchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_fullscreenerror[T /* <: Element | Document | Window */](eventTarget: T, event: fullscreenerror, listener: EventHandler[T, fullscreenerror]): Unit = js.native
  @JSName("default")
  def default_fullscreenerror[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: fullscreenerror,
    listener: EventHandler[T, fullscreenerror],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_fullscreenerror[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: fullscreenerror,
    listener: EventHandler[T, fullscreenerror],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_fullscreenerror[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: fullscreenerror, listener: EventHandler[T, fullscreenerror]): Unit = js.native
  @JSName("default")
  def default_fullscreenerror[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: fullscreenerror,
    listener: EventHandler[T, fullscreenerror],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_fullscreenerror[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: fullscreenerror,
    listener: EventHandler[T, fullscreenerror],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_gotpointercapture[T /* <: Element | Document | Window */](eventTarget: T, event: gotpointercapture, listener: EventHandler[T, gotpointercapture]): Unit = js.native
  @JSName("default")
  def default_gotpointercapture[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: gotpointercapture,
    listener: EventHandler[T, gotpointercapture],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_gotpointercapture[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: gotpointercapture,
    listener: EventHandler[T, gotpointercapture],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_gotpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: gotpointercapture,
    listener: EventHandler[T, gotpointercapture]
  ): Unit = js.native
  @JSName("default")
  def default_gotpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: gotpointercapture,
    listener: EventHandler[T, gotpointercapture],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_gotpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: gotpointercapture,
    listener: EventHandler[T, gotpointercapture],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_input[T /* <: Element | Document | Window */](eventTarget: T, event: input, listener: EventHandler[T, input]): Unit = js.native
  @JSName("default")
  def default_input[T /* <: Element | Document | Window */](eventTarget: T, event: input, listener: EventHandler[T, input], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_input[T /* <: Element | Document | Window */](eventTarget: T, event: input, listener: EventHandler[T, input], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_input[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: input, listener: EventHandler[T, input]): Unit = js.native
  @JSName("default")
  def default_input[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: input, listener: EventHandler[T, input], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_input[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: input,
    listener: EventHandler[T, input],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_invalid[T /* <: Element | Document | Window */](eventTarget: T, event: invalid, listener: EventHandler[T, invalid]): Unit = js.native
  @JSName("default")
  def default_invalid[T /* <: Element | Document | Window */](eventTarget: T, event: invalid, listener: EventHandler[T, invalid], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_invalid[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: invalid,
    listener: EventHandler[T, invalid],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_invalid[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: invalid, listener: EventHandler[T, invalid]): Unit = js.native
  @JSName("default")
  def default_invalid[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: invalid, listener: EventHandler[T, invalid], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_invalid[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: invalid,
    listener: EventHandler[T, invalid],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_keydown[T /* <: Element | Document | Window */](eventTarget: T, event: keydown, listener: EventHandler[T, keydown]): Unit = js.native
  @JSName("default")
  def default_keydown[T /* <: Element | Document | Window */](eventTarget: T, event: keydown, listener: EventHandler[T, keydown], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_keydown[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: keydown,
    listener: EventHandler[T, keydown],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_keydown[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: keydown, listener: EventHandler[T, keydown]): Unit = js.native
  @JSName("default")
  def default_keydown[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: keydown, listener: EventHandler[T, keydown], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_keydown[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: keydown,
    listener: EventHandler[T, keydown],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_keypress[T /* <: Element | Document | Window */](eventTarget: T, event: keypress, listener: EventHandler[T, keypress]): Unit = js.native
  @JSName("default")
  def default_keypress[T /* <: Element | Document | Window */](eventTarget: T, event: keypress, listener: EventHandler[T, keypress], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_keypress[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: keypress,
    listener: EventHandler[T, keypress],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_keypress[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: keypress, listener: EventHandler[T, keypress]): Unit = js.native
  @JSName("default")
  def default_keypress[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: keypress,
    listener: EventHandler[T, keypress],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_keypress[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: keypress,
    listener: EventHandler[T, keypress],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_keyup[T /* <: Element | Document | Window */](eventTarget: T, event: keyup, listener: EventHandler[T, keyup]): Unit = js.native
  @JSName("default")
  def default_keyup[T /* <: Element | Document | Window */](eventTarget: T, event: keyup, listener: EventHandler[T, keyup], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_keyup[T /* <: Element | Document | Window */](eventTarget: T, event: keyup, listener: EventHandler[T, keyup], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_keyup[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: keyup, listener: EventHandler[T, keyup]): Unit = js.native
  @JSName("default")
  def default_keyup[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: keyup, listener: EventHandler[T, keyup], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_keyup[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: keyup,
    listener: EventHandler[T, keyup],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_load[T /* <: Element | Document | Window */](eventTarget: T, event: load, listener: EventHandler[T, load]): Unit = js.native
  @JSName("default")
  def default_load[T /* <: Element | Document | Window */](eventTarget: T, event: load, listener: EventHandler[T, load], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_load[T /* <: Element | Document | Window */](eventTarget: T, event: load, listener: EventHandler[T, load], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_load[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: load, listener: EventHandler[T, load]): Unit = js.native
  @JSName("default")
  def default_load[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: load, listener: EventHandler[T, load], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_load[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: load,
    listener: EventHandler[T, load],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_loadeddata[T /* <: Element | Document | Window */](eventTarget: T, event: loadeddata, listener: EventHandler[T, loadeddata]): Unit = js.native
  @JSName("default")
  def default_loadeddata[T /* <: Element | Document | Window */](eventTarget: T, event: loadeddata, listener: EventHandler[T, loadeddata], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_loadeddata[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: loadeddata,
    listener: EventHandler[T, loadeddata],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_loadeddata[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: loadeddata, listener: EventHandler[T, loadeddata]): Unit = js.native
  @JSName("default")
  def default_loadeddata[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadeddata,
    listener: EventHandler[T, loadeddata],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_loadeddata[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadeddata,
    listener: EventHandler[T, loadeddata],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_loadedmetadata[T /* <: Element | Document | Window */](eventTarget: T, event: loadedmetadata, listener: EventHandler[T, loadedmetadata]): Unit = js.native
  @JSName("default")
  def default_loadedmetadata[T /* <: Element | Document | Window */](eventTarget: T, event: loadedmetadata, listener: EventHandler[T, loadedmetadata], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_loadedmetadata[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: loadedmetadata,
    listener: EventHandler[T, loadedmetadata],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_loadedmetadata[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: loadedmetadata, listener: EventHandler[T, loadedmetadata]): Unit = js.native
  @JSName("default")
  def default_loadedmetadata[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadedmetadata,
    listener: EventHandler[T, loadedmetadata],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_loadedmetadata[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadedmetadata,
    listener: EventHandler[T, loadedmetadata],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_loadstart[T /* <: Element | Document | Window */](eventTarget: T, event: loadstart, listener: EventHandler[T, loadstart]): Unit = js.native
  @JSName("default")
  def default_loadstart[T /* <: Element | Document | Window */](eventTarget: T, event: loadstart, listener: EventHandler[T, loadstart], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_loadstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: loadstart,
    listener: EventHandler[T, loadstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_loadstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: loadstart, listener: EventHandler[T, loadstart]): Unit = js.native
  @JSName("default")
  def default_loadstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadstart,
    listener: EventHandler[T, loadstart],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_loadstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadstart,
    listener: EventHandler[T, loadstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_lostpointercapture[T /* <: Element | Document | Window */](eventTarget: T, event: lostpointercapture, listener: EventHandler[T, lostpointercapture]): Unit = js.native
  @JSName("default")
  def default_lostpointercapture[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: lostpointercapture,
    listener: EventHandler[T, lostpointercapture],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_lostpointercapture[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: lostpointercapture,
    listener: EventHandler[T, lostpointercapture],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_lostpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: lostpointercapture,
    listener: EventHandler[T, lostpointercapture]
  ): Unit = js.native
  @JSName("default")
  def default_lostpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: lostpointercapture,
    listener: EventHandler[T, lostpointercapture],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_lostpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: lostpointercapture,
    listener: EventHandler[T, lostpointercapture],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_mousedown[T /* <: Element | Document | Window */](eventTarget: T, event: mousedown, listener: EventHandler[T, mousedown]): Unit = js.native
  @JSName("default")
  def default_mousedown[T /* <: Element | Document | Window */](eventTarget: T, event: mousedown, listener: EventHandler[T, mousedown], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_mousedown[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mousedown,
    listener: EventHandler[T, mousedown],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_mousedown[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mousedown, listener: EventHandler[T, mousedown]): Unit = js.native
  @JSName("default")
  def default_mousedown[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mousedown,
    listener: EventHandler[T, mousedown],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_mousedown[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mousedown,
    listener: EventHandler[T, mousedown],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_mouseenter[T /* <: Element | Document | Window */](eventTarget: T, event: mouseenter, listener: EventHandler[T, mouseenter]): Unit = js.native
  @JSName("default")
  def default_mouseenter[T /* <: Element | Document | Window */](eventTarget: T, event: mouseenter, listener: EventHandler[T, mouseenter], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_mouseenter[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mouseenter,
    listener: EventHandler[T, mouseenter],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_mouseenter[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseenter, listener: EventHandler[T, mouseenter]): Unit = js.native
  @JSName("default")
  def default_mouseenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseenter,
    listener: EventHandler[T, mouseenter],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_mouseenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseenter,
    listener: EventHandler[T, mouseenter],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_mouseleave[T /* <: Element | Document | Window */](eventTarget: T, event: mouseleave, listener: EventHandler[T, mouseleave]): Unit = js.native
  @JSName("default")
  def default_mouseleave[T /* <: Element | Document | Window */](eventTarget: T, event: mouseleave, listener: EventHandler[T, mouseleave], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_mouseleave[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mouseleave,
    listener: EventHandler[T, mouseleave],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_mouseleave[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseleave, listener: EventHandler[T, mouseleave]): Unit = js.native
  @JSName("default")
  def default_mouseleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseleave,
    listener: EventHandler[T, mouseleave],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_mouseleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseleave,
    listener: EventHandler[T, mouseleave],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_mousemove[T /* <: Element | Document | Window */](eventTarget: T, event: mousemove, listener: EventHandler[T, mousemove]): Unit = js.native
  @JSName("default")
  def default_mousemove[T /* <: Element | Document | Window */](eventTarget: T, event: mousemove, listener: EventHandler[T, mousemove], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_mousemove[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mousemove,
    listener: EventHandler[T, mousemove],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_mousemove[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mousemove, listener: EventHandler[T, mousemove]): Unit = js.native
  @JSName("default")
  def default_mousemove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mousemove,
    listener: EventHandler[T, mousemove],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_mousemove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mousemove,
    listener: EventHandler[T, mousemove],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_mouseout[T /* <: Element | Document | Window */](eventTarget: T, event: mouseout, listener: EventHandler[T, mouseout]): Unit = js.native
  @JSName("default")
  def default_mouseout[T /* <: Element | Document | Window */](eventTarget: T, event: mouseout, listener: EventHandler[T, mouseout], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_mouseout[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mouseout,
    listener: EventHandler[T, mouseout],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_mouseout[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseout, listener: EventHandler[T, mouseout]): Unit = js.native
  @JSName("default")
  def default_mouseout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseout,
    listener: EventHandler[T, mouseout],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_mouseout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseout,
    listener: EventHandler[T, mouseout],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_mouseover[T /* <: Element | Document | Window */](eventTarget: T, event: mouseover, listener: EventHandler[T, mouseover]): Unit = js.native
  @JSName("default")
  def default_mouseover[T /* <: Element | Document | Window */](eventTarget: T, event: mouseover, listener: EventHandler[T, mouseover], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_mouseover[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mouseover,
    listener: EventHandler[T, mouseover],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_mouseover[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseover, listener: EventHandler[T, mouseover]): Unit = js.native
  @JSName("default")
  def default_mouseover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseover,
    listener: EventHandler[T, mouseover],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_mouseover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseover,
    listener: EventHandler[T, mouseover],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_mouseup[T /* <: Element | Document | Window */](eventTarget: T, event: mouseup, listener: EventHandler[T, mouseup]): Unit = js.native
  @JSName("default")
  def default_mouseup[T /* <: Element | Document | Window */](eventTarget: T, event: mouseup, listener: EventHandler[T, mouseup], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_mouseup[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mouseup,
    listener: EventHandler[T, mouseup],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_mouseup[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseup, listener: EventHandler[T, mouseup]): Unit = js.native
  @JSName("default")
  def default_mouseup[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseup, listener: EventHandler[T, mouseup], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_mouseup[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseup,
    listener: EventHandler[T, mouseup],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_paste[T /* <: Element | Document | Window */](eventTarget: T, event: paste, listener: EventHandler[T, paste]): Unit = js.native
  @JSName("default")
  def default_paste[T /* <: Element | Document | Window */](eventTarget: T, event: paste, listener: EventHandler[T, paste], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_paste[T /* <: Element | Document | Window */](eventTarget: T, event: paste, listener: EventHandler[T, paste], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_paste[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: paste, listener: EventHandler[T, paste]): Unit = js.native
  @JSName("default")
  def default_paste[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: paste, listener: EventHandler[T, paste], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_paste[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: paste,
    listener: EventHandler[T, paste],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_pause[T /* <: Element | Document | Window */](eventTarget: T, event: pause, listener: EventHandler[T, pause]): Unit = js.native
  @JSName("default")
  def default_pause[T /* <: Element | Document | Window */](eventTarget: T, event: pause, listener: EventHandler[T, pause], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_pause[T /* <: Element | Document | Window */](eventTarget: T, event: pause, listener: EventHandler[T, pause], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_pause[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pause, listener: EventHandler[T, pause]): Unit = js.native
  @JSName("default")
  def default_pause[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pause, listener: EventHandler[T, pause], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_pause[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pause,
    listener: EventHandler[T, pause],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_play[T /* <: Element | Document | Window */](eventTarget: T, event: play, listener: EventHandler[T, play]): Unit = js.native
  @JSName("default")
  def default_play[T /* <: Element | Document | Window */](eventTarget: T, event: play, listener: EventHandler[T, play], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_play[T /* <: Element | Document | Window */](eventTarget: T, event: play, listener: EventHandler[T, play], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_play[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: play, listener: EventHandler[T, play]): Unit = js.native
  @JSName("default")
  def default_play[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: play, listener: EventHandler[T, play], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_play[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: play,
    listener: EventHandler[T, play],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_playing[T /* <: Element | Document | Window */](eventTarget: T, event: playing, listener: EventHandler[T, playing]): Unit = js.native
  @JSName("default")
  def default_playing[T /* <: Element | Document | Window */](eventTarget: T, event: playing, listener: EventHandler[T, playing], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_playing[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: playing,
    listener: EventHandler[T, playing],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_playing[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: playing, listener: EventHandler[T, playing]): Unit = js.native
  @JSName("default")
  def default_playing[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: playing, listener: EventHandler[T, playing], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_playing[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: playing,
    listener: EventHandler[T, playing],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_pointercancel[T /* <: Element | Document | Window */](eventTarget: T, event: pointercancel, listener: EventHandler[T, pointercancel]): Unit = js.native
  @JSName("default")
  def default_pointercancel[T /* <: Element | Document | Window */](eventTarget: T, event: pointercancel, listener: EventHandler[T, pointercancel], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_pointercancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointercancel,
    listener: EventHandler[T, pointercancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_pointercancel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointercancel, listener: EventHandler[T, pointercancel]): Unit = js.native
  @JSName("default")
  def default_pointercancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointercancel,
    listener: EventHandler[T, pointercancel],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_pointercancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointercancel,
    listener: EventHandler[T, pointercancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_pointerdown[T /* <: Element | Document | Window */](eventTarget: T, event: pointerdown, listener: EventHandler[T, pointerdown]): Unit = js.native
  @JSName("default")
  def default_pointerdown[T /* <: Element | Document | Window */](eventTarget: T, event: pointerdown, listener: EventHandler[T, pointerdown], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_pointerdown[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerdown,
    listener: EventHandler[T, pointerdown],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_pointerdown[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerdown, listener: EventHandler[T, pointerdown]): Unit = js.native
  @JSName("default")
  def default_pointerdown[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerdown,
    listener: EventHandler[T, pointerdown],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_pointerdown[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerdown,
    listener: EventHandler[T, pointerdown],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_pointerenter[T /* <: Element | Document | Window */](eventTarget: T, event: pointerenter, listener: EventHandler[T, pointerenter]): Unit = js.native
  @JSName("default")
  def default_pointerenter[T /* <: Element | Document | Window */](eventTarget: T, event: pointerenter, listener: EventHandler[T, pointerenter], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_pointerenter[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerenter,
    listener: EventHandler[T, pointerenter],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_pointerenter[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerenter, listener: EventHandler[T, pointerenter]): Unit = js.native
  @JSName("default")
  def default_pointerenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerenter,
    listener: EventHandler[T, pointerenter],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_pointerenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerenter,
    listener: EventHandler[T, pointerenter],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_pointerleave[T /* <: Element | Document | Window */](eventTarget: T, event: pointerleave, listener: EventHandler[T, pointerleave]): Unit = js.native
  @JSName("default")
  def default_pointerleave[T /* <: Element | Document | Window */](eventTarget: T, event: pointerleave, listener: EventHandler[T, pointerleave], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_pointerleave[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerleave,
    listener: EventHandler[T, pointerleave],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_pointerleave[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerleave, listener: EventHandler[T, pointerleave]): Unit = js.native
  @JSName("default")
  def default_pointerleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerleave,
    listener: EventHandler[T, pointerleave],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_pointerleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerleave,
    listener: EventHandler[T, pointerleave],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_pointerlockchange[T /* <: Element | Document | Window */](eventTarget: T, event: pointerlockchange, listener: EventHandler[T, pointerlockchange]): Unit = js.native
  @JSName("default")
  def default_pointerlockchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerlockchange,
    listener: EventHandler[T, pointerlockchange],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_pointerlockchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerlockchange,
    listener: EventHandler[T, pointerlockchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_pointerlockchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerlockchange,
    listener: EventHandler[T, pointerlockchange]
  ): Unit = js.native
  @JSName("default")
  def default_pointerlockchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerlockchange,
    listener: EventHandler[T, pointerlockchange],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_pointerlockchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerlockchange,
    listener: EventHandler[T, pointerlockchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_pointerlockerror[T /* <: Element | Document | Window */](eventTarget: T, event: pointerlockerror, listener: EventHandler[T, pointerlockerror]): Unit = js.native
  @JSName("default")
  def default_pointerlockerror[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerlockerror,
    listener: EventHandler[T, pointerlockerror],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_pointerlockerror[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerlockerror,
    listener: EventHandler[T, pointerlockerror],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_pointerlockerror[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerlockerror, listener: EventHandler[T, pointerlockerror]): Unit = js.native
  @JSName("default")
  def default_pointerlockerror[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerlockerror,
    listener: EventHandler[T, pointerlockerror],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_pointerlockerror[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerlockerror,
    listener: EventHandler[T, pointerlockerror],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_pointermove[T /* <: Element | Document | Window */](eventTarget: T, event: pointermove, listener: EventHandler[T, pointermove]): Unit = js.native
  @JSName("default")
  def default_pointermove[T /* <: Element | Document | Window */](eventTarget: T, event: pointermove, listener: EventHandler[T, pointermove], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_pointermove[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointermove,
    listener: EventHandler[T, pointermove],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_pointermove[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointermove, listener: EventHandler[T, pointermove]): Unit = js.native
  @JSName("default")
  def default_pointermove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointermove,
    listener: EventHandler[T, pointermove],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_pointermove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointermove,
    listener: EventHandler[T, pointermove],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_pointerout[T /* <: Element | Document | Window */](eventTarget: T, event: pointerout, listener: EventHandler[T, pointerout]): Unit = js.native
  @JSName("default")
  def default_pointerout[T /* <: Element | Document | Window */](eventTarget: T, event: pointerout, listener: EventHandler[T, pointerout], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_pointerout[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerout,
    listener: EventHandler[T, pointerout],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_pointerout[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerout, listener: EventHandler[T, pointerout]): Unit = js.native
  @JSName("default")
  def default_pointerout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerout,
    listener: EventHandler[T, pointerout],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_pointerout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerout,
    listener: EventHandler[T, pointerout],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_pointerover[T /* <: Element | Document | Window */](eventTarget: T, event: pointerover, listener: EventHandler[T, pointerover]): Unit = js.native
  @JSName("default")
  def default_pointerover[T /* <: Element | Document | Window */](eventTarget: T, event: pointerover, listener: EventHandler[T, pointerover], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_pointerover[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerover,
    listener: EventHandler[T, pointerover],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_pointerover[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerover, listener: EventHandler[T, pointerover]): Unit = js.native
  @JSName("default")
  def default_pointerover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerover,
    listener: EventHandler[T, pointerover],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_pointerover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerover,
    listener: EventHandler[T, pointerover],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_pointerup[T /* <: Element | Document | Window */](eventTarget: T, event: pointerup, listener: EventHandler[T, pointerup]): Unit = js.native
  @JSName("default")
  def default_pointerup[T /* <: Element | Document | Window */](eventTarget: T, event: pointerup, listener: EventHandler[T, pointerup], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_pointerup[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerup,
    listener: EventHandler[T, pointerup],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_pointerup[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerup, listener: EventHandler[T, pointerup]): Unit = js.native
  @JSName("default")
  def default_pointerup[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerup,
    listener: EventHandler[T, pointerup],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_pointerup[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerup,
    listener: EventHandler[T, pointerup],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_progress[T /* <: Element | Document | Window */](eventTarget: T, event: progress, listener: EventHandler[T, progress]): Unit = js.native
  @JSName("default")
  def default_progress[T /* <: Element | Document | Window */](eventTarget: T, event: progress, listener: EventHandler[T, progress], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_progress[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: progress,
    listener: EventHandler[T, progress],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_progress[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: progress, listener: EventHandler[T, progress]): Unit = js.native
  @JSName("default")
  def default_progress[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: progress,
    listener: EventHandler[T, progress],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_progress[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: progress,
    listener: EventHandler[T, progress],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_ratechange[T /* <: Element | Document | Window */](eventTarget: T, event: ratechange, listener: EventHandler[T, ratechange]): Unit = js.native
  @JSName("default")
  def default_ratechange[T /* <: Element | Document | Window */](eventTarget: T, event: ratechange, listener: EventHandler[T, ratechange], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_ratechange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: ratechange,
    listener: EventHandler[T, ratechange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_ratechange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: ratechange, listener: EventHandler[T, ratechange]): Unit = js.native
  @JSName("default")
  def default_ratechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: ratechange,
    listener: EventHandler[T, ratechange],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_ratechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: ratechange,
    listener: EventHandler[T, ratechange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_readystatechange[T /* <: Element | Document | Window */](eventTarget: T, event: readystatechange, listener: EventHandler[T, readystatechange]): Unit = js.native
  @JSName("default")
  def default_readystatechange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: readystatechange,
    listener: EventHandler[T, readystatechange],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_readystatechange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: readystatechange,
    listener: EventHandler[T, readystatechange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_readystatechange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: readystatechange, listener: EventHandler[T, readystatechange]): Unit = js.native
  @JSName("default")
  def default_readystatechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: readystatechange,
    listener: EventHandler[T, readystatechange],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_readystatechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: readystatechange,
    listener: EventHandler[T, readystatechange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_reset[T /* <: Element | Document | Window */](eventTarget: T, event: reset, listener: EventHandler[T, reset]): Unit = js.native
  @JSName("default")
  def default_reset[T /* <: Element | Document | Window */](eventTarget: T, event: reset, listener: EventHandler[T, reset], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_reset[T /* <: Element | Document | Window */](eventTarget: T, event: reset, listener: EventHandler[T, reset], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_reset[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: reset, listener: EventHandler[T, reset]): Unit = js.native
  @JSName("default")
  def default_reset[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: reset, listener: EventHandler[T, reset], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_reset[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: reset,
    listener: EventHandler[T, reset],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_resize[T /* <: Element | Document | Window */](eventTarget: T, event: resize, listener: EventHandler[T, resize]): Unit = js.native
  @JSName("default")
  def default_resize[T /* <: Element | Document | Window */](eventTarget: T, event: resize, listener: EventHandler[T, resize], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_resize[T /* <: Element | Document | Window */](eventTarget: T, event: resize, listener: EventHandler[T, resize], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_resize[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: resize, listener: EventHandler[T, resize]): Unit = js.native
  @JSName("default")
  def default_resize[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: resize, listener: EventHandler[T, resize], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_resize[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: resize,
    listener: EventHandler[T, resize],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_scroll[T /* <: Element | Document | Window */](eventTarget: T, event: scroll, listener: EventHandler[T, scroll]): Unit = js.native
  @JSName("default")
  def default_scroll[T /* <: Element | Document | Window */](eventTarget: T, event: scroll, listener: EventHandler[T, scroll], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_scroll[T /* <: Element | Document | Window */](eventTarget: T, event: scroll, listener: EventHandler[T, scroll], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_scroll[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: scroll, listener: EventHandler[T, scroll]): Unit = js.native
  @JSName("default")
  def default_scroll[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: scroll, listener: EventHandler[T, scroll], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_scroll[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: scroll,
    listener: EventHandler[T, scroll],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_securitypolicyviolation[T /* <: Element | Document | Window */](eventTarget: T, event: securitypolicyviolation, listener: EventHandler[T, securitypolicyviolation]): Unit = js.native
  @JSName("default")
  def default_securitypolicyviolation[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: securitypolicyviolation,
    listener: EventHandler[T, securitypolicyviolation],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_securitypolicyviolation[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: securitypolicyviolation,
    listener: EventHandler[T, securitypolicyviolation],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_securitypolicyviolation[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: securitypolicyviolation,
    listener: EventHandler[T, securitypolicyviolation]
  ): Unit = js.native
  @JSName("default")
  def default_securitypolicyviolation[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: securitypolicyviolation,
    listener: EventHandler[T, securitypolicyviolation],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_securitypolicyviolation[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: securitypolicyviolation,
    listener: EventHandler[T, securitypolicyviolation],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_seeked[T /* <: Element | Document | Window */](eventTarget: T, event: seeked, listener: EventHandler[T, seeked]): Unit = js.native
  @JSName("default")
  def default_seeked[T /* <: Element | Document | Window */](eventTarget: T, event: seeked, listener: EventHandler[T, seeked], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_seeked[T /* <: Element | Document | Window */](eventTarget: T, event: seeked, listener: EventHandler[T, seeked], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_seeked[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: seeked, listener: EventHandler[T, seeked]): Unit = js.native
  @JSName("default")
  def default_seeked[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: seeked, listener: EventHandler[T, seeked], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_seeked[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: seeked,
    listener: EventHandler[T, seeked],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_seeking[T /* <: Element | Document | Window */](eventTarget: T, event: seeking, listener: EventHandler[T, seeking]): Unit = js.native
  @JSName("default")
  def default_seeking[T /* <: Element | Document | Window */](eventTarget: T, event: seeking, listener: EventHandler[T, seeking], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_seeking[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: seeking,
    listener: EventHandler[T, seeking],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_seeking[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: seeking, listener: EventHandler[T, seeking]): Unit = js.native
  @JSName("default")
  def default_seeking[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: seeking, listener: EventHandler[T, seeking], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_seeking[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: seeking,
    listener: EventHandler[T, seeking],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_select[T /* <: Element | Document | Window */](eventTarget: T, event: select, listener: EventHandler[T, select]): Unit = js.native
  @JSName("default")
  def default_select[T /* <: Element | Document | Window */](eventTarget: T, event: select, listener: EventHandler[T, select], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_select[T /* <: Element | Document | Window */](eventTarget: T, event: select, listener: EventHandler[T, select], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_select[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: select, listener: EventHandler[T, select]): Unit = js.native
  @JSName("default")
  def default_select[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: select, listener: EventHandler[T, select], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_select[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: select,
    listener: EventHandler[T, select],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_selectionchange[T /* <: Element | Document | Window */](eventTarget: T, event: selectionchange, listener: EventHandler[T, selectionchange]): Unit = js.native
  @JSName("default")
  def default_selectionchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: selectionchange,
    listener: EventHandler[T, selectionchange],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_selectionchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: selectionchange,
    listener: EventHandler[T, selectionchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_selectionchange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: selectionchange, listener: EventHandler[T, selectionchange]): Unit = js.native
  @JSName("default")
  def default_selectionchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: selectionchange,
    listener: EventHandler[T, selectionchange],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_selectionchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: selectionchange,
    listener: EventHandler[T, selectionchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_selectstart[T /* <: Element | Document | Window */](eventTarget: T, event: selectstart, listener: EventHandler[T, selectstart]): Unit = js.native
  @JSName("default")
  def default_selectstart[T /* <: Element | Document | Window */](eventTarget: T, event: selectstart, listener: EventHandler[T, selectstart], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_selectstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: selectstart,
    listener: EventHandler[T, selectstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_selectstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: selectstart, listener: EventHandler[T, selectstart]): Unit = js.native
  @JSName("default")
  def default_selectstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: selectstart,
    listener: EventHandler[T, selectstart],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_selectstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: selectstart,
    listener: EventHandler[T, selectstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_stalled[T /* <: Element | Document | Window */](eventTarget: T, event: stalled, listener: EventHandler[T, stalled]): Unit = js.native
  @JSName("default")
  def default_stalled[T /* <: Element | Document | Window */](eventTarget: T, event: stalled, listener: EventHandler[T, stalled], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_stalled[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: stalled,
    listener: EventHandler[T, stalled],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_stalled[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: stalled, listener: EventHandler[T, stalled]): Unit = js.native
  @JSName("default")
  def default_stalled[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: stalled, listener: EventHandler[T, stalled], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_stalled[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: stalled,
    listener: EventHandler[T, stalled],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_submit[T /* <: Element | Document | Window */](eventTarget: T, event: submit, listener: EventHandler[T, submit]): Unit = js.native
  @JSName("default")
  def default_submit[T /* <: Element | Document | Window */](eventTarget: T, event: submit, listener: EventHandler[T, submit], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_submit[T /* <: Element | Document | Window */](eventTarget: T, event: submit, listener: EventHandler[T, submit], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_submit[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: submit, listener: EventHandler[T, submit]): Unit = js.native
  @JSName("default")
  def default_submit[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: submit, listener: EventHandler[T, submit], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_submit[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: submit,
    listener: EventHandler[T, submit],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_suspend[T /* <: Element | Document | Window */](eventTarget: T, event: suspend, listener: EventHandler[T, suspend]): Unit = js.native
  @JSName("default")
  def default_suspend[T /* <: Element | Document | Window */](eventTarget: T, event: suspend, listener: EventHandler[T, suspend], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_suspend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: suspend,
    listener: EventHandler[T, suspend],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_suspend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: suspend, listener: EventHandler[T, suspend]): Unit = js.native
  @JSName("default")
  def default_suspend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: suspend, listener: EventHandler[T, suspend], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_suspend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: suspend,
    listener: EventHandler[T, suspend],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_timeupdate[T /* <: Element | Document | Window */](eventTarget: T, event: timeupdate, listener: EventHandler[T, timeupdate]): Unit = js.native
  @JSName("default")
  def default_timeupdate[T /* <: Element | Document | Window */](eventTarget: T, event: timeupdate, listener: EventHandler[T, timeupdate], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_timeupdate[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: timeupdate,
    listener: EventHandler[T, timeupdate],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_timeupdate[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: timeupdate, listener: EventHandler[T, timeupdate]): Unit = js.native
  @JSName("default")
  def default_timeupdate[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: timeupdate,
    listener: EventHandler[T, timeupdate],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_timeupdate[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: timeupdate,
    listener: EventHandler[T, timeupdate],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_toggle[T /* <: Element | Document | Window */](eventTarget: T, event: toggle, listener: EventHandler[T, toggle]): Unit = js.native
  @JSName("default")
  def default_toggle[T /* <: Element | Document | Window */](eventTarget: T, event: toggle, listener: EventHandler[T, toggle], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_toggle[T /* <: Element | Document | Window */](eventTarget: T, event: toggle, listener: EventHandler[T, toggle], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_toggle[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: toggle, listener: EventHandler[T, toggle]): Unit = js.native
  @JSName("default")
  def default_toggle[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: toggle, listener: EventHandler[T, toggle], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_toggle[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: toggle,
    listener: EventHandler[T, toggle],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_touchcancel[T /* <: Element | Document | Window */](eventTarget: T, event: touchcancel, listener: EventHandler[T, touchcancel]): Unit = js.native
  @JSName("default")
  def default_touchcancel[T /* <: Element | Document | Window */](eventTarget: T, event: touchcancel, listener: EventHandler[T, touchcancel], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_touchcancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: touchcancel,
    listener: EventHandler[T, touchcancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_touchcancel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: touchcancel, listener: EventHandler[T, touchcancel]): Unit = js.native
  @JSName("default")
  def default_touchcancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchcancel,
    listener: EventHandler[T, touchcancel],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_touchcancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchcancel,
    listener: EventHandler[T, touchcancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_touchend[T /* <: Element | Document | Window */](eventTarget: T, event: touchend, listener: EventHandler[T, touchend]): Unit = js.native
  @JSName("default")
  def default_touchend[T /* <: Element | Document | Window */](eventTarget: T, event: touchend, listener: EventHandler[T, touchend], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_touchend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: touchend,
    listener: EventHandler[T, touchend],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_touchend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: touchend, listener: EventHandler[T, touchend]): Unit = js.native
  @JSName("default")
  def default_touchend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchend,
    listener: EventHandler[T, touchend],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_touchend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchend,
    listener: EventHandler[T, touchend],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_touchmove[T /* <: Element | Document | Window */](eventTarget: T, event: touchmove, listener: EventHandler[T, touchmove]): Unit = js.native
  @JSName("default")
  def default_touchmove[T /* <: Element | Document | Window */](eventTarget: T, event: touchmove, listener: EventHandler[T, touchmove], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_touchmove[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: touchmove,
    listener: EventHandler[T, touchmove],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_touchmove[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: touchmove, listener: EventHandler[T, touchmove]): Unit = js.native
  @JSName("default")
  def default_touchmove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchmove,
    listener: EventHandler[T, touchmove],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_touchmove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchmove,
    listener: EventHandler[T, touchmove],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_touchstart[T /* <: Element | Document | Window */](eventTarget: T, event: touchstart, listener: EventHandler[T, touchstart]): Unit = js.native
  @JSName("default")
  def default_touchstart[T /* <: Element | Document | Window */](eventTarget: T, event: touchstart, listener: EventHandler[T, touchstart], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_touchstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: touchstart,
    listener: EventHandler[T, touchstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_touchstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: touchstart, listener: EventHandler[T, touchstart]): Unit = js.native
  @JSName("default")
  def default_touchstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchstart,
    listener: EventHandler[T, touchstart],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_touchstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchstart,
    listener: EventHandler[T, touchstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_transitioncancel[T /* <: Element | Document | Window */](eventTarget: T, event: transitioncancel, listener: EventHandler[T, transitioncancel]): Unit = js.native
  @JSName("default")
  def default_transitioncancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitioncancel,
    listener: EventHandler[T, transitioncancel],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_transitioncancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitioncancel,
    listener: EventHandler[T, transitioncancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_transitioncancel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: transitioncancel, listener: EventHandler[T, transitioncancel]): Unit = js.native
  @JSName("default")
  def default_transitioncancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitioncancel,
    listener: EventHandler[T, transitioncancel],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_transitioncancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitioncancel,
    listener: EventHandler[T, transitioncancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_transitionend[T /* <: Element | Document | Window */](eventTarget: T, event: transitionend, listener: EventHandler[T, transitionend]): Unit = js.native
  @JSName("default")
  def default_transitionend[T /* <: Element | Document | Window */](eventTarget: T, event: transitionend, listener: EventHandler[T, transitionend], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_transitionend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitionend,
    listener: EventHandler[T, transitionend],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_transitionend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: transitionend, listener: EventHandler[T, transitionend]): Unit = js.native
  @JSName("default")
  def default_transitionend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionend,
    listener: EventHandler[T, transitionend],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_transitionend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionend,
    listener: EventHandler[T, transitionend],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_transitionrun[T /* <: Element | Document | Window */](eventTarget: T, event: transitionrun, listener: EventHandler[T, transitionrun]): Unit = js.native
  @JSName("default")
  def default_transitionrun[T /* <: Element | Document | Window */](eventTarget: T, event: transitionrun, listener: EventHandler[T, transitionrun], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_transitionrun[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitionrun,
    listener: EventHandler[T, transitionrun],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_transitionrun[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: transitionrun, listener: EventHandler[T, transitionrun]): Unit = js.native
  @JSName("default")
  def default_transitionrun[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionrun,
    listener: EventHandler[T, transitionrun],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_transitionrun[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionrun,
    listener: EventHandler[T, transitionrun],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_transitionstart[T /* <: Element | Document | Window */](eventTarget: T, event: transitionstart, listener: EventHandler[T, transitionstart]): Unit = js.native
  @JSName("default")
  def default_transitionstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitionstart,
    listener: EventHandler[T, transitionstart],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_transitionstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitionstart,
    listener: EventHandler[T, transitionstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_transitionstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: transitionstart, listener: EventHandler[T, transitionstart]): Unit = js.native
  @JSName("default")
  def default_transitionstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionstart,
    listener: EventHandler[T, transitionstart],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_transitionstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionstart,
    listener: EventHandler[T, transitionstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_visibilitychange[T /* <: Element | Document | Window */](eventTarget: T, event: visibilitychange, listener: EventHandler[T, visibilitychange]): Unit = js.native
  @JSName("default")
  def default_visibilitychange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: visibilitychange,
    listener: EventHandler[T, visibilitychange],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_visibilitychange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: visibilitychange,
    listener: EventHandler[T, visibilitychange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_visibilitychange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: visibilitychange, listener: EventHandler[T, visibilitychange]): Unit = js.native
  @JSName("default")
  def default_visibilitychange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: visibilitychange,
    listener: EventHandler[T, visibilitychange],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_visibilitychange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: visibilitychange,
    listener: EventHandler[T, visibilitychange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_volumechange[T /* <: Element | Document | Window */](eventTarget: T, event: volumechange, listener: EventHandler[T, volumechange]): Unit = js.native
  @JSName("default")
  def default_volumechange[T /* <: Element | Document | Window */](eventTarget: T, event: volumechange, listener: EventHandler[T, volumechange], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_volumechange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: volumechange,
    listener: EventHandler[T, volumechange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_volumechange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: volumechange, listener: EventHandler[T, volumechange]): Unit = js.native
  @JSName("default")
  def default_volumechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: volumechange,
    listener: EventHandler[T, volumechange],
    capture: Boolean
  ): Unit = js.native
  @JSName("default")
  def default_volumechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: volumechange,
    listener: EventHandler[T, volumechange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_waiting[T /* <: Element | Document | Window */](eventTarget: T, event: waiting, listener: EventHandler[T, waiting]): Unit = js.native
  @JSName("default")
  def default_waiting[T /* <: Element | Document | Window */](eventTarget: T, event: waiting, listener: EventHandler[T, waiting], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_waiting[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: waiting,
    listener: EventHandler[T, waiting],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_waiting[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: waiting, listener: EventHandler[T, waiting]): Unit = js.native
  @JSName("default")
  def default_waiting[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: waiting, listener: EventHandler[T, waiting], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_waiting[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: waiting,
    listener: EventHandler[T, waiting],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("default")
  def default_wheel[T /* <: Element | Document | Window */](eventTarget: T, event: wheel, listener: EventHandler[T, wheel]): Unit = js.native
  @JSName("default")
  def default_wheel[T /* <: Element | Document | Window */](eventTarget: T, event: wheel, listener: EventHandler[T, wheel], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_wheel[T /* <: Element | Document | Window */](eventTarget: T, event: wheel, listener: EventHandler[T, wheel], capture: AddEventListenerOptions): Unit = js.native
  @JSName("default")
  def default_wheel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: wheel, listener: EventHandler[T, wheel]): Unit = js.native
  @JSName("default")
  def default_wheel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: wheel, listener: EventHandler[T, wheel], capture: Boolean): Unit = js.native
  @JSName("default")
  def default_wheel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: wheel,
    listener: EventHandler[T, wheel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  
  type EventHandler[T, K /* <: fullscreenchange | fullscreenerror | pointerlockchange | pointerlockerror | readystatechange | visibilitychange */] = js.ThisFunction1[
    /* this */ T, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.DocumentEventMap[K] */ /* ev */ js.Any, 
    js.Any
  ]
}
