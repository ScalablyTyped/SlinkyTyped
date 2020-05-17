package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.CommentBlock
  - typingsSlinky.babelTypes.mod.CommentLine
*/
trait Comment extends js.Object

object Comment {
  @scala.inline
  implicit def apply(value: CommentBlock): Comment = value.asInstanceOf[Comment]
  @scala.inline
  implicit def apply(value: CommentLine): Comment = value.asInstanceOf[Comment]
}

