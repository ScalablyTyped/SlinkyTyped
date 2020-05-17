package typingsSlinky.grammarkdown.tokensMod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.EndOfFileToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.EndOfFileToken
  - typingsSlinky.grammarkdown.tokensMod.PunctuationKind
  - typingsSlinky.grammarkdown.tokensMod.KeywordKind
*/
trait TokenKind extends js.Object

object TokenKind {
  @scala.inline
  implicit def apply(value: EndOfFileToken): TokenKind = value.asInstanceOf[TokenKind]
  @scala.inline
  implicit def apply(value: KeywordKind): TokenKind = value.asInstanceOf[TokenKind]
  @scala.inline
  implicit def apply(value: PunctuationKind): TokenKind = value.asInstanceOf[TokenKind]
}

