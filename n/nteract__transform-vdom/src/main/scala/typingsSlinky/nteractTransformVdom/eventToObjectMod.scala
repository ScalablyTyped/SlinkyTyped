package typingsSlinky.nteractTransformVdom

import slinky.core.SyntheticEvent
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
import typingsSlinky.std.Event_
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nteract/transform-vdom/lib/event-to-object", JSImport.Namespace)
@js.native
object eventToObjectMod extends js.Object {
  def serializeEvent[T](event: SyntheticEvent[Event_, T]): SerializedEvent[T] = js.native
  type SerializedEvent[T] = (Partial[
    SyntheticAnimationEvent[T] | ChangeEvent[T] | SyntheticClipboardEvent[T] | SyntheticCompositionEvent[T] | SyntheticKeyboardEvent[T] | SyntheticMouseEvent[T] | SyntheticPointerEvent[T] | SyntheticTouchEvent[T] | SyntheticTransitionEvent[T] | SyntheticUIEvent[T] | SyntheticWheelEvent[T]
  ]) | js.Object
}

