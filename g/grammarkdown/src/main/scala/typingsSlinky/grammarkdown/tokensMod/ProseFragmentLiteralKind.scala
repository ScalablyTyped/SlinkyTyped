package typingsSlinky.grammarkdown.tokensMod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ProseFull
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ProseHead
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ProseMiddle
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ProseTail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ProseFull
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ProseHead
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ProseMiddle
  - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ProseTail
*/
trait ProseFragmentLiteralKind extends TextContentKind

object ProseFragmentLiteralKind {
  @scala.inline
  implicit def apply(value: ProseFull): ProseFragmentLiteralKind = value.asInstanceOf[ProseFragmentLiteralKind]
  @scala.inline
  implicit def apply(value: ProseHead): ProseFragmentLiteralKind = value.asInstanceOf[ProseFragmentLiteralKind]
  @scala.inline
  implicit def apply(value: ProseMiddle): ProseFragmentLiteralKind = value.asInstanceOf[ProseFragmentLiteralKind]
  @scala.inline
  implicit def apply(value: ProseTail): ProseFragmentLiteralKind = value.asInstanceOf[ProseFragmentLiteralKind]
}

