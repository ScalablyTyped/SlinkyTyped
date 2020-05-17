package typingsSlinky.eslint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SourceCode {
  type FilterPredicate = js.Function1[
    /* tokenOrComment */ typingsSlinky.eslint.mod.AST.Token | typingsSlinky.estree.mod.Comment, 
    scala.Boolean
  ]
  type ParserServices = js.Any
  type VisitorKeys = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
}
