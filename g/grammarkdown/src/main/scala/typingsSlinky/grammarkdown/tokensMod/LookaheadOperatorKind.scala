package typingsSlinky.grammarkdown.tokensMod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ElementOfToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.EqualsEqualsToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.EqualsToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ExclamationEqualsToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.LessThanExclamationToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.LessThanMinusToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.NotAnElementOfToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.NotEqualToToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.EqualsToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.EqualsEqualsToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ExclamationEqualsToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.NotEqualToToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.LessThanMinusToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ElementOfToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.LessThanExclamationToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.NotAnElementOfToken
*/
trait LookaheadOperatorKind extends js.Object

object LookaheadOperatorKind {
  @scala.inline
  implicit def apply(value: ElementOfToken): LookaheadOperatorKind = value.asInstanceOf[LookaheadOperatorKind]
  @scala.inline
  implicit def apply(value: EqualsEqualsToken): LookaheadOperatorKind = value.asInstanceOf[LookaheadOperatorKind]
  @scala.inline
  implicit def apply(value: EqualsToken): LookaheadOperatorKind = value.asInstanceOf[LookaheadOperatorKind]
  @scala.inline
  implicit def apply(value: ExclamationEqualsToken): LookaheadOperatorKind = value.asInstanceOf[LookaheadOperatorKind]
  @scala.inline
  implicit def apply(value: LessThanExclamationToken): LookaheadOperatorKind = value.asInstanceOf[LookaheadOperatorKind]
  @scala.inline
  implicit def apply(value: LessThanMinusToken): LookaheadOperatorKind = value.asInstanceOf[LookaheadOperatorKind]
  @scala.inline
  implicit def apply(value: NotAnElementOfToken): LookaheadOperatorKind = value.asInstanceOf[LookaheadOperatorKind]
  @scala.inline
  implicit def apply(value: NotEqualToToken): LookaheadOperatorKind = value.asInstanceOf[LookaheadOperatorKind]
}

