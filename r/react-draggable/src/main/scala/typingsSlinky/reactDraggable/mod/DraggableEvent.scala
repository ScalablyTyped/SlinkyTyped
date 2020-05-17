package typingsSlinky.reactDraggable.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.TouchEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.MouseEvent[
typingsSlinky.std.HTMLElement | typingsSlinky.std.SVGElement, 
typingsSlinky.react.mod.NativeMouseEvent]
  - typingsSlinky.react.mod.TouchEvent[typingsSlinky.std.HTMLElement | typingsSlinky.std.SVGElement]
  - typingsSlinky.std.MouseEvent
  - typingsSlinky.std.TouchEvent
*/
trait DraggableEvent extends js.Object

object DraggableEvent {
  @scala.inline
  implicit def apply(value: MouseEvent): DraggableEvent = value.asInstanceOf[DraggableEvent]
  @scala.inline
  implicit def apply(value: SyntheticMouseEvent[HTMLElement | SVGElement]): DraggableEvent = value.asInstanceOf[DraggableEvent]
  @scala.inline
  implicit def apply(value: SyntheticTouchEvent[HTMLElement | SVGElement]): DraggableEvent = value.asInstanceOf[DraggableEvent]
  @scala.inline
  implicit def apply(value: TouchEvent): DraggableEvent = value.asInstanceOf[DraggableEvent]
}

