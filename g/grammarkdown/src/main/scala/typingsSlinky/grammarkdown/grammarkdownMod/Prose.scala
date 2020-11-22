package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.GreaterThanToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "Prose")
@js.native
class Prose protected ()
  extends Node2[typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.Prose] {
  def this(greaterThanToken: Token[GreaterThanToken]) = this()
  def this(greaterThanToken: Token[GreaterThanToken], fragments: js.Array[ProseFragment]) = this()
  
  val fragments: js.UndefOr[js.Array[ProseFragment]] = js.native
  
  val greaterThanToken: Token[GreaterThanToken] = js.native
  
  def update(): Prose = js.native
  def update(fragments: js.Array[ProseFragment]): Prose = js.native
}
