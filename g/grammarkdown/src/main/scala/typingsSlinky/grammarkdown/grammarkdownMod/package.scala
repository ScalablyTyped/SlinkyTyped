package typingsSlinky.grammarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object grammarkdownMod {
  
  type Assertion = typingsSlinky.grammarkdown.grammarkdownMod.InvalidAssertion
  
  type AssertionKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.AssertionTypes */ java.lang.String
  
  type CommentTrivia = /* import warning: importer.ImportType#apply Failed type conversion: grammarkdown.grammarkdown/dist/grammarkdown.CommentTriviaTypes[grammarkdown.grammarkdown/dist/grammarkdown.CommentTriviaKind] */ js.Any
  
  type Declaration = typingsSlinky.grammarkdown.grammarkdownMod.Parameter
  
  type DeclarationKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.DeclarationTypes */ java.lang.String
  
  type HtmlTrivia = /* import warning: importer.ImportType#apply Failed type conversion: grammarkdown.grammarkdown/dist/grammarkdown.HtmlTriviaTypes[grammarkdown.grammarkdown/dist/grammarkdown.HtmlTriviaKind] */ js.Any
  
  type KnownOptions = org.scalablytyped.runtime.StringDictionary[typingsSlinky.grammarkdown.anon.PartialKnownOption]
  
  type LegacyReadFileCallback = js.ThisFunction2[
    /* this */ scala.Nothing, 
    /* file */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typingsSlinky.prex.mod.CancellationToken], 
    js.Thenable[java.lang.String] | java.lang.String
  ]
  
  type LegacyReadFileSyncCallback = js.ThisFunction2[
    /* this */ scala.Nothing, 
    /* file */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typingsSlinky.prex.mod.CancellationToken], 
    java.lang.String
  ]
  
  type LegacyWriteFileCallback = js.ThisFunction3[
    /* this */ scala.Nothing, 
    /* file */ java.lang.String, 
    /* content */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typingsSlinky.prex.mod.CancellationToken], 
    js.Thenable[scala.Unit] | scala.Unit
  ]
  
  type LegacyWriteFileSyncCallback = js.ThisFunction3[
    /* this */ scala.Nothing, 
    /* file */ java.lang.String, 
    /* content */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typingsSlinky.prex.mod.CancellationToken], 
    scala.Unit
  ]
  
  type LexicalSymbol = typingsSlinky.grammarkdown.grammarkdownMod.InvalidSymbol
  
  type LexicalSymbolKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.LexicalSymbolTypes */ java.lang.String
  
  type MetaElement = typingsSlinky.grammarkdown.grammarkdownMod.Import
  
  type MetaElementKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.MetaElementTypes */ java.lang.String
  
  type OptionalSymbol = typingsSlinky.grammarkdown.grammarkdownMod.UnicodeCharacterLiteral
  
  type OptionalSymbolKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.OptionalSymbolTypes */ java.lang.String
  
  type PrimarySymbol = typingsSlinky.grammarkdown.grammarkdownMod.UnicodeCharacterLiteral
  
  type PrimarySymbolKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.PrimarySymbolTypes */ java.lang.String
  
  type PrimarySymbolTypes = typingsSlinky.grammarkdown.grammarkdownMod.OptionalSymbolTypes
  
  type ProductionBody = typingsSlinky.grammarkdown.grammarkdownMod.RightHandSide
  
  type ProductionBodyKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.ProductionBodyTypes */ java.lang.String
  
  type ProseFragment = typingsSlinky.grammarkdown.grammarkdownMod.ProseFragmentLiteral[
    typingsSlinky.grammarkdown.grammarkdownNumbers.`52` | typingsSlinky.grammarkdown.grammarkdownNumbers.`49` | typingsSlinky.grammarkdown.grammarkdownNumbers.`50` | typingsSlinky.grammarkdown.grammarkdownNumbers.`51`
  ]
  
  type ReadFileCallback = js.ThisFunction2[
    /* this */ scala.Nothing, 
    /* file */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typingsSlinky.esfxAsyncCanceltoken.mod.CancelToken], 
    js.Thenable[java.lang.String] | java.lang.String
  ]
  
  type ReadFileSyncCallback = js.ThisFunction2[
    /* this */ scala.Nothing, 
    /* file */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typingsSlinky.esfxAsyncCanceltoken.mod.CancelToken], 
    java.lang.String
  ]
  
  type SourceElement = typingsSlinky.grammarkdown.grammarkdownMod.Production
  
  type SourceElementKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.SourceElementTypes */ java.lang.String
  
  type Trivia = /* import warning: importer.ImportType#apply Failed type conversion: grammarkdown.grammarkdown/dist/grammarkdown.TriviaTypes[grammarkdown.grammarkdown/dist/grammarkdown.TriviaKind] */ js.Any
  
  type WriteFileCallback = js.ThisFunction3[
    /* this */ scala.Nothing, 
    /* file */ java.lang.String, 
    /* content */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typingsSlinky.esfxAsyncCanceltoken.mod.CancelToken], 
    js.Thenable[scala.Unit] | scala.Unit
  ]
  
  type WriteFileSyncCallback = js.ThisFunction3[
    /* this */ scala.Nothing, 
    /* file */ java.lang.String, 
    /* content */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typingsSlinky.esfxAsyncCanceltoken.mod.CancelToken], 
    scala.Unit
  ]
  
  @scala.inline
  def forEachChild[T](
    node: js.UndefOr[scala.Nothing],
    cbNode: js.Function1[
      /* node */ typingsSlinky.grammarkdown.grammarkdownMod.Node2[typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[T] = (typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachChild")(node.asInstanceOf[js.Any], cbNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  @scala.inline
  def forEachChild[T](
    node: typingsSlinky.grammarkdown.grammarkdownMod.Node2[typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind],
    cbNode: js.Function1[
      /* node */ typingsSlinky.grammarkdown.grammarkdownMod.Node2[typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[T] = (typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachChild")(node.asInstanceOf[js.Any], cbNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  @scala.inline
  def formatList(tokens: js.Array[typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind | java.lang.String]): java.lang.String = typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("formatList")(tokens.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def formatString(format: java.lang.String): java.lang.String = typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("formatString")(format.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def formatString(format: java.lang.String, args: js.Any*): java.lang.String = (typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("formatString")(format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatString(format: java.lang.String, args: js.Array[_]): java.lang.String = (typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("formatString")(format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getDefaultOptions(): typingsSlinky.grammarkdown.grammarkdownMod.CompilerOptions = typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[typingsSlinky.grammarkdown.grammarkdownMod.CompilerOptions]
  
  @scala.inline
  def isCommentTriviaKind(kind: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/grammarkdown.CommentTriviaKind */ scala.Boolean = typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("isCommentTriviaKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/grammarkdown.CommentTriviaKind */ scala.Boolean]
  
  @scala.inline
  def isHtmlTriviaKind(kind: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/grammarkdown.HtmlTriviaKind */ scala.Boolean = typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("isHtmlTriviaKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/grammarkdown.HtmlTriviaKind */ scala.Boolean]
  
  @scala.inline
  def isKeywordKind(kind: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/grammarkdown.KeywordKind */ scala.Boolean = typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("isKeywordKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/grammarkdown.KeywordKind */ scala.Boolean]
  
  @scala.inline
  def isProseFragmentLiteralKind(kind: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/grammarkdown.ProseFragmentLiteralKind */ scala.Boolean = typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("isProseFragmentLiteralKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/grammarkdown.ProseFragmentLiteralKind */ scala.Boolean]
  
  @scala.inline
  def isPunctuationKind(kind: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/grammarkdown.PunctuationKind */ scala.Boolean = typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPunctuationKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/grammarkdown.PunctuationKind */ scala.Boolean]
  
  @scala.inline
  def isTextContentKind(kind: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/grammarkdown.TextContentKind */ scala.Boolean = typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTextContentKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/grammarkdown.TextContentKind */ scala.Boolean]
  
  @scala.inline
  def isTokenKind(kind: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/grammarkdown.TokenKind */ scala.Boolean = typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTokenKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/grammarkdown.TokenKind */ scala.Boolean]
  
  @scala.inline
  def isTriviaKind(kind: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/grammarkdown.TriviaKind */ scala.Boolean = typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTriviaKind")(kind.asInstanceOf[js.Any]).asInstanceOf[/* is grammarkdown.grammarkdown/dist/grammarkdown.TriviaKind */ scala.Boolean]
  
  @scala.inline
  def parse[T /* <: typingsSlinky.grammarkdown.grammarkdownMod.ParsedArguments */](options: typingsSlinky.grammarkdown.grammarkdownMod.KnownOptions): js.UndefOr[T] = typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  @scala.inline
  def parse[T /* <: typingsSlinky.grammarkdown.grammarkdownMod.ParsedArguments */](options: typingsSlinky.grammarkdown.grammarkdownMod.KnownOptions, args: js.Array[java.lang.String]): js.UndefOr[T] = (typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  @scala.inline
  def scanHtmlTrivia(text: java.lang.String, pos: scala.Double, end: scala.Double): js.UndefOr[js.Array[typingsSlinky.grammarkdown.grammarkdownMod.HtmlTrivia]] = (typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("scanHtmlTrivia")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[typingsSlinky.grammarkdown.grammarkdownMod.HtmlTrivia]]]
  
  @scala.inline
  def skipTrivia(text: java.lang.String, pos: scala.Double, end: scala.Double): scala.Double = (typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("skipTrivia")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def skipTrivia(
    text: java.lang.String,
    pos: scala.Double,
    end: scala.Double,
    htmlTrivia: js.UndefOr[scala.Nothing],
    commentTrivia: js.Array[typingsSlinky.grammarkdown.grammarkdownMod.CommentTrivia]
  ): scala.Double = (typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("skipTrivia")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any], htmlTrivia.asInstanceOf[js.Any], commentTrivia.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def skipTrivia(
    text: java.lang.String,
    pos: scala.Double,
    end: scala.Double,
    htmlTrivia: js.Array[typingsSlinky.grammarkdown.grammarkdownMod.HtmlTrivia]
  ): scala.Double = (typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("skipTrivia")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any], htmlTrivia.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def skipTrivia(
    text: java.lang.String,
    pos: scala.Double,
    end: scala.Double,
    htmlTrivia: js.Array[typingsSlinky.grammarkdown.grammarkdownMod.HtmlTrivia],
    commentTrivia: js.Array[typingsSlinky.grammarkdown.grammarkdownMod.CommentTrivia]
  ): scala.Double = (typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("skipTrivia")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any], htmlTrivia.asInstanceOf[js.Any], commentTrivia.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def stringToToken(text: java.lang.String): js.UndefOr[typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind] = typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("stringToToken")(text.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind]]
  
  @scala.inline
  def tokenToString(kind: java.lang.String): java.lang.String = typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenToString")(kind.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def tokenToString(kind: java.lang.String, quoted: scala.Boolean): java.lang.String = (typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenToString")(kind.asInstanceOf[js.Any], quoted.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def tokenToString(kind: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind): java.lang.String = typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenToString")(kind.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def tokenToString(kind: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind, quoted: scala.Boolean): java.lang.String = (typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenToString")(kind.asInstanceOf[js.Any], quoted.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def usage(options: typingsSlinky.grammarkdown.grammarkdownMod.KnownOptions): scala.Unit = typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("usage")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def usage(
    options: typingsSlinky.grammarkdown.grammarkdownMod.KnownOptions,
    margin: js.UndefOr[scala.Nothing],
    printHeader: js.Function1[/* writer */ typingsSlinky.grammarkdown.grammarkdownMod.UsageWriter, scala.Unit]
  ): scala.Unit = (typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("usage")(options.asInstanceOf[js.Any], margin.asInstanceOf[js.Any], printHeader.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def usage(options: typingsSlinky.grammarkdown.grammarkdownMod.KnownOptions, margin: scala.Double): scala.Unit = (typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("usage")(options.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def usage(
    options: typingsSlinky.grammarkdown.grammarkdownMod.KnownOptions,
    margin: scala.Double,
    printHeader: js.Function1[/* writer */ typingsSlinky.grammarkdown.grammarkdownMod.UsageWriter, scala.Unit]
  ): scala.Unit = (typingsSlinky.grammarkdown.grammarkdownMod.^.asInstanceOf[js.Dynamic].applyDynamic("usage")(options.asInstanceOf[js.Any], margin.asInstanceOf[js.Any], printHeader.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}
