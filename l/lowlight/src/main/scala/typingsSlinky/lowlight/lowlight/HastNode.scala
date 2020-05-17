package typingsSlinky.lowlight.lowlight

import typingsSlinky.lowlight.lowlight.AST.Comment
import typingsSlinky.lowlight.lowlight.AST.Doctype
import typingsSlinky.lowlight.lowlight.AST.Element
import typingsSlinky.lowlight.lowlight.AST.Root
import typingsSlinky.lowlight.lowlight.AST.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.lowlight.lowlight.AST.Root
  - typingsSlinky.lowlight.lowlight.AST.Element
  - typingsSlinky.lowlight.lowlight.AST.Doctype
  - typingsSlinky.lowlight.lowlight.AST.Comment
  - typingsSlinky.lowlight.lowlight.AST.Text
*/
trait HastNode extends js.Object

object HastNode {
  @scala.inline
  implicit def apply(value: Comment): HastNode = value.asInstanceOf[HastNode]
  @scala.inline
  implicit def apply(value: Doctype): HastNode = value.asInstanceOf[HastNode]
  @scala.inline
  implicit def apply(value: Element): HastNode = value.asInstanceOf[HastNode]
  @scala.inline
  implicit def apply(value: Root): HastNode = value.asInstanceOf[HastNode]
  @scala.inline
  implicit def apply(value: Text): HastNode = value.asInstanceOf[HastNode]
}

