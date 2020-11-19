package typingsSlinky.eslint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object SourceCode {
  
  type CursorWithCountOptions = scala.Double | typingsSlinky.eslint.mod.SourceCode.FilterPredicate | typingsSlinky.eslint.anon.Count
  
  type CursorWithSkipOptions = scala.Double | typingsSlinky.eslint.mod.SourceCode.FilterPredicate | typingsSlinky.eslint.anon.Filter
  
  type FilterPredicate = js.Function1[
    /* tokenOrComment */ typingsSlinky.eslint.mod.AST.Token | typingsSlinky.estree.mod.Comment, 
    scala.Boolean
  ]
  
  type ParserServices = js.Any
  
  type VisitorKeys = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
}
