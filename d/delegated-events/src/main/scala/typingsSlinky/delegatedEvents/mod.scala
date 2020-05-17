package typingsSlinky.delegatedEvents

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Element
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
import typingsSlinky.delegatedEvents.anon.CurrentTarget
import typingsSlinky.delegatedEvents.anon.CustomEventanycurrentTarg
import typingsSlinky.delegatedEvents.delegatedEventsStrings.abort
import typingsSlinky.delegatedEvents.delegatedEventsStrings.animationcancel
import typingsSlinky.delegatedEvents.delegatedEventsStrings.animationend
import typingsSlinky.delegatedEvents.delegatedEventsStrings.animationiteration
import typingsSlinky.delegatedEvents.delegatedEventsStrings.animationstart
import typingsSlinky.delegatedEvents.delegatedEventsStrings.auxclick
import typingsSlinky.delegatedEvents.delegatedEventsStrings.blur
import typingsSlinky.delegatedEvents.delegatedEventsStrings.cancel
import typingsSlinky.delegatedEvents.delegatedEventsStrings.canplay
import typingsSlinky.delegatedEvents.delegatedEventsStrings.canplaythrough
import typingsSlinky.delegatedEvents.delegatedEventsStrings.change
import typingsSlinky.delegatedEvents.delegatedEventsStrings.click
import typingsSlinky.delegatedEvents.delegatedEventsStrings.close
import typingsSlinky.delegatedEvents.delegatedEventsStrings.contextmenu
import typingsSlinky.delegatedEvents.delegatedEventsStrings.cuechange
import typingsSlinky.delegatedEvents.delegatedEventsStrings.dblclick
import typingsSlinky.delegatedEvents.delegatedEventsStrings.drag
import typingsSlinky.delegatedEvents.delegatedEventsStrings.dragend
import typingsSlinky.delegatedEvents.delegatedEventsStrings.dragenter
import typingsSlinky.delegatedEvents.delegatedEventsStrings.dragexit
import typingsSlinky.delegatedEvents.delegatedEventsStrings.dragleave
import typingsSlinky.delegatedEvents.delegatedEventsStrings.dragover
import typingsSlinky.delegatedEvents.delegatedEventsStrings.dragstart
import typingsSlinky.delegatedEvents.delegatedEventsStrings.drop
import typingsSlinky.delegatedEvents.delegatedEventsStrings.durationchange
import typingsSlinky.delegatedEvents.delegatedEventsStrings.emptied
import typingsSlinky.delegatedEvents.delegatedEventsStrings.ended
import typingsSlinky.delegatedEvents.delegatedEventsStrings.error
import typingsSlinky.delegatedEvents.delegatedEventsStrings.focus
import typingsSlinky.delegatedEvents.delegatedEventsStrings.focusin
import typingsSlinky.delegatedEvents.delegatedEventsStrings.focusout
import typingsSlinky.delegatedEvents.delegatedEventsStrings.gotpointercapture
import typingsSlinky.delegatedEvents.delegatedEventsStrings.input
import typingsSlinky.delegatedEvents.delegatedEventsStrings.invalid
import typingsSlinky.delegatedEvents.delegatedEventsStrings.keydown
import typingsSlinky.delegatedEvents.delegatedEventsStrings.keypress
import typingsSlinky.delegatedEvents.delegatedEventsStrings.keyup
import typingsSlinky.delegatedEvents.delegatedEventsStrings.load
import typingsSlinky.delegatedEvents.delegatedEventsStrings.loadeddata
import typingsSlinky.delegatedEvents.delegatedEventsStrings.loadedmetadata
import typingsSlinky.delegatedEvents.delegatedEventsStrings.loadstart
import typingsSlinky.delegatedEvents.delegatedEventsStrings.lostpointercapture
import typingsSlinky.delegatedEvents.delegatedEventsStrings.mousedown
import typingsSlinky.delegatedEvents.delegatedEventsStrings.mouseenter
import typingsSlinky.delegatedEvents.delegatedEventsStrings.mouseleave
import typingsSlinky.delegatedEvents.delegatedEventsStrings.mousemove
import typingsSlinky.delegatedEvents.delegatedEventsStrings.mouseout
import typingsSlinky.delegatedEvents.delegatedEventsStrings.mouseover
import typingsSlinky.delegatedEvents.delegatedEventsStrings.mouseup
import typingsSlinky.delegatedEvents.delegatedEventsStrings.pause
import typingsSlinky.delegatedEvents.delegatedEventsStrings.play
import typingsSlinky.delegatedEvents.delegatedEventsStrings.playing
import typingsSlinky.delegatedEvents.delegatedEventsStrings.pointercancel
import typingsSlinky.delegatedEvents.delegatedEventsStrings.pointerdown
import typingsSlinky.delegatedEvents.delegatedEventsStrings.pointerenter
import typingsSlinky.delegatedEvents.delegatedEventsStrings.pointerleave
import typingsSlinky.delegatedEvents.delegatedEventsStrings.pointermove
import typingsSlinky.delegatedEvents.delegatedEventsStrings.pointerout
import typingsSlinky.delegatedEvents.delegatedEventsStrings.pointerover
import typingsSlinky.delegatedEvents.delegatedEventsStrings.pointerup
import typingsSlinky.delegatedEvents.delegatedEventsStrings.progress
import typingsSlinky.delegatedEvents.delegatedEventsStrings.ratechange
import typingsSlinky.delegatedEvents.delegatedEventsStrings.reset
import typingsSlinky.delegatedEvents.delegatedEventsStrings.resize
import typingsSlinky.delegatedEvents.delegatedEventsStrings.scroll
import typingsSlinky.delegatedEvents.delegatedEventsStrings.securitypolicyviolation
import typingsSlinky.delegatedEvents.delegatedEventsStrings.seeked
import typingsSlinky.delegatedEvents.delegatedEventsStrings.seeking
import typingsSlinky.delegatedEvents.delegatedEventsStrings.select
import typingsSlinky.delegatedEvents.delegatedEventsStrings.selectionchange
import typingsSlinky.delegatedEvents.delegatedEventsStrings.selectstart
import typingsSlinky.delegatedEvents.delegatedEventsStrings.stalled
import typingsSlinky.delegatedEvents.delegatedEventsStrings.submit
import typingsSlinky.delegatedEvents.delegatedEventsStrings.suspend
import typingsSlinky.delegatedEvents.delegatedEventsStrings.timeupdate
import typingsSlinky.delegatedEvents.delegatedEventsStrings.toggle
import typingsSlinky.delegatedEvents.delegatedEventsStrings.touchcancel
import typingsSlinky.delegatedEvents.delegatedEventsStrings.touchend
import typingsSlinky.delegatedEvents.delegatedEventsStrings.touchmove
import typingsSlinky.delegatedEvents.delegatedEventsStrings.touchstart
import typingsSlinky.delegatedEvents.delegatedEventsStrings.transitioncancel
import typingsSlinky.delegatedEvents.delegatedEventsStrings.transitionend
import typingsSlinky.delegatedEvents.delegatedEventsStrings.transitionrun
import typingsSlinky.delegatedEvents.delegatedEventsStrings.transitionstart
import typingsSlinky.delegatedEvents.delegatedEventsStrings.volumechange
import typingsSlinky.delegatedEvents.delegatedEventsStrings.waiting
import typingsSlinky.delegatedEvents.delegatedEventsStrings.wheel
import typingsSlinky.std.GlobalEventHandlers
import typingsSlinky.std.SecurityPolicyViolationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("delegated-events", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def fire(target: Element, name: String): Boolean = js.native
  def fire(target: Element, name: String, detail: js.Any): Boolean = js.native
  def off(name: String, selector: String, listener: DelegatedEventListener): Unit = js.native
  def off(name: String, selector: String, listener: DelegatedEventListener, options: EventListenerOptions): Unit = js.native
  def on(name: String, selector: String, listener: DelegatedEventListener): Unit = js.native
  def on(name: String, selector: String, listener: DelegatedEventListener, options: EventListenerOptions): Unit = js.native
  @JSName("on")
  def on_abort(
    name: abort,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ UIEvent with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_abort(
    name: abort,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ UIEvent with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_animationcancel(
    name: animationcancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ AnimationEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_animationcancel(
    name: animationcancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ AnimationEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_animationend(
    name: animationend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ AnimationEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_animationend(
    name: animationend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ AnimationEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_animationiteration(
    name: animationiteration,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ AnimationEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_animationiteration(
    name: animationiteration,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ AnimationEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_animationstart(
    name: animationstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ AnimationEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_animationstart(
    name: animationstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ AnimationEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_auxclick(
    name: auxclick,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_auxclick(
    name: auxclick,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_blur(
    name: blur,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ FocusEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_blur(
    name: blur,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ FocusEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_cancel(
    name: cancel,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_cancel(
    name: cancel,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_canplay(
    name: canplay,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_canplay(
    name: canplay,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_canplaythrough(
    name: canplaythrough,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_canplaythrough(
    name: canplaythrough,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_change(
    name: change,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_change(
    name: change,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_click(
    name: click,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_click(
    name: click,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_close(
    name: close,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_close(
    name: close,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_contextmenu(
    name: contextmenu,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_contextmenu(
    name: contextmenu,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_cuechange(
    name: cuechange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_cuechange(
    name: cuechange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_dblclick(
    name: dblclick,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_dblclick(
    name: dblclick,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_drag(
    name: drag,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_drag(
    name: drag,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_dragend(
    name: dragend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_dragend(
    name: dragend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_dragenter(
    name: dragenter,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_dragenter(
    name: dragenter,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_dragexit(
    name: dragexit,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_dragexit(
    name: dragexit,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_dragleave(
    name: dragleave,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_dragleave(
    name: dragleave,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_dragover(
    name: dragover,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_dragover(
    name: dragover,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_dragstart(
    name: dragstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_dragstart(
    name: dragstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_drop(
    name: drop,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_drop(
    name: drop,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_durationchange(
    name: durationchange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_durationchange(
    name: durationchange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_emptied(
    name: emptied,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_emptied(
    name: emptied,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_ended(
    name: ended,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_ended(
    name: ended,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_error(
    name: error,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ ErrorEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_error(
    name: error,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ ErrorEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_focus(
    name: focus,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ FocusEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_focus(
    name: focus,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ FocusEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_focusin(
    name: focusin,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ FocusEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_focusin(
    name: focusin,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ FocusEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_focusout(
    name: focusout,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ FocusEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_focusout(
    name: focusout,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ FocusEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_gotpointercapture(
    name: gotpointercapture,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_gotpointercapture(
    name: gotpointercapture,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_input(
    name: input,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_input(
    name: input,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_invalid(
    name: invalid,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_invalid(
    name: invalid,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_keydown(
    name: keydown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ KeyboardEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_keydown(
    name: keydown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ KeyboardEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_keypress(
    name: keypress,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ KeyboardEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_keypress(
    name: keypress,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ KeyboardEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_keyup(
    name: keyup,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ KeyboardEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_keyup(
    name: keyup,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ KeyboardEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_load(
    name: load,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_load(
    name: load,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_loadeddata(
    name: loadeddata,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_loadeddata(
    name: loadeddata,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_loadedmetadata(
    name: loadedmetadata,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_loadedmetadata(
    name: loadedmetadata,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_loadstart(
    name: loadstart,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_loadstart(
    name: loadstart,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_lostpointercapture(
    name: lostpointercapture,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_lostpointercapture(
    name: lostpointercapture,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_mousedown(
    name: mousedown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_mousedown(
    name: mousedown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_mouseenter(
    name: mouseenter,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_mouseenter(
    name: mouseenter,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_mouseleave(
    name: mouseleave,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_mouseleave(
    name: mouseleave,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_mousemove(
    name: mousemove,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_mousemove(
    name: mousemove,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_mouseout(
    name: mouseout,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_mouseout(
    name: mouseout,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_mouseover(
    name: mouseover,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_mouseover(
    name: mouseover,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_mouseup(
    name: mouseup,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_mouseup(
    name: mouseup,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_pause(
    name: pause,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_pause(
    name: pause,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_play(
    name: play,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_play(
    name: play,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_playing(
    name: playing,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_playing(
    name: playing,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_pointercancel(
    name: pointercancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointercancel(
    name: pointercancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_pointerdown(
    name: pointerdown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointerdown(
    name: pointerdown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_pointerenter(
    name: pointerenter,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointerenter(
    name: pointerenter,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_pointerleave(
    name: pointerleave,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointerleave(
    name: pointerleave,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_pointermove(
    name: pointermove,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointermove(
    name: pointermove,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_pointerout(
    name: pointerout,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointerout(
    name: pointerout,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_pointerover(
    name: pointerover,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointerover(
    name: pointerover,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_pointerup(
    name: pointerup,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointerup(
    name: pointerup,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_progress(
    name: progress,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ ProgressEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_progress(
    name: progress,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ ProgressEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_ratechange(
    name: ratechange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_ratechange(
    name: ratechange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_reset(
    name: reset,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_reset(
    name: reset,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_resize(
    name: resize,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ UIEvent with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_resize(
    name: resize,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ UIEvent with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_scroll(
    name: scroll,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_scroll(
    name: scroll,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_securitypolicyviolation(
    name: securitypolicyviolation,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ SecurityPolicyViolationEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_securitypolicyviolation(
    name: securitypolicyviolation,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ SecurityPolicyViolationEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_seeked(
    name: seeked,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_seeked(
    name: seeked,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_seeking(
    name: seeking,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_seeking(
    name: seeking,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_select(
    name: select,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_select(
    name: select,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_selectionchange(
    name: selectionchange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_selectionchange(
    name: selectionchange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_selectstart(
    name: selectstart,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_selectstart(
    name: selectstart,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_stalled(
    name: stalled,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_stalled(
    name: stalled,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_submit(
    name: submit,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_submit(
    name: submit,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_suspend(
    name: suspend,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_suspend(
    name: suspend,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_timeupdate(
    name: timeupdate,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_timeupdate(
    name: timeupdate,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_toggle(
    name: toggle,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_toggle(
    name: toggle,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_touchcancel(
    name: touchcancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TouchEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_touchcancel(
    name: touchcancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TouchEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_touchend(
    name: touchend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TouchEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_touchend(
    name: touchend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TouchEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_touchmove(
    name: touchmove,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TouchEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_touchmove(
    name: touchmove,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TouchEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_touchstart(
    name: touchstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TouchEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_touchstart(
    name: touchstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TouchEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_transitioncancel(
    name: transitioncancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TransitionEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_transitioncancel(
    name: transitioncancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TransitionEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_transitionend(
    name: transitionend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TransitionEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_transitionend(
    name: transitionend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TransitionEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_transitionrun(
    name: transitionrun,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TransitionEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_transitionrun(
    name: transitionrun,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TransitionEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_transitionstart(
    name: transitionstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TransitionEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_transitionstart(
    name: transitionstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TransitionEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_volumechange(
    name: volumechange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_volumechange(
    name: volumechange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_waiting(
    name: waiting,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _]
  ): Unit = js.native
  @JSName("on")
  def on_waiting(
    name: waiting,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers with Element, /* ev */ Event with CurrentTarget, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_wheel(
    name: wheel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ WheelEvent with CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_wheel(
    name: wheel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ WheelEvent with CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  type DelegatedEventListener = js.ThisFunction1[/* this */ Element, /* ev */ CustomEventanycurrentTarg, js.Any]
}

