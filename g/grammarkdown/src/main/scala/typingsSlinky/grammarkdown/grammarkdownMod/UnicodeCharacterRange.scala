package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.ThroughKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "UnicodeCharacterRange")
@js.native
class UnicodeCharacterRange protected ()
  extends LexicalSymbolBase[typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.UnicodeCharacterRange] {
  def this(
    left: UnicodeCharacterLiteral,
    throughKeyword: Token[ThroughKeyword],
    right: UnicodeCharacterLiteral
  ) = this()
  
  val left: UnicodeCharacterLiteral = js.native
  
  val right: UnicodeCharacterLiteral = js.native
  
  val throughKeyword: Token[ThroughKeyword] = js.native
  
  def update(left: UnicodeCharacterLiteral, right: UnicodeCharacterLiteral): UnicodeCharacterRange = js.native
}
