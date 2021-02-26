package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.CloseBracketToken
import typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.OpenBracketGreaterThanToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "ProseAssertion")
@js.native
class ProseAssertion protected ()
  extends AssertionBase[
      typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.ProseAssertion, 
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
