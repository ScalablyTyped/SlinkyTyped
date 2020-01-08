package typingsSlinky.preact.preactMod.createElement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JSX {
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

  type AnimationEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.EventHandler[typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedAnimationEvent[Target]]
  type ClipboardEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.EventHandler[typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedClipboardEvent[Target]]
  type CompositionEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.EventHandler[typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedCompositionEvent[Target]]
  type DragEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.EventHandler[typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedDragEvent[Target]]
  type Element = VNode[js.Any]
  type ElementClass = Component[js.Any, js.Any]
  type EventHandler[E /* <: typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedEvent[EventTarget, Event] */] = js.ThisFunction1[
    /* import warning: importer.ImportType#apply Failed type conversion: E['currentTarget'] */ /* this */ js.Any, 
    /* event */ E, 
    Unit
  ]
  type FocusEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.EventHandler[typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedFocusEvent[Target]]
  type GenericEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.EventHandler[typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event]]
  type KeyboardEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.EventHandler[typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedKeyboardEvent[Target]]
  type LibraryManagedAttributes[Component, Props] = Props | (Defaultize[Props, js.Any])
  type MouseEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.EventHandler[typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedMouseEvent[Target]]
  type PointerEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.EventHandler[typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedPointerEvent[Target]]
  type TargetedAnimationEvent[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, AnimationEvent]
  type TargetedClipboardEvent[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, ClipboardEvent]
  type TargetedCompositionEvent[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, CompositionEvent]
  type TargetedDragEvent[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, DragEvent]
  type TargetedEvent[Target /* <: EventTarget */, TypedEvent /* <: Event */] = (Omit[TypedEvent, currentTarget]) with Anon_CurrentTarget[Target]
  type TargetedFocusEvent[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, FocusEvent]
  type TargetedKeyboardEvent[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, KeyboardEvent]
  type TargetedMouseEvent[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, MouseEvent]
  type TargetedPointerEvent[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, PointerEvent]
  type TargetedTouchEvent[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, TouchEvent]
  type TargetedTransitionEvent[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, TransitionEvent]
  type TargetedUIEvent[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, UIEvent]
  type TargetedWheelEvent[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, WheelEvent]
  type TouchEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.EventHandler[typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedTouchEvent[Target]]
  type TransitionEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.EventHandler[typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedTransitionEvent[Target]]
  type UIEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.EventHandler[typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedUIEvent[Target]]
  type WheelEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.srcJsxMod.JSXInternal.EventHandler[typingsSlinky.preact.srcJsxMod.JSXInternal.TargetedWheelEvent[Target]]
}
