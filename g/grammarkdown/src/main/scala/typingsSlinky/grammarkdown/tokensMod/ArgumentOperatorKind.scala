package typingsSlinky.grammarkdown.tokensMod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.PlusToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.QuestionToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.TildeToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.QuestionToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.PlusToken
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.TildeToken
*/
trait ArgumentOperatorKind extends js.Object

object ArgumentOperatorKind {
  @scala.inline
  implicit def apply(value: PlusToken): ArgumentOperatorKind = value.asInstanceOf[ArgumentOperatorKind]
  @scala.inline
  implicit def apply(value: QuestionToken): ArgumentOperatorKind = value.asInstanceOf[ArgumentOperatorKind]
  @scala.inline
  implicit def apply(value: TildeToken): ArgumentOperatorKind = value.asInstanceOf[ArgumentOperatorKind]
}

