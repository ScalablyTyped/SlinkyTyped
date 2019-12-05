package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.distNodesMod.AssertionKind
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.OpenBracketGreaterThanToken
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "AssertionBase")
@js.native
abstract class AssertionBase[TKind /* <: AssertionKind */, TBracket /* <: OpenBracketToken | OpenBracketGreaterThanToken */] protected ()
  extends typingsSlinky.grammarkdown.distNodesMod.AssertionBase[TKind, TBracket] {
  def this(kind: TKind, openBracketToken: typingsSlinky.grammarkdown.distNodesMod.Token[TBracket]) = this()
  def this(
    kind: TKind,
    openBracketToken: typingsSlinky.grammarkdown.distNodesMod.Token[TBracket],
    closeBracketToken: typingsSlinky.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
}

