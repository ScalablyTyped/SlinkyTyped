package typingsSlinky.reactDashDraggable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashDraggableMod {
  import org.scalajs.dom.raw.HTMLElement
  import org.scalajs.dom.raw.MouseEvent
  import org.scalajs.dom.raw.SVGElement
  import org.scalajs.dom.raw.TouchEvent
  import slinky.core.ReactComponentClass
  import slinky.web.SyntheticMouseEvent
  import slinky.web.SyntheticTouchEvent
  import typingsSlinky.reactDashDraggable.reactDashDraggableNumbers.`false`
  import typingsSlinky.std.Partial

  type Draggable = ReactComponentClass[Partial[DraggableProps]]
  type DraggableEvent = (SyntheticMouseEvent[HTMLElement | SVGElement]) | (SyntheticTouchEvent[HTMLElement | SVGElement]) | MouseEvent | TouchEvent
  type DraggableEventHandler = js.Function2[/* e */ DraggableEvent, /* data */ DraggableData, Unit | `false`]
}
