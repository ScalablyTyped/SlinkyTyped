package typingsSlinky.grammarkdown.nodesMod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.GreaterThanToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "Prose")
@js.native
class Prose protected ()
  extends Node[typingsSlinky.grammarkdown.tokensMod.SyntaxKind.Prose]
     with _LexicalSymbol {
  def this(greaterThanToken: Token[GreaterThanToken]) = this()
  def this(greaterThanToken: Token[GreaterThanToken], fragments: js.Array[ProseFragment]) = this()
  
  val fragments: js.UndefOr[js.Array[ProseFragment]] = js.native
  
  val greaterThanToken: Token[GreaterThanToken] = js.native
  
  def update(): Prose = js.native
  def update(fragments: js.Array[ProseFragment]): Prose = js.native
}
