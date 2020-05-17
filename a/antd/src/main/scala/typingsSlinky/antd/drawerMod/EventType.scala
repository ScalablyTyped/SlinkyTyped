package typingsSlinky.antd.drawerMod

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.KeyboardEvent[typingsSlinky.std.HTMLDivElement]
  - typingsSlinky.react.mod.MouseEvent[
typingsSlinky.std.HTMLDivElement | typingsSlinky.std.HTMLButtonElement, 
typingsSlinky.react.mod.NativeMouseEvent]
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  implicit def apply(value: SyntheticKeyboardEvent[HTMLDivElement]): EventType = value.asInstanceOf[EventType]
  @scala.inline
  implicit def apply(value: SyntheticMouseEvent[HTMLDivElement | HTMLButtonElement]): EventType = value.asInstanceOf[EventType]
}

