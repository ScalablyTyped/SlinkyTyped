package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.nodesMod.ProseFragment
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenBracketGreaterThanToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "ProseAssertion")
@js.native
class ProseAssertion protected ()
  extends typingsSlinky.grammarkdown.nodesMod.ProseAssertion {
  def this(openBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenBracketGreaterThanToken]) = this()
  def this(
    openBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenBracketGreaterThanToken],
    fragments: js.Array[ProseFragment]
  ) = this()
  def this(
    openBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenBracketGreaterThanToken],
    fragments: js.UndefOr[scala.Nothing],
    closeBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenBracketGreaterThanToken],
    fragments: js.Array[ProseFragment],
    closeBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
}

