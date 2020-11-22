package typingsSlinky.grammarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object nodesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grammarkdown.nodesMod.PrimarySymbol
    - typingsSlinky.grammarkdown.nodesMod.Assertion
    - typingsSlinky.grammarkdown.nodesMod.PlaceholderSymbol
    - typingsSlinky.grammarkdown.nodesMod.UnicodeCharacterRange
    - typingsSlinky.grammarkdown.nodesMod.ButNotSymbol
    - typingsSlinky.grammarkdown.nodesMod.Prose
    - typingsSlinky.grammarkdown.nodesMod.OneOfSymbol
    - typingsSlinky.grammarkdown.nodesMod.InvalidSymbol
  */
  type LexicalSymbol = typingsSlinky.grammarkdown.nodesMod._LexicalSymbol | typingsSlinky.grammarkdown.nodesMod.PrimarySymbol
  
  type PrimarySymbol = typingsSlinky.grammarkdown.nodesMod.OptionalSymbol
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grammarkdown.nodesMod.ProseFragmentLiteral[typingsSlinky.grammarkdown.tokensMod.ProseFragmentLiteralKind]
    - typingsSlinky.grammarkdown.nodesMod.Terminal
    - typingsSlinky.grammarkdown.nodesMod.Nonterminal
  */
  type ProseFragment = typingsSlinky.grammarkdown.nodesMod._ProseFragment | typingsSlinky.grammarkdown.nodesMod.ProseFragmentLiteral[typingsSlinky.grammarkdown.tokensMod.ProseFragmentLiteralKind]
}
