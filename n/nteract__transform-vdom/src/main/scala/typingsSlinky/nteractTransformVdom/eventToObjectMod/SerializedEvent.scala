package typingsSlinky.nteractTransformVdom.eventToObjectMod

import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.SyntheticTransitionEvent
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Partial[
typingsSlinky.react.mod.AnimationEvent[T] | typingsSlinky.react.mod.ChangeEvent[T] | typingsSlinky.react.mod.ClipboardEvent[T] | typingsSlinky.react.mod.CompositionEvent[T] | typingsSlinky.react.mod.KeyboardEvent[T] | (typingsSlinky.react.mod.MouseEvent[T, typingsSlinky.react.mod.NativeMouseEvent]) | typingsSlinky.react.mod.PointerEvent[T] | typingsSlinky.react.mod.TouchEvent[T] | typingsSlinky.react.mod.TransitionEvent[T] | (typingsSlinky.react.mod.UIEvent[T, typingsSlinky.react.mod.NativeUIEvent]) | typingsSlinky.react.mod.WheelEvent[T]]
  - js.Object
*/
trait SerializedEvent[T] extends js.Object

object SerializedEvent {
  @scala.inline
  implicit def apply[T](value: js.Object): SerializedEvent[T] = value.asInstanceOf[SerializedEvent[T]]
  @scala.inline
  implicit def apply[T](
    value: Partial[
      SyntheticAnimationEvent[T] | ChangeEvent[T] | SyntheticClipboardEvent[T] | SyntheticCompositionEvent[T] | SyntheticKeyboardEvent[T] | SyntheticMouseEvent[T] | SyntheticPointerEvent[T] | SyntheticTouchEvent[T] | SyntheticTransitionEvent[T] | SyntheticUIEvent[T] | SyntheticWheelEvent[T]
    ]
  ): SerializedEvent[T] = value.asInstanceOf[SerializedEvent[T]]
}

