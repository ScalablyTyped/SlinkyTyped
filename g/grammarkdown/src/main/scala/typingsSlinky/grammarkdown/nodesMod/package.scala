package typingsSlinky.grammarkdown

import org.scalablytyped.runtime.StObject
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
  
  @scala.inline
  def forEachChild[T](
    node: js.UndefOr[scala.Nothing],
    cbNode: js.Function1[
      /* node */ typingsSlinky.grammarkdown.nodesMod.Node[typingsSlinky.grammarkdown.tokensMod.SyntaxKind], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[T] = (typingsSlinky.grammarkdown.nodesMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachChild")(node.asInstanceOf[js.Any], cbNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  @scala.inline
  def forEachChild[T](
    node: typingsSlinky.grammarkdown.nodesMod.Node[typingsSlinky.grammarkdown.tokensMod.SyntaxKind],
    cbNode: js.Function1[
      /* node */ typingsSlinky.grammarkdown.nodesMod.Node[typingsSlinky.grammarkdown.tokensMod.SyntaxKind], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[T] = (typingsSlinky.grammarkdown.nodesMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachChild")(node.asInstanceOf[js.Any], cbNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
}
