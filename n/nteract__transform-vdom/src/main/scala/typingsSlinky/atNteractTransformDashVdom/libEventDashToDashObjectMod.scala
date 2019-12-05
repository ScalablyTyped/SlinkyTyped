package typingsSlinky.atNteractTransformDashVdom

import org.scalajs.dom.raw.Event
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
import typingsSlinky.atNteractTransformDashVdom.libEventDashToDashObjectMod.SerializedEvent
import typingsSlinky.react.reactMod.ChangeEvent
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nteract/transform-vdom/lib/event-to-object", JSImport.Namespace)
@js.native
object libEventDashToDashObjectMod extends js.Object {
  def serializeEvent[T](event: SyntheticEvent[Event, T]): SerializedEvent[T] = js.native
  type SerializedEvent[T] = (Partial[
    SyntheticAnimationEvent[T] | ChangeEvent[T] | SyntheticClipboardEvent[T] | SyntheticCompositionEvent[T] | SyntheticKeyboardEvent[T] | SyntheticMouseEvent[T] | SyntheticPointerEvent[T] | SyntheticTouchEvent[T] | SyntheticTransitionEvent[T] | SyntheticUIEvent[T] | SyntheticWheelEvent[T]
  ]) | js.Object
}

