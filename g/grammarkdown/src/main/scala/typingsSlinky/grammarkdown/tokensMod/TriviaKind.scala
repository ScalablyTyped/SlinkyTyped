package typingsSlinky.grammarkdown.tokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grammarkdown.tokensMod.CommentTriviaKind
  - typingsSlinky.grammarkdown.tokensMod.HtmlTriviaKind
*/
trait TriviaKind extends js.Object

object TriviaKind {
  @scala.inline
  implicit def apply(value: CommentTriviaKind): TriviaKind = value.asInstanceOf[TriviaKind]
  @scala.inline
  implicit def apply(value: HtmlTriviaKind): TriviaKind = value.asInstanceOf[TriviaKind]
}

