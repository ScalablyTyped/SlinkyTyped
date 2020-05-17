package typingsSlinky.reactMovable.typesMod

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.MouseEvent[typingsSlinky.std.Element, typingsSlinky.react.mod.NativeMouseEvent]
  - typingsSlinky.react.mod.TouchEvent[typingsSlinky.std.Element]
  - typingsSlinky.react.mod.KeyboardEvent[typingsSlinky.std.Element]
*/
trait TEvent extends js.Object

object TEvent {
  @scala.inline
  implicit def apply(value: SyntheticKeyboardEvent[Element]): TEvent = value.asInstanceOf[TEvent]
  @scala.inline
  implicit def apply(value: SyntheticMouseEvent[Element]): TEvent = value.asInstanceOf[TEvent]
  @scala.inline
  implicit def apply(value: SyntheticTouchEvent[Element]): TEvent = value.asInstanceOf[TEvent]
}

