package typingsSlinky.delegatedDashEvents

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.CustomEvent
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
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.abort
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.animationcancel
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.animationend
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.animationiteration
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.animationstart
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.auxclick
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.blur
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.cancel
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.canplay
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.canplaythrough
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.change
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.click
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.close
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.contextmenu
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.cuechange
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.dblclick
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.drag
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.dragend
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.dragenter
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.dragexit
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.dragleave
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.dragover
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.dragstart
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.drop
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.durationchange
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.emptied
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.ended
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.error
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.focus
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.focusin
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.focusout
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.gotpointercapture
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.input
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.invalid
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.keydown
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.keypress
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.keyup
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.load
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.loadeddata
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.loadedmetadata
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.loadend
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.loadstart
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.lostpointercapture
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.mousedown
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.mouseenter
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.mouseleave
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.mousemove
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.mouseout
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.mouseover
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.mouseup
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.pause
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.play
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.playing
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.pointercancel
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.pointerdown
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.pointerenter
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.pointerleave
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.pointermove
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.pointerout
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.pointerover
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.pointerup
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.progress
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.ratechange
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.reset
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.resize
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.scroll
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.securitypolicyviolation
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.seeked
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.seeking
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.select
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.selectionchange
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.selectstart
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.stalled
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.submit
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.suspend
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.timeupdate
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.toggle
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.touchcancel
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.touchend
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.touchmove
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.touchstart
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.transitioncancel
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.transitionend
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.transitionrun
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.transitionstart
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.volumechange
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.waiting
import typingsSlinky.delegatedDashEvents.delegatedDashEventsStrings.wheel
import typingsSlinky.std.GlobalEventHandlers
import typingsSlinky.std.SecurityPolicyViolationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("delegated-events", JSImport.Namespace)
@js.native
object delegatedDashEventsMod extends js.Object {
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
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ UIEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_abort(
    name: abort,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ UIEvent with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_animationcancel(
    name: animationcancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ AnimationEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_animationcancel(
    name: animationcancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ AnimationEvent with Anon_CurrentTarget, 
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
      /* ev */ AnimationEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_animationend(
    name: animationend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ AnimationEvent with Anon_CurrentTarget, 
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
      /* ev */ AnimationEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_animationiteration(
    name: animationiteration,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ AnimationEvent with Anon_CurrentTarget, 
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
      /* ev */ AnimationEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_animationstart(
    name: animationstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ AnimationEvent with Anon_CurrentTarget, 
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
      /* ev */ MouseEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_auxclick(
    name: auxclick,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with Anon_CurrentTarget, 
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
      /* ev */ FocusEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_blur(
    name: blur,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ FocusEvent with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_cancel(
    name: cancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_cancel(
    name: cancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_canplay(
    name: canplay,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_canplay(
    name: canplay,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_canplaythrough(
    name: canplaythrough,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_canplaythrough(
    name: canplaythrough,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_change(
    name: change,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_change(
    name: change,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_click(
    name: click,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_click(
    name: click,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_close(
    name: close,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_close(
    name: close,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_contextmenu(
    name: contextmenu,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_contextmenu(
    name: contextmenu,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_cuechange(
    name: cuechange,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_cuechange(
    name: cuechange,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_dblclick(
    name: dblclick,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_dblclick(
    name: dblclick,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with Anon_CurrentTarget, 
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
      /* ev */ DragEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_drag(
    name: drag,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with Anon_CurrentTarget, 
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
      /* ev */ DragEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_dragend(
    name: dragend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with Anon_CurrentTarget, 
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
      /* ev */ DragEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_dragenter(
    name: dragenter,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_dragexit(
    name: dragexit,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_dragexit(
    name: dragexit,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_dragleave(
    name: dragleave,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_dragleave(
    name: dragleave,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with Anon_CurrentTarget, 
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
      /* ev */ DragEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_dragover(
    name: dragover,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with Anon_CurrentTarget, 
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
      /* ev */ DragEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_dragstart(
    name: dragstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with Anon_CurrentTarget, 
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
      /* ev */ DragEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_drop(
    name: drop,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_durationchange(
    name: durationchange,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_durationchange(
    name: durationchange,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_emptied(
    name: emptied,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_emptied(
    name: emptied,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_ended(
    name: ended,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_ended(
    name: ended,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_error(
    name: error,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ ErrorEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_error(
    name: error,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ ErrorEvent with Anon_CurrentTarget, 
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
      /* ev */ FocusEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_focus(
    name: focus,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ FocusEvent with Anon_CurrentTarget, 
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
      /* ev */ FocusEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_focusin(
    name: focusin,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ FocusEvent with Anon_CurrentTarget, 
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
      /* ev */ FocusEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_focusout(
    name: focusout,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ FocusEvent with Anon_CurrentTarget, 
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
      /* ev */ PointerEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_gotpointercapture(
    name: gotpointercapture,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_input(
    name: input,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_input(
    name: input,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_invalid(
    name: invalid,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_invalid(
    name: invalid,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_keydown(
    name: keydown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ KeyboardEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_keydown(
    name: keydown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ KeyboardEvent with Anon_CurrentTarget, 
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
      /* ev */ KeyboardEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_keypress(
    name: keypress,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ KeyboardEvent with Anon_CurrentTarget, 
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
      /* ev */ KeyboardEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_keyup(
    name: keyup,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ KeyboardEvent with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_load(
    name: load,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_load(
    name: load,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_loadeddata(
    name: loadeddata,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_loadeddata(
    name: loadeddata,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_loadedmetadata(
    name: loadedmetadata,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_loadedmetadata(
    name: loadedmetadata,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_loadend(
    name: loadend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ ProgressEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_loadend(
    name: loadend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ ProgressEvent with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_loadstart(
    name: loadstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_loadstart(
    name: loadstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_lostpointercapture(
    name: lostpointercapture,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_lostpointercapture(
    name: lostpointercapture,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with Anon_CurrentTarget, 
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
      /* ev */ MouseEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_mousedown(
    name: mousedown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with Anon_CurrentTarget, 
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
      /* ev */ MouseEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_mouseenter(
    name: mouseenter,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with Anon_CurrentTarget, 
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
      /* ev */ MouseEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_mouseleave(
    name: mouseleave,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with Anon_CurrentTarget, 
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
      /* ev */ MouseEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_mousemove(
    name: mousemove,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with Anon_CurrentTarget, 
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
      /* ev */ MouseEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_mouseout(
    name: mouseout,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with Anon_CurrentTarget, 
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
      /* ev */ MouseEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_mouseover(
    name: mouseover,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with Anon_CurrentTarget, 
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
      /* ev */ MouseEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_mouseup(
    name: mouseup,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_pause(
    name: pause,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pause(
    name: pause,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_play(
    name: play,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_play(
    name: play,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_playing(
    name: playing,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_playing(
    name: playing,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_pointercancel(
    name: pointercancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointercancel(
    name: pointercancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with Anon_CurrentTarget, 
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
      /* ev */ PointerEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointerdown(
    name: pointerdown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with Anon_CurrentTarget, 
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
      /* ev */ PointerEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointerenter(
    name: pointerenter,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with Anon_CurrentTarget, 
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
      /* ev */ PointerEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointerleave(
    name: pointerleave,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with Anon_CurrentTarget, 
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
      /* ev */ PointerEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointermove(
    name: pointermove,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with Anon_CurrentTarget, 
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
      /* ev */ PointerEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointerout(
    name: pointerout,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with Anon_CurrentTarget, 
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
      /* ev */ PointerEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointerover(
    name: pointerover,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with Anon_CurrentTarget, 
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
      /* ev */ PointerEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointerup(
    name: pointerup,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with Anon_CurrentTarget, 
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
      /* ev */ ProgressEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_progress(
    name: progress,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ ProgressEvent with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_ratechange(
    name: ratechange,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_ratechange(
    name: ratechange,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_reset(
    name: reset,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_reset(
    name: reset,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_resize(
    name: resize,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ UIEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_resize(
    name: resize,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ UIEvent with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_scroll(
    name: scroll,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_scroll(
    name: scroll,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_securitypolicyviolation(
    name: securitypolicyviolation,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ SecurityPolicyViolationEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_securitypolicyviolation(
    name: securitypolicyviolation,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ SecurityPolicyViolationEvent with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_seeked(
    name: seeked,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_seeked(
    name: seeked,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_seeking(
    name: seeking,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_seeking(
    name: seeking,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_select(
    name: select,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_select(
    name: select,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_selectionchange(
    name: selectionchange,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_selectionchange(
    name: selectionchange,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_selectstart(
    name: selectstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_selectstart(
    name: selectstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_stalled(
    name: stalled,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_stalled(
    name: stalled,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_submit(
    name: submit,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_submit(
    name: submit,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_suspend(
    name: suspend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_suspend(
    name: suspend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_timeupdate(
    name: timeupdate,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_timeupdate(
    name: timeupdate,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_toggle(
    name: toggle,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_toggle(
    name: toggle,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_touchcancel(
    name: touchcancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TouchEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_touchcancel(
    name: touchcancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TouchEvent with Anon_CurrentTarget, 
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
      /* ev */ TouchEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_touchend(
    name: touchend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TouchEvent with Anon_CurrentTarget, 
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
      /* ev */ TouchEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_touchmove(
    name: touchmove,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TouchEvent with Anon_CurrentTarget, 
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
      /* ev */ TouchEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_touchstart(
    name: touchstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TouchEvent with Anon_CurrentTarget, 
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
      /* ev */ TransitionEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_transitioncancel(
    name: transitioncancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TransitionEvent with Anon_CurrentTarget, 
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
      /* ev */ TransitionEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_transitionend(
    name: transitionend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TransitionEvent with Anon_CurrentTarget, 
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
      /* ev */ TransitionEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_transitionrun(
    name: transitionrun,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TransitionEvent with Anon_CurrentTarget, 
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
      /* ev */ TransitionEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_transitionstart(
    name: transitionstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TransitionEvent with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_volumechange(
    name: volumechange,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_volumechange(
    name: volumechange,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_waiting(
    name: waiting,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_waiting(
    name: waiting,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_wheel(
    name: wheel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ WheelEvent with Anon_CurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_wheel(
    name: wheel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ WheelEvent with Anon_CurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  type DelegatedEventListener = js.ThisFunction1[/* this */ Element, /* ev */ CustomEvent with Anon_CurrentTarget, js.Any]
}

