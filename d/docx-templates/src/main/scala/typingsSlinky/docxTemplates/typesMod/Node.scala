package typingsSlinky.docxTemplates.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.docxTemplates.typesMod.TextNode
  - typingsSlinky.docxTemplates.typesMod.NonTextNode
*/
trait Node extends js.Object

object Node {
  @scala.inline
  implicit def apply(value: NonTextNode): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: TextNode): Node = value.asInstanceOf[Node]
}

