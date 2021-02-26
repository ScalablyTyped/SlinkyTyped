package typingsSlinky.grammarkdown.nodesMod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "InvalidAssertion")
@js.native
class InvalidAssertion protected ()
  extends AssertionBase[typingsSlinky.grammarkdown.tokensMod.SyntaxKind.InvalidAssertion, OpenBracketToken]
     with Assertion {
  def this(openBracketToken: Token[OpenBracketToken]) = this()
  def this(openBracketToken: Token[OpenBracketToken], closeBracketToken: Token[CloseBracketToken]) = this()
}
