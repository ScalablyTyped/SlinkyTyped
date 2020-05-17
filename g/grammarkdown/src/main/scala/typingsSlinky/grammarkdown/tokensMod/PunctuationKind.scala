package typingsSlinky.grammarkdown.tokensMod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.AtToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseBraceToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseParenToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ColonColonColonToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ColonColonToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ColonToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CommaToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ElementOfToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.EqualsEqualsToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.EqualsToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ExclamationEqualsToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.GreaterThanToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.LessThanExclamationToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.LessThanMinusToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.NotAnElementOfToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.NotEqualToToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenBraceToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenBracketGreaterThanToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenParenToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.PlusToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.QuestionToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.TildeToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.AtToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenBraceToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseBraceToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenBracketGreaterThanToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.GreaterThanToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenParenToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseParenToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ColonToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ColonColonToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ColonColonColonToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CommaToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.PlusToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.TildeToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.QuestionToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.EqualsToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.EqualsEqualsToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ExclamationEqualsToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.LessThanExclamationToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.LessThanMinusToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.NotEqualToToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ElementOfToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.NotAnElementOfToken
*/
trait PunctuationKind extends TokenKind

object PunctuationKind {
  @scala.inline
  implicit def apply(value: AtToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
  @scala.inline
  implicit def apply(value: CloseBraceToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
  @scala.inline
  implicit def apply(value: CloseBracketToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
  @scala.inline
  implicit def apply(value: CloseParenToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
  @scala.inline
  implicit def apply(value: ColonColonColonToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
  @scala.inline
  implicit def apply(value: ColonColonToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
  @scala.inline
  implicit def apply(value: ColonToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
  @scala.inline
  implicit def apply(value: CommaToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
  @scala.inline
  implicit def apply(value: ElementOfToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
  @scala.inline
  implicit def apply(value: EqualsEqualsToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
  @scala.inline
  implicit def apply(value: EqualsToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
  @scala.inline
  implicit def apply(value: ExclamationEqualsToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
  @scala.inline
  implicit def apply(value: GreaterThanToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
  @scala.inline
  implicit def apply(value: LessThanExclamationToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
  @scala.inline
  implicit def apply(value: LessThanMinusToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
  @scala.inline
  implicit def apply(value: NotAnElementOfToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
  @scala.inline
  implicit def apply(value: NotEqualToToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
  @scala.inline
  implicit def apply(value: OpenBraceToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
  @scala.inline
  implicit def apply(value: OpenBracketGreaterThanToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
  @scala.inline
  implicit def apply(value: OpenBracketToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
  @scala.inline
  implicit def apply(value: OpenParenToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
  @scala.inline
  implicit def apply(value: PlusToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
  @scala.inline
  implicit def apply(value: QuestionToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
  @scala.inline
  implicit def apply(value: TildeToken): PunctuationKind = value.asInstanceOf[PunctuationKind]
}

