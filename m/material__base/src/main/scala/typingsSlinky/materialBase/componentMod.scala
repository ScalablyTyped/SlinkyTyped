package typingsSlinky.materialBase

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialBase.materialBaseStrings.abort
import typingsSlinky.materialBase.materialBaseStrings.animationcancel
import typingsSlinky.materialBase.materialBaseStrings.animationend
import typingsSlinky.materialBase.materialBaseStrings.animationiteration
import typingsSlinky.materialBase.materialBaseStrings.animationstart
import typingsSlinky.materialBase.materialBaseStrings.auxclick
import typingsSlinky.materialBase.materialBaseStrings.blur
import typingsSlinky.materialBase.materialBaseStrings.cancel
import typingsSlinky.materialBase.materialBaseStrings.canplay
import typingsSlinky.materialBase.materialBaseStrings.canplaythrough
import typingsSlinky.materialBase.materialBaseStrings.change
import typingsSlinky.materialBase.materialBaseStrings.click
import typingsSlinky.materialBase.materialBaseStrings.close
import typingsSlinky.materialBase.materialBaseStrings.contextmenu
import typingsSlinky.materialBase.materialBaseStrings.cuechange
import typingsSlinky.materialBase.materialBaseStrings.dblclick
import typingsSlinky.materialBase.materialBaseStrings.drag
import typingsSlinky.materialBase.materialBaseStrings.dragend
import typingsSlinky.materialBase.materialBaseStrings.dragenter
import typingsSlinky.materialBase.materialBaseStrings.dragexit
import typingsSlinky.materialBase.materialBaseStrings.dragleave
import typingsSlinky.materialBase.materialBaseStrings.dragover
import typingsSlinky.materialBase.materialBaseStrings.dragstart
import typingsSlinky.materialBase.materialBaseStrings.drop
import typingsSlinky.materialBase.materialBaseStrings.durationchange
import typingsSlinky.materialBase.materialBaseStrings.emptied
import typingsSlinky.materialBase.materialBaseStrings.ended
import typingsSlinky.materialBase.materialBaseStrings.error
import typingsSlinky.materialBase.materialBaseStrings.focus
import typingsSlinky.materialBase.materialBaseStrings.focusin
import typingsSlinky.materialBase.materialBaseStrings.focusout
import typingsSlinky.materialBase.materialBaseStrings.gotpointercapture
import typingsSlinky.materialBase.materialBaseStrings.input
import typingsSlinky.materialBase.materialBaseStrings.invalid
import typingsSlinky.materialBase.materialBaseStrings.keydown
import typingsSlinky.materialBase.materialBaseStrings.keypress
import typingsSlinky.materialBase.materialBaseStrings.keyup
import typingsSlinky.materialBase.materialBaseStrings.load
import typingsSlinky.materialBase.materialBaseStrings.loadeddata
import typingsSlinky.materialBase.materialBaseStrings.loadedmetadata
import typingsSlinky.materialBase.materialBaseStrings.loadstart
import typingsSlinky.materialBase.materialBaseStrings.lostpointercapture
import typingsSlinky.materialBase.materialBaseStrings.mousedown
import typingsSlinky.materialBase.materialBaseStrings.mouseenter
import typingsSlinky.materialBase.materialBaseStrings.mouseleave
import typingsSlinky.materialBase.materialBaseStrings.mousemove
import typingsSlinky.materialBase.materialBaseStrings.mouseout
import typingsSlinky.materialBase.materialBaseStrings.mouseover
import typingsSlinky.materialBase.materialBaseStrings.mouseup
import typingsSlinky.materialBase.materialBaseStrings.pause
import typingsSlinky.materialBase.materialBaseStrings.play
import typingsSlinky.materialBase.materialBaseStrings.playing
import typingsSlinky.materialBase.materialBaseStrings.pointercancel
import typingsSlinky.materialBase.materialBaseStrings.pointerdown
import typingsSlinky.materialBase.materialBaseStrings.pointerenter
import typingsSlinky.materialBase.materialBaseStrings.pointerleave
import typingsSlinky.materialBase.materialBaseStrings.pointermove
import typingsSlinky.materialBase.materialBaseStrings.pointerout
import typingsSlinky.materialBase.materialBaseStrings.pointerover
import typingsSlinky.materialBase.materialBaseStrings.pointerup
import typingsSlinky.materialBase.materialBaseStrings.progress
import typingsSlinky.materialBase.materialBaseStrings.ratechange
import typingsSlinky.materialBase.materialBaseStrings.reset
import typingsSlinky.materialBase.materialBaseStrings.resize
import typingsSlinky.materialBase.materialBaseStrings.scroll
import typingsSlinky.materialBase.materialBaseStrings.securitypolicyviolation
import typingsSlinky.materialBase.materialBaseStrings.seeked
import typingsSlinky.materialBase.materialBaseStrings.seeking
import typingsSlinky.materialBase.materialBaseStrings.select
import typingsSlinky.materialBase.materialBaseStrings.selectionchange
import typingsSlinky.materialBase.materialBaseStrings.selectstart
import typingsSlinky.materialBase.materialBaseStrings.stalled
import typingsSlinky.materialBase.materialBaseStrings.submit
import typingsSlinky.materialBase.materialBaseStrings.suspend
import typingsSlinky.materialBase.materialBaseStrings.timeupdate
import typingsSlinky.materialBase.materialBaseStrings.toggle
import typingsSlinky.materialBase.materialBaseStrings.touchcancel
import typingsSlinky.materialBase.materialBaseStrings.touchend
import typingsSlinky.materialBase.materialBaseStrings.touchmove
import typingsSlinky.materialBase.materialBaseStrings.touchstart
import typingsSlinky.materialBase.materialBaseStrings.transitioncancel
import typingsSlinky.materialBase.materialBaseStrings.transitionend
import typingsSlinky.materialBase.materialBaseStrings.transitionrun
import typingsSlinky.materialBase.materialBaseStrings.transitionstart
import typingsSlinky.materialBase.materialBaseStrings.volumechange
import typingsSlinky.materialBase.materialBaseStrings.waiting
import typingsSlinky.materialBase.materialBaseStrings.wheel
import typingsSlinky.materialBase.typesMod.CustomEventListener
import typingsSlinky.materialBase.typesMod.SpecificEventListener
import typingsSlinky.std.AddEventListenerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/base/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  
  @js.native
  class MDCComponent[FoundationType /* <: MDCFoundation[js.Object] */] protected () extends js.Object {
    def this(root: Element, foundation: FoundationType, args: js.Any*) = this()
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    
    def destroy(): Unit = js.native
    
    /**
      * Fires a cross-browser-compatible custom event from the component root of the given type, with the given data.
      */
    def emit[T /* <: js.Object */](evtType: String, evtData: T): Unit = js.native
    def emit[T /* <: js.Object */](evtType: String, evtData: T, shouldBubble: Boolean): Unit = js.native
    
    var foundation: FoundationType = js.native
    
    def getDefaultFoundation(): FoundationType = js.native
    
    def initialSyncWithDOM(): Unit = js.native
    
    def initialize(_args: js.Any*): Unit = js.native
    
    def listen[E /* <: Event */](evtType: String, handler: CustomEventListener[E]): Unit = js.native
    def listen[E /* <: Event */](evtType: String, handler: CustomEventListener[E], options: Boolean): Unit = js.native
    def listen[E /* <: Event */](evtType: String, handler: CustomEventListener[E], options: AddEventListenerOptions): Unit = js.native
    /**
      * Wrapper method to add an event listener to the component's root element. This is most useful when
      * listening for custom events.
      */
    @JSName("listen")
    def listen_abort(evtType: abort, handler: SpecificEventListener[abort]): Unit = js.native
    @JSName("listen")
    def listen_abort(evtType: abort, handler: SpecificEventListener[abort], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_abort(evtType: abort, handler: SpecificEventListener[abort], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_animationcancel(evtType: animationcancel, handler: SpecificEventListener[animationcancel]): Unit = js.native
    @JSName("listen")
    def listen_animationcancel(evtType: animationcancel, handler: SpecificEventListener[animationcancel], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_animationcancel(
      evtType: animationcancel,
      handler: SpecificEventListener[animationcancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_animationend(evtType: animationend, handler: SpecificEventListener[animationend]): Unit = js.native
    @JSName("listen")
    def listen_animationend(evtType: animationend, handler: SpecificEventListener[animationend], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_animationend(
      evtType: animationend,
      handler: SpecificEventListener[animationend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_animationiteration(evtType: animationiteration, handler: SpecificEventListener[animationiteration]): Unit = js.native
    @JSName("listen")
    def listen_animationiteration(evtType: animationiteration, handler: SpecificEventListener[animationiteration], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_animationiteration(
      evtType: animationiteration,
      handler: SpecificEventListener[animationiteration],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_animationstart(evtType: animationstart, handler: SpecificEventListener[animationstart]): Unit = js.native
    @JSName("listen")
    def listen_animationstart(evtType: animationstart, handler: SpecificEventListener[animationstart], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_animationstart(
      evtType: animationstart,
      handler: SpecificEventListener[animationstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_auxclick(evtType: auxclick, handler: SpecificEventListener[auxclick]): Unit = js.native
    @JSName("listen")
    def listen_auxclick(evtType: auxclick, handler: SpecificEventListener[auxclick], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_auxclick(evtType: auxclick, handler: SpecificEventListener[auxclick], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_blur(evtType: blur, handler: SpecificEventListener[blur]): Unit = js.native
    @JSName("listen")
    def listen_blur(evtType: blur, handler: SpecificEventListener[blur], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_blur(evtType: blur, handler: SpecificEventListener[blur], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_cancel(evtType: cancel, handler: SpecificEventListener[cancel]): Unit = js.native
    @JSName("listen")
    def listen_cancel(evtType: cancel, handler: SpecificEventListener[cancel], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_cancel(evtType: cancel, handler: SpecificEventListener[cancel], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_canplay(evtType: canplay, handler: SpecificEventListener[canplay]): Unit = js.native
    @JSName("listen")
    def listen_canplay(evtType: canplay, handler: SpecificEventListener[canplay], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_canplay(evtType: canplay, handler: SpecificEventListener[canplay], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_canplaythrough(evtType: canplaythrough, handler: SpecificEventListener[canplaythrough]): Unit = js.native
    @JSName("listen")
    def listen_canplaythrough(evtType: canplaythrough, handler: SpecificEventListener[canplaythrough], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_canplaythrough(
      evtType: canplaythrough,
      handler: SpecificEventListener[canplaythrough],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_change(evtType: change, handler: SpecificEventListener[change]): Unit = js.native
    @JSName("listen")
    def listen_change(evtType: change, handler: SpecificEventListener[change], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_change(evtType: change, handler: SpecificEventListener[change], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_click(evtType: click, handler: SpecificEventListener[click]): Unit = js.native
    @JSName("listen")
    def listen_click(evtType: click, handler: SpecificEventListener[click], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_click(evtType: click, handler: SpecificEventListener[click], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_close(evtType: close, handler: SpecificEventListener[close]): Unit = js.native
    @JSName("listen")
    def listen_close(evtType: close, handler: SpecificEventListener[close], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_close(evtType: close, handler: SpecificEventListener[close], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_contextmenu(evtType: contextmenu, handler: SpecificEventListener[contextmenu]): Unit = js.native
    @JSName("listen")
    def listen_contextmenu(evtType: contextmenu, handler: SpecificEventListener[contextmenu], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_contextmenu(
      evtType: contextmenu,
      handler: SpecificEventListener[contextmenu],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_cuechange(evtType: cuechange, handler: SpecificEventListener[cuechange]): Unit = js.native
    @JSName("listen")
    def listen_cuechange(evtType: cuechange, handler: SpecificEventListener[cuechange], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_cuechange(evtType: cuechange, handler: SpecificEventListener[cuechange], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_dblclick(evtType: dblclick, handler: SpecificEventListener[dblclick]): Unit = js.native
    @JSName("listen")
    def listen_dblclick(evtType: dblclick, handler: SpecificEventListener[dblclick], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_dblclick(evtType: dblclick, handler: SpecificEventListener[dblclick], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_drag(evtType: drag, handler: SpecificEventListener[drag]): Unit = js.native
    @JSName("listen")
    def listen_drag(evtType: drag, handler: SpecificEventListener[drag], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_drag(evtType: drag, handler: SpecificEventListener[drag], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_dragend(evtType: dragend, handler: SpecificEventListener[dragend]): Unit = js.native
    @JSName("listen")
    def listen_dragend(evtType: dragend, handler: SpecificEventListener[dragend], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_dragend(evtType: dragend, handler: SpecificEventListener[dragend], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_dragenter(evtType: dragenter, handler: SpecificEventListener[dragenter]): Unit = js.native
    @JSName("listen")
    def listen_dragenter(evtType: dragenter, handler: SpecificEventListener[dragenter], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_dragenter(evtType: dragenter, handler: SpecificEventListener[dragenter], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_dragexit(evtType: dragexit, handler: SpecificEventListener[dragexit]): Unit = js.native
    @JSName("listen")
    def listen_dragexit(evtType: dragexit, handler: SpecificEventListener[dragexit], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_dragexit(evtType: dragexit, handler: SpecificEventListener[dragexit], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_dragleave(evtType: dragleave, handler: SpecificEventListener[dragleave]): Unit = js.native
    @JSName("listen")
    def listen_dragleave(evtType: dragleave, handler: SpecificEventListener[dragleave], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_dragleave(evtType: dragleave, handler: SpecificEventListener[dragleave], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_dragover(evtType: dragover, handler: SpecificEventListener[dragover]): Unit = js.native
    @JSName("listen")
    def listen_dragover(evtType: dragover, handler: SpecificEventListener[dragover], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_dragover(evtType: dragover, handler: SpecificEventListener[dragover], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_dragstart(evtType: dragstart, handler: SpecificEventListener[dragstart]): Unit = js.native
    @JSName("listen")
    def listen_dragstart(evtType: dragstart, handler: SpecificEventListener[dragstart], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_dragstart(evtType: dragstart, handler: SpecificEventListener[dragstart], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_drop(evtType: drop, handler: SpecificEventListener[drop]): Unit = js.native
    @JSName("listen")
    def listen_drop(evtType: drop, handler: SpecificEventListener[drop], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_drop(evtType: drop, handler: SpecificEventListener[drop], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_durationchange(evtType: durationchange, handler: SpecificEventListener[durationchange]): Unit = js.native
    @JSName("listen")
    def listen_durationchange(evtType: durationchange, handler: SpecificEventListener[durationchange], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_durationchange(
      evtType: durationchange,
      handler: SpecificEventListener[durationchange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_emptied(evtType: emptied, handler: SpecificEventListener[emptied]): Unit = js.native
    @JSName("listen")
    def listen_emptied(evtType: emptied, handler: SpecificEventListener[emptied], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_emptied(evtType: emptied, handler: SpecificEventListener[emptied], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_ended(evtType: ended, handler: SpecificEventListener[ended]): Unit = js.native
    @JSName("listen")
    def listen_ended(evtType: ended, handler: SpecificEventListener[ended], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_ended(evtType: ended, handler: SpecificEventListener[ended], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_error(evtType: error, handler: SpecificEventListener[error]): Unit = js.native
    @JSName("listen")
    def listen_error(evtType: error, handler: SpecificEventListener[error], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_error(evtType: error, handler: SpecificEventListener[error], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_focus(evtType: focus, handler: SpecificEventListener[focus]): Unit = js.native
    @JSName("listen")
    def listen_focus(evtType: focus, handler: SpecificEventListener[focus], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_focus(evtType: focus, handler: SpecificEventListener[focus], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_focusin(evtType: focusin, handler: SpecificEventListener[focusin]): Unit = js.native
    @JSName("listen")
    def listen_focusin(evtType: focusin, handler: SpecificEventListener[focusin], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_focusin(evtType: focusin, handler: SpecificEventListener[focusin], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_focusout(evtType: focusout, handler: SpecificEventListener[focusout]): Unit = js.native
    @JSName("listen")
    def listen_focusout(evtType: focusout, handler: SpecificEventListener[focusout], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_focusout(evtType: focusout, handler: SpecificEventListener[focusout], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_gotpointercapture(evtType: gotpointercapture, handler: SpecificEventListener[gotpointercapture]): Unit = js.native
    @JSName("listen")
    def listen_gotpointercapture(evtType: gotpointercapture, handler: SpecificEventListener[gotpointercapture], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_gotpointercapture(
      evtType: gotpointercapture,
      handler: SpecificEventListener[gotpointercapture],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_input(evtType: input, handler: SpecificEventListener[input]): Unit = js.native
    @JSName("listen")
    def listen_input(evtType: input, handler: SpecificEventListener[input], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_input(evtType: input, handler: SpecificEventListener[input], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_invalid(evtType: invalid, handler: SpecificEventListener[invalid]): Unit = js.native
    @JSName("listen")
    def listen_invalid(evtType: invalid, handler: SpecificEventListener[invalid], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_invalid(evtType: invalid, handler: SpecificEventListener[invalid], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_keydown(evtType: keydown, handler: SpecificEventListener[keydown]): Unit = js.native
    @JSName("listen")
    def listen_keydown(evtType: keydown, handler: SpecificEventListener[keydown], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_keydown(evtType: keydown, handler: SpecificEventListener[keydown], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_keypress(evtType: keypress, handler: SpecificEventListener[keypress]): Unit = js.native
    @JSName("listen")
    def listen_keypress(evtType: keypress, handler: SpecificEventListener[keypress], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_keypress(evtType: keypress, handler: SpecificEventListener[keypress], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_keyup(evtType: keyup, handler: SpecificEventListener[keyup]): Unit = js.native
    @JSName("listen")
    def listen_keyup(evtType: keyup, handler: SpecificEventListener[keyup], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_keyup(evtType: keyup, handler: SpecificEventListener[keyup], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_load(evtType: load, handler: SpecificEventListener[load]): Unit = js.native
    @JSName("listen")
    def listen_load(evtType: load, handler: SpecificEventListener[load], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_load(evtType: load, handler: SpecificEventListener[load], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_loadeddata(evtType: loadeddata, handler: SpecificEventListener[loadeddata]): Unit = js.native
    @JSName("listen")
    def listen_loadeddata(evtType: loadeddata, handler: SpecificEventListener[loadeddata], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_loadeddata(evtType: loadeddata, handler: SpecificEventListener[loadeddata], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_loadedmetadata(evtType: loadedmetadata, handler: SpecificEventListener[loadedmetadata]): Unit = js.native
    @JSName("listen")
    def listen_loadedmetadata(evtType: loadedmetadata, handler: SpecificEventListener[loadedmetadata], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_loadedmetadata(
      evtType: loadedmetadata,
      handler: SpecificEventListener[loadedmetadata],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_loadstart(evtType: loadstart, handler: SpecificEventListener[loadstart]): Unit = js.native
    @JSName("listen")
    def listen_loadstart(evtType: loadstart, handler: SpecificEventListener[loadstart], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_loadstart(evtType: loadstart, handler: SpecificEventListener[loadstart], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_lostpointercapture(evtType: lostpointercapture, handler: SpecificEventListener[lostpointercapture]): Unit = js.native
    @JSName("listen")
    def listen_lostpointercapture(evtType: lostpointercapture, handler: SpecificEventListener[lostpointercapture], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_lostpointercapture(
      evtType: lostpointercapture,
      handler: SpecificEventListener[lostpointercapture],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_mousedown(evtType: mousedown, handler: SpecificEventListener[mousedown]): Unit = js.native
    @JSName("listen")
    def listen_mousedown(evtType: mousedown, handler: SpecificEventListener[mousedown], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_mousedown(evtType: mousedown, handler: SpecificEventListener[mousedown], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_mouseenter(evtType: mouseenter, handler: SpecificEventListener[mouseenter]): Unit = js.native
    @JSName("listen")
    def listen_mouseenter(evtType: mouseenter, handler: SpecificEventListener[mouseenter], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_mouseenter(evtType: mouseenter, handler: SpecificEventListener[mouseenter], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_mouseleave(evtType: mouseleave, handler: SpecificEventListener[mouseleave]): Unit = js.native
    @JSName("listen")
    def listen_mouseleave(evtType: mouseleave, handler: SpecificEventListener[mouseleave], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_mouseleave(evtType: mouseleave, handler: SpecificEventListener[mouseleave], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_mousemove(evtType: mousemove, handler: SpecificEventListener[mousemove]): Unit = js.native
    @JSName("listen")
    def listen_mousemove(evtType: mousemove, handler: SpecificEventListener[mousemove], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_mousemove(evtType: mousemove, handler: SpecificEventListener[mousemove], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_mouseout(evtType: mouseout, handler: SpecificEventListener[mouseout]): Unit = js.native
    @JSName("listen")
    def listen_mouseout(evtType: mouseout, handler: SpecificEventListener[mouseout], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_mouseout(evtType: mouseout, handler: SpecificEventListener[mouseout], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_mouseover(evtType: mouseover, handler: SpecificEventListener[mouseover]): Unit = js.native
    @JSName("listen")
    def listen_mouseover(evtType: mouseover, handler: SpecificEventListener[mouseover], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_mouseover(evtType: mouseover, handler: SpecificEventListener[mouseover], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_mouseup(evtType: mouseup, handler: SpecificEventListener[mouseup]): Unit = js.native
    @JSName("listen")
    def listen_mouseup(evtType: mouseup, handler: SpecificEventListener[mouseup], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_mouseup(evtType: mouseup, handler: SpecificEventListener[mouseup], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_pause(evtType: pause, handler: SpecificEventListener[pause]): Unit = js.native
    @JSName("listen")
    def listen_pause(evtType: pause, handler: SpecificEventListener[pause], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pause(evtType: pause, handler: SpecificEventListener[pause], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_play(evtType: play, handler: SpecificEventListener[play]): Unit = js.native
    @JSName("listen")
    def listen_play(evtType: play, handler: SpecificEventListener[play], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_play(evtType: play, handler: SpecificEventListener[play], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_playing(evtType: playing, handler: SpecificEventListener[playing]): Unit = js.native
    @JSName("listen")
    def listen_playing(evtType: playing, handler: SpecificEventListener[playing], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_playing(evtType: playing, handler: SpecificEventListener[playing], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_pointercancel(evtType: pointercancel, handler: SpecificEventListener[pointercancel]): Unit = js.native
    @JSName("listen")
    def listen_pointercancel(evtType: pointercancel, handler: SpecificEventListener[pointercancel], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointercancel(
      evtType: pointercancel,
      handler: SpecificEventListener[pointercancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_pointerdown(evtType: pointerdown, handler: SpecificEventListener[pointerdown]): Unit = js.native
    @JSName("listen")
    def listen_pointerdown(evtType: pointerdown, handler: SpecificEventListener[pointerdown], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointerdown(
      evtType: pointerdown,
      handler: SpecificEventListener[pointerdown],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_pointerenter(evtType: pointerenter, handler: SpecificEventListener[pointerenter]): Unit = js.native
    @JSName("listen")
    def listen_pointerenter(evtType: pointerenter, handler: SpecificEventListener[pointerenter], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointerenter(
      evtType: pointerenter,
      handler: SpecificEventListener[pointerenter],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_pointerleave(evtType: pointerleave, handler: SpecificEventListener[pointerleave]): Unit = js.native
    @JSName("listen")
    def listen_pointerleave(evtType: pointerleave, handler: SpecificEventListener[pointerleave], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointerleave(
      evtType: pointerleave,
      handler: SpecificEventListener[pointerleave],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_pointermove(evtType: pointermove, handler: SpecificEventListener[pointermove]): Unit = js.native
    @JSName("listen")
    def listen_pointermove(evtType: pointermove, handler: SpecificEventListener[pointermove], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointermove(
      evtType: pointermove,
      handler: SpecificEventListener[pointermove],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_pointerout(evtType: pointerout, handler: SpecificEventListener[pointerout]): Unit = js.native
    @JSName("listen")
    def listen_pointerout(evtType: pointerout, handler: SpecificEventListener[pointerout], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointerout(evtType: pointerout, handler: SpecificEventListener[pointerout], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_pointerover(evtType: pointerover, handler: SpecificEventListener[pointerover]): Unit = js.native
    @JSName("listen")
    def listen_pointerover(evtType: pointerover, handler: SpecificEventListener[pointerover], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointerover(
      evtType: pointerover,
      handler: SpecificEventListener[pointerover],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_pointerup(evtType: pointerup, handler: SpecificEventListener[pointerup]): Unit = js.native
    @JSName("listen")
    def listen_pointerup(evtType: pointerup, handler: SpecificEventListener[pointerup], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointerup(evtType: pointerup, handler: SpecificEventListener[pointerup], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_progress(evtType: progress, handler: SpecificEventListener[progress]): Unit = js.native
    @JSName("listen")
    def listen_progress(evtType: progress, handler: SpecificEventListener[progress], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_progress(evtType: progress, handler: SpecificEventListener[progress], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_ratechange(evtType: ratechange, handler: SpecificEventListener[ratechange]): Unit = js.native
    @JSName("listen")
    def listen_ratechange(evtType: ratechange, handler: SpecificEventListener[ratechange], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_ratechange(evtType: ratechange, handler: SpecificEventListener[ratechange], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_reset(evtType: reset, handler: SpecificEventListener[reset]): Unit = js.native
    @JSName("listen")
    def listen_reset(evtType: reset, handler: SpecificEventListener[reset], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_reset(evtType: reset, handler: SpecificEventListener[reset], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_resize(evtType: resize, handler: SpecificEventListener[resize]): Unit = js.native
    @JSName("listen")
    def listen_resize(evtType: resize, handler: SpecificEventListener[resize], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_resize(evtType: resize, handler: SpecificEventListener[resize], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_scroll(evtType: scroll, handler: SpecificEventListener[scroll]): Unit = js.native
    @JSName("listen")
    def listen_scroll(evtType: scroll, handler: SpecificEventListener[scroll], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_scroll(evtType: scroll, handler: SpecificEventListener[scroll], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_securitypolicyviolation(evtType: securitypolicyviolation, handler: SpecificEventListener[securitypolicyviolation]): Unit = js.native
    @JSName("listen")
    def listen_securitypolicyviolation(
      evtType: securitypolicyviolation,
      handler: SpecificEventListener[securitypolicyviolation],
      options: Boolean
    ): Unit = js.native
    @JSName("listen")
    def listen_securitypolicyviolation(
      evtType: securitypolicyviolation,
      handler: SpecificEventListener[securitypolicyviolation],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_seeked(evtType: seeked, handler: SpecificEventListener[seeked]): Unit = js.native
    @JSName("listen")
    def listen_seeked(evtType: seeked, handler: SpecificEventListener[seeked], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_seeked(evtType: seeked, handler: SpecificEventListener[seeked], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_seeking(evtType: seeking, handler: SpecificEventListener[seeking]): Unit = js.native
    @JSName("listen")
    def listen_seeking(evtType: seeking, handler: SpecificEventListener[seeking], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_seeking(evtType: seeking, handler: SpecificEventListener[seeking], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_select(evtType: select, handler: SpecificEventListener[select]): Unit = js.native
    @JSName("listen")
    def listen_select(evtType: select, handler: SpecificEventListener[select], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_select(evtType: select, handler: SpecificEventListener[select], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_selectionchange(evtType: selectionchange, handler: SpecificEventListener[selectionchange]): Unit = js.native
    @JSName("listen")
    def listen_selectionchange(evtType: selectionchange, handler: SpecificEventListener[selectionchange], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_selectionchange(
      evtType: selectionchange,
      handler: SpecificEventListener[selectionchange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_selectstart(evtType: selectstart, handler: SpecificEventListener[selectstart]): Unit = js.native
    @JSName("listen")
    def listen_selectstart(evtType: selectstart, handler: SpecificEventListener[selectstart], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_selectstart(
      evtType: selectstart,
      handler: SpecificEventListener[selectstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_stalled(evtType: stalled, handler: SpecificEventListener[stalled]): Unit = js.native
    @JSName("listen")
    def listen_stalled(evtType: stalled, handler: SpecificEventListener[stalled], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_stalled(evtType: stalled, handler: SpecificEventListener[stalled], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_submit(evtType: submit, handler: SpecificEventListener[submit]): Unit = js.native
    @JSName("listen")
    def listen_submit(evtType: submit, handler: SpecificEventListener[submit], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_submit(evtType: submit, handler: SpecificEventListener[submit], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_suspend(evtType: suspend, handler: SpecificEventListener[suspend]): Unit = js.native
    @JSName("listen")
    def listen_suspend(evtType: suspend, handler: SpecificEventListener[suspend], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_suspend(evtType: suspend, handler: SpecificEventListener[suspend], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_timeupdate(evtType: timeupdate, handler: SpecificEventListener[timeupdate]): Unit = js.native
    @JSName("listen")
    def listen_timeupdate(evtType: timeupdate, handler: SpecificEventListener[timeupdate], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_timeupdate(evtType: timeupdate, handler: SpecificEventListener[timeupdate], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_toggle(evtType: toggle, handler: SpecificEventListener[toggle]): Unit = js.native
    @JSName("listen")
    def listen_toggle(evtType: toggle, handler: SpecificEventListener[toggle], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_toggle(evtType: toggle, handler: SpecificEventListener[toggle], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_touchcancel(evtType: touchcancel, handler: SpecificEventListener[touchcancel]): Unit = js.native
    @JSName("listen")
    def listen_touchcancel(evtType: touchcancel, handler: SpecificEventListener[touchcancel], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_touchcancel(
      evtType: touchcancel,
      handler: SpecificEventListener[touchcancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_touchend(evtType: touchend, handler: SpecificEventListener[touchend]): Unit = js.native
    @JSName("listen")
    def listen_touchend(evtType: touchend, handler: SpecificEventListener[touchend], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_touchend(evtType: touchend, handler: SpecificEventListener[touchend], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_touchmove(evtType: touchmove, handler: SpecificEventListener[touchmove]): Unit = js.native
    @JSName("listen")
    def listen_touchmove(evtType: touchmove, handler: SpecificEventListener[touchmove], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_touchmove(evtType: touchmove, handler: SpecificEventListener[touchmove], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_touchstart(evtType: touchstart, handler: SpecificEventListener[touchstart]): Unit = js.native
    @JSName("listen")
    def listen_touchstart(evtType: touchstart, handler: SpecificEventListener[touchstart], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_touchstart(evtType: touchstart, handler: SpecificEventListener[touchstart], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_transitioncancel(evtType: transitioncancel, handler: SpecificEventListener[transitioncancel]): Unit = js.native
    @JSName("listen")
    def listen_transitioncancel(evtType: transitioncancel, handler: SpecificEventListener[transitioncancel], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_transitioncancel(
      evtType: transitioncancel,
      handler: SpecificEventListener[transitioncancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_transitionend(evtType: transitionend, handler: SpecificEventListener[transitionend]): Unit = js.native
    @JSName("listen")
    def listen_transitionend(evtType: transitionend, handler: SpecificEventListener[transitionend], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_transitionend(
      evtType: transitionend,
      handler: SpecificEventListener[transitionend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_transitionrun(evtType: transitionrun, handler: SpecificEventListener[transitionrun]): Unit = js.native
    @JSName("listen")
    def listen_transitionrun(evtType: transitionrun, handler: SpecificEventListener[transitionrun], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_transitionrun(
      evtType: transitionrun,
      handler: SpecificEventListener[transitionrun],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_transitionstart(evtType: transitionstart, handler: SpecificEventListener[transitionstart]): Unit = js.native
    @JSName("listen")
    def listen_transitionstart(evtType: transitionstart, handler: SpecificEventListener[transitionstart], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_transitionstart(
      evtType: transitionstart,
      handler: SpecificEventListener[transitionstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_volumechange(evtType: volumechange, handler: SpecificEventListener[volumechange]): Unit = js.native
    @JSName("listen")
    def listen_volumechange(evtType: volumechange, handler: SpecificEventListener[volumechange], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_volumechange(
      evtType: volumechange,
      handler: SpecificEventListener[volumechange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_waiting(evtType: waiting, handler: SpecificEventListener[waiting]): Unit = js.native
    @JSName("listen")
    def listen_waiting(evtType: waiting, handler: SpecificEventListener[waiting], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_waiting(evtType: waiting, handler: SpecificEventListener[waiting], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_wheel(evtType: wheel, handler: SpecificEventListener[wheel]): Unit = js.native
    @JSName("listen")
    def listen_wheel(evtType: wheel, handler: SpecificEventListener[wheel], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_wheel(evtType: wheel, handler: SpecificEventListener[wheel], options: AddEventListenerOptions): Unit = js.native
    
    var root: Element = js.native
    
    def unlisten[E /* <: Event */](evtType: String, handler: CustomEventListener[E]): Unit = js.native
    def unlisten[E /* <: Event */](evtType: String, handler: CustomEventListener[E], options: Boolean): Unit = js.native
    def unlisten[E /* <: Event */](evtType: String, handler: CustomEventListener[E], options: AddEventListenerOptions): Unit = js.native
    /**
      * Wrapper method to remove an event listener to the component's root element. This is most useful when
      * unlistening for custom events.
      */
    @JSName("unlisten")
    def unlisten_abort(evtType: abort, handler: SpecificEventListener[abort]): Unit = js.native
    @JSName("unlisten")
    def unlisten_abort(evtType: abort, handler: SpecificEventListener[abort], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_abort(evtType: abort, handler: SpecificEventListener[abort], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationcancel(evtType: animationcancel, handler: SpecificEventListener[animationcancel]): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationcancel(evtType: animationcancel, handler: SpecificEventListener[animationcancel], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationcancel(
      evtType: animationcancel,
      handler: SpecificEventListener[animationcancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationend(evtType: animationend, handler: SpecificEventListener[animationend]): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationend(evtType: animationend, handler: SpecificEventListener[animationend], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationend(
      evtType: animationend,
      handler: SpecificEventListener[animationend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationiteration(evtType: animationiteration, handler: SpecificEventListener[animationiteration]): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationiteration(evtType: animationiteration, handler: SpecificEventListener[animationiteration], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationiteration(
      evtType: animationiteration,
      handler: SpecificEventListener[animationiteration],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationstart(evtType: animationstart, handler: SpecificEventListener[animationstart]): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationstart(evtType: animationstart, handler: SpecificEventListener[animationstart], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationstart(
      evtType: animationstart,
      handler: SpecificEventListener[animationstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_auxclick(evtType: auxclick, handler: SpecificEventListener[auxclick]): Unit = js.native
    @JSName("unlisten")
    def unlisten_auxclick(evtType: auxclick, handler: SpecificEventListener[auxclick], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_auxclick(evtType: auxclick, handler: SpecificEventListener[auxclick], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_blur(evtType: blur, handler: SpecificEventListener[blur]): Unit = js.native
    @JSName("unlisten")
    def unlisten_blur(evtType: blur, handler: SpecificEventListener[blur], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_blur(evtType: blur, handler: SpecificEventListener[blur], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_cancel(evtType: cancel, handler: SpecificEventListener[cancel]): Unit = js.native
    @JSName("unlisten")
    def unlisten_cancel(evtType: cancel, handler: SpecificEventListener[cancel], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_cancel(evtType: cancel, handler: SpecificEventListener[cancel], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_canplay(evtType: canplay, handler: SpecificEventListener[canplay]): Unit = js.native
    @JSName("unlisten")
    def unlisten_canplay(evtType: canplay, handler: SpecificEventListener[canplay], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_canplay(evtType: canplay, handler: SpecificEventListener[canplay], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_canplaythrough(evtType: canplaythrough, handler: SpecificEventListener[canplaythrough]): Unit = js.native
    @JSName("unlisten")
    def unlisten_canplaythrough(evtType: canplaythrough, handler: SpecificEventListener[canplaythrough], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_canplaythrough(
      evtType: canplaythrough,
      handler: SpecificEventListener[canplaythrough],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_change(evtType: change, handler: SpecificEventListener[change]): Unit = js.native
    @JSName("unlisten")
    def unlisten_change(evtType: change, handler: SpecificEventListener[change], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_change(evtType: change, handler: SpecificEventListener[change], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_click(evtType: click, handler: SpecificEventListener[click]): Unit = js.native
    @JSName("unlisten")
    def unlisten_click(evtType: click, handler: SpecificEventListener[click], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_click(evtType: click, handler: SpecificEventListener[click], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_close(evtType: close, handler: SpecificEventListener[close]): Unit = js.native
    @JSName("unlisten")
    def unlisten_close(evtType: close, handler: SpecificEventListener[close], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_close(evtType: close, handler: SpecificEventListener[close], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_contextmenu(evtType: contextmenu, handler: SpecificEventListener[contextmenu]): Unit = js.native
    @JSName("unlisten")
    def unlisten_contextmenu(evtType: contextmenu, handler: SpecificEventListener[contextmenu], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_contextmenu(
      evtType: contextmenu,
      handler: SpecificEventListener[contextmenu],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_cuechange(evtType: cuechange, handler: SpecificEventListener[cuechange]): Unit = js.native
    @JSName("unlisten")
    def unlisten_cuechange(evtType: cuechange, handler: SpecificEventListener[cuechange], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_cuechange(evtType: cuechange, handler: SpecificEventListener[cuechange], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_dblclick(evtType: dblclick, handler: SpecificEventListener[dblclick]): Unit = js.native
    @JSName("unlisten")
    def unlisten_dblclick(evtType: dblclick, handler: SpecificEventListener[dblclick], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_dblclick(evtType: dblclick, handler: SpecificEventListener[dblclick], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_drag(evtType: drag, handler: SpecificEventListener[drag]): Unit = js.native
    @JSName("unlisten")
    def unlisten_drag(evtType: drag, handler: SpecificEventListener[drag], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_drag(evtType: drag, handler: SpecificEventListener[drag], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragend(evtType: dragend, handler: SpecificEventListener[dragend]): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragend(evtType: dragend, handler: SpecificEventListener[dragend], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragend(evtType: dragend, handler: SpecificEventListener[dragend], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragenter(evtType: dragenter, handler: SpecificEventListener[dragenter]): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragenter(evtType: dragenter, handler: SpecificEventListener[dragenter], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragenter(evtType: dragenter, handler: SpecificEventListener[dragenter], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragexit(evtType: dragexit, handler: SpecificEventListener[dragexit]): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragexit(evtType: dragexit, handler: SpecificEventListener[dragexit], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragexit(evtType: dragexit, handler: SpecificEventListener[dragexit], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragleave(evtType: dragleave, handler: SpecificEventListener[dragleave]): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragleave(evtType: dragleave, handler: SpecificEventListener[dragleave], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragleave(evtType: dragleave, handler: SpecificEventListener[dragleave], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragover(evtType: dragover, handler: SpecificEventListener[dragover]): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragover(evtType: dragover, handler: SpecificEventListener[dragover], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragover(evtType: dragover, handler: SpecificEventListener[dragover], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragstart(evtType: dragstart, handler: SpecificEventListener[dragstart]): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragstart(evtType: dragstart, handler: SpecificEventListener[dragstart], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragstart(evtType: dragstart, handler: SpecificEventListener[dragstart], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_drop(evtType: drop, handler: SpecificEventListener[drop]): Unit = js.native
    @JSName("unlisten")
    def unlisten_drop(evtType: drop, handler: SpecificEventListener[drop], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_drop(evtType: drop, handler: SpecificEventListener[drop], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_durationchange(evtType: durationchange, handler: SpecificEventListener[durationchange]): Unit = js.native
    @JSName("unlisten")
    def unlisten_durationchange(evtType: durationchange, handler: SpecificEventListener[durationchange], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_durationchange(
      evtType: durationchange,
      handler: SpecificEventListener[durationchange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_emptied(evtType: emptied, handler: SpecificEventListener[emptied]): Unit = js.native
    @JSName("unlisten")
    def unlisten_emptied(evtType: emptied, handler: SpecificEventListener[emptied], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_emptied(evtType: emptied, handler: SpecificEventListener[emptied], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_ended(evtType: ended, handler: SpecificEventListener[ended]): Unit = js.native
    @JSName("unlisten")
    def unlisten_ended(evtType: ended, handler: SpecificEventListener[ended], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_ended(evtType: ended, handler: SpecificEventListener[ended], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_error(evtType: error, handler: SpecificEventListener[error]): Unit = js.native
    @JSName("unlisten")
    def unlisten_error(evtType: error, handler: SpecificEventListener[error], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_error(evtType: error, handler: SpecificEventListener[error], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_focus(evtType: focus, handler: SpecificEventListener[focus]): Unit = js.native
    @JSName("unlisten")
    def unlisten_focus(evtType: focus, handler: SpecificEventListener[focus], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_focus(evtType: focus, handler: SpecificEventListener[focus], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_focusin(evtType: focusin, handler: SpecificEventListener[focusin]): Unit = js.native
    @JSName("unlisten")
    def unlisten_focusin(evtType: focusin, handler: SpecificEventListener[focusin], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_focusin(evtType: focusin, handler: SpecificEventListener[focusin], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_focusout(evtType: focusout, handler: SpecificEventListener[focusout]): Unit = js.native
    @JSName("unlisten")
    def unlisten_focusout(evtType: focusout, handler: SpecificEventListener[focusout], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_focusout(evtType: focusout, handler: SpecificEventListener[focusout], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_gotpointercapture(evtType: gotpointercapture, handler: SpecificEventListener[gotpointercapture]): Unit = js.native
    @JSName("unlisten")
    def unlisten_gotpointercapture(evtType: gotpointercapture, handler: SpecificEventListener[gotpointercapture], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_gotpointercapture(
      evtType: gotpointercapture,
      handler: SpecificEventListener[gotpointercapture],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_input(evtType: input, handler: SpecificEventListener[input]): Unit = js.native
    @JSName("unlisten")
    def unlisten_input(evtType: input, handler: SpecificEventListener[input], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_input(evtType: input, handler: SpecificEventListener[input], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_invalid(evtType: invalid, handler: SpecificEventListener[invalid]): Unit = js.native
    @JSName("unlisten")
    def unlisten_invalid(evtType: invalid, handler: SpecificEventListener[invalid], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_invalid(evtType: invalid, handler: SpecificEventListener[invalid], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_keydown(evtType: keydown, handler: SpecificEventListener[keydown]): Unit = js.native
    @JSName("unlisten")
    def unlisten_keydown(evtType: keydown, handler: SpecificEventListener[keydown], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_keydown(evtType: keydown, handler: SpecificEventListener[keydown], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_keypress(evtType: keypress, handler: SpecificEventListener[keypress]): Unit = js.native
    @JSName("unlisten")
    def unlisten_keypress(evtType: keypress, handler: SpecificEventListener[keypress], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_keypress(evtType: keypress, handler: SpecificEventListener[keypress], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_keyup(evtType: keyup, handler: SpecificEventListener[keyup]): Unit = js.native
    @JSName("unlisten")
    def unlisten_keyup(evtType: keyup, handler: SpecificEventListener[keyup], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_keyup(evtType: keyup, handler: SpecificEventListener[keyup], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_load(evtType: load, handler: SpecificEventListener[load]): Unit = js.native
    @JSName("unlisten")
    def unlisten_load(evtType: load, handler: SpecificEventListener[load], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_load(evtType: load, handler: SpecificEventListener[load], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadeddata(evtType: loadeddata, handler: SpecificEventListener[loadeddata]): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadeddata(evtType: loadeddata, handler: SpecificEventListener[loadeddata], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadeddata(evtType: loadeddata, handler: SpecificEventListener[loadeddata], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadedmetadata(evtType: loadedmetadata, handler: SpecificEventListener[loadedmetadata]): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadedmetadata(evtType: loadedmetadata, handler: SpecificEventListener[loadedmetadata], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadedmetadata(
      evtType: loadedmetadata,
      handler: SpecificEventListener[loadedmetadata],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadstart(evtType: loadstart, handler: SpecificEventListener[loadstart]): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadstart(evtType: loadstart, handler: SpecificEventListener[loadstart], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadstart(evtType: loadstart, handler: SpecificEventListener[loadstart], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_lostpointercapture(evtType: lostpointercapture, handler: SpecificEventListener[lostpointercapture]): Unit = js.native
    @JSName("unlisten")
    def unlisten_lostpointercapture(evtType: lostpointercapture, handler: SpecificEventListener[lostpointercapture], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_lostpointercapture(
      evtType: lostpointercapture,
      handler: SpecificEventListener[lostpointercapture],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_mousedown(evtType: mousedown, handler: SpecificEventListener[mousedown]): Unit = js.native
    @JSName("unlisten")
    def unlisten_mousedown(evtType: mousedown, handler: SpecificEventListener[mousedown], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_mousedown(evtType: mousedown, handler: SpecificEventListener[mousedown], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseenter(evtType: mouseenter, handler: SpecificEventListener[mouseenter]): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseenter(evtType: mouseenter, handler: SpecificEventListener[mouseenter], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseenter(evtType: mouseenter, handler: SpecificEventListener[mouseenter], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseleave(evtType: mouseleave, handler: SpecificEventListener[mouseleave]): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseleave(evtType: mouseleave, handler: SpecificEventListener[mouseleave], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseleave(evtType: mouseleave, handler: SpecificEventListener[mouseleave], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_mousemove(evtType: mousemove, handler: SpecificEventListener[mousemove]): Unit = js.native
    @JSName("unlisten")
    def unlisten_mousemove(evtType: mousemove, handler: SpecificEventListener[mousemove], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_mousemove(evtType: mousemove, handler: SpecificEventListener[mousemove], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseout(evtType: mouseout, handler: SpecificEventListener[mouseout]): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseout(evtType: mouseout, handler: SpecificEventListener[mouseout], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseout(evtType: mouseout, handler: SpecificEventListener[mouseout], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseover(evtType: mouseover, handler: SpecificEventListener[mouseover]): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseover(evtType: mouseover, handler: SpecificEventListener[mouseover], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseover(evtType: mouseover, handler: SpecificEventListener[mouseover], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseup(evtType: mouseup, handler: SpecificEventListener[mouseup]): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseup(evtType: mouseup, handler: SpecificEventListener[mouseup], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseup(evtType: mouseup, handler: SpecificEventListener[mouseup], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_pause(evtType: pause, handler: SpecificEventListener[pause]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pause(evtType: pause, handler: SpecificEventListener[pause], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pause(evtType: pause, handler: SpecificEventListener[pause], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_play(evtType: play, handler: SpecificEventListener[play]): Unit = js.native
    @JSName("unlisten")
    def unlisten_play(evtType: play, handler: SpecificEventListener[play], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_play(evtType: play, handler: SpecificEventListener[play], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_playing(evtType: playing, handler: SpecificEventListener[playing]): Unit = js.native
    @JSName("unlisten")
    def unlisten_playing(evtType: playing, handler: SpecificEventListener[playing], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_playing(evtType: playing, handler: SpecificEventListener[playing], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointercancel(evtType: pointercancel, handler: SpecificEventListener[pointercancel]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointercancel(evtType: pointercancel, handler: SpecificEventListener[pointercancel], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointercancel(
      evtType: pointercancel,
      handler: SpecificEventListener[pointercancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerdown(evtType: pointerdown, handler: SpecificEventListener[pointerdown]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerdown(evtType: pointerdown, handler: SpecificEventListener[pointerdown], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerdown(
      evtType: pointerdown,
      handler: SpecificEventListener[pointerdown],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerenter(evtType: pointerenter, handler: SpecificEventListener[pointerenter]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerenter(evtType: pointerenter, handler: SpecificEventListener[pointerenter], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerenter(
      evtType: pointerenter,
      handler: SpecificEventListener[pointerenter],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerleave(evtType: pointerleave, handler: SpecificEventListener[pointerleave]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerleave(evtType: pointerleave, handler: SpecificEventListener[pointerleave], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerleave(
      evtType: pointerleave,
      handler: SpecificEventListener[pointerleave],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointermove(evtType: pointermove, handler: SpecificEventListener[pointermove]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointermove(evtType: pointermove, handler: SpecificEventListener[pointermove], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointermove(
      evtType: pointermove,
      handler: SpecificEventListener[pointermove],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerout(evtType: pointerout, handler: SpecificEventListener[pointerout]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerout(evtType: pointerout, handler: SpecificEventListener[pointerout], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerout(evtType: pointerout, handler: SpecificEventListener[pointerout], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerover(evtType: pointerover, handler: SpecificEventListener[pointerover]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerover(evtType: pointerover, handler: SpecificEventListener[pointerover], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerover(
      evtType: pointerover,
      handler: SpecificEventListener[pointerover],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerup(evtType: pointerup, handler: SpecificEventListener[pointerup]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerup(evtType: pointerup, handler: SpecificEventListener[pointerup], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerup(evtType: pointerup, handler: SpecificEventListener[pointerup], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_progress(evtType: progress, handler: SpecificEventListener[progress]): Unit = js.native
    @JSName("unlisten")
    def unlisten_progress(evtType: progress, handler: SpecificEventListener[progress], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_progress(evtType: progress, handler: SpecificEventListener[progress], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_ratechange(evtType: ratechange, handler: SpecificEventListener[ratechange]): Unit = js.native
    @JSName("unlisten")
    def unlisten_ratechange(evtType: ratechange, handler: SpecificEventListener[ratechange], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_ratechange(evtType: ratechange, handler: SpecificEventListener[ratechange], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_reset(evtType: reset, handler: SpecificEventListener[reset]): Unit = js.native
    @JSName("unlisten")
    def unlisten_reset(evtType: reset, handler: SpecificEventListener[reset], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_reset(evtType: reset, handler: SpecificEventListener[reset], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_resize(evtType: resize, handler: SpecificEventListener[resize]): Unit = js.native
    @JSName("unlisten")
    def unlisten_resize(evtType: resize, handler: SpecificEventListener[resize], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_resize(evtType: resize, handler: SpecificEventListener[resize], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_scroll(evtType: scroll, handler: SpecificEventListener[scroll]): Unit = js.native
    @JSName("unlisten")
    def unlisten_scroll(evtType: scroll, handler: SpecificEventListener[scroll], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_scroll(evtType: scroll, handler: SpecificEventListener[scroll], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_securitypolicyviolation(evtType: securitypolicyviolation, handler: SpecificEventListener[securitypolicyviolation]): Unit = js.native
    @JSName("unlisten")
    def unlisten_securitypolicyviolation(
      evtType: securitypolicyviolation,
      handler: SpecificEventListener[securitypolicyviolation],
      options: Boolean
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_securitypolicyviolation(
      evtType: securitypolicyviolation,
      handler: SpecificEventListener[securitypolicyviolation],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_seeked(evtType: seeked, handler: SpecificEventListener[seeked]): Unit = js.native
    @JSName("unlisten")
    def unlisten_seeked(evtType: seeked, handler: SpecificEventListener[seeked], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_seeked(evtType: seeked, handler: SpecificEventListener[seeked], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_seeking(evtType: seeking, handler: SpecificEventListener[seeking]): Unit = js.native
    @JSName("unlisten")
    def unlisten_seeking(evtType: seeking, handler: SpecificEventListener[seeking], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_seeking(evtType: seeking, handler: SpecificEventListener[seeking], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_select(evtType: select, handler: SpecificEventListener[select]): Unit = js.native
    @JSName("unlisten")
    def unlisten_select(evtType: select, handler: SpecificEventListener[select], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_select(evtType: select, handler: SpecificEventListener[select], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_selectionchange(evtType: selectionchange, handler: SpecificEventListener[selectionchange]): Unit = js.native
    @JSName("unlisten")
    def unlisten_selectionchange(evtType: selectionchange, handler: SpecificEventListener[selectionchange], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_selectionchange(
      evtType: selectionchange,
      handler: SpecificEventListener[selectionchange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_selectstart(evtType: selectstart, handler: SpecificEventListener[selectstart]): Unit = js.native
    @JSName("unlisten")
    def unlisten_selectstart(evtType: selectstart, handler: SpecificEventListener[selectstart], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_selectstart(
      evtType: selectstart,
      handler: SpecificEventListener[selectstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_stalled(evtType: stalled, handler: SpecificEventListener[stalled]): Unit = js.native
    @JSName("unlisten")
    def unlisten_stalled(evtType: stalled, handler: SpecificEventListener[stalled], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_stalled(evtType: stalled, handler: SpecificEventListener[stalled], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_submit(evtType: submit, handler: SpecificEventListener[submit]): Unit = js.native
    @JSName("unlisten")
    def unlisten_submit(evtType: submit, handler: SpecificEventListener[submit], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_submit(evtType: submit, handler: SpecificEventListener[submit], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_suspend(evtType: suspend, handler: SpecificEventListener[suspend]): Unit = js.native
    @JSName("unlisten")
    def unlisten_suspend(evtType: suspend, handler: SpecificEventListener[suspend], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_suspend(evtType: suspend, handler: SpecificEventListener[suspend], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_timeupdate(evtType: timeupdate, handler: SpecificEventListener[timeupdate]): Unit = js.native
    @JSName("unlisten")
    def unlisten_timeupdate(evtType: timeupdate, handler: SpecificEventListener[timeupdate], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_timeupdate(evtType: timeupdate, handler: SpecificEventListener[timeupdate], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_toggle(evtType: toggle, handler: SpecificEventListener[toggle]): Unit = js.native
    @JSName("unlisten")
    def unlisten_toggle(evtType: toggle, handler: SpecificEventListener[toggle], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_toggle(evtType: toggle, handler: SpecificEventListener[toggle], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchcancel(evtType: touchcancel, handler: SpecificEventListener[touchcancel]): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchcancel(evtType: touchcancel, handler: SpecificEventListener[touchcancel], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchcancel(
      evtType: touchcancel,
      handler: SpecificEventListener[touchcancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchend(evtType: touchend, handler: SpecificEventListener[touchend]): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchend(evtType: touchend, handler: SpecificEventListener[touchend], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchend(evtType: touchend, handler: SpecificEventListener[touchend], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchmove(evtType: touchmove, handler: SpecificEventListener[touchmove]): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchmove(evtType: touchmove, handler: SpecificEventListener[touchmove], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchmove(evtType: touchmove, handler: SpecificEventListener[touchmove], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchstart(evtType: touchstart, handler: SpecificEventListener[touchstart]): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchstart(evtType: touchstart, handler: SpecificEventListener[touchstart], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchstart(evtType: touchstart, handler: SpecificEventListener[touchstart], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitioncancel(evtType: transitioncancel, handler: SpecificEventListener[transitioncancel]): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitioncancel(evtType: transitioncancel, handler: SpecificEventListener[transitioncancel], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitioncancel(
      evtType: transitioncancel,
      handler: SpecificEventListener[transitioncancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionend(evtType: transitionend, handler: SpecificEventListener[transitionend]): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionend(evtType: transitionend, handler: SpecificEventListener[transitionend], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionend(
      evtType: transitionend,
      handler: SpecificEventListener[transitionend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionrun(evtType: transitionrun, handler: SpecificEventListener[transitionrun]): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionrun(evtType: transitionrun, handler: SpecificEventListener[transitionrun], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionrun(
      evtType: transitionrun,
      handler: SpecificEventListener[transitionrun],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionstart(evtType: transitionstart, handler: SpecificEventListener[transitionstart]): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionstart(evtType: transitionstart, handler: SpecificEventListener[transitionstart], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionstart(
      evtType: transitionstart,
      handler: SpecificEventListener[transitionstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_volumechange(evtType: volumechange, handler: SpecificEventListener[volumechange]): Unit = js.native
    @JSName("unlisten")
    def unlisten_volumechange(evtType: volumechange, handler: SpecificEventListener[volumechange], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_volumechange(
      evtType: volumechange,
      handler: SpecificEventListener[volumechange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_waiting(evtType: waiting, handler: SpecificEventListener[waiting]): Unit = js.native
    @JSName("unlisten")
    def unlisten_waiting(evtType: waiting, handler: SpecificEventListener[waiting], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_waiting(evtType: waiting, handler: SpecificEventListener[waiting], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_wheel(evtType: wheel, handler: SpecificEventListener[wheel]): Unit = js.native
    @JSName("unlisten")
    def unlisten_wheel(evtType: wheel, handler: SpecificEventListener[wheel], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_wheel(evtType: wheel, handler: SpecificEventListener[wheel], options: AddEventListenerOptions): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCComponent extends js.Object {
    
    def attachTo(root: Element): MDCComponent[MDCFoundation[js.Object]] = js.native
  }
  
  @js.native
  class default[FoundationType /* <: MDCFoundation[js.Object] */] protected () extends MDCComponent[FoundationType] {
    def this(root: Element, foundation: FoundationType, args: js.Any*) = this()
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def attachTo(root: Element): MDCComponent[MDCFoundation[js.Object]] = js.native
  }
}
