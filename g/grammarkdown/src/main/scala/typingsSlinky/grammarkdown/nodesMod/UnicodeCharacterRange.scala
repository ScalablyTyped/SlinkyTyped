package typingsSlinky.grammarkdown.nodesMod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ThroughKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "UnicodeCharacterRange")
@js.native
class UnicodeCharacterRange protected ()
  extends LexicalSymbolBase[typingsSlinky.grammarkdown.tokensMod.SyntaxKind.UnicodeCharacterRange]
     with _LexicalSymbol {
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
