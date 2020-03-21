package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.EmptyKeyword
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "EmptyAssertion")
@js.native
class EmptyAssertion protected ()
  extends typingsSlinky.grammarkdown.nodesMod.EmptyAssertion {
  def this(
    openBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenBracketToken],
    emptyKeyword: typingsSlinky.grammarkdown.nodesMod.Token[EmptyKeyword]
  ) = this()
  def this(
    openBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenBracketToken],
    emptyKeyword: typingsSlinky.grammarkdown.nodesMod.Token[EmptyKeyword],
    closeBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
}

