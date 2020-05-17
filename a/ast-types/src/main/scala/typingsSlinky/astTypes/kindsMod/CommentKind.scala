package typingsSlinky.astTypes.kindsMod

import typingsSlinky.astTypes.namedTypesMod.namedTypes.Block
import typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentBlock
import typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentLine
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Block
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Line
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentBlock
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentLine
*/
trait CommentKind extends js.Object

object CommentKind {
  @scala.inline
  implicit def apply(value: Block): CommentKind = value.asInstanceOf[CommentKind]
  @scala.inline
  implicit def apply(value: CommentBlock): CommentKind = value.asInstanceOf[CommentKind]
  @scala.inline
  implicit def apply(value: CommentLine): CommentKind = value.asInstanceOf[CommentKind]
  @scala.inline
  implicit def apply(value: Line): CommentKind = value.asInstanceOf[CommentKind]
}

