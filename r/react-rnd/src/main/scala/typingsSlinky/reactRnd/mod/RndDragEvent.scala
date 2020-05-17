package typingsSlinky.reactRnd.mod

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
trait RndDragEvent extends js.Object

object RndDragEvent {
  @scala.inline
  implicit def apply(value: MouseEvent): RndDragEvent = value.asInstanceOf[RndDragEvent]
  @scala.inline
  implicit def apply(value: SyntheticMouseEvent[HTMLElement | SVGElement]): RndDragEvent = value.asInstanceOf[RndDragEvent]
  @scala.inline
  implicit def apply(value: SyntheticTouchEvent[HTMLElement | SVGElement]): RndDragEvent = value.asInstanceOf[RndDragEvent]
  @scala.inline
  implicit def apply(value: TouchEvent): RndDragEvent = value.asInstanceOf[RndDragEvent]
}

