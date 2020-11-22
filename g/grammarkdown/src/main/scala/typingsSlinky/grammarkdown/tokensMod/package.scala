package typingsSlinky.grammarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tokensMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grammarkdown.tokensMod.PrimarySymbolKind
    - typingsSlinky.grammarkdown.tokensMod.AssertionKind
    - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.PlaceholderSymbol
    - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.UnicodeCharacterRange
    - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ButNotSymbol
    - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.Prose
    - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OneOfSymbol
    - typingsSlinky.grammarkdown.tokensMod.SyntaxKind.InvalidSymbol
  */
  type LexicalSymbolKind = typingsSlinky.grammarkdown.tokensMod._LexicalSymbolKind | typingsSlinky.grammarkdown.tokensMod.PrimarySymbolKind
  
  type PrimarySymbolKind = typingsSlinky.grammarkdown.tokensMod.OptionalSymbolKind
}
