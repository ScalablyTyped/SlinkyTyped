package typingsSlinky.prettyFormat.domelementMod

import org.scalajs.dom.raw.Comment
import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Element
  - typingsSlinky.std.Text
  - typingsSlinky.std.Comment
  - typingsSlinky.std.DocumentFragment
*/
trait HandledType extends js.Object

object HandledType {
  @scala.inline
  implicit def apply(value: Comment): HandledType = value.asInstanceOf[HandledType]
  @scala.inline
  implicit def apply(value: DocumentFragment): HandledType = value.asInstanceOf[HandledType]
  @scala.inline
  implicit def apply(value: Element): HandledType = value.asInstanceOf[HandledType]
  @scala.inline
  implicit def apply(value: Text): HandledType = value.asInstanceOf[HandledType]
}

