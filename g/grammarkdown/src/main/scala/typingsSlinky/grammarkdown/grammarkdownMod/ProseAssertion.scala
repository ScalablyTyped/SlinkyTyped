package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.distNodesMod.ProseFragment
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.OpenBracketGreaterThanToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "ProseAssertion")
@js.native
class ProseAssertion protected ()
  extends typingsSlinky.grammarkdown.distNodesMod.ProseAssertion {
  def this(openBracketToken: typingsSlinky.grammarkdown.distNodesMod.Token[OpenBracketGreaterThanToken]) = this()
  def this(
    openBracketToken: typingsSlinky.grammarkdown.distNodesMod.Token[OpenBracketGreaterThanToken],
    fragments: js.Array[ProseFragment]
  ) = this()
  def this(
    openBracketToken: typingsSlinky.grammarkdown.distNodesMod.Token[OpenBracketGreaterThanToken],
    fragments: js.UndefOr[scala.Nothing],
    closeBracketToken: typingsSlinky.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: typingsSlinky.grammarkdown.distNodesMod.Token[OpenBracketGreaterThanToken],
    fragments: js.Array[ProseFragment],
    closeBracketToken: typingsSlinky.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
}

