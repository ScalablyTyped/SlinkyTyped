package typingsSlinky.grammarkdown.tokensMod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.FalseKeyword
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.TrueKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.TrueKeyword
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.FalseKeyword
*/
trait BooleanKind extends js.Object

object BooleanKind {
  @scala.inline
  implicit def apply(value: FalseKeyword): BooleanKind = value.asInstanceOf[BooleanKind]
  @scala.inline
  implicit def apply(value: TrueKeyword): BooleanKind = value.asInstanceOf[BooleanKind]
}

