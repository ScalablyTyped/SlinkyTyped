package typingsSlinky.postcssSelectorParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AsyncProcessor[Transform] = typingsSlinky.postcssSelectorParser.mod.ProcessorFn[js.Thenable[Transform]]
  
  // A type that's T but not U.
  type Diff[T, U] = T
  
  type ProcessorFn[ReturnType] = js.Function1[/* root */ typingsSlinky.postcssSelectorParser.mod.Root_, ReturnType]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.Quotationmark
    - typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.Apostrophe
    - scala.Null
  */
  type QuoteMark = typingsSlinky.postcssSelectorParser.mod._QuoteMark | scala.Null
  
  type Selector_ = typingsSlinky.postcssSelectorParser.mod._Selector[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias postcss-selector-parser.postcss-selector-parser.Selector */ js.Object
  ]
  
  /** Accepts a string  */
  type Selectors = java.lang.String | typingsSlinky.postcssSelectorParser.mod.PostCSSRuleNode
  
  type SyncProcessor[Transform] = typingsSlinky.postcssSelectorParser.mod.ProcessorFn[Transform]
}
