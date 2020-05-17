package typingsSlinky.reactSelect.selectMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.MouseEvent[typingsSlinky.std.HTMLElement, typingsSlinky.react.mod.NativeMouseEvent]
  - typingsSlinky.react.mod.TouchEvent[typingsSlinky.std.HTMLElement]
*/
trait MouseOrTouchEvent extends js.Object

object MouseOrTouchEvent {
  @scala.inline
  implicit def apply(value: SyntheticMouseEvent[HTMLElement]): MouseOrTouchEvent = value.asInstanceOf[MouseOrTouchEvent]
  @scala.inline
  implicit def apply(value: SyntheticTouchEvent[HTMLElement]): MouseOrTouchEvent = value.asInstanceOf[MouseOrTouchEvent]
}

