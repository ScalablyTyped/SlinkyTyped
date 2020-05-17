package typingsSlinky.grammarkdown.tokensMod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.Identifier
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.StringLiteral
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.Terminal
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.UnicodeCharacterLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.StringLiteral
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.Terminal
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.UnicodeCharacterLiteral
  - typingsSlinky.grammarkdown.tokensMod.ProseFragmentLiteralKind
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.Identifier
*/
trait TextContentKind extends js.Object

object TextContentKind {
  @scala.inline
  implicit def apply(value: Identifier): TextContentKind = value.asInstanceOf[TextContentKind]
  @scala.inline
  implicit def apply(value: ProseFragmentLiteralKind): TextContentKind = value.asInstanceOf[TextContentKind]
  @scala.inline
  implicit def apply(value: StringLiteral): TextContentKind = value.asInstanceOf[TextContentKind]
  @scala.inline
  implicit def apply(value: Terminal): TextContentKind = value.asInstanceOf[TextContentKind]
  @scala.inline
  implicit def apply(value: UnicodeCharacterLiteral): TextContentKind = value.asInstanceOf[TextContentKind]
}

