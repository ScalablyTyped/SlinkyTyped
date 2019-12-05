package typingsSlinky.preact.srcJsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JSXInternal {
  import org.scalajs.dom.raw.AnimationEvent
  import org.scalajs.dom.raw.ClipboardEvent
  import org.scalajs.dom.raw.CompositionEvent
  import org.scalajs.dom.raw.DragEvent
  import org.scalajs.dom.raw.Event
  import org.scalajs.dom.raw.EventTarget
  import org.scalajs.dom.raw.FocusEvent
  import org.scalajs.dom.raw.KeyboardEvent
  import org.scalajs.dom.raw.MouseEvent
  import org.scalajs.dom.raw.PointerEvent
  import org.scalajs.dom.raw.TouchEvent
  import org.scalajs.dom.raw.TransitionEvent
  import org.scalajs.dom.raw.UIEvent
  import org.scalajs.dom.raw.WheelEvent
  import typingsSlinky.preact.Anon_CurrentTarget
  import typingsSlinky.preact.preactMod.Component
  import typingsSlinky.preact.preactMod.VNode
  import typingsSlinky.preact.preactStrings.currentTarget
  import typingsSlinky.preact.srcJsxMod.Defaultize
  import typingsSlinky.std.Omit

  type AnimationEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedAnimationEvent[Target]]
  type ClipboardEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedClipboardEvent[Target]]
  type CompositionEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedCompositionEvent[Target]]
  type DragEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedDragEvent[Target]]
  type Element = VNode[js.Any]
  type ElementClass = Component[js.Any, js.Any]
  type EventHandler[E /* <: TargetedEvent[EventTarget, Event] */] = js.Function1[/* event */ E, Unit]
  type FocusEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedFocusEvent[Target]]
  type GenericEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedEvent[Target, Event]]
  type KeyboardEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedKeyboardEvent[Target]]
  type LibraryManagedAttributes[Component, Props] = Props | (Defaultize[Props, js.Any])
  type MouseEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedMouseEvent[Target]]
  type PointerEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedPointerEvent[Target]]
  type TargetedAnimationEvent[Target /* <: EventTarget */] = TargetedEvent[Target, AnimationEvent]
  type TargetedClipboardEvent[Target /* <: EventTarget */] = TargetedEvent[Target, ClipboardEvent]
  type TargetedCompositionEvent[Target /* <: EventTarget */] = TargetedEvent[Target, CompositionEvent]
  type TargetedDragEvent[Target /* <: EventTarget */] = TargetedEvent[Target, DragEvent]
  type TargetedEvent[Target /* <: EventTarget */, TypedEvent /* <: Event */] = (Omit[TypedEvent, currentTarget]) with Anon_CurrentTarget[Target]
  type TargetedFocusEvent[Target /* <: EventTarget */] = TargetedEvent[Target, FocusEvent]
  type TargetedKeyboardEvent[Target /* <: EventTarget */] = TargetedEvent[Target, KeyboardEvent]
  type TargetedMouseEvent[Target /* <: EventTarget */] = TargetedEvent[Target, MouseEvent]
  type TargetedPointerEvent[Target /* <: EventTarget */] = TargetedEvent[Target, PointerEvent]
  type TargetedTouchEvent[Target /* <: EventTarget */] = TargetedEvent[Target, TouchEvent]
  type TargetedTransitionEvent[Target /* <: EventTarget */] = TargetedEvent[Target, TransitionEvent]
  type TargetedUIEvent[Target /* <: EventTarget */] = TargetedEvent[Target, UIEvent]
  type TargetedWheelEvent[Target /* <: EventTarget */] = TargetedEvent[Target, WheelEvent]
  type TouchEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedTouchEvent[Target]]
  type TransitionEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedTransitionEvent[Target]]
  type UIEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedUIEvent[Target]]
  type WheelEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedWheelEvent[Target]]
}
