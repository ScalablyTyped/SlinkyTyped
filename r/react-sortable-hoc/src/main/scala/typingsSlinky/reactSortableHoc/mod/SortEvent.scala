package typingsSlinky.reactSortableHoc.mod

import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.MouseEvent[js.Any, typingsSlinky.react.mod.NativeMouseEvent]
  - typingsSlinky.react.mod.TouchEvent[js.Any]
*/
trait SortEvent extends js.Object

object SortEvent {
  @scala.inline
  implicit def apply(value: SyntheticMouseEvent[js.Any]): SortEvent = value.asInstanceOf[SortEvent]
  @scala.inline
  implicit def apply(value: SyntheticTouchEvent[js.Any]): SortEvent = value.asInstanceOf[SortEvent]
}

