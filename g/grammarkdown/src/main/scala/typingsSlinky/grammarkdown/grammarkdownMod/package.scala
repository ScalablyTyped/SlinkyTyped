package typingsSlinky.grammarkdown

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
}
