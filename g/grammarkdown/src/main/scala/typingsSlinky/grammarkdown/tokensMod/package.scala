package typingsSlinky.grammarkdown

import org.scalablytyped.runtime.StObject
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
  
  @scala.inline
  def isAssertionKind(kind: typingsSlinky.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.AssertionKind */ scala.Boolean = typingsSlinky.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isAssertionKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.AssertionKind */ scala.Boolean]
  
  @scala.inline
  def isCommentTriviaKind(kind: typingsSlinky.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.CommentTriviaKind */ scala.Boolean = typingsSlinky.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isCommentTriviaKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.CommentTriviaKind */ scala.Boolean]
  
  @scala.inline
  def isHtmlTriviaKind(kind: typingsSlinky.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.HtmlTriviaKind */ scala.Boolean = typingsSlinky.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isHtmlTriviaKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.HtmlTriviaKind */ scala.Boolean]
  
  @scala.inline
  def isKeywordKind(kind: typingsSlinky.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.KeywordKind */ scala.Boolean = typingsSlinky.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isKeywordKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.KeywordKind */ scala.Boolean]
  
  @scala.inline
  def isLexicalSymbolKind(kind: typingsSlinky.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.LexicalSymbolKind */ scala.Boolean = typingsSlinky.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isLexicalSymbolKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.LexicalSymbolKind */ scala.Boolean]
  
  @scala.inline
  def isMetaElementKind(kind: typingsSlinky.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.MetaElementKind */ scala.Boolean = typingsSlinky.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isMetaElementKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.MetaElementKind */ scala.Boolean]
  
  @scala.inline
  def isOptionalSymbolKind(kind: typingsSlinky.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.OptionalSymbolKind */ scala.Boolean = typingsSlinky.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalSymbolKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.OptionalSymbolKind */ scala.Boolean]
  
  @scala.inline
  def isPrimarySymbolKind(kind: typingsSlinky.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.PrimarySymbolKind */ scala.Boolean = typingsSlinky.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPrimarySymbolKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.PrimarySymbolKind */ scala.Boolean]
  
  @scala.inline
  def isProductionBodyKind(kind: typingsSlinky.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.ProductionBodyKind */ scala.Boolean = typingsSlinky.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isProductionBodyKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.ProductionBodyKind */ scala.Boolean]
  
  @scala.inline
  def isProseFragmentKind(kind: typingsSlinky.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.ProseFragmentKind */ scala.Boolean = typingsSlinky.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isProseFragmentKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.ProseFragmentKind */ scala.Boolean]
  
  @scala.inline
  def isProseFragmentLiteralKind(kind: typingsSlinky.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.ProseFragmentLiteralKind */ scala.Boolean = typingsSlinky.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isProseFragmentLiteralKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.ProseFragmentLiteralKind */ scala.Boolean]
  
  @scala.inline
  def isPunctuationKind(kind: typingsSlinky.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.PunctuationKind */ scala.Boolean = typingsSlinky.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPunctuationKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.PunctuationKind */ scala.Boolean]
  
  @scala.inline
  def isSourceElementKind(kind: typingsSlinky.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.SourceElementKind */ scala.Boolean = typingsSlinky.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isSourceElementKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.SourceElementKind */ scala.Boolean]
  
  @scala.inline
  def isTextContentKind(kind: typingsSlinky.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.TextContentKind */ scala.Boolean = typingsSlinky.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTextContentKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.TextContentKind */ scala.Boolean]
  
  @scala.inline
  def isTokenKind(kind: typingsSlinky.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.TokenKind */ scala.Boolean = typingsSlinky.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTokenKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.TokenKind */ scala.Boolean]
  
  @scala.inline
  def isTriviaKind(kind: typingsSlinky.grammarkdown.tokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.TriviaKind */ scala.Boolean = typingsSlinky.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTriviaKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/tokens.TriviaKind */ scala.Boolean]
  
  @scala.inline
  def stringToToken(text: java.lang.String): js.UndefOr[typingsSlinky.grammarkdown.tokensMod.SyntaxKind] = typingsSlinky.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("stringToToken")(text.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsSlinky.grammarkdown.tokensMod.SyntaxKind]]
  
  @scala.inline
  def tokenToString(kind: java.lang.String): java.lang.String = typingsSlinky.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenToString")(kind.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def tokenToString(kind: java.lang.String, quoted: scala.Boolean): java.lang.String = (typingsSlinky.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenToString")(kind.asInstanceOf[js.Any], quoted.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def tokenToString(kind: typingsSlinky.grammarkdown.tokensMod.SyntaxKind): java.lang.String = typingsSlinky.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenToString")(kind.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def tokenToString(kind: typingsSlinky.grammarkdown.tokensMod.SyntaxKind, quoted: scala.Boolean): java.lang.String = (typingsSlinky.grammarkdown.tokensMod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenToString")(kind.asInstanceOf[js.Any], quoted.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
}
