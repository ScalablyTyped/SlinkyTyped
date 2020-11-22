package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.CloseBracketToken
import typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.EmptyKeyword
import typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "EmptyAssertion")
@js.native
class EmptyAssertion protected ()
  extends AssertionBase[
      typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.EmptyAssertion, 
      OpenBracketToken
    ] {
  def this(openBracketToken: Token[OpenBracketToken], emptyKeyword: Token[EmptyKeyword]) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    emptyKeyword: Token[EmptyKeyword],
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  
  val emptyKeyword: Token[EmptyKeyword] = js.native
}
