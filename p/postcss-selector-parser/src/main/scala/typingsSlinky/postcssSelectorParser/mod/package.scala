package typingsSlinky.postcssSelectorParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncProcessor[Transform] = typingsSlinky.postcssSelectorParser.mod.ProcessorFn[js.Thenable[Transform]]
  type ProcessorFn[ReturnType] = js.Function1[/* root */ typingsSlinky.postcssSelectorParser.mod.Root_, ReturnType]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.Quotationmark
    - typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.Apostrophe
    - scala.Null
  */
  type QuoteMark = typingsSlinky.postcssSelectorParser.mod._QuoteMark | scala.Null
  /** Accepts a string  */
  type Selectors = java.lang.String | typingsSlinky.postcssSelectorParser.mod.PostCSSRuleNode
  type SyncProcessor[Transform] = typingsSlinky.postcssSelectorParser.mod.ProcessorFn[Transform]
}
