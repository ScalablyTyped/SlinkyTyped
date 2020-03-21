package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.nodesMod.AssertionKind
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenBracketGreaterThanToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "AssertionBase")
@js.native
abstract class AssertionBase[TKind /* <: AssertionKind */, TBracket /* <: OpenBracketToken | OpenBracketGreaterThanToken */] protected ()
  extends typingsSlinky.grammarkdown.nodesMod.AssertionBase[TKind, TBracket] {
  def this(kind: TKind, openBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[TBracket]) = this()
  def this(
    kind: TKind,
    openBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[TBracket],
    closeBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
}

