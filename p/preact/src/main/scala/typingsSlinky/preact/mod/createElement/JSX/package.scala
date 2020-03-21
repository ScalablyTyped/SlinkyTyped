package typingsSlinky.preact.mod.createElement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JSX {
  type AnimationEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedAnimationEvent[Target]]
  type ClipboardEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedClipboardEvent[Target]]
  type CompositionEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedCompositionEvent[Target]]
  type DragEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedDragEvent[Target]]
  type Element = typingsSlinky.preact.mod.VNode[js.Any]
  type ElementClass = typingsSlinky.preact.mod.Component[js.Any, js.Any]
  type EventHandler[E /* <: typingsSlinky.preact.TargetedEventEventTargetE */] = js.ThisFunction1[
    /* import warning: importer.ImportType#apply Failed type conversion: E['currentTarget'] */ /* this */ js.Any, 
    /* event */ E, 
    scala.Unit
  ]
  type FocusEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedFocusEvent[Target]]
  type GenericEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[
    typingsSlinky.preact.jsxMod.JSXInternal.TargetedEvent[Target, typingsSlinky.std.Event_]
  ]
  type KeyboardEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedKeyboardEvent[Target]]
  type LibraryManagedAttributes[Component, Props] = Props | (typingsSlinky.preact.jsxMod.Defaultize[Props, js.Any])
  type MouseEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedMouseEvent[Target]]
  type PointerEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedPointerEvent[Target]]
  type TargetedEvent[Target /* <: org.scalajs.dom.raw.EventTarget */, TypedEvent /* <: typingsSlinky.std.Event_ */] = (typingsSlinky.std.Omit[TypedEvent, typingsSlinky.preact.preactStrings.currentTarget]) with typingsSlinky.preact.AnonCurrentTarget[Target]
  type TouchEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedTouchEvent[Target]]
  type TransitionEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedTransitionEvent[Target]]
  type UIEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedUIEvent[Target]]
  type WheelEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedWheelEvent[Target]]
}
