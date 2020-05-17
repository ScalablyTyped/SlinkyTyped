package typingsSlinky.blueprintjsTable.rectMod

import org.scalajs.dom.raw.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.blueprintjsTable.rectMod.Rect
  - typingsSlinky.std.ClientRect
*/
trait AnyRect extends js.Object

object AnyRect {
  @scala.inline
  implicit def apply(value: ClientRect): AnyRect = value.asInstanceOf[AnyRect]
  @scala.inline
  implicit def apply(value: Rect): AnyRect = value.asInstanceOf[AnyRect]
}

