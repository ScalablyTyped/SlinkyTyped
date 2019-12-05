package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "InvalidAssertion")
@js.native
class InvalidAssertion protected ()
  extends typingsSlinky.grammarkdown.distNodesMod.InvalidAssertion {
  def this(openBracketToken: typingsSlinky.grammarkdown.distNodesMod.Token[OpenBracketToken]) = this()
  def this(
    openBracketToken: typingsSlinky.grammarkdown.distNodesMod.Token[OpenBracketToken],
    closeBracketToken: typingsSlinky.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
}

