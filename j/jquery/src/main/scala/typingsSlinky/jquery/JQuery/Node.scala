package typingsSlinky.jquery.JQuery

import org.scalajs.dom.raw.Comment
import org.scalajs.dom.raw.Document
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
  - typingsSlinky.std.Document
  - typingsSlinky.std.DocumentFragment
*/
trait Node extends js.Object

object Node {
  @scala.inline
  implicit def apply(value: Comment): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Document): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: DocumentFragment): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Element): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Text): Node = value.asInstanceOf[Node]
}

