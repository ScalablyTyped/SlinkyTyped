package typingsSlinky.grammarkdown.tokensMod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.MultiLineCommentTrivia
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.SingleLineCommentTrivia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.SingleLineCommentTrivia
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.MultiLineCommentTrivia
*/
trait CommentTriviaKind extends TriviaKind

object CommentTriviaKind {
  @scala.inline
  implicit def apply(value: MultiLineCommentTrivia): CommentTriviaKind = value.asInstanceOf[CommentTriviaKind]
  @scala.inline
  implicit def apply(value: SingleLineCommentTrivia): CommentTriviaKind = value.asInstanceOf[CommentTriviaKind]
}

