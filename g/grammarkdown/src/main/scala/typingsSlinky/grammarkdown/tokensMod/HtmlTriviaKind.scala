package typingsSlinky.grammarkdown.tokensMod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.HtmlCloseTagTrivia
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.HtmlOpenTagTrivia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.HtmlOpenTagTrivia
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.HtmlCloseTagTrivia
*/
trait HtmlTriviaKind extends TriviaKind

object HtmlTriviaKind {
  @scala.inline
  implicit def apply(value: HtmlCloseTagTrivia): HtmlTriviaKind = value.asInstanceOf[HtmlTriviaKind]
  @scala.inline
  implicit def apply(value: HtmlOpenTagTrivia): HtmlTriviaKind = value.asInstanceOf[HtmlTriviaKind]
}

