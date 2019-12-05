package typingsSlinky.eslint.eslintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SourceCode {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.eslint.Anon_Count
  import typingsSlinky.eslint.Anon_Filter
  import typingsSlinky.eslint.eslintMod.AST.Token
  import typingsSlinky.estree.estreeMod.Comment

  type CursorWithCountOptions = Double | FilterPredicate | Anon_Count
  type CursorWithSkipOptions = Double | FilterPredicate | Anon_Filter
  type FilterPredicate = js.Function1[/* tokenOrComment */ Token | Comment, Boolean]
  type ParserServices = js.Any
  type VisitorKeys = StringDictionary[js.Array[String]]
}
