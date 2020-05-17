package typingsSlinky.ckeditorCkeditor5Engine.mod.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ckeditorCkeditor5Engine.mod.model.Node
  - typingsSlinky.ckeditorCkeditor5Engine.mod.model.TextProxy
  - java.lang.String
  - typingsSlinky.ckeditorCkeditor5Engine.mod.model.NodeList
  - typingsSlinky.ckeditorCkeditor5Engine.mod.model.DocumentFragment
  - typingsSlinky.std.Iterable[js.Any]
*/
trait NodeSet extends js.Object

object NodeSet {
  @scala.inline
  implicit def apply(value: DocumentFragment): NodeSet = value.asInstanceOf[NodeSet]
  @scala.inline
  implicit def apply(value: js.Iterable[js.Any]): NodeSet = value.asInstanceOf[NodeSet]
  @scala.inline
  implicit def apply(value: Node): NodeSet = value.asInstanceOf[NodeSet]
  @scala.inline
  implicit def apply(value: NodeList): NodeSet = value.asInstanceOf[NodeSet]
  @scala.inline
  implicit def apply(value: String): NodeSet = value.asInstanceOf[NodeSet]
  @scala.inline
  implicit def apply(value: TextProxy): NodeSet = value.asInstanceOf[NodeSet]
}

