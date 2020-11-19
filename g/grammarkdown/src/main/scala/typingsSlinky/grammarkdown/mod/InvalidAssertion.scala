package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "InvalidAssertion")
@js.native
class InvalidAssertion protected ()
  extends typingsSlinky.grammarkdown.nodesMod.InvalidAssertion {
  def this(openBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenBracketToken]) = this()
  def this(
    openBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenBracketToken],
    closeBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
}
