package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.EmptyKeyword
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "EmptyAssertion")
@js.native
class EmptyAssertion protected ()
  extends typingsSlinky.grammarkdown.distNodesMod.EmptyAssertion {
  def this(
    openBracketToken: typingsSlinky.grammarkdown.distNodesMod.Token[OpenBracketToken],
    emptyKeyword: typingsSlinky.grammarkdown.distNodesMod.Token[EmptyKeyword]
  ) = this()
  def this(
    openBracketToken: typingsSlinky.grammarkdown.distNodesMod.Token[OpenBracketToken],
    emptyKeyword: typingsSlinky.grammarkdown.distNodesMod.Token[EmptyKeyword],
    closeBracketToken: typingsSlinky.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
}

