package typingsSlinky.grammarkdown.nodesMod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.EmptyKeyword
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "EmptyAssertion")
@js.native
class EmptyAssertion protected ()
  extends AssertionBase[typingsSlinky.grammarkdown.tokensMod.SyntaxKind.EmptyAssertion, OpenBracketToken]
     with Assertion {
  def this(openBracketToken: Token[OpenBracketToken], emptyKeyword: Token[EmptyKeyword]) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    emptyKeyword: Token[EmptyKeyword],
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  
  val emptyKeyword: Token[EmptyKeyword] = js.native
}
