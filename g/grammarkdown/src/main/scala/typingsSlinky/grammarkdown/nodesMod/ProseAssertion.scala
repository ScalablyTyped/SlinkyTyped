package typingsSlinky.grammarkdown.nodesMod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenBracketGreaterThanToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "ProseAssertion")
@js.native
class ProseAssertion protected ()
  extends AssertionBase[
      typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ProseAssertion, 
      OpenBracketGreaterThanToken
    ] {
  def this(openBracketToken: Token[OpenBracketGreaterThanToken]) = this()
  def this(openBracketToken: Token[OpenBracketGreaterThanToken], fragments: js.Array[ProseFragment]) = this()
  def this(
    openBracketToken: Token[OpenBracketGreaterThanToken],
    fragments: js.UndefOr[scala.Nothing],
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketGreaterThanToken],
    fragments: js.Array[ProseFragment],
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  
  val fragments: js.UndefOr[js.Array[ProseFragment]] = js.native
  
  def update(): ProseAssertion = js.native
  def update(fragments: js.Array[ProseFragment]): ProseAssertion = js.native
}
